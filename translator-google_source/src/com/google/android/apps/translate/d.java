// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.view.View;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.a.c;
import com.google.android.libraries.translate.offline.a.i;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.apps.translate:
//            HomeListView, r

final class d
    implements android.view.View.OnClickListener
{

    final o a;
    final OfflinePackage b[];
    final HomeListView c;

    d(HomeListView homelistview, o o, OfflinePackage aofflinepackage[])
    {
        c = homelistview;
        a = o;
        b = aofflinepackage;
        super();
    }

    public final void onClick(View view)
    {
        c.getContext();
        if (i.a(a, b))
        {
            (new c(c.getContext(), a, 25)).a(b);
            return;
        }
        try
        {
            m.a(r.msg_external_storage_insufficient_available_space, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            m.a(view.getErrorMessage(c.getContext()), 1);
        }
        return;
    }
}
