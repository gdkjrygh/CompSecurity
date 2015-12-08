// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ehq
{

    ehq(Context context)
    {
        try
        {
            alp.a().a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
        }
        throw new RuntimeException((new StringBuilder(String.valueOf(context).length() + 35)).append("Failed to initialize the namespace.").append(context).toString());
    }
}
