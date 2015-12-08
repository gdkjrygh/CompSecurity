// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class bfw extends mtf
{

    private final bdo a;

    public bfw(bdo bdo1)
    {
        super("DisposeRendererTask");
        a = bdo1;
    }

    public final mue a(Context context)
    {
        context = a;
        ((bdo) (context)).b.cancelComputeEditingData();
        ((bdo) (context)).c.cancelComputeEditingData();
        ((bdo) (context)).d.writeLock().lock();
        ((bdo) (context)).b.dispose();
        ((bdo) (context)).c.dispose();
        context.u = true;
        ((bdo) (context)).d.writeLock().unlock();
        return new mue(true);
        Exception exception;
        exception;
        ((bdo) (context)).d.writeLock().unlock();
        throw exception;
    }
}
