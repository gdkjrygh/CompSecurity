// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Predicate;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IntentGenerator
{

    private URI absoluteUri;
    private Map conditionalComponentNameMap;
    private Map conditionalPackageNameMap;

    public IntentGenerator()
    {
        conditionalComponentNameMap = new HashMap();
        conditionalPackageNameMap = new HashMap();
    }

    private Uri convertToAndroidUriAndFixScheme(URI uri, URI uri1)
    {
label0:
        {
            Uri uri2 = Uri.parse(uri.toString());
            uri = uri2;
            if (!"comgooglewallet".equals(uri2.getScheme()))
            {
                break label0;
            }
            if (uri1.getAuthority() != null)
            {
                uri = uri2;
                if (!uri1.getAuthority().isEmpty())
                {
                    break label0;
                }
            }
            if (uri2.getAuthority() != null)
            {
                uri = uri2;
                if (!uri2.getAuthority().isEmpty())
                {
                    break label0;
                }
            }
            uri = uri2.buildUpon().authority("").build();
        }
        return uri;
    }

    private Uri resolveUri(URI uri)
    {
        if (uri.isAbsolute() || absoluteUri == null)
        {
            return convertToAndroidUriAndFixScheme(uri, uri);
        } else
        {
            return convertToAndroidUriAndFixScheme(absoluteUri.resolve(uri), absoluteUri);
        }
    }

    public void addConditionalComponentName(Predicate predicate, ComponentName componentname)
    {
        conditionalComponentNameMap.put(predicate, componentname);
    }

    public void addConditionalPackageName(Predicate predicate, String s)
    {
        conditionalPackageNameMap.put(predicate, s);
    }

    public Intent fromUri(URI uri)
    {
        uri = resolveUri(uri);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        Iterator iterator = conditionalComponentNameMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Predicate predicate = (Predicate)iterator.next();
            if (predicate.apply(uri))
            {
                intent.setComponent((ComponentName)conditionalComponentNameMap.get(predicate));
            }
        } while (true);
        iterator = conditionalPackageNameMap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Predicate predicate1 = (Predicate)iterator.next();
            if (predicate1.apply(uri))
            {
                intent.setPackage((String)conditionalPackageNameMap.get(predicate1));
            }
        } while (true);
        return intent;
    }

    public void setAbsoluteUri(URI uri)
    {
        absoluteUri = uri;
    }
}
