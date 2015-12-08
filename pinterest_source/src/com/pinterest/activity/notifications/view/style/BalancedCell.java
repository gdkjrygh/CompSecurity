// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Notification;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;

// Referenced classes of package com.pinterest.activity.notifications.view.style:
//            BaseNotificationCell

public class BalancedCell extends BaseNotificationCell
    implements android.view.View.OnClickListener
{

    private static final String DATE_SECTION = "caption";
    private static final String LEFT_OBJECT = "left_object";
    private static final String MESSAGE_SECTION = "message_body";
    protected static final String RIGHT_OBJECT = "right_object";
    public TextView _captionTv;
    public GrayWebImageView _leftObjectIv;
    public TextView _messageBodyTv;
    public GrayWebImageView _rightObjectIv;

    public BalancedCell(Context context)
    {
        this(context, null);
    }

    public BalancedCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BalancedCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static BalancedCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof BalancedCell)
        {
            return (BalancedCell)view;
        } else
        {
            return new BalancedCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    protected void drawTemplate()
    {
        com.pinterest.api.model.Notification.NotificationSection notificationsection = _notificationItem.getSection("message_body");
        if (notificationsection != null)
        {
            showTemplate(ModelHelper.getNotificationTemplate(notificationsection.getDataId()), _messageBodyTv);
        }
        notificationsection = _notificationItem.getSection("right_object");
        if (notificationsection != null)
        {
            showModel(notificationsection.getDataType(), _rightObjectIv, notificationsection.getDataId());
        }
        notificationsection = _notificationItem.getSection("caption");
        if (notificationsection != null)
        {
            showDate(notificationsection.getDataId(), _captionTv);
        }
        notificationsection = _notificationItem.getSection("left_object");
        if (notificationsection != null)
        {
            showModel(notificationsection.getDataType(), _leftObjectIv, notificationsection.getDataId());
        }
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030181, this);
        ButterKnife.a(this);
        _leftObjectIv.setOval(true);
        _messageBodyTv.setMovementMethod(LinkMovementMethod.getInstance());
        setOnClickListener(this);
        _messageBodyTv.setOnClickListener(this);
        _captionTv.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        view = _notificationItem.getSection("right_object");
        if (view != null)
        {
            navigateToModel(view.getDataType(), view.getDataId());
        }
    }
}
