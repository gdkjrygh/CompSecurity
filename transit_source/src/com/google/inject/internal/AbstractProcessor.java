// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.DefaultElementVisitor;
import com.google.inject.spi.Element;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            Errors, InjectorShell, InjectorImpl

abstract class AbstractProcessor extends DefaultElementVisitor
{

    protected Errors errors;
    protected InjectorImpl injector;

    protected AbstractProcessor(Errors errors1)
    {
        errors = errors1;
    }

    public void process(InjectorImpl injectorimpl, List list)
    {
        Errors errors1;
        errors1 = errors;
        injector = injectorimpl;
        injectorimpl = list.iterator();
        do
        {
            if (!injectorimpl.hasNext())
            {
                break;
            }
            list = (Element)injectorimpl.next();
            errors = errors1.withSource(list.getSource());
            if (((Boolean)list.acceptVisitor(this)).booleanValue())
            {
                injectorimpl.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_88;
        injectorimpl;
        errors = errors1;
        injector = null;
        throw injectorimpl;
        errors = errors1;
        injector = null;
        return;
    }

    public void process(Iterable iterable)
    {
        InjectorShell injectorshell;
        for (iterable = iterable.iterator(); iterable.hasNext(); process(injectorshell.getInjector(), injectorshell.getElements()))
        {
            injectorshell = (InjectorShell)iterable.next();
        }

    }

    protected Boolean visitOther(Element element)
    {
        return Boolean.valueOf(false);
    }

    protected volatile Object visitOther(Element element)
    {
        return visitOther(element);
    }
}
