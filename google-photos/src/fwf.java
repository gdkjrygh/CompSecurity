// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class fwf extends al
{

    public fwf()
    {
    }

    public static fwf h(boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("turnOnAutobackup", flag);
        fwf fwf1 = new fwf();
        fwf1.f(bundle);
        return fwf1;
    }

    public final Dialog c(Bundle bundle)
    {
        boolean flag = super.q.getBoolean("turnOnAutobackup");
        int i;
        int j;
        if (flag)
        {
            i = b.qQ;
        } else
        {
            i = b.qO;
        }
        if (flag)
        {
            j = b.qP;
        } else
        {
            j = b.qN;
        }
        return (new android.app.AlertDialog.Builder(O_())).setTitle(i).setMessage(j).setPositiveButton(b.qL, new fwh(this)).setNegativeButton(b.qH, new fwg(this)).create();
    }
}
