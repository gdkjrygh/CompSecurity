// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import com.microsoft.onlineid.internal.sso.e;
import java.util.Comparator;

// Referenced classes of package com.microsoft.onlineid.internal.sso.client:
//            e

static final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (e)obj;
        obj1 = (e)obj1;
        int i;
        if (((e) (obj)).a().equals("com.microsoft.msa.authenticator"))
        {
            i = -1;
        } else
        {
            if (((e) (obj1)).a().equals("com.microsoft.msa.authenticator"))
            {
                return 1;
            }
            int j = ((e) (obj1)).b() - ((e) (obj)).b();
            i = j;
            if (j == 0)
            {
                return (int)(((e) (obj)).c() - ((e) (obj1)).c());
            }
        }
        return i;
    }

    ()
    {
    }
}
