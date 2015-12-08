// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class erx
{

    public static android.net.Uri.Builder a()
    {
        android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("hm").authority("concerts").appendPath("v1");
        Locale locale = Locale.getDefault();
        StringBuilder stringbuilder = new StringBuilder(locale.getLanguage());
        if (!locale.getCountry().isEmpty())
        {
            stringbuilder.append('-').append(locale.getCountry());
        }
        return builder.appendQueryParameter("locale", stringbuilder.toString());
    }
}
