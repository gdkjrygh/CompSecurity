// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewUtil;
import java.util.Iterator;
import java.util.List;

public class EditModeBar extends RelativeLayout
    implements android.view.View.OnClickListener
{
    public static interface EditModeBarCallback
    {

        public abstract void onEditModeBarDismissed();

        public abstract void onEditModeBarItemClicked(View view);
    }


    private final ViewGroup buttonsContainer;
    private EditModeBarCallback callback;
    private ConversationUtil conversationUtil;
    private TextView countView;
    private int numberItemsSelected;

    public EditModeBar(Context context)
    {
        this(context, null);
    }

    public EditModeBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EditModeBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        LayoutInflater.from(getContext()).inflate(0x7f030086, this);
        countView = (TextView)ViewUtil.a(getRootView(), 0x7f10036a);
        buttonsContainer = (ViewGroup)findViewById(0x7f10036b);
        for (i = 0; i < buttonsContainer.getChildCount(); i++)
        {
            buttonsContainer.getChildAt(i).setOnClickListener(this);
        }

        findViewById(0x7f100369).setOnClickListener(this);
    }

    public void dismiss()
    {
        if (callback != null)
        {
            callback.onEditModeBarDismissed();
        }
    }

    public void init(ConversationUtil conversationutil)
    {
        conversationUtil = conversationutil;
    }

    public void onClick(View view)
    {
        if (callback != null)
        {
            callback.onEditModeBarItemClicked(view);
        }
    }

    public void onSelectedConversationListChanged(List list)
    {
        byte byte0 = 8;
        boolean flag2 = true;
        numberItemsSelected = list.size();
        if (numberItemsSelected == 0)
        {
            dismiss();
            return;
        }
        countView.setText(String.valueOf(numberItemsSelected));
        boolean flag1 = false;
        boolean flag;
        if (list.size() == 1 && conversationUtil.f(((Conversation)list.get(0)).getObjectID()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (ConversationUtil.w((Conversation)list.next()))
            {
                flag1 = true;
            }
        } while (true);
        int i;
        if (!flag1 && !flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag1 && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        list = buttonsContainer.findViewById(0x7f10036f);
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        list.setVisibility(i);
        list = buttonsContainer.findViewById(0x7f100370);
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        list.setVisibility(i);
        list = buttonsContainer.findViewById(0x7f10036c);
        i = byte0;
        if (flag)
        {
            i = 0;
        }
        list.setVisibility(i);
        if (numberItemsSelected == 0)
        {
            flag2 = false;
        }
        setEnabled(flag2);
    }

    public void setCallback(EditModeBarCallback editmodebarcallback)
    {
        callback = editmodebarcallback;
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        buttonsContainer.setEnabled(flag);
        for (int i = 0; i < buttonsContainer.getChildCount(); i++)
        {
            buttonsContainer.getChildAt(i).setEnabled(flag);
        }

    }
}
