// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nbcsports.liveextra.ui.core.BaseContentFragment;
import com.nbcsports.liveextra.ui.core.BaseFragment;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            HighlightsFragment

public class  extends com.nbcsports.liveextra.ui.core.
{

    public volatile void bind(butterknife.Fragment..ViewBinder viewbinder, BaseContentFragment basecontentfragment, Object obj)
    {
        bind(viewbinder, (HighlightsFragment)basecontentfragment, obj);
    }

    public volatile void bind(butterknife.tsFragment..ViewBinder viewbinder, BaseFragment basefragment, Object obj)
    {
        bind(viewbinder, (HighlightsFragment)basefragment, obj);
    }

    public void bind(butterknife.inder inder, HighlightsFragment highlightsfragment, Object obj)
    {
        super.bind(inder, highlightsfragment, obj);
        highlightsfragment.layout = (LinearLayout)inder.castView((View)inder.findRequiredView(obj, 0x7f0f00de, "field 'layout'"), 0x7f0f00de, "field 'layout'");
        highlightsfragment.upcomingLabel = (TextView)inder.castView((View)inder.findRequiredView(obj, 0x7f0f01ce, "field 'upcomingLabel'"), 0x7f0f01ce, "field 'upcomingLabel'");
        highlightsfragment.highlightsTab = (TextView)inder.castView((View)inder.findOptionalView(obj, 0x7f0f01d1, null), 0x7f0f01d1, "field 'highlightsTab'");
    }

    public volatile void bind(butterknife.Knife.Finder finder, Object obj, Object obj1)
    {
        bind(finder, (HighlightsFragment)obj, obj1);
    }

    public volatile void unbind(BaseContentFragment basecontentfragment)
    {
        unbind((HighlightsFragment)basecontentfragment);
    }

    public volatile void unbind(BaseFragment basefragment)
    {
        unbind((HighlightsFragment)basefragment);
    }

    public void unbind(HighlightsFragment highlightsfragment)
    {
        super.unbind(highlightsfragment);
        highlightsfragment.layout = null;
        highlightsfragment.upcomingLabel = null;
        highlightsfragment.highlightsTab = null;
    }

    public volatile void unbind(Object obj)
    {
        unbind((HighlightsFragment)obj);
    }

    public ()
    {
    }
}
