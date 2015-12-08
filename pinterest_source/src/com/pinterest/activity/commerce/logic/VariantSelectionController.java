// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.pinterest.activity.commerce.event.VariantSelectedEvent;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.VariantSelectionView;
import com.pinterest.activity.commerce.viewmodel.VariantRowItem;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class VariantSelectionController
{

    private boolean animationInProgress;
    private BuyableProduct buyableProduct;
    private Context context;
    private String currentAttribute;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    private OnSelectedOptionsUpdatedListener onSelectedOptionsUpdatedListener;
    private OnVariantSelectedListener onVariantSelectedListener;
    private Stack selectedAttributeHistory;
    private Map selectedOptions;
    private com.pinterest.api.model.BuyableProduct.Variant selectedVariant;
    private List sortedAttributes;
    private FrameLayout variantContainer;
    private String variantViewHeader;
    private List variantViewRowItems;
    private boolean variantViewShowPrices;
    private com.pinterest.activity.commerce.view.VariantSelectionView.ViewType variantViewType;

    public VariantSelectionController()
    {
        eventsSubscriber = new _cls2();
        selectedOptions = new HashMap(BuyableProductHelper.NUM_ATTRIBUTES);
        selectedAttributeHistory = new Stack();
    }

    private VariantSelectionView createVariantSelectionView()
    {
        VariantSelectionView variantselectionview = new VariantSelectionView(context, variantViewType, variantViewShowPrices);
        variantselectionview.addItems(variantViewRowItems);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutparams.leftMargin = (int)Resources.dimension(0x7f0a015f);
        layoutparams.rightMargin = (int)Resources.dimension(0x7f0a015f);
        variantselectionview.setLayoutParams(layoutparams);
        variantselectionview.setHeader(variantViewHeader);
        return variantselectionview;
    }

    private void handleVariantSelectionAnimation(boolean flag)
    {
        animationInProgress = true;
        final View currentVariantView = variantContainer.getChildAt(0);
        float f;
        android.animation.ObjectAnimator objectanimator;
        Object obj;
        AnimatorSet animatorset;
        if (flag)
        {
            f = -Device.getScreenWidth();
        } else
        {
            f = Device.getScreenWidth();
        }
        objectanimator = AnimationUtils.springAnimate(currentVariantView, "translationX", 0.0F, f, 0.75F, 0.25F);
        obj = createVariantSelectionView();
        variantContainer.addView(((View) (obj)));
        if (flag)
        {
            f = Device.getScreenWidth();
        } else
        {
            f = -Device.getScreenWidth();
        }
        obj = AnimationUtils.springAnimate(((View) (obj)), "translationX", f, 0.0F, 0.75F, 0.25F);
        animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, obj
        });
        animatorset.addListener(new _cls1());
        animatorset.start();
    }

    private boolean moveToNextAttribute()
    {
        if (currentAttribute == null)
        {
            currentAttribute = (String)sortedAttributes.get(0);
        } else
        {
            int j = sortedAttributes.indexOf(currentAttribute);
            int i = j;
            if (j + 1 >= sortedAttributes.size())
            {
                notifyListener();
                return false;
            }
            do
            {
                if (i + 1 >= sortedAttributes.size())
                {
                    break;
                }
                List list = sortedAttributes;
                i++;
                currentAttribute = (String)list.get(i);
                list = BuyableProductHelper.getAttributeOptionsForAttributeName(buyableProduct, currentAttribute, selectedOptions, true);
                if (list.size() != 1)
                {
                    break;
                }
                selectedOptions.put(currentAttribute, list.get(0));
                selectedAttributeHistory.add(new AttributeHistory(currentAttribute, true));
            } while (true);
            List list1 = BuyableProductHelper.getVariantItemsForOptions(buyableProduct, selectedOptions);
            if (list1.size() == 1)
            {
                selectedVariant = (com.pinterest.api.model.BuyableProduct.Variant)list1.get(0);
                notifyListener();
                return false;
            }
        }
        notifyListener();
        selectedAttributeHistory.add(new AttributeHistory(currentAttribute, false));
        updateVariantData();
        return true;
    }

    private boolean moveToPreviousAttribute()
    {
        AttributeHistory attributehistory;
        do
        {
            attributehistory = (AttributeHistory)selectedAttributeHistory.pop();
            selectedOptions.remove(attributehistory.attributeName);
            if (selectedAttributeHistory.empty())
            {
                return false;
            }
            attributehistory = (AttributeHistory)selectedAttributeHistory.peek();
        } while (attributehistory.addedByIntentOrDefault);
        currentAttribute = attributehistory.attributeName;
        selectedOptions.remove(currentAttribute);
        selectedVariant = null;
        notifyListener();
        updateVariantData();
        return true;
    }

    private void notifyListener()
    {
        if (onSelectedOptionsUpdatedListener != null)
        {
            onSelectedOptionsUpdatedListener.onSelectedOptionsUpdated(selectedOptions);
        }
        if (selectedVariant != null && onVariantSelectedListener != null)
        {
            onVariantSelectedListener.onVariantSelectedListener(selectedVariant);
        }
    }

    private void updateVariantData()
    {
        variantViewRowItems = new ArrayList();
        List list = BuyableProductHelper.getAttributeOptionsForAttributeName(buyableProduct, currentAttribute, selectedOptions);
        HashSet hashset = new HashSet();
        boolean flag;
        boolean flag1;
        int i;
        int j;
        if (sortedAttributes.size() - 1 == selectedOptions.size())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = list.size();
        i = 0;
        flag = false;
        while (i < j) 
        {
            String s = (String)list.get(i);
            HashMap hashmap = new HashMap(selectedOptions);
            hashmap.put(currentAttribute, s);
            String s1 = BuyableProductHelper.getDisplayPriceForOptions(buyableProduct, hashmap);
            hashset.add(s1);
            Object obj = BuyableProductHelper.getVariantForOptions(buyableProduct.getVariants(), hashmap, true);
            boolean flag2;
            if (obj != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!flag1)
            {
                obj = null;
            }
            obj = new VariantRowItem(s, s1, flag2, hashmap, ((com.pinterest.api.model.BuyableProduct.Variant) (obj)));
            variantViewRowItems.add(obj);
            if (s.length() > 3)
            {
                flag = true;
            }
            i++;
        }
        if (hashset.size() > 1)
        {
            variantViewShowPrices = true;
        }
        com.pinterest.activity.commerce.view.VariantSelectionView.ViewType viewtype;
        if (variantViewShowPrices || flag)
        {
            viewtype = com.pinterest.activity.commerce.view.VariantSelectionView.ViewType.List;
        } else
        {
            viewtype = com.pinterest.activity.commerce.view.VariantSelectionView.ViewType.Grid;
        }
        variantViewType = viewtype;
        variantViewHeader = BuyableProductHelper.getHeaderForAttributeName(currentAttribute);
    }

    public com.pinterest.api.model.BuyableProduct.Variant getSelectedVariant()
    {
        return selectedVariant;
    }

    public FrameLayout getVariantContainer(Context context1)
    {
        if (variantContainer == null)
        {
            variantContainer = new FrameLayout(context1);
            variantContainer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            variantContainer.addView(createVariantSelectionView());
        }
        return variantContainer;
    }

    public boolean hasSelectionHistory()
    {
        for (Iterator iterator = selectedAttributeHistory.iterator(); iterator.hasNext();)
        {
            if (!((AttributeHistory)iterator.next()).addedByIntentOrDefault)
            {
                return true;
            }
        }

        return false;
    }

    public boolean init(String s)
    {
        sortedAttributes = BuyableProductHelper.sortAttributeNames(buyableProduct.getVariations());
        if (sortedAttributes.size() == 0)
        {
            s = buyableProduct.getVariants();
            if (s == null || s.isEmpty())
            {
                throw new IllegalStateException("There needs to be at least one variant.");
            } else
            {
                selectedVariant = (com.pinterest.api.model.BuyableProduct.Variant)s.get(0);
                return false;
            }
        }
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            selectedOptions.put("colors", s);
            selectedAttributeHistory.add(new AttributeHistory("colors", true));
            currentAttribute = "colors";
            flag = true;
        } else
        {
            flag = false;
        }
        s = sortedAttributes.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = (String)s.next();
            if (selectedOptions.containsKey(s1))
            {
                continue;
            }
            List list = BuyableProductHelper.getAttributeOptionsForAttributeName(buyableProduct, s1, selectedOptions, true);
            if (list.size() != 1)
            {
                break;
            }
            selectedOptions.put(s1, list.get(0));
            selectedAttributeHistory.add(new AttributeHistory(s1, true));
            currentAttribute = s1;
            flag = true;
        } while (true);
        if (flag)
        {
            s = BuyableProductHelper.getVariantItemsForOptions(buyableProduct, selectedOptions);
            if (s.size() == 1)
            {
                selectedVariant = (com.pinterest.api.model.BuyableProduct.Variant)s.get(0);
                return false;
            }
        }
        moveToNextAttribute();
        return true;
    }

    public void onActivate()
    {
        Events.register(eventsSubscriber, com/pinterest/activity/commerce/event/VariantSelectedEvent, new Class[0]);
    }

    public boolean onBackPressed()
    {
        if (animationInProgress)
        {
            return true;
        }
        if (!hasSelectionHistory())
        {
            return false;
        }
        if (moveToPreviousAttribute())
        {
            handleVariantSelectionAnimation(false);
            return true;
        } else
        {
            return false;
        }
    }

    public void onDeactivate()
    {
        Events.unregister(eventsSubscriber);
    }

    public void onDestroy()
    {
    }

    public void onDestroyView()
    {
        buyableProduct = null;
        variantContainer = null;
        context = null;
    }

    public void onViewCreated(Context context1, BuyableProduct buyableproduct)
    {
        context = context1;
        buyableProduct = buyableproduct;
    }

    public void resetSelectedOptionForCurrentAttribute()
    {
        AttributeHistory attributehistory = (AttributeHistory)selectedAttributeHistory.peek();
        do
        {
            if (attributehistory == null || !attributehistory.addedByIntentOrDefault)
            {
                break;
            }
            attributehistory = (AttributeHistory)selectedAttributeHistory.pop();
            selectedOptions.remove(attributehistory.attributeName);
            if (selectedAttributeHistory.empty())
            {
                break;
            }
            attributehistory = (AttributeHistory)selectedAttributeHistory.peek();
            currentAttribute = attributehistory.attributeName;
        } while (true);
        selectedVariant = null;
        notifyListener();
    }

    public void setOnSelectedOptionsUpdatedListener(OnSelectedOptionsUpdatedListener onselectedoptionsupdatedlistener)
    {
        onSelectedOptionsUpdatedListener = onselectedoptionsupdatedlistener;
    }

    public void setOnVariantSelectedListener(OnVariantSelectedListener onvariantselectedlistener)
    {
        onVariantSelectedListener = onvariantselectedlistener;
    }




