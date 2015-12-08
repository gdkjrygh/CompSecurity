// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            Initializable, ErrorsException, Errors

final class Initializables
{

    Initializables()
    {
    }

    static Initializable of(Object obj)
    {
        return new Initializable(obj) {

            final Object val$instance;

            public Object get(Errors errors)
                throws ErrorsException
            {
                return instance;
            }

            public String toString()
            {
                return String.valueOf(instance);
            }

            
            {
                instance = obj;
                super();
            }
        };
    }
}
