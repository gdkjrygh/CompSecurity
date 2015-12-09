// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.ui.activity.ShowcaseConcertsActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class dxk extends Fragment
{

    private Map a;

    public dxk()
    {
        a = new HashMap();
    }

    protected final dxj F()
    {
        dxh dxh1 = (dxh)k();
        if (dxh1 == null)
        {
            return null;
        }
        if (dxh1.d != null && !dxh1.d.p())
        {
            return dxh1.d;
        } else
        {
            return null;
        }
    }

    public final void G()
    {
        dxh dxh1 = (dxh)k();
        if (dxh1 == null)
        {
            Logger.c("Could not finish flow - activity not attached", new Object[0]);
            return;
        } else
        {
            dxh1.a(new dxi(dxh1) {

                private dxh a;

                public final void a(Context context, Intent intent)
                {
                    Intent intent1 = intent;
                    if (intent == null)
                    {
                        intent1 = gms.a(context).a;
                    }
                    intent1.setExtrasClassLoader(a.getClassLoader());
                    intent1.putExtra("just_logged_in", true);
                    context.startActivity(intent1);
                }

            
            {
                a = dxh1;
                super();
            }
            });
            return;
        }
    }

    public final Object a(dxj dxj1)
    {
        if (a.get(dxj1.getClass()) == null)
        {
            String s = dxj1.getClass().getName();
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append('{');
            Iterator iterator = a.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                stringbuilder.append('(');
                stringbuilder.append(((Class)((java.util.Map.Entry) (obj)).getKey()).getName());
                stringbuilder.append(", ");
                if (((java.util.Map.Entry) (obj)).getValue() != null)
                {
                    obj = ((java.util.Map.Entry) (obj)).getValue();
                } else
                {
                    obj = "null";
                }
                stringbuilder.append(obj);
                stringbuilder.append(')');
                stringbuilder.append(", ");
            }
            stringbuilder.deleteCharAt(stringbuilder.lastIndexOf(","));
            stringbuilder.append('}');
            Logger.c("Requested actions not found for %s. Actions map: %s", new Object[] {
                s, stringbuilder.toString()
            });
            Assertion.b("Failed to find actions");
            a();
        }
        return a.get(dxj1.getClass());
    }

    public abstract void a();

    public final void a(Class class1, Object obj)
    {
        a.put(class1, obj);
    }

    public final void b(dxj dxj1)
    {
        dxh dxh1 = (dxh)k();
        if (dxh1 == null)
        {
            Logger.c("Could not switch fragment - activity not attached", new Object[0]);
            return;
        } else
        {
            dxh1.a(dxj1, true);
            return;
        }
    }

    public final void c(dxj dxj1)
    {
        dxh dxh1 = (dxh)k();
        if (dxh1 == null)
        {
            Logger.c("Could not switch fragment - activity not attached", new Object[0]);
            return;
        } else
        {
            dxh1.a(dxj1, false);
            return;
        }
    }

    // Unreferenced inner class dxk$2

/* anonymous class */
    final class _cls2
        implements dxi
    {

        private dxh a;

        public final void a(Context context, Intent intent)
        {
            Intent intent1 = intent;
            if (intent == null)
            {
                intent1 = gms.a(context).a;
            }
            intent = intent1;
            if (!"android.intent.action.VIEW".equals(intent1.getAction()))
            {
                intent = gms.a(context).a;
            }
            intent.setExtrasClassLoader(a.getClassLoader());
            intent.putExtra("just_logged_in", true);
            context.startActivity(intent);
            context = new gix(context);
            context.a(((gix) (context)).b.a);
            ShowcaseConcertsActivity.a((Context)((gix) (context)).a.get(), true);
        }

            
            {
                a = dxh1;
                super();
            }
    }

}
