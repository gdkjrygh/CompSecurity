// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.RemoteInput;

public class LocalizableRemoteInput
{
    public static final class Builder
    {

        private boolean allowFreeFormInput;
        private int choices[];
        private Bundle extras;
        private int labelId;
        private final String resultKey;

        public Builder addExtras(Bundle bundle)
        {
            if (bundle != null)
            {
                extras.putAll(bundle);
            }
            return this;
        }

        public LocalizableRemoteInput build()
        {
            return new LocalizableRemoteInput(resultKey, labelId, choices, allowFreeFormInput, extras);
        }

        public Builder setAllowFreeFormInput(boolean flag)
        {
            allowFreeFormInput = flag;
            return this;
        }

        public Builder setChoices(int ai[])
        {
            choices = ai;
            return this;
        }

        public Builder setLabel(int i)
        {
            labelId = i;
            return this;
        }

        public Builder(String s)
        {
            extras = new Bundle();
            allowFreeFormInput = false;
            if (s == null)
            {
                throw new IllegalArgumentException("Result key can't be null");
            } else
            {
                resultKey = s;
                return;
            }
        }
    }


    private final boolean allowFreeFormInput;
    private final int choices[];
    private final Bundle extras;
    private final int labelId;
    private final String resultKey;

    private LocalizableRemoteInput(String s, int i, int ai[], boolean flag, Bundle bundle)
    {
        resultKey = s;
        labelId = i;
        choices = ai;
        allowFreeFormInput = flag;
        extras = bundle;
    }


    public RemoteInput createRemoteInput(Context context)
    {
        android.support.v4.app.RemoteInput.Builder builder = (new android.support.v4.app.RemoteInput.Builder(resultKey)).addExtras(extras);
        if (choices != null)
        {
            CharSequence acharsequence[] = new CharSequence[choices.length];
            for (int i = 0; i < choices.length; i++)
            {
                acharsequence[i] = context.getText(choices[i]);
            }

            builder.setChoices(acharsequence);
        }
        if (labelId >= 0)
        {
            builder.setLabel(context.getText(labelId));
        }
        return builder.build();
    }

    public boolean getAllowFreeFormInput()
    {
        return allowFreeFormInput;
    }

    public int[] getChoices()
    {
        return choices;
    }

    public Bundle getExtras()
    {
        return extras;
    }

    public int getLabel()
    {
        return labelId;
    }

    public String getResultKey()
    {
        return resultKey;
    }
}
