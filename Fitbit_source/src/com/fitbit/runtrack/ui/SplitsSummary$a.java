// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.Split;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.ui.a.c;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack.ui:
//            SplitsSummary, l

public static class k extends c
{
    private static final class a
    {

        public final TextView a;
        public final View b;
        public final TextView c;

        public a(View view)
        {
            a = (TextView)view.findViewById(0x7f11045e);
            c = (TextView)view.findViewById(0x7f110460);
            b = view.findViewById(0x7f11045f);
        }
    }


    private final int a = 4000;
    private final int b = 5000;
    private final int c = 4;
    private final int d = 0;
    private final int e = 1;
    private final int f = 2;
    private final int g = 3;
    private final l h;
    private final ExerciseStat i;
    private final SparseIntArray j = new SparseIntArray();
    private final long k;
    private final long l;

    public void a(int i1, View view)
    {
        if (i1 == 1 || i1 == 3)
        {
            view.setBackgroundResource(0x7f02033b);
            return;
        } else
        {
            view.setBackgroundResource(0x7f02033c);
            return;
        }
    }

    public void a(int i1, a a1)
    {
        int j1;
        int k1;
        int l1;
        boolean flag;
        l1 = 0x7f020370;
        flag = true;
        j1 = ((flag) ? 1 : 0);
        k1 = l1;
        i1;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 89
    //                   2 99
    //                   3 46;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        j1 = 0;
        k1 = 0x7f020371;
_L6:
        a1.a.setCompoundDrawablesWithIntrinsicBounds(k1, 0, 0, 0);
        a1.a.setTypeface(a1.a.getTypeface(), j1);
        a1.c.setTypeface(a1.c.getTypeface(), j1);
        return;
_L2:
        k1 = 0x7f020371;
        j1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L3:
        j1 = 0;
        k1 = l1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getItemViewType(int i1)
    {
        return j.get(i1, 0);
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0401ab, viewgroup, false);
            view = new a(view1);
            view1.setTag(view);
            int j1 = getItemViewType(i1);
            a(j1, ((a) (view)).b);
            a(j1, view);
        }
        Split split = (Split)getItem(i1);
        long l1 = split.b().a(com.fitbit.data.domain.ts.METERS).a(TimeUnit.MILLISECONDS);
        a a1 = (a)view1.getTag();
        view = String.valueOf(i1 + 1);
        if (i1 == size() - 1)
        {
            view = an.a().b().t();
            double d1 = i.a().a(view).b();
            double d2 = i1;
            view = h.b(new Length(d1 - d2, view));
        }
        float f1 = ((float)(l1 - l) * 1.0F) / (float)(k - l);
        a1.b.getBackground().setLevel((int)(f1 * 5000F) + 4000);
        a1.a.setText(view);
        a1.c.setText(h.a(viewgroup.getContext(), split.b()));
        return view1;
    }

    public int getViewTypeCount()
    {
        return 4;
    }

    public boolean isEnabled(int i1)
    {
        return false;
    }

    public ts(l l1, ExerciseStat exercisestat, List list)
    {
        int j1 = 0;
        super(list, false);
        h = l1;
        i = exercisestat;
        j.put(list.size() - 1, 2);
        long l3 = 0x7fffffffffffffffL;
        long l2 = 0x8000000000000000L;
        int k1 = list.size();
        int i1 = 0;
        while (j1 < k1) 
        {
            l1 = ((Split)list.get(j1)).b().a(com.fitbit.data.domain.ts.METERS);
            if (l1 != null)
            {
                long l5 = l1.a(TimeUnit.MILLISECONDS);
                long l4 = l3;
                if (l5 < l3)
                {
                    l4 = l5;
                    i1 = j1;
                }
                if (l5 > l2)
                {
                    l3 = l4;
                    l2 = l5;
                } else
                {
                    l3 = l4;
                }
            }
            j1++;
        }
        j.put(i1, 1);
        if (i1 == list.size() - 1)
        {
            j.put(i1, 3);
        }
        l = l3;
        k = l2;
    }
}
