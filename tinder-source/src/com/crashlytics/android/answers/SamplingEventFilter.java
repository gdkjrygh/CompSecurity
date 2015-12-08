// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.answers:
//            EventFilter, SessionEvent, SessionEventMetadata

class SamplingEventFilter
    implements EventFilter
{

    static final Set b = new HashSet() {

            
            {
                add(SessionEvent.Type.a);
                add(SessionEvent.Type.b);
                add(SessionEvent.Type.c);
                add(SessionEvent.Type.d);
                add(SessionEvent.Type.e);
                add(SessionEvent.Type.f);
                add(SessionEvent.Type.g);
                add(SessionEvent.Type.h);
            }
    };
    final int a;

    public SamplingEventFilter(int i)
    {
        a = i;
    }

    public final boolean a(SessionEvent sessionevent)
    {
        boolean flag;
        boolean flag1;
        if (b.contains(sessionevent.c) && sessionevent.a.g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(sessionevent.a.c.hashCode() % a) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

}
