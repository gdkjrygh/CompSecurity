// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.android.sdk.app.Session;
import java.util.List;

public class PebbleSession extends Session
{

    public PebbleSession(Context context)
    {
        super(context);
    }

    protected List getChannelManagers(Context context)
    {
        return null;
    }
}
