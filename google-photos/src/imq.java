// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class imq extends al
{

    public imq()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(q.ax).setTitle(q.ay).setPositiveButton(q.aS, new ims(this)).setNegativeButton(q.aU, new imr(this));
        return bundle.create();
    }
}
