// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.f.a;
import android.text.Editable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.util.au;
import com.jcp.util.bq;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            s, SavedCardFragment, n, et, 
//            PrimaryAddressFragment, t, o

public class AddCreditCardFragment extends s
    implements android.view.View.OnClickListener, ae
{

    private String a;
    private int aA;
    private final Map aB = new a();
    private int aC;
    protected RelativeLayout addCardLayout;
    protected TextView addProfileAddress;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private boolean ar;
    private boolean as;
    private InputMethodManager at;
    private l au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private com.jcp.e.b az;
    private String b;
    private String c;
    protected ImageView cardImage;
    private String d;
    private String e;
    private String f;
    protected LinearLayout fillJcpCardLayout;
    private String g;
    private int h;
    private int i;
    protected EditText mJcpCardEdit;
    protected EditText mJcpCardZipEdit;
    protected TextView noButtonJcp;
    protected EditText otherCardCvvEdit;
    protected EditText otherCardEdit;
    protected LinearLayout otherCardLayout;
    protected EditText otherCardMonthYearEdit;
    protected EditText otherCardZipEdit;
    protected ToggleButton signInToggleBtn;

    public AddCreditCardFragment()
    {
        f = "";
        av = "";
        aw = "";
        ax = "";
        ay = "";
        aA = -1;
    }

    private void U()
    {
        Object obj = JCP.e().e();
        if (obj != null && !((List) (obj)).isEmpty())
        {
            com.jcp.b.b.a(true);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (GetAddressResponseModel)((Iterator) (obj)).next();
                if (((GetAddressResponseModel) (obj1)).isDefault())
                {
                    g = ((GetAddressResponseModel) (obj1)).getId();
                    String s1 = ((GetAddressResponseModel) (obj1)).getAddressLineOne();
                    String s2 = ((GetAddressResponseModel) (obj1)).getState();
                    obj1 = ((GetAddressResponseModel) (obj1)).getZip();
                    s1 = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(((String) (obj1))).toString();
                    addProfileAddress.setText(s1);
                }
            } while (true);
        } else
        {
            com.jcp.b.b.a(false);
            addProfileAddress.setText(a(0x7f070062));
            g = "0";
        }
    }

    private void V()
    {
        b.n = false;
        if (com.jcp.b.b.b())
        {
            addProfileAddress.setText(az.q());
        }
        g = az.r();
        aB.clear();
        aB.putAll(az.p());
        if (aB.size() == 0) goto _L2; else goto _L1
_L1:
        String s1 = (String)aB.get("JCPCard");
        if (TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        addCardLayout.setVisibility(8);
        fillJcpCardLayout.setVisibility(0);
        mJcpCardEdit.setText(s1);
        s1 = (String)aB.get("JCPZip");
        if (TextUtils.isEmpty(s1)) goto _L6; else goto _L5
_L5:
        mJcpCardZipEdit.setText(s1);
_L2:
        return;
_L6:
        mJcpCardZipEdit.setVisibility(8);
        return;
_L4:
        String s2 = (String)aB.get("OtherCard");
        if (!TextUtils.isEmpty(s2))
        {
            otherCardLayout.setVisibility(0);
            addCardLayout.setVisibility(8);
            otherCardEdit.setText(s2);
            s2 = (String)aB.get("OtherDate");
            if (!TextUtils.isEmpty(s2))
            {
                otherCardMonthYearEdit.setText(s2);
                s2 = (String)aB.get("OtherCvv");
                if (!TextUtils.isEmpty(s2))
                {
                    otherCardCvvEdit.setText(s2);
                    s2 = (String)aB.get("OtherZip");
                    if (!TextUtils.isEmpty(s2))
                    {
                        otherCardZipEdit.setText(s2);
                        return;
                    } else
                    {
                        otherCardZipEdit.setVisibility(8);
                        return;
                    }
                } else
                {
                    otherCardCvvEdit.setVisibility(8);
                    otherCardZipEdit.setVisibility(8);
                    return;
                }
            } else
            {
                otherCardMonthYearEdit.setVisibility(8);
                otherCardCvvEdit.setVisibility(8);
                otherCardZipEdit.setVisibility(8);
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    private void W()
    {
        ActionBar actionbar = i().getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayShowTitleEnabled(true);
            View view = LayoutInflater.from(i()).inflate(0x7f030040, null);
            ((TextView)view.findViewById(0x7f0e01de)).setText(a(0x7f070063));
            TextView textview = (TextView)view.findViewById(0x7f0e01df);
            textview.setOnClickListener(this);
            textview.setText(a(0x7f07039e));
            actionbar.setCustomView(view);
            actionbar.setDisplayShowHomeEnabled(true);
            actionbar.setDisplayShowCustomEnabled(true);
        }
    }

    private void X()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (TextUtils.isEmpty(b) || b.trim().length() != b(f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = TextUtils.isEmpty(c);
        if (TextUtils.isEmpty(d) || d.trim().length() != c(f))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = TextUtils.isEmpty(e);
        if (flag || flag2 || flag1 || flag3)
        {
            StringBuilder stringbuilder = new StringBuilder("");
            if (flag)
            {
                a(stringbuilder, a(0x7f0701b4));
            }
            if (flag2)
            {
                a(stringbuilder, a(0x7f0701b6));
            }
            if (flag1)
            {
                a(stringbuilder, a(0x7f0701b5));
            }
            if (flag3)
            {
                a(stringbuilder, a(0x7f0701b9));
            }
            com.jcp.util.au.a(i(), a(0x7f0701bb), stringbuilder.toString());
            return;
        }
        if ("0".equalsIgnoreCase(g))
        {
            com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0700a6));
            return;
        } else
        {
            a a1 = new a();
            a1.put("type", f);
            a1.put("cardNumber", b);
            a1.put("expiryMonth", c.substring(0, 2));
            a1.put("expiryYear", (new StringBuilder()).append("20").append(c.substring(3, c.length())).toString());
            a1.put("isDefault", (new StringBuilder()).append(signInToggleBtn.isChecked()).append("").toString());
            a1.put("addressId", g);
            a1.put("cvv", d);
            String s1 = com.jcp.b.b.F();
            au = new l(i());
            au.a(this);
            au.d(s1, a1, 1);
            return;
        }
    }

    private void Z()
    {
        if (TextUtils.isEmpty(a))
        {
            com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
            return;
        }
        if ("0".equalsIgnoreCase(g))
        {
            com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0700a6));
            return;
        } else
        {
            a a1 = new a();
            a1.put("cardNumber", a);
            a1.put("type", f);
            a1.put("isDefault", (new StringBuilder()).append(signInToggleBtn.isChecked()).append("").toString());
            a1.put("addressId", g);
            String s1 = com.jcp.b.b.F();
            au = new l(i());
            au.a(this);
            au.d(s1, a1, 1);
            return;
        }
    }

    private void a(int j, String s1)
    {
        boolean flag = false;
        String s2 = null;
        if (j == 0x85778)
        {
            s2 = "DualCard";
            j = 0x7f02015c;
        } else
        if (b(j))
        {
            s2 = "DISCOVER";
            j = 0x7f0200f3;
        } else
        if (c(j))
        {
            s2 = "MASTERCARD";
            j = 0x7f02016a;
        } else
        if (d(j))
        {
            s2 = "Visa";
            j = 0x7f02024c;
        } else
        if (e(j))
        {
            s2 = "AMEX";
            j = 0x7f020049;
            flag = true;
        } else
        {
            if ("JCP".equalsIgnoreCase(s1))
            {
                if (f(j))
                {
                    cardImage.setTag(j().getString(0x7f0700cc));
                    as = true;
                    return;
                } else
                {
                    ac();
                    return;
                }
            }
            j = 0;
        }
        a(s1, s2, j, 0x7f0700cc, flag);
    }

    private void a(Editable editable)
    {
        int j = 0;
        if (editable.charAt(0) == '/')
        {
            editable.delete(0, 1);
        }
        int i1;
        for (int k = 0; j < editable.length(); k = i1)
        {
            i1 = k;
            if (editable.charAt(j) == '/')
            {
                i1 = k + 1;
            }
            if (i1 > 1)
            {
                editable.delete(j, j + 1);
            }
            j++;
        }

    }

    private void a(View view)
    {
        ButterKnife.inject(this, view);
        signInToggleBtn.setText(null);
        signInToggleBtn.setTextOn(null);
        signInToggleBtn.setTextOff(null);
        if ((double)(float)i().getResources().getDisplayMetrics().widthPixels < 750D)
        {
            view = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            view.setMargins(5, 0, 2, 0);
            view.addRule(1, 0x7f0e0080);
            view.addRule(4, 0x7f0e0081);
            view.addRule(8, 0x7f0e0081);
            noButtonJcp.setLayoutParams(view);
        }
    }

    private void a(String s1, String s2, int j, int k, boolean flag)
    {
        if ("JCP".equalsIgnoreCase(s1))
        {
            ad();
            return;
        } else
        {
            f = s2;
            cardImage.setBackgroundResource(j);
            cardImage.setTag(a(k));
            b.m = flag;
            return;
        }
    }

    private void a(StringBuilder stringbuilder, String s1)
    {
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append("\n");
        }
        stringbuilder.append(s1);
    }

    private boolean a(int j, int k, int i1)
    {
        return j >= k && j <= i1;
    }

    private void aa()
    {
        if (d.matches("[0-9]*"))
        {
            android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
            otherCardZipEdit.setVisibility(0);
            otherCardZipEdit.setAnimation(animation);
            otherCardZipEdit.requestFocus();
            otherCardZipEdit.setCursorVisible(true);
            otherCardCvvEdit.clearFocus();
            otherCardCvvEdit.setMaxWidth(1);
            an = 1;
            return;
        } else
        {
            com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b5));
            return;
        }
    }

    private int ab()
    {
        boolean flag = false;
        int ai[] = new int[b.length()];
        for (int j = 0; j < b.length(); j++)
        {
            ai[j] = Integer.parseInt(b.substring(j, j + 1));
        }

        for (int k = ai.length - 2; k >= 0; k -= 2)
        {
            int l1 = ai[k] * 2;
            int j1 = l1;
            if (l1 > 9)
            {
                j1 = l1 % 10 + 1;
            }
            ai[k] = j1;
        }

        int k1 = 0;
        for (int i1 = ((flag) ? 1 : 0); i1 < ai.length; i1++)
        {
            k1 += ai[i1];
        }

        return k1;
    }

    private void ac()
    {
        com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
    }

    private void ad()
    {
        com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b7));
    }

    private int b(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return 16;
_L2:
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 76
    //                   -1553624974: 152
    //                   73271: 197
    //                   2012639: 122
    //                   2666593: 167
    //                   1055811561: 137
    //                   1889594828: 182;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        switch (byte0)
        {
        default:
            return 16;

        case 0: // '\0'
            return 15;

        case 5: // '\005'
            return 11;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            break;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (s1.equals("AMEX"))
        {
            byte0 = 0;
        }
          goto _L3
_L8:
        if (s1.equals("DISCOVER"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s1.equals("MASTERCARD"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        if (s1.equals("Visa"))
        {
            byte0 = 3;
        }
          goto _L3
_L9:
        if (s1.equals("DualCard"))
        {
            byte0 = 4;
        }
          goto _L3
_L5:
        if (s1.equals("JCP"))
        {
            byte0 = 5;
        }
          goto _L3
    }

    private void b(Editable editable)
    {
        if (editable.length() > 1 && Character.isDigit(editable.charAt(0)) && editable.charAt(1) == '/')
        {
            editable.insert(0, "0");
        }
    }

    private boolean b(int j)
    {
        return a(j, 0x9c400, 0x9fc6c) || a(j, 0x995e8, 0x998a3) || a(j, 0x98580, 0x99137) || a(j, 0x97e2e, 0x9814d) || a(j, 0x92c0c, 0x92c6f) || a(j, 0x5cc60, 0x61a7f) || a(j, 0x56220, 0x57a57) || a(j, 0x4b8fc, 0x4b95f) || a(j, 0x493e0, 0x4ab4f);
    }

    private int c(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 6: default 72
    //                   -1553624974: 146
    //                   73271: 191
    //                   2012639: 116
    //                   2666593: 161
    //                   1055811561: 131
    //                   1889594828: 176;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        switch (byte0)
        {
        default:
            return 0;

        case 0: // '\0'
            return 4;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return 3;

        case 5: // '\005'
            break;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (s1.equals("AMEX"))
        {
            byte0 = 0;
        }
          goto _L3
_L8:
        if (s1.equals("DISCOVER"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s1.equals("MASTERCARD"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        if (s1.equals("Visa"))
        {
            byte0 = 3;
        }
          goto _L3
_L9:
        if (s1.equals("DualCard"))
        {
            byte0 = 4;
        }
          goto _L3
_L5:
        if (s1.equals("JCP"))
        {
            byte0 = 5;
        }
          goto _L3
    }

    private void c(Editable editable)
    {
        if (editable.length() > 2 && Character.isDigit(editable.charAt(0)) && Character.isDigit(editable.charAt(1)) && (editable.length() == 2 || editable.length() > 2 && editable.charAt(2) != '/'))
        {
            editable.insert(2, "/");
        }
    }

    private boolean c(int j)
    {
        return a(j, 0x85779, 0x88b7f) || a(j, 0x7c830, 0x85777);
    }

    private boolean d(int j)
    {
        return a(j, 0x61a80, 0x7a11f);
    }

    private boolean e(int j)
    {
        return a(j, 0x5a550, 0x5cc5f) || a(j, 0x53020, 0x5572f);
    }

    private boolean f(int j)
    {
        return a(j, 20, 0x1661fb0);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030018, viewgroup, false);
        a(((View) (layoutinflater)));
        aC = 3;
        if (az.q() != null && b.n)
        {
            V();
        } else
        {
            U();
        }
        at = (InputMethodManager)i().getSystemService("input_method");
        d(true);
        return layoutinflater;
    }

    protected String a()
    {
        return "ADDCREDITCARD";
    }

    public void a(int j, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (com.jcp.http.b.a(j))
        {
            t t1 = a(i());
            if (t1 != null)
            {
                Object obj;
                if (com.jcp.b.a.b())
                {
                    com.jcp.b.a.b(false);
                    obj = new SavedCardFragment();
                    errormessageentitycontainer = "SavedCardFragment";
                } else
                {
                    obj = new et();
                    errormessageentitycontainer = "ProfileFragment";
                }
                com.jcp.util.au.a(i(), a(0x7f0702f5), a(0x7f070049), null, new n(this, t1, errormessageentitycontainer, ((Fragment) (obj))), null);
            }
            return;
        }
        if ("KEY_OCS_CREDIT_CARD_AUTH_FAILED".equalsIgnoreCase(com.jcp.util.au.a(i(), errormessageentitycontainer)))
        {
            otherCardCvvEdit.setTextColor(j().getColor(0x7f0d006c));
        }
        com.jcp.util.au.a(i(), j().getString(0x7f0701bb), errormessageentitycontainer);
    }

    public void a(Activity activity)
    {
        super.a(activity);
        az = (com.jcp.e.b)activity;
    }

    protected void addProfileAddress()
    {
        t t1;
        O();
        ar = true;
        aB.put("JCPCard", a);
        aB.put("JCPZip", mJcpCardZipEdit.getText().toString());
        aB.put("OtherCard", b);
        aB.put("OtherDate", otherCardMonthYearEdit.getText().toString());
        aB.put("OtherCvv", otherCardCvvEdit.getText().toString());
        aB.put("OtherZip", otherCardZipEdit.getText().toString());
        az.a(aB);
        az.b(addProfileAddress.getText().toString());
        t1 = a(i());
        if (!com.jcp.b.b.b()) goto _L2; else goto _L1
_L1:
        if (aA != 1) goto _L4; else goto _L3
_L3:
        av = a;
        ax = mJcpCardZipEdit.getText().toString();
        com.jcp.b.b.e(true);
_L8:
        PrimaryAddressFragment primaryaddressfragment = new PrimaryAddressFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromCard", true);
        primaryaddressfragment.g(bundle);
        if (t1 != null)
        {
            t1.c(primaryaddressfragment, "PrimaryAddressFragment");
        }
_L6:
        return;
_L4:
        if (aA == 0)
        {
            av = b;
            aw = otherCardMonthYearEdit.getText().toString();
            ay = otherCardCvvEdit.getText().toString();
            ax = otherCardZipEdit.getText().toString();
            com.jcp.b.b.e(false);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        o o1;
        o1 = new o();
        Bundle bundle1 = new Bundle();
        bundle1.putString("Title", "addAddress");
        bundle1.putBoolean("isFromCard", true);
        bundle1.putBoolean("isAddressNull", true);
        o1.g(bundle1);
        if (t1 == null) goto _L6; else goto _L5
_L5:
        t1.c(o1, "AddAddressFragment");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void afterJcpCardTextChanged()
    {
        String s1 = mJcpCardEdit.getEditableText().toString().trim();
        f = "JCP";
        if (s1.length() <= 10)
        {
            aq = 0;
        }
        if (s1.length() >= 6)
        {
            if (s1.matches("[0-9]*"))
            {
                int j = Integer.parseInt(s1.substring(0, 6));
                as = false;
                a(j, f);
            } else
            {
                com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
            }
        }
        if (s1.length() >= 11 && aq == 0 && as)
        {
            a = s1;
            s1 = (new StringBuilder()).append("#").append(s1.substring(7, s1.length())).toString();
            android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
            mJcpCardZipEdit.setVisibility(0);
            mJcpCardZipEdit.startAnimation(animation);
            mJcpCardEdit.clearFocus();
            mJcpCardEdit.setCursorVisible(false);
            mJcpCardZipEdit.requestFocus();
            mJcpCardZipEdit.setCursorVisible(true);
            mJcpCardEdit.setMaxWidth(3);
            mJcpCardEdit.setText(s1);
            ap = 1;
        }
    }

    protected void afterOtherCardCVVChanged(Editable editable)
    {
        if (b.m)
        {
            if (editable.toString().length() <= 3)
            {
                ao = 0;
            }
            d = editable.toString().trim();
            if (d.length() >= 4 && ao == 0)
            {
                aa();
            }
        } else
        {
            d = editable.toString().trim();
            if (d.length() >= 3)
            {
                aa();
                return;
            }
        }
    }

    protected void afterOtherCardMonthYearTextChanged(Editable editable)
    {
        editable.toString().trim().length();
        b(editable);
        c(editable);
        if (bq.a(editable.toString(), "/") > 1)
        {
            a(editable);
            b(editable);
            c(editable);
            a(editable);
        }
        if (editable.toString().trim().length() <= 4)
        {
            am = 0;
        }
        if (editable.toString().trim().length() == 2 && h == 0)
        {
            i = 1;
            h = 0;
            if (!otherCardMonthYearEdit.getEditableText().toString().trim().contains("/"))
            {
                otherCardMonthYearEdit.setText((new StringBuilder()).append(otherCardMonthYearEdit.getEditableText().toString().trim()).append("/").toString());
                otherCardMonthYearEdit.setSelection(3);
            }
        }
        c = editable.toString().trim();
        if (c.length() >= 5 && am == 0)
        {
            if (c.contains("/") && c.substring(2, 3).equals("/") && c.matches("[0-9/]*"))
            {
                if (bq.a(c, "/") == 1)
                {
                    int j = Integer.parseInt(c.substring(0, 2));
                    int k = Integer.parseInt((new StringBuilder()).append("20").append(c.substring(3, 5)).toString());
                    Calendar calendar = Calendar.getInstance();
                    int i1 = calendar.get(2);
                    int j1 = calendar.get(1);
                    if (k < j1)
                    {
                        com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f070460));
                    } else
                    if (j > 12)
                    {
                        com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f070460));
                    } else
                    if (j < i1 + 1 && k == j1)
                    {
                        com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f070460));
                    } else
                    {
                        android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
                        otherCardCvvEdit.setVisibility(0);
                        otherCardCvvEdit.setAnimation(animation);
                        otherCardCvvEdit.requestFocus();
                        otherCardCvvEdit.setCursorVisible(true);
                        otherCardMonthYearEdit.clearFocus();
                        otherCardMonthYearEdit.setMaxWidth(1);
                        al = 1;
                    }
                } else
                {
                    com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f070460));
                }
            } else
            {
                com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f070460));
            }
        }
        if (editable.toString().trim().length() == 0)
        {
            h = 0;
        }
    }

    protected void afterOtherCardTextChanged()
    {
        String s3 = otherCardEdit.getEditableText().toString().trim();
        if (s3.length() <= 15)
        {
            ak = 0;
        }
        if (s3.length() >= 6)
        {
            b = s3;
            if (s3.matches("[0-9]*"))
            {
                a(Integer.parseInt(b.substring(0, 6)), f);
            }
        }
        String s4 = j().getString(0x7f07015b);
        if (cardImage.getTag() == null)
        {
            com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
        } else
        {
            String s1;
            if (cardImage.getTag() instanceof String)
            {
                s1 = (String)cardImage.getTag();
            } else
            {
                s1 = null;
            }
            if (TextUtils.isEmpty(s1))
            {
                com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
                return;
            }
            if (s3.length() == 16 && s4.equals(s1))
            {
                if (b.trim().equals("7888888888888888") || b.trim().equals("7999999999999999"))
                {
                    f = "MASTERCARD";
                    cardImage.setBackgroundResource(0x7f02016a);
                    cardImage.setTag(j().getString(0x7f0700cc));
                    b.m = false;
                    return;
                } else
                {
                    com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
                    return;
                }
            }
            if (s3.length() == 16 && !s3.matches("[0-9]*"))
            {
                com.jcp.util.au.a(i(), a(0x7f0701bb), a(0x7f0701b4));
                return;
            }
            int j;
            if (b.m)
            {
                j = 4;
            } else
            {
                j = 3;
            }
            aC = j;
            if (s3.length() == 15 && "AMEX".equalsIgnoreCase(f) && ak == 0 || s3.length() >= 16 && ak == 0)
            {
                if (s3.matches("[0-9]*"))
                {
                    b = s3;
                    String s2;
                    if (b.m)
                    {
                        j = 11;
                    } else
                    {
                        j = 12;
                    }
                    s2 = (new StringBuilder()).append("#").append(s3.substring(j, s3.length())).toString();
                    if (ab() % 10 == 0)
                    {
                        android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
                        otherCardMonthYearEdit.setVisibility(0);
                        otherCardMonthYearEdit.setAnimation(animation);
                        otherCardEdit.clearFocus();
                        otherCardMonthYearEdit.requestFocus();
                        otherCardMonthYearEdit.setCursorVisible(true);
                        otherCardEdit.setMaxWidth(1);
                        otherCardEdit.setText(s2);
                        aj = 1;
                        return;
                    } else
                    {
                        ac();
                        return;
                    }
                } else
                {
                    ac();
                    return;
                }
            }
        }
    }

    protected void afterOtherCardZipChanged(Editable editable)
    {
        e = editable.toString().trim();
    }

    public void b()
    {
        a(a(0x7f070063));
        super.b();
        W();
    }

    public void b(int j, String s1)
    {
    }

    protected void beforeOtherCardMonthYearTextChanged()
    {
        if (otherCardMonthYearEdit.getEditableText().toString().endsWith("/") && i == 1)
        {
            h = 1;
            return;
        } else
        {
            h = 0;
            return;
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        if (bundle != null)
        {
            mJcpCardEdit.requestFocus();
            mJcpCardEdit.setText(bundle.getString("curChoice", null));
            addCardLayout.setVisibility(8);
            fillJcpCardLayout.setVisibility(0);
            bundle = AnimationUtils.loadAnimation(i(), 0x7f040012);
            fillJcpCardLayout.startAnimation(bundle);
        }
    }

    public void f_()
    {
        super.f_();
        if (ar && com.jcp.b.b.ae())
        {
            addCardLayout.setVisibility(8);
            fillJcpCardLayout.setVisibility(0);
            mJcpCardEdit.setText(av);
            mJcpCardZipEdit.setText(ax);
        } else
        if (ar && !com.jcp.b.b.ae())
        {
            otherCardLayout.setVisibility(0);
            addCardLayout.setVisibility(8);
            otherCardEdit.setText(av);
            otherCardMonthYearEdit.setText(aw);
            if (!TextUtils.isEmpty(ay))
            {
                otherCardCvvEdit.setVisibility(0);
                otherCardCvvEdit.setText(ay);
                ay = null;
            }
            otherCardZipEdit.setText(ax);
            aw = null;
            return;
        }
    }

    protected void noClicked()
    {
        otherCardEdit.requestFocus();
        if (at != null)
        {
            at.showSoftInput(otherCardEdit, 2);
        }
        aA = 0;
        addCardLayout.setVisibility(8);
        otherCardLayout.setVisibility(0);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
        otherCardLayout.startAnimation(animation);
        com.jcp.b.b.e(false);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624415: 
            at.hideSoftInputFromWindow(mJcpCardEdit.getWindowToken(), 0);
            break;
        }
        at.hideSoftInputFromWindow(otherCardEdit.getWindowToken(), 0);
        if (com.jcp.b.b.ae())
        {
            Z();
            return;
        } else
        {
            X();
            return;
        }
    }

    protected void onJcpCardFocusChange()
    {
        if (ap == 1)
        {
            ap = 0;
            aq = 1;
            mJcpCardZipEdit.clearFocus();
            mJcpCardZipEdit.setVisibility(8);
            mJcpCardEdit.requestFocus();
            if (a != null)
            {
                mJcpCardEdit.setText(a);
            }
        }
    }

    protected void onOtherCardTextChanged()
    {
        if (otherCardEdit.getEditableText().toString().trim().length() < 5)
        {
            cardImage.setBackgroundResource(0x7f0200f7);
            cardImage.setTag(j().getString(0x7f07015b));
        }
    }

    protected void otherCardCVVChanged()
    {
        Object obj = otherCardCvvEdit.getText();
        if (((Editable) (obj)).length() > aC)
        {
            obj = obj.toString().substring(0, aC);
            otherCardCvvEdit.setText(((CharSequence) (obj)));
            otherCardCvvEdit.setSelection(aC);
        }
    }

    protected void otherCardCVVFocusChanged()
    {
        if (an == 1)
        {
            ao = 1;
            an = 0;
            otherCardZipEdit.clearFocus();
            otherCardZipEdit.setVisibility(8);
        }
    }

    protected void otherCardFocusChanged()
    {
        if (aj == 1)
        {
            ak = 1;
            aj = 0;
            otherCardMonthYearEdit.clearFocus();
            otherCardMonthYearEdit.setVisibility(8);
            otherCardCvvEdit.setVisibility(8);
            otherCardZipEdit.setVisibility(8);
            if (b != null)
            {
                otherCardEdit.setText(b);
            }
        }
    }

    protected void otherCardMonthYearTextChanged(CharSequence charsequence)
    {
        if (charsequence.toString().trim().length() > 3)
        {
            i = 0;
        }
    }

    protected void otherCardMontyYearFocusChanged()
    {
        if (al == 1)
        {
            am = 1;
            al = 0;
            otherCardCvvEdit.clearFocus();
            otherCardCvvEdit.setVisibility(8);
            otherCardZipEdit.setVisibility(8);
        }
    }

    protected void yesClicked()
    {
        mJcpCardEdit.requestFocus();
        if (at != null)
        {
            at.showSoftInput(mJcpCardEdit, 2);
        }
        aA = 1;
        addCardLayout.setVisibility(8);
        fillJcpCardLayout.setVisibility(0);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(i(), 0x7f040012);
        fillJcpCardLayout.startAnimation(animation);
        com.jcp.b.b.e(true);
    }
}
