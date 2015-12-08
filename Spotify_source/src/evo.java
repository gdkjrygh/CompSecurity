// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.util.CollectionState;

public final class evo
    implements evp
{

    private int a;
    private int b;
    private boolean c;

    public evo(int i, int j, CollectionState collectionstate)
    {
        a = i;
        b = j;
        boolean flag;
        if (collectionstate != CollectionState.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }
}
