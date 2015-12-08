// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.libraries.translate.b.a;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.TwsResponseException;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.core.n;
import com.google.android.libraries.translate.languages.Language;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            aq, au, av

final class at extends HandlerThread
    implements android.os.Handler.Callback
{

    public Handler a;
    final aq b;
    private final n c;
    private Language d;
    private Language e;
    private final a f = com.google.android.libraries.translate.b.a.a(2D);
    private String g;

    public at(aq aq1, Language language, Language language1)
    {
        b = aq1;
        aq1 = String.valueOf(language.getShortName());
        String s = String.valueOf(language1.getShortName());
        super((new StringBuilder(String.valueOf(aq1).length() + 1 + String.valueOf(s).length())).append(aq1).append(":").append(s).toString());
        c = (n)Singleton.d.b();
        g = "";
        d = language;
        e = language1;
    }

    static Language a(at at1)
    {
        return at1.e;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = new Handler(getLooper(), this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what != 2) goto _L2; else goto _L1
_L1:
        Object obj = message.getData();
        message = (Language)((Bundle) (obj)).getSerializable("from");
        obj = (Language)((Bundle) (obj)).getSerializable("to");
        if (message != null && obj != null)
        {
            d = message;
            e = ((Language) (obj));
            return true;
        }
          goto _L3
_L2:
        if (message.what != 1) goto _L3; else goto _L4
_L4:
        String s = (String)message.obj;
        String s1 = String.valueOf((String)aq.c(b).get());
        if (!TextUtils.isEmpty(g) && s.startsWith(g))
        {
            message = "&otf=2";
        } else
        {
            message = "&otf=3";
        }
        message = String.valueOf(message);
        if (message.length() == 0) goto _L6; else goto _L5
_L5:
        message = s1.concat(message);
_L9:
        message = c.a(s, d, e, message, true);
        g = s;
        b.c.post(new au(this, s, message));
_L7:
        f.a();
        return true;
_L6:
        try
        {
            message = new String(s1);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            b.c.post(new av(this, s));
        }
        if (true) goto _L7; else goto _L3
_L3:
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
