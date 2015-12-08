// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ag, ah

public final class af extends DialogFragment
{

    public af()
    {
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        b.a("AddTextViewOOMDialogFragment/onCreateDialog");
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f0702e7);
        bundle.setMessage(0x7f070192);
        bundle.setPositiveButton(0x7f07024f, new ag(this));
        bundle.setOnCancelListener(new ah(this));
        return bundle.create();
    }
}
