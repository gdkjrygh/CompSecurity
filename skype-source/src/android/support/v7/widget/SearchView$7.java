// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements android.view.hangeListener
{

    final SearchView a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (SearchView.c(a) != null)
        {
            SearchView.c(a).onFocusChange(a, flag);
        }
    }

    (SearchView searchview)
    {
        a = searchview;
        super();
    }
}
