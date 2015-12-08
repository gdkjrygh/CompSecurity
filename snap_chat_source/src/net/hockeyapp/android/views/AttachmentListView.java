// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

public class AttachmentListView extends ViewGroup
{

    private static boolean b;
    private int a;

    public AttachmentListView(Context context)
    {
        super(context);
    }

    public final ArrayList a()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            arraylist.add(((AttachmentView)getChildAt(i)).b);
        }

        return arraylist;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.view.ViewGroup.LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(1, 1);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1 = getChildCount();
        l = getPaddingLeft();
        j = getPaddingTop();
        for (int j1 = 0; j1 < l1;)
        {
            View view = getChildAt(j1);
            int i1 = j;
            int k1 = l;
            if (view.getVisibility() != 8)
            {
                view.invalidate();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                i1 = j;
                k1 = l;
                if (l + i2 > k - i)
                {
                    k1 = getPaddingLeft();
                    i1 = j + a;
                }
                view.layout(k1, i1, k1 + i2, j2 + i1);
                j = layoutparams.width;
                k1 += ((AttachmentView)view).h + (i2 + j);
            }
            j1++;
            j = i1;
            l = k1;
        }

    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int j1;
        int l1;
        j1 = 0;
        if (!b && android.view.View.MeasureSpec.getMode(i) == 0)
        {
            throw new AssertionError();
        }
        l1 = android.view.View.MeasureSpec.getSize(i);
        int i2 = getChildCount();
        int k = getPaddingLeft();
        i = getPaddingTop();
        int k1 = 0;
        i1 = 0;
        while (k1 < i2) 
        {
            View view = getChildAt(k1);
            Object obj = (AttachmentView)view;
            int j2;
            if (((AttachmentView) (obj)).i == 1)
            {
                j1 = ((AttachmentView) (obj)).g;
            } else
            {
                j1 = ((AttachmentView) (obj)).e;
            }
            j1 += ((AttachmentView) (obj)).getPaddingTop();
            if (view.getVisibility() == 8)
            {
                continue;
            }
            obj = view.getLayoutParams();
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000));
            j2 = view.getMeasuredWidth();
            i1 = Math.max(i1, view.getMeasuredHeight() + ((android.view.ViewGroup.LayoutParams) (obj)).height);
            if (k + j2 > l1)
            {
                k = getPaddingLeft();
                i += i1;
            }
            k += ((android.view.ViewGroup.LayoutParams) (obj)).width + j2;
            k1++;
        }
        a = i1;
        if (android.view.View.MeasureSpec.getMode(j) != 0) goto _L2; else goto _L1
_L1:
        int l = i + i1 + getPaddingBottom();
_L4:
        setMeasuredDimension(l1, l);
        return;
_L2:
        l = j1;
        if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
        {
            l = j1;
            if (i + i1 + getPaddingBottom() < j1)
            {
                l = i + i1 + getPaddingBottom();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag;
        if (!net/hockeyapp/android/views/AttachmentListView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
