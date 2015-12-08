// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.kik.cache.ad;
import com.kik.cache.av;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.g.p;
import com.kik.m.e;
import com.kik.m.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kik.a.d.a.a;
import kik.a.d.d;
import kik.a.d.o;
import kik.a.h.f;
import kik.android.util.DeviceUtils;
import kik.android.util.bf;
import kik.android.util.bx;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.f.a:
//            af

public final class ae
{
    public static final class a extends Exception
    {

        private int a;

        public final String a(Context context)
        {
            String s = context.getString(0x7f0900ae);
            switch (a)
            {
            default:
                return s;

            case 1: // '\001'
                return context.getString(0x7f090134);
            }
        }

        public a(int i)
        {
            a = i;
        }
    }

    static final class b extends bf
    {

        private Activity a;
        private p b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private String t;
        private String u;
        private HashMap v;
        private boolean w;
        private String x;
        private kik.a.d.a.a y;
        private ad z;

        private o a(String s1, String s2, String s3)
        {
            return a(s1, s2, s3, true, false);
        }

        private o a(String s1, String s2, String s3, boolean flag, boolean flag1)
        {
            Object obj;
            int i1;
            obj = null;
            if (flag1)
            {
                i1 = 40960;
            } else
            {
                i1 = 20480;
            }
            if (s1 == null) goto _L2; else goto _L1
_L1:
            s1 = kik.a.h.f.a(s1);
            s2 = obj;
            if (s1 == null) goto _L4; else goto _L3
_L3:
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                try
                {
                    s1 = com.kik.m.e.a(s1);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    (new StringBuilder("Could not retrieve preview: ")).append(s1.getMessage());
                    s1 = null;
                }
            }
            s2 = s1;
            if (s1 != null)
            {
                s2 = s1;
                if (s1.length > i1)
                {
                    if (flag)
                    {
                        s2 = com.kik.m.k.a(kik.android.f.a.ae.a(s1));
                    } else
                    {
                        s2 = null;
                    }
                }
            }
            if (s2 == null) goto _L6; else goto _L5
_L5:
            s2 = new o(s2);
_L4:
            return s2;
_L6:
            a(((Throwable) (new a(3))));
            return null;
_L2:
            if (s2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            s1 = new File(s2);
            s2 = obj;
            if (s1.exists())
            {
                s2 = obj;
                if (s1.isFile())
                {
                    s2 = obj;
                    if (s1.length() > 0L)
                    {
                        if (s1.length() > (long)i1)
                        {
                            if (flag)
                            {
                                s1 = com.kik.m.k.a(s1.getAbsolutePath(), android.graphics.Bitmap.CompressFormat.JPEG);
                            } else
                            {
                                s1 = null;
                            }
                        } else
                        {
                            try
                            {
                                s1 = org.a.a.a.a.a(s1);
                            }
                            // Misplaced declaration of an exception variable
                            catch (String s1)
                            {
                                (new StringBuilder("Could not retrieve preview: ")).append(s1.getMessage());
                                s1 = null;
                            }
                        }
                        s2 = obj;
                        if (s1 != null)
                        {
                            s2 = s1;
                            if (flag)
                            {
                                s2 = com.kik.m.k.a(s1);
                            }
                            return new o(s2);
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L7
_L7:
            s2 = obj;
            if (s3 != null)
            {
                s2 = com.kik.m.k.b(s3);
                s1 = s2;
                if (s2 != null)
                {
                    s1 = s2;
                    if (s2.length > i1)
                    {
                        if (flag)
                        {
                            s1 = kik.android.f.a.ae.a(s2);
                        } else
                        {
                            s1 = null;
                        }
                    }
                }
                if (s1 != null)
                {
                    s2 = s1;
                    if (flag)
                    {
                        s2 = com.kik.m.k.a(s1);
                    }
                    return new o(s2);
                } else
                {
                    a(((Throwable) (new a(1))));
                    return null;
                }
            }
            if (true) goto _L4; else goto _L8
_L8:
        }

        private void a(Throwable throwable)
        {
            b.a(throwable);
        }

        static void a(b b1, kik.a.d.a.a a1)
        {
            b1.b(a1);
        }

        private transient Void b()
        {
            if (y == null) goto _L2; else goto _L1
_L1:
            if (i == null && g == null) goto _L4; else goto _L3
_L3:
            Object obj = a(g, null, i);
            if (obj == null) goto _L6; else goto _L5
_L5:
            y.a("preview", ((o) (obj)));
_L4:
            if (j == null) goto _L8; else goto _L7
_L7:
            if (j.length() >= 27306) goto _L10; else goto _L9
_L9:
            byte abyte0[];
            try
            {
                abyte0 = com.kik.m.e.a(kik.a.h.f.a(j));
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                ioexception = null;
            }
            if (abyte0 == null) goto _L12; else goto _L11
_L11:
            y.a("icon", new d(abyte0));
_L10:
            c(y);
_L2:
            if (c == null)
            {
                a(new a(2));
                return null;
            }
            break; /* Loop/switch isn't completed */
_L6:
            a(new a(3));
            return null;
_L12:
            a(new a(7));
            return null;
_L8:
            if (k != null)
            {
                ioexception = a(null, null, k);
                if (ioexception != null)
                {
                    y.a("icon", new d(kik.a.h.e.a().a(ioexception)));
                } else
                {
                    a(new a(7));
                    return null;
                }
            }
            if (true) goto _L10; else goto _L13
_L13:
            kik.a.d.a.a a1;
            if (i == null && g == null && e == null && f == null && o == null && m == null)
            {
                a(new a(6));
                return null;
            }
            if (e == null && f != null)
            {
                a(new a(5));
                return null;
            }
            a1 = new kik.a.d.a.a("com.kik.cards");
            a1.a("app-name", c);
            a1.a("attribution", p);
            a1.a("preview", a(g, h, i));
            a1.a("png-preview", a(m, n, o, false, true));
            a1.a("card-icon", k);
            if (d != null)
            {
                a1.b(d, "cards");
            }
            a1.b(x, null);
            a1.b("http://cdn.kik.com/cards/unsupported.html", null);
            java.util.Map.Entry entry;
            for (ioexception = v.entrySet().iterator(); ioexception.hasNext(); a1.c((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)ioexception.next();
            }

            if (l != null)
            {
                a1.a("layout", l);
            }
            if (kik.a.d.a.a.b.b.equals(l) && a1.a("preview") == null && a1.a("png-preview") == null)
            {
                a(new a(4));
                return null;
            }
            if (kik.a.d.a.a.b.e.a().equals(l))
            {
                if (a1.a("preview") == null && !kik.a.f.e.a.b(a1.h()))
                {
                    a(new a(4));
                    return null;
                }
                if (q == null)
                {
                    a(new a(2));
                    return null;
                }
                a1.a(q, null, "video", null, null);
                a1.a(q, null, "image", null, null);
            }
            a1.k(t);
            a1.j(r);
            a1.i(u);
            a1.l(s);
            if (e != null)
            {
                a1.a("title", e);
            }
            if (f != null)
            {
                a1.a("text", f);
            }
            a1.a("allow-forward", String.valueOf(w));
            a1.a("fallbackUrl", x);
            if (k != null)
            {
                kik.android.util.e.a(z, av.a(k, 0, 0), false).a(new af(this, a1));
                return null;
            }
            if (j == null || j.length() >= 27306) goto _L15; else goto _L14
_L14:
            ioexception = kik.a.h.f.a(j);
            if (ioexception == null) goto _L17; else goto _L16
_L16:
            ioexception = com.kik.m.e.a(ioexception);
_L19:
            if (ioexception != null)
            {
                a1.a("icon", new d(ioexception));
            }
_L15:
            if (a1.a("icon") == null)
            {
                b(a1);
            }
            c(a1);
            return null;
            ioexception;
            if (DeviceUtils.c())
            {
                ioexception.printStackTrace();
                ioexception = null;
                continue; /* Loop/switch isn't completed */
            }
            bx.a(ioexception);
_L17:
            ioexception = null;
            if (true) goto _L19; else goto _L18
_L18:
        }

        private void b(kik.a.d.a.a a1)
        {
            if (a != null)
            {
                byte abyte0[] = com.kik.m.k.a(BitmapFactory.decodeResource(a.getResources(), 0x7f0200b2), android.graphics.Bitmap.CompressFormat.PNG, 5000L);
                if (abyte0 != null)
                {
                    a1.a("icon", new d(abyte0));
                }
            }
        }

        static void b(b b1, kik.a.d.a.a a1)
        {
            b1.c(a1);
        }

        private void c(kik.a.d.a.a a1)
        {
            if (a1 == null)
            {
                b.a(new a(0));
                return;
            } else
            {
                b.a(a1);
                return;
            }
        }

        final p a()
        {
            return b;
        }

        final void a(KikMessageParcelable kikmessageparcelable)
        {
            c = kikmessageparcelable.i;
            d = kikmessageparcelable.j;
            e = kikmessageparcelable.a;
            f = kikmessageparcelable.b;
            if (kik.a.f.e.a.a(kikmessageparcelable.c))
            {
                g = kikmessageparcelable.c;
            } else
            if (kikmessageparcelable.c != null && kikmessageparcelable.c.length() > 0)
            {
                i = com.kik.cards.web.bf.a(kikmessageparcelable.c, d);
            }
            if (kik.a.f.e.a.a(kikmessageparcelable.d))
            {
                m = kikmessageparcelable.d;
            } else
            if (kikmessageparcelable.d != null && kikmessageparcelable.d.length() > 0)
            {
                o = com.kik.cards.web.bf.a(kikmessageparcelable.d, d);
            }
            if (kik.a.f.e.a.a(kikmessageparcelable.e))
            {
                j = kikmessageparcelable.e;
            } else
            if (kikmessageparcelable.e != null && kikmessageparcelable.e.length() > 0)
            {
                k = com.kik.cards.web.bf.a(kikmessageparcelable.e, d);
            } else
            if (kikmessageparcelable.k != null)
            {
                k = kikmessageparcelable.k;
            }
            p = kikmessageparcelable.n;
            l = kikmessageparcelable.h;
            w = Boolean.parseBoolean(kikmessageparcelable.l);
            x = kikmessageparcelable.m;
            q = kikmessageparcelable.o;
            r = kikmessageparcelable.p;
            s = kikmessageparcelable.q;
            t = kikmessageparcelable.r;
            u = kikmessageparcelable.s;
            v = (HashMap)kikmessageparcelable.t.clone();
        }

        final void a(kik.a.d.a.a a1)
        {
            String s1;
            y = a1;
            c = kik.android.util.ae.a(a1);
            e = a1.g("title");
            f = a1.g("text");
            l = a1.g("layout");
            w = "true".equalsIgnoreCase(a1.g("allow-forward"));
            q = a1.h();
            v = new HashMap(a1.q());
            s1 = a1.a();
            if (!kik.a.f.e.a.a(s1)) goto _L2; else goto _L1
_L1:
            j = s1;
_L8:
            a1 = a1.b();
            if (!kik.a.f.e.a.a(a1)) goto _L4; else goto _L3
_L3:
            g = a1;
_L6:
            return;
_L2:
            if (s1 != null && s1.length() > 0)
            {
                k = s1;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (a1 == null || a1.length() <= 0) goto _L6; else goto _L5
_L5:
            i = a1;
            return;
            if (true) goto _L8; else goto _L7
_L7:
        }

        protected final Object doInBackground(Object aobj[])
        {
            return b();
        }

        protected final volatile void onPostExecute(Object obj)
        {
        }

        b(Activity activity, ad ad)
        {
            a = activity;
            z = ad;
            b = new p();
        }
    }


    private static final org.c.b a = c.a("PlatformUtils");

    public static long a(File file)
    {
        long l;
        long l1;
        if (file.isDirectory())
        {
            l = 0L;
        } else
        {
            l = file.length();
        }
        l1 = l;
        if (file != null)
        {
            l1 = l;
            if (file.isDirectory())
            {
                String as[] = file.list();
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= as.length)
                    {
                        break;
                    }
                    l += a(new File(file, as[i]));
                    i++;
                } while (true);
            }
        }
        return l1;
    }

    public static p a(Activity activity, KikMessageParcelable kikmessageparcelable, ad ad)
    {
        activity = new b(activity, ad);
        activity.a(kikmessageparcelable);
        activity.a(new Void[0]);
        return activity.a();
    }

    public static p a(Activity activity, kik.a.d.a.a a1, ad ad)
    {
        activity = new b(activity, ad);
        activity.a(a1);
        activity.a(new Void[0]);
        return activity.a();
    }

    public static byte[] a(Bitmap bitmap)
    {
        byte abyte0[] = null;
        if (bitmap != null)
        {
            abyte0 = k.a(bitmap, android.graphics.Bitmap.CompressFormat.PNG, 10240L);
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[])
    {
        byte abyte1[] = abyte0;
        if (abyte0 != null)
        {
            abyte1 = k.a(new ByteArrayInputStream(abyte0), android.graphics.Bitmap.CompressFormat.JPEG);
        }
        return abyte1;
    }

    public static void b(File file)
    {
        if (file != null)
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    b(afile[i]);
                }

            }
            file.delete();
        }
    }

}
