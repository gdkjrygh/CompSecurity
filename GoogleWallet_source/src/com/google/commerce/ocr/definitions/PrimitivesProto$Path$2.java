// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.commerce.ocr.definitions;


// Referenced classes of package com.google.commerce.ocr.definitions:
//            PrimitivesProto

final class nstraint
    implements com.google.protobuf.nverter
{

    private static nstraint convert(Integer integer)
    {
        nstraint nstraint = com.google.commerce.ocr.definitions.nstraint.valueOf(integer.intValue());
        integer = nstraint;
        if (nstraint == null)
        {
            integer = nstraint.CONSTRAINT_BOX;
        }
        return integer;
    }

    public final volatile Object convert(Object obj)
    {
        return convert((Integer)obj);
    }

    nstraint()
    {
    }
}
