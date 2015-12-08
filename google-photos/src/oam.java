// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public final class oam
{

    Activity a;
    oad b;
    public PreferenceScreen c;
    List d;
    List e;
    public List f;
    oap g;
    private Context h;
    private long i;
    private int j;
    private SharedPreferences k;
    private String l;

    public oam(Activity activity, int i1)
    {
        i = 0L;
        a = activity;
        j = 100;
        h = activity;
        l = c(activity);
        k = null;
    }

    public static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences(c(context), 0);
    }

    private static String c(Context context)
    {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        l1 = i;
        i = 1L + l1;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final PreferenceScreen a(Context context)
    {
        context = new PreferenceScreen(context, null);
        context.a(this);
        return context;
    }

    public final SharedPreferences b()
    {
        if (k == null)
        {
            k = h.getSharedPreferences(l, 0);
        }
        return k;
    }

    final android.content.SharedPreferences.Editor c()
    {
        return b().edit();
    }

    final int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = j;
        j = i1 + 1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ArrayList arraylist;
        arraylist = new ArrayList(f);
        f.clear();
        this;
        JVM INSTR monitorexit ;
        for (int i1 = arraylist.size() - 1; i1 >= 0; i1--)
        {
            ((DialogInterface)arraylist.get(i1)).dismiss();
        }

        break MISSING_BLOCK_LABEL_71;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
