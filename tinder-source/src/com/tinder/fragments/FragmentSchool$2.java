// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.adapters.k;
import com.tinder.model.School;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            FragmentSchool

final class a
    implements android.view.ner
{

    final FragmentSchool a;

    public final void onClick(View view)
    {
        for (view = FragmentSchool.a(a).iterator(); view.hasNext();)
        {
            ((School)view.next()).isDisplayed = false;
        }

        FragmentSchool.b(a);
        a.a(true);
        FragmentSchool.d(a).notifyDataSetChanged();
    }

    (FragmentSchool fragmentschool)
    {
        a = fragmentschool;
        super();
    }
}
