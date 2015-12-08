// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import com.phunware.nbc.sochi.caption.adapter.ClosedCaptionCursorAdapter;
import com.phunware.nbc.sochi.caption.adapter.UndoBarController;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionListFragment, CaptionNewStyleFragment

private final class <init>
    implements android.support.v7.view.StyleActionMode
{

    final CaptionListFragment this$0;

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i != 0x7f0f0200) goto _L2; else goto _L1
_L1:
        getFragmentManager().beginTransaction().setCustomAnimations(0x7f05000c, 0x7f05000d, 0x7f05000c, 0x7f05000d).replace(0x7f0f006a, CaptionNewStyleFragment.getInstance(((Long)CaptionListFragment.access$300(CaptionListFragment.this).getCheckedItems().iterator().next()).longValue()), "frag_new_style").addToBackStack(null).commit();
_L4:
        actionmode.finish();
        return true;
_L2:
        if (i == 0x7f0f0201)
        {
            CaptionListFragment.access$500(CaptionListFragment.this).addAll(CaptionListFragment.access$300(CaptionListFragment.this).getCheckedItems());
            if (CaptionListFragment.access$500(CaptionListFragment.this).size() > 0)
            {
                menuitem = CaptionListFragment.access$600(CaptionListFragment.this, CaptionListFragment.access$500(CaptionListFragment.this));
                Bundle bundle = new Bundle();
                bundle.putString("pending_deleted_styles", menuitem);
                getLoaderManager().restartLoader(0, bundle, CaptionListFragment.this);
                CaptionListFragment.access$700(CaptionListFragment.this).showUndoBar(false, getString(0x7f0700aa, new Object[] {
                    Integer.valueOf(CaptionListFragment.access$300(CaptionListFragment.this).getCheckedItemCount())
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
        CaptionListFragment.access$200(CaptionListFragment.this).setChoiceMode(0);
        CaptionListFragment.access$300(CaptionListFragment.this).enterMultiMode();
        CaptionListFragment.access$200(CaptionListFragment.this).removeFooterView(CaptionListFragment.access$400(CaptionListFragment.this));
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        CaptionListFragment.access$300(CaptionListFragment.this).exitMultiMode();
        CaptionListFragment.access$200(CaptionListFragment.this).setChoiceMode(1);
        CaptionListFragment.access$200(CaptionListFragment.this).addFooterView(CaptionListFragment.access$400(CaptionListFragment.this));
        mMode = null;
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        int i = CaptionListFragment.access$300(CaptionListFragment.this).getCheckedItemCount();
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

            final CaptionListFragment.CaptionStyleActionMode this$1;

            public void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                if (j == 1)
                {
                    CaptionListFragment.access$300(this$0).checkAllItems();
                    mMode.invalidate();
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$1 = CaptionListFragment.CaptionStyleActionMode.this;
                super();
            }
        });
        mMode.setCustomView(actionmode);
        mUndoable = false;
        return false;
    }

    private _cls1.this._cls1()
    {
        this$0 = CaptionListFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
