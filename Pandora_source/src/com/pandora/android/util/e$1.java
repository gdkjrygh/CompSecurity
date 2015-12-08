// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.AsyncTask;
import com.pandora.android.data.AlarmData;
import com.pandora.android.provider.a;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.util:
//            e

class a extends AsyncTask
{

    final e a;

    protected transient AlarmData a(Void avoid[])
    {
        return com.pandora.android.util.e.a(a).d();
    }

    protected void a(AlarmData alarmdata)
    {
        b.a.e().a(new p.bz.b(alarmdata, true));
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((AlarmData)obj);
    }

    mData(e e1)
    {
        a = e1;
        super();
    }
}
