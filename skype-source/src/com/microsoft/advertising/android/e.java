// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.microsoft.advertising.android:
//            av, ac

final class e
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/e$a, s);
        }

        public static a[] values()
        {
            a aa[] = c;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("URL", 0);
            b = new a("PHONE", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Pattern d = Pattern.compile("^http://", 2);
    private static final Pattern e = Pattern.compile("^https://", 2);
    private static int f[];
    public a a;
    public String b;
    public String c;

    public e(a a1, String s, String s1)
    {
        a = a1;
        b = s;
        c = s1;
    }

    private static int[] a()
    {
        int ai[] = f;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[a.values().length];
        try
        {
            ai[a.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[a.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        f = ai;
        return ai;
    }

    public final void a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        try
        {
            throw new Exception("NULL context to AdAction.run()");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            av.c("AdAction", context.getMessage());
        }
_L10:
        return;
_L2:
        if (!ac.a(c, null))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = null;
        a()[a.ordinal()];
        JVM INSTR tableswitch 1 2: default 185
    //                   1 82
    //                   2 143;
           goto _L3 _L4 _L5
_L3:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context.startActivity(((Intent) (obj)));
        return;
_L4:
        obj = c;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L7; else goto _L6
_L6:
        obj = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        continue; /* Loop/switch isn't completed */
_L7:
        obj = d.matcher(((String) (obj)).trim()).replaceFirst("http://");
        obj = e.matcher(((CharSequence) (obj))).replaceFirst("https://");
          goto _L6
_L5:
        obj = new Intent("android.intent.action.CALL", Uri.parse(String.format("tel:%s", new Object[] {
            c
        })));
        if (true) goto _L3; else goto _L8
_L8:
        if (true) goto _L10; else goto _L9
_L9:
        av.c("URL access prohibited", c);
        return;
    }

    public final String toString()
    {
        switch (a()[a.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return "Browse";

        case 2: // '\002'
            return String.format("Call %s", new Object[] {
                c
            });
        }
    }

}
