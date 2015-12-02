// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.ui.media.a:
//            c, d

class e extends c
{

    e(d d1)
    {
        super(d1);
        boolean flag;
        if (d1 != d.SUCCESS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }
}
