// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


// Referenced classes of package com.urbanairship.actions:
//            ActionCompletionCallback, ActionService, ActionResult

class this._cls0
    implements ActionCompletionCallback
{

    final ActionService this$0;

    public void onFinish(ActionResult actionresult)
    {
        int _tmp = ActionService.access$010(ActionService.this);
        if (ActionService.access$000(ActionService.this) == 0)
        {
            stopSelf(ActionService.access$100(ActionService.this));
        }
    }

    Callback()
    {
        this$0 = ActionService.this;
        super();
    }
}
