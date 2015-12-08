// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.os.Bundle;
import com.skype.Conversation;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;

public class MediaPickerSearchActivity extends SkypeActivity
{

    private static final int REQUEST_LAUNCH_PROFILE = 2;
    ActionBarCustomizer actionBarCustomizer;
    private Conversation conversation;

    public MediaPickerSearchActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitleFromConversation(conversation, true, true, 2, false);
    }
}
