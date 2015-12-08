// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Function;

// Referenced classes of package com.google.inject.internal:
//            FailableCache, ErrorsException, Errors

class this._cls0
    implements $Function
{

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

    ()
    {
        this$0 = FailableCache.this;
        super();
    }
}
