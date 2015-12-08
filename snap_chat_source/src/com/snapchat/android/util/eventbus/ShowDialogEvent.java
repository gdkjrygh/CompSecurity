// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class ShowDialogEvent
{
    public static final class DialogType extends Enum
    {

        private static final DialogType $VALUES[];
        public static final DialogType ONE_BUTTON;
        public static final DialogType ONE_BUTTON_SC_DIALOG;
        public static final DialogType TOAST;
        public static final DialogType YES_NO_DIALOG;
        public static final DialogType YES_NO_DONTASK_DIALOG;
        public static final DialogType YES_NO_SC_DIALOG;

        public static DialogType valueOf(String s)
        {
            return (DialogType)Enum.valueOf(com/snapchat/android/util/eventbus/ShowDialogEvent$DialogType, s);
        }

        public static DialogType[] values()
        {
            return (DialogType[])$VALUES.clone();
        }

        static 
        {
            TOAST = new DialogType("TOAST", 0);
            ONE_BUTTON = new DialogType("ONE_BUTTON", 1);
            YES_NO_DIALOG = new DialogType("YES_NO_DIALOG", 2);
            YES_NO_DONTASK_DIALOG = new DialogType("YES_NO_DONTASK_DIALOG", 3);
            ONE_BUTTON_SC_DIALOG = new DialogType("ONE_BUTTON_SC_DIALOG", 4);
            YES_NO_SC_DIALOG = new DialogType("YES_NO_SC_DIALOG", 5);
            $VALUES = (new DialogType[] {
                TOAST, ONE_BUTTON, YES_NO_DIALOG, YES_NO_DONTASK_DIALOG, ONE_BUTTON_SC_DIALOG, YES_NO_SC_DIALOG
            });
        }

        private DialogType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a
    {

        private DialogType mDialogType;
        public String mMessage;
        public int mMessageResId;
        public int mNoButtonResId;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public int mTitleResId;
        public int mYesButtonResId;
        public com.snapchat.android.util.AlertDialogUtils.a mYesNoAlertListener;

        public final ShowDialogEvent a()
        {
            ShowDialogEvent showdialogevent = new ShowDialogEvent(mDialogType, mMessageResId);
            showdialogevent.message = mMessage;
            showdialogevent.titleResId = mTitleResId;
            showdialogevent.yesButtonResId = mYesButtonResId;
            showdialogevent.noButtonResId = mNoButtonResId;
            showdialogevent.yesNoAlertListener = mYesNoAlertListener;
            showdialogevent.onClickListener = mOnClickListener;
            return showdialogevent;
        }

        public a(DialogType dialogtype)
        {
            mYesButtonResId = 0x7f080323;
            mNoButtonResId = 0x7f080196;
            mDialogType = dialogtype;
        }
    }


    public DialogType dialogType;
    public String message;
    public int noButtonResId;
    public android.content.DialogInterface.OnClickListener onClickListener;
    public int stringResId;
    public int titleResId;
    public int yesButtonResId;
    public com.snapchat.android.util.AlertDialogUtils.a yesNoAlertListener;

    public ShowDialogEvent(DialogType dialogtype, int i)
    {
        stringResId = i;
        dialogType = dialogtype;
    }

    public ShowDialogEvent(DialogType dialogtype, String s)
    {
        message = s;
        dialogType = dialogtype;
    }
}
