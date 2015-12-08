// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Function;
import com.google.inject.internal.util.$MapMaker;
import java.util.Map;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors

public abstract class FailableCache
{

    private final Map _flddelegate = (new $MapMaker()).makeComputingMap(new $Function() {

        final FailableCache this$0;

        public Object apply(Object obj)
        {
            Errors errors = new Errors();
            Object obj1 = null;
            try
            {
                obj = create(obj, errors);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                errors.merge(((ErrorsException) (obj)).getErrors());
                obj = obj1;
            }
            if (errors.hasErrors())
            {
                return errors;
            } else
            {
                return obj;
            }
        }

            
            {
                this$0 = FailableCache.this;
                super();
            }
    });

    public FailableCache()
    {
    }

    protected abstract Object create(Object obj, Errors errors)
        throws ErrorsException;

    public Object get(Object obj, Errors errors)
        throws ErrorsException
    {
        obj = _flddelegate.get(obj);
        if (obj instanceof Errors)
        {
            errors.merge((Errors)obj);
            throw errors.toException();
        } else
        {
            return obj;
        }
    }

    boolean remove(Object obj)
    {
        return _flddelegate.remove(obj) != null;
    }
}
