// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class lg
    implements android.view.LayoutInflater.Factory
{

    final li a;

    public lg(li li1)
    {
        a = li1;
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        return a.a(null, s, context, attributeset);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("{").append(a).append("}").toString();
    }
}
