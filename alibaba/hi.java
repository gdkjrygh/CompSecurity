// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.io.IOException;

public interface hi
{

    public abstract Bitmap a(String s, int i, int j, float f)
        throws IOException;

    public abstract void a(Bitmap bitmap, boolean flag, String s);

    public abstract void a(String s);

    public abstract void a(String s, int i);

    public abstract void b(String s);

    public abstract String c(String s);

    public abstract lt.a getArea();

    public abstract int getMaxRequiredHeight();

    public abstract int getMaxRequiredWidth();

    public abstract int getPictureType();

    public abstract String getUrl();
}
