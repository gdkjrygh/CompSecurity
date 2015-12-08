// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class hlt extends aep
{

    private hls a;

    hlt(hls hls1)
    {
        a = hls1;
        super();
    }

    public final void a(int i, int j, int k)
    {
        ArrayList arraylist = new ArrayList(k);
        for (int l = i; l < i + k; l++)
        {
            arraylist.add(hls.a(a).remove(i));
        }

        for (i = 0; i < k; i++)
        {
            hls.a(a).add(j + i, arraylist.get(i));
        }

    }
}
