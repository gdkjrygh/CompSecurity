// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import android.view.View;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class a
    implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener
{

    final CreateThreadActivity a;

    a(CreateThreadActivity createthreadactivity)
    {
        a = createthreadactivity;
        super();
    }

    public void onGlobalFocusChanged(View view, View view1)
    {
        CreateThreadActivity.a(a, view, view1);
    }
}
