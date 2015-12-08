// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.a.i;
import com.google.android.libraries.translate.offline.a.n;
import com.google.android.libraries.translate.offline.ah;
import com.google.android.libraries.translate.offline.o;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.widget:
//            PinButton, LangSpinner, ab, ag, 
//            ah

final class af
    implements android.view.View.OnClickListener
{

    private final TextView a;
    private final PinButton b;
    private final ab c;
    private Language d;

    af(View view, ab ab1)
    {
        a = (TextView)view.findViewById(0x1020014);
        b = (PinButton)view.findViewById(m.img_pin_offline_package);
        b.setOnClickListener(this);
        c = ab1;
    }

    static TextView a(af af1)
    {
        return af1.a;
    }

    static Language a(af af1, Language language)
    {
        af1.d = language;
        return language;
    }

    static PinButton b(af af1)
    {
        return af1.b;
    }

    static ab c(af af1)
    {
        return af1.c;
    }

    public final void onClick(View view)
    {
        String s = ah.a(d.getShortName());
        OfflinePackage offlinepackage = (OfflinePackage)LangSpinner.b().get(s);
        if (offlinepackage == null)
        {
            return;
        }
        try
        {
            offlinepackage = ((o)Singleton.c.b()).b(offlinepackage);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
        if (LangSpinner.a(d) == 1)
        {
            (new i(offlinepackage, (o)Singleton.c.b(), c.getContext(), Event.OFFLINE_DOWNLOAD_FROM_PICKER, new ag(this, s), false)).onClick(view);
            return;
        } else
        {
            (new n(offlinepackage, (o)Singleton.c.b(), c.getContext(), ((o)Singleton.c.b()).d, new com.google.android.apps.translate.widget.ah(this, s))).onClick(view);
            return;
        }
    }
}
