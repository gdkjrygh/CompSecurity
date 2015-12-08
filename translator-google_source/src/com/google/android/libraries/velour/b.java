// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour;

import android.content.Intent;
import java.net.URISyntaxException;

public final class b
{

    public static Intent a(Intent intent, Intent intent1)
    {
        intent = new Intent(intent);
        intent.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent1);
        return intent;
    }

    public static Intent a(Intent intent, ClassLoader classloader)
    {
        Intent intent2 = a(intent, "com.google.android.libraries.velour.INNER_INTENT_URI");
        Intent intent1 = intent2;
        if (intent2 == null)
        {
            intent1 = (Intent)intent.getParcelableExtra("com.google.android.libraries.velour.INNER_INTENT");
        }
        if (intent1 == null)
        {
            return null;
        } else
        {
            intent1.setExtrasClassLoader(classloader);
            return intent1;
        }
    }

    static Intent a(Intent intent, String s)
    {
        return a(intent.getStringExtra(s));
    }

    private static Intent a(String s)
    {
        if (s != null)
        {
            try
            {
                s = Intent.parseUri(s, 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            return s;
        } else
        {
            return null;
        }
    }
}
