// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.util.Log;

public class lmj
{

    public lmj()
    {
    }

    public jyt a(jyn jyn1, String s, String s1)
    {
        return b(jyn1, s, s1);
    }

    public jyt b(jyn jyn1, String s, String s1)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("loadOwnerCoverPhoto");
            stringbuilder.append("(");
            String s2 = "";
            int i = 0;
            while (i < 2) 
            {
                Object obj = (new Object[] {
                    s, s1
                })[i];
                stringbuilder.append(s2);
                if (obj instanceof Bundle)
                {
                    stringbuilder.append(lnh.a((Bundle)obj));
                } else
                {
                    stringbuilder.append(obj);
                }
                s2 = ", ";
                i++;
            }
            stringbuilder.append(")");
            if (Log.isLoggable("PeopleClientCall", 2))
            {
                new Throwable("STACK TRACE (It's not crash!)");
            }
        }
        return jyn1.a(new ldc(this, jyn1, s, s1));
    }
}
