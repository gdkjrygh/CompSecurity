// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;

// Referenced classes of package b.a:
//            hc, gl, ga

public final class hb
{

    public final hc a;
    public ArrayList b;

    public hb(ga ga, int i, int j, int k)
    {
        a = new hc(ga, i, k);
        b = new ArrayList(j);
    }

    public final void a()
    {
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            a.a((gl)b.get(i));
        }

        b = null;
    }

    public final void a(gl gl1)
    {
        a.a(gl1);
    }
}
