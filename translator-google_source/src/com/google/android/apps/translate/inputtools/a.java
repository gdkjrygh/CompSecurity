// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            InputToolsInput, e, j, f, 
//            g

final class a extends InputConnectionWrapper
{

    final InputToolsInput a;
    private final InputConnection b;

    public a(InputToolsInput inputtoolsinput, InputConnection inputconnection)
    {
        a = inputtoolsinput;
        super(inputconnection, false);
        b = inputconnection;
    }

    private String a()
    {
        CharSequence charsequence = b.getTextBeforeCursor(0x7fffffff, 0);
        if (charsequence == null)
        {
            return "";
        } else
        {
            return charsequence.toString();
        }
    }

    public final boolean commitText(CharSequence charsequence, int i)
    {
label0:
        {
            {
                Object obj = null;
                if (InputToolsInput.a(a) == null || !InputToolsInput.a(a).a() || charsequence == null || charsequence.length() != 1)
                {
                    break label0;
                }
                e e1 = InputToolsInput.a(a);
                Object obj2 = charsequence.toString();
                Object obj1 = a();
                if (!TextUtils.isEmpty(((CharSequence) (obj2))))
                {
                    e1.a(((String) (obj1)));
                    int l;
                    if (!e1.d.isEmpty())
                    {
                        obj1 = e1.a;
                        Object obj3 = e1.c.a;
                        int k = e1.c.b;
                        obj = String.valueOf(e1.d);
                        String s = String.valueOf(obj2);
                        int i1;
                        if (s.length() != 0)
                        {
                            obj = ((String) (obj)).concat(s);
                        } else
                        {
                            obj = new String(((String) (obj)));
                        }
                        obj1 = ((g) (obj1)).a(((String) (obj3)), k, ((String) (obj)));
                        obj = obj1;
                        if (obj1 != null)
                        {
                            obj = obj1;
                            if (((j) (obj1)).a < 0)
                            {
                                obj = null;
                            }
                        }
                    } else
                    {
                        obj = null;
                    }
                    if (obj != null)
                    {
                        obj1 = e1.c.a;
                        obj1 = String.valueOf(((String) (obj1)).substring(0, ((String) (obj1)).length() - ((j) (obj)).a));
                        obj3 = String.valueOf(((j) (obj)).b);
                        if (((String) (obj3)).length() != 0)
                        {
                            obj1 = ((String) (obj1)).concat(((String) (obj3)));
                        } else
                        {
                            obj1 = new String(((String) (obj1)));
                        }
                        obj.a = e1.b.a.length();
                        obj.b = ((String) (obj1));
                    } else
                    {
                        obj = e1.a.a(e1.b.a, e1.b.b, ((String) (obj2)));
                    }
                    obj3 = e1.a;
                    obj1 = String.valueOf(e1.d);
                    s = String.valueOf(obj2);
                    if (s.length() != 0)
                    {
                        obj1 = ((String) (obj1)).concat(s);
                    } else
                    {
                        obj1 = new String(((String) (obj1)));
                    }
                    if (((g) (obj3)).a(((String) (obj1))))
                    {
                        if (e1.d.isEmpty())
                        {
                            e1.c.a = e1.b.a;
                            e1.c.b = e1.b.b;
                        }
                        obj1 = String.valueOf(e1.d);
                        obj3 = String.valueOf(obj2);
                        if (((String) (obj3)).length() != 0)
                        {
                            obj1 = ((String) (obj1)).concat(((String) (obj3)));
                        } else
                        {
                            obj1 = new String(((String) (obj1)));
                        }
                        e1.d = ((String) (obj1));
                    } else
                    if (e1.a.a(((String) (obj2))))
                    {
                        e1.c.a = e1.b.a;
                        e1.c.b = e1.b.b;
                        e1.d = ((String) (obj2));
                    } else
                    {
                        e1.c.a();
                        e1.d = "";
                    }
                    obj1 = e1.b.a;
                    k = e1.b.b;
                    if (obj != null)
                    {
                        obj1 = String.valueOf(((String) (obj1)).substring(0, ((String) (obj1)).length() - ((j) (obj)).a));
                        obj2 = String.valueOf(((j) (obj)).b);
                        if (((String) (obj2)).length() != 0)
                        {
                            obj1 = ((String) (obj1)).concat(((String) (obj2)));
                        } else
                        {
                            obj1 = new String(((String) (obj1)));
                        }
                        k = ((String) (obj1)).length();
                    } else
                    {
                        obj = String.valueOf(obj1);
                        obj1 = String.valueOf(obj2);
                        if (((String) (obj1)).length() != 0)
                        {
                            obj = ((String) (obj)).concat(((String) (obj1)));
                        } else
                        {
                            obj = new String(((String) (obj)));
                        }
                        obj2 = new j(0, ((String) (obj2)));
                        obj1 = obj;
                        obj = obj2;
                    }
                    i1 = ((String) (obj1)).lastIndexOf(' ');
                    l = k;
                    obj2 = obj1;
                    if (i1 >= 0)
                    {
                        obj2 = ((String) (obj1)).substring(i1 + 1);
                        if (k > i1)
                        {
                            l = k - (i1 + 1);
                        } else
                        {
                            l = -1;
                        }
                    }
                    e1.b.a = ((String) (obj2));
                    e1.b.b = l;
                }
            }
            if (obj != null)
            {
                if (((j) (obj)).a > 0)
                {
                    b.deleteSurroundingText(((j) (obj)).a, 0);
                }
                return b.commitText(((j) (obj)).b, 1);
            }
        }
        return super.commitText(charsequence, i);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_70;
_L1:
    }

    public final boolean deleteSurroundingText(int i, int k)
    {
        if (InputToolsInput.a(a) != null && InputToolsInput.a(a).a())
        {
            e e1 = InputToolsInput.a(a);
            e1.a(a());
            String s = e1.b.a;
            if (!s.isEmpty())
            {
                s = s.substring(0, s.length() - 1);
                e1.b.a = s;
                if (e1.b.b > s.length())
                {
                    e1.b.b = s.length();
                }
                s = e1.d;
                if (!s.isEmpty())
                {
                    e1.d = s.substring(0, s.length() - 1);
                }
                if (e1.d.isEmpty())
                {
                    e1.c.a();
                }
            } else
            {
                e1.b();
            }
        }
        return super.deleteSurroundingText(i, k);
    }

    public final boolean sendKeyEvent(KeyEvent keyevent)
    {
        if (InputToolsInput.a(a) != null && InputToolsInput.a(a).a() && keyevent.getAction() == 0 && InputToolsInput.a(keyevent))
        {
            return commitText(Character.toString((char)keyevent.getUnicodeChar()), 1);
        } else
        {
            return super.sendKeyEvent(keyevent);
        }
    }
}
