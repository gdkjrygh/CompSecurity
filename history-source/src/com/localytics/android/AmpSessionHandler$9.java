// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    public Object call(Object aobj[])
    {
        sendMessage(obtainMessage(19, ((Object) (aobj))));
        return null;
    }

    ()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
