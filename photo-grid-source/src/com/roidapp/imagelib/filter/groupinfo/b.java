// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;


// Referenced classes of package com.roidapp.imagelib.filter.groupinfo:
//            IGroupInfo

public final class b
{

    public static boolean a(IGroupInfo igroupinfo)
    {
        while (igroupinfo == null || igroupinfo.a() == null) 
        {
            return false;
        }
        return true;
    }
}
