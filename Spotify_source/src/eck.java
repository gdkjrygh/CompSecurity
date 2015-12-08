// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

public final class eck
{

    public static Uri a(Context context, int i)
    {
        Resources resources = context.getResources();
        return Uri.parse((new StringBuilder("android.resource://")).append(context.getPackageName()).append("/").append(resources.getResourceTypeName(i)).append("/").append(resources.getResourceEntryName(i)).toString());
    }
}
