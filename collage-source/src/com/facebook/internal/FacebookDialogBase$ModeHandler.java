// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            FacebookDialogBase, AppCall

protected abstract class this._cls0
{

    final FacebookDialogBase this$0;

    public abstract boolean canShow(Object obj);

    public abstract AppCall createAppCall(Object obj);

    public Object getMode()
    {
        return FacebookDialogBase.BASE_AUTOMATIC_MODE;
    }

    protected ()
    {
        this$0 = FacebookDialogBase.this;
        super();
    }
}
