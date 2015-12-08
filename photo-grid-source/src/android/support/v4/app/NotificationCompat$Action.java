// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

public class <init> extends ion
{

    public static final ion.Factory FACTORY = new _cls1();
    public PendingIntent actionIntent;
    public int icon;
    private final Bundle mExtras;
    private final RemoteInput mRemoteInputs[];
    public CharSequence title;

    public PendingIntent getActionIntent()
    {
        return actionIntent;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public int getIcon()
    {
        return icon;
    }

    public RemoteInput[] getRemoteInputs()
    {
        return mRemoteInputs;
    }

    public volatile teInput[] getRemoteInputs()
    {
        return getRemoteInputs();
    }

    public CharSequence getTitle()
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

    mRemoteInputs(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], mRemoteInputs mremoteinputs)
    {
        this(i, charsequence, pendingintent, bundle, aremoteinput);
    }

    class _cls1
        implements NotificationCompatBase.Action.Factory
    {

        public final NotificationCompat.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return new NotificationCompat.Action(i, charsequence, pendingintent, bundle, (RemoteInput[])aremoteinput, null);
        }

        public final volatile NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return build(i, charsequence, pendingintent, bundle, aremoteinput);
        }

        public final NotificationCompat.Action[] newArray(int i)
        {
            return new NotificationCompat.Action[i];
        }

        public final volatile NotificationCompatBase.Action[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
