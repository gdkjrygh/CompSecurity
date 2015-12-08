// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.os.Bundle;
import com.google.android.apps.translate.e.n;
import com.google.android.libraries.translate.e.h;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LanguagePicker

final class ai
    implements n
{

    final LanguagePicker a;

    ai(LanguagePicker languagepicker)
    {
        a = languagepicker;
        super();
    }

    public final void b(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("id", i);
        h.a(8, bundle);
    }
}
