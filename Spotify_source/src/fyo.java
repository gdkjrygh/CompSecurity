// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public class fyo extends fyu
{

    public fyo(String s, fzi fzi)
    {
        super(java/lang/Boolean, s, fzi);
    }

    public final Serializable a()
    {
        return Boolean.FALSE;
    }

    public boolean a(int i)
    {
        return i != 0;
    }

    public Serializable b_(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return Boolean.FALSE;
        }
        if ("true".equals(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equals(s))
        {
            return Boolean.FALSE;
        } else
        {
            return Boolean.valueOf(a(Integer.parseInt(s)));
        }
    }
}
