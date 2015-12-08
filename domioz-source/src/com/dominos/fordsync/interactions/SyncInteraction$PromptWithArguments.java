// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import com.dominos.android.sdk.core.models.PromptModel;

// Referenced classes of package com.dominos.fordsync.interactions:
//            SyncInteraction

public class args extends PromptModel
{

    private Object args[];
    final SyncInteraction this$0;

    public transient String getSpeech(Object aobj[])
    {
        return super.getSpeech(args);
    }

    public transient String getText(Object aobj[])
    {
        return super.getText(args);
    }

    public transient (PromptModel promptmodel, Object aobj[])
    {
        this$0 = SyncInteraction.this;
        super();
        speech = promptmodel.getSpeech(aobj);
        text = promptmodel.getText(aobj);
        args = aobj;
    }
}
