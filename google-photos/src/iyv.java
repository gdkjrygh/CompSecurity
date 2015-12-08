// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;

public final class iyv
    implements ekr
{

    private final Context a;
    private final erj b;

    public iyv(Context context, erj erj1)
    {
        a = context;
        b = erj1;
    }

    public final ejy a(Class class1)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        throw new UnsupportedOperationException("Not Implemented");
    }

    public final elb a(ekq ekq, ekk ekk)
    {
        throw new UnsupportedOperationException("Not Implemented");
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.trash.data.TrashCore";
    }

    public final void a(ekq ekq, ContentObserver contentobserver)
    {
        ekq = (iza)ekq;
        a.getContentResolver().registerContentObserver(erj.a(((iza) (ekq)).a), false, contentobserver);
    }

    public final void b(ekq ekq, ContentObserver contentobserver)
    {
        a.getContentResolver().unregisterContentObserver(contentobserver);
    }
}
