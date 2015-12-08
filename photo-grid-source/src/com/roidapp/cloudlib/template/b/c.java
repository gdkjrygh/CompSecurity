// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import android.os.Message;
import android.support.v4.app.FragmentActivity;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a;
import com.roidapp.cloudlib.template.b;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.j;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            a, k

public final class c extends ah
{

    protected WeakReference c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private k h;
    private com.roidapp.cloudlib.template.b.a i;

    public c(com.roidapp.cloudlib.template.b.a a1)
    {
        super(a1.a());
        d = false;
        e = false;
        f = false;
        g = false;
        c = new WeakReference(a1);
        h = new k(a, new WeakReference(this));
    }

    public final void a()
    {
        if (!g)
        {
            g = true;
            i = null;
        }
    }

    protected final void a(Message message)
    {
        if (message.what != 8999) goto _L2; else goto _L1
_L1:
        h.h();
_L4:
        return;
_L2:
        if (message.what == 8998)
        {
            h.g();
            return;
        }
        i = (com.roidapp.cloudlib.template.b.a)c.get();
        if (i == null || g)
        {
            removeMessages(message.what);
            message.obj = null;
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 9218: 
            continue; /* Loop/switch isn't completed */

        case 8976: 
            if (!d)
            {
                i.b(false);
                h.b();
                d = true;
                return;
            }
            break;

        case 144913: 
            if (message.obj instanceof Map)
            {
                message = (Map)message.obj;
                j.a().a((List)message.get("local"));
                j.b().a((List)message.get("favourite"));
                i.g();
                return;
            }
            break;

        case 8978: 
            if (!e)
            {
                i.b(false);
                h.c();
                e = true;
                return;
            }
            break;

        case 8979: 
            if (message.obj instanceof List)
            {
                i.a((List)message.obj);
                return;
            }
            break;

        case 9008: 
            i.b(false);
            h.a(message.arg1);
            return;

        case 9009: 
            if (message.obj instanceof List)
            {
                i.c((List)message.obj);
                return;
            }
            break;

        case 8980: 
            if (!f)
            {
                i.b(false);
                h.d();
                f = true;
                return;
            }
            break;

        case 8981: 
            if (message.obj instanceof List)
            {
                i.b((List)message.obj);
                return;
            }
            break;

        case 8983: 
            i.b(false);
            h.e();
            return;

        case 9010: 
            i.b(false);
            h.b(message.arg1);
            return;

        case 8984: 
            i.b(false);
            h.f();
            return;

        case 8994: 
            if (message.obj instanceof TemplateInfo)
            {
                h.c((TemplateInfo)message.obj);
                return;
            }
            break;

        case 8995: 
            if (message.obj instanceof TemplateInfo)
            {
                j.a().b((TemplateInfo)message.obj);
                i.n_();
                return;
            }
            break;

        case 8985: 
            if (message.obj instanceof TemplateInfo)
            {
                h.b((TemplateInfo)message.obj);
                al.g().a((new StringBuilder("download/")).append(((TemplateInfo)message.obj).i()).toString());
                return;
            }
            break;

        case 8992: 
            if (message.obj instanceof TemplateInfo)
            {
                j.a().a((TemplateInfo)message.obj);
                h.a(((TemplateInfo)message.obj).e());
                i.a(true);
                i.n_();
                return;
            }
            break;

        case 8996: 
            if (message.obj instanceof TemplateInfo)
            {
                j.a((TemplateInfo)message.obj);
                h.a((TemplateInfo)message.obj);
                return;
            }
            break;

        case 8997: 
            if (message.obj instanceof d)
            {
                i.a((d)message.obj);
                return;
            }
            break;

        case 9217: 
            i.n_();
            return;

        case 8993: 
            i.a(false);
            i.a(message.obj);
            return;

        case 9000: 
            if (message.obj instanceof Object[])
            {
                message = ((Message) ((Object[])message.obj));
                i.a(message[0]);
                if (message[1] instanceof TemplateInfo)
                {
                    j.a().b((TemplateInfo)message[1]);
                    i.n_();
                    return;
                }
            }
            break;

        case 8982: 
            i.b(message.obj);
            return;

        case 9001: 
            i.c(message.obj);
            return;

        case 9216: 
            if (!i.a().isFinishing())
            {
                break; /* Loop/switch isn't completed */
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        l.a(i.a());
        return;
        if (!(message.obj instanceof TemplateInfo)) goto _L4; else goto _L5
_L5:
        com.roidapp.baselib.c.b.f("Unlock/NO_AD/Template", null);
        i.a((TemplateInfo)message.obj);
        return;
    }

    public final boolean b()
    {
        return g;
    }

    public final boolean c()
    {
        return d;
    }

    public final boolean d()
    {
        return e;
    }

    public final boolean e()
    {
        return f;
    }

    public final boolean f()
    {
        return h.a();
    }
}
