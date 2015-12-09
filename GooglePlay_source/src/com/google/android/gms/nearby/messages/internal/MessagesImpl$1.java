// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.messages.MessagesOptions;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesImpl, MessagesClientImpl

static final class ailedListener extends com.google.android.gms.common.api.entBuilder
{

    public final volatile com.google.android.gms.common.api.iledListener buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api..ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api..OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new MessagesClientImpl(context, looper, connectioncallbacks, onconnectionfailedlistener, clientsettings, (MessagesOptions)obj);
    }

    public final int getPriority()
    {
        return 0x7fffffff;
    }

    ailedListener()
    {
    }
}
