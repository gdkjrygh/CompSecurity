// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.MembersInjector;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Preconditions;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor

public final class MembersInjectorLookup
    implements Element
{

    private MembersInjector _flddelegate;
    private final Object source;
    private final TypeLiteral type;

    public MembersInjectorLookup(Object obj, TypeLiteral typeliteral)
    {
        source = $Preconditions.checkNotNull(obj, "source");
        type = (TypeLiteral)$Preconditions.checkNotNull(typeliteral, "type");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        initializeDelegate(binder.withSource(getSource()).getMembersInjector(type));
    }

    public MembersInjector getDelegate()
    {
        return _flddelegate;
    }

    public MembersInjector getMembersInjector()
    {
        return new MembersInjector() {

            final MembersInjectorLookup this$0;

            public void injectMembers(Object obj)
            {
                boolean flag;
                if (_flddelegate != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $Preconditions.checkState(flag, "This MembersInjector cannot be used until the Injector has been created.");
                _flddelegate.injectMembers(obj);
            }

            public String toString()
            {
                return (new StringBuilder()).append("MembersInjector<").append(type).append(">").toString();
            }

            
            {
                this$0 = MembersInjectorLookup.this;
                super();
            }
        };
    }

    public Object getSource()
    {
        return source;
    }

    public TypeLiteral getType()
    {
        return type;
    }

    public void initializeDelegate(MembersInjector membersinjector)
    {
        boolean flag;
        if (_flddelegate == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "delegate already initialized");
        _flddelegate = (MembersInjector)$Preconditions.checkNotNull(membersinjector, "delegate");
    }


}
