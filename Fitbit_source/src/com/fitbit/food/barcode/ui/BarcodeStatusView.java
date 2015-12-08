// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BarcodeStatusView extends LinearLayout
{
    public static final class SearchStatus extends Enum
    {

        public static final SearchStatus a;
        public static final SearchStatus b;
        public static final SearchStatus c;
        public static final SearchStatus d;
        private static final SearchStatus e[];

        public static SearchStatus valueOf(String s)
        {
            return (SearchStatus)Enum.valueOf(com/fitbit/food/barcode/ui/BarcodeStatusView$SearchStatus, s);
        }

        public static SearchStatus[] values()
        {
            return (SearchStatus[])e.clone();
        }

        static 
        {
            a = new SearchStatus("NO_CONNECTION", 0);
            b = new SearchStatus("IN_PROGRESS", 1);
            c = new SearchStatus("STILL_IN_PROGRESS", 2);
            d = new SearchStatus("FINDED", 3);
            e = (new SearchStatus[] {
                a, b, c, d
            });
        }

        private SearchStatus(String s, int i)
        {
            super(s, i);
        }
    }


    protected TextView a;
    protected View b;
    private SearchStatus c;

    public BarcodeStatusView(Context context)
    {
        super(context);
        c = SearchStatus.b;
    }

    public BarcodeStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = SearchStatus.b;
    }

    public BarcodeStatusView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = SearchStatus.b;
    }

    public SearchStatus a()
    {
        return c;
    }

    public void a(SearchStatus searchstatus)
    {
        boolean flag = false;
        if (searchstatus == null) goto _L2; else goto _L1
_L1:
        c = searchstatus;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SearchStatus.values().length];
                try
                {
                    a[SearchStatus.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SearchStatus.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SearchStatus.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SearchStatus.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[searchstatus.ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 79
    //                   2 139
    //                   3 158
    //                   4 177;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_177;
_L3:
        throw new UnsupportedOperationException((new StringBuilder()).append("Incorrect BarcodeStatusView status: ").append(searchstatus).toString());
_L4:
        int i;
        int j;
        j = getContext().getResources().getColor(0x7f0f0027);
        i = 0x7f08007d;
_L8:
        setBackgroundColor(j);
        a.setText(i);
        if (SearchStatus.d == searchstatus)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        searchstatus = b;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        searchstatus.setVisibility(i);
        invalidate();
_L2:
        return;
_L5:
        j = getContext().getResources().getColor(0x7f0f001f);
        i = 0x7f08007c;
          goto _L8
_L6:
        j = getContext().getResources().getColor(0x7f0f001f);
        i = 0x7f08007e;
          goto _L8
        j = getContext().getResources().getColor(0x7f0f0026);
        i = 0x7f08007b;
          goto _L8
    }
}
