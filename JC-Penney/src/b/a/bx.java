// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONArray;

// Referenced classes of package b.a:
//            bj, bk, af, cr

public final class bx
    implements bj
{

    private JSONArray a;

    public bx()
    {
        a = null;
        bk.c();
        bk.d();
        if (bk.c().a)
        {
            a = bk.d().a();
        }
    }

    public final String a()
    {
        return "logcat";
    }

    public final volatile Object b()
    {
        return a;
    }
}
