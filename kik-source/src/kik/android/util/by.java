// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.kik.cards.web.bf;
import java.util.List;
import kik.a.d.a.a;
import kik.android.b.g;

// Referenced classes of package kik.android.util:
//            v, cj, ae, bz

public final class by
{

    public static com.kik.android.a.f a(com.kik.android.a.f f, String s)
    {
        boolean flag1 = true;
        Object obj1 = null;
        if (s == null)
        {
            return f;
        }
        Object obj = kik.android.util.v.a(s);
        com.kik.android.a.f f1;
        boolean flag;
        if (((List) (obj)).size() > 0)
        {
            obj = (String)((List) (obj)).get(0);
        } else
        {
            obj = null;
        }
        f = f.a("Is Content", false);
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = f.a("Contains URL", flag);
        if (obj != null && ((String) (obj)).contains(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f1 = f.a("Is Only URL", flag);
        if (obj != null)
        {
            f = bf.i(((String) (obj)));
        } else
        {
            f = null;
        }
        f1 = f1.a("URL Domain", f);
        if (obj != null)
        {
            f = bf.a(((String) (obj)), false);
        } else
        {
            f = null;
        }
        f1 = f1.a("URL Scheme", f);
        f = obj1;
        if (obj != null)
        {
            f = bf.g(((String) (obj)));
        }
        return f1.a("URL Extension", f).a("Message Type", "Text").a("Letter Count", s.length()).a("Word Count", s.split(" ").length).a("Smiley Count", kik.android.util.cj.a().a(s)).a("New Line Count", s.split("\n").length - 1).a("Ends With Newline", s.endsWith("\n"));
    }

    public static com.kik.android.a.f a(com.kik.android.a.f f, String s, boolean flag, String s1, a a1)
    {
        if (a1 == null)
        {
            s1 = null;
        } else
        {
            f.a("Is Content", true).a("Message Type", s).a("Text Message Attached", flag).a("Layout Style", s1).a("Autoplay", a1.y()).a("Looping", a1.z()).a("Muted", a1.A()).a("Disallow Save", a1.x());
            if (a1.c())
            {
                String s2;
                String s3;
                String s4;
                if (a1.e())
                {
                    s1 = a1.g("app-pkg");
                    s2 = s1;
                } else
                {
                    s2 = a1.d();
                    s1 = bf.i(s2);
                }
                new g();
                s4 = g.a(a1);
                if (kik.a.f.e.a.a(s4))
                {
                    s3 = "Data URI";
                    s4 = "Data URI";
                } else
                {
                    s3 = bf.i(s4);
                }
                f.a("Source Hostname", s1).a("Source URL", s2).a("Content Hostname", s3).a("Content URL", s4).a("Is Native", a1.e()).a("Used Share API", true);
            }
            s1 = f;
            if (s != null)
            {
                s1 = f;
                if (s.equals("Card"))
                {
                    f.a("Card URL", ae.d(a1));
                    return f;
                }
            }
        }
        return s1;
    }

    public static com.kik.android.a.f a(com.kik.android.a.f f, boolean flag, boolean flag1, boolean flag2, boolean flag3, double d, int i)
    {
        return f.a("Is Kik Team", flag).a("Is Group", flag1).a("Is Muted", flag2).a("Is Verified", flag3).a("Time Since Last Message Received", d).a("Emoji Count", i);
    }

    public static com.kik.android.a.f a(String s, com.kik.android.a a1)
    {
        if (a1 == null)
        {
            return null;
        } else
        {
            com.kik.android.a.f f = a1.b("Scan Stopped");
            f.a("Reason", s);
            a1.b("Scan Stopped", true);
            f.a("Time Since Open", (float)a1.b("Scan Started", "Scan Stopped") / 1000F);
            return f;
        }
    }

    public static void a(com.kik.android.a a1, boolean flag, String s, boolean flag1, boolean flag2)
    {
        String s1;
        if (flag)
        {
            s1 = "Content Saved";
        } else
        {
            s1 = "Content Save Failed";
        }
        a1 = a1.b(s1);
        if (s != null)
        {
            a1.a("App ID", s);
        }
        a1.a("Was Cached", flag1).a("Is Inline", flag2);
        a1.b();
    }

    public static void b(com.kik.android.a.f f, String s)
    {
        (new Thread(new bz(s, f))).start();
    }
}
