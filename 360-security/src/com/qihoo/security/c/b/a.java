// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.c.b;

import android.content.Context;
import android.os.StatFs;
import com.qihoo360.common.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

public class a
{

    public static long[] a(Context context)
    {
        long al[] = new long[2];
        long[] _tmp = al;
        al[0] = 0L;
        al[1] = 0L;
        context = Utils.getInternalAndExternalSDPath(context);
        if (context == null || context.size() <= 0)
        {
            return al;
        }
        Iterator iterator = context.iterator();
        long l = 0L;
        long l1 = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            context = (String)iterator.next();
            try
            {
                context = new StatFs(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            if (context != null)
            {
                long l2 = context.getBlockSize();
                l1 += (long)context.getBlockCount() * l2;
                l = (long)context.getAvailableBlocks() * l2 + l;
            }
        } while (true);
        al[0] = l1;
        al[1] = l;
        return al;
    }
}
