// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PinCloseupVariantSelector extends PinCloseupBaseModule
{

    private static final Object HEADER_FOOTER = new Object();
    private String _attrKey;
    private BuyableProduct _buyableProduct;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private Map _galleryItemVariantMap;
    private VariantAttrAdapter _variantAdapter;
    RecyclerView _variantRecyclerView;

    public PinCloseupVariantSelector(Context context)
    {
        super(context);
        _eventsSubscriber = new _cls1();
    }

    private boolean hasVariantPicker()
    {
        _buyableProduct = _pin.getBuyableProduct();
        if (!BuyableProductHelper.buyableProductReady(_buyableProduct))
        {
            return false;
        }
        Object obj = _buyableProduct.getLayout();
        if (obj == null || !((com.pinterest.api.model.BuyableProduct.Layout) (obj)).isValidLayout().booleanValue())
        {
            return false;
        }
        obj = ((com.pinterest.api.model.BuyableProduct.Layout) (obj)).getAttributeName();
        Map map = _buyableProduct.getVariations();
        if (map.containsKey(obj) && ((List)map.get(obj)).size() > 1)
        {
            _attrKey = ((String) (obj));
            return true;
        } else
        {
            return false;
        }
    }

    private void initVariantPicker()
    {
        List list = (List)_buyableProduct.getVariations().get(_attrKey);
        List list2 = _buyableProduct.getVariants();
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        _galleryItemVariantMap = new HashMap();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            hashmap.put(_attrKey, obj);
            com.pinterest.api.model.BuyableProduct.Variant variant = BuyableProductHelper.getVariantForOptions(list2, hashmap, true);
            obj = variant;
            if (variant == null)
            {
                obj = BuyableProductHelper.getVariantForOptions(list2, hashmap);
            }
            if (obj != null)
            {
                arraylist.add(obj);
                List list1 = ((com.pinterest.api.model.BuyableProduct.Variant) (obj)).getImages();
                if (list1.size() > 0)
                {
                    _galleryItemVariantMap.put(list1.get(0), obj);
                }
            }
        } while (true);
        if (!_buyableProduct.getHasSwatches().booleanValue())
        {
            android.view.ViewGroup.LayoutParams layoutparams = _variantRecyclerView.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.height = (int)Resources.dimension(0x7f0a00be);
            }
        }
        _variantAdapter = new VariantAttrAdapter(arraylist, _buyableProduct.getHasSwatches().booleanValue(), _attrKey);
        _variantRecyclerView.setAdapter(_variantAdapter);
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_VARIANT_SELECTOR;
    }

    protected boolean hasContent()
    {
        return _attrKey != null;
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    protected void initView()
    {
        removeAllViews();
        Context context = getContext();
        inflate(context, 0x7f030043, this);
        ButterKnife.a(this);
        _variantRecyclerView.setHasFixedSize(true);
        _variantRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        _attrKey = null;
        setVisibility(8);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/pin/view/modules/PinCloseupGalleryModule$GalleryUpdatedEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        Events.unregister(_eventsSubscriber);
        super.onDetachedFromWindow();
    }

    protected boolean shouldUpdateView()
    {
        return _pin != null && hasVariantPicker();
    }

    protected void updateView()
    {
        if (_attrKey != null)
        {
            initVariantPicker();
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }











    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinCloseupVariantSelector this$0;

        public void onEventMainThread(com.pinterest.activity.pin.view.modules.PinCloseupGalleryModule.GalleryUpdatedEvent galleryupdatedevent)
        {
            for (galleryupdatedevent = galleryupdatedevent.getGallerySelectedItem(); _variantAdapter == null || 
// JavaClassFileOutputException: get_constant: invalid tag

        _cls1()
        {
            this$0 = PinCloseupVariantSelector.this;
            super();
        }
    }


    private class VariantAttrAdapter extends android.support.v7.widget.RecyclerView.Adapter
    {

        private static final String COLON = ":";
        private static final int HELP_TEXT_INDEX = 1;
        private static final int VIEW_TYPE_ATTR_TEXT = 2;
        private static final int VIEW_TYPE_DUMMY = 3;
        private static final int VIEW_TYPE_HELP_TEXT = 0;
        private static final int VIEW_TYPE_SWATCH = 1;
        private String _attrKey;
        private boolean _hasSwatches;
        private List _items;
        private com.pinterest.api.model.BuyableProduct.Variant _selectedVariant;
        final PinCloseupVariantSelector this$0;

        public void bind(com.pinterest.api.model.BuyableProduct.Variant variant)
        {
            _selectedVariant = variant;
            notifyDataSetChanged();
            Events.post(new VariantUpdatedEvent(_selectedVariant, 
// JavaClassFileOutputException: get_constant: invalid tag

        public void clear()
        {
            _selectedVariant = null;
            notifyDataSetChanged();
            Events.post(new VariantUpdatedEvent(null, 
// JavaClassFileOutputException: get_constant: invalid tag

        public int getItemCount()
        {
            return _items.size();
        }

        public int getItemViewType(int i)
        {
            if (_items.get(i) instanceof String)
            {
                return 0;
            }
            if (_items.get(i) == PinCloseupVariantSelector.HEADER_FOOTER)
            {
                return 3;
            }
            return !_hasSwatches ? 2 : 1;
        }

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
            {

                public VariantHelpTextView helpTextView;
                final VariantAttrAdapter this$1;
                public VariantAttrView variantAttrView;
                public View variantDummyView;
                public VariantSwatchView variantSwatchView;

                public ViewHolder(View view)
                {
                    this$1 = VariantAttrAdapter.this;
                    ViewHolder(view);
                    variantDummyView = view;
                }

                public ViewHolder(VariantAttrView variantattrview)
                {
                    this$1 = VariantAttrAdapter.this;
                    ViewHolder(variantattrview);
                    variantAttrView = variantattrview;
                }

                public ViewHolder(VariantHelpTextView varianthelptextview)
                {
                    this$1 = VariantAttrAdapter.this;
                    ViewHolder(varianthelptextview);
                    helpTextView = varianthelptextview;
                }

                public ViewHolder(VariantSwatchView variantswatchview)
                {
                    this$1 = VariantAttrAdapter.this;
                    ViewHolder(variantswatchview);
                    variantSwatchView = variantswatchview;
                }
            }

            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            final com.pinterest.api.model.BuyableProduct.Variant attrVariant;
            switch (getItemViewType(i))
            {
            default:
                return;

            case 0: // '\0'
                String s = (String)_items.get(1);
                viewholder.helpTextView.setText(s);
                return;

            case 1: // '\001'
                final com.pinterest.api.model.BuyableProduct.Variant swatchVariant = (com.pinterest.api.model.BuyableProduct.Variant)_items.get(i);
                viewholder = viewholder.variantSwatchView;
                String s1 = swatchVariant.getSwatchImage().getMediumUrl();
                class _cls1
                    implements android.view.View.OnClickListener
                {

                    final VariantAttrAdapter this$1;
                    final com.pinterest.api.model.BuyableProduct.Variant val$swatchVariant;

                    public void onClick(View view)
                    {
                        Events.post(new VariantUpdatedEvent(swatchVariant, 
// JavaClassFileOutputException: get_constant: invalid tag

                _cls1()
                {
                    this$1 = VariantAttrAdapter.this;
                    swatchVariant = variant;
                    Object();
                }
                }

                if (swatchVariant.equals(_selectedVariant))
                {
                    viewholder.bindSelected(s1);
                } else
                {
                    viewholder.bindNonSelected(s1);
                }
                viewholder.setOnClickListener(new _cls1());
                return;

            case 2: // '\002'
                attrVariant = (com.pinterest.api.model.BuyableProduct.Variant)_items.get(i);
                viewholder = viewholder.variantAttrView;
                break;
            }
            if (i == _items.size() - 2)
            {
                viewholder.removePadding();
            }
            String s2 = (String)attrVariant.getVariant().get(_attrKey);
            class _cls2
                implements android.view.View.OnClickListener
            {

                final VariantAttrAdapter this$1;
                final com.pinterest.api.model.BuyableProduct.Variant val$attrVariant;

                public void onClick(View view)
                {
                    _selectedVariant = attrVariant;
                    Events.post(new VariantUpdatedEvent(attrVariant, 
// JavaClassFileOutputException: get_constant: invalid tag

                _cls2()
                {
                    this$1 = VariantAttrAdapter.this;
                    attrVariant = variant;
                    Object();
                }
            }

            if (attrVariant.equals(_selectedVariant))
            {
                viewholder.bindSelectedText(s2);
            } else
            {
                viewholder.bindNonSelectedText(s2);
            }
            viewholder.setOnClickListener(new _cls2());
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            switch (i)
            {
            default:
                throw new IllegalStateException("View in variant picker recycler view has unknown type");

            case 0: // '\0'
                return new ViewHolder(new VariantHelpTextView(getContext()));

            case 1: // '\001'
                return new ViewHolder(new VariantSwatchView(getContext()));

            case 2: // '\002'
                return new ViewHolder(new VariantAttrView(getContext()));

            case 3: // '\003'
                return new ViewHolder(View.inflate(getContext(), 0x7f0301b5, null));
            }
        }


/*
        static com.pinterest.api.model.BuyableProduct.Variant access$202(VariantAttrAdapter variantattradapter, com.pinterest.api.model.BuyableProduct.Variant variant)
        {
            variantattradapter._selectedVariant = variant;
            return variant;
        }

*/


        public VariantAttrAdapter(List list, boolean flag, String s)
        {
            this$0 = PinCloseupVariantSelector.this;
            super();
            _items = list;
            _hasSwatches = flag;
            _attrKey = s;
            _selectedVariant = null;
            _items.add(0, PinCloseupVariantSelector.HEADER_FOOTER);
            _items.add(PinCloseupVariantSelector.HEADER_FOOTER);
            if (!_hasSwatches)
            {
                _items.add(1, (new StringBuilder()).append(BuyableProductHelper.getHeaderForAttributeName(_attrKey)).append(":").toString());
            }
        }
    }

}
