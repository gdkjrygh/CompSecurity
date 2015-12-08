// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.List;
import org.chromium.content.browser.ContentViewCore;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopup, SelectPopupAdapter

public class SelectPopupDialog
    implements SelectPopup
{

    private static final int SELECT_DIALOG_ATTRS[];
    private final ContentViewCore mContentViewCore;
    private final Context mContext;
    private final AlertDialog mListBoxPopup;
    private boolean mSelectionNotified;

    public SelectPopupDialog(final ContentViewCore listView, List list, boolean flag, int ai[])
    {
        mContentViewCore = listView;
        mContext = mContentViewCore.getContext();
        listView = new ListView(mContext);
        listView.setCacheColorHint(0);
        android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(mContext)).setView(listView).setCancelable(true).setInverseBackgroundForced(true);
        if (flag)
        {
            builder.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final SelectPopupDialog this$0;
                final ListView val$listView;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    notifySelection(SelectPopupDialog.getSelectedIndices(listView));
                }

            
            {
                this$0 = SelectPopupDialog.this;
                listView = listview;
                super();
            }
            });
            builder.setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final SelectPopupDialog this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    notifySelection(null);
                }

            
            {
                this$0 = SelectPopupDialog.this;
                super();
            }
            });
        }
        mListBoxPopup = builder.create();
        listView.setAdapter(new SelectPopupAdapter(mContext, getSelectDialogLayout(flag), list));
        listView.setFocusableInTouchMode(true);
        if (flag)
        {
            listView.setChoiceMode(2);
            for (int i = 0; i < ai.length; i++)
            {
                listView.setItemChecked(ai[i], true);
            }

        } else
        {
            listView.setChoiceMode(1);
            listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final SelectPopupDialog this$0;
                final ListView val$listView;

                public void onItemClick(AdapterView adapterview, View view, int j, long l)
                {
                    notifySelection(SelectPopupDialog.getSelectedIndices(listView));
                    mListBoxPopup.dismiss();
                }

            
            {
                this$0 = SelectPopupDialog.this;
                listView = listview;
                super();
            }
            });
            if (ai.length > 0)
            {
                listView.setSelection(ai[0]);
                listView.setItemChecked(ai[0], true);
            }
        }
        mListBoxPopup.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final SelectPopupDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                notifySelection(null);
            }

            
            {
                this$0 = SelectPopupDialog.this;
                super();
            }
        });
    }

    private int getSelectDialogLayout(boolean flag)
    {
        TypedArray typedarray = mContext.obtainStyledAttributes(org.chromium.content.R.style.SelectPopupDialog, SELECT_DIALOG_ATTRS);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = typedarray.getResourceId(i, 0);
        typedarray.recycle();
        return i;
    }

    private static int[] getSelectedIndices(ListView listview)
    {
        listview = listview.getCheckedItemPositions();
        int k = 0;
        for (int i = 0; i < listview.size();)
        {
            int i1 = k;
            if (listview.valueAt(i))
            {
                i1 = k + 1;
            }
            i++;
            k = i1;
        }

        int ai[] = new int[k];
        int j = 0;
        int j1;
        for (int l = 0; j < listview.size(); l = j1)
        {
            j1 = l;
            if (listview.valueAt(j))
            {
                ai[l] = listview.keyAt(j);
                j1 = l + 1;
            }
            j++;
        }

        return ai;
    }

    private void notifySelection(int ai[])
    {
        if (mSelectionNotified)
        {
            return;
        } else
        {
            mContentViewCore.selectPopupMenuItems(ai);
            mSelectionNotified = true;
            return;
        }
    }

    public void hide()
    {
        mListBoxPopup.cancel();
        notifySelection(null);
    }

    public void show()
    {
        mListBoxPopup.show();
    }

    static 
    {
        SELECT_DIALOG_ATTRS = (new int[] {
            org.chromium.content.R.attr.select_dialog_multichoice, org.chromium.content.R.attr.select_dialog_singlechoice
        });
    }



}
