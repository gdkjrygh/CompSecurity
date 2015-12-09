// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import com.aviary.android.feather.common.utils.k;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            j

public class e extends j
{

    public e(Integer integer)
    {
        a(integer);
    }

    public Object a()
    {
        return k.a(Integer.toHexString(((Integer)b()).intValue()), '0', 8);
    }

    public Object clone()
    {
        return new e((Integer)b());
    }
}
