// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.widget.LoadingView;

// Referenced classes of package com.google.android.libraries.bind.data:
//            ViewProvider

static final class 
    implements ViewProvider
{

    public final View getView$70191498(ViewGroup viewgroup)
    {
        return new LoadingView(viewgroup.getContext());
    }

    ()
    {
    }
}
