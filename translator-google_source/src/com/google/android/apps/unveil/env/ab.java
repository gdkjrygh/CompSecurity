// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.apps.unveil.g;

public final class ab
    implements BaseColumns
{

    public static final Uri a(Context context)
    {
        context = String.valueOf(context.getString(g.unveil_content_provider_authority));
        String s = String.valueOf("last_text_restrict");
        return Uri.parse((new StringBuilder(String.valueOf(context).length() + 11 + String.valueOf(s).length())).append("content://").append(context).append("/").append(s).toString());
    }
}
