// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.MembersInjector;
import com.google.inject.internal.util.$Preconditions;

// Referenced classes of package com.google.inject.spi:
//            MembersInjectorLookup

class this._cls0
    implements MembersInjector
{

    final MembersInjectorLookup this$0;

    public void injectMembers(Object obj)
    {
        boolean flag;
        if (MembersInjectorLookup.access$000(MembersInjectorLookup.this) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "This MembersInjector cannot be used until the Injector has been created.");
        MembersInjectorLookup.access$000(MembersInjectorLookup.this).injectMembers(obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("MembersInjector<").append(MembersInjectorLookup.access$100(MembersInjectorLookup.this)).append(">").toString();
    }

    ()
    {
        this$0 = MembersInjectorLookup.this;
        super();
    }
}
