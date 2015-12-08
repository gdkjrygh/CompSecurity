// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.view.LayoutInflater;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

public class AddLoyaltyProgramHeaderBinder
    implements ListItemBinder
{
    final class AddLoyaltyCardHeaderDisplay extends DefaultViewHolder
    {

        final AddLoyaltyProgramHeaderBinder this$0;

        public AddLoyaltyCardHeaderDisplay()
        {
            this$0 = AddLoyaltyProgramHeaderBinder.this;
            super(com.google.android.apps.walletnfcrel.R.layout.loyalty_add_new_program_card);
        }
    }


    private final LayoutInflater layoutInflater;

    AddLoyaltyProgramHeaderBinder(LayoutInflater layoutinflater)
    {
        layoutInflater = layoutinflater;
    }

    public final void bind(int i, ViewHolder viewholder, Object obj)
    {
    }

    public final ViewHolder createDisplay()
    {
        AddLoyaltyCardHeaderDisplay addloyaltycardheaderdisplay = new AddLoyaltyCardHeaderDisplay();
        addloyaltycardheaderdisplay.createView(layoutInflater);
        return addloyaltycardheaderdisplay;
    }

    public final boolean isEnabled(Object obj)
    {
        return true;
    }
}