/*
    static boolean access$102(VariantSelectionController variantselectioncontroller, boolean flag)
    {
        variantselectioncontroller.animationInProgress = flag;
        return flag;
    }

*/



/*
    static com.pinterest.api.model.BuyableProduct.Variant access$302(VariantSelectionController variantselectioncontroller, com.pinterest.api.model.BuyableProduct.Variant variant)
    {
        variantselectioncontroller.selectedVariant = variant;
        return variant;
    }

*/



    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final VariantSelectionController this$0;

        public void onEventMainThread(VariantSelectedEvent variantselectedevent)
        {
            if (!animationInProgress)
            {
                selectedOptions.putAll(variantselectedevent.getVariantRowItem().getOptions());
                selectedVariant = variantselectedevent.getVariantRowItem().getVariant();
                if (moveToNextAttribute())
                {
                    handleVariantSelectionAnimation(true);
                    return;
                }
            }
        }

        _cls2()
        {
            this$0 = VariantSelectionController.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final VariantSelectionController this$0;
        final View val$currentVariantView;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            variantContainer.removeView(currentVariantView);
            animationInProgress = false;
        }

        _cls1()
        {
            this$0 = VariantSelectionController.this;
            currentVariantView = view;
            super();
        }
    }


    private class AttributeHistory
    {

        public final boolean addedByIntentOrDefault;
        public final String attributeName;
        final VariantSelectionController this$0;

        public AttributeHistory(String s, boolean flag)
        {
            this$0 = VariantSelectionController.this;
            super();
            attributeName = s;
            addedByIntentOrDefault = flag;
        }
    }


    private class OnSelectedOptionsUpdatedListener
    {

        public abstract void onSelectedOptionsUpdated(Map map);
    }


    private class OnVariantSelectedListener
    {

        public abstract void onVariantSelectedListener(com.pinterest.api.model.BuyableProduct.Variant variant);
    }

}
