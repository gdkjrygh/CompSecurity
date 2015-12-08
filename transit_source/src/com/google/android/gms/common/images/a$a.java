// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.dl;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class uri
{

    public final Uri uri;

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        boolean flag;
        if (!(obj instanceof uri))
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (this != obj)
            {
                flag = flag1;
                if (((uri)obj).hashCode() != hashCode())
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return dl.hashCode(new Object[] {
            uri
        });
    }

    public (Uri uri1)
    {
        uri = uri1;
    }
}
