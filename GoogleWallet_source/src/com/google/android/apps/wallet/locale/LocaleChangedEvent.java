// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import com.google.common.base.Objects;
import java.util.Locale;

public class LocaleChangedEvent
{

    private final Locale newLocale;

    public LocaleChangedEvent(Locale locale)
    {
        newLocale = locale;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (LocaleChangedEvent)obj;
                    return Objects.equal(newLocale, ((LocaleChangedEvent) (obj)).newLocale);
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            newLocale
        });
    }
}
