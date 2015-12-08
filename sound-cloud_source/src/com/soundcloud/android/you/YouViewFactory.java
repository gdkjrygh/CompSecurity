// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.view.View;

// Referenced classes of package com.soundcloud.android.you:
//            YouView

public class YouViewFactory
{

    public YouViewFactory()
    {
    }

    public YouView create(View view, YouView.Listener listener)
    {
        return new YouView(view, listener);
    }
}
