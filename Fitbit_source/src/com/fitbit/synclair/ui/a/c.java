// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.a;

import com.fitbit.savedstate.h;
import com.fitbit.synclair.SynclairError;
import com.fitbit.synclair.a;
import com.fitbit.synclair.operation.info.SynclairOperationInfo;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.states.SynclairScreenState;

// Referenced classes of package com.fitbit.synclair.ui.a:
//            a

public abstract class c extends com.fitbit.synclair.ui.a.a
{

    public c()
    {
    }

    public boolean h()
    {
        return ((a)g()).a(false);
    }

    public boolean i()
    {
        return ((a)g()).d();
    }

    protected boolean k(SynclairActivity synclairactivity)
    {
        a a1 = (a)g();
        SynclairOperationInfo synclairoperationinfo = a1.C();
    /* anonymous class not found */
    class _anm1 {}

        if (synclairoperationinfo.h())
        {
            switch (_cls1.c[synclairoperationinfo.a().ordinal()])
            {
            default:
                return false;

            case 1: // '\001'
                switch (com.fitbit.synclair.ui.a._cls1.a[synclairoperationinfo.c().ordinal()])
                {
                default:
                    return false;

                case 1: // '\001'
                    if (!SynclairScreenState.q.equals(f().u()))
                    {
                        f().a(SynclairScreenState.q);
                        return true;
                    }
                    break;

                case 2: // '\002'
                    if (a1.a() || com.fitbit.savedstate.h.h())
                    {
                        if (!SynclairScreenState.r.equals(f().u()))
                        {
                            f().a(SynclairScreenState.r);
                            return true;
                        }
                    } else
                    if (SynclairScreenState.q.equals(f().u()))
                    {
                        l(synclairactivity);
                        f().a(SynclairScreenState.g);
                        return true;
                    }
                    break;

                case 3: // '\003'
                    l(synclairactivity);
                    synclairactivity.s(a1.a(true));
                    return true;

                case 4: // '\004'
                    if (SynclairScreenState.q.equals(f().u()))
                    {
                        synclairactivity.s(a1.c());
                        return true;
                    } else
                    {
                        synclairactivity.s(a1.e());
                        return true;
                    }
                }
                break;

            case 2: // '\002'
                SynclairError synclairerror = synclairoperationinfo.b();
                if (!synclairactivity.a(synclairerror))
                {
                    synclairactivity.b(synclairerror);
                    switch (com.fitbit.synclair.ui.a._cls1.a[synclairoperationinfo.c().ordinal()])
                    {
                    default:
                        switch (_cls1.b[synclairerror.ordinal()])
                        {
                        default:
                            if (!a(synclairactivity, synclairerror))
                            {
                                synclairactivity.a("Default state of FAILED in Common FW doesn't exists");
                                return true;
                            }
                            break;

                        case 1: // '\001'
                            f().a(SynclairScreenState.u);
                            return true;

                        case 2: // '\002'
                            f().a(SynclairScreenState.t);
                            return true;

                        case 3: // '\003'
                            f().a(SynclairScreenState.u);
                            return true;
                        }
                        break;

                    case 3: // '\003'
                    case 4: // '\004'
                    case 5: // '\005'
                        f().a(SynclairScreenState.s);
                        return true;
                    }
                }
                break;
            }
        } else
        {
            return false;
        }
        return true;
    }

    protected void l(SynclairActivity synclairactivity)
    {
        synclairactivity.q(false);
    }
}
