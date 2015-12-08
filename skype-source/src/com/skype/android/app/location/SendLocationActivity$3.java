// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.view.View;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity

final class this._cls0
    implements android.view.ocationActivity._cls3
{

    final SendLocationActivity this$0;

    public final void onClick(View view)
    {
        if (!SendLocationActivity.access$400(SendLocationActivity.this) && SendLocationActivity.access$500(SendLocationActivity.this) != null)
        {
            SendLocationActivity.access$402(SendLocationActivity.this, true);
            onLocationChanged(SendLocationActivity.access$500(SendLocationActivity.this));
        }
    }

    ()
    {
        this$0 = SendLocationActivity.this;
        super();
    }
}
