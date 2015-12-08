// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleUtils

public final class PeopleCallLog
{

    public static transient void log(String s, Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        stringbuilder.append("(");
        s = "";
        int j = aobj.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aobj[i];
            stringbuilder.append(s);
            if (obj instanceof Bundle)
            {
                stringbuilder.append(PeopleUtils.writeBundle((Bundle)obj));
            } else
            {
                stringbuilder.append(obj);
            }
            s = ", ";
            i++;
        }
        stringbuilder.append(")");
        if (Log.isLoggable("PeopleClientCall", 2))
        {
            s = new Throwable("STACK TRACE (It's not crash!)");
        } else
        {
            s = null;
        }
        Log.d("PeopleClientCall", stringbuilder.toString(), s);
    }

    public static transient String toStringHelper(Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        boolean flag;
        if (aobj.length % 2 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        s = "";
        for (int i = 0; i < aobj.length; i += 2)
        {
            stringbuilder.append(s);
            stringbuilder.append(aobj[i]);
            stringbuilder.append("=");
            stringbuilder.append(aobj[i + 1]);
            s = ", ";
        }

        return stringbuilder.toString();
    }
}
