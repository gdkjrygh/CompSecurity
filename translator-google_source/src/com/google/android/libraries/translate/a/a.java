// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.a;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.unveil.textinput.TextInput;
import com.google.android.libraries.translate.b;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.c;
import java.util.Arrays;

public final class a
{

    public static final boolean a(Context context, Language language)
    {
        boolean flag;
        if (language == null || language.getShortName() == null)
        {
            flag = false;
        } else
        {
            boolean flag1 = TextInput.a(context, c.b(language.getShortName()), Arrays.asList(context.getResources().getStringArray(b.gtr_text_input_languages)));
            flag = flag1;
            if (flag1)
            {
                TextInput.a(context);
                return flag1;
            }
        }
        return flag;
    }
}
