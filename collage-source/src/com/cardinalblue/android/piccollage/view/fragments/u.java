// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;

public class u extends Fragment
{

    public u()
    {
    }

    private void a()
    {
        Intent intent1;
        String s;
        String s1;
        s = getString(0x7f0701ec);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s1 = android.provider.Telephony.Sms.getDefaultSmsPackage(getActivity());
        intent1 = new Intent("android.intent.action.SEND");
        intent1.setType("text/plain");
        intent1.putExtra("android.intent.extra.TEXT", s);
        Intent intent;
        intent = intent1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        intent1.setPackage(s1);
        intent = intent1;
_L1:
        try
        {
            startActivityForResult(intent, 200);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            k.a(getActivity(), 0x7f07013e, 0);
        }
        break MISSING_BLOCK_LABEL_111;
        intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:"));
        intent.putExtra("sms_body", s);
          goto _L1
    }

    static void a(u u1)
    {
        u1.a();
    }

    private void b()
    {
        try
        {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(String.format("mailto:?subject=%s&body=%s", new Object[] {
                getString(0x7f0701eb), getString(0x7f0701ea)
            })));
            startActivityForResult(Intent.createChooser(intent, getString(0x7f0701e9)), 201);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            k.a(getActivity(), 0x7f07013d, 0);
        }
    }

    static void b(u u1)
    {
        u1.b();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j != -1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 200 201: default 28
    //                   200 38
    //                   201 29;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        com.cardinalblue.android.piccollage.a.b.q("email");
        com.cardinalblue.android.piccollage.a.b.J();
        return;
_L3:
        com.cardinalblue.android.piccollage.a.b.q("sms");
        com.cardinalblue.android.piccollage.a.b.I();
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bf, viewgroup, false);
        layoutinflater.findViewById(0x7f1001e8).setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.p("sms");
                com.cardinalblue.android.piccollage.a.b.G();
                u.a(a);
            }

            
            {
                a = u.this;
                super();
            }
        });
        layoutinflater.findViewById(0x7f1001e9).setOnClickListener(new android.view.View.OnClickListener() {

            final u a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.p("email");
                com.cardinalblue.android.piccollage.a.b.H();
                com.cardinalblue.android.piccollage.view.fragments.u.b(a);
            }

            
            {
                a = u.this;
                super();
            }
        });
        return layoutinflater;
    }
}
