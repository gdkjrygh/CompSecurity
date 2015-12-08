// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Path
{

    static final boolean $assertionsDisabled;
    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    private Path()
    {
    }

    public static String createPath(Box box)
    {
        return createPath(box, "");
    }

    private static String createPath(Box box, String s)
    {
_L3:
        Container container;
        Iterator iterator;
        int i;
        container = box.getParent();
        iterator = container.getBoxes().iterator();
        i = 0;
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(String.format("/%s[%d]", new Object[] {
            box.getType(), Integer.valueOf(i)
        })))).append(s).toString();
        Box box1;
        if (container instanceof Box)
        {
            box = (Box)container;
        } else
        {
            return s;
        }
          goto _L3
_L2:
        box1 = (Box)iterator.next();
        if (!box1.getType().equals(box.getType())) goto _L5; else goto _L4
_L4:
        if (box1 == box) goto _L1; else goto _L6
_L6:
        i++;
          goto _L5
    }

    public static Box getPath(Box box, String s)
    {
        box = getPaths(box, s, true);
        if (box.isEmpty())
        {
            return null;
        } else
        {
            return (Box)box.get(0);
        }
    }

    public static Box getPath(Container container, String s)
    {
        container = getPaths(container, s, true);
        if (container.isEmpty())
        {
            return null;
        } else
        {
            return (Box)container.get(0);
        }
    }

    public static Box getPath(AbstractContainerBox abstractcontainerbox, String s)
    {
        abstractcontainerbox = getPaths(abstractcontainerbox, s, true);
        if (abstractcontainerbox.isEmpty())
        {
            return null;
        } else
        {
            return (Box)abstractcontainerbox.get(0);
        }
    }

    public static List getPaths(Box box, String s)
    {
        return getPaths(box, s, false);
    }

    private static List getPaths(Box box, String s, boolean flag)
    {
        return getPaths(box, s, flag);
    }

    public static List getPaths(Container container, String s)
    {
        return getPaths(container, s, false);
    }

    private static List getPaths(Container container, String s, boolean flag)
    {
        return getPaths(container, s, flag);
    }

    private static List getPaths(AbstractContainerBox abstractcontainerbox, String s, boolean flag)
    {
        return getPaths(abstractcontainerbox, s, flag);
    }

    private static List getPaths(Object obj, String s, boolean flag)
    {
        int i = 0;
        if (!s.startsWith("/")) goto _L2; else goto _L1
_L1:
        s = s.substring(1);
_L5:
        if (obj instanceof Box) goto _L3; else goto _L2
_L2:
        if (s.length() == 0)
        {
            if (obj instanceof Box)
            {
                return Collections.singletonList((Box)obj);
            } else
            {
                throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
            }
        }
        break; /* Loop/switch isn't completed */
_L3:
        obj = ((Box)obj).getParent();
        if (true) goto _L5; else goto _L4
_L4:
        String s1;
        Object obj1;
        if (s.contains("/"))
        {
            s1 = s.substring(s.indexOf('/') + 1);
            s = s.substring(0, s.indexOf('/'));
        } else
        {
            s1 = "";
        }
        obj1 = component.matcher(s);
        if (((Matcher) (obj1)).matches())
        {
            s = ((Matcher) (obj1)).group(1);
            if ("..".equals(s))
            {
                if (obj instanceof Box)
                {
                    return getPaths(((Box)obj).getParent(), s1, flag);
                } else
                {
                    return Collections.emptyList();
                }
            }
            if (obj instanceof Container)
            {
                int j;
                if (((Matcher) (obj1)).group(2) != null)
                {
                    j = Integer.parseInt(((Matcher) (obj1)).group(3));
                } else
                {
                    j = -1;
                }
                obj1 = new LinkedList();
                obj = ((Container)obj).getBoxes().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        return ((List) (obj1));
                    }
                    Box box = (Box)((Iterator) (obj)).next();
                    if (box.getType().matches(s))
                    {
                        if (j == -1 || j == i)
                        {
                            ((List) (obj1)).addAll(getPaths(box, s1, flag));
                        }
                        i++;
                    }
                } while (!flag && j < 0 || ((List) (obj1)).isEmpty());
                return ((List) (obj1));
            } else
            {
                return Collections.emptyList();
            }
        } else
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(s))).append(" is invalid path.").toString());
        }
    }

    public static boolean isContained(Box box, String s)
    {
        if (!$assertionsDisabled && !s.startsWith("/"))
        {
            throw new AssertionError("Absolute path required");
        } else
        {
            return getPaths(box, s).contains(box);
        }
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/util/Path.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
