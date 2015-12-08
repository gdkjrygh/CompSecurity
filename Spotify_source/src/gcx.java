// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Filter;

public abstract class gcx extends Filter
{

    public am a;
    public int b;
    public an c;
    public Bundle d;

    public gcx(am am1, an an)
    {
        d = new Bundle();
        a = am1;
        b = 0x7f1100a6;
        c = an;
    }

    public abstract CharSequence a(Cursor cursor);

    public CharSequence convertResultToString(Object obj)
    {
        return a((Cursor)obj);
    }

    protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
    {
        if (charsequence != null)
        {
            d.putString("filter", charsequence.toString());
        }
        a.b(b, d, c);
        return null;
    }

    protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
    {
    }
}
