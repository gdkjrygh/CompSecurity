// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.maps.GoogleMap;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen

class this._cls0
    implements android.view.ener
{

    final BaseMapScreen this$0;

    public void onClick(View view)
    {
        view = BaseMapScreen.this;
        int i;
        boolean flag;
        if (BaseMapScreen.access$0(BaseMapScreen.this))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        BaseMapScreen.access$1(view, flag);
        view = BaseMapScreen.access$2(BaseMapScreen.this);
        if (BaseMapScreen.access$0(BaseMapScreen.this))
        {
            i = 0x7f0200a0;
        } else
        {
            i = 0x7f02009f;
        }
        view.setImageResource(i);
        if (getMap().getMyLocation() != null)
        {
            onMyLocationChange(getMap().getMyLocation());
        }
    }

    ()
    {
        this$0 = BaseMapScreen.this;
        super();
    }
}
