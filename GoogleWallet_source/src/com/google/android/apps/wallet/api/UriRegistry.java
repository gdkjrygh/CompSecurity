// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.api:
//            UriIntents

public class UriRegistry
{
    static final class UriInfo
    {

        final String pattern;
        final Uri uri;

        final String toFormat()
        {
            return pattern.replaceAll("\\{[^\\}]*\\}", "%s");
        }

        UriInfo(String s)
        {
            this("comgooglewallet", "", s);
        }

        private UriInfo(String s, String s1, String s2)
        {
            s = String.valueOf((new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s1).length())).append(s).append("://").append(s1).toString());
            s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            pattern = s;
            uri = Uri.parse(pattern);
            UriRegistry.validate(uri);
        }
    }


    private static final ImmutableMap PATTERNS = ImmutableMap.builder().put(Integer.valueOf(1), new UriInfo("/home")).put(Integer.valueOf(2), new UriInfo("/mywallet")).put(Integer.valueOf(3), new UriInfo("/mywallet#hereandnow")).put(Integer.valueOf(4), new UriInfo("/pin/reset")).put(Integer.valueOf(1000), new UriInfo("/objects/instance/{instanceId}/view/entry/{entrypoint}")).put(Integer.valueOf(1001), new UriInfo("/labels/{uiLabelId}/view")).put(Integer.valueOf(1002), new UriInfo("/objects/instance/{instanceId}/remote_action?{query}")).put(Integer.valueOf(1003), new UriInfo("/objects/instance/{instanceId}/fullscreen/image?{query}")).put(Integer.valueOf(2000), new UriInfo("/offers/instance/{instanceId}/view/detail")).put(Integer.valueOf(3000), new UriInfo("/loyalty/discoverable/{programId}/view/detail")).put(Integer.valueOf(3001), new UriInfo("/loyalty/discoverable/{programId}/link")).put(Integer.valueOf(3002), new UriInfo("/loyalty/discoverable/{programId}/join")).put(Integer.valueOf(3003), new UriInfo("/loyalty/instance/{instanceId}/fullEdit")).put(Integer.valueOf(4000), new UriInfo("/fundstransfer/p2p/send")).put(Integer.valueOf(4001), new UriInfo("/fundstransfer/p2p/request")).put(Integer.valueOf(4002), new UriInfo("/fundstransfer/p2p/transaction/{userVisibleTransactionId}/return")).put(Integer.valueOf(4005), new UriInfo("/fundstransfer/p2p/request/{purchaseRecordLookupId}/send")).put(Integer.valueOf(4009), new UriInfo("/fundstransfer/p2p/request/{purchaseRecordLookupId}/settle")).put(Integer.valueOf(4010), new UriInfo("/fundstransfer/p2p/request/{id}/view")).put(Integer.valueOf(4008), new UriInfo("/fundstransfer/p2p/request/{purchaseRecordLookupId}/decline")).put(Integer.valueOf(4004), new UriInfo("/fundstransfer/p2p/acceptAll")).put(Integer.valueOf(4006), new UriInfo("/fundstransfer/p2p/request/incoming/list")).put(Integer.valueOf(4007), new UriInfo("/fundstransfer/p2p/request/outgoing/list")).put(Integer.valueOf(5000), new UriInfo("/fundstransfer/storedvalue/add")).put(Integer.valueOf(5001), new UriInfo("/fundstransfer/storedvalue/withdraw")).put(Integer.valueOf(5009), new UriInfo("/fundstransfer/storedvalue/recurringtopup/create")).put(Integer.valueOf(5005), new UriInfo("/fundstransfer/storedvalue/recurringtopup/view")).put(Integer.valueOf(5006), new UriInfo("/fundstransfer/storedvalue/recurringtopup/cancel")).put(Integer.valueOf(5007), new UriInfo("/fundstransfer/storedvalue/recurringtopup/error")).put(Integer.valueOf(5003), new UriInfo("/walletbalance")).put(Integer.valueOf(5004), new UriInfo("/walletbalance/statements")).put(Integer.valueOf(6000), new UriInfo("/card/request")).put(Integer.valueOf(6001), new UriInfo("/card/activate")).put(Integer.valueOf(6002), new UriInfo("/card/tutorial")).put(Integer.valueOf(6003), new UriInfo("/card/details")).put(Integer.valueOf(7000), new UriInfo("/help/purchasing")).put(Integer.valueOf(7001), new UriInfo("/help")).put(Integer.valueOf(8000), new UriInfo("/transactions")).put(Integer.valueOf(8001), new UriInfo("/transaction/{userVisibleTransactionId}/view")).put(Integer.valueOf(13000), new UriInfo("/transaction/geomerchant/{purchaseRecordLookupId}/{merchantGeoDocId}/{rawMerchantName}/feedback")).put(Integer.valueOf(9000), new UriInfo("/formsofpayment")).put(Integer.valueOf(10000), new UriInfo("/settings")).put(Integer.valueOf(5), new UriInfo("/oneview")).put(Integer.valueOf(4011), new UriInfo("/fundstransfer/p2p/transaction/byId/{id}/return")).put(Integer.valueOf(4013), new UriInfo("/fundstransfer/p2p/request/byId/{id}/send")).put(Integer.valueOf(4014), new UriInfo("/fundstransfer/p2p/request/byId/{id}/decline")).put(Integer.valueOf(4015), new UriInfo("/fundstransfer/p2p/request/byId/{id}/settle")).put(Integer.valueOf(4016), new UriInfo("/fundstransfer/p2p/request/byId/{id}/view")).put(Integer.valueOf(8002), new UriInfo("/transaction/byId/{id}/view")).build();
    protected final Application application;
    protected final PackageManager packageManager;
    private ImmutableSet supportedUris;

    public UriRegistry(PackageManager packagemanager, Application application1)
    {
        packageManager = packagemanager;
        application = application1;
    }

    private static int getNewPattern(int i)
    {
        int j;
        if (i == 4002)
        {
            j = 4011;
        } else
        {
            if (i == 4005)
            {
                return 4013;
            }
            if (i == 4008)
            {
                return 4014;
            }
            if (i == 4009)
            {
                return 4015;
            }
            if (i == 4010)
            {
                return 4016;
            }
            j = i;
            if (i == 8001)
            {
                return 8002;
            }
        }
        return j;
    }

    public static transient Uri getUri(int i, Object aobj[])
    {
        i = getNewPattern(i);
        return Uri.parse(String.format(((UriInfo)PATTERNS.get(Integer.valueOf(i))).toFormat(), aobj));
    }

    public static boolean isLocalScheme(String s)
    {
        return "comgooglewallet".equals(s);
    }

    public static String[] parseVariables(int i, Uri uri)
    {
        Preconditions.checkArgument("comgooglewallet".equals(uri.getScheme()), "Not a Wallet URI: %s", new Object[] {
            uri
        });
        Preconditions.checkArgument("".equals(uri.getHost()), "Not a Wallet URI: %s", new Object[] {
            uri
        });
        i = getNewPattern(i);
        return parseVariables(((UriInfo)PATTERNS.get(Integer.valueOf(i))).uri, uri);
    }

    public static String[] parseVariables(Uri uri, Uri uri1)
    {
label0:
        {
            Object obj = uri.getPathSegments();
            uri1 = uri1.getPathSegments();
            if (((List) (obj)).size() == uri1.size())
            {
                uri = Lists.newArrayList();
                uri1 = uri1.iterator();
                String s;
                String s1;
label1:
                do
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); uri.add(s1))
                    {
                        s = (String)((Iterator) (obj)).next();
                        s1 = (String)uri1.next();
                        if (!s.startsWith("{"))
                        {
                            continue label1;
                        }
                    }

                    break label0;
                } while (s.equals(s1));
            }
            return null;
        }
        return (String[])uri.toArray(new String[uri.size()]);
    }

    public static void validate(Uri uri)
    {
        for (Iterator iterator = uri.getPathSegments().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            int i = s.indexOf('{');
            int j = s.indexOf('}');
            boolean flag;
            boolean flag1;
            if (i < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j < 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag != flag1)
            {
                uri = String.valueOf("Illegal pattern format; unbalanced braces in path segment: ");
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    uri = uri.concat(s);
                } else
                {
                    uri = new String(uri);
                }
                throw new IllegalArgumentException(uri);
            }
            if (i > 0 || j >= 0 && j < s.length() - 1)
            {
                String s1 = String.valueOf("Illegal pattern format; variables denoted by braces must span the entire segment: ");
                uri = String.valueOf(uri);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(uri).length())).append(s1).append(uri).toString());
            }
        }

    }

    public final transient Intent createIntent(int i, Object aobj[])
    {
        aobj = getUri(getNewPattern(i), aobj);
        return UriIntents.create(application, ((Uri) (aobj)));
    }

    public final Iterable getSupportedUris()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (supportedUris != null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj = ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator unmodifiableiterator = PATTERNS.entrySet().iterator();
        do
        {
            if (!unmodifiableiterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)unmodifiableiterator.next();
            if (packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", ((UriInfo)entry.getValue()).uri), 0).size() > 0)
            {
                ((com.google.common.collect.ImmutableSet.Builder) (obj)).add(entry.getKey());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_99;
        obj;
        throw obj;
        supportedUris = ((com.google.common.collect.ImmutableSet.Builder) (obj)).build();
        obj = supportedUris;
        this;
        JVM INSTR monitorexit ;
        return ((Iterable) (obj));
    }

}
