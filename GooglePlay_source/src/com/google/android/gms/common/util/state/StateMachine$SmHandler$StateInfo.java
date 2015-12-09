// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.state;


// Referenced classes of package com.google.android.gms.common.util.state:
//            StateMachine, State

private final class <init>
{

    boolean active;
    state parentStateInfo;
    State state;
    final state this$0;

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("state=")).append(state.getName()).append(",active=").append(active).append(",parent=");
        String s;
        if (parentStateInfo == null)
        {
            s = "null";
        } else
        {
            s = parentStateInfo.state.getName();
        }
        return stringbuilder.append(s).toString();
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
