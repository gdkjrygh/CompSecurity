// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvik;

import android.util.Log;

// Referenced classes of package com.facebook.dalvik:
//            DalvikLinearAllocType, DalvikInternals

public class DalvikReplaceBuffer
{

    private static String a = "";
    private static Result b;

    public DalvikReplaceBuffer()
    {
    }

    public static Result a()
    {
        return b;
    }

    public static boolean a(DalvikLinearAllocType dalviklinearalloctype)
    {
        while (android.os.Build.VERSION.SDK_INT >= 21 || c() >= dalviklinearalloctype.bufferSizeBytes) 
        {
            return false;
        }
        b(dalviklinearalloctype);
        return true;
    }

    public static String b()
    {
        if (a() == Result.FAILURE)
        {
            return a;
        } else
        {
            throw new IllegalStateException("No failure string is provided when the operation did not fail.");
        }
    }

    public static void b(DalvikLinearAllocType dalviklinearalloctype)
    {
        if (b != Result.NOT_ATTEMPTED)
        {
            Log.e("DalvikReplaceBuffer", "Multiple attempts to replace the buffer detected!");
            return;
        }
        try
        {
            DalvikInternals.fixLinearAllocBuffer(dalviklinearalloctype.bufferSizeBytes);
            b = Result.SUCCESS;
            return;
        }
        catch (Throwable throwable)
        {
            b = Result.FAILURE;
            a = throwable.getMessage();
            Log.e("DalvikReplaceBuffer", (new StringBuilder("Failed to replace LinearAlloc buffer (at size ")).append(dalviklinearalloctype.bufferSizeBytes).append("). Continuing with standard buffer.").toString(), throwable);
            return;
        }
    }

    private static int c()
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 11)
        {
            return 0x500000;
        }
        return i >= 16 ? 0x1000000 : 0x800000;
    }

    static 
    {
        b = Result.NOT_ATTEMPTED;
    }

    private class Result extends Enum
    {

        private static final Result $VALUES[];
        public static final Result FAILURE;
        public static final Result NOT_ATTEMPTED;
        public static final Result SUCCESS;

        public static Result valueOf(String s)
        {
            return (Result)Enum.valueOf(com/facebook/dalvik/DalvikReplaceBuffer$Result, s);
        }

        public static Result[] values()
        {
            return (Result[])$VALUES.clone();
        }

        static 
        {
            NOT_ATTEMPTED = new Result("NOT_ATTEMPTED", 0);
            FAILURE = new Result("FAILURE", 1);
            SUCCESS = new Result("SUCCESS", 2);
            $VALUES = (new Result[] {
                NOT_ATTEMPTED, FAILURE, SUCCESS
            });
        }

        private Result(String s, int i)
        {
            super(s, i);
        }
    }

}
