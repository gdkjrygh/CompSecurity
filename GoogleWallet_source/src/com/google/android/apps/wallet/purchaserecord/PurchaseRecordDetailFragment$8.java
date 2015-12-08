// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.userevents.UserEventLogger;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailFragment, PurchaseRecord

final class this._cls0
    implements OnActionListener
{

    final PurchaseRecordDetailFragment this$0;

    private void onAction(String s)
    {
        Uri uri = Uri.parse(s);
        android.content.Intent intent = UriIntents.create(getActivity(), uri);
        if (getActivity().getPackageManager().resolveActivity(intent, 0x10000) != null)
        {
            startActivity(intent);
        } else
        if ("comgooglewallet".equals(uri.getScheme()) && PurchaseRecordDetailFragment.access$400(uri))
        {
            if (PurchaseRecordDetailFragment.access$200(PurchaseRecordDetailFragment.this) != null)
            {
                if (PurchaseRecordDetailFragment.access$000(PurchaseRecordDetailFragment.this) != null && PurchaseRecordDetailFragment.access$000(PurchaseRecordDetailFragment.this).getId() != null)
                {
                    PurchaseRecordDetailFragment.access$300(PurchaseRecordDetailFragment.this);
                }
                PurchaseRecordDetailFragment.access$200(PurchaseRecordDetailFragment.this).onReturnMoneyClicked(PurchaseRecordDetailFragment.access$000(PurchaseRecordDetailFragment.this));
                return;
            }
        } else
        {
            WLog.efmt(PurchaseRecordDetailFragment.access$500(), "No Activity available to handle URI: %s", new Object[] {
                s
            });
            com.google.wallet.proto.extExtraInfo extextrainfo = new com.google.wallet.proto.extExtraInfo();
            com.google.wallet.proto.dContextExtraInfo dcontextextrainfo = new com.google.wallet.proto.dContextExtraInfo();
            dcontextextrainfo.invalidUri = s;
            extextrainfo.purchaseRecordExtraInfo = dcontextextrainfo;
            userEventLogger.log(23, 100, extextrainfo);
            return;
        }
    }

    public final volatile void onAction(Object obj)
    {
        onAction((String)obj);
    }

    ActionListener()
    {
        this$0 = PurchaseRecordDetailFragment.this;
        super();
    }
}
