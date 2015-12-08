// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.crop.CropImageView;
import com.roidapp.imagelib.crop.ImageViewTouchBase;
import com.roidapp.imagelib.crop.a;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bn;
import com.roidapp.photogrid.common.bo;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, ai, ak, ih, 
//            ig, ImageSelector, PhotoGridActivity, rf, 
//            al, am, aj

public class BackgroundImageCrop extends ParentActivity
    implements android.view.View.OnClickListener
{

    Integer a[];
    private final int b = 0;
    private final int c = 1;
    private final int d = 2;
    private final int e = 3;
    private final int f = 5;
    private CropImageView g;
    private a h;
    private String i;
    private String j;
    private boolean k;
    private Bitmap l;
    private RelativeLayout m;
    private boolean n;
    private Context o;
    private Handler p;

    public BackgroundImageCrop()
    {
        n = false;
        p = new ai(this);
    }

    static Bitmap a(BackgroundImageCrop backgroundimagecrop, Bitmap bitmap)
    {
        backgroundimagecrop.l = bitmap;
        return bitmap;
    }

    private String a(Uri uri, String s, String as[])
    {
        uri = getContentResolver().query(uri, new String[] {
            "_data"
        }, s, as, null);
        if (uri == null) goto _L2; else goto _L1
_L1:
        uri.moveToFirst();
        s = uri.getString(uri.getColumnIndex("_data"));
_L5:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return s;
            }
        }
        return s;
        s;
        uri = null;
