// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import com.pandora.android.coachmark.e;
import com.pandora.android.util.q;
import com.pandora.radio.data.SearchDescriptor;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity

private static class <init>
    implements Runnable
{

    private Intent a;
    private e b;
    private int c;
    private WeakReference d;

    public void run()
    {
        if (a.getBooleanExtra("showCoachmark", false)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.pandora.android.coachmark.init> init> = (com.pandora.android.coachmark.)Enum.valueOf(com/pandora/android/coachmark/e$e, a.getStringExtra("showCoachmarkType"));
        switch (d[init>.()])
        {
        default:
            return;

        case 1: // '\001'
            if (com.pandora.android.coachmark.e.f())
            {
                Object obj = (HomeTabsActivity)d.get();
                if (obj != null)
                {
                    obj = ((HomeTabsActivity) (obj)).findViewById(c);
                    q.a(b, ((android.view.View) (obj)));
                    return;
                }
            }
            break;

        case 2: // '\002'
            SearchDescriptor searchdescriptor = (SearchDescriptor)a.getParcelableExtra("intent_search_descriptor");
            q.a(b, searchdescriptor.e());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private (Intent intent, e e1, HomeTabsActivity hometabsactivity, int i)
    {
        a = intent;
        b = e1;
        c = i;
        d = new WeakReference(hometabsactivity);
    }

    d(Intent intent, e e1, HomeTabsActivity hometabsactivity, int i, d d1)
    {
        this(intent, e1, hometabsactivity, i);
    }
}
