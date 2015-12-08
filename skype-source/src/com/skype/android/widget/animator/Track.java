// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.widget.animator:
//            MotionTween

public class Track
{

    private List a;

    public Track()
    {
        a = new ArrayList();
    }

    public final float a(int i)
    {
        if (a.size() == 0)
        {
            return 0.0F;
        }
        if (i < 0)
        {
            return ((MotionTween)a.get(0)).b();
        }
        int k = 0;
        for (int j = 0; j < a.size(); j++)
        {
            MotionTween motiontween = (MotionTween)a.get(j);
            if (i >= k && i < motiontween.a() + k)
            {
                return motiontween.a(i - k);
            }
            k += motiontween.a();
        }

        i = a.size();
        return ((MotionTween)a.get(i - 1)).c();
    }

    public final int a()
    {
        int i = 0;
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            i += ((MotionTween)iterator.next()).a();
        }

        return i;
    }

    public final void a(MotionTween motiontween)
    {
        a.add(motiontween);
    }
}
