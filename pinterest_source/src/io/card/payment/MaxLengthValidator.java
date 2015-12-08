// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            NonEmptyValidator, Validator

class MaxLengthValidator extends NonEmptyValidator
    implements Validator
{

    private int maxLength;

    MaxLengthValidator(int i)
    {
        maxLength = i;
    }

    public boolean isValid()
    {
        return super.isValid() && getValue().length() <= maxLength;
    }
}
