// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import java.util.TreeSet;

// Referenced classes of package com.facebook.internal:
//            NativeProtocol, Utility

abstract class <init>
{

    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    private static final String FBL_HASH = "5e8f16062ea3cd2c4a0d547876baa6f38cabf625";
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    private static final HashSet validAppSignatureHashes = buildAppSignatureHashes();
    private TreeSet availableVersions;

    private static HashSet buildAppSignatureHashes()
    {
        HashSet hashset = new HashSet();
        hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        return hashset;
    }

    private void fetchAvailableVersions(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        if (availableVersions != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        availableVersions = NativeProtocol.access$000(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public TreeSet getAvailableVersions()
    {
        if (availableVersions == null)
        {
            fetchAvailableVersions(false);
        }
        return availableVersions;
    }

    protected abstract String getPackage();

    public boolean validateSignature(Context context, String s)
    {
        String s1;
        int i;
        s1 = Build.BRAND;
        i = context.getApplicationInfo().flags;
        if (!s1.startsWith("generic") || (i & 2) == 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j;
        int k;
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        context = ((PackageInfo) (context)).signatures;
        k = context.length;
        j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                s = Utility.sha1hash(context[j].toByteArray());
                if (validAppSignatureHashes.contains(s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }



    private tion()
    {
    }

    tion(tion tion)
    {
        this();
    }
}
