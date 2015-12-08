// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import com.amobee.richmedia.controller.util.OrmmaPlayerListener;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeActionHandler

class this._cls0
    implements OrmmaPlayerListener
{

    final AmobeeActionHandler this$0;

    public void onComplete()
    {
        finish();
    }

    public void onError()
    {
        finish();
    }

    public void onPrepared()
    {
    }

    Listener()
    {
        this$0 = AmobeeActionHandler.this;
        super();
    }
}
