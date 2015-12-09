// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.util.bf;
import java.util.UUID;

public class a extends bf
{

    private UUID a;

    public a(Context context, UUID uuid)
    {
        super(context);
        a = uuid;
    }

    protected ActivityLogEntry a()
    {
        return ActivityBusinessLogic.a().a(a);
    }

    protected Object f_()
    {
        return a();
    }
}
