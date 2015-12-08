// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat, RemoteInput

public static class <init> extends ion
{
    public static final class Builder
    {

        private final Bundle mExtras;
        private final int mIcon;
        private final PendingIntent mIntent;
        private ArrayList mRemoteInputs;
        private final CharSequence mTitle;

        public Builder addExtras(Bundle bundle)
        {
            if (bundle != null)
            {
                mExtras.putAll(bundle);
            }
            return this;
        }

        public Builder addRemoteInput(RemoteInput remoteinput)
        {
            if (mRemoteInputs == null)
            {
                mRemoteInputs = new ArrayList();
            }
            mRemoteInputs.add(remoteinput);
            return this;
        }

        public NotificationCompat.Action build()
        {
            RemoteInput aremoteinput[];
            if (mRemoteInputs != null)
            {
                aremoteinput = (RemoteInput[])mRemoteInputs.toArray(new RemoteInput[mRemoteInputs.size()]);
            } else
            {
                aremoteinput = null;
            }
            return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput, null);
        }

        public Builder extend(Extender extender)
        {
            extender.extend(this);
            return this;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle());
        }

        private Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            mIcon = i;
            mTitle = charsequence;
            mIntent = pendingintent;
            mExtras = bundle;
        }

        public Builder(NotificationCompat.Action action)
        {
            this(action.icon, action.title, action.actionIntent, new Bundle(action.mExtras));
        }
    }

    public static interface Extender
    {

        public abstract Builder extend(Builder builder);
    }

    public static final class WearableExtender
        implements Extender
    {

        private static final int DEFAULT_FLAGS = 1;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_AVAILABLE_OFFLINE = 1;
        private static final String KEY_FLAGS = "flags";
        private int mFlags;

        private void setFlag(int i, boolean flag)
        {
            if (flag)
            {
                mFlags = mFlags | i;
                return;
            } else
            {
                mFlags = mFlags & ~i;
                return;
            }
        }

        public WearableExtender clone()
        {
            WearableExtender wearableextender = new WearableExtender();
            wearableextender.mFlags = mFlags;
            return wearableextender;
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public Builder extend(Builder builder)
        {
            Bundle bundle = new Bundle();
            if (mFlags != 1)
            {
                bundle.putInt("flags", mFlags);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        public boolean isAvailableOffline()
        {
            return (mFlags & 1) != 0;
        }

        public WearableExtender setAvailableOffline(boolean flag)
        {
            setFlag(1, flag);
            return this;
        }

        public WearableExtender()
        {
            mFlags = 1;
        }

        public WearableExtender(NotificationCompat.Action action)
        {
            mFlags = 1;
            action = action.getExtras().getBundle("android.wearable.EXTENSIONS");
            if (action != null)
            {
                mFlags = action.getInt("flags", 1);
            }
        }
    }


    public static final ion.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

        public NotificationCompat.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return new NotificationCompat.Action(i, charsequence, pendingintent, bundle, (RemoteInput[])(RemoteInput[])aremoteinput, null);
        }

        public volatile NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
        {
            return build(i, charsequence, pendingintent, bundle, aremoteinput);
        }

        public NotificationCompat.Action[] newArray(int i)
        {
            return new NotificationCompat.Action[i];
        }

        public volatile NotificationCompatBase.Action[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public PendingIntent actionIntent;
    public int icon;
    private final Bundle mExtras;
    private final RemoteInput mRemoteInputs[];
    public CharSequence title;

    protected PendingIntent getActionIntent()
    {
        return actionIntent;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    protected int getIcon()
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

    protected CharSequence getTitle()
    {
        return title;
    }



    public _cls1(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle(), null);
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[])
    {
        icon = i;
        title = charsequence;
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
}
