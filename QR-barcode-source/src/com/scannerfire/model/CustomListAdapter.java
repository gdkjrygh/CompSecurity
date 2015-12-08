// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.google.zxing.Result;
import com.google.zxing.client.result.ResultParser;
import com.scannerfire.db.DbAdapter;
import com.scannerfire.fragment.FragmentCronology;
import com.scannerfire.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.scannerfire.model:
//            BizCard, MatMsg, Mail, QRModel

public class CustomListAdapter extends BaseAdapter
    implements Filterable
{

    private static int $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE[];
    Activity a;
    TextView date;
    ImageView image;
    LayoutInflater inflater;
    ArrayList m;
    int resource;
    TextView scan;
    TextView time;

    static int[] $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()
    {
        int ai[] = $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.scannerfire.utils.Utils.MODE.values().length];
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._calendar.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._contact.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._email.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._geo.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._isbn.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._phone.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._product.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._text.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.scannerfire.utils.Utils.MODE._url.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE = ai;
        return ai;
    }

    public CustomListAdapter(Activity activity, int i, ArrayList arraylist)
    {
        inflater = null;
        a = activity;
        resource = i;
        m = arraylist;
        inflater = (LayoutInflater)activity.getSystemService("layout_inflater");
    }

    private String getTextFromMode(com.scannerfire.utils.Utils.MODE mode, String s, Result result)
    {
        Object obj = "";
        $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[mode.ordinal()];
        JVM INSTR tableswitch 1 9: default 64
    //                   1 69
    //                   2 437
    //                   3 510
    //                   4 508
    //                   5 464
    //                   6 506
    //                   7 550
    //                   8 548
    //                   9 568;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        mode = ((com.scannerfire.utils.Utils.MODE) (obj));
_L12:
        return mode;
_L2:
        if (s.contains("BIZCARD:"))
        {
            BizCard.getBizCardFromString(s);
            return BizCard.getString();
        }
        s = "";
        result = Utils.makeBundle(result);
        mode = s;
        if (result == null) goto _L12; else goto _L11
_L11:
        result = result.getBundle("extraData");
        mode = s;
        if (result == null) goto _L12; else goto _L13
_L13:
        mode = result.getStringArray("names");
        if (mode != null)
        {
            s = (new StringBuilder(String.valueOf(""))).append(mode[0]).append(" ").toString();
        }
        obj = result.getStringArray("phones");
        mode = s;
        if (obj == null) goto _L15; else goto _L14
_L14:
        int i;
        i = 0;
        mode = s;
_L21:
        if (i < obj.length) goto _L16; else goto _L15
_L15:
        obj = result.getStringArray("emails");
        s = mode;
        if (obj == null) goto _L18; else goto _L17
_L17:
        i = 0;
_L22:
        if (i < obj.length) goto _L20; else goto _L19
_L19:
        s = mode;
_L18:
        obj = result.getString("org");
        mode = s;
        if (obj != null)
        {
            mode = (new StringBuilder(String.valueOf(s))).append(((String) (obj))).append("\n").toString();
        }
        String s1 = result.getString("title");
        s = mode;
        if (obj != null)
        {
            s = (new StringBuilder(String.valueOf(mode))).append(s1).append("\n").toString();
        }
        result = result.getStringArray("indirizzi");
        mode = s;
        if (result != null)
        {
            return (new StringBuilder(String.valueOf(s))).append(result[0]).append("\n").toString();
        }
          goto _L12
_L16:
        Log.d("", (new StringBuilder("Phone ")).append(i).append(":").append(obj[i]).toString());
        mode = (new StringBuilder(String.valueOf(mode))).append(obj[i]).append(" ").toString();
        i++;
          goto _L21
_L20:
        mode = (new StringBuilder(String.valueOf(mode))).append(obj[i]).append(" ").toString();
        i++;
          goto _L22
_L3:
        if (s.contains("MATMSG:"))
        {
            MatMsg.getMatMsgFromString(s);
            return MatMsg.getString();
        } else
        {
            Mail.getMailFromString(s);
            return Mail.getString();
        }
_L6:
        mode = s;
        if (s.startsWith("geo:"))
        {
            mode = s.replaceFirst("geo:", "");
        }
        s = mode;
        if (mode.startsWith("GEO:"))
        {
            s = mode.replaceFirst("GEO:", "");
        }
        return s;
_L7:
        return s;
_L5:
        return s;
_L4:
        mode = s;
        if (s.startsWith("uri:"))
        {
            mode = s.replaceFirst("uri:", "");
        }
        if (!s.startsWith("URI:")) goto _L12; else goto _L23
_L23:
        return s.replaceFirst("URI:", "");
_L9:
        return s;
_L8:
        mode = s;
        s = Utils.makeBundle(result);
        if (s == null) goto _L12; else goto _L24
_L24:
        return s.getString("label");
_L10:
        return s;
    }

    public int getCount()
    {
        return m.size();
    }

    public Filter getFilter()
    {
        return new Filter() {

            ArrayList original;
            final CustomListAdapter this$0;

            protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
            {
                Log.d("", (new StringBuilder("filtering.....")).append(charsequence).toString());
                Object obj = new DbAdapter(a.getApplicationContext());
                ((DbAdapter) (obj)).open();
                original = ((DbAdapter) (obj)).getValues();
                ((DbAdapter) (obj)).close();
                obj = new android.widget.Filter.FilterResults();
                ArrayList arraylist = new ArrayList();
                if (charsequence == null || charsequence.length() == 0)
                {
                    obj.values = original;
                    obj.count = original.size();
                    return ((android.widget.Filter.FilterResults) (obj));
                }
                int i = 0;
                do
                {
                    if (i >= original.size())
                    {
                        obj.values = arraylist;
                        obj.count = arraylist.size();
                        return ((android.widget.Filter.FilterResults) (obj));
                    }
                    QRModel qrmodel = (QRModel)original.get(i);
                    if (qrmodel.getResult().getText().toLowerCase(Locale.US).contains(charsequence.toString().toLowerCase(Locale.US)))
                    {
                        Log.d("", (new StringBuilder("DATA ")).append(i).append(" -> ").append(qrmodel.getResult().getText()).toString());
                        arraylist.add(qrmodel);
                    }
                    i++;
                } while (true);
            }

            protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
            {
                Log.d("", "PUBLISH RESULT");
                m = (ArrayList)filterresults.values;
                notifyDataSetChanged();
            }

            
            {
                this$0 = CustomListAdapter.this;
                super();
            }
        };
    }

    public QRModel getItem(int i)
    {
        return (QRModel)m.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(final int position, final View row, final ViewGroup model)
    {
        Log.d("", (new StringBuilder("Dentro getView POS: ")).append(position).toString());
        model = row;
        row = model;
        if (model == null)
        {
            row = inflater.inflate(resource, null);
        }
        scan = (TextView)row.findViewById(0x7f0d00d5);
        date = (TextView)row.findViewById(0x7f0d00d6);
        time = (TextView)row.findViewById(0x7f0d00d7);
        image = (ImageView)row.findViewById(0x7f0d0074);
        model = (QRModel)m.get(position);
        com.scannerfire.utils.Utils.MODE mode = com.scannerfire.utils.ResultParser.getParsedResult(ResultParser.parseResult(model.getResult()));
        scan.setText(getTextFromMode(mode, model.getResult().getText(), model.getResult()));
        time.setText(model.getTime());
        date.setText(model.getDate());
        row.setOnClickListener(new android.view.View.OnClickListener() {

            final CustomListAdapter this$0;
            private final QRModel val$model;
            private final int val$position;
            private final View val$row;

            public void onClick(View view)
            {
                if (Utils.getVibratePref(a.getApplicationContext()))
                {
                    ((Vibrator)a.getSystemService("vibrator")).vibrate(60L);
                }
                Utils.createQuickMenu(a, model, row, position, CustomListAdapter.this);
                ((FragmentCronology)((SherlockFragmentActivity)a).getSupportFragmentManager().getFragments().get(1)).clearCronology();
                view.setBackgroundDrawable(new ColorDrawable(a.getResources().getColor(0x7f09002a)));
                Utils.setLastElem(((QRModel)m.get(position)).getId());
            }

            
            {
                this$0 = CustomListAdapter.this;
                model = qrmodel;
                row = view;
                position = i;
                super();
            }
        });
        if (((QRModel)m.get(position)).getId() != Utils.getLastElem())
        {
            row.setBackgroundDrawable(new ColorDrawable(-1));
            return row;
        } else
        {
            row.setBackgroundDrawable(new ColorDrawable(a.getResources().getColor(0x7f09002a)));
            return row;
        }
    }

    public void remove(int i)
    {
        Log.d("", (new StringBuilder("ITEM IS ")).append(i).toString());
        DbAdapter dbadapter = new DbAdapter(a);
        dbadapter.open();
        dbadapter.deleteRecord(((QRModel)m.get(i)).getId());
        dbadapter.close();
        m.remove(i);
    }
}
