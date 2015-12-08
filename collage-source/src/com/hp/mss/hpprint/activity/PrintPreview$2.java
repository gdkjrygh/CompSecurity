// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.activity;

import com.hp.mss.hpprint.util.f;

// Referenced classes of package com.hp.mss.hpprint.activity:
//            PrintPreview

class a
    implements com.hp.mss.hpprint.util.w._cls2
{

    final PrintPreview a;

    public void a()
    {
        if (f.c)
        {
            a.b();
            return;
        } else
        {
            a.a();
            return;
        }
    }

    public void b()
    {
        PrintPreview.a(a, false);
        a.invalidateOptionsMenu();
    }

    (PrintPreview printpreview)
    {
        a = printpreview;
        super();
    }
}
