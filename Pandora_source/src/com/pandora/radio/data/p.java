// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.i;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import p.cw.c;
import p.dd.an;
import p.dd.bo;

// Referenced classes of package com.pandora.radio.data:
//            o, af

public class p
    implements o
{

    private Object a;
    private final c b;
    private final SharedPreferences c;
    private af d;
    private int e;

    public p(c c1, int i1)
    {
        a = new Object();
        b = c1;
        e = i1;
        c = c1.s().getSharedPreferences("PandoraPrefsV2", 0);
        H();
        c1.b(this);
    }

    private boolean F()
    {
        return c.getBoolean("device_settings_migrated", false);
    }

    private void G()
    {
        f f1 = b.x();
        b(f1.b("AUDIO_PREFERENCE"));
        g(f1.a("AUTO_LOCK").booleanValue());
        c(f1.b("KEY_ENABLE_BLUETOOTH_AUTO_PREFERENCE"));
        h(true);
    }

    private void H()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(b.s());
        android.content.SharedPreferences.Editor editor = c.edit();
        com.pandora.radio.util.i.a(editor, sharedpreferences, "PREF_FIRST_RUN", true);
        editor.apply();
    }

    private void I()
    {
        File file = new File(b.s().getFilesDir().getParentFile(), String.format("shared_prefs/%s.xml", new Object[] {
            "PandoraPrefs"
        }));
        if (file.exists())
        {
            SharedPreferences sharedpreferences = b.s().getSharedPreferences("PandoraPrefs", 0);
            android.content.SharedPreferences.Editor editor = c.edit();
            Iterator iterator = sharedpreferences.getAll().keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (s1.startsWith("skipped_song_name_"))
                {
                    com.pandora.radio.util.i.a(editor, sharedpreferences, s1, null);
                }
                if (s1.startsWith("skipped_song_time_"))
                {
                    com.pandora.radio.util.i.a(editor, sharedpreferences, s1, 0L);
                }
            } while (true);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "capWarningShownPercent", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "capWarningShownTimestamp", 0L);
            com.pandora.radio.util.i.a(editor, sharedpreferences, "incrementalListening", 0);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("iapAckPending"), 0L);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("auto_share_confirm_dialog_shown"), false);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("app_version"), -1);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("admarvel_colliderid"), null);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("interstitial_last_shown_time"), 0L);
            com.pandora.radio.util.i.a(editor, sharedpreferences, d("first_login_time"), -1L);
            editor.apply();
            file.delete();
        }
    }

    static af a(p p1)
    {
        return p1.d;
    }

    private p.dg.k.a a(int i1, String s1)
    {
        return new p.dg.k.a(s1, c.getString(d((new StringBuilder()).append("skipped_song_name_").append(i1).append(s1).toString()), ""), c.getLong(d((new StringBuilder()).append("skipped_song_time_").append(i1).append(s1).toString()), 0L));
    }

    private void a(int i1, String s1, String s2, long l1)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString(d((new StringBuilder()).append("skipped_song_name_").append(i1).append(s1).toString()), s2);
        editor.putLong(d((new StringBuilder()).append("skipped_song_time_").append(i1).append(s1).toString()), l1);
        editor.apply();
    }

    static void a(p p1, int i1, String s1, String s2, long l1)
    {
        p1.a(i1, s1, s2, l1);
    }

    private String d(String s1)
    {
        if (d == null)
        {
            throw new UnsupportedOperationException("personalizeKey called, but userData == null; key can't be personalized");
        } else
        {
            return (new StringBuilder()).append(s1).append(d.d()).toString();
        }
    }

    private static String e(int i1)
    {
        return (new StringBuilder()).append("widget_layouts").append(String.valueOf(i1)).toString();
    }

    private void h(boolean flag)
    {
        c.edit().putBoolean("device_settings_migrated", flag).apply();
    }

    public long A()
    {
        return c.getLong("last_casting_volume_event", 0L);
    }

    public long B()
    {
        return c.getLong("last_ab_test_tracking", 0L);
    }

    public Set C()
    {
        return c.getStringSet("sent_ab_test_tracking", null);
    }

    public boolean D()
    {
        return c.getBoolean("PREF_FIRST_RUN", true);
    }

    public void E()
    {
        c.edit().putBoolean("PREF_FIRST_RUN", false).apply();
    }

    public int a()
    {
        return c.getInt("capWarningShownPercent", 0);
    }

    long a(Calendar calendar)
    {
        calendar.roll(2, 1);
        if (calendar.get(2) == 0)
        {
            calendar.roll(1, 1);
        }
        calendar.set(5, 1);
        return calendar.getTimeInMillis();
    }

    public Vector a(String s1, int i1)
    {
        Vector vector = new Vector();
        int j1 = 0;
        do
        {
            p.dg.k.a a1;
label0:
            {
                if (j1 < i1)
                {
                    a1 = a(j1, s1);
                    if (!com.pandora.radio.util.i.a(a1.b()) && a1.a() != 0L)
                    {
                        break label0;
                    }
                }
                return vector;
            }
            vector.add(a1);
            j1++;
        } while (true);
    }

    public void a(int i1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        android.content.SharedPreferences.Editor editor;
        i1 = d() + i1;
        editor = c.edit();
        Exception exception;
        if (i1 <= 0)
        {
            i1 = 0;
        }
        editor.putInt("incrementalListening", i1).apply();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i1, int j1)
    {
        c.edit().putInt(e(j1), i1).apply();
    }

    public void a(int i1, long l1)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putInt("capWarningShownPercent", i1);
        editor.putLong("capWarningShownTimestamp", l1);
        editor.apply();
    }

    public void a(long l1)
    {
        c.edit().putLong("last_casting_available_event", l1).apply();
    }

    public void a(String s1)
    {
        c.edit().putString(d("admarvel_colliderid"), s1).apply();
    }

    public void a(List list)
    {
        if (list == null || list.size() == 0)
        {
            c.edit().remove("active_ab_tests").apply();
            return;
        } else
        {
            list = TextUtils.join(", ", list);
            c.edit().putString("active_ab_tests", list).apply();
            return;
        }
    }

    public void a(Set set)
    {
        c.edit().putStringSet("sent_ab_test_tracking", set).apply();
    }

    public void a(Vector vector, String s1, int i1)
    {
        if (d == null)
        {
            return;
        } else
        {
            (new AsyncTask(vector, s1, i1) {

                final Vector a;
                final String b;
                final int c;
                final p d;

                protected transient Object doInBackground(Object aobj[])
                {
                    if (p.a(d) == null || a == null)
                    {
                        break MISSING_BLOCK_LABEL_139;
                    }
                    aobj = a;
                    aobj;
                    JVM INSTR monitorenter ;
                    int k1 = a.size();
                    int j1 = 0;
_L2:
                    if (j1 >= k1)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    p.dg.k.a a1 = (p.dg.k.a)a.get(j1);
                    p.a(d, j1, b, a1.b(), a1.a());
                    j1++;
                    if (true) goto _L2; else goto _L1
_L1:
                    if (k1 >= c) goto _L4; else goto _L3
_L3:
                    int l1 = c;
                    j1 = k1;
_L5:
                    if (j1 >= l1 - k1)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    p.a(d, j1, b, "", 0L);
                    j1++;
                    if (true) goto _L5; else goto _L4
_L4:
                    aobj;
                    JVM INSTR monitorexit ;
                    break MISSING_BLOCK_LABEL_139;
                    Exception exception;
                    exception;
                    aobj;
                    JVM INSTR monitorexit ;
                    throw exception;
                    return null;
                }

            
            {
                d = p.this;
                a = vector;
                b = s1;
                c = i1;
                super();
            }
            }).execute(new Object[0]);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (d == null)
        {
            return;
        }
        if (flag)
        {
            c.edit().putLong(d("iapAckPending"), a(Calendar.getInstance())).apply();
            return;
        } else
        {
            c.edit().remove(d("iapAckPending")).apply();
            return;
        }
    }

    public long b()
    {
        return c.getLong("capWarningShownTimestamp", 0L);
    }

    public void b(int i1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        android.content.SharedPreferences.Editor editor;
        i1 = d() - i1;
        editor = c.edit();
        Exception exception;
        if (i1 <= 0)
        {
            i1 = 0;
        }
        editor.putInt("incrementalListening", i1).apply();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(long l1)
    {
        c.edit().putLong("last_casting_volume_event", l1).apply();
    }

    public void b(String s1)
    {
        c.edit().putString("audio_preference", s1).apply();
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            c.edit().putBoolean(d("auto_share_confirm_dialog_shown"), true).apply();
            return;
        } else
        {
            c.edit().remove(d("auto_share_confirm_dialog_shown")).apply();
            return;
        }
    }

    public int c(int i1)
    {
        return c.getInt(e(i1), -1);
    }

    public void c()
    {
        a(0, 0L);
    }

    public void c(long l1)
    {
        c.edit().putLong("last_ab_test_tracking", l1).apply();
    }

    public void c(String s1)
    {
        c.edit().putString("bluetooth_for_auto", s1).apply();
    }

    public void c(boolean flag)
    {
        c.edit().putBoolean("daydream_show_clock", flag).apply();
    }

    public int d()
    {
        return c.getInt("incrementalListening", 0);
    }

    public void d(int i1)
    {
        c.edit().remove(e(i1)).apply();
    }

    public void d(boolean flag)
    {
        c.edit().putBoolean("daydream_dim_screen", flag).apply();
    }

    public void e(boolean flag)
    {
        c.edit().putBoolean("ignore_server_ab_tests", flag).apply();
    }

    public boolean e()
    {
        if (d != null)
        {
            long l1 = c.getLong(d("iapAckPending"), 0L);
            long l2 = System.currentTimeMillis();
            if (l1 > 0L && l2 < l1)
            {
                return true;
            }
            if (l1 > 0L && l2 > l1)
            {
                c.edit().remove(d("iapAckPending")).apply();
                return false;
            }
        }
        return false;
    }

    public void f(boolean flag)
    {
        c.edit().putBoolean("initial_audio_setting", flag).apply();
    }

    public boolean f()
    {
        return c.getBoolean(d("auto_share_confirm_dialog_shown"), false);
    }

    public void g(boolean flag)
    {
        c.edit().putBoolean("force_screen_bright", flag).apply();
    }

    public boolean g()
    {
        return e != c.getInt(d("app_version"), -1);
    }

    public void h()
    {
        c.edit().putInt(d("app_version"), e).apply();
    }

    public boolean i()
    {
        return e == c.getInt(d("announcement_shown_for_version"), -1);
    }

    public void j()
    {
        c.edit().putInt(d("announcement_shown_for_version"), e).apply();
    }

    public void k()
    {
        Iterator iterator = c.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith("announcement_shown_for_version"))
            {
                c.edit().remove(s1).apply();
            }
        } while (true);
    }

    public String l()
    {
        return c.getString(d("admarvel_colliderid"), null);
    }

    public long m()
    {
        return c.getLong(d("interstitial_last_shown_time"), 0L);
    }

    public void n()
    {
        c.edit().putLong(d("interstitial_last_shown_time"), System.currentTimeMillis()).apply();
    }

    public long o()
    {
        return c.getLong(d("first_login_time"), -1L);
    }

    public void onSignInState(an an1)
    {
        d = an1.a;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 2: // '\002'
            I();
            // fall through

        case 1: // '\001'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public void onUserData(bo bo1)
    {
        d = bo1.a;
    }

    public void p()
    {
        b.c(this);
    }

    public void q()
    {
        if (!c.contains(d("first_login_time")))
        {
            c.edit().putLong(d("first_login_time"), System.currentTimeMillis()).apply();
        }
    }

    public boolean r()
    {
        return c.getBoolean("daydream_show_clock", false);
    }

    public boolean s()
    {
        return c.getBoolean("daydream_dim_screen", true);
    }

    public List t()
    {
        ArrayList arraylist = new ArrayList();
        String as[] = TextUtils.split(c.getString("active_ab_tests", ""), ", ");
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            arraylist.add(Integer.valueOf(Integer.parseInt(as[i1])));
        }

        return arraylist;
    }

    public boolean u()
    {
        return c.getBoolean("ignore_server_ab_tests", false);
    }

    public String v()
    {
        if (!F())
        {
            G();
        }
        return c.getString("audio_preference", "normal");
    }

    public boolean w()
    {
        return c.getBoolean("initial_audio_setting", false);
    }

    public boolean x()
    {
        if (!F())
        {
            G();
        }
        return c.getBoolean("force_screen_bright", false);
    }

    public String y()
    {
        if (!F())
        {
            G();
        }
        return c.getString("bluetooth_for_auto", null);
    }

    public long z()
    {
        return c.getLong("last_casting_available_event", 0L);
    }
}
