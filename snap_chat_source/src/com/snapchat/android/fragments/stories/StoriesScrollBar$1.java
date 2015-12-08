// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.stories;

import android.content.res.Resources;
import android.view.View;
import zr;

// Referenced classes of package com.snapchat.android.fragments.stories:
//            StoriesScrollBar

final class a
    implements android.view.Listener
{

    private StoriesScrollBar a;

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (j == j1)
        {
            return;
        } else
        {
            view = a;
            float f = ((StoriesScrollBar) (view)).c.a();
            android.view.ams ams = ((StoriesScrollBar) (view)).a.getLayoutParams();
            ams.height = (int)(f * (float)((StoriesScrollBar) (view)).b.getHeight());
            ams.width = (int)view.getResources().getDimension(0x7f0a0128);
            ((StoriesScrollBar) (view)).a.setLayoutParams(ams);
            StoriesScrollBar.a(a);
            return;
        }
    }

    (StoriesScrollBar storiesscrollbar)
    {
        a = storiesscrollbar;
        super();
    }
}
