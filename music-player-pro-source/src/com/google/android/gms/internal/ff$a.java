// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ff, ga, bm, co, 
//            fx, fq, fh, fl

public static final class mContext extends ff
{

    private final Context mContext;

    public void cJ()
    {
    }

    public fl cK()
    {
        Object obj = ga.bN();
        obj = new bm(((Bundle) (obj)).getString("gads:sdk_core_location"), ((Bundle) (obj)).getString("gads:sdk_core_experiment_id"), ((Bundle) (obj)).getString("gads:block_autoclicks_experiment_id"), ((Bundle) (obj)).getString("gads:spam_app_context:experiment_id"));
        return fq.a(mContext, ((bm) (obj)), new co(), new fx());
    }

    public (Context context, fh fh,  )
    {
        super(fh, );
        mContext = context;
    }
}
