// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.attribution;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.List;

// Referenced classes of package com.phunware.attribution:
//            NoticeAdapter, AttributionParser

public class AttributionFragment extends DialogFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    public static class AttributionLoader extends AsyncTaskLoader
    {

        private List result;

        public volatile Object loadInBackground()
        {
            return loadInBackground();
        }

        public List loadInBackground()
        {
            return AttributionParser.getNotices(getContext());
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            if (result != null)
            {
                deliverResult(result);
                return;
            } else
            {
                forceLoad();
                return;
            }
        }

        public AttributionLoader(Context context)
        {
            super(context);
        }
    }


    private ListView mListView;

    public AttributionFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.setTitle(0x7f0701b2);
        return bundle;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new AttributionLoader(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f04002c, viewgroup, false);
        mListView = (ListView)viewgroup.findViewById(0x7f0f0089);
        mListView.setEmptyView(viewgroup.findViewById(0x7f0f0088));
        mListView.addHeaderView(layoutinflater.inflate(0x7f04004c, mListView, false));
        getLoaderManager().initLoader(0, null, this);
        return viewgroup;
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (List)obj);
    }

    public void onLoadFinished(Loader loader, List list)
    {
        mListView.setAdapter(new NoticeAdapter(list));
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
