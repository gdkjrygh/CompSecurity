// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package butterknife.internal:
//            ViewInjection, FieldBinding, Binding, Listener, 
//            MethodBinding, Parameter

final class ViewInjector
{

    private final String className;
    private final String classPackage;
    private String parentInjector;
    private final String targetClass;
    private final Map viewIdMap = new LinkedHashMap();

    ViewInjector(String s, String s1, String s2)
    {
        classPackage = s;
        className = s1;
        targetClass = s2;
    }

    static void emitCastIfNeeded(StringBuilder stringbuilder, String s)
    {
        emitCastIfNeeded(stringbuilder, "android.view.View", s);
    }

    static void emitCastIfNeeded(StringBuilder stringbuilder, String s, String s1)
    {
        if (!s.equals(s1))
        {
            stringbuilder.append('(').append(s1).append(") ");
        }
    }

    private void emitFieldBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        viewinjection = viewinjection.getFieldBindings();
        if (!viewinjection.isEmpty())
        {
            viewinjection = viewinjection.iterator();
            while (viewinjection.hasNext()) 
            {
                FieldBinding fieldbinding = (FieldBinding)viewinjection.next();
                stringbuilder.append("    target.").append(fieldbinding.getName()).append(" = ");
                emitCastIfNeeded(stringbuilder, fieldbinding.getType());
                stringbuilder.append("view;\n");
            }
        }
    }

    static void emitHumanDescription(StringBuilder stringbuilder, List list)
    {
label0:
        {
            switch (list.size())
            {
            default:
                int j = list.size();
                for (int i = 0; i < j; i++)
                {
                    Binding binding = (Binding)list.get(i);
                    if (i != 0)
                    {
                        stringbuilder.append(", ");
                    }
                    if (i == j - 1)
                    {
                        stringbuilder.append("and ");
                    }
                    stringbuilder.append(binding.getDescription());
                }

                break;

            case 2: // '\002'
                break label0;

            case 1: // '\001'
                stringbuilder.append(((Binding)list.get(0)).getDescription());
                break;
            }
            return;
        }
        stringbuilder.append(((Binding)list.get(0)).getDescription()).append(" and ").append(((Binding)list.get(1)).getDescription());
    }

    private void emitInject(StringBuilder stringbuilder)
    {
        stringbuilder.append("  public static void inject(Finder finder, final ").append(targetClass).append(" target, Object source) {\n");
        if (parentInjector != null)
        {
            stringbuilder.append("    ").append(parentInjector).append(".inject(finder, target, source);\n\n");
        }
        stringbuilder.append("    View view;\n");
        for (Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext(); emitViewInjection(stringbuilder, (ViewInjection)iterator.next())) { }
        stringbuilder.append("  }\n");
    }

    private void emitMethodBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        Object obj = viewinjection.getMethodBindings();
        if (!((Map) (obj)).isEmpty())
        {
            boolean flag = viewinjection.getRequiredBindings().isEmpty();
            if (flag)
            {
                stringbuilder.append("    if (view != null) {\n");
                viewinjection = "  ";
            } else
            {
                viewinjection = "";
            }
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(viewinjection).append("      });\n"))
            {
                Object obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj1 = (Listener)((java.util.Map.Entry) (obj2)).getKey();
                obj2 = (MethodBinding)((java.util.Map.Entry) (obj2)).getValue();
                List list;
                int i;
                int k;
                if (!"android.view.View".equals(((Listener) (obj1)).getOwnerType()))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                stringbuilder.append(viewinjection).append("    ");
                if (i != 0)
                {
                    stringbuilder.append("((").append(((Listener) (obj1)).getOwnerType()).append(") ");
                }
                stringbuilder.append("view");
                if (i != 0)
                {
                    stringbuilder.append(')');
                }
                stringbuilder.append('.').append(((Listener) (obj1)).getSetterName()).append("(\n");
                stringbuilder.append(viewinjection).append("      new ").append(((Listener) (obj1)).getType()).append("() {\n");
                stringbuilder.append(viewinjection).append("        @Override public ").append(((Listener) (obj1)).getReturnType()).append(' ').append(((Listener) (obj1)).getMethodName()).append("(\n");
                list = ((Listener) (obj1)).getParameterTypes();
                k = list.size();
                for (i = 0; i < k; i++)
                {
                    stringbuilder.append(viewinjection).append("          ").append((String)list.get(i)).append(" p").append(i);
                    if (i < k - 1)
                    {
                        stringbuilder.append(',');
                    }
                    stringbuilder.append('\n');
                }

                stringbuilder.append(viewinjection).append("        ) {\n");
                stringbuilder.append(viewinjection).append("          ");
                if (!"void".equals(((Listener) (obj1)).getReturnType()))
                {
                    stringbuilder.append("return ");
                }
                stringbuilder.append("target.").append(((MethodBinding) (obj2)).getName()).append('(');
                obj2 = ((MethodBinding) (obj2)).getParameters();
                obj1 = ((Listener) (obj1)).getParameterTypes();
                k = ((List) (obj2)).size();
                for (int j = 0; j < k; j++)
                {
                    Parameter parameter = (Parameter)((List) (obj2)).get(j);
                    int l = parameter.getListenerPosition();
                    emitCastIfNeeded(stringbuilder, (String)((List) (obj1)).get(l), parameter.getType());
                    stringbuilder.append('p').append(l);
                    if (j < k - 1)
                    {
                        stringbuilder.append(", ");
                    }
                }

                stringbuilder.append(");\n");
                stringbuilder.append(viewinjection).append("        }\n");
            }

            if (flag)
            {
                stringbuilder.append("    }\n");
                return;
            }
        }
    }

    private void emitReset(StringBuilder stringbuilder)
    {
        stringbuilder.append("  public static void reset(").append(targetClass).append(" target) {\n");
        if (parentInjector != null)
        {
            stringbuilder.append("    ").append(parentInjector).append(".reset(target);\n\n");
        }
        for (Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((ViewInjection)iterator.next()).getFieldBindings().iterator();
            while (iterator1.hasNext()) 
            {
                FieldBinding fieldbinding = (FieldBinding)iterator1.next();
                stringbuilder.append("    target.").append(fieldbinding.getName()).append(" = null;\n");
            }
        }

        stringbuilder.append("  }\n");
    }

    private void emitViewInjection(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        stringbuilder.append("    view = finder.findById(source, ").append(viewinjection.getId()).append(");\n");
        List list = viewinjection.getRequiredBindings();
        if (!list.isEmpty())
        {
            stringbuilder.append("    if (view == null) {\n      throw new IllegalStateException(\"Required view with id '").append(viewinjection.getId()).append("' for ");
            emitHumanDescription(stringbuilder, list);
            stringbuilder.append(" was not found. If this view is optional add '@Optional' annotation.\");\n    }\n");
        }
        emitFieldBindings(stringbuilder, viewinjection);
        emitMethodBindings(stringbuilder, viewinjection);
    }

    private ViewInjection getOrCreateViewBinding(int i)
    {
        ViewInjection viewinjection1 = (ViewInjection)viewIdMap.get(Integer.valueOf(i));
        ViewInjection viewinjection = viewinjection1;
        if (viewinjection1 == null)
        {
            viewinjection = new ViewInjection(i);
            viewIdMap.put(Integer.valueOf(i), viewinjection);
        }
        return viewinjection;
    }

    final void addField(int i, String s, String s1, boolean flag)
    {
        getOrCreateViewBinding(i).addFieldBinding(new FieldBinding(s, s1, flag));
    }

    final boolean addMethod(int i, Listener listener, String s, List list, boolean flag)
    {
        try
        {
            getOrCreateViewBinding(i).addMethodBinding(listener, new MethodBinding(s, list, flag));
        }
        // Misplaced declaration of an exception variable
        catch (Listener listener)
        {
            return false;
        }
        return true;
    }

    final String brewJava()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("// Generated code from Butter Knife. Do not modify!\n");
        stringbuilder.append("package ").append(classPackage).append(";\n\n");
        stringbuilder.append("import android.view.View;\n");
        stringbuilder.append("import butterknife.ButterKnife.Finder;\n\n");
        stringbuilder.append("public class ").append(className).append(" {\n");
        emitInject(stringbuilder);
        stringbuilder.append('\n');
        emitReset(stringbuilder);
        stringbuilder.append("}\n");
        return stringbuilder.toString();
    }

    final String getFqcn()
    {
        return (new StringBuilder()).append(classPackage).append(".").append(className).toString();
    }

    final void setParentInjector(String s)
    {
        parentInjector = s;
    }
}
