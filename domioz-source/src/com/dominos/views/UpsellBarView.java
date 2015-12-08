// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.FrameLayout;
import com.dominos.MobileSession;
import com.dominos.adapters.UpsellBarAdapter;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            HorizontalListView

public class UpsellBarView extends FrameLayout
{

    private static final String TAG = com/dominos/views/UpsellBarView.getSimpleName();
    private OnUpsellBarClickedListener listener;
    HorizontalListView mDrinkListView;
    MobileSession mMobileSession;
    private ProductWizardManager mProductWizardManager;

    public UpsellBarView(Context context)
    {
        super(context);
    }

    public void bind(final List products, final OnUpsellBarClickedListener upsellBarClickedListener)
    {
        UpsellBarAdapter upsellbaradapter = new UpsellBarAdapter(getContext());
        mDrinkListView.setAdapter(upsellbaradapter);
        upsellbaradapter.updateList(products);
        mDrinkListView.setOnItemClickListener(new _cls1());
        upsellbaradapter.notifyDataSetChanged();
        FontManager.applyDominosFont(this);
    }

    protected void onAfterInject()
    {
        mProductWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }


    private class _cls1
        implements HorizontalListView.OnItemClickListener
    {

        final UpsellBarView this$0;
        final List val$products;
        final OnUpsellBarClickedListener val$upsellBarClickedListener;

        public void onItemClick(View view, int i)
        {
            upsellBarClickedListener.onUpsellBarItemClicked(i, products);
        }

        _cls1()
        {
            this$0 = UpsellBarView.this;
            upsellBarClickedListener = onupsellbarclickedlistener;
            products = list;
            super();
        }

        private class OnUpsellBarClickedListener
        {

            public abstract void onUpsellBarItemClicked(int i, List list);
        }

    }

}
