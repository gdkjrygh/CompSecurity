// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

public interface j
{

    public abstract JSONObject a(URI uri, Map map);

    public abstract JSONObject a(URI uri, Map map, JSONObject jsonobject);
}
