// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import java.net.URL;

// Referenced classes of package com.facebook.widget:
//            ImageDownloader

private static class tag
{

    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    Object tag;
    URL url;

    public boolean equals(Object obj)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof tag)
                {
                    obj = (tag)obj;
                    if (((tag) (obj)).url != url || ((url) (obj)).tag != tag)
                    {
                        break label0;
                    }
                    flag = true;
                }
            }
            return flag;
        }
        return false;
    }

    public int hashCode()
    {
        return (url.hashCode() + 1073) * 37 + tag.hashCode();
    }

    (URL url1, Object obj)
    {
        url = url1;
        tag = obj;
    }
}
