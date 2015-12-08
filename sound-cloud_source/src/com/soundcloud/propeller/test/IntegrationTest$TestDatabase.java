// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test;

import com.soundcloud.propeller.PropellerDatabase;
import org.junit.rules.ExternalResource;

// Referenced classes of package com.soundcloud.propeller.test:
//            IntegrationTest

public final class this._cls0 extends ExternalResource
{

    final IntegrationTest this$0;

    protected final void before()
        throws Throwable
    {
        IntegrationTest.access$002(IntegrationTest.this, provideDatabase());
        IntegrationTest.access$102(IntegrationTest.this, new PropellerDatabase(IntegrationTest.access$000(IntegrationTest.this)));
    }

    public ()
    {
        this$0 = IntegrationTest.this;
        super();
    }
}
