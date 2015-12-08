// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import android.content.Context;
import android.view.View;
import com.skype.Conversation;
import com.skype.Participant;
import com.skype.Video;
import java.util.Set;

interface a
{

    public abstract View a(Context context);

    public abstract Participant a();

    public abstract void a(Conversation conversation);

    public abstract void a(Video video);

    public abstract Set b();

    public abstract void c();

    public abstract void d();

    public abstract int e();

    public abstract int f();

    public abstract long g();

    public abstract boolean h();

    public abstract void i();
}
