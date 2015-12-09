// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.c;

import android.content.Context;
import com.fitbit.e.a;
import java.io.File;

// Referenced classes of package com.fitbit.food.barcode.c:
//            b

public class c
{

    private static final String a = "NutritionixFilesUtils";

    public c()
    {
    }

    public static void a(Context context)
    {
        com.fitbit.e.a.d("NutritionixFilesUtils", "start deleting uploaded files", new Object[0]);
        context = com.fitbit.food.barcode.c.b.a(context);
        if (context.isDirectory())
        {
            String as[] = context.list();
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                File file = new File(context, as[i]);
                String s = file.getAbsolutePath();
                file.delete();
                com.fitbit.e.a.d("NutritionixFilesUtils", (new StringBuilder()).append("file has been deleted: ").append(s).toString(), new Object[0]);
            }

        }
    }
}
