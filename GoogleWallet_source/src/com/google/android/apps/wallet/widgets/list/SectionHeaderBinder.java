// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.base.view.ViewHolder;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            ListItemBinder

public class SectionHeaderBinder
    implements ListItemBinder
{
    static final class HeaderDisplay extends DefaultViewHolder
    {

        public final void setText(String s)
        {
            ((TextView)getView()).setText(s);
        }

        public final void setView(View view)
        {
            super.setView(view);
        }

        protected HeaderDisplay()
        {
            super(com.google.android.apps.walletnfcrel.R.layout.subheader);
        }
    }


    private final LayoutInflater mLayoutInflater;

    public SectionHeaderBinder(LayoutInflater layoutinflater)
    {
        mLayoutInflater = layoutinflater;
    }

    private static void bind(int i, ViewHolder viewholder, String s)
    {
        viewholder = (HeaderDisplay)viewholder;
        if (s == null)
        {
            viewholder.getView().setVisibility(8);
            return;
        } else
        {
            viewholder.getView().setVisibility(0);
            viewholder.setText(s);
            return;
        }
    }

    private static boolean isEnabled(String s)
    {
        return false;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (String)obj);
    }

    public final ViewHolder createDisplay()
    {
        HeaderDisplay headerdisplay = new HeaderDisplay();
        headerdisplay.createView(mLayoutInflater);
        return headerdisplay;
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((String)obj);
    }
}
