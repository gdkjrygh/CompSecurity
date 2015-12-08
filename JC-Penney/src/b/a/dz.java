// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONObject;

// Referenced classes of package b.a:
//            dx, be

public class dz
    implements dx
{

    private be a;
    private be b;

    public dz(be be1, be be2)
    {
        a = be1;
        b = be2;
    }

    public void a(boolean flag, int i, JSONObject jsonobject)
    {
        if (flag || i >= 200 && i < 300)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a.a();
            return;
        } else
        {
            a.a(b);
            return;
        }
    }
}
