// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ggc
    implements dmx
{

    private Map a;

    public ggc()
    {
        a = new HashMap();
    }

    public static void a(Context context)
    {
        a(context, 0x7f080550, 1, new Object[0]);
    }

    public static void a(Context context, int i)
    {
        a(context, i, 0, new Object[0]);
    }

    public static transient void a(Context context, int i, int j, Object aobj[])
    {
        ctz.a(context);
        context = context.getApplicationContext();
        if (aobj.length > 0)
        {
            context = Toast.makeText(context, context.getString(i, aobj), j);
        } else
        {
            context = Toast.makeText(context, i, j);
        }
        context.show();
    }

    private void a(Context context, SpotifyIcon spotifyicon, String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
        ctz.a(context);
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = a.entrySet().iterator();
_L3:
        java.util.Map.Entry entry;
        Toast toast;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        entry = (java.util.Map.Entry)iterator.next();
        toast = (Toast)((WeakReference)entry.getValue()).get();
        if (toast != null) goto _L2; else goto _L1
_L1:
        iterator.remove();
          goto _L3
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (((Integer)entry.getKey()).intValue() != i) goto _L3; else goto _L4
_L4:
        toast.cancel();
        iterator.remove();
          goto _L3
        map;
        JVM INSTR monitorexit ;
        View view = LayoutInflater.from(context).inflate(0x7f03013e, null);
        TextView textview = (TextView)view.findViewById(0x7f11026e);
        textview.setText(s);
        textview.setCompoundDrawablesWithIntrinsicBounds(null, new dfz(context, spotifyicon, context.getResources().getDimensionPixelSize(0x7f0c00ec)), null, null);
        context = new Toast(context.getApplicationContext());
        context.setView(view);
        context.setGravity(17, 0, 0);
        context.setDuration(0);
        context.show();
        synchronized (a)
        {
            a.put(Integer.valueOf(i), new WeakReference(context));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        spotifyicon;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a(Context context, String s)
    {
        a(context, 0x7f080552, 1, new Object[] {
            s
        });
    }

    public static void a(Context context, String s, Flags flags)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (gex.a(flags))
                    {
                        s = (new SpotifyLink(s)).c;
                        final class _cls1
                        {

                            static final int a[];

                            static 
                            {
                                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                                try
                                {
                                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                try
                                {
                                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.v.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.P.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        switch (_cls1.a[s.ordinal()])
                        {
                        default:
                            Assertion.a((new StringBuilder("Unknown link type ")).append(s).append(" when showing added to queue toast.").toString());
                            break;

                        case 1: // '\001'
                        case 2: // '\002'
                            break label2;

                        case 3: // '\003'
                            break label1;

                        case 4: // '\004'
                            break label0;
                        }
                    }
                    return;
                }
                a(context, 0x7f080545, 1, new Object[0]);
                return;
            }
            a(context, 0x7f08054a, 1, new Object[0]);
            return;
        }
        a(context, 0x7f080546, 1, new Object[0]);
    }

    public static void a(Context context, Throwable throwable)
    {
        a(context, 0x7f08054d, 1, new Object[] {
            throwable.getMessage()
        });
    }

    public static void b(Context context, String s)
    {
        a(context, 0x7f080553, 1, new Object[] {
            s
        });
    }

    public static void b(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f080556;
        } else
        {
            i = 0x7f080557;
        }
        a(context, i, 0, new Object[0]);
    }

    public static void c(Context context, String s)
    {
        a(context, 0x7f080551, 1, new Object[] {
            s
        });
    }

    public static void c(Context context, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f08055f;
        } else
        {
            i = 0x7f080586;
        }
        a(context, i, 0, new Object[0]);
    }

    public static void d(Context context)
    {
        a(context, 0x7f080573, 1, new Object[0]);
    }

    public static void e(Context context)
    {
        a(context, 0x7f080574, 1, new Object[0]);
    }

    public static void f(Context context)
    {
        a(context, 0x7f080584, 0, new Object[0]);
    }

    public static void g(Context context)
    {
        a(context, 0x7f08056b, 1, new Object[0]);
    }

    public static void h(Context context)
    {
        a(context, 0x7f080570, 0, new Object[0]);
    }

    public final void a(Context context, SpotifyIcon spotifyicon, int i)
    {
        this;
        JVM INSTR monitorenter ;
        ctz.a(context);
        a(context, spotifyicon, context.getString(i), i);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public final void a(Context context, Flags flags)
    {
        SpotifyIcon spotifyicon = SpotifyIcon.ai;
        int i;
        if (fiy.a(flags))
        {
            i = 0x7f080564;
        } else
        {
            i = 0x7f080563;
        }
        a(context, spotifyicon, i);
    }

    public final void a(Context context, boolean flag)
    {
        SpotifyIcon spotifyicon;
        int i;
        if (flag)
        {
            spotifyicon = SpotifyIcon.i;
        } else
        {
            spotifyicon = SpotifyIcon.ai;
        }
        if (flag)
        {
            i = 0x7f08054f;
        } else
        {
            i = 0x7f080585;
        }
        a(context, spotifyicon, i);
    }

    public final void b(Context context)
    {
        a(context, SpotifyIcon.aj, 0x7f08055a);
    }

    public final void c(Context context)
    {
        a(context, SpotifyIcon.aA, 0x7f08055d);
    }

    public final void d(Context context, String s)
    {
        a(context, SpotifyIcon.aj, context.getString(0x7f080549, new Object[] {
            s
        }), 0x7f080549);
    }
}
