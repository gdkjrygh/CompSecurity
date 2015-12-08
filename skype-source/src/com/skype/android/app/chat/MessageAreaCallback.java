// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import java.util.List;

public interface MessageAreaCallback
{

    public abstract List getAvailableSmsTargets();

    public abstract int getSelectedSmsTarget();

    public abstract String getSmsPrice();

    public abstract void hidePicker();

    public abstract boolean isPickerShowing();

    public abstract boolean needsBottomSpacing();

    public abstract void onKeyboardDismissed();

    public abstract void onMessageAreaFocused(boolean flag);

    public abstract void onMessageAreaTextChanged(CharSequence charsequence);

    public abstract void sendText(CharSequence charsequence);

    public abstract void setSmsRecipientPhone(String s);

    public abstract void showEmoticonPicker();
}
