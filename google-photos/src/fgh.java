// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.photos.edittext.EditTextHolder;

final class fgh
    implements fgk
{

    private Bundle a;

    fgh(fgf fgf, Bundle bundle)
    {
        a = bundle;
        super();
    }

    public final void a(EditTextHolder edittextholder)
    {
        edittextholder.b(a.getString("photos_edittext_edit_text"));
    }
}
