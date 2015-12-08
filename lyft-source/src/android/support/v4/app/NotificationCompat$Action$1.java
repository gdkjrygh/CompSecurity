// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

final class n
    implements n.Factory
{

    public Input build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, Input ainput[])
    {
        return new nit>(i, charsequence, pendingintent, bundle, (RemoteInput[])(RemoteInput[])ainput, null);
    }

    public volatile n build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, Input ainput[])
    {
        return build(i, charsequence, pendingintent, bundle, ainput);
    }

    public Input[] newArray(int i)
    {
        return new Input[i];
    }

    public volatile n[] newArray(int i)
    {
        return newArray(i);
    }

    n()
    {
    }
}
