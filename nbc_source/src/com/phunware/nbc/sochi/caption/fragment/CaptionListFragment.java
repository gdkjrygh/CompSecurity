// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.adapter.ClosedCaptionCursorAdapter;
import com.phunware.nbc.sochi.caption.adapter.UndoBarController;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionNewStyleFragment

public class CaptionListFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, com.phunware.nbc.sochi.caption.adapter.UndoBarController.UndoListener
{
    private final class CaptionStyleActionMode
        implements android.support.v7.view.ActionMode.Callback
    {

        final CaptionListFragment this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            int i = menuitem.getItemId();
            if (i != 0x7f0f0200) goto _L2; else goto _L1
_L1:
            getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionNewStyleFragment.getInstance(((Long)mAdapter.getCheckedItems().iterator().next()).longValue()), "frag_new_style").addToBackStack(null).commit();
_L4:
            actionmode.finish();
            return true;
_L2:
            if (i == 0x7f0f0201)
            {
                mPendingDeletedStyles.addAll(mAdapter.getCheckedItems());
                if (mPendingDeletedStyles.size() > 0)
                {
                    menuitem = setToStringList(mPendingDeletedStyles);
                    Bundle bundle = new Bundle();
                    bundle.putString("pending_deleted_styles", menuitem);
                    getLoaderManager().restartLoader(0, bundle, CaptionListFragment.this);
                    mUndoBarController.showUndoBar(false, getString(0x7f0700aa, new Object[] {
                        Integer.valueOf(mAdapter.getCheckedItemCount())
                    }), null);
                    mUndoable = true;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            mMode = actionmode;
            getActivity().getMenuInflater().inflate(0x7f100003, menu);
            mListView.setChoiceMode(0);
            mAdapter.enterMultiMode();
            mListView.removeFooterView(mCreateNewStyle);
            return true;
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            mAdapter.exitMultiMode();
            mListView.setChoiceMode(1);
            mListView.addFooterView(mCreateNewStyle);
            mMode = null;
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            int i = mAdapter.getCheckedItemCount();
            if (i > 0)
            {
                menu.findItem(0x7f0f0201).setVisible(true);
            } else
            {
                menu.findItem(0x7f0f0201).setVisible(false);
            }
            if (i == 1)
            {
                menu.findItem(0x7f0f0200).setVisible(true);
            } else
            {
                menu.findItem(0x7f0f0200).setVisible(false);
            }
            actionmode = new Spinner(getActivity());
            menu = new ArrayAdapter(getActivity(), 0x7f04009d);
            actionmode.setAdapter(menu);
            menu.add(getString(0x7f07009e, new Object[] {
                Integer.valueOf(i)
            }));
            menu.add(getString(0x7f07009d));
            actionmode.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final CaptionStyleActionMode this$1;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    if (i == 1)
                    {
                        mAdapter.checkAllItems();
                        mMode.invalidate();
                    }
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$1 = CaptionStyleActionMode.this;
                super();
            }
            });
            mMode.setCustomView(actionmode);
            mUndoable = false;
            return false;
        }

        private CaptionStyleActionMode()
        {
            this$0 = CaptionListFragment.this;
            super();
        }

    }


    private static final String ARG_LOADER_PENDING_DELETED_STYLES = "pending_deleted_styles";
    private static final String ARG_STYLE_ID = "style_id";
    private static final String TAG = "CaptionListFragment";
    private static final String TAG_FRAG_NEW_STYLE = "frag_new_style";
    private CaptionPreviewHelper captionPreviewHelper;
    private CaptionStyle captionStyle;
    private LayoutInflater inflater;
    private ClosedCaptionCursorAdapter mAdapter;
    private View mCreateNewStyle;
    private ListView mListView;
    private final android.support.v4.app.LoaderManager.LoaderCallbacks mLoaderCallbacksStyle = new android.support.v4.app.LoaderManager.LoaderCallbacks() {

        final CaptionListFragment this$0;

        public Loader onCreateLoader(int i, Bundle bundle)
        {
            return new CursorLoader(getActivity(), ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, bundle.getLong("style_id")), null, null, null, null);
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

            
            {
                this$0 = CaptionListFragment.this;
                super();
            }
    };
    public ActionMode mMode;
    private int mNumStyles;
    private final Set mPendingDeletedStyles = new HashSet();
    private TextView mTextViewCaptionPreview;
    private UndoBarController mUndoBarController;
    public boolean mUndoable;

    public CaptionListFragment()
    {
    }

    private void commitLastUndoableAction()
    {
        if (mUndoable)
        {
            AsyncQueryHandler asyncqueryhandler = new AsyncQueryHandler(getActivity().getContentResolver()) {

                final CaptionListFragment this$0;

                protected void onDeleteComplete(int i, Object obj, int j)
                {
                    NBCSystem.debugLog("CaptionListFragment", "onDeleteComplete");
                    mPendingDeletedStyles.clear();
                }

            
            {
                this$0 = CaptionListFragment.this;
                super(contentresolver);
            }
            };
            if (mPendingDeletedStyles.size() > 0)
            {
                String s = setToStringList(mPendingDeletedStyles);
                s = (new StringBuilder()).append("_id IN (").append(s).append(")").toString();
                asyncqueryhandler.startDelete(0, null, com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, s, null);
                mUndoBarController.hideUndoBar(true);
            }
        }
    }

    private String setToStringList(Set set)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (set = set.iterator(); set.hasNext(); stringbuilder.append(","))
        {
            stringbuilder.append((Long)set.next());
        }

        if (stringbuilder.length() > 0)
        {
            return stringbuilder.deleteCharAt(stringbuilder.length() - 1).toString();
        } else
        {
            return null;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        captionStyle = NBCSportsApplication.component().captionStyle();
        captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        Object obj = null;
        String s = obj;
        if (bundle != null)
        {
            s = obj;
            if (bundle.containsKey("pending_deleted_styles"))
            {
                s = (new StringBuilder()).append("_id NOT IN (").append(bundle.getString("pending_deleted_styles")).append(")").toString();
                NBCSystem.debugLog("CaptionListFragment", (new StringBuilder()).append("selection: ").append(s).toString());
            }
        }
        return new CursorLoader(getActivity(), com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, new String[] {
            "_id", "title"
        }, s, null, null);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04002d, viewgroup, false);
        mListView = (ListView)layoutinflater.findViewById(0x102000a);
        mUndoBarController = new UndoBarController(layoutinflater.findViewById(0x7f0f008a), this);
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mMode == null)
        {
            if (view == mCreateNewStyle)
            {
                getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionNewStyleFragment.getInstance(mNumStyles), "frag_new_style").addToBackStack(null).commit();
                return;
            } else
            {
                adapterview = mAdapter.getCursor();
                adapterview.moveToPosition(i - 1);
                view = adapterview.getString(adapterview.getColumnIndex("title"));
                i = adapterview.getInt(adapterview.getColumnIndex("_id"));
                NBCSystem.debugLog("CaptionListFragment", (new StringBuilder()).append(i).append("(").append(view).append(") is now the selected style. id = ").append(l).toString());
                captionStyle.setUserSelectedCaptionStyle(view, i);
                adapterview = new Bundle();
                adapterview.putLong("style_id", i);
                getLoaderManager().restartLoader(1, adapterview, mLoaderCallbacksStyle);
                return;
            }
        }
        if (l <= 0L)
        {
            Toast.makeText(getActivity(), "You cannot remove this style.", 0).show();
            return;
        } else
        {
            mAdapter.toggleChecked(l);
            mMode.invalidate();
            return;
        }
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (cursor == null)
        {
            return;
        }
        mNumStyles = cursor.getCount() - 2;
        int i = 1;
        do
        {
label0:
            {
                if (cursor.moveToNext())
                {
                    loader = cursor.getString(cursor.getColumnIndex("title"));
                    if (!TextUtils.equals(captionStyle.getUserSelectedCaptionStyle(), loader))
                    {
                        break label0;
                    }
                }
                loader = new Bundle();
                loader.putLong("style_id", captionStyle.getUserSelectedCaptionStyleId());
                getLoaderManager().restartLoader(1, loader, mLoaderCallbacksStyle);
                mAdapter = new ClosedCaptionCursorAdapter(getActivity(), 0x109000f);
                mAdapter.setPressedDrawable(captionStyle.buildThemedPressedState());
                mAdapter.swapCursor(cursor);
                mListView.setAdapter(mAdapter);
                mListView.setItemChecked(i, true);
                return;
            }
            i++;
        } while (true);
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        super.onPause();
        if (mAdapter != null)
        {
            mAdapter.exitMultiMode();
            if (mMode != null)
            {
                mMode.finish();
            }
            mMode = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(0x7f0701b0);
    }

    public void onStop()
    {
        super.onStop();
        commitLastUndoableAction();
    }

    public void onUndo(Parcelable parcelable)
    {
        mPendingDeletedStyles.clear();
        getLoaderManager().restartLoader(0, null, this);
        mUndoBarController.hideUndoBar(true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        inflater = (LayoutInflater)getActivity().getSystemService("layout_inflater");
        mListView.setAdapter(null);
        view = inflater.inflate(0x7f0400ab, mListView, false);
        mCreateNewStyle = inflater.inflate(0x7f0400aa, mListView, false);
        mListView.setChoiceMode(1);
        mListView.setSelector(captionStyle.buildThemedListSelector());
        mListView.setDivider(getResources().getDrawable(0x7f0200ee));
        mListView.addHeaderView(view, null, false);
        mListView.addFooterView(mCreateNewStyle);
        captionPreviewHelper.bindFullScreenPreviewButton(getActivity(), view);
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            final CaptionListFragment this$0;

            public boolean onItemLongClick(AdapterView adapterview, View view1, int i, long l)
            {
                if (mMode != null)
                {
                    return false;
                }
                commitLastUndoableAction();
                ((AppCompatActivity)getActivity()).startSupportActionMode(new CaptionStyleActionMode());
                if (l > 0L)
                {
                    mAdapter.setChecked(l, true);
                }
                mMode.invalidate();
                return true;
            }

            
            {
                this$0 = CaptionListFragment.this;
                super();
            }
        });
        mTextViewCaptionPreview = (TextView)view.findViewById(0x7f0f0113);
        getLoaderManager().restartLoader(0, null, this);
    }









}
