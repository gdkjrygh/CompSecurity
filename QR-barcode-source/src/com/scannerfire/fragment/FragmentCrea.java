// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.QRBS.activity.CreateApp;
import com.QRBS.activity.CreateBookmarks;
import com.QRBS.activity.CreateCalendar;
import com.QRBS.activity.CreateEmail;
import com.QRBS.activity.CreateGps;
import com.QRBS.activity.CreateTel;
import com.QRBS.activity.CreateUrl;
import com.QRBS.activity.FreeText;
import com.actionbarsherlock.app.SherlockFragment;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FragmentCrea extends SherlockFragment
{

    final int PICK_CONTACT_REQUEST = 0;
    ListView lv;
    Vibrator vib;

    public FragmentCrea()
    {
    }

    private void inizialite(List list)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800e1));
        hashmap.put("description", getString(0x7f0800e2));
        hashmap.put("image", Integer.valueOf(0x7f0200bc));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800e3));
        hashmap.put("description", getString(0x7f0800e4));
        hashmap.put("image", Integer.valueOf(0x7f0200bf));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800af));
        hashmap.put("description", getString(0x7f0800e5));
        hashmap.put("image", Integer.valueOf(0x7f02012e));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800b0));
        hashmap.put("description", getString(0x7f0800e6));
        hashmap.put("image", Integer.valueOf(0x7f0200c1));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800e7));
        hashmap.put("description", getString(0x7f0800e8));
        hashmap.put("image", Integer.valueOf(0x7f020089));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800e9));
        hashmap.put("description", getString(0x7f0800ea));
        hashmap.put("image", Integer.valueOf(0x7f0200c3));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800eb));
        hashmap.put("description", getString(0x7f0800ec));
        hashmap.put("image", Integer.valueOf(0x7f02012a));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800ed));
        hashmap.put("description", getString(0x7f0800ee));
        hashmap.put("image", Integer.valueOf(0x7f02008c));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800ef));
        hashmap.put("description", getString(0x7f0800f0));
        hashmap.put("image", Integer.valueOf(0x7f020099));
        list.add(hashmap);
    }

    private void pickContact()
    {
        startActivityForResult(new Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), 0);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 0 && j == -1)
        {
            Log.d("", "CHECK POINT");
            android.net.Uri uri = intent.getData();
            intent = new EncodeUtils(getActivity());
            String as[] = intent.generateVcard(uri);
            intent.start(as[0], as[1]);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        vib = (Vibrator)getActivity().getSystemService("vibrator");
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030030, viewgroup, false);
        lv = (ListView)layoutinflater.findViewById(0x7f0d00a2);
        viewgroup = new ArrayList();
        inizialite(viewgroup);
        viewgroup = new SimpleAdapter(getActivity(), viewgroup, 0x7f030032, new String[] {
            "title", "description", "image"
        }, new int[] {
            0x7f0d00a5, 0x7f0d00a6, 0x7f0d00a4
        });
        lv.setAdapter(viewgroup);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FragmentCrea this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (Utils.getVibratePref(getActivity().getApplicationContext()))
                {
                    vib.vibrate(60L);
                }
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    pickContact();
                    return;

                case 1: // '\001'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateTel);
                    getActivity().startActivity(adapterview);
                    return;

                case 2: // '\002'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateUrl);
                    getActivity().startActivity(adapterview);
                    return;

                case 3: // '\003'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateEmail);
                    getActivity().startActivity(adapterview);
                    return;

                case 4: // '\004'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateApp);
                    getActivity().startActivity(adapterview);
                    return;

                case 5: // '\005'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateGps);
                    getActivity().startActivity(adapterview);
                    return;

                case 6: // '\006'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/FreeText);
                    getActivity().startActivity(adapterview);
                    return;

                case 7: // '\007'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateBookmarks);
                    getActivity().startActivity(adapterview);
                    return;

                case 8: // '\b'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/CreateCalendar);
                    break;
                }
                getActivity().startActivity(adapterview);
            }

            
            {
                this$0 = FragmentCrea.this;
                super();
            }
        });
        return layoutinflater;
    }

}
