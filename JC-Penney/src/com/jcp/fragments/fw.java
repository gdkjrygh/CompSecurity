// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            fx, SavedCardFragment

public class fw extends SavedCardFragment.AbstractCardDetailsAdapter
{

    final SavedCardFragment b;

    public fw(SavedCardFragment savedcardfragment, List list)
    {
        b = savedcardfragment;
        super(savedcardfragment, list);
    }

    protected void a(SavedCardFragment.AbstractCardDetailsAdapter.CardDetailsViewHolder carddetailsviewholder)
    {
        carddetailsviewholder.unDefaultImage.setVisibility(0);
        carddetailsviewholder.defaultOnOff.setText(0x7f07015d);
        carddetailsviewholder.defaultOnOff.setVisibility(0);
        carddetailsviewholder.defaultImage.setVisibility(4);
    }

    protected void a(SavedCardFragment.AbstractCardDetailsAdapter.CardDetailsViewHolder carddetailsviewholder, String s)
    {
        carddetailsviewholder.unDefaultImage.setOnClickListener(new fx(this, s));
    }
}
