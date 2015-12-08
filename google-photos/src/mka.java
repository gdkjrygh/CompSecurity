// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class mka extends AnimatorListenerAdapter
{

    private jz a;

    public mka()
    {
        a = new jz();
    }

    public final boolean a(Animator animator)
    {
        return a.containsKey(animator) && ((Boolean)a.get(animator)).booleanValue();
    }

    public void onAnimationCancel(Animator animator)
    {
        a.put(animator, Boolean.valueOf(true));
    }

    public void onAnimationStart(Animator animator)
    {
        a.put(animator, Boolean.valueOf(false));
    }
}
