// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class ofn
    implements mmt, omb, ooh, opl, ops, opt, opv
{

    private static final onj a = new onj("debug.launch_instr.dogfood");
    private List b;
    private final Activity c;
    private mrv d;
    private boolean e;
    private mms f;
    private int g;

    public ofn(Activity activity, opd opd1)
    {
        b = new ArrayList();
        f = mms.a;
        g = -1;
        c = activity;
        opd1.a(this);
        b.add(new ofr(this));
        b.add(new ofs(this));
        b.add(new ofu(this));
        b.add(new oft(this));
        b.add(new ofo());
    }

    private void a()
    {
        Object obj;
        int i;
        obj = c.getIntent();
        msn msn1;
        ofq ofq1;
        if (!e && f != mms.a && (c.isTaskRoot() || b(((Intent) (obj)))))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        e = true;
        obj = c.getIntent();
        msn1 = new msn();
        i = 0;
_L5:
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_205;
        }
        ofq1 = (ofq)b.get(i);
        if (!ofq1.a(((Intent) (obj)))) goto _L4; else goto _L3
_L3:
        obj = ofq1.b(((Intent) (obj)));
_L6:
        if (obj == null)
        {
            obj = new msm(pwo.d);
        }
        msn1.a(((msm) (obj)));
        if (!((msm) (obj)).a.b)
        {
            msn1.a(c);
        }
        obj = new mry(4, msn1);
        d.a(c, ((mru) (obj)));
_L2:
        return;
_L4:
        i++;
          goto _L5
        obj = null;
          goto _L6
    }

    private boolean b(Intent intent)
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < b.size())
                {
                    if (!((ofq)b.get(i)).a(intent))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final void X_()
    {
        a();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (mrv)olm1.a(mrv);
        ((mmr)olm1.a(mmr)).a(this);
    }

    public final void a(Intent intent)
    {
        if (b(intent))
        {
            e = false;
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getBoolean("state_event_logged");
            int i = bundle.getInt("state_account_handler_state");
            f = mms.values()[i];
            g = bundle.getInt("state_account_id");
        }
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i, int j)
    {
        f = mms2;
        g = j;
        a();
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("state_event_logged", e);
        bundle.putInt("state_account_id", g);
        bundle.putInt("state_account_handler_state", f.ordinal());
    }

}
