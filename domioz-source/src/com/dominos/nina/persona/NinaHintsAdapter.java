// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.dominos.nina.persona:
//            Typefaces

public class NinaHintsAdapter extends ArrayAdapter
{

    private static final String DELIMITERS = "[|-]";
    private static final Map iconIdMap;
    private static final int layoutId;
    private final Typeface hintTypeface;

    public NinaHintsAdapter(Context context, ArrayList arraylist)
    {
        super(context, layoutId, arraylist);
        hintTypeface = Typefaces.get(getContext(), Typefaces.Id.HINT_TEXT);
    }

    private String getHintTextFromString(String s)
    {
        String as[] = s.split("[|-]", 2);
        if (2 == as.length)
        {
            s = as[1];
        }
        return s;
    }

    private int getIconIdFromString(String s)
    {
        s = s.split("[|-]", 2);
        if (2 != s.length)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        String s1 = s[0].trim();
        if (iconIdMap.containsKey(s1))
        {
            return ((Integer)iconIdMap.get(s1)).intValue();
        }
        int i = Integer.valueOf(s[0]).intValue();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        if (i > iconIdMap.size())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = ((Integer[])iconIdMap.values().toArray(new Integer[iconIdMap.size()]))[i - 1].intValue();
        return i;
        s;
        return 0;
    }

    public static void initializeListView(ListView listview)
    {
        Resources resources = listview.getResources();
        listview.setBackgroundResource(resources.getIdentifier(resources.getString(R.string.nina_hints_background_ref), "drawable", listview.getContext().getPackageName()));
        listview.setCacheColorHint(0);
        int i = resources.getIdentifier(resources.getString(R.string.nina_hints_divider_ref), "drawable", listview.getContext().getPackageName());
        int j = resources.getDimensionPixelSize(R.dimen.nina_hints_divider_side_margins);
        listview.setDivider(new InsetDrawable(resources.getDrawable(i), j, 0, j, 0));
        listview.setDividerHeight(resources.getDimensionPixelSize(R.dimen.nina_hints_divider_height));
        listview.setFadingEdgeLength(resources.getDimensionPixelSize(R.dimen.nina_hints_fading_edge_length));
        listview.setVerticalFadingEdgeEnabled(true);
        i = resources.getDimensionPixelSize(R.dimen.nina_hints_top_bottom_padding);
        listview.setPadding(0, i, 0, i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return getHintTextFromString((String)super.getItem(i));
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = View.inflate(getContext(), layoutId, null);
        }
        view = (String)super.getItem(i);
        Object obj = (TextView)viewgroup.findViewById(R.id.nina_hint_text);
        ((TextView) (obj)).setTypeface(hintTypeface);
        ((TextView) (obj)).setText(getHintTextFromString(view));
        obj = (ImageView)viewgroup.findViewById(R.id.nina_hint_icon);
        i = getIconIdFromString(view);
        if (i == 0)
        {
            ((ImageView) (obj)).setVisibility(8);
            return viewgroup;
        } else
        {
            ((ImageView) (obj)).setImageResource(i);
            return viewgroup;
        }
    }

    static 
    {
        layoutId = R.layout.nina_hints_list_item;
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        iconIdMap = linkedhashmap;
        linkedhashmap.put("cart", Integer.valueOf(R.drawable.hint_icon_cart));
        iconIdMap.put("coupon", Integer.valueOf(R.drawable.hint_icon_coupon));
        iconIdMap.put("dessert", Integer.valueOf(R.drawable.hint_icon_dessert));
        iconIdMap.put("drink", Integer.valueOf(R.drawable.hint_icon_drink));
        iconIdMap.put("goodbye", Integer.valueOf(R.drawable.hint_icon_goodbye));
        iconIdMap.put("menu", Integer.valueOf(R.drawable.hint_icon_menu));
        iconIdMap.put("pasta", Integer.valueOf(R.drawable.hint_icon_pasta));
        iconIdMap.put("pizza", Integer.valueOf(R.drawable.hint_icon_pizza));
        iconIdMap.put("sandwich", Integer.valueOf(R.drawable.hint_icon_sandwich));
        iconIdMap.put("side", Integer.valueOf(R.drawable.hint_icon_side));
    }
}
