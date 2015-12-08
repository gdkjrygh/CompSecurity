// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package kik.android.widget:
//            AutoResizeRecyclerGridView, GifSearchFragment, aw, ax, 
//            RobotoEditText, ay, az

public class 
{

    public static void inject(butterknife.jector jector, GifSearchFragment gifsearchfragment, Object obj)
    {
        View view = jector.jector(obj, 0x7f0e0114);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624212' for field '_emojiGridView' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._emojiGridView = (AutoResizeRecyclerGridView)view;
        view = jector.w(obj, 0x7f0e0115);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624213' for field '_resultGridView' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._resultGridView = (RecyclerView)view;
        view = jector.GridView(obj, 0x7f0e012b);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624235' for field '_noSearchResults' and method 'onNoResultsClicked' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._noSearchResults = (RelativeLayout)view;
        view.setOnClickListener(new aw(gifsearchfragment));
        view = jector.chResults(obj, 0x7f0e0116);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624214' for field '_searchResultsLoading' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._searchResultsLoading = (ProgressBar)view;
        view = jector.ResultsLoading(obj, 0x7f0e012d);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624237' for field '_noSearchResultsText' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._noSearchResultsText = (TextView)view;
        view = jector.chResultsText(obj, 0x7f0e0119);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624217' for field '_searchCancel' and method 'cancelSearchText' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._searchCancel = (ImageView)view;
        view.setOnClickListener(new ax(gifsearchfragment));
        view = jector.Cancel(obj, 0x7f0e0118);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624216' for field '_searchEditText' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._searchEditText = (RobotoEditText)view;
        view = jector.EditText(obj, 0x7f0e0117);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624215' for field '_searchBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._searchBar = (RelativeLayout)view;
        view = jector.Bar(obj, 0x7f0e012a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624234' for field '_gifsCantLoad' and method 'onResultsErrorClicked' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._gifsCantLoad = (LinearLayout)view;
        view.setOnClickListener(new ay(gifsearchfragment));
        view = jector.ntLoad(obj, 0x7f0e011a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624218' for field '_gifsHintBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._gifsHintBar = (FrameLayout)view;
        view = jector.ntBar(obj, 0x7f0e011b);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624219' for field '_gifsHintBarClose' and method 'onHintCloseClicked' was not found. If this view is optional add '@Optional' annotation.");
        }
        gifsearchfragment._gifsHintBarClose = (ImageView)view;
        view.setOnClickListener(new az(gifsearchfragment));
        jector = jector.ntBarClose(obj, 0x7f0e01c9);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624393' for field '_gifAttributionBar' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            gifsearchfragment._gifAttributionBar = (ImageView)jector;
            return;
        }
    }

    public static void reset(GifSearchFragment gifsearchfragment)
    {
        gifsearchfragment._emojiGridView = null;
        gifsearchfragment._resultGridView = null;
        gifsearchfragment._noSearchResults = null;
        gifsearchfragment._searchResultsLoading = null;
        gifsearchfragment._noSearchResultsText = null;
        gifsearchfragment._searchCancel = null;
        gifsearchfragment._searchEditText = null;
        gifsearchfragment._searchBar = null;
        gifsearchfragment._gifsCantLoad = null;
        gifsearchfragment._gifsHintBar = null;
        gifsearchfragment._gifsHintBarClose = null;
        gifsearchfragment._gifAttributionBar = null;
    }

    public ()
    {
    }
}
