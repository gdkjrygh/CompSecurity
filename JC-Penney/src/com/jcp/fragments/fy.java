// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment

class fy extends SavedCardFragment.AbstractCardDetailsAdapter
{

    final SavedCardFragment b;

    public fy(SavedCardFragment savedcardfragment)
    {
        b = savedcardfragment;
        super(savedcardfragment, SavedCardFragment.a(savedcardfragment));
    }

    protected void a(SavedCardFragment.AbstractCardDetailsAdapter.CardDetailsViewHolder carddetailsviewholder)
    {
        carddetailsviewholder.unDefaultImage.setVisibility(4);
        carddetailsviewholder.defaultOnOff.setText(0x7f07015e);
        carddetailsviewholder.defaultOnOff.setVisibility(0);
        carddetailsviewholder.defaultImage.setVisibility(0);
    }

    protected void a(SavedCardFragment.AbstractCardDetailsAdapter.CardDetailsViewHolder carddetailsviewholder, String s)
    {
    }
}
