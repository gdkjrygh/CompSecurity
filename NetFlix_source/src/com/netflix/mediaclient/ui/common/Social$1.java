// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            Social

class this._cls0
    implements android.view.ickListener
{

    final Social this$0;

    public void onClick(View view)
    {
        Log.d("playcard", "Touch facebook!");
        Social.access$000(Social.this);
    }

    ()
    {
        this$0 = Social.this;
        super();
    }
}
