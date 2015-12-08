// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;
import java.util.List;

public class nzw
    implements Comparable
{

    private List A;
    private boolean B;
    private CharSequence a;
    private int b;
    private Drawable c;
    private boolean d;
    private boolean e;
    private String f;
    public Context g;
    public oam h;
    long i;
    public oaa j;
    public oab k;
    int l;
    public CharSequence m;
    String n;
    public Intent o;
    String p;
    boolean q;
    boolean r;
    int s;
    int t;
    boolean u;
    nzz v;
    private Object w;
    private boolean x;
    private boolean y;
    private boolean z;

    public nzw(Context context)
    {
        this(context, null);
    }

    public nzw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.HO);
    }

    public nzw(Context context, AttributeSet attributeset, int i1)
    {
        l = 0x7fffffff;
        d = true;
        q = true;
        r = true;
        x = true;
        y = true;
        z = true;
        s = p.bL;
        u = true;
        g = context;
        context = context.obtainStyledAttributes(attributeset, oaw.r, i1, 0);
        i1 = context.getIndexCount();
        while (i1 >= 0) 
        {
            int j1 = context.getIndex(i1);
            if (j1 == oaw.w)
            {
                b = context.getResourceId(j1, 0);
            } else
            if (j1 == oaw.x)
            {
                n = context.getString(j1);
            } else
            if (j1 == oaw.E)
            {
                context.getResourceId(j1, 0);
                m = context.getString(j1);
            } else
            if (j1 == oaw.D)
            {
                a = context.getString(j1);
            } else
            if (j1 == oaw.z)
            {
                l = context.getInt(j1, l);
            } else
            if (j1 == oaw.v)
            {
                p = context.getString(j1);
            } else
            if (j1 == oaw.y)
            {
                s = context.getResourceId(j1, s);
            } else
            if (j1 == oaw.F)
            {
                t = context.getResourceId(j1, t);
            } else
            if (j1 == oaw.u)
            {
                d = context.getBoolean(j1, true);
            } else
            if (j1 == oaw.B)
            {
                q = context.getBoolean(j1, true);
            } else
            if (j1 == oaw.A)
            {
                r = context.getBoolean(j1, r);
            } else
            if (j1 == oaw.t)
            {
                f = context.getString(j1);
            } else
            if (j1 == oaw.s)
            {
                w = a(context, j1);
            } else
            if (j1 == oaw.C)
            {
                z = context.getBoolean(j1, z);
            }
            i1--;
        }
        context.recycle();
        if (!getClass().getName().startsWith("com.google"))
        {
            u = false;
        }
    }

    private void a(android.content.SharedPreferences.Editor editor)
    {
        oam oam1 = h;
        try
        {
            editor.apply();
            return;
        }
        catch (AbstractMethodError abstractmethoderror)
        {
            editor.commit();
        }
    }

    private void a(View view, boolean flag)
    {
        view.setEnabled(flag);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i1 = view.getChildCount() - 1; i1 >= 0; i1--)
            {
                a(view.getChildAt(i1), flag);
            }

        }
    }

    private void a(boolean flag)
    {
        if (x == flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            x = flag;
            d(e());
            g();
        }
    }

    private nzw b(String s1)
    {
        oam oam1;
        if (!TextUtils.isEmpty(s1) && h != null)
        {
            if ((oam1 = h).c != null)
            {
                return oam1.c.c(s1);
            }
        }
        return null;
    }

    private boolean c()
    {
        return !TextUtils.isEmpty(n);
    }

    private boolean k()
    {
        return h != null && r && c();
    }

    public final View a(View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a(viewgroup);
        }
        a(view1);
        return view1;
    }

    public View a(ViewGroup viewgroup)
    {
        ViewGroup viewgroup1;
label0:
        {
            LayoutInflater layoutinflater = (LayoutInflater)g.getSystemService("layout_inflater");
            viewgroup = layoutinflater.inflate(s, viewgroup, false);
            viewgroup1 = (ViewGroup)viewgroup.findViewById(cn.V);
            if (viewgroup1 != null)
            {
                if (t == 0)
                {
                    break label0;
                }
                layoutinflater.inflate(t, viewgroup1);
            }
            return viewgroup;
        }
        viewgroup1.setVisibility(8);
        return viewgroup;
    }

    protected Object a(TypedArray typedarray, int i1)
    {
        return null;
    }

    public String a(String s1)
    {
        if (!k())
        {
            return s1;
        } else
        {
            return h.b().getString(n, s1);
        }
    }

    public void a()
    {
    }

    public final void a(int i1)
    {
        if (i1 != s)
        {
            u = false;
        }
        s = i1;
    }

    void a(Bundle bundle)
    {
        if (c())
        {
            B = false;
            Parcelable parcelable = d();
            if (!B)
            {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelable != null)
            {
                bundle.putParcelable(n, parcelable);
            }
        }
    }

    public void a(Parcelable parcelable)
    {
        B = true;
        if (parcelable != nzx.EMPTY_STATE && parcelable != null)
        {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        } else
        {
            return;
        }
    }

    public void a(View view)
    {
        int i1 = 0;
        Object obj = (TextView)view.findViewById(cn.U);
        if (obj != null)
        {
            CharSequence charsequence = m;
            if (!TextUtils.isEmpty(charsequence))
            {
                ((TextView) (obj)).setText(charsequence);
                ((TextView) (obj)).setVisibility(0);
                if (q && !b())
                {
                    ((TextView) (obj)).setTextColor(g.getResources().getColor(b.HR));
                }
            } else
            {
                ((TextView) (obj)).setVisibility(8);
            }
        }
        obj = (TextView)view.findViewById(cn.S);
        if (obj != null)
        {
            charsequence = f();
            if (!TextUtils.isEmpty(charsequence))
            {
                ((TextView) (obj)).setText(charsequence);
                ((TextView) (obj)).setVisibility(0);
                if (q && !b())
                {
                    ((TextView) (obj)).setTextColor(g.getResources().getColor(b.HR));
                }
            } else
            {
                ((TextView) (obj)).setVisibility(8);
            }
        }
        obj = (ImageView)view.findViewById(cn.N);
        if (obj != null)
        {
            if (b != 0 || c != null)
            {
                if (c == null)
                {
                    c = g.getResources().getDrawable(b);
                }
                if (c != null)
                {
                    ((ImageView) (obj)).setImageDrawable(c);
                }
            }
            if (c == null)
            {
                i1 = 8;
            }
            ((ImageView) (obj)).setVisibility(i1);
        }
        if (z)
        {
            a(view, b());
        }
    }

    public final void a(PreferenceScreen preferencescreen)
    {
        if (b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a();
        if (k != null && k.s()) goto _L1; else goto _L3
_L3:
        Object obj;
        obj = h;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((oam) (obj)).g;
        if (preferencescreen != null && obj != null && ((oap) (obj)).a(this)) goto _L1; else goto _L4
_L4:
        if (o == null) goto _L1; else goto _L5
_L5:
        g.startActivity(o);
        return;
    }

    public void a(Object obj)
    {
        w = obj;
    }

    protected void a(oam oam1)
    {
label0:
        {
            h = oam1;
            i = oam1.a();
            if (k())
            {
                if (h == null)
                {
                    oam1 = null;
                } else
                {
                    oam1 = h.b();
                }
                if (oam1.contains(n))
                {
                    break label0;
                }
            }
            if (w != null)
            {
                a(false, w);
            }
            return;
        }
        a(true, null);
    }

    protected void a(boolean flag, Object obj)
    {
    }

    public void a_(CharSequence charsequence)
    {
        if (charsequence == null && a != null || charsequence != null && !charsequence.equals(a))
        {
            a = charsequence;
            g();
        }
    }

    public final void b(int i1)
    {
        if (i1 != l)
        {
            l = i1;
            h();
        }
    }

    void b(Bundle bundle)
    {
        if (c())
        {
            bundle = bundle.getParcelable(n);
            if (bundle != null)
            {
                B = false;
                a(bundle);
                if (!B)
                {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    public final void b(CharSequence charsequence)
    {
        if (charsequence == null && m != null || charsequence != null && !charsequence.equals(m))
        {
            m = charsequence;
            g();
        }
    }

    public final void b(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            d(e());
            g();
        }
    }

    public boolean b()
    {
        return d && x && y;
    }

    protected final boolean b(Object obj)
    {
        return j == null || j.a(this, obj);
    }

    public final void c(int i1)
    {
        a_(g.getString(i1));
    }

    public final void c(boolean flag)
    {
        if (q)
        {
            q = false;
            g();
        }
    }

    public int compareTo(Object obj)
    {
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        obj = (nzw)obj;
        if (l == ((nzw) (obj)).l) goto _L2; else goto _L1
_L1:
        i1 = l - ((nzw) (obj)).l;
_L4:
        return i1;
_L2:
        int i2;
        int j2;
        if (m != ((nzw) (obj)).m)
        {
            if (m == null)
            {
                return 1;
            }
            if (((nzw) (obj)).m == null)
            {
                return -1;
            }
            i2 = m.length();
            j2 = ((nzw) (obj)).m.length();
            int k2 = Math.min(i2, j2);
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= k2)
                    {
                        break label1;
                    }
                    int l1 = Character.toLowerCase(m.charAt(j1)) - Character.toLowerCase(((nzw) (obj)).m.charAt(k1));
                    i1 = l1;
                    if (l1 != 0)
                    {
                        break label0;
                    }
                    k1++;
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return i2 - j2;
    }

    public Parcelable d()
    {
        B = true;
        return nzx.EMPTY_STATE;
    }

    public final void d(String s1)
    {
        n = s1;
        if (e && !c())
        {
            if (n == null)
            {
                throw new IllegalStateException("Preference does not have a key assigned.");
            }
            e = true;
        }
    }

    public void d(boolean flag)
    {
        List list = A;
        if (list != null)
        {
            int j1 = list.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((nzw)list.get(i1)).a(flag);
                i1++;
            }
        }
    }

    public final void e(boolean flag)
    {
        if (y == flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y = flag;
            d(e());
            g();
        }
    }

    public boolean e()
    {
        return !b();
    }

    protected final boolean e(String s1)
    {
        if (k())
        {
            if (s1 == a(((String) (null))))
            {
                return true;
            } else
            {
                android.content.SharedPreferences.Editor editor = h.c();
                editor.putString(n, s1);
                a(editor);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public CharSequence f()
    {
        return a;
    }

    protected final boolean f(boolean flag)
    {
        boolean flag1 = false;
        if (k())
        {
            if (!flag)
            {
                flag1 = true;
            }
            if (flag == g(flag1))
            {
                return true;
            } else
            {
                android.content.SharedPreferences.Editor editor = h.c();
                editor.putBoolean(n, flag);
                a(editor);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public final void g()
    {
        if (v != null)
        {
            v.a();
        }
    }

    protected final boolean g(boolean flag)
    {
        if (!k())
        {
            return flag;
        } else
        {
            return h.b().getBoolean(n, flag);
        }
    }

    protected final void h()
    {
        if (v != null)
        {
            v.b();
        }
    }

    protected void i()
    {
label0:
        {
            if (!TextUtils.isEmpty(f))
            {
                nzw nzw1 = b(f);
                if (nzw1 == null)
                {
                    break label0;
                }
                if (nzw1.A == null)
                {
                    nzw1.A = new ArrayList();
                }
                nzw1.A.add(this);
                a(nzw1.e());
            }
            return;
        }
        String s1 = f;
        String s2 = n;
        String s3 = String.valueOf(m);
        throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 52 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Dependency \"").append(s1).append("\" not found for preference \"").append(s2).append("\" (title: \"").append(s3).append("\"").toString());
    }

    protected void j()
    {
        if (f != null)
        {
            nzw nzw1 = b(f);
            if (nzw1 != null && nzw1.A != null)
            {
                nzw1.A.remove(this);
            }
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharSequence charsequence = m;
        if (!TextUtils.isEmpty(charsequence))
        {
            stringbuilder.append(charsequence).append(' ');
        }
        charsequence = f();
        if (!TextUtils.isEmpty(charsequence))
        {
            stringbuilder.append(charsequence).append(' ');
        }
        if (stringbuilder.length() > 0)
        {
            stringbuilder.setLength(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }
}
