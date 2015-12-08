// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            ExtendableMessageNano, FieldArray

public final class InternalNano
{

    public static final Object LAZY_INIT_LOCK = new Object();

    public static void cloneUnknownFieldData(ExtendableMessageNano extendablemessagenano, ExtendableMessageNano extendablemessagenano1)
    {
        if (extendablemessagenano.unknownFieldData != null)
        {
            extendablemessagenano1.unknownFieldData = extendablemessagenano.unknownFieldData.clone();
        }
    }

}
