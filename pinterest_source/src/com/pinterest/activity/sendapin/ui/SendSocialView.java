// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.base.SocialUtils;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.listview.ListCellBasic;
import java.util.Iterator;
import java.util.List;

public class SendSocialView extends FrameLayout
{

    LinearLayout _container;

    public SendSocialView(Context context)
    {
        this(context, null);
    }

    public SendSocialView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public void addChannel(final com.pinterest.adapter.IconTextListAdapter.IconText app)
    {
        ListCellBasic listcellbasic = new ListCellBasic(getContext());
        listcellbasic.setImageBorderStyle(com.pinterest.ui.imageview.GrayWebImageView.BorderStyle.TRANSPARENT);
        listcellbasic.setText(Resources.string(0x7f070511, new Object[] {
            app.text
        }));
        listcellbasic.setImage(app.icon);
        listcellbasic.setDividerVisibility(0);
        listcellbasic.setOnClickListener(new _cls1());
        _container.addView(listcellbasic);
    }

    public void addChannels(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                addChannel((com.pinterest.adapter.IconTextListAdapter.IconText)list.next());
            }
        }
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030133, this);
        ButterKnife.a(this);
        addChannels(SocialUtils.getAppListForSend());
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SendSocialView this$0;
        final com.pinterest.adapter.IconTextListAdapter.IconText val$app;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SEND_SOCIAL_BUTTON, null, app.meta);
            Events.post(new SendSocialEvent(app.text, app.meta));
        }

        _cls1()
        {
            this$0 = SendSocialView.this;
            app = icontext;
            super();
        }

        private class SendSocialEvent
        {

            String packageName;
            String text;
            final SendSocialView this$0;

            public SendSocialEvent(String s, String s1)
            {
                this$0 = SendSocialView.this;
                super();
                text = s;
                packageName = s1;
            }
        }

    }

}
