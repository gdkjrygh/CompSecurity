// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.photos.edittext.EditTextHolder;

public final class fzh extends afn
{

    private final EditTextHolder o;

    public fzh(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.ri, viewgroup, false));
        o = (EditTextHolder)a;
    }

    static EditTextHolder a(fzh fzh1)
    {
        return fzh1.o;
    }
}
