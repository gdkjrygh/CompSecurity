// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.data.validator;

import java.lang.annotation.Annotation;

// Referenced classes of package com.htc.blinkfeed.data.validator:
//            ConstraintValidator

public class NotNullValidator
    implements ConstraintValidator
{

    public NotNullValidator()
    {
    }

    public void init(Annotation annotation)
    {
    }

    public boolean validate(Object obj)
    {
        return obj != null;
    }
}
