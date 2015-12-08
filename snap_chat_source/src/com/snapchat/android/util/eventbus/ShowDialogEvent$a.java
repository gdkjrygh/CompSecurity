// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            ShowDialogEvent

public static final class mDialogType
{

    private alogType mDialogType;
    public String mMessage;
    public int mMessageResId;
    public int mNoButtonResId;
    public android.content.ClickListener mOnClickListener;
    public int mTitleResId;
    public int mYesButtonResId;
    public com.snapchat.android.util. mYesNoAlertListener;

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

    public alogType(alogType alogtype)
    {
        mYesButtonResId = 0x7f080323;
        mNoButtonResId = 0x7f080196;
        mDialogType = alogtype;
    }
}
