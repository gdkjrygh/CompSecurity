// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fy;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.home.ui.g;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.s;
import com.fitbit.util.ProgressDialogFragment;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.UpdateProfilePhotoDialogFragment;
import java.io.File;
import java.util.UUID;

public class ProfilePhotoUploader
{
    public static class NotCancellableProgressDialogFragment extends ProgressDialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = super.onCreateDialog(bundle);
            bundle.setCancelable(false);
            bundle.setOnKeyListener(new android.content.DialogInterface.OnKeyListener(this) {

                final NotCancellableProgressDialogFragment a;

                public boolean onKey(DialogInterface dialoginterface, int i1, KeyEvent keyevent)
                {
                    while (i1 == 84 || i1 == 4) 
                    {
                        return true;
                    }
                    return false;
                }

            
            {
                a = notcancellableprogressdialogfragment;
                super();
            }
            });
            return bundle;
        }

        public NotCancellableProgressDialogFragment()
        {
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    private class b extends g
    {

        final ProfilePhotoUploader a;

        public void a()
        {
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
            super.a();
            if (LoadSavedState.b(com.fitbit.savedstate.LoadSavedState.DataType.e))
            {
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a).a();
                return;
            } else
            {
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a).c();
                return;
            }
        }

        public void a(Exception exception)
        {
            if (ProfilePhotoUploader.b(a))
            {
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
                super.a(exception);
            }
        }

        public b(FragmentActivity fragmentactivity)
        {
            a = ProfilePhotoUploader.this;
            super(fragmentactivity, 85);
        }
    }

    private class c extends com.fitbit.home.ui.b
    {

        final ProfilePhotoUploader a;

        protected String a()
        {
            return com.fitbit.ui.dialogs.a.b(ProfilePhotoUploader.c(a));
        }

        public void a(Exception exception)
        {
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, true);
            if ((exception instanceof ServerCommunicationException) && ((ServerCommunicationException)exception).e() == 413)
            {
                g();
                s.a(ProfilePhotoUploader.c(a), 0x7f080387, 0).i();
                com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
                return;
            } else
            {
                super.a(exception);
                return;
            }
        }

        public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
        {
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
            super.b(simpleconfirmdialogfragment);
        }

        public c(FragmentActivity fragmentactivity)
        {
            a = ProfilePhotoUploader.this;
            super(fragmentactivity, new _cls1(), new _cls2());
        }
    }


    public static final int a = 4906;
    public static final int b = 4907;
    public static final int c = 4908;
    private static final String e = "ProfilePhotoUploader";
    private static final String f = f();
    private static final String g = "profile_picture";
    private static final String h = "profile_cropped_picture";
    private static Uri i;
    private static Uri j;
    private static final String k = (new StringBuilder()).append(com/fitbit/friends/ui/ProfilePhotoUploader.getName()).append(".FRAGMENT_PHOTO_UPDATER").toString();
    android.content.DialogInterface.OnClickListener d;
    private g l;
    private volatile boolean m;
    private FragmentActivity n;
    private Fragment o;
    private a p;

    public ProfilePhotoUploader(Fragment fragment, a a1)
    {
        m = false;
        p = null;
        d = new android.content.DialogInterface.OnClickListener() {

            final ProfilePhotoUploader a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                i1;
                JVM INSTR tableswitch 0 1: default 24
            //                           0 32
            //                           1 63;
                   goto _L1 _L2 _L3
_L1:
                throw new IllegalArgumentException();
_L2:
                dialoginterface = ProfilePhotoUploader.c();
                i1 = 4906;
_L5:
                try
                {
                    if (ProfilePhotoUploader.d(a) != null)
                    {
                        ProfilePhotoUploader.d(a).startActivityForResult(dialoginterface, i1);
                        return;
                    }
                    break; /* Loop/switch isn't completed */
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    com.fitbit.e.a.a("ProfilePhotoUploader", "Your device doesn't support the pick action", new Object[0]);
                }
                break MISSING_BLOCK_LABEL_115;
_L3:
                dialoginterface = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                dialoginterface.setType("image/*");
                i1 = 4907;
                if (true) goto _L5; else goto _L4
_L4:
                ProfilePhotoUploader.c(a).startActivityForResult(dialoginterface, i1);
                return;
            }

            
            {
                a = ProfilePhotoUploader.this;
                super();
            }
        };
        o = fragment;
        n = fragment.getActivity();
        p = a1;
        e();
        d();
    }

    public static Uri a(int i1, Intent intent)
    {
label0:
        {
            Uri uri = null;
            if (i1 != 0)
            {
                if (intent != null && intent.getData() != null)
                {
                    break label0;
                }
                uri = i;
            }
            return uri;
        }
        return intent.getData();
    }

    static a a(ProfilePhotoUploader profilephotouploader)
    {
        return profilephotouploader.p;
    }

    private void a(Uri uri)
    {
        if (uri != null)
        {
            m = true;
            com.fitbit.e.a.a("ProfilePhotoUploader", "Starting UpdateProfilePhotoTask", new Object[0]);
            uri = fy.a(n, uri);
            l.a(uri);
        }
    }

    static void a(ProfilePhotoUploader profilephotouploader, Uri uri)
    {
        profilephotouploader.a(uri);
    }

    private void a(Object obj, Uri uri, boolean flag)
    {
        Intent intent;
        com.fitbit.e.a.a("ProfilePhotoUploader", "performCrop with uri: %s", new Object[] {
            uri
        });
        if (uri == null)
        {
            s.a(n, 0x7f080568, 0).i();
            return;
        }
        intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 512);
        intent.putExtra("outputY", 512);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("return-data", false);
        uri = new File(f);
        uri.mkdirs();
        uri = new File(uri, "profile_cropped_picture");
        uri.delete();
        j = Uri.fromFile(uri);
        intent.putExtra("output", j);
        intent.putExtra("outputFormat", android.graphics.Bitmap.CompressFormat.JPEG.name());
        if (flag)
        {
            try
            {
                ((Fragment)obj).startActivityForResult(intent, 4908);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.fitbit.e.a.a("ProfilePhotoUploader", "Device doesn't support the crop action", new Object[0]);
            }
            return;
        }
        ((Activity)obj).startActivityForResult(intent, 4908);
        return;
    }

    static boolean a(ProfilePhotoUploader profilephotouploader, boolean flag)
    {
        profilephotouploader.m = flag;
        return flag;
    }

    static Uri b()
    {
        return j;
    }

    public static Uri b(int i1, Intent intent)
    {
        Object obj = null;
        Uri uri = obj;
        if (i1 != 0)
        {
            uri = obj;
            if (intent != null)
            {
                uri = intent.getData();
            }
        }
        return uri;
    }

    static boolean b(ProfilePhotoUploader profilephotouploader)
    {
        return profilephotouploader.m;
    }

    static Intent c()
    {
        return g();
    }

    public static Uri c(int i1, Intent intent)
    {
        Intent intent1 = null;
        if (i1 != 0)
        {
            if (intent == null || intent.getData() == null)
            {
                intent = j;
            } else
            {
                intent = intent.getData();
            }
            j = intent;
            intent1 = intent;
        }
        return intent1;
    }

    static FragmentActivity c(ProfilePhotoUploader profilephotouploader)
    {
        return profilephotouploader.n;
    }

    static Fragment d(ProfilePhotoUploader profilephotouploader)
    {
        return profilephotouploader.o;
    }

    private void d()
    {
        Object obj;
        if (o != null)
        {
            obj = o.getFragmentManager();
        } else
        {
            obj = n.getSupportFragmentManager();
        }
        if (obj != null)
        {
            obj = (UpdateProfilePhotoDialogFragment)((FragmentManager) (obj)).findFragmentByTag(k);
            if (obj != null)
            {
                ((UpdateProfilePhotoDialogFragment) (obj)).a(d);
            }
        }
    }

    private void e()
    {
        l = new b(n);
        c c1 = new c(n);
        c1.a(new com.fitbit.util.q.a() {

            final ProfilePhotoUploader a;

            public DialogFragment a()
            {
                return NotCancellableProgressDialogFragment.b(0, 0x7f08046a, null);
            }

            
            {
                a = ProfilePhotoUploader.this;
                super();
            }
        });
        l.a(c1);
    }

    private static String f()
    {
        File file = FitBitApplication.a().getExternalFilesDir(null);
        if (file != null)
        {
            return (new StringBuilder()).append(file.getAbsolutePath()).append("/ProfilePicture").toString();
        } else
        {
            return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/FitbitProfilePicture").toString();
        }
    }

    private static Intent g()
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(f);
        if (file.isDirectory() || file.mkdirs())
        {
            File afile[] = file.listFiles();
            int j1 = afile.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                File file1 = afile[i1];
                com.fitbit.e.a.a("ProfilePhotoUploader", file1.toString(), new Object[0]);
                file1.delete();
            }

        }
        file = new File(file, (new StringBuilder()).append("profile_picture_").append(UUID.randomUUID().toString()).append(".JPEG").toString());
        file.delete();
        i = Uri.fromFile(file);
        intent.putExtra("output", i);
        intent.putExtra("outputFormat", android.graphics.Bitmap.CompressFormat.JPEG.name());
        return intent;
    }

    public void a()
    {
        com.fitbit.e.a.a("ProfilePhotoUploader", "changeProfilePhoto", new Object[0]);
        if (!ServerGateway.a().d())
        {
            com.fitbit.e.a.a("ProfilePhotoUploader", "isOnlone == false", new Object[0]);
            s.a(n, 0x7f08048e, 0).i();
            return;
        }
        Profile profile = an.a().b();
        int i1;
        if (profile != null && profile.H())
        {
            i1 = 0x7f080171;
        } else
        {
            i1 = 0x7f080044;
        }
        UpdateProfilePhotoDialogFragment.a(i1, d).show(n.getSupportFragmentManager(), k);
    }

    public void a(int i1, Uri uri)
    {
        if (i1 != 0)
        {
            if (uri == null)
            {
                com.fitbit.e.a.a("ProfilePhotoUploader", "onProfilePictureCropResult uri == null, uploading not cropped picture", new Object[0]);
                s.a(n, 0x7f080568, 0).i();
            } else
            if (!m)
            {
                a(uri);
                return;
            }
        }
    }

    public void a(Activity activity, int i1, Uri uri)
    {
        if (i1 != 0)
        {
            a(activity, uri, false);
        }
    }

    public void a(Fragment fragment, int i1, Uri uri)
    {
        if (i1 != 0)
        {
            a(fragment, uri, true);
        }
    }


    // Unreferenced inner class com/fitbit/friends/ui/ProfilePhotoUploader$c$1

/* anonymous class */
    class c._cls1
        implements com.fitbit.home.ui.b.a
    {

        final ProfilePhotoUploader a;

        public void a(com.fitbit.home.ui.b b1)
        {
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, ProfilePhotoUploader.b());
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a).b();
        }

            
            {
                a = ProfilePhotoUploader.this;
                super();
            }
    }


    // Unreferenced inner class com/fitbit/friends/ui/ProfilePhotoUploader$c$2

/* anonymous class */
    class c._cls2
        implements android.content.DialogInterface.OnCancelListener
    {

        final ProfilePhotoUploader a;

        public void onCancel(DialogInterface dialoginterface)
        {
            com.fitbit.friends.ui.ProfilePhotoUploader.a(a, false);
        }

            
            {
                a = ProfilePhotoUploader.this;
                super();
            }
    }

}
