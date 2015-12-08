// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.List;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.content.browser.RenderCoordinates;
import org.chromium.ui.DropdownAdapter;
import org.chromium.ui.DropdownItem;
import org.chromium.ui.DropdownPopupWindow;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopup

public class SelectPopupDropdown
    implements SelectPopup
{

    private final ContentViewCore mContentViewCore;
    private final Context mContext;
    private final DropdownPopupWindow mDropdownPopupWindow;
    private int mInitialSelection;
    private boolean mSelectionNotified;

    public SelectPopupDropdown(ContentViewCore contentviewcore, List list, Rect rect, int ai[])
    {
        mInitialSelection = -1;
        mContentViewCore = contentviewcore;
        mContext = mContentViewCore.getContext();
        mDropdownPopupWindow = new DropdownPopupWindow(mContext, mContentViewCore.getViewAndroidDelegate());
        mDropdownPopupWindow.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SelectPopupDropdown this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                notifySelection(new int[] {
                    i
                });
                hide();
            }

            
            {
                this$0 = SelectPopupDropdown.this;
                super();
            }
        });
        if (ai.length > 0)
        {
            mInitialSelection = ai[0];
        }
        contentviewcore = (DropdownItem[])list.toArray(new DropdownItem[list.size()]);
        mDropdownPopupWindow.setAdapter(new DropdownAdapter(mContext, contentviewcore, null));
        contentviewcore = mContentViewCore.getRenderCoordinates();
        float f = contentviewcore.fromPixToDip(contentviewcore.fromLocalCssToPix(rect.left));
        float f1 = contentviewcore.fromPixToDip(contentviewcore.fromLocalCssToPix(rect.top));
        float f2 = contentviewcore.fromPixToDip(contentviewcore.fromLocalCssToPix(rect.right));
        float f3 = contentviewcore.fromPixToDip(contentviewcore.fromLocalCssToPix(rect.bottom));
        mDropdownPopupWindow.setAnchorRect(f, f1, f2 - f, f3 - f1);
        mDropdownPopupWindow.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

            final SelectPopupDropdown this$0;

            public void onDismiss()
            {
                notifySelection(null);
            }

            
            {
                this$0 = SelectPopupDropdown.this;
                super();
            }
        });
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
        mDropdownPopupWindow.dismiss();
        notifySelection(null);
    }

    public void show()
    {
        mDropdownPopupWindow.show();
        if (mInitialSelection >= 0)
        {
            mDropdownPopupWindow.getListView().setSelection(mInitialSelection);
        }
    }

}
