// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import com.android.internal.util.Predicate;

// Referenced classes of package com.urbanairship.actions:
//            ActionRegistry, Situation, ActionArguments

class this._cls0
    implements Predicate
{

    final ActionRegistry this$0;

    public boolean apply(ActionArguments actionarguments)
    {
        return !Situation.PUSH_RECEIVED.equals(actionarguments.getSituation());
    }

    public volatile boolean apply(Object obj)
    {
        return apply((ActionArguments)obj);
    }

    ()
    {
        this$0 = ActionRegistry.this;
        super();
    }
}
