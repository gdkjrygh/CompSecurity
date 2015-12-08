// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import com.spotify.android.paste.widget.SectionHeaderView;

public class ftr
    implements ftq
{

    private final Context a;
    private final SparseArray b = new SparseArray();

    public ftr(Context context)
    {
        a = context;
    }

    public SectionHeaderView a(int i)
    {
        return new SectionHeaderView(a);
    }

    public void a(int i, SectionHeaderView sectionheaderview, String s, String s1)
    {
        sectionheaderview.a();
        sectionheaderview.a(s, s1);
        b.get(i, null);
    }
}
