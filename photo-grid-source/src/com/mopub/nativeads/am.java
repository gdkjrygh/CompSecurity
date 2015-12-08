// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;

// Referenced classes of package com.mopub.nativeads:
//            NativeResponse

final class am
    implements android.view.View.OnClickListener
{

    final NativeResponse a;

    am(NativeResponse nativeresponse)
    {
        a = nativeresponse;
        super();
    }

    public final void onClick(View view)
    {
        a.handleClick(view);
    }
}
