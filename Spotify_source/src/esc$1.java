// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class 
    implements hfw
{

    public final Object call(Object obj)
    {
        obj = (String)obj;
        boolean flag;
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).length() >= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    ()
    {
    }
}
