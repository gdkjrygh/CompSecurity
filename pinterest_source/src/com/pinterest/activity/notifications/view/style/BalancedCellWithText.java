// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Notification;
import com.pinterest.api.model.NotificationTemplate;
import com.pinterest.ui.ViewHelper;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.notifications.view.style:
//            BalancedCell

public class BalancedCellWithText extends BalancedCell
{

    private static String CONTEXT_SECTION = "context_text";
    public View _contextTextDivider;
    public TextView _contextTextTv;

    public BalancedCellWithText(Context context)
    {
        this(context, null);
    }

    public BalancedCellWithText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BalancedCellWithText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static BalancedCellWithText from(View view, ViewGroup viewgroup)
    {
        if (view instanceof BalancedCellWithText)
        {
            return (BalancedCellWithText)view;
        } else
        {
            return new BalancedCellWithText(ViewHelper.getContext(view, viewgroup));
        }
    }

    private boolean isCommentNotification()
    {
        Object obj = _notificationItem.getSection(CONTEXT_SECTION);
        if (obj == null)
        {
            return false;
        }
        obj = ModelHelper.getNotificationTemplate(((com.pinterest.api.model.Notification.NotificationSection) (obj)).getDataId()).getSubjects();
        return ((ArrayList) (obj)).size() == 1 && ((com.pinterest.api.model.NotificationTemplate.NotificationSubject)((ArrayList) (obj)).get(0)).getType() == com.pinterest.api.model.NotificationTemplate.SubjectType.COMMENT;
    }

    protected void drawTemplate()
    {
        super.drawTemplate();
        com.pinterest.api.model.Notification.NotificationSection notificationsection = _notificationItem.getSection(CONTEXT_SECTION);
        if (notificationsection != null)
        {
            showTemplate(ModelHelper.getNotificationTemplate(notificationsection.getDataId()), _contextTextTv);
        }
    }

    protected void init()
    {
        super.init();
        _contextTextTv.setVisibility(0);
        _contextTextDivider.setVisibility(0);
    }

    public void onClick(View view)
    {
        if (isCommentNotification())
        {
            view = _notificationItem.getSection("right_object");
            if (view != null)
            {
                navigateToModel(com.pinterest.api.model.Notification.DataType.PIN_COMMENT, view.getDataId());
            }
            return;
        } else
        {
            super.onClick(view);
            return;
        }
    }

}
