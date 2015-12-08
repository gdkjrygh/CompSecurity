// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            f

static final class  extends f
{

    protected int a(int i, int j, int k, int l)
    {
        boolean flag = true;
        i = (int)Math.ceil(Math.max((float)j / (float)l, (float)i / (float)k));
        j = Math.max(1, Integer.highestOneBit(i));
        if (j < i)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return j << i;
    }

    public String a()
    {
        return "AT_MOST.com.bumptech.glide.load.data.bitmap";
    }

    ()
    {
    }
}
