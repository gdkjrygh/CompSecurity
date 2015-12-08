// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.Context;
import android.text.TextUtils;
import com.fitbit.runtrack.data.a;
import com.fitbit.runtrack.data.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.domain:
//            b

public abstract class Type extends Enum
{

    private static final Type $VALUES[];
    public static final Type MOBILE_RUN;
    public final String value;

    private Type(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }


    public static Type getByTag(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            Type atype[] = values();
            int j = atype.length;
            int i = 0;
            while (i < j) 
            {
                Type type = atype[i];
                if (TextUtils.equals(s, type.value))
                {
                    return type;
                }
                i++;
            }
        }
        return null;
    }

    public static Type valueOf(String s)
    {
        return (Type)Enum.valueOf(com/fitbit/data/domain/Type, s);
    }

    public static Type[] values()
    {
        return (Type[])$VALUES.clone();
    }

    public abstract com.fitbit.data.domain.b getDetails(Context context, String s);

    static 
    {
        MOBILE_RUN = new Type("MOBILE_RUN", 0, "location_based_exercise") {

            public com.fitbit.data.domain.b getDetails(Context context, String s)
            {
                context = (new b()).a(UUID.fromString(s));
                if (context == null)
                {
                    return null;
                } else
                {
                    return new a(context);
                }
            }

        };
        $VALUES = (new Type[] {
            MOBILE_RUN
        });
    }
}
