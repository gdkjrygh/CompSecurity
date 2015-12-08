// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import android.util.Log;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            b

public final class c
{

    private boolean a;
    private boolean b;
    private boolean c;

    protected c()
    {
        a = true;
        b = false;
        c = true;
    }

    protected c(boolean flag, boolean flag1)
    {
        a = true;
        b = false;
        c = true;
        a = flag;
        b = flag1;
        c = true;
    }

    private String a(String s)
    {
        StringBuilder stringbuilder;
        if (!c)
        {
            return s;
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        s = Thread.currentThread().getStackTrace();
        int j = 0;
        int k = s.length;
        int i = 0;
_L2:
        StackTraceElement stacktraceelement;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        stacktraceelement = s[i];
        j++;
        if (!stacktraceelement.getMethodName().contains("getStackTrace"))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        i = j + 4;
        try
        {
            stringbuilder.append(" ");
            stringbuilder.append(s[i].getMethodName());
            stringbuilder.append("()@");
            stringbuilder.append(s[i].getFileName());
            stringbuilder.append("_");
            stringbuilder.append(s[i].getLineNumber());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a("Error in getStackTraceInfo", ((Throwable) (s)));
        }
        return stringbuilder.toString();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(String s, Throwable throwable)
    {
        Log.w("MSA", s, throwable);
    }

    private void b(String s, int i, Throwable throwable)
    {
        int j;
        int l;
        if (s == null || !b || !Log.isLoggable("MSA", i))
        {
            break MISSING_BLOCK_LABEL_170;
        }
        l = s.length();
        j = 0;
_L2:
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        int k = Math.min(l, j + 4000);
        String s1 = a(s.substring(j, k));
        switch (i)
        {
        default:
            if (throwable == null)
            {
                Log.i("MSA", s1);
            } else
            {
                Log.i("MSA", s1, throwable);
            }
            break;

        case 5: // '\005'
            break MISSING_BLOCK_LABEL_134;

        case 6: // '\006'
            break; /* Loop/switch isn't completed */
        }
_L3:
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
        if (throwable == null)
        {
            Log.e("MSA", s1);
        } else
        {
            Log.e("MSA", s1, throwable);
        }
          goto _L3
        if (throwable == null)
        {
            Log.w("MSA", s1);
        } else
        {
            a(s1, throwable);
        }
          goto _L3
    }

    protected final void a(b b1)
    {
label0:
        {
            if (b1 != null)
            {
                if (!a)
                {
                    break label0;
                }
                b(b1.a(), 4, null);
            }
            return;
        }
        b(b1.b(), 4, null);
    }

    protected final void a(String s, int i, Throwable throwable)
    {
        b(s, i, throwable);
    }

    protected final void a(boolean flag)
    {
        a = flag;
    }

    protected final void b(boolean flag)
    {
        b = flag;
    }
}
