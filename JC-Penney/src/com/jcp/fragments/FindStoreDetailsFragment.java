// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import android.support.v4.app.ay;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import com.google.android.gms.common.d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.j;
import com.google.android.gms.maps.n;
import com.jcp.JCP;
import com.jcp.c.e;
import com.jcp.c.s;
import com.jcp.e.ap;
import com.jcp.pojo.ProfilePojo;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.storepickup.pojo.Timings;
import com.jcp.util.aa;
import com.jcp.util.af;
import com.jcp.util.ah;
import com.jcp.util.au;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            s, ar, aq

public class FindStoreDetailsFragment extends com.jcp.fragments.s
    implements ap
{

    private ProfilePojo a[];
    protected TextView addresstv;
    private View b;
    private Stores c;
    private SharedPreferences d;
    protected TextView distancetv;
    private boolean e;
    private boolean f;
    private List g;
    private boolean h;
    private j i;
    protected TextView nametv;
    protected TextView phonetv;
    protected TextView servicestv;
    protected TextView timingstv;
    protected ToggleButton toggleButton;

    public FindStoreDetailsFragment()
    {
    }

    private void W()
    {
label0:
        {
            Bundle bundle = h();
            if (bundle != null)
            {
                g = bundle.getParcelableArrayList("arrayStoreFullList");
                c = (Stores)bundle.getParcelable("arrayStoreList");
                Object obj = bundle.getString("fromStoreList");
                if (c != null)
                {
                    String s1 = System.getProperty("line.separator");
                    if ("fromStoreList".equalsIgnoreCase(((String) (obj))))
                    {
                        distancetv.setText((new StringBuilder()).append(c.getDistance()).append(" ").append(j().getString(0x7f070292)).toString());
                    } else
                    {
                        distancetv.setVisibility(8);
                    }
                    nametv.setText(c.getName());
                    obj = new StringBuilder();
                    if (!TextUtils.isEmpty(c.getStreet()))
                    {
                        ((StringBuilder) (obj)).append(c.getStreet());
                        ((StringBuilder) (obj)).append(s1);
                    }
                    if (!TextUtils.isEmpty(c.getCity()))
                    {
                        ((StringBuilder) (obj)).append(c.getCity());
                        ((StringBuilder) (obj)).append(' ');
                    }
                    if (!TextUtils.isEmpty(c.getStateCode()))
                    {
                        ((StringBuilder) (obj)).append(c.getStateCode());
                        ((StringBuilder) (obj)).append(' ');
                    } else
                    if (!TextUtils.isEmpty(c.getState()))
                    {
                        ((StringBuilder) (obj)).append(c.getState());
                        ((StringBuilder) (obj)).append(' ');
                    }
                    if (!TextUtils.isEmpty(c.getZip()))
                    {
                        ((StringBuilder) (obj)).append(c.getZip());
                        ((StringBuilder) (obj)).append(' ');
                    }
                    addresstv.setText(((StringBuilder) (obj)).toString());
                    phonetv.setText(c.getPhone());
                    d = i().getSharedPreferences("MyPrefsForStore", 0);
                    if (e)
                    {
                        f = true;
                        obj = new e(i());
                        ((e) (obj)).a(this);
                        ((e) (obj)).a();
                    }
                    if (!ah.a(c.getTimings()))
                    {
                        obj = new StringBuilder();
                        for (Iterator iterator = c.getTimings().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(s1))
                        {
                            Timings timings = (Timings)iterator.next();
                            ((StringBuilder) (obj)).append(timings.getDays());
                            ((StringBuilder) (obj)).append(' ');
                            ((StringBuilder) (obj)).append(timings.getTime());
                        }

                        timingstv.setText(((StringBuilder) (obj)).toString().trim());
                    }
                    if (ah.a(c.getServices()))
                    {
                        break label0;
                    }
                    b.findViewById(0x7f0e0315).setVisibility(0);
                    obj = new StringBuilder();
                    String as[] = c.getServices();
                    int l = as.length;
                    for (int k = 0; k < l; k++)
                    {
                        ((StringBuilder) (obj)).append(as[k]);
                        ((StringBuilder) (obj)).append(s1);
                    }

                    servicestv.setText(((StringBuilder) (obj)).toString().trim());
                }
            }
            return;
        }
        b.findViewById(0x7f0e0315).setVisibility(4);
    }

    private void X()
    {
        SharedPreferences sharedpreferences = i().getSharedPreferences("MyPrefsForStore", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().clear().commit();
        }
    }

    private void Z()
    {
        ay ay1 = l().a();
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        googlemapoptions.i(true);
        googlemapoptions.j(false);
        i = j.a(googlemapoptions);
        ay1.a(0x7f0e030c, i);
        ay1.a();
    }

    static Stores a(FindStoreDetailsFragment findstoredetailsfragment)
    {
        return findstoredetailsfragment.c;
    }

    private Map a(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("storeNumber", s1);
        hashmap.put("isDefault", s2);
        return hashmap;
    }

    private void a(View view)
    {
        ButterKnife.inject(this, view);
        W();
    }

    private void b(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f070049, new ar(this));
        builder.create().show();
    }

    final void U()
    {
        c c1;
label0:
        {
            if (i != null)
            {
                c1 = i.b();
                if (c1 != null)
                {
                    break label0;
                }
                int k = com.google.android.gms.common.d.a(i());
                if (k != 0)
                {
                    com.google.android.gms.common.d.a(k, i(), 0);
                }
            }
            return;
        }
        (new s(c, i(), c1)).execute(new Void[0]);
        c1.c().b(false);
        c1.c().a(false);
        c1.a(new aq(this));
    }

    public void V()
    {
        if (h != toggleButton.isChecked())
        {
            i().setResult(-1);
        } else
        {
            i().setResult(0);
        }
        i().finish();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            b = layoutinflater.inflate(0x7f030082, viewgroup, false);
            i().getActionBar().hide();
            e = JCP.s().c();
            Z();
            a(b);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            layoutinflater.printStackTrace();
        }
        return b;
    }

    protected String a()
    {
        return "STOREDETAILS";
    }

    public final void a(String s1, int k)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            b(s1);
            return;
        }
    }

    public final void a(ProfilePojo aprofilepojo[], int k)
    {
        if (i() != null && n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k == 33)
        {
            d = i().getSharedPreferences("MyPrefsForStore", 0);
            aprofilepojo = d.edit();
            aprofilepojo.remove("storeList");
            aprofilepojo.commit();
            c.setSaved(false);
            toggleButton.setChecked(false);
            toggleButton.setBackgroundResource(0x7f020184);
            return;
        }
        a = aprofilepojo;
        if (aprofilepojo == null || aprofilepojo.length <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
        while (k < aprofilepojo.length) 
        {
            String s1 = aprofilepojo[k].getStoreNumber();
            if (!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase(c.getId()))
            {
                String s2 = aprofilepojo[k].getIsDefault();
                if (s2 != null && !s2.isEmpty())
                {
                    if ("true".equalsIgnoreCase(s2))
                    {
                        String s3 = aprofilepojo[k].getId();
                        if (f)
                        {
                            toggleButton.setChecked(true);
                            toggleButton.setBackgroundResource(0x7f020185);
                            h = toggleButton.isChecked();
                        } else
                        if (c.getId() != null && c.getId().length() > 0 && e)
                        {
                            e e1 = new e(i());
                            e1.a(this);
                            e1.b(s3);
                        }
                    } else
                    if (f)
                    {
                        toggleButton.setChecked(false);
                        toggleButton.setBackgroundResource(0x7f020184);
                        h = toggleButton.isChecked();
                    }
                }
            }
            k++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        d = i().getSharedPreferences("MyPrefsForStore", 0);
        aprofilepojo = (Stores)aa.a(d.getString("storeList", ""), com/jcp/storepickup/pojo/Stores);
        if (aprofilepojo != null && aprofilepojo.getId() != null && !aprofilepojo.getId().isEmpty() && c.getId() != null && !c.getId().isEmpty() && aprofilepojo.getId().equalsIgnoreCase(c.getId()))
        {
            toggleButton.setChecked(true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a_(List list, int k)
    {
    }

    void addressLayoutClick()
    {
        if (c.getLatitude() != null && c.getLatitude().length() > 0 && c.getLongitude() != null && c.getLongitude().length() > 0)
        {
            a(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:").append(c.getLatitude()).append(",").append(c.getLongitude()).toString())));
        }
    }

    public final void b(String s1, int k)
    {
        boolean flag = false;
        if (i() != null && n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.content.SharedPreferences.Editor editor;
        com.google.a.j j1;
        editor = d.edit();
        j1 = new com.google.a.j();
        if (!TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        c.setSaved(true);
        editor.putString("storeList", j1.a(c));
        editor.commit();
        toggleButton.setChecked(true);
        toggleButton.setBackgroundResource(0x7f020185);
        if (g != null && !g.isEmpty())
        {
            k = 0;
            while (k < g.size()) 
            {
                if (g.get(k) != null)
                {
                    s1 = ((Stores)g.get(k)).getNumber();
                    if (!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase(c.getNumber()))
                    {
                        ((Stores)g.get(k)).setSaved(true);
                    } else
                    {
                        ((Stores)g.get(k)).setSaved(false);
                    }
                }
                k++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (c == null)
        {
            break; /* Loop/switch isn't completed */
        }
        c.setSaved(true);
        editor.putString("storeList", j1.a(c));
        editor.commit();
        toggleButton.setChecked(true);
        toggleButton.setBackgroundResource(0x7f020185);
        if (g != null && !g.isEmpty())
        {
            k = 0;
            while (k < g.size()) 
            {
                s1 = ((Stores)g.get(k)).getNumber();
                if (!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase(c.getNumber()))
                {
                    ((Stores)g.get(k)).setSaved(true);
                } else
                {
                    ((Stores)g.get(k)).setSaved(false);
                }
                k++;
            }
        }
        if (a != null && a.length > 1)
        {
            k = ((flag) ? 1 : 0);
            while (k < a.length) 
            {
                s1 = a[k].getIsDefault();
                if (s1 != null && !s1.isEmpty() && "false".equalsIgnoreCase(s1))
                {
                    s1 = a[k].getId();
                    if (s1 != null && !s1.isEmpty())
                    {
                        e e1 = new e(i());
                        e1.a(this);
                        e1.b(s1);
                    }
                }
                k++;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        c.setSaved(false);
        i().getSharedPreferences("MyPrefsForStore", 0).edit().remove("storeList").commit();
        toggleButton.setBackgroundResource(0x7f020184);
        toggleButton.setChecked(false);
        return;
    }

    public void f()
    {
        super.f();
        i().getActionBar().show();
    }

    public final void f_()
    {
        super.f_();
        U();
    }

    void phoneClick()
    {
        if (c.getPhone() != null && c.getPhone().length() > 0)
        {
            au.c(i(), c.getPhone());
        }
    }

    void toggleButtonClick()
    {
label0:
        {
label1:
            {
                if (!toggleButton.isChecked())
                {
                    break label0;
                }
                if (c.getId() != null && c.getId().length() > 0)
                {
                    if (!e)
                    {
                        break label1;
                    }
                    Map map = a(c.getId(), "true");
                    e e2 = new e(i());
                    e2.a(this);
                    e2.a(map, c.getId());
                }
                return;
            }
            X();
            toggleButton.setBackgroundResource(0x7f020184);
            toggleButton.setChecked(false);
            Toast.makeText(i(), j().getString(0x7f070316), 0).show();
            return;
        }
        if (e)
        {
            f = false;
            e e1 = new e(i());
            e1.a(this);
            e1.a();
            return;
        } else
        {
            toggleButton.setBackgroundResource(0x7f020185);
            toggleButton.setChecked(true);
            Toast.makeText(i(), j().getString(0x7f070316), 0).show();
            return;
        }
    }
}
