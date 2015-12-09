// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import org.json.JSONObject;

class EditorConnection
{
    public class EditorConnectionException extends IOException
    {

        private static final long serialVersionUID = 0xe5d74d12ed411d3cL;
        final EditorConnection this$0;

        public EditorConnectionException(Throwable throwable)
        {
            this$0 = EditorConnection.this;
            super(throwable.getMessage());
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void a(JSONObject jsonobject);

        public abstract void b();

        public abstract void b(JSONObject jsonobject);

        public abstract void c(JSONObject jsonobject);

        public abstract void d(JSONObject jsonobject);

        public abstract void e(JSONObject jsonobject);
    }


    private static final int d = 5000;
    private static final ByteBuffer e = ByteBuffer.allocate(0);
    private static final String f = "MixpanelAPI.EditorCnctn";
    private final a a;
    private final b b;
    private final URI c;

    public EditorConnection(URI uri, a a1, Socket socket)
        throws EditorConnectionException
    {
        a = a1;
        c = uri;
        try
        {
    /* block-local class not found */
    class b {}

            b = new b(uri, 5000, socket);
            b.o();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new EditorConnectionException(uri);
        }
    }

    static a a(EditorConnection editorconnection)
    {
        return editorconnection.a;
    }

    static URI b(EditorConnection editorconnection)
    {
        return editorconnection.c;
    }

    static b c(EditorConnection editorconnection)
    {
        return editorconnection.b;
    }

    static ByteBuffer c()
    {
        return e;
    }

    public boolean a()
    {
        return !b.i() && !b.g() && !b.h();
    }

    public BufferedOutputStream b()
    {
    /* block-local class not found */
    class c {}

        return new BufferedOutputStream(new c(null));
    }

}
