// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.TypeLiteral;

// Referenced classes of package com.google.inject.internal:
//            FailableCache, MembersInjectorStore, ErrorsException, Errors, 
//            MembersInjectorImpl

class this._cls0 extends FailableCache
{

    final MembersInjectorStore this$0;

    protected MembersInjectorImpl create(TypeLiteral typeliteral, Errors errors)
        throws ErrorsException
    {
        return MembersInjectorStore.access$000(MembersInjectorStore.this, typeliteral, errors);
    }

    protected volatile Object create(Object obj, Errors errors)
        throws ErrorsException
    {
        return create((TypeLiteral)obj, errors);
    }

    ()
    {
        this$0 = MembersInjectorStore.this;
        super();
    }
}
