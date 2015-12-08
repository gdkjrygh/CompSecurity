// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity_, UserAddLocation

class this._cls0
    implements android.view.er
{

    final UserAddLocation this$0;

    public void onClick(View view)
    {
        StoreListActivity_.intent(UserAddLocation.this).addressIndex(UserAddLocation.access$2300(UserAddLocation.this)).startForResult(49);
    }

    .IntentBuilder_()
    {
        this$0 = UserAddLocation.this;
        super();
    }
}
