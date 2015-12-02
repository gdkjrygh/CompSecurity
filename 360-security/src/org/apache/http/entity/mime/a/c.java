// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime.a;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.apache.http.entity.mime.a:
//            d

public interface c
    extends d
{

    public abstract void a(OutputStream outputstream)
        throws IOException;

    public abstract String b();
}
