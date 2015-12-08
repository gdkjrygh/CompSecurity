// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.Context;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMRegistrationListener

public interface GCMClient
{

    public abstract String getErrorCode(String s);

    public abstract void register(Context context, String s, GCMRegistrationListener gcmregistrationlistener);

    public abstract void reset();

    public abstract void sendUpstreamMessage(String s, String s1, String s2, Context context);

    public abstract void unregisterReceivers(Context context);
}
