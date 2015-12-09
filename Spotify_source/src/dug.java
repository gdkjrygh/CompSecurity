// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Locale;

public final class dug
{

    public static Bundle a(String s, String as[])
    {
        Bundle bundle = new Bundle();
        if (s == null)
        {
            return bundle;
        }
        String as1[] = s.split(",");
        int l = as1.length;
        int k = 0;
        int i = 0;
        while (k < l) 
        {
            String as2[] = as1[k].split("=");
            int j = i;
            if (as2.length == 2)
            {
                String s1 = as2[1].trim();
                s = s1;
                j = i;
                if (s1.equals("?"))
                {
                    if (as == null)
                    {
                        throw new IllegalArgumentException("selectionArgs cannot be null");
                    }
                    if (i >= as.length)
                    {
                        throw new IllegalArgumentException("too few values in selectionArgs");
                    }
                    s = as[i].trim();
                    j = i + 1;
                }
                s1 = as2[0].trim().toLowerCase(Locale.US);
                try
                {
                    bundle.putInt(s1, Integer.parseInt(s));
                }
                catch (NumberFormatException numberformatexception)
                {
                    bundle.putString(s1, s);
                }
            }
            k++;
            i = j;
        }
        return bundle;
    }
}
