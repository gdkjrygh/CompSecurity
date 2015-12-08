// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public final class fhk extends mtf
{

    private final int a;
    private final String b;

    public fhk(int i, String s)
    {
        super("com.google.android.apps.photos.envelope.asyncClearEnvelopeRecipientsTask");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        context = (est)olm.a(context, est);
        int i = a;
        String s = b;
        p.a(s, "Cannot have empty envelopeKey");
        int j = mvj.a(((est) (context)).b, i).delete("envelope_members", "envelope_media_key = ?", new String[] {
            s
        });
        context.a(i, s, "removeAllRecipientsInEnvelope");
        context = new mue(true);
        context.a().putInt("num_removed", j);
        return context;
    }
}
