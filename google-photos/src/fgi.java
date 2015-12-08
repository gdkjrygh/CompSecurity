// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.edittext.EditTextHolder;

final class fgi
    implements fgk
{

    private String a;

    fgi(fgf fgf, String s)
    {
        a = s;
        super();
    }

    public final void a(EditTextHolder edittextholder)
    {
        if (edittextholder == null)
        {
            return;
        } else
        {
            edittextholder.a(a);
            edittextholder.b(a);
            return;
        }
    }
}
