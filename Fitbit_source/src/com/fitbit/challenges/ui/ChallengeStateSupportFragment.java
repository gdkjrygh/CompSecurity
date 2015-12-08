// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.ui.s;
import com.fitbit.util.RetryDialogFragment;
import com.fitbit.util.ad;

public abstract class ChallengeStateSupportFragment extends Fragment
{

    private static final String a = "RETRY_DIALOG";
    private boolean b;
    private boolean c;
    private boolean d;
    private CharSequence e;
    protected TextView t;
    protected View u;
    protected View v;
    protected View w;

    public ChallengeStateSupportFragment()
    {
        b = false;
        c = false;
        d = false;
    }

    private void a()
    {
    /* block-local class not found */
    class State {}

        if (c && !d)
        {
            a(State.b);
            return;
        }
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[c().ordinal()])
        {
        default:
            throw new IllegalArgumentException("Unsupported data state");

        case 1: // '\001'
            if (c)
            {
                State state;
                if (d)
                {
                    state = State.c;
                } else
                {
                    state = State.b;
                }
                a(state);
                return;
            } else
            {
                a(State.a);
                return;
            }

        case 2: // '\002'
            State state1;
            if (b)
            {
                state1 = State.d;
            } else
            {
                state1 = State.c;
            }
            a(state1);
            return;

        case 3: // '\003'
            break;
        }
        State state2;
        if (b)
        {
            state2 = State.d;
        } else
        {
            state2 = State.e;
        }
        a(state2);
    }

    private void a(State state)
    {
        boolean flag = false;
        int i;
        if (u != null)
        {
            Object obj = u;
            if (state == State.b)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((View) (obj)).setVisibility(i);
        }
        if (t != null)
        {
            obj = t;
            if (state == State.c)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((TextView) (obj)).setVisibility(i);
            t.setText(e);
        }
        if (v != null)
        {
            obj = v;
            if (state == State.d)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((View) (obj)).setVisibility(i);
        }
        if (w != null)
        {
            obj = w;
            if (state == State.e)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 4;
            }
            ((View) (obj)).setVisibility(i);
        }
    }

    private void a(ServerCommunicationException servercommunicationexception, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a(getString(servercommunicationexception.a()), onclicklistener);
    }

    private void a(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        s1 = s.a(getActivity(), s1, 1);
        s1.a(onclicklistener);
        s1.i();
    }

    protected void a(ServerCommunicationException servercommunicationexception, com.fitbit.util.SimpleConfirmDialogFragment.a a1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a == servercommunicationexception.f())
        {
            s.a(getActivity(), servercommunicationexception.getMessage(), 1).a(onclicklistener).i();
            return;
        } else
        {
            servercommunicationexception = RetryDialogFragment.a(a1, 0x7f08048f, servercommunicationexception.a());
            ad.a(getFragmentManager(), "RETRY_DIALOG", servercommunicationexception);
            return;
        }
    }

    protected void a(ServerCommunicationException servercommunicationexception, boolean flag)
    {
        a(servercommunicationexception, flag, null);
    }

    protected void a(ServerCommunicationException servercommunicationexception, boolean flag, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (servercommunicationexception == null)
        {
            return;
        }
        if (com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a == servercommunicationexception.f())
        {
            a(servercommunicationexception.getMessage(), ((android.content.DialogInterface.OnClickListener) (null)));
            return;
        }
        if (servercommunicationexception instanceof NetworkTimeoutException)
        {
            if (flag)
            {
                c(false);
                return;
            } else
            {
                a(servercommunicationexception, ((android.content.DialogInterface.OnClickListener) (null)));
                return;
            }
        }
        if (servercommunicationexception instanceof IncorrectTimestampException)
        {
            if (flag)
            {
                c(false);
            }
            a(servercommunicationexception, ((android.content.DialogInterface.OnClickListener) (null)));
            return;
        } else
        {
            a(servercommunicationexception, onclicklistener);
            return;
        }
    }

    protected boolean a(Exception exception)
    {
        return exception != null && ((exception instanceof NetworkTimeoutException) || (exception instanceof IncorrectTimestampException));
    }

    protected void b(ServerCommunicationException servercommunicationexception)
    {
        a(servercommunicationexception, true);
    }

    protected void b(boolean flag)
    {
        b = flag;
        a();
    }

    protected abstract com.fitbit.savedstate.LoadSavedState.Status c();

    protected void c(boolean flag)
    {
        c = flag;
        a();
    }

    protected void d(boolean flag)
    {
        d = flag;
        a();
    }

    protected void j()
    {
        Object obj;
        if (t != null)
        {
            obj = t.getText();
        } else
        {
            obj = "";
        }
        e = ((CharSequence) (obj));
    }

    protected boolean k()
    {
        return c;
    }
}
