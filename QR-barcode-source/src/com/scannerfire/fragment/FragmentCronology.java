// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.actionbarsherlock.app.SherlockFragment;
import com.scannerfire.db.DbAdapter;
import com.scannerfire.model.CustomListAdapter;
import com.scannerfire.model.QRModel;
import com.scannerfire.utils.Utils;
import com.splunk.mint.Mint;
import java.util.ArrayList;

public class FragmentCronology extends SherlockFragment
{

    protected static final int CODE_ACTION = 2;
    protected static final int CODE_DELETE = 1;
    protected static final int CODE_SEE = 0;
    protected static final int CODE_SHARE = 3;
    CustomListAdapter arrayAdapter;
    DbAdapter db;
    private ListView list;
    ArrayList qrArray;
    Activity startA;

    public FragmentCronology()
    {
    }

    static FragmentCronology newInstance(int i)
    {
        return new FragmentCronology();
    }

    public void clearCronology()
    {
        int i = 0;
        do
        {
            if (i >= list.getChildCount())
            {
                return;
            }
            list.getChildAt(i).setBackgroundDrawable(new ColorDrawable(-1));
            i++;
        } while (true);
    }

    public void deleteRecord(int i)
    {
        if (arrayAdapter == null)
        {
            Log.d("", "array null");
        }
        arrayAdapter.remove(i);
    }

    public CustomListAdapter getAdapter()
    {
        return arrayAdapter;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        startA = getActivity();
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Log.d("", "ON CREATE VIEW");
        layoutinflater = layoutinflater.inflate(0x7f030027, viewgroup, false);
        list = (ListView)layoutinflater.findViewById(0x7f0d008f);
        list.setTextFilterEnabled(true);
        db = new DbAdapter(getActivity());
        try
        {
            db.open();
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            Mint.logException(viewgroup);
            return layoutinflater;
        }
        qrArray = db.getValues();
        updateList(qrArray);
        db.close();
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        db = new DbAdapter(getActivity());
        db.open();
        qrArray = db.getValues();
        if (qrArray != null)
        {
            updateList(qrArray);
        }
        if (Utils.getLastElem() == -1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = -1;
        i = 0;
_L6:
        if (i < qrArray.size()) goto _L4; else goto _L3
_L3:
        list.setSelection(j);
_L2:
        db.close();
        return;
_L4:
        if (((QRModel)qrArray.get(i)).getId() == Utils.getLastElem())
        {
            j = i;
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void updateList()
    {
        arrayAdapter.notifyDataSetChanged();
    }

    public void updateList(final ArrayList array)
    {
        arrayAdapter = new CustomListAdapter(getActivity(), 0x7f030039, array);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FragmentCronology this$0;
            private final ArrayList val$array;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (Utils.getVibratePref(startA.getApplicationContext()))
                {
                    ((Vibrator)startA.getSystemService("vibrator")).vibrate(60L);
                }
                Utils.createQuickMenu(startA, (QRModel)array.get(i), view, i, arrayAdapter);
                clearCronology();
                view.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f09002a)));
                Utils.setLastElem(((QRModel)array.get(i)).getId());
            }

            
            {
                this$0 = FragmentCronology.this;
                array = arraylist;
                super();
            }
        });
    }

    public void updateList(ArrayList arraylist, Activity activity)
    {
        arrayAdapter = new CustomListAdapter(activity, 0x7f030039, arraylist);
        list = (ListView)activity.findViewById(0x7f0d008f);
        if (arrayAdapter != null && list != null)
        {
            list.setAdapter(arrayAdapter);
        }
    }
}
