// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.java.collections.PropertySet;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackProperty

public class TrackInfoPresenter
{
    static interface CommentClickListener
    {

        public abstract void onCommentsClicked();
    }


    private final CondensedNumberFormatter numberFormatter;
    private final Resources resources;

    public TrackInfoPresenter(Resources resources1, CondensedNumberFormatter condensednumberformatter)
    {
        resources = resources1;
        numberFormatter = condensednumberformatter;
    }

    private void bindComments(View view, PropertySet propertyset, final CommentClickListener commentClickListener)
    {
        int i = ((Integer)propertyset.get(TrackProperty.COMMENTS_COUNT)).intValue();
        if (i > 0)
        {
            setTextAndShow(view, 0x7f0f0274, resources.getQuantityString(0x7f090020, i, new Object[] {
                Integer.valueOf(i)
            }));
            showView(view, 0x7f0f0275);
        } else
        {
            hideView(view, 0x7f0f0274);
            hideView(view, 0x7f0f0275);
        }
        view.findViewById(0x7f0f0274).setOnClickListener(new _cls1());
    }

    private void bindPrivateOrStats(View view, PropertySet propertyset)
    {
        if (((Boolean)propertyset.get(PlayableProperty.IS_PRIVATE)).booleanValue())
        {
            hideView(view, 0x7f0f026c);
            showView(view, 0x7f0f00d3);
            return;
        } else
        {
            showView(view, 0x7f0f026c);
            hideView(view, 0x7f0f00d3);
            configureStats(view, propertyset);
            return;
        }
    }

    private void bindUploadedSinceText(View view, PropertySet propertyset)
    {
        propertyset = ScTextUtils.formatTimeElapsedSince(resources, ((Date)propertyset.get(PlayableProperty.CREATED_AT)).getTime(), true);
        setTextAndShow(view, 0x7f0f0276, resources.getString(0x7f070219, new Object[] {
            propertyset
        }));
    }

    private void configureStats(View view, PropertySet propertyset)
    {
        setStat(view, 0x7f0f026d, (Integer)propertyset.get(TrackProperty.PLAY_COUNT));
        setStat(view, 0x7f0f026f, (Integer)propertyset.get(PlayableProperty.LIKES_COUNT));
        setStat(view, 0x7f0f0271, (Integer)propertyset.get(PlayableProperty.REPOSTS_COUNT));
        toggleDividers(view);
    }

    private void hideView(View view, int i)
    {
        view.findViewById(i).setVisibility(8);
    }

    private void setStat(View view, int i, Integer integer)
    {
        if (integer.intValue() > 0)
        {
            setTextAndShow(view, i, numberFormatter.format(integer.intValue()));
            return;
        } else
        {
            view.findViewById(i).setVisibility(8);
            return;
        }
    }

    private void setTextAndShow(View view, int i, Spanned spanned)
    {
        view = (TextView)view.findViewById(i);
        view.setText(spanned);
        view.setVisibility(0);
    }

    private void setTextAndShow(View view, int i, String s)
    {
        view = (TextView)view.findViewById(i);
        view.setText(s);
        view.setVisibility(0);
    }

    private void showView(View view, int i)
    {
        view.findViewById(i).setVisibility(0);
    }

    private void toggleDividers(View view)
    {
        int i;
        int j;
label0:
        {
            boolean flag3 = true;
            boolean flag2 = false;
            View view1;
            boolean flag;
            boolean flag1;
            if (view.findViewById(0x7f0f026d).getVisibility() == 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (view.findViewById(0x7f0f026f).getVisibility() == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (view.findViewById(0x7f0f0271).getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j != 0)
            {
                flag1 = flag3;
                if (i != 0)
                {
                    break label0;
                }
            }
            if (j != 0 && flag)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
        }
        view1 = view.findViewById(0x7f0f026e);
        if (flag1)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        view1.setVisibility(j);
        view = view.findViewById(0x7f0f0270);
        if (i != 0 && flag)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void bind(View view, PropertySet propertyset, CommentClickListener commentclicklistener)
    {
        setTextAndShow(view, 0x7f0f0073, (String)propertyset.get(PlayableProperty.TITLE));
        setTextAndShow(view, 0x7f0f00d1, (String)propertyset.get(PlayableProperty.CREATOR_NAME));
        showView(view, 0x7f0f0272);
        bindUploadedSinceText(view, propertyset);
        bindComments(view, propertyset, commentclicklistener);
        bindPrivateOrStats(view, propertyset);
    }

    public void bindDescription(View view, PropertySet propertyset)
    {
        propertyset = (String)propertyset.get(TrackProperty.DESCRIPTION);
        if (propertyset.isEmpty())
        {
            bindNoDescription(view);
        } else
        {
            hideView(view, 0x7f0f0277);
            setTextAndShow(view, 0x7f0f00d5, Html.fromHtml(propertyset.replace(System.getProperty("line.separator"), "<br/>")));
        }
        hideView(view, 0x7f0f0273);
    }

    public void bindNoDescription(View view)
    {
        showView(view, 0x7f0f0277);
        hideView(view, 0x7f0f0273);
        hideView(view, 0x7f0f00d5);
    }

    public View create(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f0300cd, viewgroup, false);
    }

    public void showSpinner(View view)
    {
        hideView(view, 0x7f0f00d5);
        showView(view, 0x7f0f0273);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackInfoPresenter this$0;
        final CommentClickListener val$commentClickListener;

        public void onClick(View view)
        {
            commentClickListener.onCommentsClicked();
        }

        _cls1()
        {
            this$0 = TrackInfoPresenter.this;
            commentClickListener = commentclicklistener;
            super();
        }
    }

}
