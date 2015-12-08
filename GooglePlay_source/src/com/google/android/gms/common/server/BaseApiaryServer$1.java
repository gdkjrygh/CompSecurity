// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import java.util.Stack;

// Referenced classes of package com.google.android.gms.common.server:
//            BaseApiaryServer

final class this._cls0 extends ThreadLocal
{

    final BaseApiaryServer this$0;

    protected final volatile Object initialValue()
    {
        return new Stack();
    }

    ()
    {
        this$0 = BaseApiaryServer.this;
        super();
    }
}
