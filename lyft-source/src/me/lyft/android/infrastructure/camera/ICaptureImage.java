// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.camera;

import com.lyft.scoop.Screen;
import java.io.File;
import rx.Observable;

public interface ICaptureImage
{

    public abstract void capturePhoto(Screen screen, Screen screen1, Screen screen2, File file);

    public abstract void capturePhoto(Screen screen, Screen screen1, File file);

    public abstract Observable observeCaptureResult();
}
