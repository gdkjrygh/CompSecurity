// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.text.Html;

// Referenced classes of package com.roidapp.photogrid.release:
//            bh

public final class bg
{

    private String a;
    private String b;
    private String c;
    private boolean d;
    private Activity e;

    public bg(Activity activity)
    {
        d = false;
        e = activity;
    }

    static boolean a(bg bg1)
    {
        return bg1.d;
    }

    static Activity b(bg bg1)
    {
        return bg1.e;
    }

    public final void a(int i, int j, String s)
    {
        i;
        JVM INSTR tableswitch 60930 60940: default 60
    //                   60930 500
    //                   60931 546
    //                   60932 592
    //                   60933 638
    //                   60934 684
    //                   60935 730
    //                   60936 210
    //                   60937 288
    //                   60938 776
    //                   60939 417
    //                   60940 366;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L10:
        break MISSING_BLOCK_LABEL_776;
_L1:
        a = e.getResources().getString(0x7f070158);
        b = "Unknown error.";
        c = e.getResources().getString(0x7f07024f);
        d = true;
_L13:
        if (j != 0)
        {
            if (b == null)
            {
                b = (new StringBuilder("Error:")).append(j).toString();
            } else
            {
                b = b.concat((new StringBuilder(":")).append(j).toString());
            }
        }
        try
        {
            s = new android.app.AlertDialog.Builder(e);
            s.setTitle(a);
            s.setMessage(Html.fromHtml(b));
            s.setCancelable(false);
            s.setPositiveButton(c, new bh(this));
            s = s.create();
            s.setCancelable(false);
            s.setCanceledOnTouchOutside(false);
            s.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_900;
_L8:
        a = e.getResources().getString(0x7f0702e7);
        b = (new StringBuilder()).append(e.getResources().getString(0x7f07030b)).append("\n<br><font color=\"red\">").append(s).append("</font>").toString();
        c = e.getResources().getString(0x7f07024f);
          goto _L13
_L9:
        a = e.getResources().getString(0x7f0702e7);
        b = (new StringBuilder()).append(e.getResources().getString(0x7f0701c5)).append("\n<br><font color=\"red\">").append(s).append("</font>").toString();
        c = e.getResources().getString(0x7f07024f);
          goto _L13
_L12:
        a = e.getResources().getString(0x7f0702e7);
        b = e.getResources().getString(0x7f070181);
        c = e.getResources().getString(0x7f07024f);
          goto _L13
_L11:
        a = e.getResources().getString(0x7f0702e7);
        b = (new StringBuilder()).append(e.getResources().getString(0x7f07030b)).append("\n<br><font color=\"red\">").append(s).append("</font>").toString();
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
_L2:
        a = e.getResources().getString(0x7f070158);
        b = "CORE not be installed ! ";
        c = e.getResources().getString(0x7f070133);
        d = true;
          goto _L13
_L3:
        a = e.getResources().getString(0x7f070158);
        b = "CORE's version too low.";
        c = e.getResources().getString(0x7f070133);
        d = true;
          goto _L13
_L4:
        a = e.getResources().getString(0x7f070158);
        b = "CORE can't be bind.";
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
_L5:
        a = e.getResources().getString(0x7f070158);
        b = "Encode failed.";
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
_L6:
        a = e.getResources().getString(0x7f070158);
        b = "chip not supported";
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
_L7:
        a = e.getResources().getString(0x7f070158);
        b = "JNI error";
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
        a = e.getResources().getString(0x7f070158);
        b = (new StringBuilder()).append(e.getResources().getString(0x7f07022b)).append("\n<br><font color=\"red\">").append(s).append("</font>").toString();
        c = e.getResources().getString(0x7f07024f);
        d = true;
          goto _L13
    }
}
