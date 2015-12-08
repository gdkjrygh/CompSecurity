// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;

// Referenced classes of package p.cr:
//            a

private static final class .String extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f h[];
    Intent g;

    static Intent a()
    {
        return (new PandoraIntent("show_page")).putExtra("intent_page_name", p.r).putExtra("intent_show_force_screen", true);
    }

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cr/a$a, s);
    }

    public static .String[] values()
    {
        return (.String[])h.clone();
    }

    static 
    {
        a = new <init>("info", 0, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.u));
        b = new <init>("privacy", 1, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.t).putExtra("intent_show_force_screen", true));
        c = new <init>("notices", 2, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.v));
        d = new <init>("billing", 3, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.s));
        e = new <init>("device", 4, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.w));
        f = new <init>("artistMessages", 5, (new PandoraIntent("show_page")).putExtra("intent_page_name", p.A));
        h = (new h[] {
            a, b, c, d, e, f
        });
    }

    private .String(String s, int i, Intent intent)
    {
        super(s, i);
        g = intent.putExtra("intent_show_force_screen", true);
    }
}
