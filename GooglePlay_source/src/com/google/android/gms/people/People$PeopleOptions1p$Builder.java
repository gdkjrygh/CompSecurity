// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.people:
//            People

public static final class clientApplicationId
{

    public int clientApplicationId;

    public final clientApplicationId build()
    {
        boolean flag;
        if (clientApplicationId >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must provide valid client application ID!");
        return new ument(this, (byte)0);
    }

    public ()
    {
        clientApplicationId = -1;
    }
}
