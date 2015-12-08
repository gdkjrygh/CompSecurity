// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            MediaEntity

public static interface 
    extends Serializable
{

    public static final int CROP = 101;
    public static final int FIT = 100;
    public static final Integer LARGE = Integer.valueOf(3);
    public static final Integer MEDIUM = Integer.valueOf(2);
    public static final Integer SMALL = Integer.valueOf(1);
    public static final Integer THUMB = Integer.valueOf(0);

    public abstract int getHeight();

    public abstract int getResize();

    public abstract int getWidth();

}
