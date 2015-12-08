// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync;

import android.content.Context;
import com.dominos.android.sdk.app.Session;
import java.util.List;

public class FordSyncSession extends Session
{

    public FordSyncSession(Context context)
    {
        super(context);
    }

    protected List getChannelManagers(Context context)
    {
        return null;
    }
}
