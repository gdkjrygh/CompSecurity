// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.List;

final class lang.Object
    implements lang.Object
{

    private aoi a;
    private ra b;

    public final void a(Tn tn)
    {
        Timber.i("LensesPurchaseController", "LENS-PURCHASE-LOG: onSuccess purchased orders [\n\t%s\n]", new Object[] {
            tn.a()
        });
        Timber.i("LensesPurchaseController", "LENS-PURCHASE-LOG: onSuccess restored orders [\n\t%s\n]", new Object[] {
            tn.b()
        });
        Timber.i("LensesPurchaseController", "LENS-PURCHASE-LOG: onSuccess failed orders [\n\t%s\n]", new Object[] {
            tn.c()
        });
        if (tn.a().contains(a.b) || tn.b().contains(a.b))
        {
            ra.a(b).b();
        }
        ra.a(b, tn);
        ra.b(b, a);
    }

    public final void a(Tn tn, pi pi)
    {
        ra.b(b, a);
        Timber.i("LensesPurchaseController", "LENS-PURCHASE-LOG: UploadLensReceiptTask onFail [\n\tNetworkResult=%s\n\tUploadLensReceiptResponse=%s\n]", new Object[] {
            pi, tn
        });
    }

    >(ra ra1, aoi aoi1)
    {
        b = ra1;
        a = aoi1;
        super();
    }
}
