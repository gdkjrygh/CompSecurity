// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.common.primitives.Ints;

public final class LocalPromptId
{

    private static final int SHOULD_TRANSLATE[] = {
        1, 7, 9, 6, 8
    };

    public static int translateToLocalIdIfNecessary(com.google.wallet.proto.api.NanoWalletWobForms.LinkPrompt linkprompt)
    {
        if (Ints.contains(SHOULD_TRANSLATE, linkprompt.promptId.intValue()))
        {
            return 0 - linkprompt.promptId.intValue();
        } else
        {
            return linkprompt.promptId.intValue();
        }
    }

}
