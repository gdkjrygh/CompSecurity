// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.EditText;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.utils.AddressType;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation

class this._cls0
    implements android.view.er
{

    final UserAddLocation this$0;

    public void onClick(View view)
    {
        if (UserAddLocation.access$1200(UserAddLocation.this))
        {
            if (StringHelper.equalsIgnoreCase(UserAddLocation.access$200(UserAddLocation.this), AddressType.TYPE_CAMPUS_BASE.getId()))
            {
                UserAddLocation.access$1302(UserAddLocation.this, UserAddLocation.access$1400(UserAddLocation.this));
            } else
            {
                UserAddLocation.access$1302(UserAddLocation.this, new LabsAddress());
                UserAddLocation.access$1300(UserAddLocation.this).setAddressType(UserAddLocation.access$200(UserAddLocation.this).trim());
                UserAddLocation.access$1300(UserAddLocation.this).setCity(UserAddLocation.access$1500(UserAddLocation.this).getText().toString().trim());
                UserAddLocation.access$1300(UserAddLocation.this).setName(UserAddLocation.access$600(UserAddLocation.this).getText().toString().trim());
                UserAddLocation.access$1300(UserAddLocation.this).setStreet(UserAddLocation.access$1600(UserAddLocation.this).getText().toString().trim());
                UserAddLocation.access$1300(UserAddLocation.this).setRegion(UserAddLocation.access$1100(UserAddLocation.this));
                UserAddLocation.access$1300(UserAddLocation.this).setPostalCode(UserAddLocation.access$1000(UserAddLocation.this).getText().toString().trim());
                LabsAddress labsaddress;
                if (UserAddLocation.access$1700(UserAddLocation.this).getVisibility() == 0)
                {
                    view = UserAddLocation.access$1700(UserAddLocation.this).getText().toString().trim().replace("#", " ");
                } else
                {
                    view = "";
                }
                UserAddLocation.access$1300(UserAddLocation.this).setUnitNumber(view);
                UserAddLocation.access$1300(UserAddLocation.this).setLine2(view);
                labsaddress = UserAddLocation.access$1300(UserAddLocation.this);
                if (UserAddLocation.access$1800(UserAddLocation.this).getVisibility() == 0)
                {
                    view = UserAddLocation.access$1800(UserAddLocation.this).getText().toString().trim();
                } else
                {
                    view = "";
                }
                labsaddress.setOrganizationName(view);
                UserAddLocation.access$1300(UserAddLocation.this).setDeliveryInstructions(UserAddLocation.access$1900(UserAddLocation.this).getText().toString());
            }
            checkDeliveryAddressStoreStatus(UserAddLocation.access$1300(UserAddLocation.this));
        }
    }

    ddress()
    {
        this$0 = UserAddLocation.this;
        super();
    }
}
