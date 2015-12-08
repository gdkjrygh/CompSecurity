// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;


// Referenced classes of package com.google.android.gms.common.images.internal:
//            ImageUrlUtils

public static final class  extends 
{

    public final String build()
    {
        if (mUrl == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder(mUrl);
        String s;
        boolean flag;
        boolean flag1;
        if (mUrl.lastIndexOf("=") == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (mSize >= 0)
        {
            if (flag)
            {
                s = "=";
            } else
            {
                s = "-";
            }
            stringbuilder.append(s).append("s").append(mSize);
            flag1 = false;
        }
        if (mIsBlackAndWhite)
        {
            if (flag1)
            {
                s = "=";
            } else
            {
                s = "-";
            }
            stringbuilder.append(s).append("fbw=1");
        }
        return stringbuilder.toString();
    }

    public (String s)
    {
        super(s);
    }
}
