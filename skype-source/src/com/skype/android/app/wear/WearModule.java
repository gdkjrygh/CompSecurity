// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.graphics.Bitmap;
import com.skype.Conversation;

public interface WearModule
{

    public static final WearModule NULL_OBJECT = new WearModule() {

        public final void displayEmoticonPickerAndDisconnectGoogleApiClient(int i, String s, long l)
        {
        }

        public final void startRinging(Conversation conversation, Bitmap bitmap)
        {
        }

        public final void stopRinging(int i)
        {
        }

        public final void updateConversationHistory(int i, String s)
        {
        }

        public final void updateLiveCallConversation(Conversation conversation, Bitmap bitmap)
        {
        }

        public final void updateUnreadConversationCount(int i)
        {
        }

    };

    public abstract void displayEmoticonPickerAndDisconnectGoogleApiClient(int i, String s, long l);

    public abstract void startRinging(Conversation conversation, Bitmap bitmap);

    public abstract void stopRinging(int i);

    public abstract void updateConversationHistory(int i, String s);

    public abstract void updateLiveCallConversation(Conversation conversation, Bitmap bitmap);

    public abstract void updateUnreadConversationCount(int i);

}
