// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;


class val.duration
    implements Runnable
{

    final val.duration this$1;
    final int val$duration;
    final int val$position;
    final int val$postOffset;

    public void run()
    {
        artWithOffset(val$position, val$postOffset, val$duration);
    }

    _cls9()
    {
        this$1 = final__pcls9;
        val$position = i;
        val$postOffset = j;
        val$duration = I.this;
        super();
    }
}
