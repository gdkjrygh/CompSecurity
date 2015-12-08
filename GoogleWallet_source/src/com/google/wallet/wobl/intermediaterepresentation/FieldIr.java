// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;


// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation, TextIr

public class FieldIr extends IntermediateRepresentation
{

    private TextIr fieldName;
    private TextIr fieldValue;

    public FieldIr()
    {
    }

    public TextIr getFieldName()
    {
        return fieldName;
    }

    public TextIr getFieldValue()
    {
        return fieldValue;
    }

    public void setFieldName(TextIr textir)
    {
        fieldName = textir;
    }

    public void setFieldValue(TextIr textir)
    {
        fieldValue = textir;
    }
}
