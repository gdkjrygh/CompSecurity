// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.reference.NetflixPartner;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.partner:
//            PartnerRequestType, Partner, PartnerCommunicationHandler

public class PartnerFactory
{

    private static final String TAG = "nf_partner";
    private Map partnerHandlers;

    public PartnerFactory()
    {
        partnerHandlers = new Hashtable();
    }

    public String[] getExternalSignUpServices(Context context)
    {
        if (context != null && context.getPackageManager() != null) goto _L2; else goto _L1
_L1:
        context = new String[0];
_L4:
        return context;
_L2:
label0:
        {
            Intent intent = new Intent(PartnerRequestType.getExternalSignUpService.getIntentName());
            List list = context.getPackageManager().queryIntentActivities(intent, 0);
            if (list == null || list.size() <= 0)
            {
                break label0;
            }
            String as[] = new String[list.size()];
            int i = 0;
            do
            {
                context = as;
                if (i >= as.length)
                {
                    break;
                }
                as[i] = ((ResolveInfo)list.get(i)).activityInfo.name;
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return new String[0];
    }

    public String[] getExternalSsoServices(Context context)
    {
        if (context != null && context.getPackageManager() != null) goto _L2; else goto _L1
_L1:
        context = new String[0];
_L4:
        return context;
_L2:
label0:
        {
            Intent intent = new Intent(PartnerRequestType.getExternalSsoService.getIntentName());
            List list = context.getPackageManager().queryIntentActivities(intent, 0);
            if (list == null || list.size() <= 0)
            {
                break label0;
            }
            String as[] = new String[list.size()];
            int i = 0;
            do
            {
                context = as;
                if (i >= as.length)
                {
                    break;
                }
                as[i] = ((ResolveInfo)list.get(i)).activityInfo.name;
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return new String[0];
    }

    public Partner getPartner(Context context, String s, PartnerCommunicationHandler partnercommunicationhandler)
    {
        this;
        JVM INSTR monitorenter ;
        Partner partner;
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("getPartner:: partner ").append(s).toString());
        }
        partner = (Partner)partnerHandlers.get(s);
        if (partner == null) goto _L2; else goto _L1
_L1:
        Log.d("nf_partner", "Partner implementation found!");
        context = partner;
_L3:
        this;
        JVM INSTR monitorexit ;
        return context;
_L2:
        Log.d("nf_partner", "Partner implementation lookup...");
        context = getExternalSsoServices(context);
        int i = 0;
_L4:
        if (i >= context.length)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (context[i] == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        if (!context[i].equals(s))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Log.d("nf_partner", "Partner implementation created!");
        context = new NetflixPartner(s, partnercommunicationhandler);
        partnerHandlers.put(s, context);
          goto _L3
        Log.e("nf_partner", "Partner implementation NOT found!");
        context = null;
          goto _L3
        context;
        throw context;
        i++;
          goto _L4
    }

    public void releasePartners()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = partnerHandlers.values().iterator(); iterator.hasNext(); ((Partner)iterator.next()).release()) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        throw exception;
        partnerHandlers.clear();
        this;
        JVM INSTR monitorexit ;
    }
}
