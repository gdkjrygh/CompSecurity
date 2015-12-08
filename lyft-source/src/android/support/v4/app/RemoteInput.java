// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;

public class RemoteInput extends RemoteInputCompatBase.RemoteInput
{

    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY = new RemoteInputCompatBase.RemoteInput.Factory() {

        public RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return new RemoteInput(s, charsequence, acharsequence, flag, bundle);
        }

        public volatile RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return build(s, charsequence, acharsequence, flag, bundle);
        }

        public RemoteInput[] newArray(int i)
        {
            return new RemoteInput[i];
        }

        public volatile RemoteInputCompatBase.RemoteInput[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final Impl IMPL;
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    private static final String TAG = "RemoteInput";
    private final boolean mAllowFreeFormInput;
    private final CharSequence mChoices[];
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    RemoteInput(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        mResultKey = s;
        mLabel = charsequence;
        mChoices = acharsequence;
        mAllowFreeFormInput = flag;
        mExtras = bundle;
    }

    public static void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
    {
        IMPL.addResultsToIntent(aremoteinput, intent, bundle);
    }

    public static Bundle getResultsFromIntent(Intent intent)
    {
        return IMPL.getResultsFromIntent(intent);
    }

    public boolean getAllowFreeFormInput()
    {
        return mAllowFreeFormInput;
    }

    public CharSequence[] getChoices()
    {
        return mChoices;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public CharSequence getLabel()
    {
        return mLabel;
    }

    public String getResultKey()
    {
        return mResultKey;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new ImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new ImplJellybean();
        } else
        {
            IMPL = new ImplBase();
        }
    }

    private class Impl
    {

        public abstract void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle);

        public abstract Bundle getResultsFromIntent(Intent intent);
    }


    private class ImplApi20
        implements Impl
    {

        public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
        {
            RemoteInputCompatApi20.addResultsToIntent(aremoteinput, intent, bundle);
        }

        public Bundle getResultsFromIntent(Intent intent)
        {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }

        ImplApi20()
        {
        }
    }


    private class ImplJellybean
        implements Impl
    {

        public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
        {
            RemoteInputCompatJellybean.addResultsToIntent(aremoteinput, intent, bundle);
        }

        public Bundle getResultsFromIntent(Intent intent)
        {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        ImplJellybean()
        {
        }
    }


    private class ImplBase
        implements Impl
    {

        public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
        {
            Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
        }

        public Bundle getResultsFromIntent(Intent intent)
        {
            Log.w("RemoteInput", "RemoteInput is only supported from API Level 16");
            return null;
        }

        ImplBase()
        {
        }
    }

}
