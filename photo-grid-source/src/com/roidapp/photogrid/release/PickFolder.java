// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.d.a;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bn;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, pt, py, pz, 
//            rf, qa, ih, pu, 
//            pv, pw, px

public class PickFolder extends ParentActivity
{

    Comparator a;
    private ListView b;
    private ArrayAdapter c;
    private TextView d;
    private RelativeLayout e;
    private RelativeLayout f;
    private String g;
    private int h;
    private al i;
    private Handler j;

    public PickFolder()
    {
        g = "";
        j = new pt(this);
        a = new py(this);
    }

    static al a(PickFolder pickfolder)
    {
        return pickfolder.i;
    }

    static String a(PickFolder pickfolder, Object obj)
    {
        obj = (new StringBuilder()).append(pickfolder.g).append(obj).toString();
        pickfolder.g = ((String) (obj));
        return ((String) (obj));
    }

    private static String a(String s)
    {
        int k = s.lastIndexOf("/");
        try
        {
            s = s.substring(k + 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private boolean a()
    {
        if (g.equals("/"))
        {
            return true;
        }
        g = b(g);
        d(g);
        return false;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (Environment.getExternalStorageState().equals("mounted")) goto _L2; else goto _L1
_L1:
        Toast.makeText(this, 0x7f07028d, 1).show();
_L4:
        return false;
_L2:
        String s = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (s != null)
        {
            d(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(PickFolder pickfolder, String s)
    {
        return pickfolder.e(s);
    }

    static String b(PickFolder pickfolder)
    {
        return pickfolder.g;
    }

    private static String b(String s)
    {
        int k = s.lastIndexOf("/");
        if (k == 0)
        {
            return "/";
        }
        try
        {
            s = s.substring(0, k);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    static void b(PickFolder pickfolder, String s)
    {
        pickfolder.d(s);
    }

    private ArrayList c(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(this, 0x7f07028d, 1).show();
            return arraylist;
        }
        s = new File(s);
        if (s.exists() && s.isDirectory())
        {
            s = s.listFiles();
            if (s != null)
            {
                int l = s.length;
                for (int k = 0; k < l; k++)
                {
                    Object obj = s[k];
                    if (!((File) (obj)).isDirectory())
                    {
                        continue;
                    }
                    obj = a(((File) (obj)).getAbsolutePath());
                    if (obj != null)
                    {
                        arraylist.add(obj);
                    }
                }

            }
        }
        Collections.sort(arraylist, a);
        return arraylist;
    }

    static boolean c(PickFolder pickfolder)
    {
        return pickfolder.a();
    }

    static ArrayAdapter d(PickFolder pickfolder)
    {
        return pickfolder.c;
    }

    private void d(String s)
    {
        d.setText(s);
        g = s;
        c = new ArrayAdapter(this, 0x7f0300a2, 0x7f0d027b, c(s));
        b.setAdapter(c);
        b.setOnItemClickListener(new pz(this));
    }

    private boolean e(String s)
    {
        Object obj = new ArrayList();
        int k;
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(this, 0x7f07028d, 1).show();
        } else
        {
            Object obj1;
            File file;
            if (s.equals(com.roidapp.baselib.d.a.a()))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            obj1 = new ArrayList();
            file = new File(s);
            if (file.exists() && file.isDirectory())
            {
                File afile[] = file.listFiles();
                if (afile != null)
                {
                    int i1 = afile.length;
                    int l = 0;
                    while (l < i1) 
                    {
                        File file1 = afile[l];
                        String s1 = file1.getAbsolutePath().toLowerCase(Locale.ENGLISH);
                        if (s1.endsWith(".png") || s1.endsWith(".jpg") || s1.endsWith(".gif") || s1.endsWith(".bmp") || s1.endsWith(".jpeg") || s1.endsWith(".mpo") || bn.a(s1))
                        {
                            if (k != 0)
                            {
                                if (com.roidapp.photogrid.release.rf.a(file1))
                                {
                                    ((ArrayList) (obj1)).add(file1);
                                }
                            } else
                            {
                                ((ArrayList) (obj1)).add(file1);
                            }
                        }
                        l++;
                    }
                }
            }
            Collections.sort(((List) (obj1)), new qa(this));
            obj1 = ((ArrayList) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                ((ArrayList) (obj)).add(((File)((Iterator) (obj1)).next()).getAbsolutePath());
            }
        }
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        obj = m.a(this);
        Log.e("data", ((JSONArray) (obj)).toString());
        k = 0;
_L2:
        if (k >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((JSONArray) (obj)).getJSONObject(k).getString("folder").equals(s))
        {
            break MISSING_BLOCK_LABEL_345;
        }
        Toast.makeText(this, 0x7f070168, 0).show();
        return false;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("folder", s);
            ((JSONArray) (obj)).put(obj1);
            m.a(this, (new StringBuilder("#")).append(((JSONArray) (obj)).toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return true;
        Toast.makeText(this, 0x7f07016c, 1).show();
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ba.a().a(this);
        try
        {
            setContentView(0x7f0300f9);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L2; else goto _L1
_L1:
        h = ih.C().K();
        ((RelativeLayout)findViewById(0x7f0d002a)).setOnClickListener(new pu(this));
        ((ImageButton)findViewById(0x7f0d03f0)).setOnClickListener(new pv(this));
        e = (RelativeLayout)findViewById(0x7f0d03f1);
        e.setOnClickListener(new pw(this));
        f = (RelativeLayout)findViewById(0x7f0d03f3);
        f.setOnClickListener(new px(this));
        d = (TextView)findViewById(0x7f0d03f2);
        b = (ListView)findViewById(0x7f0d028f);
        if (Environment.getExternalStorageState().equals("mounted")) goto _L4; else goto _L3
_L3:
        Toast.makeText(this, 0x7f07028d, 1).show();
_L6:
        if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            i = new al(this, j);
            i.b();
            ba.a().b();
        }
_L2:
        return;
_L4:
        bundle = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (bundle != null)
        {
            d(bundle);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onDestroy()
    {
        if (i != null)
        {
            i.c();
        }
        System.gc();
        if (u != null)
        {
            u.removeAllViews();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 4)
        {
            if (a())
            {
                if (u != null)
                {
                    u.removeAllViews();
                }
                keyevent = new Intent();
                keyevent.putExtra("added", false);
                setResult(2, keyevent);
                finish();
            }
            return true;
        } else
        {
            return super.onKeyDown(k, keyevent);
        }
    }

    public void onStart()
    {
        com.roidapp.baselib.c.b.d("Pickfolder");
        super.onStart();
    }

    public final void x()
    {
        t = "pick_folder";
    }
}
