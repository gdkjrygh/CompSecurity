// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.c.a.b.aj;
import com.kik.cards.util.b;
import com.kik.cards.web.bf;
import com.kik.cards.web.kik.KikContentMessageParcelable;
import com.kik.g.p;
import com.kik.g.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kik.a.d.d;
import kik.a.h.e;
import kik.android.chat.activity.k;
import kik.android.e.a;
import kik.android.f.a.f;
import kik.android.util.DeviceUtils;
import kik.android.util.ae;
import kik.android.util.t;
import org.c.c;

// Referenced classes of package kik.android.b:
//            h, i

public final class g
{

    public static String a = "unsupportedContentType";
    public static String b = "videoTranscoding";
    public static final String c[] = {
        "mp4", "3gp", "mkv", "wav", "mid", "wav", "mp3", "flac", "ts", "aac", 
        "xmf", "mxmf", "rtttl", "rtx", "ota", "imy", "ogg"
    };
    private static final org.c.b g = org.c.c.a("ApplicationLaunchManager");
    private static final HashSet h = aj.a(new String[] {
        "video/mp4"
    });
    private static final HashSet i = aj.a(new String[] {
        "image/jpeg"
    });
    a d;
    private final String e = "native";
    private a f;

    public g()
    {
        d = new h(this);
        f = d;
    }

    private static p a(Context context, String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        String as[] = c;
        int l = as.length;
        int j = 0;
        Intent intent;
        Intent intent1;
        for (intent = null; j < l; intent = intent1)
        {
            String s2 = as[j];
            intent1 = intent;
            if (s1.endsWith((new StringBuilder(".")).append(s2).toString()))
            {
                intent1 = intent;
                if (DeviceUtils.a(context, s1))
                {
                    intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                    intent1.addFlags(0x200000);
                }
            }
            j++;
        }

        if (intent == null)
        {
            return null;
        } else
        {
            context = new p();
            context.a(intent);
            return context;
        }
    }

    private p a(Context context, String s1, String s2, int j)
    {
        if (s1 != null && s1.equals("cards") || s2.startsWith("card://") || s2.startsWith("cards://"))
        {
            s1 = bf.c(s2);
            context = f.a(context, s1, j);
            if (context != null)
            {
                s1 = new p();
                s1.a(context);
                return s1;
            }
        }
        return null;
    }

    private static p a(Context context, String s1, kik.a.d.a.a a1)
    {
        while (s1 == null || s1.indexOf("http") != 0 && s1.indexOf("https") != 0) 
        {
            return null;
        }
        kik.android.chat.fragment.KikCardBrowserFragment.a a2 = new kik.android.chat.fragment.KikCardBrowserFragment.a();
        a2.a(s1).b(com.kik.cards.util.b.b(s1)).a(b(a1));
        context = k.a(a2, context).e();
        s1 = new p();
        s1.a(context);
        return s1;
    }