_L3:
        s.printStackTrace();
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static String a(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.i;
    }

    private void a()
    {
        m.setVisibility(0);
        n = true;
    }

    private void a(int i1)
    {
        Object obj = new android.app.AlertDialog.Builder(this);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f0702e7);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(i1);
        ((android.app.AlertDialog.Builder) (obj)).setCancelable(false);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(0x7f07032f, new ak(this));
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setCancelable(false);
        ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
        ((AlertDialog) (obj)).show();
    }

    private void a(boolean flag)
    {
        ImageLibrary.a().a("BackgroundImageCrop/doCrop");
        if (h.d == null)
        {
            if (az.q == 8)
            {
                h.a(true, 2.35F, false);
                h.b(l);
            } else
            {
                float f1 = ih.C().t();
                flag = ih.C().v();
                boolean flag1 = ih.C().r();
                h.a(flag, f1, flag1);
                h.b(l);
            }
        } else
        if (az.q == 8)
        {
            h.a(l);
            h.a(2.35F);
        } else
        {
            if (!flag)
            {
                h.a(l);
            }
            float f2 = ih.C().t();
            h.a(f2);
        }
        h.c = false;
    }

    static Bitmap b(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.l;
    }

    static CropImageView c(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.g;
    }

    static void d(BackgroundImageCrop backgroundimagecrop)
    {
        backgroundimagecrop.a(false);
    }

    static void e(BackgroundImageCrop backgroundimagecrop)
    {
        backgroundimagecrop.m.setVisibility(8);
        backgroundimagecrop.n = false;
    }

    static boolean f(BackgroundImageCrop backgroundimagecrop)
    {
        backgroundimagecrop.n = false;
        return false;
    }

    static Handler g(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.p;
    }

    static Context h(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.o;
    }

    static a i(BackgroundImageCrop backgroundimagecrop)
    {
        return backgroundimagecrop.h;
    }

    protected final void a(String s)
    {
        if (az.q != 8) goto _L2; else goto _L1
_L1:
        Intent intent;
        if (s == null)
        {
            s = ih.C().M();
            if (s != null && s.length > 0)
            {
                s[0].c = null;
            }
            startActivity(new Intent(this, com/roidapp/photogrid/release/ImageSelector));
            finish();
            return;
        }
        intent = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
        ig ig1 = new ig(i);
        ig1.c = s;
        ih.C().a(new ig[] {
            ig1
        });
_L4:
        startActivity(intent);
        finish();
        return;
_L2:
        ImageLibrary.a().a("BackgroundImageCrop/doBack");
        Intent intent1 = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
        intent = intent1;
        if (s != null)
        {
            az.C = true;
            ih.C().i(i);
            ih.C().h(s);
            intent = intent1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Throwable throwable, String s)
    {
        m.setVisibility(8);
        if (!java/lang/OutOfMemoryError.isInstance(throwable)) goto _L2; else goto _L1
_L1:
        an.c(new WeakReference(this), getString(0x7f07020f));
_L4:
        a(((String) (null)));
        return;
_L2:
        if (java/io/IOException.isInstance(throwable))
        {
            throwable = (new StringBuilder()).append(throwable.getMessage()).toString();
            if (throwable != null)
            {
                if (throwable.equals("702"))
                {
                    y.a(this);
                } else
                if (throwable.equals("700"))
                {
                    y.a(this, s);
                } else
                if (throwable.equals("701"))
                {
                    y.b(this, s);
                } else
                if (throwable.equals("703"))
                {
                    an.c(new WeakReference(this), getString(0x7f07028d));
                } else
                {
                    an.c(new WeakReference(this), throwable);
                }
            }
        } else
        if (throwable != null)
        {
            an.c(new WeakReference(this), (new StringBuilder()).append(throwable.getMessage()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 4097 4097: default 20
    //                   4097 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (intent == null || (intent = intent.getData()) == null) goto _L1; else goto _L3
_L3:
        if (intent.getAuthority() != null)
        {
            if ("com.google.android.apps.docs.storage".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
            if ("com.google.android.apps.docs.files".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
            if ("com.google.android.apps.photos.content".equals(intent.getAuthority()))
            {
                a(0x7f070181);
                return;
            }
        }
        if (!intent.toString().startsWith("file:///")) goto _L5; else goto _L4
_L4:
        intent = Uri.decode(intent.getEncodedPath());
_L7:
        if (intent == null)
        {
            a(0x7f070026);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            bo.a();
            if (bo.a(this, intent))
            {
                if ("com.android.providers.media.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    intent = bo.a(intent).split(":")[1];
                    intent = a(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[] {
                        intent
                    });
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.providers.downloads.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    intent = bo.a(intent);
                    intent = a(ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(intent).longValue()), null, null);
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.externalstorage.documents".equals(intent.getAuthority()))
                {
                    bo.a();
                    String s = bo.a(intent);
                    Log.e("PhotoGridActivity", (new StringBuilder("id:")).append(s).append("uri:").append(intent).toString());
                    String as[] = s.split(":");
                    intent = as[0];
                    as = as[1];
                    if ("primary".equalsIgnoreCase(intent))
                    {
                        intent = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(as).toString();
                        continue; /* Loop/switch isn't completed */
                    }
                    intent = (new File("/storage")).listFiles();
                    if (intent == null)
                    {
                        a(0x7f070026);
                        return;
                    }
                    i1 = 0;
                    do
                    {
                        if (i1 >= intent.length)
                        {
                            break;
                        }
                        if ((new File(intent[i1].getAbsolutePath(), as)).exists())
                        {
                            intent = (new StringBuilder()).append(intent[i1].getAbsolutePath()).append("/").append(as).toString();
                            continue; /* Loop/switch isn't completed */
                        }
                        i1++;
                    } while (true);
                    intent = null;
                } else
                {
                    try
                    {
                        bo.a();
                        intent = bo.a(intent);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        a(0x7f070181);
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        intent = a(intent, null, null);
        if (true) goto _L7; else goto _L6
_L6:
        String s1 = intent.toLowerCase(Locale.ENGLISH);
        if (s1.endsWith(".png") || s1.endsWith(".jpg") || s1.endsWith(".gif") || s1.endsWith(".bmp") || s1.endsWith(".jpeg") || s1.endsWith(".mpo") || bn.a(intent))
        {
            if (rf.b(intent))
            {
                if (l != null && !l.isRecycled())
                {
                    l.isRecycled();
                    l = null;
                }
                i = intent;
                a();
                a = com.roidapp.imagelib.b.d.b(i);
                (new Thread(new al(this, intent, 0))).start();
                return;
            } else
            {
                a(0x7f070026);
                return;
            }
        } else
        {
            a(0x7f07015d);
            return;
        }
    }

    public void onClick(View view)
    {
        if (!n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.getId();
        JVM INSTR lookupswitch 5: default 64
    //                   2131558440: 65
    //                   2131558458: 71
    //                   2131558462: 183
    //                   2131558464: 198
    //                   2131558465: 252;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        a(((String) (null)));
        return;
_L5:
        ((TextView)m.findViewById(0x7f0d01ac)).setText(0x7f07028a);
        m.setVisibility(0);
        if (h.d != null)
        {
            ImageLibrary.a().a("BackgroundImageCrop/saveBtn");
            if (g != null)
            {
                g.a(null);
            }
            n = true;
            if (k)
            {
                h.c();
                j.equalsIgnoreCase(i);
            }
            (new Thread(new am(this))).start();
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        ImageLibrary.a().a("BackgroundImageCrop/revert");
        a(true);
        return;
_L7:
        if (this == null || isFinishing()) goto _L10; else goto _L9
_L10:
        if (true) goto _L1; else goto _L11
_L9:
        ImageLibrary.a().a("BackgroundImageCrop/chooseAnotherPic");
        view = new Intent("android.intent.action.GET_CONTENT");
        view.setType("image/*");
        try
        {
            startActivityForResult(view, 4097);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
        return;
_L11:
        a();
        if (h != null)
        {
            h.c = true;
        }
        (new Thread(new aj(this))).start();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ImageLibrary.a().a("BackgroundImageCrop/onCreate");
        setContentView(0x7f030004);
_L2:
        if (!v)
        {
            i = getIntent().getStringExtra("background_image_path");
            j = new String(i);
            k = getIntent().getBooleanExtra("hasbackground", false);
            if (i != null)
            {
                break; /* Loop/switch isn't completed */
            }
            a(((String) (null)));
        }
        return;
        bundle;
        try
        {
            System.gc();
            System.gc();
            bundle.printStackTrace();
            setContentView(0x7f030004);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (true) goto _L2; else goto _L1
_L1:
        o = this;
        g = (CropImageView)findViewById(0x7f0d003b);
        h = new a(this, g);
        h.c = true;
        a = com.roidapp.imagelib.b.d.b(i);
        m = (RelativeLayout)findViewById(0x7f0d040d);
        m.setVisibility(0);
        n = true;
        bundle = (TextView)findViewById(0x7f0d0028);
        bundle.setOnClickListener(this);
        ((TextView)findViewById(0x7f0d003a)).setOnClickListener(this);
        ((TextView)findViewById(0x7f0d003e)).setOnClickListener(this);
        ((TextView)findViewById(0x7f0d0040)).setOnClickListener(this);
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f0d0041);
        relativelayout.setOnClickListener(this);
        if (az.q == 8)
        {
            bundle.setText(0x7f07026f);
            relativelayout.setVisibility(0);
        } else
        {
            relativelayout.setVisibility(8);
        }
        (new Thread(new al(this, i, 0))).start();
        return;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            a(((String) (null)));
        }
        return super.onKeyDown(i1, keyevent);
    }

    public final void x()
    {
    }
}
