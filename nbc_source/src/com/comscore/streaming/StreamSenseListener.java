// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            State

public interface StreamSenseListener
{

    public abstract void onStateChange(State state, State state1, HashMap hashmap, long l);
}
