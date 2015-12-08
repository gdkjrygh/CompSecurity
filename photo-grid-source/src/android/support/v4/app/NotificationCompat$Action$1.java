// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

final class n
    implements n.Factory
{

    public final Input build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, Input ainput[])
    {
        return new nit>(i, charsequence, pendingintent, bundle, (RemoteInput[])ainput, null);
    }

    public final volatile n build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, Input ainput[])
    {
        return build(i, charsequence, pendingintent, bundle, ainput);
    }

    public final Input[] newArray(int i)
    {
        return new Input[i];
    }

    public final volatile n[] newArray(int i)
    {
        return newArray(i);
    }

    n()
    {
    }
}
