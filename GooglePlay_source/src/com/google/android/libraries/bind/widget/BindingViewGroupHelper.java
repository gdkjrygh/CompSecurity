// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.widget;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.libraries.bind.card.CardGroup;
import com.google.android.libraries.bind.data.BindingViewGroup;
import com.google.android.libraries.bind.data.Bound;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.libraries.bind.data.DataView;
import com.google.android.libraries.bind.data.DataViewHelper;
import com.google.android.libraries.bind.util.Util;

public final class BindingViewGroupHelper extends DataViewHelper
{

    static final Paint blendPaint = new Paint();
    long blendBitmapDurationMs;
    long blendBitmapStartTimeMs;
    int blendMode$204c4ecf;
    Bitmap blendedBitmap;
    boolean blendedBitmapDstComputed;
    final Rect blendedBitmapDstRect = new Rect();
    final Rect blendedBitmapSrcRect = new Rect();
    Data boundData;
    public boolean capturing;
    CardGroup cardGroup;
    int cardGroupPosition;
    boolean isOwnedByParent;
    boolean supportsAnimationCapture;
    final ViewGroup viewGroup;

    public BindingViewGroupHelper(DataView dataview)
    {
        super(dataview);
        cardGroupPosition = -1;
        Util.checkPrecondition(dataview instanceof BindingViewGroup);
        Util.checkPrecondition(dataview instanceof ViewGroup);
        viewGroup = (ViewGroup)dataview;
    }

    public static void markDescendantsAsOwned(ViewGroup viewgroup)
    {
        for (int i = viewgroup.getChildCount() - 1; i >= 0; i--)
        {
            android.view.View view = viewgroup.getChildAt(i);
            if (!(view instanceof ViewGroup))
            {
                continue;
            }
            if (view instanceof BindingViewGroup)
            {
                ((BindingViewGroup)view).setOwnedByParent$1385ff();
            }
            markDescendantsAsOwned((ViewGroup)view);
        }

    }

    final void clearBlendedBitmap()
    {
        if (blendedBitmap != null)
        {
            blendedBitmap = null;
            blendMode$204c4ecf = 0;
            blendBitmapStartTimeMs = 0L;
            blendBitmapDurationMs = 0L;
            blendedBitmapDstComputed = false;
            viewGroup.setWillNotDraw(true);
        }
    }

    public final Data getData()
    {
        if (super.dataRow != null)
        {
            return super.dataRow.getData(0);
        } else
        {
            return boundData;
        }
    }

    void sendDataToChildrenWhoWantIt(ViewGroup viewgroup, Data data)
    {
        int j = viewgroup.getChildCount();
        int i = 0;
        while (i < j) 
        {
            android.view.View view = viewgroup.getChildAt(i);
            if (view instanceof BindingViewGroup)
            {
                if (((BindingViewGroup)view).isOwnedByParent())
                {
                    ((BindingViewGroup)view).onDataUpdated(data);
                }
            } else
            if (view instanceof Bound)
            {
                ((Bound)view).updateBoundData(data);
            }
            if ((view instanceof ViewGroup) && !(view instanceof BindingViewGroup))
            {
                sendDataToChildrenWhoWantIt((ViewGroup)view, data);
            }
            i++;
        }
    }

    public final void setDataRow(DataList datalist)
    {
        boundData = null;
        super.setDataRow(datalist);
    }

}
