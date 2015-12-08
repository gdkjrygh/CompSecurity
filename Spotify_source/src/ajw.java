// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class ajw
{

    public static boolean a()
    {
        boolean flag;
        try
        {
            flag = (new File("/system/app/Superuser.apk")).exists();
        }
        catch (Exception exception)
        {
            return false;
        }
label0:
        {
            if (flag)
            {
                return true;
            }
            break label0;
        }
    }
}
