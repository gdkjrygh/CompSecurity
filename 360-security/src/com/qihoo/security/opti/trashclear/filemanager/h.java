// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.dialog.j;
import com.qihoo.security.locale.d;
import com.qihoo360.mobilesafe.b.s;
import java.io.File;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            g

public class h
{

    public static long a = 0L;

    public static String a(String s)
    {
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            s = "*/*";
        } else
        {
            String s1 = g.a(s.substring(i + 1, s.length()).toLowerCase());
            s = s1;
            if (s1 == null)
            {
                return "*/*";
            }
        }
        return s;
    }

    public static void a(Context context, String s)
    {
        if (System.currentTimeMillis() - a >= 500L)
        {
            a = System.currentTimeMillis();
            String s1 = a(s);
            if (!TextUtils.isEmpty(s1) && !TextUtils.equals(s1, "*/*"))
            {
                Intent intent = new Intent();
                intent.addFlags(0x10000000);
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(Uri.fromFile(new File(s)), s1);
                context.startActivity(intent);
                return;
            }
            s1 = d.a().a(0x7f0c0072);
            String s2 = d.a().a(0x7f0c0073);
            String s3 = d.a().a(0x7f0c0074);
            String s4 = d.a().a(0x7f0c0075);
            j j1 = new j(context);
            j1.setDialogTitle(0x7f0c0071);
            s = new android.widget.AdapterView.OnItemClickListener(j1, s, context) {

                final j a;
                final String b;
                final Context c;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    adapterview = "*/*";
                    i;
                    JVM INSTR tableswitch 0 3: default 36
                //                               0 94
                //                               1 100
                //                               2 106
                //                               3 112;
                       goto _L1 _L2 _L3 _L4 _L5
_L1:
                    break; /* Loop/switch isn't completed */
_L5:
                    break MISSING_BLOCK_LABEL_112;
_L6:
                    com.qihoo360.mobilesafe.b.s.a(a);
                    try
                    {
                        view = new Intent();
                        view.addFlags(0x10000000);
                        view.setAction("android.intent.action.VIEW");
                        view.setDataAndType(Uri.fromFile(new File(b)), adapterview);
                        c.startActivity(view);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (AdapterView adapterview)
                    {
                        com.qihoo360.mobilesafe.b.s.a(c, 0x7f0c0076, 0);
                    }
                    break MISSING_BLOCK_LABEL_129;
_L2:
                    adapterview = "text/plain";
                      goto _L6
_L3:
                    adapterview = "audio/*";
                      goto _L6
_L4:
                    adapterview = "video/*";
                      goto _L6
                    adapterview = "image/*";
                      goto _L6
                }

            
            {
                a = j1;
                b = s1;
                c = context;
                super();
            }
            };
            j1.a(new String[] {
                s1, s2, s3, s4
            }, s);
            j1.getShownButtons();
            if (!((Activity)context).isFinishing())
            {
                j1.show();
                return;
            }
        }
    }

}
