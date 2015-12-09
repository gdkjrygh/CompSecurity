// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.cosmos.JacksonModel;

class 
    implements JacksonModel
{

    private boolean mFound[];

    public boolean isInCollection()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mFound != null)
        {
            flag = flag1;
            if (mFound[0])
            {
                flag = true;
            }
        }
        return flag;
    }

    ()
    {
    }
}
