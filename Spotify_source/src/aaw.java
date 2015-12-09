// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Observable;
import java.util.ArrayList;

public final class aaw extends Observable
{

    aaw()
    {
    }

    public final void a(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((aax)mObservers.get(k)).a(i, j);
        }

    }

    public final boolean a()
    {
        return !mObservers.isEmpty();
    }

    public final void b()
    {
        for (int i = mObservers.size() - 1; i >= 0; i--)
        {
            ((aax)mObservers.get(i)).a();
        }

    }

    public final void b(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((aax)mObservers.get(k)).b(i, j);
        }

    }

    public final void c(int i, int j)
    {
        for (int k = mObservers.size() - 1; k >= 0; k--)
        {
            ((aax)mObservers.get(k)).c(i, j);
        }

    }
}
