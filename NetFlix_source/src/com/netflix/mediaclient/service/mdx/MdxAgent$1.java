// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxAgent, TargetSelector

class this._cls0
    implements Runnable
{

    final MdxAgent this$0;

    public void run()
    {
        MdxAgent.access$002(MdxAgent.this, new TargetSelector(MdxAgent.access$100(MdxAgent.this), MdxAgent.this));
    }

    tor()
    {
        this$0 = MdxAgent.this;
        super();
    }
}
