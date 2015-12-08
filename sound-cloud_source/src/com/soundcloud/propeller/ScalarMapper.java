// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;


// Referenced classes of package com.soundcloud.propeller:
//            ResultMapper, CursorReader

public class ScalarMapper
    implements ResultMapper
{

    private final Class scalarType;

    ScalarMapper(Class class1)
    {
        scalarType = class1;
    }

    public static ScalarMapper create(Class class1)
    {
        return new ScalarMapper(class1);
    }

    public Object map(CursorReader cursorreader)
    {
        if (scalarType == java/lang/Integer)
        {
            return scalarType.cast(Integer.valueOf(cursorreader.getInt(0)));
        }
        if (scalarType == java/lang/Long)
        {
            return scalarType.cast(Long.valueOf(cursorreader.getLong(0)));
        }
        if (scalarType == java/lang/Short)
        {
            return scalarType.cast(Short.valueOf(cursorreader.getShort(0)));
        }
        if (scalarType == java/lang/Float)
        {
            return scalarType.cast(Float.valueOf(cursorreader.getFloat(0)));
        }
        if (scalarType == java/lang/Double)
        {
            return scalarType.cast(Double.valueOf(cursorreader.getDouble(0)));
        }
        if (scalarType == java/lang/String)
        {
            return scalarType.cast(cursorreader.getString(0));
        }
        if (scalarType == java/lang/Boolean)
        {
            Class class1 = scalarType;
            if (cursorreader.getInt(0) == 1)
            {
                cursorreader = Boolean.TRUE;
            } else
            {
                cursorreader = Boolean.FALSE;
            }
            return class1.cast(cursorreader);
        }
        if (scalarType == [B)
        {
            return scalarType.cast(cursorreader.getBlob(0));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal type: ")).append(scalarType.getCanonicalName()).append("; only primitive types allowed").toString());
        }
    }
}
