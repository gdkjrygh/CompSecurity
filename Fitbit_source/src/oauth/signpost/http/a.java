// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface a
{

    public abstract String a(String s);

    public abstract Map a();

    public abstract void a(String s, String s1);

    public abstract String b();

    public abstract void b(String s);

    public abstract InputStream c()
        throws IOException;

    public abstract String d();

    public abstract String e();

    public abstract Object f();
}
