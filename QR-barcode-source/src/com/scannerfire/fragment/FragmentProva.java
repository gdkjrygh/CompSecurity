// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.fragment;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.QRBS.activity.FromURL;
import com.QRBS.activity.ManualInsert;
import com.QRBS.activity.MyResultActivity;
import com.QRBS.activity.QrActivity;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.ResultParser;
import com.scannerfire.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FragmentProva extends SherlockFragment
{

    public static ArrayAdapter adapter;
    private int SELECT_PICTURE;
    ListView lv;
    Vibrator vib;

    public FragmentProva()
    {
        SELECT_PICTURE = 0;
    }

    private void callGallery()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        try
        {
            startActivityForResult(Intent.createChooser(intent, "Select Picture"), SELECT_PICTURE);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Utils.showToastNotification(getActivity(), getString(0x7f080157));
        }
    }

    private void inizialite(List list)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800d9));
        hashmap.put("description", getString(0x7f0800da));
        hashmap.put("image", Integer.valueOf(0x7f020109));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800db));
        hashmap.put("description", getString(0x7f0800dc));
        hashmap.put("image", Integer.valueOf(0x7f0200ed));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800dd));
        hashmap.put("description", getString(0x7f0800de));
        hashmap.put("image", Integer.valueOf(0x7f0200c2));
        list.add(hashmap);
        hashmap = new HashMap();
        hashmap.put("title", getString(0x7f0800df));
        hashmap.put("description", getString(0x7f0800e0));
        hashmap.put("image", Integer.valueOf(0x7f0200bd));
        list.add(hashmap);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != SELECT_PICTURE || j != -1) goto _L2; else goto _L1
_L1:
        Object obj;
        InputStream inputstream = getActivity().getContentResolver().openInputStream(intent.getData());
        Log.d("", "check1");
        obj = BitmapFactory.decodeStream(inputstream);
        inputstream.close();
        if (obj != null) goto _L4; else goto _L3
_L3:
        Object obj1;
        Result result;
        try
        {
            Utils.showToastNotification(getActivity(), "Error: bitmap null");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((FileNotFoundException) (obj)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Utils.showToastNotification(getActivity(), "Image is too big to decode");
        }
          goto _L2
_L4:
        result = Utils.decodeBitmap(((Bitmap) (obj)));
        if (result != null) goto _L6; else goto _L5
_L5:
        Utils.showToastNotification(getActivity(), "No barcode found");
        return;
_L2:
        super.onActivityResult(i, j, intent);
        return;
_L6:
        if (!Utils.getAutomaticRedPref(getActivity().getApplicationContext()))
        {
            break MISSING_BLOCK_LABEL_362;
        }
        obj1 = ResultParser.parseResult(result);
        if (result.getBarcodeFormat().toString() != "QR_CODE" || ((ParsedResult) (obj1)).getType().toString() != "URI")
        {
            break MISSING_BLOCK_LABEL_282;
        }
        obj1 = result.getText().toLowerCase();
        obj = obj1;
        if (((String) (obj1)).startsWith("market://details?id="))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj = obj1;
        if (((String) (obj1)).startsWith("http://"))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        if (!((String) (obj1)).startsWith("http://"))
        {
            break MISSING_BLOCK_LABEL_260;
        }
        obj = obj1;
_L7:
        Log.d("", (new StringBuilder("THE URL IS: ")).append(((String) (obj))).toString());
        Utils.saveInDB(getActivity(), result);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj)))));
        return;
        obj = (new StringBuilder("http://")).append(((String) (obj1))).toString();
          goto _L7
        if (((ParsedResult) (obj1)).getType().toString() == "PRODUCT")
        {
            obj = (new StringBuilder("http://www.google.com/m/products?q=")).append(result.getText()).toString();
            Utils.saveInDB(getActivity(), result);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj)))));
            return;
        }
        Intent intent1 = new Intent(getActivity(), com/QRBS/activity/MyResultActivity);
        Bundle bundle = Utils.makeBundle(result);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        intent1.putExtra("picture", bytearrayoutputstream.toByteArray());
        intent1.putExtras(bundle);
        Log.d("", "INIZIO SALVATAGGIO");
        Utils.saveInDB(getActivity(), result);
        Log.d("", "FINE SALVATAGGIO");
        startActivity(intent1);
          goto _L2
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        vib = (Vibrator)getActivity().getSystemService("vibrator");
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030031, viewgroup, false);
        lv = (ListView)layoutinflater.findViewById(0x7f0d00a3);
        viewgroup = new ArrayList();
        inizialite(viewgroup);
        viewgroup = new SimpleAdapter(getActivity(), viewgroup, 0x7f030032, new String[] {
            "title", "description", "image"
        }, new int[] {
            0x7f0d00a5, 0x7f0d00a6, 0x7f0d00a4
        });
        lv.setAdapter(viewgroup);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FragmentProva this$0;

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
                    adapterview = new Intent(getActivity(), com/QRBS/activity/QrActivity);
                    getActivity().startActivity(adapterview);
                    return;

                case 1: // '\001'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/ManualInsert);
                    getActivity().startActivity(adapterview);
                    return;

                case 2: // '\002'
                    callGallery();
                    return;

                case 3: // '\003'
                    adapterview = new Intent(getActivity(), com/QRBS/activity/FromURL);
                    break;
                }
                getActivity().startActivity(adapterview);
            }

            
            {
                this$0 = FragmentProva.this;
                super();
            }
        });
        return layoutinflater;
    }

}
