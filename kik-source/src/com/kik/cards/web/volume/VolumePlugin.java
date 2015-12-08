// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.volume;

import android.view.KeyEvent;
import com.kik.cards.web.plugin.d;
import com.kik.g.f;
import com.kik.g.j;
import com.kik.g.k;
import org.c.b;
import org.c.c;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.volume:
//            a, b

public class VolumePlugin extends d
{

    private static final b a = c.a("CardsWebVolume");
    private final Object b = new Object();
    private boolean d;
    private final f e = new f();
    private final k f = new k(this);
    private final k g = new k(this);
    private com.kik.g.c h;
    private com.kik.g.c i;

    public VolumePlugin()
    {
        super("VolumeKeys");
        h = j.a(new a(this));
        i = j.a(new com.kik.cards.web.volume.b(this));
    }

    static void a(VolumePlugin volumeplugin, String s)
    {
        volumeplugin.c(s);
    }

    static void b(VolumePlugin volumeplugin, String s)
    {
        volumeplugin.c(s);
    }

    public final boolean a(KeyEvent keyevent)
    {
        boolean flag = true;
        if (!d) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 24 25: default 36
    //                   24 40
    //                   25 77;
           goto _L2 _L3 _L4
_L2:
        flag = false;
_L6:
        return flag;
_L3:
        if (keyevent.getAction() == 0)
        {
            f.a(b);
            return true;
        }
        if (keyevent.getAction() == 1)
        {
            h.a();
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (keyevent.getAction() == 0)
        {
            g.a(b);
            return true;
        }
        if (keyevent.getAction() == 1)
        {
            i.a();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public com.kik.cards.web.plugin.j startIntercepting(JSONObject jsonobject)
    {
        e.a();
        e.a(f.a(), h);
        e.a(g.a(), i);
        d = true;
        return new com.kik.cards.web.plugin.j();
    }

    public com.kik.cards.web.plugin.j stopIntercepting(JSONObject jsonobject)
    {
        e.a();
        d = false;
        return new com.kik.cards.web.plugin.j();
    }

}
