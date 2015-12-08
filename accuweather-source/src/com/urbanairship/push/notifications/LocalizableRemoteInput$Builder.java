// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.os.Bundle;

// Referenced classes of package com.urbanairship.push.notifications:
//            LocalizableRemoteInput

public static final class resultKey
{

    private boolean allowFreeFormInput;
    private int choices[];
    private Bundle extras;
    private int labelId;
    private final String resultKey;

    public resultKey addExtras(Bundle bundle)
    {
        if (bundle != null)
        {
            extras.putAll(bundle);
        }
        return this;
    }

    public LocalizableRemoteInput build()
    {
        return new LocalizableRemoteInput(resultKey, labelId, choices, allowFreeFormInput, extras, null);
    }

    public extras setAllowFreeFormInput(boolean flag)
    {
        allowFreeFormInput = flag;
        return this;
    }

    public allowFreeFormInput setChoices(int ai[])
    {
        choices = ai;
        return this;
    }

    public choices setLabel(int i)
    {
        labelId = i;
        return this;
    }

    public (String s)
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
