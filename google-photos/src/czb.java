// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

final class czb
    implements Comparator
{

    private final Collator a;
    private final Resources b;

    czb(Locale locale, Resources resources)
    {
        a = Collator.getInstance((Locale)b.a(locale, "locale", null));
        b = (Resources)b.a(resources, "resources", null);
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (cyy)obj;
        obj1 = (cyy)obj1;
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == cyy.a)
        {
            return -1;
        }
        if (obj1 == cyy.a)
        {
            return 1;
        } else
        {
            return a.compare(b.getString(((cyy) (obj)).m), b.getString(((cyy) (obj1)).m));
        }
    }
}
