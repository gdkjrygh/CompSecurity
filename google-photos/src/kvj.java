// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

final class kvj
    implements android.content.DialogInterface.OnClickListener
{

    private kvi a;

    kvj(kvi kvi1)
    {
        a = kvi1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a;
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", ((kvi) (dialoginterface)).b);
        intent.putExtra("eventLocation", ((kvi) (dialoginterface)).f);
        intent.putExtra("description", ((kvi) (dialoginterface)).e);
        if (((kvi) (dialoginterface)).c > -1L)
        {
            intent.putExtra("beginTime", ((kvi) (dialoginterface)).c);
        }
        if (((kvi) (dialoginterface)).d > -1L)
        {
            intent.putExtra("endTime", ((kvi) (dialoginterface)).d);
        }
        intent.setFlags(0x10000000);
        a.a.startActivity(intent);
    }
}
