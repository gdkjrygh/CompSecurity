// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.e.n;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.a.z;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.e.d;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.util:
//            DeviceUtils, q, e, bf

public final class p
{
    public static final class a extends bf
    {

        d a;
        String b;
        boolean c;
        final k d;
        final n e;
        final w f;
        final v g;

        private transient Integer a(d ad[])
        {
            p.a(p.a());
            int l;
            try
            {
                if (ad.length > 0)
                {
                    a = ad[0];
                }
                if (b != null)
                {
                    return Integer.valueOf(kik.android.p.a(kik.android.util.p.j(), b, d, c, g).a);
                }
                l = kik.android.p.a(kik.android.util.p.j(), d, g).a;
            }
            // Misplaced declaration of an exception variable
            catch (d ad[])
            {
                return Integer.valueOf(-2);
            }
            // Misplaced declaration of an exception variable
            catch (d ad[])
            {
                return Integer.valueOf(-1);
            }
            return Integer.valueOf(l);
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a((d[])aobj);
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (Integer)obj;
            if (((Integer) (obj)).intValue() == 200)
            {
                obj = kik.android.util.e.a(kik.android.util.p.j());
                a.a(((Bitmap) (obj)));
                Object obj1 = new ByteArrayOutputStream();
                ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (obj1)));
                if (b != null)
                {
                    e.a(b, ((ByteArrayOutputStream) (obj1)).toByteArray(), "0");
                } else
                {
                    e.a(z.b(g).a().a(), ((ByteArrayOutputStream) (obj1)).toByteArray(), "0");
                }
                try
                {
                    ((ByteArrayOutputStream) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                f.f();
                kik.android.util.p.j().delete();
                return;
            } else
            {
                obj1 = a;
                ((Integer) (obj)).intValue();
                ((d) (obj1)).k_();
                return;
            }
        }

        public a(String s, k k1, n n1, w w1, v v)
        {
            b = null;
            c = false;
            b = s;
            d = k1;
            e = n1;
            f = w1;
            g = v;
        }

        public a(String s, k k1, n n1, w w1, v v, byte byte0)
        {
            b = null;
            c = false;
            b = s;
            c = true;
            d = k1;
            e = n1;
            f = w1;
            g = v;
        }

        public a(k k1, n n1, w w1, v v)
        {
            b = null;
            c = false;
            b = null;
            d = k1;
            e = n1;
            f = w1;
            g = v;
        }
    }


    private static File a;
    private static File b;
    private static File c;
    private static final b d = org.c.c.a("AndroidProfPicHelper");
    private static p f;
    private w e;

    private p()
    {
    }

    public static p a()
    {
        if (f == null)
        {
            f = new p();
        }
        return f;
    }

    static void a(p p1)
    {
        p1.k();
    }

    public static void b()
    {
        if (b.exists())
        {
            b.delete();
        }
        if (c.exists())
        {
            c.delete();
        }
    }

    static File i()
    {
        return b;
    }

    static File j()
    {
        return c;
    }

    private void k()
    {
        Object obj;
        aa aa1;
        if (a == null || !a.exists())
        {
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                a = new File(Environment.getExternalStorageDirectory(), "temp");
            } else
            {
                a = new File(Environment.getDownloadCacheDirectory(), "temp");
            }
        }
        if (!a.exists())
        {
            a.mkdirs();
        }
        obj = new File(a, ".noMedia");
        try
        {
            ((File) (obj)).createNewFile();
        }
        catch (IOException ioexception) { }
        obj = "";
        aa1 = e.d();
        if (aa1.c != null)
        {
            obj = aa1.c;
        }
        b = new File(a, "kiktmp");
        obj = new File(a, (new StringBuilder("kikCache")).append(((String) (obj))).toString());
        c = ((File) (obj));
        if (!((File) (obj)).exists())
        {
            c = new File(a, "kikCache");
        }
    }

    public final void a(w w1)
    {
        e = w1;
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment, Context context)
    {
        k();
        if (b.exists())
        {
            b.delete();
        }
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(context.getResources());
        a1.a(0x7f0902f3);
        if (DeviceUtils.e(context))
        {
            CharSequence acharsequence[] = new CharSequence[2];
            acharsequence[0] = context.getString(0x7f09030f);
            acharsequence[1] = context.getString(0x7f09029e);
            context = acharsequence;
        } else
        {
            CharSequence acharsequence1[] = new CharSequence[1];
            acharsequence1[0] = context.getString(0x7f09029e);
            context = acharsequence1;
        }
        a1.a(context, new q(this, context, kikscopeddialogfragment));
        kikscopeddialogfragment.a(a1.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "tag");
    }

    public final boolean a(Activity activity, byte abyte0[])
    {
        k();
        FileOutputStream fileoutputstream = new FileOutputStream(b);
        Object obj = fileoutputstream;
        fileoutputstream.write(abyte0);
        IOException ioexception;
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
        }
        abyte0 = kik.android.util.e.a(activity, Uri.fromFile(b), Uri.fromFile(c));
        try
        {
            activity.startActivityForResult(abyte0, 10336);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            g();
            return false;
        }
        return true;
        ioexception;
        abyte0 = null;
_L4:
        obj = abyte0;
        (new StringBuilder("could not write image: ")).append(ioexception.getMessage());
        obj = abyte0;
        Toast.makeText(activity, 0x7f0902bb, 1).show();
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                activity.printStackTrace();
            }
        }
        return false;
        activity;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
            }
        }
        throw activity;
        activity;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        abyte0 = fileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(Fragment fragment, Context context, int l, Intent intent, n n1)
    {
        String s1 = null;
        k();
        if (l == 10334)
        {
            String s;
            Uri uri;
            if (intent == null || intent.getData() == null)
            {
                uri = Uri.fromFile(b);
            } else
            {
                uri = intent.getData();
            }
            s = s1;
            if ("content".equals(uri.getScheme()))
            {
                Cursor cursor = context.getContentResolver().query(intent.getData(), new String[] {
                    "_data"
                }, null, null, null);
                s = s1;
                if (cursor.moveToFirst())
                {
                    s = cursor.getString(0);
                    cursor.close();
                }
            }
            s1 = s;
            if (s == null)
            {
                s1 = uri.getPath();
            }
            n1.a(new File(s1));
        }
        kik.android.chat.fragment.KikPreferenceLaunchpad.b.a();
        if (intent == null || intent.getData() == null)
        {
            intent = Uri.fromFile(b);
        } else
        {
            intent = intent.getData();
        }
        context = kik.android.util.e.a(context, intent, Uri.fromFile(c));
        try
        {
            fragment.startActivityForResult(context, 10336);
        }
        // Misplaced declaration of an exception variable
        catch (Fragment fragment)
        {
            g();
            return false;
        }
        return true;
    }

    public final boolean c()
    {
        k();
        return c.exists();
    }

    public final Drawable d()
    {
        k();
        return new BitmapDrawable(kik.android.util.e.a(c));
    }

    public final Bitmap e()
    {
        k();
        return kik.android.util.e.a(c);
    }

    public final boolean f()
    {
        k();
        return kik.android.util.e.a(c) != null;
    }

    public final void g()
    {
        k();
        if (b.exists())
        {
            b.delete();
        }
    }

    public final void h()
    {
        k();
        if (c.exists())
        {
            c.delete();
        }
    }

}
