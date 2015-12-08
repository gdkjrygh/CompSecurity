// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.api:
//            FormPart

public final class StringPart extends FormPart
{

    private final String value;

    StringPart(String s, String s1)
    {
        super(s, "text/plain; charset=UTF-8");
        value = s1;
    }

    public static StringPart from(String s, String s1)
    {
        return new StringPart(s, s1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof StringPart)
        {
            if (MoreObjects.equal(value, ((StringPart) (obj = (StringPart)obj)).value) && MoreObjects.equal(partName, ((StringPart) (obj)).partName) && MoreObjects.equal(contentType, ((StringPart) (obj)).contentType))
            {
                return true;
            }
        }
        return false;
    }

    public final String getValue()
    {
        return value;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            value, partName, contentType
        });
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("partName", partName).add("value", value).toString();
    }
}
