// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.view.View;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class this._cls0
    implements android.view.ChangeListener
{

    final PagingIndicator this$0;

    public final void onViewAttachedToWindow(View view)
    {
        PagingIndicator.access$002(PagingIndicator.this, true);
    }

    public final void onViewDetachedFromWindow(View view)
    {
        PagingIndicator.access$002(PagingIndicator.this, false);
    }

    I()
    {
        this$0 = PagingIndicator.this;
        super();
    }
}
