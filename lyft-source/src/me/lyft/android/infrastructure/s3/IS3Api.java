// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.s3;

import java.io.File;
import rx.Observable;

public interface IS3Api
{

    public abstract Observable getConfigs();

    public abstract Observable uploadFile(String s, File file);
}
