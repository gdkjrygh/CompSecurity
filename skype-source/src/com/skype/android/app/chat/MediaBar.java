// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import java.util.BitSet;

public class MediaBar extends HorizontalScrollView
    implements android.view.View.OnClickListener
{
    public static interface MediaBarCallback
    {

        public abstract void onMediaBarItemClicked(View view);
    }


    private final ViewGroup buttonsContainer;
    private MediaBarCallback callback;

    public MediaBar(Context context)
    {
        this(context, null);
    }

    public MediaBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MediaBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        LayoutInflater.from(getContext()).inflate(0x7f0300a8, this);
        buttonsContainer = (ViewGroup)findViewById(0x7f100401);
        for (i = 0; i < buttonsContainer.getChildCount(); i++)
        {
            buttonsContainer.getChildAt(i).setOnClickListener(this);
        }

    }

    private void setButtonVisibility(int i, boolean flag)
    {
        View view = buttonsContainer.findViewById(i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public View getButton(int i)
    {
        return buttonsContainer.findViewById(i);
    }

    public void onClick(View view)
    {
        if (callback != null)
        {
            callback.onMediaBarItemClicked(view);
        }
    }

    public void setCallback(MediaBarCallback mediabarcallback)
    {
        callback = mediabarcallback;
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        for (int i = 0; i < buttonsContainer.getChildCount(); i++)
        {
            buttonsContainer.getChildAt(i).setEnabled(flag);
        }

    }

    public void update(BitSet bitset)
    {
        boolean flag4 = true;
        boolean flag1 = false;
        setButtonVisibility(0x7f100402, bitset.get(0));
        setButtonVisibility(0x7f100405, bitset.get(1));
        setButtonVisibility(0x7f100406, bitset.get(6));
        boolean flag3 = flag4;
        int i;
        boolean flag2;
        if (!bitset.get(3))
        {
            if (bitset.get(4))
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
        }
        setButtonVisibility(0x7f100404, flag3);
        setButtonVisibility(0x7f100403, bitset.get(5));
        flag2 = false;
        i = 0;
        do
        {
label0:
            {
                boolean flag = flag2;
                if (i < buttonsContainer.getChildCount())
                {
                    if (buttonsContainer.getChildAt(i).getVisibility() != 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (flag)
                {
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                setVisibility(i);
                return;
            }
            i++;
        } while (true);
    }
}
