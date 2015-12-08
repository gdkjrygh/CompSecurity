// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;

// Referenced classes of package com.facebook.internal:
//            E

private static final class b
{

    Uri a;
    Object b;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof b)
            {
                obj = (b)obj;
                flag = flag1;
                if (((b) (obj)).a == a)
                {
                    flag = flag1;
                    if (((a) (obj)).b == b)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + b.hashCode();
    }

    (Uri uri, Object obj)
    {
        a = uri;
        b = obj;
    }
}
