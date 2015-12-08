// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.widget:
//            PickerFragment, GraphObjectAdapter

class this._cls1
    implements r
{

    final is._cls0 this$1;

    public void onError(GraphObjectAdapter graphobjectadapter, FacebookException facebookexception)
    {
        if (PickerFragment.access$400(_fld0) != null)
        {
            PickerFragment.access$400(_fld0).Error(_fld0, facebookexception);
        }
    }

    r()
    {
        this$1 = this._cls1.this;
        super();
    }
}
