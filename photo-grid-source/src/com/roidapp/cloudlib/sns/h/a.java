// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.r;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.u;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            e, f, g, b, 
//            c, d

public class a extends DialogFragment
    implements TextWatcher, android.view.View.OnClickListener
{

    private x a;
    private String b;
    private String c;
    private EditText d;
    private TextView e;
    private TextView f;
    private View g;
    private View h;
    private View i;
    private ImageView j;
    private android.content.DialogInterface.OnDismissListener k;
    private Handler l;
    private Uri m;
    private Bundle n;
    private String o;
    private EditText p;
    private String q[];
    private r r;
    private boolean s;
    private Pattern t;
    private Runnable u;

    public a()
    {
        s = true;
        t = Pattern.compile("[^0-9a-zA-Z]");
        u = new com.roidapp.cloudlib.sns.h.e(this);
        setStyle(0, 2);
    }

    private String a(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return t.matcher(s1).replaceAll("");
        }
    }

    private void a(int i1, boolean flag)
    {
        if (isAdded() && getActivity() != null && h != null && g != null && f != null)
        {
            h.clearAnimation();
            h.setVisibility(0);
            f.setText(i1);
            AlphaAnimation alphaanimation;
            if (flag)
            {
                if (l == null)
                {
                    l = new Handler(aj.a().getMainLooper());
                }
                l.removeCallbacks(u);
                h.setClickable(true);
                l.postDelayed(u, 3000L);
                g.setVisibility(0);
            } else
            {
                h.setClickable(false);
                g.setVisibility(8);
            }
            alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setFillAfter(true);
            alphaanimation.setDuration(3000L);
            h.startAnimation(alphaanimation);
        }
    }

    static void a(a a1)
    {
        Intent intent;
        String s1 = com.roidapp.baselib.d.a.c();
        String s2 = String.valueOf(System.currentTimeMillis());
        intent = al.g().a(a1.getActivity(), s1, s2);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        a1.m = Uri.fromFile(new File(s1, s2));
        a1.startActivityForResult(intent, 134);
        return;
        a1;
        a1.printStackTrace();
        return;
    }

    static void a(a a1, int i1, boolean flag)
    {
        a1.a(i1, flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            e.setTextColor(getResources().getColor(ao.b));
            return;
        } else
        {
            e.setTextColor(getResources().getColor(ao.c));
            return;
        }
    }

    private void b()
    {
        if (o == null)
        {
            com.bumptech.glide.h.a(this).a(a.h).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(j));
            return;
        } else
        {
            com.bumptech.glide.h.a(this).a(a.h).i().a(com.bumptech.glide.h.a(this).a(o).i()).a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(j));
            return;
        }
    }

    static void b(a a1)
    {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        try
        {
            a1.startActivityForResult(intent, 2966);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
        }
    }

    private void b(String s1)
    {
        if (s1 == null)
        {
            return;
        }
        try
        {
            startActivityForResult(al.g().e(getActivity(), s1), 5454);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    static String[] c(a a1)
    {
        return a1.q;
    }

    static EditText d(a a1)
    {
        return a1.p;
    }

    static EditText e(a a1)
    {
        return a1.d;
    }

    static View f(a a1)
    {
        return a1.h;
    }

    static View g(a a1)
    {
        return a1.i;
    }

    static String h(a a1)
    {
        return a1.o;
    }

    static void i(a a1)
    {
        a1.b();
    }

    public final void a()
    {
        s = false;
    }

    public final void a(android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        k = ondismisslistener;
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag1 = true;
        if (editable != null && d != null)
        {
            editable = editable.toString();
            Object obj = a(editable);
            boolean flag;
            if (!TextUtils.equals(editable, ((CharSequence) (obj))))
            {
                a(at.bj, false);
                editable = ((Editable) (obj));
                flag = true;
            } else
            {
                flag = false;
            }
            obj = editable;
            if (editable.length() > 30)
            {
                a(at.bm, false);
                obj = editable.substring(0, 30);
                flag = true;
            }
            if (flag)
            {
                d.setText(((CharSequence) (obj)));
                d.setSelection(((String) (obj)).length());
            }
            if (((String) (obj)).length() == 0)
            {
                flag1 = false;
            }
            a(flag1);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        n = bundle;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 5454: 
            continue; /* Loop/switch isn't completed */

        case 134: 
            if (m == null && n.getString("PATH") != null)
            {
                m = Uri.parse(n.getString("PATH"));
            }
            if (m != null)
            {
                b(Uri.decode(m.getEncodedPath()));
                return;
            }
            break;

        case 2966: 
            if (intent != null && intent.getData() != null)
            {
                intent = al.g().a(getActivity(), intent.getData(), false);
                if (intent != null && intent.length == 2)
                {
                    switch (Integer.valueOf(intent[0]).intValue())
                    {
                    case 0: // '\0'
                    default:
                        return;

                    case -3: 
                        a(at.bs, false);
                        return;

                    case -1: 
                        a(at.bt, false);
                        return;

                    case -2: 
                        a(at.a, false);
                        return;

                    case 1: // '\001'
                        b(intent[1]);
                        break;
                    }
                    return;
                }
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (intent == null) goto _L4; else goto _L3
_L3:
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("crop_path");
            o = intent;
            intent = new File(intent);
            if (intent.exists())
            {
                if (i != null)
                {
                    i.setVisibility(0);
                }
                com.roidapp.cloudlib.sns.q.b(com.roidapp.cloudlib.sns.b.q.a(aj.a()).c().a, a.a, intent.getAbsolutePath(), new f(this)).a(this);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        String s1 = null;
        if (getActivity() != null && isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i1 = view.getId();
        if (i1 == ar.b)
        {
            af.a(d);
            dismiss();
            return;
        }
        if (i1 != ar.bH)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i != null && a != null && af.a(view.getContext()) && d != null)
        {
            af.a(d);
            String s3 = d.getText().toString();
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(s3))
            {
                d.requestFocus();
                view = (InputMethodManager)getActivity().getSystemService("input_method");
                if (view != null)
                {
                    view.showSoftInput(d, 1);
                }
                a(at.bk, false);
                return;
            }
            if (!s3.equals(b))
            {
                bundle.putString("nickname", s3);
            }
            String s5 = p.getText().toString().trim();
            for (i1 = 0; i1 < q.length; i1++)
            {
                if (q[i1].equalsIgnoreCase(s5))
                {
                    s1 = String.valueOf(i1);
                }
            }

            if (s1 != null && !s1.equalsIgnoreCase(c))
            {
                bundle.putString("gender", s1);
            }
            if (bundle.size() > 0)
            {
                i.setVisibility(0);
                com.roidapp.cloudlib.sns.q.a(com.roidapp.cloudlib.sns.b.q.a(view.getContext()).c().a, a.a, bundle, new g(this, s3, s1)).a(this);
                return;
            } else
            {
                dismiss();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i1 == ar.L)
        {
            af.a(d);
            com.roidapp.baselib.e.l.a(getActivity(), null);
            return;
        }
        if (i1 == ar.bl)
        {
            view = (new android.app.AlertDialog.Builder(getActivity())).setTitle(at.z);
            String s2 = getString(at.x);
            String s4 = getString(at.y);
            com.roidapp.cloudlib.sns.h.b b1 = new com.roidapp.cloudlib.sns.h.b(this);
            view.setItems(new String[] {
                s2, s4
            }, b1).show();
            return;
        }
        if (i1 == ar._flddo)
        {
            if (d.isFocusable())
            {
                d.setFocusableInTouchMode(false);
                d.clearFocus();
                af.a(d);
            }
            if (r == null)
            {
                r = new r(getActivity(), q);
                r.a(new c(this));
                r.a(new com.roidapp.cloudlib.sns.h.d(this));
            }
            r.a(view, 0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!af.a(getActivity()))
        {
            an.a(getActivity(), "need login.");
            dismiss();
            return;
        } else
        {
            a = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c().b;
            b = a.b;
            c = a.d;
            q = getResources().getStringArray(com.roidapp.cloudlib.an.a);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.T, viewgroup, false);
        d = (EditText)layoutinflater.findViewById(ar.dq);
        p = (EditText)layoutinflater.findViewById(ar._flddo);
        p.setFocusable(false);
        boolean flag;
        if (a.d != null)
        {
            if (a.d.equals("1"))
            {
                p.setText(q[1]);
            } else
            if (a.d.equals("0"))
            {
                p.setText(q[0]);
            }
        }
        p.setOnClickListener(this);
        if (TextUtils.equals(a(b), b))
        {
            d.setText(b);
            if (b != null)
            {
                d.setSelection(b.length());
            }
        } else
        {
            d.setText("");
        }
        d.addTextChangedListener(this);
        h = layoutinflater.findViewById(ar.L);
        f = (TextView)h.findViewById(ar.cN);
        e = (TextView)layoutinflater.findViewById(ar.bH);
        if (d.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        g = h.findViewById(ar.bT);
        h.setVisibility(8);
        h.setOnClickListener(this);
        i = layoutinflater.findViewById(ar.ck);
        i.findViewById(ar.l).setVisibility(0);
        j = (ImageView)layoutinflater.findViewById(ar.bl);
        j.setOnClickListener(this);
        b();
        if (s)
        {
            layoutinflater.findViewById(ar.b).setOnClickListener(this);
        } else
        {
            layoutinflater.findViewById(ar.b).setVisibility(8);
            layoutinflater.findViewById(ar.bt).setVisibility(8);
        }
        layoutinflater.findViewById(ar.bH).setOnClickListener(this);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        k = null;
        com.roidapp.cloudlib.sns.u.a().a(this);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d = null;
        i = null;
        f = null;
        h = null;
        g = null;
        e = null;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (k != null)
        {
            k.onDismiss(dialoginterface);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (m != null)
        {
            bundle.putString("PATH", m.toString());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }
}
