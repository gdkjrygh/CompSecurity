// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.Context;
import com.google.android.gms.iid.a;
import java.io.IOException;

public class InstanceIdWrapper
{

    public InstanceIdWrapper()
    {
    }

    public String getToken(Context context, String s, String s1)
        throws IOException
    {
        return a.b(context).b(s, s1, null);
    }
}
