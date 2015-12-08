// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Set;

public final class ntr
    implements nab
{

    public ntr()
    {
    }

    public final nac a(Intent intent)
    {
        if (intent == null || intent.getCategories() == null || !intent.getCategories().contains("android.intent.category.NOTIFICATION_PREFERENCES"))
        {
            return null;
        } else
        {
            return new nts();
        }
    }
}
