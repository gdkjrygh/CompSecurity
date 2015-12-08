// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            FacebookActivity

class this._cls0
    implements android.widget.lickListener
{

    final FacebookActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        FacebookActivity.access$2402(FacebookActivity.this, (String)FacebookActivity.access$2500(FacebookActivity.this).getItemAtPosition(i));
        FacebookActivity.access$400(FacebookActivity.this).setDisplayedChild(0);
        FacebookActivity.access$2600(FacebookActivity.this).setText(FacebookActivity.access$2400(FacebookActivity.this));
    }

    I()
    {
        this$0 = FacebookActivity.this;
        super();
    }
}
