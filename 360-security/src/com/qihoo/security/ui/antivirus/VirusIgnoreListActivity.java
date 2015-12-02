// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.app.f;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            MalwareDetailActivity, AppDetailActivity

public class VirusIgnoreListActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener
{
    private class a extends com.qihoo.security.c.a.a
    {

        final VirusIgnoreListActivity c;

        static Context a(a a1)
        {
            return a1.b;
        }

        protected void a(View view, int i, ViewGroup viewgroup)
        {
            viewgroup = (RemoteImageView)f.a(view, 0x7f0b0220);
            LocaleTextView localetextview = (LocaleTextView)f.a(view, 0x7f0b0221);
            view = (LocaleButton)f.a(view, 0x7f0b0222);
            MaliciousInfo maliciousinfo = (MaliciousInfo)getItem(i);
            viewgroup.b(maliciousinfo.packageName, 0x7f020044);
            localetextview.setTag(maliciousinfo.packageName);
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(new com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(this, localetextview) {

                final LocaleTextView a;
                final a b;

                public void a(String s, String s1)
                {
                    String s2 = (String)a.getTag();
                    if (!TextUtils.isEmpty(s2) && s2.equals(s1) && s != null)
                    {
                        a.setLocalText(s);
                    }
                }

            
            {
                b = a1;
                a = localetextview;
                super();
            }
            }, "appLabel", maliciousinfo.packageName, maliciousinfo.filePath);
            view.setOnClickListener(new android.view.View.OnClickListener(this, maliciousinfo) {

                final MaliciousInfo a;
                final a b;

                public void onClick(View view)
                {
                    VirusIgnoreListActivity.b(b.c, true);
                    com.qihoo.security.malware.db.c.a(a.a(b), a._id);
                    VirusIgnoreListActivity.b(b.c).remove(a);
                    b.notifyDataSetChanged();
                }

            
            {
                b = a1;
                a = maliciousinfo;
                super();
            }
            });
        }

        public void a(List list)
        {
            a = list;
            notifyDataSetChanged();
        }

        protected int b()
        {
            return 0x7f0300a8;
        }

        public a(Context context, List list)
        {
            c = VirusIgnoreListActivity.this;
            super(context, list);
        }
    }


    private List A;
    private ProgressBar B;
    private boolean C;
    private boolean D;
    private ListView y;
    private a z;

    public VirusIgnoreListActivity()
    {
    }

    static ProgressBar a(VirusIgnoreListActivity virusignorelistactivity)
    {
        return virusignorelistactivity.B;
    }

    static List a(VirusIgnoreListActivity virusignorelistactivity, List list)
    {
        virusignorelistactivity.A = list;
        return list;
    }

    private void a(MaliciousInfo maliciousinfo)
    {
        Intent intent = new Intent(p, com/qihoo/security/ui/antivirus/MalwareDetailActivity);
        intent.putExtra("extra_detail_info", maliciousinfo);
        startActivityForResult(intent, 0);
    }

    static boolean a(VirusIgnoreListActivity virusignorelistactivity, boolean flag)
    {
        virusignorelistactivity.C = flag;
        return flag;
    }

    static List b(VirusIgnoreListActivity virusignorelistactivity)
    {
        return virusignorelistactivity.A;
    }

    private void b(MaliciousInfo maliciousinfo)
    {
        Intent intent = new Intent(p, com/qihoo/security/ui/antivirus/AppDetailActivity);
        intent.putExtra("extra_detail_info", maliciousinfo);
        startActivity(intent);
    }

    static boolean b(VirusIgnoreListActivity virusignorelistactivity, boolean flag)
    {
        virusignorelistactivity.D = flag;
        return flag;
    }

    static a c(VirusIgnoreListActivity virusignorelistactivity)
    {
        return virusignorelistactivity.z;
    }

    private void o()
    {
        y = (ListView)findViewById(0x7f0b021f);
        y.setEmptyView(findViewById(0x7f0b0093));
        z = new a(p, A);
        y.setAdapter(z);
        y.setOnItemClickListener(this);
        B = (ProgressBar)findViewById(0x7f0b009c);
    }

    private void p()
    {
        Iterator iterator = A.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
            if (maliciousinfo.isUninstall(p))
            {
                iterator.remove();
                com.qihoo.security.malware.db.c.a(p, maliciousinfo._id);
            }
        } while (true);
        z.notifyDataSetChanged();
    }

    private void q()
    {
        (new Thread() {

            final VirusIgnoreListActivity a;

            public void run()
            {
                List list = com.qihoo.security.malware.db.c.a(a.p);
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    MaliciousInfo maliciousinfo = (MaliciousInfo)iterator.next();
                    if (maliciousinfo.isUninstall(a.p))
                    {
                        iterator.remove();
                        com.qihoo.security.malware.db.c.a(a.p, maliciousinfo._id);
                    } else
                    if (maliciousinfo.isInMonitorList)
                    {
                        iterator.remove();
                    }
                } while (true);
                a.runOnUiThread(new Runnable(this, list) {

                    final List a;
                    final _cls1 b;

                    public void run()
                    {
                        VirusIgnoreListActivity.a(b.a).setVisibility(8);
                        VirusIgnoreListActivity.a(b.a, true);
                        VirusIgnoreListActivity.a(b.a, a);
                        com.qihoo.security.ui.antivirus.VirusIgnoreListActivity.c(b.a).a(VirusIgnoreListActivity.b(b.a));
                    }

            
            {
                b = _pcls1;
                a = list;
                super();
            }
                });
            }

            
            {
                a = VirusIgnoreListActivity.this;
                super();
            }
        }).start();
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(0x7f0c0116);
        }
    }

    protected void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (i == 0 && k == -1 && intent != null)
        {
            intent = (MaliciousInfo)intent.getSerializableExtra("extra_detail_info");
            if (intent != null && A != null)
            {
                D = true;
                A.remove(intent);
                z.notifyDataSetChanged();
            }
        }
    }

    public void onBackPressed()
    {
        if (D)
        {
            setResult(-1);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300a7);
        o();
        q();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (MaliciousInfo)A.get(i);
        if (adapterview.isWarning())
        {
            a(adapterview);
            return;
        } else
        {
            b(adapterview);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (C)
        {
            p();
        }
    }
}
