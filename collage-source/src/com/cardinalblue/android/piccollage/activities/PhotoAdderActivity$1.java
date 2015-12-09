// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoAdderActivity

class a
    implements android.view.lityChangeListener
{

    final PhotoAdderActivity a;

    public void onSystemUiVisibilityChange(int i)
    {
        if ((i & 4) == 0)
        {
            PhotoAdderActivity.b(a).sendEmptyMessageDelayed(0, 1000L);
        }
    }

    I(PhotoAdderActivity photoadderactivity)
    {
        a = photoadderactivity;
        super();
    }
}
