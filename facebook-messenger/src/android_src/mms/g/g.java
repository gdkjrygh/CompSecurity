// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import android.widget.Toast;
import com.facebook.o;

// Referenced classes of package android_src.mms.g:
//            d

class g
    implements Runnable
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        Toast.makeText(d.a(a), o.service_message_not_found, 1).show();
    }
}
