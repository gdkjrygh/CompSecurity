// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public class IndexModel
    implements JacksonModel
{

    private final List mFacebookValue;

    private IndexModel(List list)
    {
        mFacebookValue = list;
    }


    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (IndexModel)obj;
            if (mFacebookValue == null ? ((IndexModel) (obj)).mFacebookValue != null : !mFacebookValue.equals(((IndexModel) (obj)).mFacebookValue))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (mFacebookValue != null)
        {
            return mFacebookValue.hashCode();
        } else
        {
            return 0;
        }
    }
}
