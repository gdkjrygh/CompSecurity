// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.tinder.adapters.k;
import com.tinder.model.School;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentSchool

final class a
    implements android.widget.mClickListener
{

    final FragmentSchool a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = 0;
        int i1 = 0;
        while (j < FragmentSchool.a(a).size()) 
        {
            adapterview = (School)FragmentSchool.a(a).get(j);
            if (j == i)
            {
                if (i1 < FragmentSchool.e())
                {
                    boolean flag;
                    if (!((School) (adapterview)).isDisplayed)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adapterview.isDisplayed = flag;
                } else
                {
                    adapterview.isDisplayed = true;
                }
            } else
            if (i1 > FragmentSchool.e())
            {
                adapterview.isDisplayed = false;
            }
            if (((School) (adapterview)).isDisplayed)
            {
                i1++;
                if (i1 == FragmentSchool.e() + 1)
                {
                    j = -1;
                }
            }
            j++;
        }
        FragmentSchool.b(a);
        FragmentSchool.c(a);
        FragmentSchool.d(a).notifyDataSetChanged();
    }

    Listener(FragmentSchool fragmentschool)
    {
        a = fragmentschool;
        super();
    }
}
