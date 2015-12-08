// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphObject;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.NowPlaying;
import com.pandora.android.data.d;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;
import p.bx.e;
import p.cm.m;
import p.cw.c;
import p.cx.ac;
import p.df.a;
import p.l.g;
import p.l.j;

// Referenced classes of package p.ca:
//            o

public class al extends o
    implements com.pandora.android.util.af.d
{

    final p.bx.b.b a = new p.bx.b.b() {

        final al a;

        private void a(boolean flag)
        {
            p.ca.al.g(a).post(new Runnable(this, flag) {

                final boolean a;
                final _cls7 b;

                public void run()
                {
                    p.ca.al.a(b.a, a);
                    al.f(b.a).setSelected(a);
                }

            
            {
                b = _pcls7;
                a = flag;
                super();
            }
            });
        }

        public void a()
        {
            a(true);
        }

        public void b()
        {
            a(false);
        }

        public void c()
        {
            a(false);
        }

            
            {
                a = al.this;
                super();
            }
    };
    final p.bx.e.b b = new p.bx.e.b() {

        final al a;

        private void a(boolean flag)
        {
            a(flag, false);
        }

        private void a(boolean flag, boolean flag1)
        {
            p.ca.al.g(a).post(new Runnable(this, flag, flag1) {

                final boolean a;
                final boolean b;
                final _cls8 c;

                public void run()
                {
                    p.ca.al.b(c.a, a);
                    p.ca.al.b(c.a).setSelected(a);
                    if (b)
                    {
                        Object obj = c.a.getActivity();
                        if (obj != null && !((Activity) (obj)).isFinishing())
                        {
                            obj = (new android.app.AlertDialog.Builder(((android.content.Context) (obj)))).setMessage(0x7f080281).create();
                            ((AlertDialog) (obj)).setCanceledOnTouchOutside(true);
                            ((AlertDialog) (obj)).show();
                        }
                    }
                }

            
            {
                c = _pcls8;
                a = flag;
                b = flag1;
                super();
            }
            });
        }

        public void a()
        {
            a(true);
        }

        public void b()
        {
            a(false, true);
        }

        public void c()
        {
            a(false);
        }

            
            {
                a = al.this;
                super();
            }
    };
    private ImageView c;
    private TextView d;
    private TextView e;
    private EditText f;
    private ImageButton g;
    private ImageButton h;
    private Button l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private aa q;
    private y r;
    private boolean s;
    private String t;
    private String u;
    private int v;
    private boolean w;
    private Handler x;
    private android.view.View.OnClickListener y;

    public al()
    {
        y = new android.view.View.OnClickListener() {

            final al a;

            public void onClick(View view)
            {
                if (!((RadioButton)view).isChecked())
                {
                    return;
                }
                view.getId();
                JVM INSTR tableswitch 2131755620 2131755620: default 32
            //                           2131755620 54;
                   goto _L1 _L2
_L1:
                p.ca.al.b(a, 1);
_L4:
                com.pandora.android.util.af.a().a(a.v());
                return;
_L2:
                p.ca.al.b(a, 2);
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = al.this;
                super();
            }
        };
    }

    private String a(int i1, String s1, String s2)
    {
        String s3 = null;
        if ((i1 & 1) != 0)
        {
            s3 = getString(0x7f080239, new Object[] {
                s1
            });
        } else
        if ((i1 & 2) != 0)
        {
            return getString(0x7f08023a, new Object[] {
                s1, s2
            });
        }
        return s3;
    }

    static String a(aa aa1, String s1, String s2, String s3, String s4)
    {
        String s5 = d.g;
        String s6 = com.pandora.android.util.s.b(aa1.s());
        String s7 = com.pandora.android.util.s.b(aa1.t());
        s1 = com.pandora.android.util.s.b(s1);
        aa1 = aa1.v();
        if (s3 == null)
        {
            s3 = s4;
        }
        return String.format("%sstatic/fb-share.swf?Song=%s&Artist=%s&Station=%s&AlbumArt=%s&SampleTrack=%s&StationLink=%s", new Object[] {
            s5, s6, s7, s1, aa1, s2, s3
        });
    }

    static String a(String s1, String s2)
    {
        return String.format("%s/land/station/%s?referrer=%s&site=facebook&shareImp=1&seed=song", new Object[] {
            d.g, s1, s2
        });
    }

    static String a(String s1, String s2, String s3)
    {
        return String.format("%s?ext_lsfmi=mf%s%%7C%s%%7C%s&site=facebook&shareImp=1&seed=song", new Object[] {
            d.g, s1, s2, s3
        });
    }

    private void a(int i1, String s1)
    {
        if (i1 == 2)
        {
            ac.a(q, s1);
            return;
        } else
        {
            ac.a(r, s1);
            return;
        }
    }

    static void a(al al1, int i1)
    {
        al1.j(i1);
    }

    private void a(boolean flag)
    {
        String s2 = f.getText().toString();
        if (!f.isFocused() || s2.length() <= 0) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        String s1;
        s1 = s2;
        if (r != null)
        {
            s1 = s2;
            if (r.g())
            {
                s1 = s2.replace(r.f(), "");
            }
        }
_L6:
        s1 = s1.replace((new StringBuilder()).append(" ").append(getString(0x7f0801fb)).toString(), "");
        p = false;
        f.setText(s1);
_L2:
        return;
_L4:
        s1 = s2;
        if (q != null)
        {
            s1 = s2;
            if (q.X())
            {
                s1 = s2.replace(q.V(), "");
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(al al1)
    {
        return al1.p;
    }

    static boolean a(al al1, boolean flag)
    {
        al1.n = flag;
        return flag;
    }

    static ImageButton b(al al1)
    {
        return al1.h;
    }

    static String b(String s1, String s2)
    {
        return String.format("%sfavorites/getSample.jsp?token=%s&allowExplicit=%s", new Object[] {
            d.g, s1, s2
        });
    }

    private void b(int i1, String s1)
    {
        String s2;
        Object obj;
        Bundle bundle;
        af af1;
        boolean flag;
        if (r != null)
        {
            obj = r.c();
        } else
        {
            obj = "";
        }
        if (r != null)
        {
            s2 = r.d();
        } else
        {
            s2 = "";
        }
        if (r != null && r.t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af1 = b.a.d();
        bundle = new Bundle();
        bundle.putString("message", s1);
        if (i1 == 2)
        {
            String s3;
            String s4;
            if (b.a.b().k().t().n())
            {
                s3 = "true";
            } else
            {
                s3 = "false";
            }
            if (com.pandora.android.util.s.a(q.L()))
            {
                s1 = p.cp.b.a(r, q, true, true);
            } else
            {
                s1 = q.L();
            }
            s4 = a(q.w(), ((String) (obj)), af1.d());
            if (r != null)
            {
                obj = a(((String) (obj)), af1.j());
            } else
            {
                obj = null;
            }
            s3 = b(q.w(), s3);
            s2 = a(q, s2, s3, ((String) (obj)), s1);
            bundle.putString("name", q.s());
            bundle.putString("caption", (new StringBuilder()).append("by ").append(q.t()).toString());
            bundle.putString("description", (new StringBuilder()).append("on ").append(q.u()).toString());
            bundle.putString("link", s1);
            bundle.putString("picture", q.v());
            bundle.putString("source", s2);
            s2 = s4;
        } else
        {
            s1 = String.format("%sland/station/%s?referrer=%s&seed=station&shareImp=1", new Object[] {
                d.g, obj, af1.j()
            });
            obj = String.format("%s on Pandora will play music by %s", new Object[] {
                s2, r.p()
            });
            bundle.putString("name", s2);
            bundle.putString("caption", "Listen at Pandora");
            bundle.putString("description", ((String) (obj)));
            bundle.putString("link", s1);
            bundle.putString("picture", r.o());
            s2 = s1;
        }
        obj = new JSONObject();
        ((JSONObject) (obj)).put("name", "Listen at Pandora");
        if (!flag)
        {
            s1 = s2;
        }
        try
        {
            ((JSONObject) (obj)).put("link", s1);
            bundle.putString("actions", ((JSONObject) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        p.bx.d.a().a(bundle, new com.facebook.Request.Callback() {

            final al a;

            public void onCompleted(Response response)
            {
                GraphObject graphobject = response.getGraphObject();
                Object obj2 = null;
                Object obj1 = obj2;
                if (graphobject != null)
                {
                    obj1 = graphobject.getInnerJSONObject();
                    try
                    {
                        obj1 = ((JSONObject) (obj1)).getString("id");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        p.df.a.a("ShareFragment", (new StringBuilder()).append("JSON error ").append(((JSONException) (obj1)).getMessage()).toString());
                        obj1 = obj2;
                    }
                }
                response = response.getError();
                if (response != null)
                {
                    p.df.a.c("ShareFragment", (new StringBuilder()).append("Facebook post error : ").append(response.getErrorMessage()).toString());
                    return;
                } else
                {
                    p.df.a.a("ShareFragment", (new StringBuilder()).append("Facebook post successful.  postId : ").append(((String) (obj1))).toString());
                    return;
                }
            }

            
            {
                a = al.this;
                super();
            }
        });
        return;
    }

    static void b(al al1, int i1)
    {
        al1.c(i1);
    }

    static boolean b(al al1, boolean flag)
    {
        al1.o = flag;
        return flag;
    }

    private void c(int i1)
    {
        boolean flag = true;
        boolean flag2 = m;
        boolean flag1;
        if ((i1 & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        m = flag1;
        if (!s || flag2 == m)
        {
            flag = false;
        }
        if (!s || flag)
        {
            d(i1);
            g(i1);
            a(flag2);
        }
    }

    private void c(int i1, String s1)
    {
        if (i1 == 2)
        {
            aa aa1 = q;
            boolean flag;
            if (r == null)
            {
                flag = false;
            } else
            {
                flag = r.A();
            }
            PandoraService.a(aa1, s1, flag);
            return;
        } else
        {
            PandoraService.a(r, s1, r.A());
            return;
        }
    }

    static void c(al al1)
    {
        al1.e();
    }

    private void d(int i1)
    {
        String s2 = null;
        String s1;
        String s3;
        String s4;
        if ((i1 & 1) != 0)
        {
            s2 = r.d();
            s1 = r.p();
            s4 = s2;
            s3 = null;
        } else
        if ((i1 & 2) != 0)
        {
            s2 = q.s();
            s3 = q.t();
            s1 = getResources().getString(0x7f080236, new Object[] {
                s3
            });
            s4 = s2;
        } else
        {
            s1 = null;
            s3 = null;
            s4 = null;
        }
        d.setText(s2);
        e.setText(s1);
        f.setHint(a(i1, s4, s3));
        if (com.pandora.android.util.s.u())
        {
            ((TextView)b(0x7f10025f)).setText(getResources().getString(0x7f08023c, new Object[] {
                s4
            }));
        }
    }

    static void d(al al1)
    {
        al1.f();
    }

    private String e(int i1)
    {
        return String.format("%s %s", new Object[] {
            f(i1), getString(0x7f0801fb)
        });
    }

    private void e()
    {
        boolean flag;
        if (!n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        g.setSelected(n);
        if (n && !p.bx.d.a().c())
        {
            FragmentActivity fragmentactivity = getActivity();
            (new m()).execute(new Object[] {
                new p.cm.m.a(fragmentactivity) {

                    final Activity a;
                    final al b;

                    public void a()
                    {
                        p.bx.d.a().a(b.a, a);
                    }

                    public void b()
                    {
                        p.ca.al.a(b, false);
                        al.f(b).setSelected(false);
                    }

            
            {
                b = al.this;
                a = activity;
                super();
            }
                }
            });
        }
    }

    static void e(al al1)
    {
        al1.g();
    }

    static ImageButton f(al al1)
    {
        return al1.g;
    }

    private String f(int i1)
    {
        if ((i1 & 1) != 0)
        {
            String s1;
            if (o)
            {
                s1 = q();
            } else
            {
                s1 = r.d();
            }
            return getString(0x7f080237, new Object[] {
                s1
            });
        }
        if ((i1 & 2) != 0)
        {
            String s2;
            if (o)
            {
                s2 = r();
            } else
            {
                s2 = q.t();
            }
            return getString(0x7f080238, new Object[] {
                q.s(), s2
            });
        } else
        {
            return "";
        }
    }

    private void f()
    {
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        h.setSelected(o);
        if (o)
        {
            p.bx.d.b().a(getActivity(), b);
            if (f.isFocused() && !p)
            {
                j(f.getText().length());
            }
            f.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(115)
            });
            return;
        } else
        {
            f.setFilters(new InputFilter[0]);
            return;
        }
    }

    static Handler g(al al1)
    {
        return al1.p();
    }

    private void g()
    {
        boolean flag = true;
        Object obj;
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setType("plain/text");
        int i1;
        if (m)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", h(i1));
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", i(i1));
        startActivityForResult(Intent.createChooser(((Intent) (obj)), "Send mail..."), 126);
        obj = b.a.b().o();
        if (m)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 2;
        }
        try
        {
            ((k) (obj)).a(i1, true, false, false, false);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            return;
        }
    }

    private void g(int i1)
    {
        if ((i1 & 1) != 0)
        {
            p.l.g.a(this).a(r.o()).a(0x7f0200e9).a(c);
        } else
        if ((i1 & 2) != 0)
        {
            p.l.g.a(this).a(q.v()).a(p.s.b.c).a(0x7f0200e9).a(c);
            return;
        }
    }

    private String h(int i1)
    {
        String s1;
        if (i1 == 2)
        {
            s1 = "this song";
        } else
        {
            s1 = (new StringBuilder()).append("my ").append(r.d()).append(" station").toString();
        }
        return String.format("Check out %s on Pandora", new Object[] {
            s1
        });
    }

    private void h()
    {
        String s1;
        String s2;
        int i1;
        byte byte1;
        byte1 = 2;
        if (m)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        s2 = com.pandora.android.util.s.a(f.getText());
        if (TextUtils.isEmpty(s2))
        {
            s1 = e(i1);
        } else
        {
            s1 = s2;
        }
        a(i1, s1);
        if (!n) goto _L2; else goto _L1
_L1:
        if (p.bx.d.a().c()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        b(i1, s2);
_L2:
        if (!o)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!p.bx.d.b().a())
        {
            continue; /* Loop/switch isn't completed */
        }
        c(i1, s1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L5
_L5:
        k k1 = b.a.b().o();
        byte byte0 = byte1;
        if (m)
        {
            byte0 = 1;
        }
        k1.a(byte0, false, true, n, o);
        b.a.b().k().a(n, o);
        k.a(-1);
        return;
    }

    private String i(int i1)
    {
        String s1;
        if (i1 == 2)
        {
            s1 = p.cp.b.a(r, q, false, true);
        } else
        {
            s1 = p.cp.b.a(r);
        }
        return String.format("%s\n%s\n\n%s", new Object[] {
            com.pandora.android.util.s.a(f.getText()), f(i1), s1
        });
    }

    private void j(int i1)
    {
        p = true;
        if (m)
        {
            EditText edittext = f;
            String s1;
            if (r.g())
            {
                s1 = r.f();
            } else
            {
                s1 = "";
            }
            edittext.append(getString(0x7f08023b, new Object[] {
                s1, getString(0x7f0801fb)
            }));
        } else
        {
            EditText edittext1 = f;
            String s2;
            if (q.X())
            {
                s2 = q.V();
            } else
            {
                s2 = "";
            }
            edittext1.append(getString(0x7f08023b, new Object[] {
                s2, getString(0x7f0801fb)
            }));
        }
        f.setSelection(i1);
    }

    private Handler p()
    {
        if (x == null)
        {
            x = new Handler(Looper.getMainLooper());
        }
        return x;
    }

    private String q()
    {
        if (com.pandora.android.util.s.a(r.f()))
        {
            return r.d();
        } else
        {
            return r.f();
        }
    }

    private String r()
    {
        if (com.pandora.android.util.s.a(q.V()))
        {
            return q.t();
        } else
        {
            return q.V();
        }
    }

    public void b(View view)
    {
        h();
    }

    public CharSequence d()
    {
        return getString(0x7f08023d);
    }

    public boolean n()
    {
        return false;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 126: // '~'
            k.a(-1);
            break;
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f12000f, menu);
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (!com.pandora.android.util.s.u())
        {
            setHasOptionsMenu(true);
        }
        m = false;
        j = layoutinflater.inflate(0x7f040092, viewgroup, false);
        getActivity().setTitle(getActivity().getString(0x7f08023d));
        c = (ImageView)b(0x7f100266);
        d = (TextView)b(0x7f100268);
        e = (TextView)b(0x7f100269);
        f = (EditText)b(0x7f10026b);
        g = (ImageButton)b(0x7f10026c);
        h = (ImageButton)b(0x7f10026d);
        l = (Button)b(0x7f10026e);
        layoutinflater = (RadioButton)b(0x7f100263);
        viewgroup = (RadioButton)b(0x7f100264);
        layoutinflater.setOnClickListener(y);
        viewgroup.setOnClickListener(y);
        f.addTextChangedListener(new TextWatcher() {

            final al a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                if (!p.ca.al.a(a) && p.ca.al.b(a).isSelected())
                {
                    i1 = charsequence.length();
                    p.ca.al.a(a, i1);
                }
            }

            
            {
                a = al.this;
                super();
            }
        });
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final al a;

            public void onClick(View view)
            {
                p.ca.al.c(a);
            }

            
            {
                a = al.this;
                super();
            }
        });
        h.setOnClickListener(new android.view.View.OnClickListener() {

            final al a;

            public void onClick(View view)
            {
                p.ca.al.d(a);
            }

            
            {
                a = al.this;
                super();
            }
        });
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final al a;

            public void onClick(View view)
            {
                p.ca.al.e(a);
            }

            
            {
                a = al.this;
                super();
            }
        });
        layoutinflater = (ImageButton)b(0x7f100260);
        if (layoutinflater != null)
        {
            layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

                final al a;

                public void onClick(View view)
                {
                    a.b(view);
                }

            
            {
                a = al.this;
                super();
            }
            });
        }
        layoutinflater = getArguments();
        if (layoutinflater == null)
        {
            throw new InvalidParameterException("ShareFragment missing intent value, INTENT_TRACK_DATA or INTENT_STATION_DATA must be non null for SHARE_TRACK | SHARE_STATION");
        }
        if (layoutinflater.containsKey("intent_share_from"))
        {
            u = layoutinflater.getString("intent_share_from");
        }
        if (layoutinflater.containsKey("intent_track_data"))
        {
            q = (aa)layoutinflater.getSerializable("intent_track_data");
            if (q.M())
            {
                k.a(-1);
                return null;
            }
            if (q.w().equals(q.R()))
            {
                w = true;
            }
        }
        if (layoutinflater.containsKey("intent_station_data"))
        {
            r = (y)layoutinflater.getSerializable("intent_station_data");
        }
        t = layoutinflater.getString("intent_track_key");
        v = layoutinflater.getInt("intent_share_type", 1);
        if (v == 3)
        {
            s = true;
            c(1);
        } else
        {
            b(0x7f100262).setVisibility(8);
            c(v);
        }
        if (t == null && (v & 2) != 0 && !w)
        {
            throw new InvalidParameterException("ShareFragment missing intent value, INTENT_TRACK_KEY must be non null for SHARE_TRACK");
        }
        layoutinflater = p.bx.d.b();
        layoutinflater.b(b);
        if (layoutinflater.c() && layoutinflater.a())
        {
            f();
        }
        layoutinflater = p.bx.d.a();
        layoutinflater.a(a);
        layoutinflater.a();
        if (layoutinflater.g() && layoutinflater.c())
        {
            e();
        }
        return j;
    }

    public void onDestroy()
    {
        super.onDestroy();
        Session session = Session.getActiveSession();
        if (session != null && session.getState().equals(SessionState.OPENING))
        {
            session.close();
        }
        p.bx.d.a().b(a);
        p.bx.d.b().a(b);
        if (x != null)
        {
            x.removeCallbacksAndMessages(null);
            x = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f10001b)
        {
            h();
            return true;
        } else
        {
            k.a(-1);
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onResume()
    {
        super.onResume();
        com.pandora.android.util.af.a().a(v());
    }

    public com.pandora.android.util.af.c v()
    {
        if (!com.pandora.android.util.s.a(u))
        {
            if (u.equalsIgnoreCase(com/pandora/android/activity/HomeTabsActivity.getSimpleName()))
            {
                return com.pandora.android.util.af.c.U;
            }
            if (u.equalsIgnoreCase(com/pandora/android/activity/NowPlaying.getSimpleName()))
            {
                if (m)
                {
                    return com.pandora.android.util.af.c.T;
                } else
                {
                    return com.pandora.android.util.af.c.S;
                }
            }
        }
        return com.pandora.android.util.af.c.aa;
    }
}
