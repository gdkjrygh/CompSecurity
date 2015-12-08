// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.home.view.BaseNotificationListCell;
import com.pinterest.api.model.Conversation;
import com.pinterest.base.Colors;
import com.pinterest.ui.ViewHelper;
import java.util.List;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            GroupUserImageView

public class RecentConversationCell extends BaseNotificationListCell
{

    private Conversation _conversation;
    TextView _subTitleTv;
    TextView _titleTv;
    GroupUserImageView _userImage;

    public RecentConversationCell(Context context)
    {
        this(context, null, 0);
    }

    public RecentConversationCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecentConversationCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static RecentConversationCell from(View view, Context context)
    {
        if (view instanceof RecentConversationCell)
        {
            return (RecentConversationCell)view;
        } else
        {
            return (RecentConversationCell)ViewHelper.viewById(context, 0x7f030169);
        }
    }

    private void updateView(Conversation conversation, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition)
    {
        _titleTv.setText(conversation.getConversationTitle());
        _userImage.setConversation(conversation);
        updateBackground(cellposition, 0);
        _subTitleTv.setTextColor(Colors.TEXT_LIGHT);
        cellposition = conversation.getCachedUsers();
        conversation = conversation.getCachedEmailList();
        if (cellposition.size() <= 1) goto _L2; else goto _L1
_L1:
        if (conversation == null || conversation.size() <= 0) goto _L4; else goto _L3
_L3:
        _subTitleTv.setText(0x7f0703e2);
_L6:
        return;
_L4:
        if (cellposition.size() > 2)
        {
            _subTitleTv.setText(0x7f070424);
            return;
        } else
        {
            _subTitleTv.setText(0x7f070422);
            return;
        }
_L2:
        if (conversation != null && conversation.size() > 0)
        {
            _subTitleTv.setText(0x7f070423);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Conversation getConversation()
    {
        return _conversation;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.a(this);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        _divider = findViewById(0x7f0f0348);
    }

    public void setConversation(Conversation conversation, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition)
    {
        updateView(conversation, cellposition);
        _conversation = conversation;
    }
}
