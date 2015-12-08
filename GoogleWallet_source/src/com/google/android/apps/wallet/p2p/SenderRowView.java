// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.p2p.people.ContactsUtil;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import java.util.List;

public class SenderRowView extends FrameLayout
{

    ContactsUtil contactsUtil;
    private final TextView overflowNumber;
    private final RoundedImage sender1;
    private final RoundedImage sender2;
    private final RoundedImage sender3;

    public SenderRowView(Context context)
    {
        this(context, null);
    }

    public SenderRowView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.SenderRowView);
        int i;
        if (attributeset.getBoolean(com.google.android.apps.walletnfcrel.R.styleable.SenderRowView_isLarge, false))
        {
            i = com.google.android.apps.walletnfcrel.R.layout.sender_row_view_large;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.layout.sender_row_view_small;
        }
        attributeset.recycle();
        LayoutInflater.from(context).inflate(i, this, true);
        sender1 = (RoundedImage)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Sender1);
        sender2 = (RoundedImage)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Sender2);
        sender3 = (RoundedImage)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Sender3);
        overflowNumber = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.OverflowNumber);
        UserInjector.inject(this, context);
    }

    private void setOverflowNumber(int i)
    {
        overflowNumber.setBackgroundDrawable(getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.gray_circle));
        overflowNumber.setText(getContext().getString(com.google.android.apps.walletnfcrel.R.string.claim_money_sender_overflow, new Object[] {
            Integer.valueOf(i)
        }));
        overflowNumber.setVisibility(0);
    }

    private void showSenderPhoto(List list, RoundedImage roundedimage, int i)
    {
        list = (String)list.get(i);
        list = contactsUtil.getProfilePhotoFor(list);
        roundedimage.setVisibility(0);
        roundedimage.setImage(list);
    }

    public void setSenders(List list)
    {
        sender1.setVisibility(8);
        sender2.setVisibility(8);
        sender3.setVisibility(8);
        overflowNumber.setVisibility(8);
        int i = list.size();
        switch (i)
        {
        default:
            showSenderPhoto(list, sender1, 0);
            showSenderPhoto(list, sender2, 1);
            setOverflowNumber(i - 2);
            return;

        case 3: // '\003'
            showSenderPhoto(list, sender3, 2);
            // fall through

        case 2: // '\002'
            showSenderPhoto(list, sender2, 1);
            // fall through

        case 1: // '\001'
            showSenderPhoto(list, sender1, 0);
            break;
        }
    }
}
