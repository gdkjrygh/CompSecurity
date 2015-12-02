// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.security.gamebooster:
//            a

public class AddGamesActivity extends BaseActivity
{
    private class a extends AsyncTask
    {

        final AddGamesActivity a;
        private Context b;

        protected transient Void a(Void avoid[])
        {
            a.a(b);
            return null;
        }

        protected void a(Void void1)
        {
            if (a.C == null || a.C.size() == 0)
            {
                AddGamesActivity.d(a).setEmptyView(AddGamesActivity.c(a));
                com.qihoo.security.gamebooster.AddGamesActivity.b(a).setVisibility(8);
            } else
            {
                AddGamesActivity.d(a).setAdapter(AddGamesActivity.e(a));
                AddGamesActivity.e(a).a(a.C);
                AddGamesActivity.e(a).notifyDataSetChanged();
                com.qihoo.security.gamebooster.AddGamesActivity.b(a).setVisibility(0);
            }
            com.qihoo.security.gamebooster.AddGamesActivity.a(a).setVisibility(8);
            com.qihoo.security.gamebooster.AddGamesActivity.a(a, null);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        protected void onPreExecute()
        {
            com.qihoo.security.gamebooster.AddGamesActivity.a(a).setVisibility(0);
            com.qihoo.security.gamebooster.AddGamesActivity.b(a).setVisibility(8);
        }

        public a(Context context)
        {
            a = AddGamesActivity.this;
            super();
            b = context;
        }
    }


    ArrayList A;
    ArrayList B;
    ArrayList C;
    private LocaleTextView D;
    private View E;
    private ListView F;
    private View G;
    private com.qihoo.security.gamebooster.a H;
    private Intent I;
    private PackageManager J;
    private a K;
    private ArrayList L;
    public ArrayList y;
    ArrayList z;

    public AddGamesActivity()
    {
    }

    static View a(AddGamesActivity addgamesactivity)
    {
        return addgamesactivity.E;
    }

    static a a(AddGamesActivity addgamesactivity, a a1)
    {
        addgamesactivity.K = a1;
        return a1;
    }

    static LocaleTextView b(AddGamesActivity addgamesactivity)
    {
        return addgamesactivity.D;
    }

    static View c(AddGamesActivity addgamesactivity)
    {
        return addgamesactivity.G;
    }

    private void c(Intent intent)
    {
        F.setAdapter(null);
        E.setVisibility(0);
        y = intent.getStringArrayListExtra("packages");
        boolean flag = intent.getBooleanExtra("from_gameboost", false);
        H = new com.qihoo.security.gamebooster.a(p, null, J, flag);
        K = new a(this);
        K.execute(new Void[0]);
        com.qihoo.security.support.b.b(11110);
    }

    static ListView d(AddGamesActivity addgamesactivity)
    {
        return addgamesactivity.F;
    }

    static com.qihoo.security.gamebooster.a e(AddGamesActivity addgamesactivity)
    {
        return addgamesactivity.H;
    }

    private void o()
    {
        D = (LocaleTextView)findViewById(0x7f0b0077);
        E = findViewById(0x7f0b009b);
        F = (ListView)findViewById(0x102000a);
        G = findViewById(0x7f0b008f);
        ((LocaleTextView)G.findViewById(0x7f0b0091)).setVisibility(8);
    }

    public void a(Context context)
    {
        z = new ArrayList();
        A = new ArrayList();
        C = new ArrayList();
        B = com.qihoo360.mobilesafe.b.a.a(context.getPackageManager());
        if (y != null && y.size() != 0)
        {
            context = B.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                com.qihoo.security.c.a a1 = (com.qihoo.security.c.a)context.next();
                if (y.contains(a1.a.packageName) || "com.qihoo.security.lite".equals(a1.a.packageName))
                {
                    context.remove();
                }
            } while (true);
        } else
        {
            context = B.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                if ("com.qihoo.security.lite".equals(((com.qihoo.security.c.a)context.next()).a.packageName))
                {
                    context.remove();
                }
            } while (true);
        }
        if (B != null && B.size() != 0)
        {
            for (context = B.iterator(); context.hasNext();)
            {
                com.qihoo.security.c.a a2 = (com.qihoo.security.c.a)context.next();
                if ((a2.a.flags & 1) == 0)
                {
                    z.add(a2);
                } else
                {
                    A.add(a2);
                }
            }

            if (z != null && z.size() != 0)
            {
                C.addAll(z);
            }
            if (A != null && A.size() != 0)
            {
                C.addAll(A);
                return;
            }
        }
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(0x7f0c008f);
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(0x7f040023, 0x7f040017);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001f);
        J = getPackageManager();
        o();
        if (bundle != null && bundle.getBoolean("hasSave"))
        {
            return;
        } else
        {
            I = getIntent();
            c(I);
            return;
        }
    }

    protected void onDestroy()
    {
        if (y != null)
        {
            y = null;
        }
        if (K != null)
        {
            K = null;
        }
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        c(intent);
    }

    protected void onPause()
    {
        super.onPause();
        if (H != null)
        {
            L = H.a();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (L != null && L.size() != 0 && C != null)
        {
            Iterator iterator = C.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.qihoo.security.c.a a1 = (com.qihoo.security.c.a)iterator.next();
                if (L.contains(a1.a.packageName))
                {
                    a1.g = true;
                }
            } while (true);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hasSave", true);
    }
}
