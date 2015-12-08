// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.fu;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment

public final class MomentBuffer extends DataBuffer
{

    public MomentBuffer(d d)
    {
        super(d);
    }

    public Moment get(int i)
    {
        return new fu(jf, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
