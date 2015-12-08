// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static final class mRemoteInputs extends ion
{

    public static final ion.Factory FACTORY = new ion.Factory();
    public PendingIntent actionIntent;
    public int icon;
    private final Bundle mExtras;
    private final RemoteInput mRemoteInputs[];
    public CharSequence title;

    private RemoteInput[] getRemoteInputs()
    {
        return mRemoteInputs;
    }

    protected final PendingIntent getActionIntent()
    {
        return actionIntent;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    protected final int getIcon()
    {
        return icon;
    }

    public final volatile teInput[] getRemoteInputs()
    {
        return getRemoteInputs();
    }

    protected final CharSequence getTitle()
    {
        return title;
    }


    public teInput(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[])
    {
        icon = i;
        title = .limitCharSequenceLength(charsequence);
        actionIntent = pendingintent;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        mExtras = bundle;
        mRemoteInputs = aremoteinput;
    }
}
