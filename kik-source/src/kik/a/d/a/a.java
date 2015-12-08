// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d.a;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kik.a.d.o;
import kik.a.h.i;

// Referenced classes of package kik.a.d.a:
//            g

public class kik.a.d.a.a extends g
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        private static final int f[];

        public static int[] a()
        {
            return (int[])f.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = (new int[] {
                a, b, c, d, e
            });
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        private static final b h[];
        String g;

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(kik/a/d/a/a$b, s1);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        public final String a()
        {
            return g;
        }

        public final boolean a(b b1)
        {
            if (b1 == null)
            {
                return false;
            } else
            {
                return b1.g.equals(g);
            }
        }

        static 
        {
            a = new b("CONTENT_LAYOUT_DEFAULT", 0, "");
            b = new b("CONTENT_LAYOUT_PHOTO", 1, "photo");
            c = new b("CONTENT_LAYOUT_ARTICLE", 2, "article");
            d = new b("CONTENT_LAYOUT_FULL_BLEED", 3, "full_bleed");
            e = new b("CONTENT_LAYOUT_VIDEO", 4, "video");
            f = new b("CONTENT_LAYOUT_BANNER", 5, "banner");
            h = (new b[] {
                a, b, c, d, e, f
            });
        }

        private b(String s1, int i1, String s2)
        {
            super(s1, i1);
            g = s2;
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        private static final c g[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(kik/a/d/a/a$c, s1);
        }

        public static c[] values()
        {
            return (c[])g.clone();
        }

        static 
        {
            a = new c("WebM", 0);
            b = new c("TinyWebM", 1);
            c = new c("MP4", 2);
            d = new c("TinyMP4", 3);
            e = new c("NanoMP4", 4);
            f = new c("NanoWebM", 5);
            g = (new c[] {
                a, b, c, d, e, f
            });
        }

        private c(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final Map a;
    private static final List b = Arrays.asList(new String[] {
        "com.kik.ext.camera", "com.kik.ext.gallery", "com.kik.ext.video-camera", "com.kik.ext.video-gallery", "com.kik.ext.gif"
    });
    private static Map c;
    private String d;
    private final String e;
    private final String f;
    private String g;
    private boolean h;
    private ArrayList i;
    private Hashtable j;
    private Hashtable k;
    private Hashtable l;
    private String m;
    private String n;
    private String o;

    public kik.a.d.a.a(String s1)
    {
        super(true, true, 15);
        i = new ArrayList();
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
        d = UUID.randomUUID().toString();
        e = s1;
        f = "2";
        B();
    }

    public kik.a.d.a.a(String s1, String s2)
    {
        super(true, true, 15);
        i = new ArrayList();
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
        d = s2;
        e = s1;
        f = "2";
        B();
    }

    public kik.a.d.a.a(String s1, String s2, String s3, ArrayList arraylist, Hashtable hashtable, Hashtable hashtable1, Hashtable hashtable2)
    {
        super(true, true, 15);
        i = new ArrayList();
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
        e = s2;
        d = s1;
        f = s3;
        s1 = arraylist;
        if (arraylist == null)
        {
            s1 = new ArrayList();
        }
        s2 = hashtable2;
        if (hashtable2 == null)
        {
            s2 = new Hashtable();
        }
        s3 = hashtable1;
        if (hashtable1 == null)
        {
            s3 = new Hashtable();
        }
        arraylist = hashtable;
        if (hashtable == null)
        {
            arraylist = new Hashtable();
        }
        j = s2;
        l = s3;
        k = arraylist;
        i = s1;
        B();
    }

    public kik.a.d.a.a(String s1, String s2, String s3, ArrayList arraylist, Hashtable hashtable, Hashtable hashtable1, Hashtable hashtable2, 
            String s4, String s5, String s6, String s7, boolean flag)
    {
        super(true, true, 15);
        i = new ArrayList();
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
        e = s2;
        d = s1;
        f = s3;
        j = hashtable2;
        l = hashtable1;
        k = hashtable;
        i = arraylist;
        h = flag;
        g = s7;
        n = s5;
        m = s4;
        o = s6;
        B();
    }

    public kik.a.d.a.a(String s1, String s2, String s3, String as[], String as1[], Hashtable hashtable, Hashtable hashtable1, 
            Hashtable hashtable2)
    {
label0:
        {
            super(true, true, 15);
            i = new ArrayList();
            j = new Hashtable();
            k = new Hashtable();
            l = new Hashtable();
            e = s2;
            f = s3;
            if (s1 != null)
            {
                s2 = s1;
                if (!"".equals(s1))
                {
                    break label0;
                }
            }
            s2 = UUID.randomUUID().toString();
        }
        d = s2;
        a(as, as1);
        j = hashtable2;
        l = hashtable1;
        k = hashtable;
        B();
    }

    public kik.a.d.a.a(kik.a.d.a.a a1)
    {
        super(true, true, 15);
        i = new ArrayList();
        j = new Hashtable();
        k = new Hashtable();
        l = new Hashtable();
        d = a1.d;
        e = a1.e;
        f = a1.f;
        g = a1.g;
        h = a1.h;
        m = a1.m;
        n = a1.n;
        o = a1.o;
        i.addAll(a1.i);
        j.putAll(a1.j);
        k.putAll(a1.k);
        l.putAll(a1.l);
    }

    private void B()
    {
        if (C())
        {
            a("app-name", (String)a.get(e));
        }
    }

    private boolean C()
    {
        return b.contains(e);
    }

    private boolean D()
    {
        return "true".equals(j.get("needstranscoding"));
    }

    private String a(String s1, c c1)
    {
        for (Iterator iterator = f().iterator(); iterator.hasNext();)
        {
            com.kik.f.a.a.a a1 = (com.kik.f.a.a.a)iterator.next();
            if (a1.d() != null && a1.d().equals(s1))
            {
                if (c1 != null)
                {
                    String s2 = a1.i();
                    String s3 = c(c1);
                    if (s2 == null || s2.equals(s3))
                    {
                        return a1.f();
                    }
                } else
                {
                    return a1.f();
                }
            }
        }

        return null;
    }

    private void a(String as[], String as1[])
    {
        i = new ArrayList();
        if (as != null)
        {
            for (int i1 = 0; i1 < as.length; i1++)
            {
                com.kik.f.a.a.a a1 = new com.kik.f.a.a.a(as[i1], e);
                a1.a(as1[i1]);
                i.add(a1);
            }

        }
    }

    public static boolean b(String s1)
    {
        return !"com.kik.ext.video-camera".equals(s1) && !"com.kik.ext.video-gallery".equals(s1);
    }

    private static String c(c c1)
    {
        if (c1 == null)
        {
            return null;
        } else
        {
            return (String)c.get(c1);
        }
    }

    private static String m(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "null";
        }
        return s2;
    }

    private boolean n(String s1)
    {
        s1 = g(s1);
        if (kik.a.h.i.a(s1))
        {
            return false;
        } else
        {
            return "true".equals(s1);
        }
    }

    public final boolean A()
    {
        return n("video-should-be-muted");
    }

    public final String a()
    {
        return m;
    }

    public final String a(long l1)
    {
        return (String)k.put("duration", Long.toString(l1));
    }

    public final String a(c c1)
    {
        String s2 = n;
        String s1 = s2;
        if (s2 == null)
        {
            String s3 = g("file-url");
            s1 = s3;
            if (s3 == null)
            {
                s1 = a("video", c1);
            }
        }
        return s1;
    }

    public final o a(String s1)
    {
        return (o)l.get(s1);
    }

    public final void a(int i1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.a().length];
                try
                {
                    a[a.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.c - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.d - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.e - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[i1 - 1])
        {
        default:
            return;

        case 1: // '\001'
            a("int-file-state", "1");
            return;

        case 2: // '\002'
        case 3: // '\003'
            a("int-file-state", "0");
            return;

        case 4: // '\004'
            a("int-file-state", "-1");
            return;

        case 5: // '\005'
            k.remove("int-file-state");
            break;
        }
    }

    public final void a(File file)
    {
        if (file == null)
        {
            return;
        } else
        {
            a("int-file-url-local", file.getPath());
            a("file-name", file.getName());
            a("file-size", (new StringBuilder()).append(file.length()).toString());
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        if (s1 != null && s2 != null)
        {
            k.put(s1, s2);
        }
    }

    public final void a(String s1, String s2, String s3, String s4, String s5)
    {
        s1 = new com.kik.f.a.a.a(s1, e);
        s1.a(s2);
        s1.b(s3);
        s1.c(s4);
        s1.e(s5);
        i.add(s1);
    }

    public final void a(String s1, String s2, c c1)
    {
        s1 = new com.kik.f.a.a.a(s1, e);
        s1.e(c(c1));
        s1.b(s2);
        i.add(s1);
    }

    public final void a(String s1, o o1)
    {
        if (s1 != null && o1 != null)
        {
            l.put(s1, o1);
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            c("needstranscoding", "true");
            return;
        } else
        {
            c("needstranscoding", "false");
            return;
        }
    }

    public final String b()
    {
        return o;
    }

    public final void b(String s1, String s2)
    {
        s1 = new com.kik.f.a.a.a(s1, e);
        s1.a(s2);
        i.add(s1);
    }

    public final boolean b(c c1)
    {
        for (Iterator iterator = f().iterator(); iterator.hasNext();)
        {
            Object obj = (com.kik.f.a.a.a)iterator.next();
            if (((com.kik.f.a.a.a) (obj)).d() != null && ((com.kik.f.a.a.a) (obj)).d().equals("video"))
            {
                obj = ((com.kik.f.a.a.a) (obj)).i();
                String s1 = c(c1);
                if (obj != null && s1 != null && ((String) (obj)).equals(s1))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public final List c(String s1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.f.a.a.a a1 = (com.kik.f.a.a.a)iterator.next();
            if (a1.d() == null && (a1.c() == null || a1.c().equals(s1) || a1.c().equals("cards")))
            {
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    public final void c(String s1, String s2)
    {
        if (s1 != null && s2 != null)
        {
            j.put(s1, s2);
        }
    }

    public final boolean c()
    {
        return g != null;
    }

    public final String d()
    {
        return g;
    }

    public final boolean d(String s1)
    {
        return a(s1, ((c) (null))) != null;
    }

    public final List e(String s1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.f.a.a.a a1 = (com.kik.f.a.a.a)iterator.next();
            if (a1.d() == null && (a1.c() == null || a1.c().equals(s1) || a1.c().equals("cards")))
            {
                arraylist.add(a1.f());
            }
        } while (true);
        return arraylist;
    }

    public final boolean e()
    {
        return h;
    }

    public final ArrayList f()
    {
        return (ArrayList)i.clone();
    }

    public final void f(String s1)
    {
        d = s1;
    }

    public final String g()
    {
        String s2 = n;
        String s1 = s2;
        if (s2 == null)
        {
            String s3 = g("file-url");
            s1 = s3;
            if (s3 == null)
            {
                s1 = a("image", ((c) (null)));
            }
        }
        return s1;
    }

    public final String g(String s1)
    {
        return (String)k.get(s1);
    }

    public final String h()
    {
        return a(((c) (null)));
    }

    public final String h(String s1)
    {
        return (String)j.get(s1);
    }

    public final void i(String s1)
    {
        a("disallow-save", s1);
    }

    public final boolean i()
    {
        while (k.containsKey("file-url") || i.size() == 0 || C()) 
        {
            return false;
        }
        return true;
    }

    public final void j(String s1)
    {
        a("video-should-autoplay", s1);
    }

    public final boolean j()
    {
        return !i() && !"com.kik.ext.gif".equals(e);
    }

    public final File k()
    {
        String s1 = g("int-file-url-local");
        if (s1 != null)
        {
            return new File(s1);
        } else
        {
            return null;
        }
    }

    public final void k(String s1)
    {
        a("video-should-loop", s1);
    }

    public final void l(String s1)
    {
        a("video-should-be-muted", s1);
    }

    public final boolean l()
    {
        boolean flag;
        if (v() == a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return D() && !flag;
    }

    public final ArrayList m()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = f().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.f.a.a.a a1 = (com.kik.f.a.a.a)iterator.next();
            if (a1.c() != null && a1.c().equals("cards"))
            {
                arraylist.add(a1.f());
            }
        } while (true);
        return arraylist;
    }

    public final boolean n()
    {
        return a("png-preview") != null;
    }

    public final String o()
    {
        return d;
    }

    public final String p()
    {
        return f;
    }

    public final Hashtable q()
    {
        return j;
    }

    public final Hashtable r()
    {
        return k;
    }

    public final Hashtable s()
    {
        return l;
    }

    public final b t()
    {
        String s1 = (String)k.get("layout");
        if (s1 == null || s1.equals(b.a.g))
        {
            return b.a;
        }
        if (s1.equals(b.c.g))
        {
            return b.c;
        }
        if (s1.equals(b.b.g))
        {
            return b.b;
        }
        if (s1.equals(b.e.g))
        {
            return b.e;
        } else
        {
            return b.a;
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder("appId: ")).append(m(e)).append(" _contentId: ").append(m(d)).append(" strings: ").toString();
        Hashtable hashtable = k;
        for (Iterator iterator = hashtable.keySet().iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            s1 = (new StringBuilder()).append(s1).append("(").append(s2).append(",").append((String)hashtable.get(s2)).append("),").toString();
        }

        s1 = (new StringBuilder()).append(s1).append(" extras: ").toString();
        hashtable = j;
        for (Iterator iterator1 = hashtable.keySet().iterator(); iterator1.hasNext();)
        {
            String s3 = (String)iterator1.next();
            s1 = (new StringBuilder()).append(s1).append("(").append(s3).append(",").append((String)hashtable.get(s3)).append(")").toString();
        }

        s1 = (new StringBuilder()).append(s1).append(" images: ").toString();
        hashtable = l;
        Iterator iterator2 = hashtable.keySet().iterator();
        while (iterator2.hasNext()) 
        {
            Object obj = (String)iterator2.next();
            byte abyte0[] = ((o)hashtable.get(obj)).c();
            obj = (new StringBuilder()).append(s1).append("(").append(((String) (obj))).append(",");
            if (abyte0 == null)
            {
                s1 = "null";
            } else
            {
                s1 = String.valueOf(abyte0.length);
            }
            s1 = ((StringBuilder) (obj)).append(s1).append(")").toString();
        }
        return s1;
    }

    public final String u()
    {
        return e;
    }

    public final int v()
    {
        String s1 = g("int-file-state");
        if (kik.a.h.i.a(s1))
        {
            return a.e;
        }
        if (s1.equals("1"))
        {
            return a.a;
        }
        if (s1.equals("0"))
        {
            if (D())
            {
                return a.c;
            } else
            {
                return a.b;
            }
        }
        if (s1.equals("-1"))
        {
            return a.d;
        } else
        {
            return a.d;
        }
    }

    public final int w()
    {
        String s1 = g("file-size");
        if (kik.a.h.i.a(s1))
        {
            return -1;
        }
        int i1;
        try
        {
            i1 = Integer.parseInt(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1;
        }
        return i1;
    }

    public final boolean x()
    {
        return n("disallow-save");
    }

    public final boolean y()
    {
        return n("video-should-autoplay");
    }

    public final boolean z()
    {
        return n("video-should-loop");
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("com.kik.ext.camera", "Camera");
        a.put("com.kik.ext.gallery", "Gallery");
        a.put("com.kik.ext.video-camera", "Video");
        a.put("com.kik.ext.video-gallery", "Gallery");
        a.put("com.kik.ext.gif", "GIF");
        hashmap = new HashMap();
        c = hashmap;
        hashmap.put(c.a, "video/webm");
        c.put(c.c, "video/mp4");
        c.put(c.d, "video/tinymp4");
        c.put(c.b, "video/tinywebm");
        c.put(c.f, "video/nanowebm");
        c.put(c.e, "video/nanomp4");
    }
}
