// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.arist.activity.MusicPlayActivity;
import com.arist.b.b;
import com.arist.c.a;
import com.arist.c.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.arist.model.lrc:
//            m, j, k, l

public final class i
{

    public i()
    {
    }

    private static List a(String s, String s1)
    {
        boolean flag1 = true;
        int i1 = 0;
        String s2 = s;
        if (s != null)
        {
            s2 = s.toLowerCase();
        }
        s = s1;
        if (s1 != null)
        {
            s = s1.toLowerCase();
        }
        s1 = new ArrayList();
        File file = new File(a.F);
        if (!file.exists() || !file.isDirectory())
        {
            return s1;
        }
        File afile[] = file.listFiles();
        if (afile == null || afile.length == 0)
        {
            return s1;
        }
        boolean flag;
        int j1;
        if (s2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s == null)
        {
            flag1 = false;
        }
        j1 = afile.length;
        do
        {
            if (i1 >= j1)
            {
                return s1;
            }
            File file1 = afile[i1];
            if (file1 != null)
            {
                String s3 = file1.getAbsolutePath().toLowerCase();
                if (s3.endsWith(".lrc") && (flag && s3.contains(s2) || flag1 && s3.contains(s)))
                {
                    s1.add(file1.getAbsolutePath());
                }
            }
            i1++;
        } while (true);
    }

    public final void a(MusicPlayActivity musicplayactivity, b b1)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(musicplayactivity)).create();
        LayoutInflater layoutinflater = musicplayactivity.getLayoutInflater();
        View view = layoutinflater.inflate(0x7f030012, null);
        ListView listview = (ListView)view.findViewById(0x7f060062);
        String s = "";
        Object obj = "";
        if (b1 != null)
        {
            s = b1.d();
            obj = c.d(b1.e());
        }
        obj = new m(this, layoutinflater, a(s, ((String) (obj))));
        listview.setAdapter(((android.widget.ListAdapter) (obj)));
        listview.setOnItemClickListener(new j(this, alertdialog, b1, ((m) (obj)), musicplayactivity));
        view.findViewById(0x7f060064).setOnClickListener(new k(this, alertdialog, musicplayactivity, b1));
        view.findViewById(0x7f060063).setOnClickListener(new l(this, alertdialog, b1, musicplayactivity));
        alertdialog.setView(view);
        alertdialog.show();
    }
}
