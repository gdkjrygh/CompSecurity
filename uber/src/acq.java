// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.webkit.WebView;
import java.util.Map;

public abstract class acq
    implements acu
{

    public acq()
    {
    }

    public final void a(akk akk1, Map map)
    {
        if (!Looper.myLooper().equals(Looper.getMainLooper()))
        {
            akk1.a().post(new _cls1(akk1, map));
            return;
        } else
        {
            b(akk1, map);
            return;
        }
    }

    abstract void b(akk akk1, Map map);

    /* member class not found */
    class _cls1 {}

}
