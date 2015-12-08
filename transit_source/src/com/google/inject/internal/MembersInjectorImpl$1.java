// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            ContextualCallable, MembersInjectorImpl, ErrorsException, Errors, 
//            InternalContext

class val.toolableOnly
    implements ContextualCallable
{

    final MembersInjectorImpl this$0;
    final Errors val$errors;
    final Object val$instance;
    final boolean val$toolableOnly;

    public volatile Object call(InternalContext internalcontext)
        throws ErrorsException
    {
        return call(internalcontext);
    }

    public Void call(InternalContext internalcontext)
        throws ErrorsException
    {
        injectMembers(val$instance, val$errors, internalcontext, val$toolableOnly);
        return null;
    }

    ()
    {
        this$0 = final_membersinjectorimpl;
        val$instance = obj;
        val$errors = errors1;
        val$toolableOnly = Z.this;
        super();
    }
}
