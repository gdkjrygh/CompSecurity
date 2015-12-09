// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            UpdateDialog

public static class ams
{

    private ams params;

    public UpdateDialog create()
    {
        UpdateDialog updatedialog = new UpdateDialog(params.mContext);
        updatedialog.setCancelable(params.mCancelable);
        updatedialog.setOnCancelListener(params.mOnCancelListener);
        updatedialog.setOnKeyListener(params.mOnKeyListener);
        if (params.mTitle != null)
        {
            updatedialog.setTitle(params.mTitle);
        }
        if (params.mIcon != null)
        {
            updatedialog.setIcon(params.mIcon);
        }
        if (params.mIconId >= 0)
        {
            updatedialog.setIcon(params.mIconId);
        }
        if (params.mMessage != null)
        {
            updatedialog.setMessage(params.mMessage);
        }
        if (params.mPositiveButtonText != null)
        {
            updatedialog.setButton(-1, params.mPositiveButtonText, params.mPositiveButtonListener);
        }
        if (params.mNegativeButtonText != null)
        {
            updatedialog.setButton(-2, params.mNegativeButtonText, params.mNegativeButtonListener);
        }
        return updatedialog;
    }

    public ams.mNegativeButtonListener setCancelable(boolean flag)
    {
        params.mCancelable = flag;
        return this;
    }

    public ams.mCancelable setIcon(int i)
    {
        params.mIconId = i;
        return this;
    }

    public ams.mIconId setIcon(Drawable drawable)
    {
        params.mIcon = drawable;
        return this;
    }

    public ams.mIcon setMessage(int i)
    {
        params.mMessage = params.mContext.getText(i);
        return this;
    }

    public ams.mContext setMessage(CharSequence charsequence)
    {
        params.mMessage = charsequence;
        return this;
    }

    public ams.mMessage setNegativeButton(int i, android.content.ckListener cklistener)
    {
        params.mNegativeButtonText = params.mContext.getText(i);
        params.mNegativeButtonListener = cklistener;
        return this;
    }

    public ams.mNegativeButtonListener setNegativeButton(CharSequence charsequence, android.content.ckListener cklistener)
    {
        params.mNegativeButtonText = charsequence;
        params.mNegativeButtonListener = cklistener;
        return this;
    }

    public ams.mNegativeButtonListener setOnCancelListener(android.content.celListener cellistener)
    {
        params.mOnCancelListener = cellistener;
        return this;
    }

    public ams.mOnCancelListener setOnKeyListener(android.content.Listener listener)
    {
        params.mOnKeyListener = listener;
        return this;
    }

    public ams.mOnKeyListener setPositiveButton(int i, android.content.ckListener cklistener)
    {
        params.mPositiveButtonText = params.mContext.getText(i);
        params.mPositiveButtonListener = cklistener;
        return this;
    }

    public ams.mPositiveButtonListener setPositiveButton(CharSequence charsequence, android.content.ckListener cklistener)
    {
        params.mPositiveButtonText = charsequence;
        params.mPositiveButtonListener = cklistener;
        return this;
    }

    public ams.mPositiveButtonListener setTitle(int i)
    {
        params.mTitle = params.mContext.getText(i);
        return this;
    }

    public ams.mContext setTitle(CharSequence charsequence)
    {
        params.mTitle = charsequence;
        return this;
    }

    public AlertDialog show()
    {
        UpdateDialog updatedialog = create();
        updatedialog.show();
        return updatedialog;
    }

    public ams(Context context)
    {
        params = new ams(context, null);
    }
}
