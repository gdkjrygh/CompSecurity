// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.roidapp.baselib.c.n;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class ce
    implements TextWatcher
{

    public boolean a;
    final br b;
    private String c;
    private int d;
    private int e;

    private ce(br br1)
    {
        b = br1;
        super();
        a = false;
        c = "";
        d = -1;
    }

    ce(br br1, byte byte0)
    {
        this(br1);
    }

    public final void a()
    {
        a = false;
        c = "";
        d = -1;
        br.q(b).removeMessages(1001);
        br.c(b).k();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (n.c(editable.toString()))
        {
            br.c(b).a((new StringBuilder()).append(br.c(b).getResources().getString(0x7f070188)).append(" 30").toString());
            Editable editable1 = br.f(b).getText();
            br.f(b).removeTextChangedListener(br.r(b));
            br.f(b).getText().delete(e - 1, editable1.length() - 1);
            br.f(b).addTextChangedListener(br.r(b));
        }
        br.b(b, editable.toString());
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        e = charsequence.length();
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (d == -1)
        {
            d = i;
        }
        if (k <= 0) goto _L2; else goto _L1
_L1:
        charsequence = charsequence.subSequence(i, i + k).toString();
        if (!a) goto _L4; else goto _L3
_L3:
        if (!charsequence.equalsIgnoreCase(" ")) goto _L6; else goto _L5
_L5:
        a = false;
        c = "";
        d = -1;
        br.q(b).removeMessages(1001);
        br.c(b).k();
_L8:
        return;
_L6:
        if (charsequence.equalsIgnoreCase("@"))
        {
            c = "";
            d = -1;
            br.q(b).removeMessages(1001);
            return;
        }
        if (k == 1 && !c.isEmpty())
        {
            if (j > 1)
            {
                c = charsequence;
            } else
            {
                c = (new StringBuilder()).append(c).append(charsequence).toString();
            }
        } else
        {
            if (j != 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            c = (new StringBuilder()).append(c).append(charsequence).toString();
        }
_L9:
        if (c.length() >= 0)
        {
            charsequence = Message.obtain();
            charsequence.what = 1001;
            charsequence.obj = c;
            br.q(b).removeMessages(1001);
            br.q(b).sendMessageDelayed(charsequence, 500L);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (c.equalsIgnoreCase(charsequence)) goto _L8; else goto _L7
_L7:
        c = charsequence;
          goto _L9
_L4:
        if (charsequence.equalsIgnoreCase("@"))
        {
            a = true;
            c = "";
            d = i;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (d == i)
        {
            a = false;
            c = "";
            d = -1;
            br.q(b).removeMessages(1001);
            br.c(b).k();
            return;
        }
        if (d + 1 > i)
        {
            a = false;
            c = "";
            d = -1;
            br.q(b).removeMessages(1001);
            br.c(b).k();
            return;
        }
        charsequence = charsequence.subSequence(d + 1, i).toString();
        if (a)
        {
            if (!c.equalsIgnoreCase(charsequence))
            {
                c = charsequence;
            }
            if (c.length() >= 0)
            {
                charsequence = Message.obtain();
                charsequence.what = 1001;
                charsequence.obj = c;
                br.q(b).removeMessages(1001);
                br.q(b).sendMessageDelayed(charsequence, 500L);
                return;
            }
        }
        if (true) goto _L8; else goto _L10
_L10:
    }
}
