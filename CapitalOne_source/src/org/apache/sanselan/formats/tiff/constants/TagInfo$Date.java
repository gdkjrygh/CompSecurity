// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TagInfo

public class  extends TagInfo
{

    private static final DateFormat f = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    private static final DateFormat g = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");

    public final Object a(TiffField tifffield)
    {
        tifffield = ((TiffField) (tifffield.b.c(tifffield)));
        Object obj = (String)tifffield;
        java.util.Date date;
        try
        {
            date = f.parse(((String) (obj)));
        }
        catch (Exception exception1)
        {
            try
            {
                obj = g.parse(((String) (obj)));
            }
            catch (Exception exception)
            {
                Debug.a(exception);
                return tifffield;
            }
            return obj;
        }
        return date;
    }

    public final byte[] a(FieldType fieldtype, Object obj, int i)
    {
        throw new ImageWriteException((new StringBuilder("date encode value: ")).append(obj).append(" (").append(Debug.a(obj)).append(")").toString());
    }

    public String toString()
    {
        return (new StringBuilder("[TagInfo. tag: ")).append(b).append(", name: ").append(a).append(" (data)]").toString();
    }

}
