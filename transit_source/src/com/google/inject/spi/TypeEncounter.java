// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;

// Referenced classes of package com.google.inject.spi:
//            Message, InjectionListener

public interface TypeEncounter
{

    public abstract void addError(Message message);

    public transient abstract void addError(String s, Object aobj[]);

    public abstract void addError(Throwable throwable);

    public abstract MembersInjector getMembersInjector(TypeLiteral typeliteral);

    public abstract MembersInjector getMembersInjector(Class class1);

    public abstract Provider getProvider(Key key);

    public abstract Provider getProvider(Class class1);

    public abstract void register(MembersInjector membersinjector);

    public abstract void register(InjectionListener injectionlistener);
}
