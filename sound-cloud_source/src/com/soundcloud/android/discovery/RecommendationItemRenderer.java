// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.java.checks.Preconditions;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.discovery:
//            RecommendationReason, RecommendationItem

class RecommendationItemRenderer
    implements CellRenderer
{
    static interface OnRecommendationClickListener
    {

        public abstract void onRecommendationArtworkClicked(RecommendationItem recommendationitem);

        public abstract void onRecommendationReasonClicked(RecommendationItem recommendationitem);

        public abstract void onRecommendationViewAllClicked(Context context, RecommendationItem recommendationitem);
    }


    private final ImageOperations imageOperations;
    private OnRecommendationClickListener onRecommendationClickListener;
    private final Resources resources;

    RecommendationItemRenderer(Resources resources1, ImageOperations imageoperations)
    {
        resources = resources1;
        imageOperations = imageoperations;
    }

    private String getReason(RecommendationReason recommendationreason)
    {
        switch (_cls4..SwitchMap.com.soundcloud.android.discovery.RecommendationReason[recommendationreason.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown recommendation reason ")).append(recommendationreason).toString());

        case 1: // '\001'
            return resources.getString(0x7f0701b6).toLowerCase(Locale.getDefault());

        case 2: // '\002'
            return resources.getString(0x7f0701b7).toLowerCase(Locale.getDefault());
        }
    }

    private Spannable getReasonText(RecommendationItem recommendationitem)
    {
        String s = getReason(recommendationitem.getRecommendationReason());
        recommendationitem = resources.getString(0x7f0701b5, new Object[] {
            s, recommendationitem.getSeedTrackTitle()
        });
        SpannableString spannablestring = new SpannableString(recommendationitem);
        int i = recommendationitem.indexOf(s);
        i = s.length() + i;
        spannablestring.setSpan(new ForegroundColorSpan(resources.getColor(0x7f0e00c3)), 0, i, 33);
        spannablestring.setSpan(new ForegroundColorSpan(resources.getColor(0x7f0e00d2)), i, recommendationitem.length(), 33);
        return spannablestring;
    }

    private TextView getTextView(View view, int i)
    {
        return (TextView)view.findViewById(i);
    }

    private String getViewAllText(RecommendationItem recommendationitem)
    {
        return resources.getString(0x7f0701b9, new Object[] {
            Integer.valueOf(recommendationitem.getRecommendationCount())
        }).toUpperCase(Locale.getDefault());
    }

    private void loadArtwork(View view, RecommendationItem recommendationitem)
    {
        ApiImageSize apiimagesize = ApiImageSize.getFullImageSize(view.getResources());
        imageOperations.displayInAdapterView(recommendationitem.getRecommendationUrn(), apiimagesize, (ImageView)view.findViewById(0x7f0f006f));
    }

    private void setClickListeners(View view, final RecommendationItem recommendationItem)
    {
        view.findViewById(0x7f0f020e).setOnClickListener(new _cls1());
        view.findViewById(0x7f0f006f).setOnClickListener(new _cls2());
        view.findViewById(0x7f0f020f).setOnClickListener(new _cls3());
    }

    public void bindItemView(int i, View view, List list)
    {
        TextView textview = getTextView(view, 0x7f0f020d);
        int j;
        if (i == 1)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        textview.setVisibility(j);
        list = (RecommendationItem)list.get(i);
        getTextView(view, 0x7f0f020e).setText(getReasonText(list));
        getTextView(view, 0x7f0f0151).setText(list.getRecommendationUserName());
        getTextView(view, 0x7f0f0073).setText(list.getRecommendationTitle());
        getTextView(view, 0x7f0f0210).setText(getViewAllText(list));
        loadArtwork(view, list);
        setClickListeners(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300a2, viewgroup, false);
    }

    void setOnRecommendationClickListener(OnRecommendationClickListener onrecommendationclicklistener)
    {
        boolean flag;
        if (onrecommendationclicklistener != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Click listener must not be null");
        onRecommendationClickListener = onrecommendationclicklistener;
    }


    private class _cls4
    {

        static final int $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$discovery$RecommendationReason = new int[RecommendationReason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[RecommendationReason.LIKED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$discovery$RecommendationReason[RecommendationReason.LISTENED_TO.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final RecommendationItemRenderer this$0;
        final RecommendationItem val$recommendationItem;

        public void onClick(View view)
        {
            view = onRecommendationClickListener;
            if (view != null)
            {
                view.onRecommendationReasonClicked(recommendationItem);
            }
        }

        _cls1()
        {
            this$0 = RecommendationItemRenderer.this;
            recommendationItem = recommendationitem;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final RecommendationItemRenderer this$0;
        final RecommendationItem val$recommendationItem;

        public void onClick(View view)
        {
            view = onRecommendationClickListener;
            if (view != null)
            {
                view.onRecommendationArtworkClicked(recommendationItem);
            }
        }

        _cls2()
        {
            this$0 = RecommendationItemRenderer.this;
            recommendationItem = recommendationitem;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final RecommendationItemRenderer this$0;
        final RecommendationItem val$recommendationItem;

        public void onClick(View view)
        {
            OnRecommendationClickListener onrecommendationclicklistener = onRecommendationClickListener;
            if (onrecommendationclicklistener != null)
            {
                onrecommendationclicklistener.onRecommendationViewAllClicked(view.getContext(), recommendationItem);
            }
        }

        _cls3()
        {
            this$0 = RecommendationItemRenderer.this;
            recommendationItem = recommendationitem;
            super();
        }
    }

}
