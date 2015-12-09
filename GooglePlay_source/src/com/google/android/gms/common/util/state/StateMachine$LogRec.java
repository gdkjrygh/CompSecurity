// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.state;

import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;

// Referenced classes of package com.google.android.gms.common.util.state:
//            StateMachine, IState

public static final class update
{

    private IState mDstState;
    private String mInfo;
    private IState mOrgState;
    private StateMachine mSm;
    private IState mState;
    private long mTime;
    private int mWhat;

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("time=");
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTimeInMillis(mTime);
        stringbuilder.append(String.format("%tm-%td %tH:%tM:%tS.%tL", new Object[] {
            obj, obj, obj, obj, obj, obj
        }));
        stringbuilder.append(" processed=");
        if (mState == null)
        {
            obj = "<null>";
        } else
        {
            obj = mState.getName();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" org=");
        if (mOrgState == null)
        {
            obj = "<null>";
        } else
        {
            obj = mOrgState.getName();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" dest=");
        if (mDstState == null)
        {
            obj = "<null>";
        } else
        {
            obj = mDstState.getName();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(" what=");
        if (mSm != null)
        {
            obj = mSm.getWhatToString(mWhat);
        } else
        {
            obj = "";
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            stringbuilder.append(mWhat);
            stringbuilder.append("(0x");
            stringbuilder.append(Integer.toHexString(mWhat));
            stringbuilder.append(")");
        } else
        {
            stringbuilder.append(((String) (obj)));
        }
        if (!TextUtils.isEmpty(mInfo))
        {
            stringbuilder.append(" ");
            stringbuilder.append(mInfo);
        }
        return stringbuilder.toString();
    }

    public final void update(StateMachine statemachine, Message message, String s, IState istate, IState istate1, IState istate2)
    {
        mSm = statemachine;
        mTime = System.currentTimeMillis();
        int i;
        if (message != null)
        {
            i = message.what;
        } else
        {
            i = 0;
        }
        mWhat = i;
        mInfo = s;
        mState = istate;
        mOrgState = istate1;
        mDstState = istate2;
    }

    (StateMachine statemachine, Message message, String s, IState istate, IState istate1, IState istate2)
    {
        update(statemachine, message, s, istate, istate1, istate2);
    }
}
