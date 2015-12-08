// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory

public final class DelegateFactory
    implements Factory
{

    private Provider _flddelegate;

    public DelegateFactory()
    {
    }

    public final Object get()
    {
        if (_flddelegate == null)
        {
            throw new IllegalStateException();
        } else
        {
            return _flddelegate.get();
        }
    }

    public final void setDelegatedProvider(Provider provider)
    {
        if (provider == null)
        {
            throw new IllegalArgumentException();
        }
        if (_flddelegate != null)
        {
            throw new IllegalStateException();
        } else
        {
            _flddelegate = provider;
            return;
        }
    }
}
