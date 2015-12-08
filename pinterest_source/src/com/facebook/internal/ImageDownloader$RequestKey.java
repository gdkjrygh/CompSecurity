// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.net.URI;

class tag
{

    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    Object tag;
    URI uri;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof tag)
            {
                obj = (tag)obj;
                flag = flag1;
                if (((tag) (obj)).uri == uri)
                {
                    flag = flag1;
                    if (((uri) (obj)).tag == tag)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (uri.hashCode() + 1073) * 37 + tag.hashCode();
    }

    (URI uri1, Object obj)
    {
        uri = uri1;
        tag = obj;
    }
}
