// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class jbz
    implements dgv, mti, omb, opl, opp, opr, ops, opu, opv
{

    mtj a;
    private final ar b;
    private final Map c = new HashMap();
    private dgk d;
    private jby e;
    private long f;
    private boolean g;
    private muz h;

    jbz(ar ar1, opd opd1)
    {
        b = ar1;
        opd1.a(this);
    }

    private void a(jby jby1, int i)
    {
        if (i <= 0)
        {
            return;
        } else
        {
            dgg dgg1 = d.a().a(i);
            dgg1.d = jby1.c(b);
            dgg1.f = (dgv)p.a(this);
            jby1 = dgg1.a(b.getString(b.BP), new jcb(this, jby1));
            d.a(jby1.a());
            return;
        }
    }

    private void a(jby jby1, Exception exception)
    {
        Exception exception1 = exception;
        if (exception instanceof eke)
        {
            exception1 = ((eke)exception).a;
        }
        exception = b(jby1);
        if (exception != null)
        {
            exception.a(jby1, exception1);
        }
    }

    static void a(jbz jbz1, jby jby1, int i)
    {
        jbz1.a(jby1, i);
    }

    static boolean a(jbz jbz1)
    {
        return jbz1.g;
    }

    static long b(jbz jbz1)
    {
        return jbz1.f;
    }

    static muz c(jbz jbz1)
    {
        return jbz1.h;
    }

    static jby d(jbz jbz1)
    {
        return jbz1.e;
    }

    public final void V_()
    {
        g = true;
    }

    public final void a(int i)
    {
        if (i == dgw.a)
        {
            return;
        } else
        {
            e = null;
            f = 0L;
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (mtj)olm1.a(mtj);
        h = (muz)olm1.a(muz);
        d = (dgk)olm1.a(dgk);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = (jby)bundle.getParcelable("com.google.android.apps.photos.undoaction.ExtraUndoableAction");
            f = bundle.getLong("com.google.android.apps.photos.undoaction.ExtraLastActionStartTime");
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag2 = false;
        boolean flag = false;
        if (TextUtils.equals(s, "UndoableActionManager-Act"))
        {
            if (mue1 == null)
            {
                a(null, ((Exception) (null)));
            } else
            {
                if (!mue1.c())
                {
                    flag = true;
                }
                s = (jby)mue1.a().getParcelable("com.google.android.apps.photos.undoaction.MediaUndoActionTask.Action");
                if (flag)
                {
                    if (c.c(s, e))
                    {
                        a(((jby) (s)), 5000);
                        f = h.b() + 5000L;
                    } else
                    {
                        f = 0L;
                    }
                    mue1 = b(s);
                    if (mue1 != null)
                    {
                        mue1.a(s);
                        return;
                    }
                } else
                {
                    a(((jby) (s)), mue1.c);
                    return;
                }
            }
        } else
        if (TextUtils.equals(s, "UndoableActionManager-Undo") && mue1 != null)
        {
            boolean flag1 = flag2;
            if (!mue1.c())
            {
                flag1 = true;
            }
            s = (jby)mue1.a().getParcelable("com.google.android.apps.photos.undoaction.MediaUndoActionTask.Action");
            if (flag1)
            {
                mue1 = b(s);
                if (mue1 != null)
                {
                    mue1.c(s);
                    return;
                }
            }
        }
    }

    public final void a(jby jby1)
    {
        e = jby1;
        jby1 = new jbv("UndoableActionManager-Act", jby1, false);
        a.a(jby1);
    }

    public final void a(jcc jcc1)
    {
        c.put(jcc1.a(), jcc1);
    }

    public final void al_()
    {
        a.a(this);
        if (e != null)
        {
            b.a(new jca(this));
        }
    }

    public final void am_()
    {
        a.b(this);
    }

    jcc b(jby jby1)
    {
        return (jcc)c.get(jby1.a());
    }

    public final void b(jcc jcc1)
    {
        c.remove(jcc1.a());
    }

    public final void e(Bundle bundle)
    {
        if (e != null)
        {
            bundle.putParcelable("com.google.android.apps.photos.undoaction.ExtraUndoableAction", e);
            bundle.putLong("com.google.android.apps.photos.undoaction.ExtraLastActionStartTime", f);
        }
    }
}
