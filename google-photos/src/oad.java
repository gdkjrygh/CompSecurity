// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class oad extends am
    implements oap
{

    private ListView a;
    private final Runnable b = new oaf(this);
    private android.view.View.OnKeyListener c;
    public oam d;
    boolean e;
    boolean f;
    Handler g;

    public oad()
    {
        g = new oae(this);
        c = new oag(this);
    }

    static void a(oad oad1)
    {
        oad1.r();
    }

    static ListView b(oad oad1)
    {
        return oad1.a;
    }

    private void r()
    {
        PreferenceScreen preferencescreen = t();
        if (preferencescreen != null)
        {
            if (a == null)
            {
                View view = super.R;
                if (view == null)
                {
                    throw new IllegalStateException("Content view not yet created");
                }
                view = view.findViewById(0x102000a);
                if (!(view instanceof ListView))
                {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                a = (ListView)view;
                if (a == null)
                {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                a.setOnKeyListener(c);
                g.post(b);
            }
            preferencescreen.a(a);
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(p.bN, viewgroup, false);
    }

    public void a(int i, int j, Intent intent)
    {
label0:
        {
            super.a(i, j, intent);
            synchronized (d)
            {
                if (oam1.d != null)
                {
                    break label0;
                }
            }
            return;
        }
        ArrayList arraylist = new ArrayList(oam1.d);
        oam1;
        JVM INSTR monitorexit ;
        int k = arraylist.size();
        for (j = 0; j < k && !((oao)arraylist.get(j)).a(i, intent); j++) { }
        break MISSING_BLOCK_LABEL_96;
        intent;
        oam1;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        d = new oam(O_(), 100);
        d.b = this;
    }

    public final boolean a(nzw nzw1)
    {
        if (nzw1.p != null && (O_() instanceof oah))
        {
            return ((oah)O_()).a();
        } else
        {
            return false;
        }
    }

    public void aj_()
    {
        super.aj_();
        synchronized (d) { }
        d.g = null;
        return;
        exception;
        oam1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void ak_()
    {
        a = null;
        g.removeCallbacks(b);
        g.removeMessages(1);
        super.ak_();
    }

    public void au_()
    {
        super.au_();
        d.g = this;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (e)
        {
            r();
        }
        f = true;
        if (bundle != null)
        {
            bundle = bundle.getBundle("settings:preferences");
            if (bundle != null)
            {
                PreferenceScreen preferencescreen = d.c;
                if (preferencescreen != null)
                {
                    preferencescreen.b(bundle);
                }
            }
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        PreferenceScreen preferencescreen = d.c;
        if (preferencescreen != null)
        {
            Bundle bundle1 = new Bundle();
            preferencescreen.a(bundle1);
            bundle.putBundle("settings:preferences", bundle1);
        }
    }

    public void n()
    {
        oam oam1 = d;
        oam1;
        JVM INSTR monitorenter ;
        Object obj;
        if (oam1.e == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = new ArrayList(oam1.e);
_L2:
        if (obj != null)
        {
            int j = ((List) (obj)).size();
            for (int i = 0; i < j; i++)
            {
                ((oan)((List) (obj)).get(i)).c();
            }

        }
        break MISSING_BLOCK_LABEL_75;
        obj;
        oam1;
        JVM INSTR monitorexit ;
        throw obj;
        oam1.e();
        super.n();
        return;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final PreferenceScreen t()
    {
        return d.c;
    }
}
