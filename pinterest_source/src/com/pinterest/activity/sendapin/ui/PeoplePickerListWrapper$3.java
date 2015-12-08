// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.graphics.Rect;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.base.Device;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper, SendPinListView

class this._cls0
    implements android.widget.er
{

    final PeoplePickerListWrapper this$0;

    private void getHeaderContainerHitRect(Rect rect)
    {
label0:
        {
            if (rect != null)
            {
                if (PeoplePickerListWrapper.access$1000(PeoplePickerListWrapper.this).getChildCount() != 0)
                {
                    break label0;
                }
                rect.setEmpty();
            }
            return;
        }
        PeoplePickerListWrapper.access$1000(PeoplePickerListWrapper.this).getHitRect(rect);
    }

    private boolean shouldDrawHeader(Rect rect, Rect rect1)
    {
        return rect1.top <= rect.bottom;
    }

    private boolean shouldRemoveHeader(Rect rect, Rect rect1)
    {
        return rect1.bottom > rect.bottom;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        int ai[];
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        ai = PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).getHeaderPositions();
        getHeaderContainerHitRect(PeoplePickerListWrapper.access$500(PeoplePickerListWrapper.this));
        k = 0;
_L2:
        int l;
        if (k >= ai.length)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        l = ai[k];
        if (l >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!PeoplePickerListWrapper.access$600(PeoplePickerListWrapper.this).get(l))
        {
            PeoplePickerListWrapper.access$700(PeoplePickerListWrapper.this, l, k);
        }
_L4:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        if (l > i + j) goto _L4; else goto _L3
_L3:
        int i1 = l - i;
        View view = abslistview.getChildAt(i1);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        view.getHitRect(PeoplePickerListWrapper.access$800(PeoplePickerListWrapper.this));
        boolean flag = PeoplePickerListWrapper.access$600(PeoplePickerListWrapper.this).get(l);
        PLog.logv("%d ChildRect %s: %d HeaderRect %s isHeaderAdded %b", new Object[] {
            Integer.valueOf(i1), PeoplePickerListWrapper.access$800(PeoplePickerListWrapper.this).flattenToString(), Integer.valueOf(k), PeoplePickerListWrapper.access$500(PeoplePickerListWrapper.this).flattenToString(), Boolean.valueOf(flag)
        });
        if (!flag && shouldDrawHeader(PeoplePickerListWrapper.access$500(PeoplePickerListWrapper.this), PeoplePickerListWrapper.access$800(PeoplePickerListWrapper.this)))
        {
            PeoplePickerListWrapper.access$700(PeoplePickerListWrapper.this, l, k);
        } else
        if (flag && shouldRemoveHeader(PeoplePickerListWrapper.access$500(PeoplePickerListWrapper.this), PeoplePickerListWrapper.access$800(PeoplePickerListWrapper.this)))
        {
            PeoplePickerListWrapper.access$900(PeoplePickerListWrapper.this, l);
        }
          goto _L4
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            PeoplePickerListWrapper.access$200(PeoplePickerListWrapper.this).saveTranslation();
            if (PeoplePickerListWrapper.access$300(PeoplePickerListWrapper.this))
            {
                PeoplePickerListWrapper.access$400(PeoplePickerListWrapper.this).requestFocusFromTouch();
                Device.showSoftKeyboard(PeoplePickerListWrapper.access$400(PeoplePickerListWrapper.this));
                PeoplePickerListWrapper.access$302(PeoplePickerListWrapper.this, false);
            }
        } else
        if (i == 1)
        {
            Device.hideSoftKeyboard(PeoplePickerListWrapper.access$400(PeoplePickerListWrapper.this));
            Device.hideSoftKeyboard(PeoplePickerListWrapper.access$200(PeoplePickerListWrapper.this));
            return;
        }
    }

    ()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
