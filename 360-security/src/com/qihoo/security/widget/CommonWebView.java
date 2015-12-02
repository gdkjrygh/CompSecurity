// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CommonWebView extends WebView
{

    private static final String a[] = {
        "getClass", "hashCode", "notify", "notifyAll", "equals", "toString", "wait"
    };
    private final HashMap b;
    private String c;

    public CommonWebView(Context context)
    {
        super(context);
        b = new HashMap();
        c = null;
        a(context);
    }

    public CommonWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new HashMap();
        c = null;
        a(context);
    }

    public CommonWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new HashMap();
        c = null;
        a(context);
    }

    private void a(Context context)
    {
        d();
    }

    private void a(String s, Object obj, StringBuilder stringbuilder)
    {
        if (TextUtils.isEmpty(s) || obj == null || stringbuilder == null)
        {
            return;
        }
        obj = obj.getClass();
        stringbuilder.append("if(typeof(window.").append(s).append(")!='undefined'){");
        stringbuilder.append("}else {");
        stringbuilder.append("    window.").append(s).append("={");
        obj = ((Class) (obj)).getMethods();
        int l = obj.length;
        int i = 0;
        while (i < l) 
        {
            Method method = obj[i];
            String s1 = method.getName();
            if (!a(s1))
            {
                stringbuilder.append("        ").append(s1).append(":function(");
                int i1 = method.getParameterTypes().length;
                if (i1 > 0)
                {
                    for (int j = 0; j < i1 - 1; j++)
                    {
                        stringbuilder.append("arg").append(j).append(",");
                    }

                    stringbuilder.append("arg").append(i1 - 1);
                }
                stringbuilder.append(") {");
                if (method.getReturnType() != Void.TYPE)
                {
                    stringbuilder.append("            return ").append("prompt('").append("MyApp:").append("'+");
                } else
                {
                    stringbuilder.append("            prompt('").append("MyApp:").append("'+");
                }
                stringbuilder.append("JSON.stringify({");
                stringbuilder.append("obj").append(":'").append(s).append("',");
                stringbuilder.append("func").append(":'").append(s1).append("',");
                stringbuilder.append("args").append(":[");
                if (i1 > 0)
                {
                    i1--;
                    for (int k = 0; k < i1; k++)
                    {
                        stringbuilder.append("arg").append(k).append(",");
                    }

                    stringbuilder.append("arg").append(i1);
                }
                stringbuilder.append("]})");
                stringbuilder.append(");");
                stringbuilder.append("        }, ");
            }
            i++;
        }
        stringbuilder.append("    };");
        stringbuilder.append("}");
    }

    private void a(String s, String s1)
    {
        try
        {
            s = android/webkit/WebView.getDeclaredMethod(s, new Class[] {
                java/lang/String
            });
            s.setAccessible(true);
            s.invoke(this, new Object[] {
                s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private boolean a(String s)
    {
        boolean flag1 = false;
        String as[] = a;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    private boolean d()
    {
        if (!a() || b())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        a("removeJavascriptInterface", "searchBoxJavaBridge_");
        return true;
        Exception exception;
        exception;
        return false;
    }

    private void e()
    {
        try
        {
            if (!TextUtils.isEmpty(c))
            {
                loadUrl(c);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private String f()
    {
        if (b.size() == 0)
        {
            c = null;
            return null;
        }
        Iterator iterator = b.entrySet().iterator();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:(function JsAddJavascriptInterface_(){");
        try
        {
            java.util.Map.Entry entry;
            for (; iterator.hasNext(); a((String)entry.getKey(), entry.getValue(), stringbuilder))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        stringbuilder.append("})()");
        return stringbuilder.toString();
    }

    public boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, obj);
            c();
            return;
        }
    }

    public boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    public void c()
    {
        if (!TextUtils.isEmpty(c))
        {
            e();
            return;
        } else
        {
            c = f();
            e();
            return;
        }
    }

}
