// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.languages;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.b;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.android.libraries.translate.languages:
//            f, d, a

public class e
{

    private static e b;
    public AtomicReferenceArray a;

    private e()
    {
        a = new AtomicReferenceArray(2);
        b();
    }

    public static final d a(Context context)
    {
        return a().a(context, Locale.getDefault());
    }

    public static e a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/google/android/libraries/translate/languages/e;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new e();
        }
        com/google/android/libraries/translate/languages/e;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/google/android/libraries/translate/languages/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final d a(Context context, Locale locale)
    {
        for (int i = 0; i < 2; i++)
        {
            f f1 = (f)a.get(i);
            if (f1 != null && f1.b.equals(locale))
            {
                return f1.a;
            }
        }

        context = com.google.android.libraries.translate.core.b.a(context, locale);
        if (!TextUtils.isEmpty(context))
        {
            context = new d(context);
            locale = new f(context, locale);
            a.set(1, locale);
            return context;
        } else
        {
            return new d(Collections.unmodifiableList(a.a), Collections.unmodifiableList(com.google.android.libraries.translate.languages.a.b));
        }
    }

    public final void b()
    {
        a.set(1, null);
    }
}
