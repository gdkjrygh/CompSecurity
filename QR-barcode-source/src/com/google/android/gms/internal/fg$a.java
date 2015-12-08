// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            fg, gb, bm, cj, 
//            fy, fr, fi, fm

public static final class mContext extends fg
{

    private final Context mContext;

    public void cC()
    {
    }

    public fm cD()
    {
        Object obj = gb.bD();
        obj = new bm(((Bundle) (obj)).getString("gads:sdk_core_location"), ((Bundle) (obj)).getString("gads:sdk_core_experiment_id"), ((Bundle) (obj)).getString("gads:block_autoclicks_experiment_id"));
        return fr.a(mContext, ((bm) (obj)), new cj(), new fy());
    }

    public (Context context, fi fi,  )
    {
        super(fi, );
        mContext = context;
    }
}
