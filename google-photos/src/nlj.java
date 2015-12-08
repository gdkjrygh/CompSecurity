// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;

public interface nlj
{

    public abstract void a(boolean flag);

    public abstract void a(boolean flag, nlr nlr);

    public abstract boolean a(int i, boolean flag);

    public abstract boolean a(Context context, Cursor cursor, Uri uri);

    public abstract SQLiteTransactionListener f_();
}
