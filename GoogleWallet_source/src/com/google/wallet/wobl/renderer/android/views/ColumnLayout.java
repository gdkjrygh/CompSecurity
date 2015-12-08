// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.wallet.wobl.common.DisplayUnit;
import java.util.ArrayList;
import java.util.List;

public class ColumnLayout extends FrameLayout
{
    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
    {

        public int column;
        public int columnSpan;
        public int row;
        public int rowSpan;

        public static LayoutParams fromRendererLayoutParams(com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr.ColumnLayoutRendererLayoutParams columnlayoutrendererlayoutparams)
        {
            return new LayoutParams(columnlayoutrendererlayoutparams.getColumn(), columnlayoutrendererlayoutparams.getRow(), columnlayoutrendererlayoutparams.getColumnSpan(), columnlayoutrendererlayoutparams.getRowSpan());
        }

        public static LayoutParams getDefaultLayoutParams()
        {
            return new LayoutParams(0, 0, 1, 1);
        }

        public LayoutParams(int i, int j, int k, int l)
        {
            super(-2, -2);
            if (i < 0 || j < 0 || k <= 0 || l <= 0)
            {
                throw new InflateException("column, row must be a non-negative number, columnSpan and rowSpan must be a positive number");
            } else
            {
                column = i;
                row = j;
                columnSpan = k;
                rowSpan = l;
                return;
            }
        }
    }

    static class RowMeasurements
    {

        final int count;
        final int heights[];
        final int positions[];
        int totalHeight;

        void align(int i, int j)
        {
            int k = i - totalHeight;
            if (k >= 0) goto _L2; else goto _L1
_L1:
label0:
            {
                j = count - 1;
                do
                {
                    if (j < 0)
                    {
                        break label0;
                    }
                    k += heights[j];
                    positions[j + 1] = i;
                    if (k >= 0)
                    {
                        break;
                    }
                    heights[j] = 0;
                    j--;
                } while (true);
                heights[j] = k;
            }
_L4:
            return;
_L2:
            if (k <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            switch (j)
            {
            default:
                i = 0;
                break;

            case 16: // '\020'
                break; /* Loop/switch isn't completed */

            case 80: // 'P'
                break MISSING_BLOCK_LABEL_149;
            }
_L5:
            if (i > 0)
            {
                j = 0;
                while (j < positions.length) 
                {
                    int ai[] = positions;
                    ai[j] = ai[j] + i;
                    j++;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            i = k >> 1;
              goto _L5
            i = k;
              goto _L5
        }

        RowMeasurements(int i)
        {
            count = i;
            positions = new int[i + 1];
            heights = new int[i];
        }
    }


    private static final String TAG = com/google/wallet/wobl/renderer/android/views/ColumnLayout.getSimpleName();
    private List columnWidths;
    private final DisplayMetrics displayMetrics;
    private int verticalGravity;

    public ColumnLayout(Context context)
    {
        super(context);
        columnWidths = new ArrayList();
        displayMetrics = context.getResources().getDisplayMetrics();
        setClipToPadding(false);
    }

    public ColumnLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        columnWidths = new ArrayList();
        throw new InflateException("ColumnLayouts cannot be instantiated via Android XML");
    }

    public ColumnLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        columnWidths = new ArrayList();
        throw new InflateException("ColumnLayouts cannot be instantiated via Android XML");
    }

    private int getColumnCount()
    {
        return columnWidths.size();
    }

