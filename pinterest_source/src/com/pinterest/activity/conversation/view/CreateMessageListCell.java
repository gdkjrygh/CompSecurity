// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.home.view.BaseNotificationListCell;
import com.pinterest.ui.ViewHelper;

public class CreateMessageListCell extends BaseNotificationListCell
{

    public CreateMessageListCell(Context context)
    {
        this(context, null, 0);
    }

    public CreateMessageListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CreateMessageListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static CreateMessageListCell from(View view, Context context)
    {
        if (view instanceof CreateMessageListCell)
        {
            return (CreateMessageListCell)view;
        } else
        {
            return (CreateMessageListCell)ViewHelper.viewById(context, 0x7f030150);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
    }
}
