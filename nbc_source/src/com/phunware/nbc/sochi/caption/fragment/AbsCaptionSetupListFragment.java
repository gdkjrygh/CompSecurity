// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.app.Activity;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;

public abstract class AbsCaptionSetupListFragment extends ListFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener
{

    protected static final String ARG_STYLE_ID = "style_id";
    private CaptionPreviewHelper captionPreviewHelper;
    private CaptionStyle captionStyle;
    private LayoutInflater inflater;
    private AsyncQueryHandler mAsyncQueryHandler;
    private long mStyleId;
    protected TextView mTextViewCaptionPreview;

    public AbsCaptionSetupListFragment()
    {
        mStyleId = -1L;
    }

    protected abstract BaseAdapter getAdapter();

    protected AsyncQueryHandler getAsyncQueryHandler()
    {
        return mAsyncQueryHandler;
    }

    protected abstract int getCheckedStyleItem();

    protected abstract String getFragmentTitle();

    protected TextView getPreviewTextView()
    {
        return mTextViewCaptionPreview;
    }

    protected long getStyleId()
    {
        return mStyleId;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mAsyncQueryHandler = new AsyncQueryHandler(getActivity().getContentResolver()) {

            final AbsCaptionSetupListFragment this$0;

            
            {
                this$0 = AbsCaptionSetupListFragment.this;
                super(contentresolver);
            }
        };
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
        captionStyle = NBCSportsApplication.component().captionStyle();
        if (getArguments() != null)
        {
            mStyleId = getArguments().getLong("style_id");
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(getActivity(), ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, getStyleId()), null, null, null, null);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            return;
        } else
        {
            onStyleOptionClick(adapterview, view, i, l);
            return;
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        captionPreviewHelper.preview(getActivity(), cursor, mTextViewCaptionPreview);
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(getFragmentTitle());
    }

    public abstract void onStyleOptionClick(AdapterView adapterview, View view, int i, long l);

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        inflater = (LayoutInflater)getActivity().getSystemService("layout_inflater");
        view = inflater.inflate(0x7f0400ab, getListView(), false);
        getListView().setChoiceMode(1);
        getListView().setSelector(captionStyle.buildThemedListSelector());
        getListView().setDivider(getResources().getDrawable(0x7f0200ee));
        getListView().addHeaderView(view, null, false);
        setListAdapter(getAdapter());
        getListView().setItemChecked(getCheckedStyleItem(), true);
        getListView().setOnItemClickListener(this);
        mTextViewCaptionPreview = (TextView)view.findViewById(0x7f0f0113);
        captionPreviewHelper.bindFullScreenPreviewButton(getActivity(), (View)mTextViewCaptionPreview.getParent(), mStyleId);
        getLoaderManager().restartLoader(0, null, this);
    }

    protected void persistChangesToCurrentStyle(ContentValues contentvalues)
    {
        mAsyncQueryHandler.startUpdate(0, null, ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, mStyleId), contentvalues, null, null);
    }
}