    private boolean shouldFillRemainingHeight(View view)
    {
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected volatile android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return LayoutParams.getDefaultLayoutParams();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    public int[] getColumnWidths(int i)
    {
        double d;
        int ai[];
        int j;
        int k;
        int l;
        ai = new int[getColumnCount()];
        l = 0;
        d = 0.0D;
        k = -1;
        j = 0;
_L2:
        if (j >= getColumnCount())
        {
            break MISSING_BLOCK_LABEL_271;
        }
        static class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit = new int[com.google.wallet.wobl.common.DisplayUnit.Unit.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.DP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.IN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.MM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.PT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.SP.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.PIXEL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$common$DisplayUnit$Unit[com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.wallet.wobl.common.DisplayUnit.Unit[((DisplayUnit)columnWidths.get(j)).getUnitType().ordinal()])
        {
        default:
            Log.w(TAG, (new StringBuilder(75)).append("No column width specified for column ").append(j).append(", defaulting to width of 0.").toString());
            columnWidths.set(j, DisplayUnit.ZERO);
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            break; /* Loop/switch isn't completed */

        case 7: // '\007'
            break MISSING_BLOCK_LABEL_243;
        }
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        ai[j] = ((DisplayUnit)columnWidths.get(j)).getPixel(displayMetrics.density, displayMetrics.scaledDensity, displayMetrics.xdpi);
        l += ((DisplayUnit)columnWidths.get(j)).getPixel(displayMetrics.density, displayMetrics.scaledDensity, displayMetrics.xdpi);
          goto _L3
        d += ((DisplayUnit)columnWidths.get(j)).getRawValue();
        k = j;
          goto _L3
        j = i - l;
        if (j >= 0) goto _L5; else goto _L4
_L4:
label0:
        {
            i = getColumnCount() - 1;
            do
            {
                if (i < 0)
                {
                    break label0;
                }
                j += ai[i];
                if (j >= 0)
                {
                    break;
                }
                ai[i] = 0;
                i--;
            } while (true);
            ai[i] = j;
        }
_L7:
        return ai;
_L5:
        if (k < 0)
        {
            continue;
        }
        int i1 = 0;
        i = j;
        do
        {
            int j1 = i;
            if (i1 >= getColumnCount())
            {
                continue;
            }
            if (i1 == k)
            {
                ai[i1] = j1;
                return ai;
            }
            i = j1;
            if (((DisplayUnit)columnWidths.get(i1)).getUnitType() == com.google.wallet.wobl.common.DisplayUnit.Unit.WEIGHT)
            {
                double d1;
                if (d == 0.0D)
                {
                    d1 = 0.0D;
                } else
                {
                    d1 = (double)((DisplayUnit)columnWidths.get(i1)).getRawValue() / d;
                }
                i = (int)((double)j * d1);
                ai[i1] = i;
                i = j1 - i;
            }
            i1++;
        } while (true);
        if (true) goto _L7; else goto _L6
_L6:
    }

    int getRowCount()
    {
        int j = 0;
        for (int i = 0; i < getChildCount(); i++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
            j = Math.max(j, layoutparams.row + layoutparams.rowSpan);
        }

        return j;
    }

    RowMeasurements getRowHeights(int i)
    {
        RowMeasurements rowmeasurements = new RowMeasurements(getRowCount());
        for (int j = 0; j < rowmeasurements.count; j++)
        {
            rowmeasurements.positions[j + 1] = rowmeasurements.positions[j];
            for (int l = 0; l < getChildCount(); l++)
            {
                View view = getChildAt(l);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if ((layoutparams.row + layoutparams.rowSpan) - 1 == j)
                {
                    int i1 = rowmeasurements.positions[layoutparams.row];
                    int j1 = view.getMeasuredHeight();
                    rowmeasurements.positions[j + 1] = Math.max(rowmeasurements.positions[j + 1], i1 + j1);
                }
            }

        }

        for (int k = 0; k < rowmeasurements.count; k++)
        {
            rowmeasurements.heights[k] = rowmeasurements.positions[k + 1] - rowmeasurements.positions[k];
            rowmeasurements.totalHeight = rowmeasurements.totalHeight + rowmeasurements.heights[k];
        }

        if (i != 0x7fffffff)
        {
            rowmeasurements.align(i, verticalGravity);
        }
        return rowmeasurements;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (flag)
        {
            int ai[] = getColumnWidths(k - i - getPaddingLeft() - getPaddingRight());
            RowMeasurements rowmeasurements = getRowHeights(l - j - getPaddingTop() - getPaddingBottom());
            k = 0;
            while (k < getChildCount()) 
            {
                View view = getChildAt(k);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    i = getPaddingLeft();
                    l = i;
                    int i1 = 0;
                    int j1;
                    do
                    {
                        j1 = i;
                        if (i1 >= ai.length)
                        {
                            break;
                        }
                        j = i;
                        if (i1 < layoutparams.column)
                        {
                            j = i + ai[i1];
                        }
                        j1 = j;
                        if (i1 >= layoutparams.column + layoutparams.columnSpan)
                        {
                            break;
                        }
                        l += ai[i1];
                        i1++;
                        i = j;
                    } while (true);
                    view.layout(j1, getPaddingTop() + rowmeasurements.positions[layoutparams.row], l, getPaddingTop() + rowmeasurements.positions[layoutparams.row + layoutparams.rowSpan]);
                }
                k++;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        RowMeasurements rowmeasurements;
        View view1;
        int i1;
        int j1;
        int j2;
        int k1 = android.view.View.MeasureSpec.getMode(i);
        j1 = android.view.View.MeasureSpec.getSize(i) - getPaddingLeft() - getPaddingRight();
        if (k1 == 0)
        {
            throw new InflateException("Unspecified MeasureSpec is unsupported");
        }
        int ai[] = getColumnWidths(j1);
        i = 0;
        int l1 = ai.length;
        for (int k = 0; k < l1; k++)
        {
            i += ai[k];
        }

        if (k1 == 0x80000000 && i < j1)
        {
            j1 = i;
        }
        for (i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            k1 = 0;
            for (int l = layoutparams.column; l < layoutparams.column + layoutparams.columnSpan; l++)
            {
                k1 += ai[l];
            }

            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }

        i1 = android.view.View.MeasureSpec.getMode(j);
        if (i1 == 0)
        {
            i = 0x7fffffff;
        } else
        {
            i = android.view.View.MeasureSpec.getSize(j) - getPaddingTop() - getPaddingBottom();
        }
        rowmeasurements = getRowHeights(i);
        if (i1 != 0x40000000)
        {
            i = rowmeasurements.totalHeight;
        }
        j = i;
        k1 = 0;
        if (k1 >= getChildCount())
        {
            break MISSING_BLOCK_LABEL_404;
        }
        view1 = getChildAt(k1);
        i1 = 0;
        if (k1 != getChildCount() - 1 || !shouldFillRemainingHeight(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = j;
_L4:
        view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
        j -= j2;
        k1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_226;
_L1:
        LayoutParams layoutparams1;
        int i2;
        layoutparams1 = (LayoutParams)view1.getLayoutParams();
        i2 = layoutparams1.row;
_L6:
        j2 = i1;
        if (i2 >= layoutparams1.row + layoutparams1.rowSpan) goto _L4; else goto _L3
_L3:
        j2 = i1;
        if (i2 >= rowmeasurements.count) goto _L4; else goto _L5
_L5:
        i1 += rowmeasurements.heights[i2];
        i2++;
          goto _L6
        setMeasuredDimension(j1 + (getPaddingLeft() + getPaddingRight()), i + (getPaddingTop() + getPaddingBottom()));
        return;
    }

    public void setColumnWidths(List list)
    {
        columnWidths = list;
        invalidate();
    }

    public void setVerticalGravity(int i)
    {
        verticalGravity = i & 0x70;
        invalidate();
    }

}
