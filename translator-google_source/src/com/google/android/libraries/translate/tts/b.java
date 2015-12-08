// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.languages.Language;

// Referenced classes of package com.google.android.libraries.translate.tts:
//            e

public final class b
    implements e
{

    private final Context a;

    public static final int a(int i)
    {
        switch (i)
        {
        default:
            return f.msg_tts_general_error;

        case 1: // '\001'
            return f.msg_network_tts_error;

        case 2: // '\002'
            return f.msg_tts_volume_off;
        }
    }

    public final void b(int i)
    {
        m.a(a(i), 1);
    }

    public final void b(String s, Language language)
    {
        if (!((AccessibilityManager)Singleton.a.b()).isEnabled())
        {
            m.a(a.getString(f.msg_speaking, new Object[] {
                language.getLongName()
            }), 0);
        }
    }

    public final void j()
    {
    }

    public final void k()
    {
    }
}
