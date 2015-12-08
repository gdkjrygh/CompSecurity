// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.text.Spanned;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.metadata.recipe.CategorizedIngredient;
import com.pinterest.api.model.metadata.recipe.Ingredient;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.ui.text.PTextView;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupRecipeModule extends PinCloseupBaseModule
{

    private boolean _isRecipe;
    private int _sidePadding;

    public PinCloseupRecipeModule(Context context)
    {
        super(context);
        _sidePadding = (int)Resources.dimension(0x7f0a0184);
    }

    private void displayRecipe()
    {
        Recipe recipe;
        int l;
        int i1;
        recipe = (Recipe)_pinMetadata;
        List list = recipe.getCategorizedIngredients();
        Object obj = getContext();
        l = (int)Resources.dimension(0x7f0a018a);
        i1 = (int)Resources.dimension(0x7f0a0183);
        LinearLayout linearlayout;
        Object obj2;
        int k;
        boolean flag;
        if (recipe.isFromAggregatedData().booleanValue())
        {
            obj = getDividerView();
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, Constants.HAIRLINE);
            layoutparams.setMargins(0, 0, 0, Constants.MARGIN);
            addView(((android.view.View) (obj)), layoutparams);
            obj = new TextView(getContext(), null, 0x7f0100e9);
            ((TextView) (obj)).setText(recipe.getName());
            int i = (int)Resources.dimension(0x7f0a0185);
            ((TextView) (obj)).setPadding(_sidePadding, 0, i, Constants.MARGIN);
            addView(((android.view.View) (obj)), -1, -2);
            break MISSING_BLOCK_LABEL_133;
        } else
        {
            obj1 = getDietsString(recipe);
            if (ModelHelper.isValid(obj1))
            {
                PTextView ptextview = new PTextView(((Context) (obj)));
                ptextview.setTextAppearance(((Context) (obj)), 0x7f0b01e2);
                ptextview.setText(((CharSequence) (obj1)));
                ptextview.setPadding(_sidePadding, 0, _sidePadding, l);
                addView(ptextview, -1, -1);
            }
            continue;
        }
        do
        {
            int j = 0;
            do
            {
                if (j >= list.size())
                {
                    break;
                }
                obj = (CategorizedIngredient)list.get(j);
                Object obj1 = new PTextView(getContext());
                ((PTextView) (obj1)).setTextAppearance(getContext(), 0x7f0b01ee);
                ((PTextView) (obj1)).setText(((CategorizedIngredient) (obj)).getCategory());
                if (j == 0)
                {
                    ((PTextView) (obj1)).setPadding(_sidePadding, 0, _sidePadding, i1);
                } else
                {
                    ((PTextView) (obj1)).setPadding(_sidePadding, l, _sidePadding, i1);
                }
                addView(((android.view.View) (obj1)), -1, -2);
                obj = ((CategorizedIngredient) (obj)).getIngredients();
                for (k = 0; k < ((List) (obj)).size(); k++)
                {
                    obj1 = (Ingredient)((List) (obj)).get(k);
                    linearlayout = new LinearLayout(getContext());
                    linearlayout.setOrientation(0);
                    flag = StringUtils.isNotEmpty(((Ingredient) (obj1)).getAmount());
                    obj2 = new TextView(getContext());
                    ((TextView) (obj2)).setTextAppearance(getContext(), 0x7f0b01e2);
                    ((TextView) (obj2)).setText(((Ingredient) (obj1)).getName());
                    ((TextView) (obj2)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F));
                    linearlayout.addView(((android.view.View) (obj2)));
                    if (flag)
                    {
                        obj2 = new PTextView(getContext());
                        ((PTextView) (obj2)).setTextAppearance(getContext(), 0x7f0b01e2);
                        ((PTextView) (obj2)).setTypeface(null, 1);
                        ((PTextView) (obj2)).setText(((Ingredient) (obj1)).getAmount());
                        ((PTextView) (obj2)).setGravity(5);
                        ((PTextView) (obj2)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 0.0F));
                        linearlayout.addView(((android.view.View) (obj2)));
                    }
                    linearlayout.setPadding(_sidePadding, 0, _sidePadding, 0);
                    addView(linearlayout, -1, -2);
                }

                j++;
            } while (true);
            if (recipe.isFromAggregatedData().booleanValue())
            {
                recipe.addMoreDetailsView(this, getComponentType(), _apiTag);
            }
            return;
        } while (true);
    }

    private Spanned getDietsString(Recipe recipe)
    {
        StringBuilder stringbuilder = new StringBuilder();
        recipe = recipe.getDiets();
        int i = 0;
        for (int j = recipe.a(); i < j; i++)
        {
            if (i == 0 && stringbuilder.length() > 0)
            {
                stringbuilder.append(" &#8226; ");
            }
            stringbuilder.append(recipe.a(i));
            stringbuilder.append(" &#8226; ");
        }

        return Html.fromHtml(StringUtils.removeEnd(stringbuilder.toString(), " &#8226; "));
    }

    private boolean isRecipe()
    {
        if (_pinMetadata != null && (_pinMetadata instanceof Recipe))
        {
            if (((Recipe)_pinMetadata).isFromAggregatedData().booleanValue())
            {
                return Experiments.R();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    protected HashMap getCardViewAuxData()
    {
        if (isRecipe())
        {
            return ((Recipe)_pinMetadata).getAuxData();
        } else
        {
            return null;
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_RECIPE;
    }

    protected boolean hasContent()
    {
        return isRecipe();
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    protected void initView()
    {
        setOrientation(1);
        setBackgroundColor(-1);
        setVisibility(8);
    }

    protected boolean shouldUpdateView()
    {
        boolean flag1 = isRecipe();
        boolean flag;
        if (_isRecipe != flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isRecipe = flag1;
        return flag;
    }

    protected void updateView()
    {
        removeAllViews();
        if (isRecipe())
        {
            displayRecipe();
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }
}
