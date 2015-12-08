// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import com.google.android.gms.common.api.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ChainableCompletionCallback
    implements CompletionWearCommand.CompletionCallback
{

    private List nextCallback;

    public ChainableCompletionCallback()
    {
        nextCallback = new ArrayList();
    }

    public void onError(g g)
    {
        for (Iterator iterator = nextCallback.iterator(); iterator.hasNext(); ((CompletionWearCommand.CompletionCallback)iterator.next()).onError(g)) { }
    }

    public void onResult(g g)
    {
        for (Iterator iterator = nextCallback.iterator(); iterator.hasNext(); ((CompletionWearCommand.CompletionCallback)iterator.next()).onResult(g)) { }
    }

    public ChainableCompletionCallback then(CompletionWearCommand.CompletionCallback completioncallback)
    {
        nextCallback.add(completioncallback);
        return this;
    }
}
