// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

final class djb
    implements dja
{

    private final Context a;

    djb(Context context)
    {
        a = context;
    }

    public final diy a(String s, String s1, String s2, String s3)
    {
        String s4 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s4 = a.getString(b.iJ);
        }
        return new diy(s, s4, s2, s3);
    }
}
