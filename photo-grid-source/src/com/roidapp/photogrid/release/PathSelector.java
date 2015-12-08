// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.photogrid.common.cc;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            lx, lu, ls, lv, 
//            lw

public class PathSelector extends ListActivity
{

    Comparator a;
    private String b;
    private TextView c;
    private File d;
    private boolean e;
    private lu f;
    private List g;
    private boolean h;

    public PathSelector()
    {
        b = "";
        e = false;
        a = new lx(this);
    }

    static File a(PathSelector pathselector)
    {
        return pathselector.d;
    }

    private String a()
    {
        boolean flag;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            Toast.makeText(this, "no sdcard", 0).show();
            return "";
        }
        String s;
        try
        {
            s = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    private void a(String s)
    {
        File file;
label0:
        {
            file = new File(s);
            if (file.exists() && file.isDirectory())
            {
                g = new ArrayList();
                if (g != null)
                {
                    break label0;
                }
            }
            return;
        }
        c.setText(s);
        s = file.listFiles();
        if (s != null)
        {
            for (int i = 0; i < s.length; i++)
            {
                File file1 = s[i];
                if (file1 != null && file1.exists() && file1.isDirectory() && !(new StringBuilder()).append(file1.getName()).toString().startsWith("."))
                {
                    f = new lu();
                    f.a = file1.getName();
                    f.b = file1.getAbsolutePath();
                    g.add(f);
                }
            }

        }
        Collections.sort(g, a);
        f = new lu();
        f.a = "backupParent";
        if (file.getParent() == null)
        {
            f.b = "/";
        } else
        {
            f.b = file.getParent();
        }
        g.add(0, f);
        setListAdapter(new ls(this, g));
    }

    static boolean b(PathSelector pathselector)
    {
        return pathselector.h;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f03009e);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            e = true;
            (new cc(this)).a();
        }
        if (!e)
        {
            h = getIntent().getBooleanExtra("isFromDialogFragment", false);
            c = (TextView)findViewById(0x7f0d0277);
            b = a();
            a(b);
            d = new File(b);
            if (getResources().getDisplayMetrics().density == 1.0F && (getResources().getDisplayMetrics().heightPixels == 1280 || getResources().getDisplayMetrics().heightPixels == 1184) && getResources().getDisplayMetrics().widthPixels == 800)
            {
                c.setTextSize(30F);
            }
            ((ImageButton)findViewById(0x7f0d0275)).setOnClickListener(new lv(this));
            ((ImageButton)findViewById(0x7f0d0276)).setOnClickListener(new lw(this));
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            setResult(52227, new Intent());
            finish();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onListItemClick(ListView listview, View view, int i, long l)
    {
        super.onListItemClick(listview, view, i, l);
        d = new File(((lu)g.get(i)).b);
        if (d.isDirectory())
        {
            a(((lu)g.get(i)).b);
        }
    }
}
