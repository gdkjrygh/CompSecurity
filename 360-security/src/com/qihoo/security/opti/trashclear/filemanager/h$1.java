// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.dialog.j;
import com.qihoo360.mobilesafe.b.s;
import java.io.File;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            h

static final class c
    implements android.widget.terView.OnItemClickListener
{

    final j a;
    final String b;
    final Context c;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = "*/*";
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 94
    //                   1 100
    //                   2 106
    //                   3 112;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_112;
_L6:
        s.a(a);
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
            s.a(c, 0x7f0c0076, 0);
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

    (j j, String s1, Context context)
    {
        a = j;
        b = s1;
        c = context;
        super();
    }
}
