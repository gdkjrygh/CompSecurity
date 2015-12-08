// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations

class this._cls0
    implements f
{

    final MyProfileOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        return MyProfileOperations.access$100(MyProfileOperations.this, -1L).subscribeOn(MyProfileOperations.access$000(MyProfileOperations.this));
    }

    ()
    {
        this$0 = MyProfileOperations.this;
        super();
    }
}