    private static p a(Context context, Collection collection, String s1)
    {
        PackageManager packagemanager;
        Iterator iterator;
        int j;
        packagemanager = context.getPackageManager();
        iterator = collection.iterator();
        j = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        collection = (String)iterator.next();
        if (collection == null)
        {
            j++;
            continue; /* Loop/switch isn't completed */
        }
        if (collection.indexOf("http") != 0 && collection.indexOf("card") != 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        kik.android.chat.fragment.KikCardBrowserFragment.a a1 = new kik.android.chat.fragment.KikCardBrowserFragment.a();
        a1.a(collection).b(com.kik.cards.util.b.b(collection));
        collection = k.a(a1, context).e();
_L1:
        if (packagemanager.queryIntentActivities(collection, 0).size() == 0)
        {
            j++;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_148;
        collection = new Intent("android.intent.action.VIEW", Uri.parse(collection));
        collection.addFlags(0x200000);
          goto _L1
        p p1 = new p();
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (!kik.android.f.a.f.a().g(s1))
        {
            break MISSING_BLOCK_LABEL_181;
        }
        p1.a(collection);
        return p1;
        p1.a(collection);
        return p1;
        collection;
        Toast.makeText(context, 0x7f0900e2, 1);
        p1.a(new Throwable());
        return p1;
        context;
        throw context;
        return null;
        collection;
        j++;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static String a(kik.a.d.a.a a1)
    {
        for (Iterator iterator = a1.c("android").iterator(); iterator.hasNext();)
        {
            com.kik.f.a.a.a a2 = (com.kik.f.a.a.a)iterator.next();
            String s1 = a1.u();
            if (t.a(s1))
            {
                boolean flag;
                if (a1 != null && ("com.kik.ext.video-camera".equals(a1.u()) || "com.kik.ext.video-gallery".equals(a1.u())))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return a1.h();
                } else
                {
                    return a1.g();
                }
            }
            if ((s1 == null || !s1.equals("com.kik.cards")) && a1.g("layout") != null && a1.g("layout").equals(kik.a.d.a.a.b.b.a()))
            {
                return a1.g();
            }
            if ((a2.c() == null || !a2.c().equals("cards")) && !a2.f().startsWith("card://") && !a2.f().startsWith("cards://"))
            {
                return a2.f();
            }
            if (a2.f().indexOf("http") == 0)
            {
                return a2.f();
            }
        }

        return "";
    }

    private static KikContentMessageParcelable b(kik.a.d.a.a a1)
    {
        Object obj = null;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        obj = (d)a1.a("icon");
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = kik.a.h.e.a().a(((kik.a.d.o) (obj)));
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = (new StringBuilder("data:image/png;base64,")).append(com.kik.m.e.a(((byte []) (obj)))).toString();
_L7:
        obj = new KikContentMessageParcelable(a1, ((String) (obj)));
_L2:
        return ((KikContentMessageParcelable) (obj));
_L4:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final p a(Context context, com.kik.f.a.a.a a1, int j)
    {
        Object obj = null;
        if (a1 != null)
        {
            if ("image".equals(a1.d()))
            {
                obj = new kik.android.chat.fragment.ViewPictureFragment.a();
                ((kik.android.chat.fragment.ViewPictureFragment.a) (obj)).c(a1.f()).b();
                return s.a(k.a(((kik.android.util.an) (obj)), context).e());
            }
            obj = a1.c();
            Object obj1 = a1.f();
            a1.h();
            a1.g();
            obj = a(context, ((String) (obj)), ((String) (obj1)), j);
            if (obj != null)
            {
                return ((p) (obj));
            }
            obj1 = a(context, a1.f(), ((kik.a.d.a.a) (null)));
            obj = obj1;
            if (obj1 == null)
            {
                obj = a1.f();
                a1 = a1.h();
                ArrayList arraylist = new ArrayList();
                arraylist.add(obj);
                context = a(context, ((Collection) (arraylist)), ((String) (a1)));
                obj = context;
                if (context == null)
                {
                    context = new p();
                    context.a(new Throwable());
                    return context;
                }
            }
        }
        return ((p) (obj));
    }

    public final p a(Context context, kik.a.d.s s1, int j)
    {
        kik.a.d.a.a a1 = (kik.a.d.a.a)kik.a.d.a.g.a(s1, kik/a/d/a/a);
        if (a1 == null)
        {
            return null;
        }
        Object obj = a1.c("android");
        Object obj1 = a1.e("android");
        ((List) (obj1)).toArray(new String[((List) (obj1)).size()]);
        obj1 = a1.u();
        if (t.a(((String) (obj1))) || a1.d("image") || a1.d("video"))
        {
            obj = (d)a1.a("preview");
            if (a1.g() == null && a1.h() == null)
            {
                context = new p();
                context.a(new Throwable());
                return context;
            }
            if (a1.l())
            {
                return s.a(new Throwable(b));
            }
            Object obj2;
            String s2;
            if (obj != null)
            {
                obj = ((d) (obj)).b();
            } else
            {
                obj = "";
            }
            context = k.a((new kik.android.chat.fragment.ViewPictureFragment.a()).a(b(a1)).c(a1.g("file-url")).a(s1.o()).b(((String) (obj))).c(), context).e();
            s1 = new p();
            s1.a(context);
            return s1;
        }
        if (!kik.a.d.a.a.b(((String) (obj1))))
        {
            context = new p();
            context.a(new Throwable(a));
            return context;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            obj1 = (com.kik.f.a.a.a)((Iterator) (obj)).next();
            if (((com.kik.f.a.a.a) (obj1)).f() != null)
            {
                obj2 = ((com.kik.f.a.a.a) (obj1)).c();
                s2 = ((com.kik.f.a.a.a) (obj1)).f();
                if (a1 != null)
                {
                    ae.a(a1);
                }
                if (a1 != null)
                {
                    a1.g("card-icon");
                }
                obj2 = a(context, ((String) (obj2)), s2, j);
                if (obj2 != null)
                {
                    return s.b(((p) (obj2)), new i(this, s1));
                }
                obj2 = a(context, ((com.kik.f.a.a.a) (obj1)).f());
                if (obj2 != null)
                {
                    return ((p) (obj2));
                }
                obj1 = a(context, ((com.kik.f.a.a.a) (obj1)).f(), a1);
                if (obj1 != null)
                {
                    return ((p) (obj1));
                }
            }
        }

        context = new p();
        context.a(new Throwable());
        return context;
    }

}
