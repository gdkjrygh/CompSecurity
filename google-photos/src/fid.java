// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.Switch;

final class fid
    implements fij, mti
{

    private final Context a;
    private final mtj b;
    private final ibz c;
    private final mmr d;
    private final ekq e;
    private final noz f;
    private final am g;
    private CompoundButton h;

    public fid(Context context, am am1, ekq ekq1)
    {
        a = context;
        e = ekq1;
        g = am1;
        b = ((mtj)olm.a(context, mtj)).a(this);
        c = (ibz)olm.a(context, ibz);
        d = (mmr)olm.a(context, mmr);
        f = noz.a(context, "CollabSettingHandler", new String[0]);
    }

    private void a()
    {
        al al1 = (al)g.B.a("photos_collaborative_setting_toggle_task_dialog");
        if (al1 != null && TextUtils.equals("update_and_read_envelope_task_tag", ((am) (al1)).q.getString("arg_task_tag")))
        {
            al1.a(false);
        }
    }

    public final void a(Switch switch1)
    {
        h = switch1;
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!s.equals("UpdateEnvelopeSettingsTask")) goto _L2; else goto _L1
_L1:
        if (mue1 == null || !mue1.c()) goto _L4; else goto _L3
_L3:
        if (f.a())
        {
            s = mue1.c;
        }
        a();
        s = h;
        boolean flag;
        if (!h.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.setChecked(flag);
        c.a(Boolean.valueOf(h.isChecked()));
_L6:
        return;
_L4:
        s = ((hpe)e.a(hpe)).a.a;
        mue1 = ((iks)e.a(iks)).a;
        mua = new hgg();
        mua.b = a;
        mua.a = d.d();
        mua.c = s;
        mua.d = mue1;
        mua.g = true;
        s = mua.a();
        b.a(s);
        return;
_L2:
        if (s.equals("ReadMediaCollectionById"))
        {
            a();
            if (mue1 != null && mue1.c() && f.a())
            {
                s = mue1.c;
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(boolean flag)
    {
        String s = ((hpe)e.a(hpe)).a.a;
        c.a(Boolean.valueOf(flag));
        al al1 = (al)g.B.a("photos_collaborative_setting_toggle_task_dialog");
        Object obj = al1;
        if (al1 == null)
        {
            obj = new iux();
            ((al) (obj)).f(new Bundle());
        }
        ((am) (obj)).q.putString("arg_task_tag", "update_and_read_envelope_task_tag");
        ((al) (obj)).b(false);
        ((al) (obj)).a(g, 0);
        ((al) (obj)).a(g.B, "photos_collaborative_setting_toggle_task_dialog");
        b.a(new fif(d.d(), s, flag));
        return true;
    }
}
