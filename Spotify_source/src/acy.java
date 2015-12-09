// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class acy extends HandlerThread
    implements acu
{

    private final acz a = new acz(getLooper(), this);
    private acv b;
    private acr c;
    private List d;
    private AtomicBoolean e;
    private boolean f;
    private Context g;
    private act h;

    public acy(acr acr1, Context context, boolean flag)
    {
        super("Adjust", 1);
        setDaemon(true);
        start();
        h = acl.a();
        c = acr1;
        g = context;
        f = flag;
        acr1 = Message.obtain();
        acr1.arg1 = 1;
        a.sendMessage(acr1);
    }

    static void a(acy acy1)
    {
        acy1.b = acl.a(acy1);
        acy1.e = new AtomicBoolean();
        try
        {
            acy1.d = (List)adf.a(acy1.g, "AdjustIoPackageQueue", "Package queue");
        }
        catch (Exception exception)
        {
            acy1.h.e("Failed to read %s file (%s)", new Object[] {
                "Package queue", exception.getMessage()
            });
            acy1.d = null;
        }
        if (acy1.d != null)
        {
            acy1.h.b("Package handler read %d packages", new Object[] {
                Integer.valueOf(acy1.d.size())
            });
            return;
        } else
        {
            acy1.d = new ArrayList();
            return;
        }
    }

    static void a(acy acy1, ActivityPackage activitypackage)
    {
        act act1;
        StringBuilder stringbuilder;
        if (activitypackage.activityKind.equals(ActivityKind.d) && !acy1.d.isEmpty())
        {
            acy1.d.add(1, activitypackage);
        } else
        {
            acy1.d.add(activitypackage);
        }
        acy1.h.b("Added package %d (%s)", new Object[] {
            Integer.valueOf(acy1.d.size()), activitypackage
        });
        act1 = acy1.h;
        stringbuilder = new StringBuilder();
        stringbuilder.append(String.format(Locale.US, "Path:      %s\n", new Object[] {
            activitypackage.path
        }));
        stringbuilder.append(String.format(Locale.US, "ClientSdk: %s\n", new Object[] {
            activitypackage.clientSdk
        }));
        if (activitypackage.parameters != null)
        {
            stringbuilder.append("Parameters:");
            java.util.Map.Entry entry;
            for (activitypackage = (new TreeMap(activitypackage.parameters)).entrySet().iterator(); activitypackage.hasNext(); stringbuilder.append(String.format(Locale.US, "\n\t%-16s %s", new Object[] {
    entry.getKey(), entry.getValue()
})))
            {
                entry = (java.util.Map.Entry)activitypackage.next();
            }

        }
        act1.a("%s", new Object[] {
            stringbuilder.toString()
        });
        acy1.g();
    }

    static void b(acy acy1)
    {
        acy1.f();
    }

    static void c(acy acy1)
    {
        acy1.d.remove(0);
        acy1.g();
        acy1.e.set(false);
        acy1.f();
    }

    private void f()
    {
        if (d.isEmpty())
        {
            return;
        }
        if (f)
        {
            h.b("Package handler is paused", new Object[0]);
            return;
        }
        if (e.getAndSet(true))
        {
            h.a("Package handler is already sending", new Object[0]);
            return;
        } else
        {
            ActivityPackage activitypackage = (ActivityPackage)d.get(0);
            b.a(activitypackage);
            return;
        }
    }

    private void g()
    {
        adf.a(d, g, "AdjustIoPackageQueue", "Package queue");
        h.b("Package handler wrote %d packages", new Object[] {
            Integer.valueOf(d.size())
        });
    }

    public final void a()
    {
        Message message = Message.obtain();
        message.arg1 = 4;
        a.sendMessage(message);
    }

    public final void a(ActivityPackage activitypackage)
    {
        Message message = Message.obtain();
        message.arg1 = 2;
        message.obj = activitypackage;
        a.sendMessage(message);
    }

    public final void a(JSONObject jsonobject)
    {
        c.a(jsonobject);
    }

    public final void b()
    {
        Message message = Message.obtain();
        message.arg1 = 3;
        a.sendMessage(message);
    }

    public final void c()
    {
        e.set(false);
    }

    public final void d()
    {
        f = true;
    }

    public final void e()
    {
        f = false;
    }
}
