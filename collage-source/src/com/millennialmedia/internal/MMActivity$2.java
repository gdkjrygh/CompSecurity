// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal;


// Referenced classes of package com.millennialmedia.internal:
//            MMActivity

class a
    implements android.view.UiVisibilityChangeListener
{

    final MMActivity a;

    public void onSystemUiVisibilityChange(int i)
    {
        if ((i & 4) == 0)
        {
            MMActivity.a(a);
        }
    }

    geListener(MMActivity mmactivity)
    {
        a = mmactivity;
        super();
    }
}
