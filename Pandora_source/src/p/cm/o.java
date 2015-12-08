// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.os.AsyncTask;
import com.pandora.radio.data.aa;
import p.cn.c;

public class o extends AsyncTask
{

    public o()
    {
    }

    protected transient aa[] a(String as[])
    {
        as = as[0];
        return c.a().a(as);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
