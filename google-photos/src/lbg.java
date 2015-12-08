// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

final class lbg extends lic
{

    private UploadRequest g;

    lbg(lbd lbd, jyn jyn, UploadRequest uploadrequest)
    {
        g = uploadrequest;
        super(jyn);
    }

    public final jyw a(Status status)
    {
        return new lbi(status, -1L);
    }

    protected final void a(jyl jyl)
    {
        jyl = ((lbc)jyl).a(g);
        ((UploadRequestResult) (jyl)).b;
        JVM INSTR lookupswitch 5: default 68
    //                   0: 95
    //                   2: 100
    //                   3: 107
    //                   4: 114
    //                   100: 121;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        char c = '\b';
_L8:
        a(((jyw) (new lbi(new Status(c), ((UploadRequestResult) (jyl)).c))));
        return;
_L2:
        c = '\0';
        continue; /* Loop/switch isn't completed */
_L3:
        c = '\u0DB1';
        continue; /* Loop/switch isn't completed */
_L4:
        c = '\u0DB0';
        continue; /* Loop/switch isn't completed */
_L5:
        c = '\u0DAC';
        continue; /* Loop/switch isn't completed */
_L6:
        c = '\u0DB2';
        if (true) goto _L8; else goto _L7
_L7:
    }
}
