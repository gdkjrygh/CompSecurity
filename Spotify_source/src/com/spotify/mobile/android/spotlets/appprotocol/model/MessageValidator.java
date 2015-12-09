// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class MessageValidator
{

    private static final List a = Collections.singletonList("wampcra");

    public MessageValidator()
    {
    }

    public static void a(int i, int j, String s)
    {
        if (j < 0 || j > i)
        {
            throw new ValidationException((new StringBuilder("\"")).append(s).append("\" ").append(j).append(" is not within range 0 to ").append(i).toString());
        } else
        {
            return;
        }
    }

    public static void a(AppProtocol.Identifier identifier)
    {
        if (identifier == null || identifier.id == null)
        {
            throw new ValidationException("identifier cannot be null");
        } else
        {
            return;
        }
    }

    public static void a(Object obj, Object obj1, String s)
    {
        if (!obj.equals(obj1))
        {
            throw new ValidationException((new StringBuilder("Expected \"")).append(s).append("\" to be ").append(obj).append(", but was ").append(obj1).toString());
        } else
        {
            return;
        }
    }

    public static void a(Object obj, String s, String s1)
    {
        Field field;
        try
        {
            field = obj.getClass().getField(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Assertion.b((new StringBuilder(" Error validating ")).append(s1).toString());
            throw new ValidationException((new StringBuilder("\"")).append(s1).append("\" has no value for key \"").append(s).append("\"").toString());
        }
        try
        {
            if (field.get(obj) == null)
            {
                throw new ValidationException((new StringBuilder("\"")).append(s1).append("\" has no value for key \"").append(s).append("\"").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Assertion.b((new StringBuilder(" Error validating ")).append(s1).toString());
            throw new ValidationException((new StringBuilder("\"")).append(s1).append("\" has no value for key \"").append(s).append("\"").toString());
        }
    }

    public static void a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new ValidationException((new StringBuilder("\"")).append(s1).append("\" can not be empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(String as[], String s)
    {
        if (as == null || as.length == 0)
        {
            throw new ValidationException((new StringBuilder("\"")).append(s).append("\" can not be empty").toString());
        } else
        {
            return;
        }
    }

    public static void b(String s, String s1)
    {
        if (!a.contains(s))
        {
            throw new ValidationException((new StringBuilder("\"")).append(s1).append("\" is not a valid auth method").toString());
        } else
        {
            return;
        }
    }


    private class ValidationException extends Exception
    {

        private static final long serialVersionUID = 0L;

        public final AppProtocol.Message a()
        {
            return new AppProtocol.Message(getMessage());
        }

        public ValidationException(String s)
        {
            super(s);
        }
    }

}
