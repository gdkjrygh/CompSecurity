// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;

final class ibs
    implements oaa
{

    private ibq a;

    ibs(ibq ibq1)
    {
        a = ibq1;
        super();
    }

    public final boolean a(nzw nzw1, Object obj)
    {
        obj = (String)obj;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            nzw1.a_(RingtoneManager.getRingtone(ibq.h(a), Uri.parse(((String) (obj)))).getTitle(ibq.i(a)));
            nzw1.a(obj);
            ibq.b(a).a(ibq.a(a), ((String) (obj)));
        } else
        {
            nzw1.c(p.bu);
            nzw1.a(null);
            ibq.b(a).a(ibq.a(a), "no_ringtone");
        }
        return true;
    }
}
