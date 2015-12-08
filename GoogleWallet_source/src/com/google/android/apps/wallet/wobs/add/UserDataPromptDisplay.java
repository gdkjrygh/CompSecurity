// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            ValueHolder, UserDataPrompt

public abstract class UserDataPromptDisplay
    implements ValueHolder
{

    private final View groupableView;
    private UserDataPrompt prompt;

    protected UserDataPromptDisplay(View view)
    {
        groupableView = view;
    }

    public abstract View getInputView();

    public final UserDataPrompt getPrompt()
    {
        return prompt;
    }

    final com.google.android.apps.wallet.widgets.validation.ValidationGroup.Groupable getValidatedView()
    {
        return (com.google.android.apps.wallet.widgets.validation.ValidationGroup.Groupable)groupableView;
    }

    public final View getView()
    {
        return groupableView;
    }

    public final void setPrompt(UserDataPrompt userdataprompt)
    {
        prompt = userdataprompt;
    }
}
