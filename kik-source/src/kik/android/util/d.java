// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.c.a.d.h;
import java.io.File;
import java.io.IOException;
import kik.a.h.c;

// Referenced classes of package kik.android.util:
//            bx

public final class d extends c
{

    public static void a(File file, File file1)
    {
        boolean flag1 = true;
        if (file != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
          goto _L3
_L2:
        flag = flag1;
        if (!file.exists()) goto _L3; else goto _L4
_L4:
        if (!file.isDirectory()) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (file.list().length == 0) goto _L3; else goto _L6
_L6:
        flag = false;
_L3:
        if (flag || b(file, file1))
        {
            return;
        } else
        {
            bx.a(new Exception((new StringBuilder("File migration failed for ")).append(file1.getName()).toString()));
            return;
        }
    }

    private static boolean b(File file, File file1)
    {
        if (file == null || !file.exists() || file1 == null)
        {
            return false;
        }
        try
        {
            if (file1.exists())
            {
                c.a(file1, false, null);
            }
            h.a(file, file1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return true;
    }
}
