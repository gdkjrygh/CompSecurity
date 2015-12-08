// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class chc extends omn
{

    public chc()
    {
        b(false);
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(c.bW).setMessage(c.bV).setPositiveButton(c.bX, new chd(this)).create();
    }
}
