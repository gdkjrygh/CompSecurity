// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

public final class auc
    implements atm
{

    private final atm a;

    public auc(atm atm1)
    {
        a = atm1;
    }

    private static Uri a(String s)
    {
        return Uri.fromFile(new File(s));
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        String s = (String)obj;
        if (TextUtils.isEmpty(s))
        {
            obj = null;
        } else
        if (s.startsWith("/"))
        {
            obj = a(s);
        } else
        {
            Uri uri = Uri.parse(s);
            obj = uri;
            if (uri.getScheme() == null)
            {
                obj = a(s);
            }
        }
        if (obj == null)
        {
            return null;
        } else
        {
            return a.a(obj, i, j, ani);
        }
    }

    public final volatile boolean a(Object obj)
    {
        return true;
    }
}
