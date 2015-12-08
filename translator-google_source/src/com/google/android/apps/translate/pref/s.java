// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.b;
import com.google.android.libraries.translate.offline.a.i;
import com.google.android.libraries.translate.offline.d;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.apps.translate.pref:
//            r, t

final class s extends b
{

    final r a;

    s(r r1, Context context, o o1, d d)
    {
        a = r1;
        super(context, o1, d, true);
    }

    protected final void a(Void void1)
    {
        super.a(void1);
        try
        {
            void1 = com.google.android.apps.translate.pref.r.b(a).b(r.a(a));
        }
        // Misplaced declaration of an exception variable
        catch (Void void1)
        {
            void1 = null;
        }
        if (void1 != null)
        {
            r.a(a, void1);
            OfflinePackage offlinepackage = r.a(a);
            o o1 = com.google.android.apps.translate.pref.r.b(a);
            Context context = r.c(a);
            if (r.a(a).b == PackageType.WORD_LENS)
            {
                void1 = Event.WORDLENS_DOWNLOAD_RETRY_FROM_SETTINGS;
            } else
            {
                void1 = Event.OFFLINE_DOWNLOAD_RETRY_FROM_SETTINGS;
            }
            (new i(offlinepackage, o1, context, void1, new t(this), true)).onClick(null);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
