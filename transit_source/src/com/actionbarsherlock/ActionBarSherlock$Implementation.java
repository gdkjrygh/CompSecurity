// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock;

import java.lang.annotation.Annotation;

// Referenced classes of package com.actionbarsherlock:
//            ActionBarSherlock

public static interface 
    extends Annotation
{

    public static final int DEFAULT_API = -1;
    public static final int DEFAULT_DPI = -1;

    public abstract int api();

    public abstract int dpi();
}
