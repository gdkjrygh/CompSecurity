// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInputCompatApi20, RemoteInputCompatJellybean

public class RemoteInput extends RemoteInputCompatBase.RemoteInput
{
    public static final class Builder
    {

        private boolean mAllowFreeFormInput;
        private CharSequence mChoices[];
        private Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        public final Builder addExtras(Bundle bundle)
        {
            if (bundle != null)
            {
                mExtras.putAll(bundle);
            }
            return this;
        }

        public final RemoteInput build()
        {
            return new RemoteInput(mResultKey, mLabel, mChoices, mAllowFreeFormInput, mExtras);
        }

        public final Bundle getExtras()
        {
            return mExtras;
        }

        public final Builder setAllowFreeFormInput(boolean flag)
        {
            mAllowFreeFormInput = flag;
            return this;
        }

        public final Builder setChoices(CharSequence acharsequence[])
        {
            mChoices = acharsequence;
            return this;
        }

        public final Builder setLabel(CharSequence charsequence)
        {
            mLabel = charsequence;
            return this;
        }

        public Builder(String s)
        {
            mAllowFreeFormInput = true;
            mExtras = new Bundle();
            if (s == null)
            {
                throw new IllegalArgumentException("Result key can't be null");
            } else
            {
                mResultKey = s;
                return;
            }
        }
    }

    static interface Impl
    {

        public abstract void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle);

        public abstract Bundle getResultsFromIntent(Intent intent);
    }

    static class ImplApi20
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

    static class ImplBase
        implements Impl
    {

        public void addResultsToIntent(RemoteInput aremoteinput[], Intent intent, Bundle bundle)
        {
        }

        public Bundle getResultsFromIntent(Intent intent)
        {
            return null;
        }

        ImplBase()
        {
        }
    }

    static class ImplJellybean
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


    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final RemoteInputCompatBase.RemoteInput.Factory FACTORY = new _cls1();
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

    private class _cls1
        implements RemoteInputCompatBase.RemoteInput.Factory
    {

        public final RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return new RemoteInput(s, charsequence, acharsequence, flag, bundle);
        }

        public final volatile RemoteInputCompatBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
        {
            return build(s, charsequence, acharsequence, flag, bundle);
        }

        public final RemoteInput[] newArray(int i)
        {
            return new RemoteInput[i];
        }

        public final volatile RemoteInputCompatBase.RemoteInput[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
