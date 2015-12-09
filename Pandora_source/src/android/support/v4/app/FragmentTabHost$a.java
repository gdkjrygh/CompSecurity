// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            FragmentTabHost

static class a
    implements android.widget.Factory
{

    private final Context a;

    public View createTabContent(String s)
    {
        s = new View(a);
        s.setMinimumWidth(0);
        s.setMinimumHeight(0);
        return s;
    }

    public (Context context)
    {
        a = context;
    }
}
