// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.molecules.card.glue;

import com.spotify.android.glue.molecules.card.CardAppearance;

// Referenced classes of package com.spotify.android.glue.molecules.card.glue:
//            CardView

public final class 
{

    public static final int a[];

    static 
    {
        a = new int[CardAppearance.values().length];
        try
        {
            a[CardAppearance.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[CardAppearance.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[CardAppearance.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
