// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class mfj
    implements jyx
{

    final mfh a;
    final Uri b;
    private mfi c;

    public mfj(mfi mfi1, mfh mfh1, Uri uri)
    {
        c = mfi1;
        super();
        a = mfh1;
        b = uri;
    }

    public final void a(jyw jyw)
    {
        jyw = (lmf)jyw;
        if (!jyw.a_().b()) goto _L2; else goto _L1
_L1:
        jyw.b();
        JVM INSTR tableswitch 1 3: default 48
    //                   1 118
    //                   2 113
    //                   3 123;
           goto _L2 _L3 _L4 _L5
_L2:
        int i = 0;
_L7:
        a.a(i, jyw.c());
        mfi.a(c).sendEmptyMessageDelayed(1, 3000L);
        if (Log.isLoggable("PanoramaClient", 3))
        {
            jyw = String.valueOf(mfi.a(i));
            if (jyw.length() == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            "onPanoramaTypeDetected: ".concat(jyw);
        }
        return;
_L4:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 3;
        if (true) goto _L7; else goto _L6
_L6:
        new String("onPanoramaTypeDetected: ");
        return;
    }
}
