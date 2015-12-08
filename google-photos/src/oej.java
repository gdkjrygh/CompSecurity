// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

final class oej
    implements oei
{

    private Map a;

    oej()
    {
        a = new HashMap();
        a.put(msm, new ofi(this));
        a.put(ogg, new oel(this));
        a.put(ogf, new oek(this));
        a.put(ogh, new oem(this));
        a.put(ogi, new oen(this));
        a.put(ogj, new oeo(this));
        a.put(ogk, new oep(this));
        a.put(ogl, new oeq(this));
        a.put(ogm, new oer(this));
        a.put(ogn, new oes(this));
        a.put(ogp, new oeu(this));
        a.put(ogr, new oev(this));
        a.put(ogs, new oew(this));
        a.put(ogu, new oey(this));
        a.put(ogv, new oez(this));
        a.put(ogx, new ofa(this));
        a.put(ogy, new ofb(this));
        a.put(ogz, new ofc(this));
        a.put(oha, new ofd(this));
        a.put(ohb, new ofe(this));
        a.put(ohc, new off(this));
        a.put(ohd, new ofg(this));
        a.put(ogt, new oex(this));
        a.put(ogo, new oet(this));
    }

    public final void a(msm msm1, qzv qzv, qyw qyw)
    {
        msm msm2 = msm1;
        if (msm1 instanceof ogq)
        {
            msm2 = ((ogq)msm1).a();
        }
        msm1 = (oei)a.get(msm2.getClass());
        if (msm1 != null)
        {
            msm1.a(msm2, qzv, qyw);
            return;
        } else
        {
            msm1 = String.valueOf(msm2);
            throw new IllegalStateException((new StringBuilder(String.valueOf(msm1).length() + 31)).append("No visual element handler for: ").append(msm1).toString());
        }
    }
}
