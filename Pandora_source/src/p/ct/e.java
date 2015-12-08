// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import java.util.Arrays;
import java.util.List;
import p.bg.ai;
import p.bh.i;
import p.cu.c;

public class e
{

    private ai a;
    private String b[] = {
        "RegisterAppInterface"
    };
    private String c[] = {
        "DeleteFile", "ChangeRegistration", "DiagnosticMessage", "GetVehicleData", "ListFiles", "PutFile", "SetAppIcon", "SetDisplayLayout", "SystemRequest", "RegisterAppInterface", 
        "UnregisterAppInterface"
    };
    private String d[] = {
        "AddCommand", "AddSubMenu", "DeleteCommand", "DeleteSubMenu", "EndAudioPassThru", "GetDTCs", "PerformAudioPassThru", "ReadDID", "ResetGlobalProperties", "SetGlobalProperties", 
        "SetMediaClockTimer", "Show", "SubscribeButton", "SubscribeVehicleData", "UnsubscribeButton", "UnsubscribeVehicleData", "DeleteInteractionChoiceSet", "CreateInteractionChoiceSet"
    };
    private String e[] = {
        "Alert", "Speak"
    };
    private String f[] = {
        "PerformInteraction", "ScrollableMessage", "Slider"
    };

    public e(ai ai1)
    {
        a = null;
        a = ai1;
    }

    public ai a()
    {
        return a;
    }

    public boolean a(String s)
    {
        if (a != null && (b() || !c(s)))
        {
            if (b() && d(s))
            {
                return true;
            }
            if (g() && g(s))
            {
                return true;
            }
            if (f() && f(s))
            {
                return true;
            }
            if (c() && e(s))
            {
                return true;
            }
        }
        return false;
    }

    public boolean a(c c1)
    {
        return c1 != null && c1.a() != null && a(c1.a().a());
    }

    public i b(String s)
    {
        if (d(s))
        {
            return i.d;
        }
        if (g(s))
        {
            return i.c;
        }
        if (f(s))
        {
            return i.b;
        }
        if (e(s))
        {
            return i.a;
        } else
        {
            return null;
        }
    }

    public i b(c c1)
    {
        if (c1 != null && c1.a() != null)
        {
            return b(c1.a().a());
        } else
        {
            return null;
        }
    }

    public boolean b()
    {
        return a() != null && i.d == a().c();
    }

    public boolean c()
    {
        return !b() && a() != null && i.a == a().c();
    }

    public boolean c(String s)
    {
        return Arrays.asList(b).contains(s);
    }

    public boolean d()
    {
        return c() || i.b == a().c();
    }

    public boolean d(String s)
    {
        return Arrays.asList(c).contains(s);
    }

    public boolean e()
    {
        return d() || i.c == a().c();
    }

    public boolean e(String s)
    {
        return f(s) || Arrays.asList(f).contains(s);
    }

    public boolean f()
    {
        return a() != null && i.b == a().c();
    }

    public boolean f(String s)
    {
        return g(s) || Arrays.asList(e).contains(s);
    }

    public boolean g()
    {
        return a() != null && i.c == a().c();
    }

    public boolean g(String s)
    {
        return d(s) || Arrays.asList(d).contains(s);
    }
}
