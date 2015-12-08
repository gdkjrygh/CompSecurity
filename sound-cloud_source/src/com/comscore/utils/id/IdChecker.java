// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.id;

import android.content.Context;
import android.os.Build;
import com.comscore.utils.Storage;
import com.comscore.utils.Utils;

public class IdChecker
{

    private static final String a[] = {
        "0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"
    };
    private Context b;
    private boolean c;
    private String d;
    private Storage e;

    public IdChecker(Context context, Storage storage)
    {
        b = context;
        e = storage;
        c = false;
    }

    private boolean a(String s, String s1)
    {
        boolean flag1 = false;
        s1 = e.get(s1).split(";");
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < s1.length)
                {
                    if (!s1[i].equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private String b()
    {
        String s = null;
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
        {
            s = Build.SERIAL;
        }
        return s;
    }

    private void b(String s, String s1)
    {
        String s3 = e.get(s1);
        String s2 = s;
        if (s3.length() > 0)
        {
            s2 = (new StringBuilder()).append(s3).append(";").append(s).toString();
        }
        e.set(s1, s2);
    }

    private String c()
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
        {
            String s = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
            if (s != null && s.length() > 0)
            {
                return s;
            }
        }
        return null;
    }

    protected String a()
    {
        String s;
        boolean flag1;
label0:
        {
            flag1 = false;
            if (c)
            {
                return d;
            }
            c = true;
            String s1 = b();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s1 = c();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        int i = 0;
        do
        {
label1:
            {
                boolean flag = flag1;
                if (i < a.length)
                {
                    if (!a[i].equals(s))
                    {
                        break label1;
                    }
                    flag = true;
                }
                if (flag)
                {
                    d = s;
                    return s;
                } else
                {
                    return null;
                }
            }
            i++;
        } while (true);
    }

    public boolean checkCrossPublisherId(String s)
    {
        String s1;
        if (s != null && s.length() != 0)
        {
            if ((s1 = a()) != null && !a(s1, "adIdCheckData"))
            {
                b(s1, "adIdCheckData");
                if (Utils.md5(s1).equals(s))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkVisitorId()
    {
        String s;
        for (s = a(); s == null || a(s, "idCheckData");)
        {
            return true;
        }

        b(s, "idCheckData");
        return false;
    }

}
