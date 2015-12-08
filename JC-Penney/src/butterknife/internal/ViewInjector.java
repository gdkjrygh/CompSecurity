// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package butterknife.internal:
//            CollectionBinding, Binding, ViewInjection, ListenerClass, 
//            ListenerMethod, ListenerBinding, Parameter, ViewBinding

final class ViewInjector
{

    private final String className;
    private final String classPackage;
    private final Map collectionBindings = new LinkedHashMap();
    private String parentInjector;
    private final String targetClass;
    private final Map viewIdMap = new LinkedHashMap();

    ViewInjector(String s, String s1, String s2)
    {
        classPackage = s;
        className = s1;
        targetClass = s2;
    }

    private void emitCollectionBinding(StringBuilder stringbuilder, CollectionBinding collectionbinding, int ai[])
    {
        stringbuilder.append("    target.").append(collectionbinding.getName()).append(" = ");
        switch (_cls1..SwitchMap.butterknife.internal.CollectionBinding.Kind[collectionbinding.getKind().ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown kind: ").append(collectionbinding.getKind()).toString());

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_191;

        case 1: // '\001'
            stringbuilder.append("Finder.arrayOf(");
            break;
        }
_L1:
        int i = 0;
        while (i < ai.length) 
        {
            if (i > 0)
            {
                stringbuilder.append(',');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("\n        finder.<").append(collectionbinding.getType()).append(">");
            String s;
            if (collectionbinding.isRequired())
            {
                s = "findRequiredView";
            } else
            {
                s = "findOptionalView";
            }
            stringbuilder1.append(s).append("(source, ").append(ai[i]).append(", \"");
            emitHumanDescription(stringbuilder, Collections.singleton(collectionbinding));
            stringbuilder.append("\")");
            i++;
        }
        break MISSING_BLOCK_LABEL_208;
        stringbuilder.append("Finder.listOf(");
          goto _L1
        stringbuilder.append("\n    );\n");
        return;
    }

    static void emitHumanDescription(StringBuilder stringbuilder, Collection collection)
    {
        Iterator iterator;
label0:
        {
            iterator = collection.iterator();
            switch (collection.size())
            {
            default:
                int j = collection.size();
                for (int i = 0; i < j; i++)
                {
                    if (i != 0)
                    {
                        stringbuilder.append(", ");
                    }
                    if (i == j - 1)
                    {
                        stringbuilder.append("and ");
                    }
                    stringbuilder.append(((Binding)iterator.next()).getDescription());
                }

                break;

            case 2: // '\002'
                break label0;

            case 1: // '\001'
                stringbuilder.append(((Binding)iterator.next()).getDescription());
                break;
            }
            return;
        }
        stringbuilder.append(((Binding)iterator.next()).getDescription()).append(" and ").append(((Binding)iterator.next()).getDescription());
    }

    private void emitInject(StringBuilder stringbuilder)
    {
        stringbuilder.append("  @Override ").append("public void inject(final Finder finder, final T target, Object source) {\n");
        if (parentInjector != null)
        {
            stringbuilder.append("    super.inject(finder, target, source);\n\n");
        }
        stringbuilder.append("    View view;\n");
        for (Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext(); emitViewInjection(stringbuilder, (ViewInjection)iterator.next())) { }
        java.util.Map.Entry entry;
        for (Iterator iterator1 = collectionBindings.entrySet().iterator(); iterator1.hasNext(); emitCollectionBinding(stringbuilder, (CollectionBinding)entry.getKey(), (int[])entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator1.next();
        }

        stringbuilder.append("  }\n");
    }

    private void emitListenerBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        Object obj = viewinjection.getListenerBindings();
        if (!((Map) (obj)).isEmpty())
        {
            boolean flag1 = viewinjection.getRequiredBindings().isEmpty();
            if (flag1)
            {
                stringbuilder.append("    if (view != null) {\n");
                viewinjection = "  ";
            } else
            {
                viewinjection = "";
            }
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(viewinjection).append("      });\n"))
            {
                Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                Object obj2 = (ListenerClass)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (Map)((java.util.Map.Entry) (obj1)).getValue();
                boolean flag;
                if (!"android.view.View".equals(((ListenerClass) (obj2)).targetType()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                stringbuilder.append(viewinjection).append("    ");
                if (flag)
                {
                    stringbuilder.append("((").append(((ListenerClass) (obj2)).targetType());
                    if (((ListenerClass) (obj2)).genericArguments() > 0)
                    {
                        stringbuilder.append('<');
                        for (int j = 0; j < ((ListenerClass) (obj2)).genericArguments(); j++)
                        {
                            if (j > 0)
                            {
                                stringbuilder.append(", ");
                            }
                            stringbuilder.append('?');
                        }

                        stringbuilder.append('>');
                    }
                    stringbuilder.append(") ");
                }
                stringbuilder.append("view");
                if (flag)
                {
                    stringbuilder.append(')');
                }
                stringbuilder.append('.').append(((ListenerClass) (obj2)).setter()).append("(\n");
                stringbuilder.append(viewinjection).append("      new ").append(((ListenerClass) (obj2)).type()).append("() {\n");
                for (obj2 = getListenerMethods(((ListenerClass) (obj2))).iterator(); ((Iterator) (obj2)).hasNext(); stringbuilder.append(viewinjection).append("        }\n"))
                {
                    ListenerMethod listenermethod = (ListenerMethod)((Iterator) (obj2)).next();
                    stringbuilder.append(viewinjection).append("        @Override public ").append(listenermethod.returnType()).append(' ').append(listenermethod.name()).append("(\n");
                    String as[] = listenermethod.parameters();
                    int i = 0;
                    for (int k = as.length; i < k; i++)
                    {
                        stringbuilder.append(viewinjection).append("          ").append(as[i]).append(" p").append(i);
                        if (i < k - 1)
                        {
                            stringbuilder.append(',');
                        }
                        stringbuilder.append('\n');
                    }

                    stringbuilder.append(viewinjection).append("        ) {\n");
                    stringbuilder.append(viewinjection).append("          ");
                    if (!"void".equals(listenermethod.returnType()))
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    if (i != 0)
                    {
                        stringbuilder.append("return ");
                    }
                    if (((Map) (obj1)).containsKey(listenermethod))
                    {
                        Iterator iterator = ((Set)((Map) (obj1)).get(listenermethod)).iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            ListenerBinding listenerbinding = (ListenerBinding)iterator.next();
                            stringbuilder.append("target.").append(listenerbinding.getName()).append('(');
                            List list = listenerbinding.getParameters();
                            String as1[] = listenermethod.parameters();
                            int l = list.size();
                            i = 0;
                            while (i < l) 
                            {
                                Parameter parameter = (Parameter)list.get(i);
                                int i1 = parameter.getListenerPosition();
                                if (parameter.requiresCast(as1[i1]))
                                {
                                    stringbuilder.append("finder.<").append(parameter.getType()).append(">castParam(p").append(i1).append(", \"").append(listenermethod.name()).append("\", ").append(i1).append(", \"").append(listenerbinding.getName()).append("\", ").append(i).append(")");
                                } else
                                {
                                    stringbuilder.append('p').append(i1);
                                }
                                if (i < l - 1)
                                {
                                    stringbuilder.append(", ");
                                }
                                i++;
                            }
                            stringbuilder.append(");");
                            if (iterator.hasNext())
                            {
                                stringbuilder.append("\n").append("          ");
                            }
                        } while (true);
                    } else
                    if (i != 0)
                    {
                        stringbuilder.append(listenermethod.defaultReturn()).append(';');
                    }
                    stringbuilder.append('\n');
                }

            }

            if (flag1)
            {
                stringbuilder.append("    }\n");
                return;
            }
        }
    }

    private void emitReset(StringBuilder stringbuilder)
    {
        stringbuilder.append("  @Override public void reset(T target) {\n");
        if (parentInjector != null)
        {
            stringbuilder.append("    super.reset(target);\n\n");
        }
        for (Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext();)
        {
            Iterator iterator2 = ((ViewInjection)iterator.next()).getViewBindings().iterator();
            while (iterator2.hasNext()) 
            {
                ViewBinding viewbinding = (ViewBinding)iterator2.next();
                stringbuilder.append("    target.").append(viewbinding.getName()).append(" = null;\n");
            }
        }

        CollectionBinding collectionbinding;
        for (Iterator iterator1 = collectionBindings.keySet().iterator(); iterator1.hasNext(); stringbuilder.append("    target.").append(collectionbinding.getName()).append(" = null;\n"))
        {
            collectionbinding = (CollectionBinding)iterator1.next();
        }

        stringbuilder.append("  }\n");
    }

    private void emitViewBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        Collection collection = viewinjection.getViewBindings();
        if (!collection.isEmpty())
        {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) 
            {
                ViewBinding viewbinding = (ViewBinding)iterator.next();
                stringbuilder.append("    target.").append(viewbinding.getName()).append(" = ");
                if (viewbinding.requiresCast())
                {
                    stringbuilder.append("finder.castView(view").append(", ").append(viewinjection.getId()).append(", \"");
                    emitHumanDescription(stringbuilder, collection);
                    stringbuilder.append("\");\n");
                } else
                {
                    stringbuilder.append("view;\n");
                }
            }
        }
    }

    private void emitViewInjection(StringBuilder stringbuilder, ViewInjection viewinjection)
    {
        stringbuilder.append("    view = ");
        List list = viewinjection.getRequiredBindings();
        if (list.isEmpty())
        {
            stringbuilder.append("finder.findOptionalView(source, ").append(viewinjection.getId()).append(", null);\n");
        } else
        if (viewinjection.getId() == -1)
        {
            stringbuilder.append("target;\n");
        } else
        {
            stringbuilder.append("finder.findRequiredView(source, ").append(viewinjection.getId()).append(", \"");
            emitHumanDescription(stringbuilder, list);
            stringbuilder.append("\");\n");
        }
        emitViewBindings(stringbuilder, viewinjection);
        emitListenerBindings(stringbuilder, viewinjection);
    }

    static List getListenerMethods(ListenerClass listenerclass)
    {
        ArrayList arraylist;
        ListenerMethod listenermethod;
        int i;
        if (listenerclass.method().length == 1)
        {
            return Arrays.asList(listenerclass.method());
        }
        Enum aenum[];
        Enum enum;
        int j;
        try
        {
            arraylist = new ArrayList();
            listenerclass = listenerclass.callbacks();
            aenum = (Enum[])listenerclass.getEnumConstants();
            j = aenum.length;
        }
        // Misplaced declaration of an exception variable
        catch (ListenerClass listenerclass)
        {
            throw new AssertionError(listenerclass);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        listenermethod = (ListenerMethod)listenerclass.getField(enum.name()).getAnnotation(butterknife/internal/ListenerMethod);
        if (listenermethod != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        throw new IllegalStateException(String.format("@%s's %s.%s missing @%s annotation.", new Object[] {
            listenerclass.getEnclosingClass().getSimpleName(), listenerclass.getSimpleName(), enum.name(), butterknife/internal/ListenerMethod.getSimpleName()
        }));
        arraylist.add(listenermethod);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
    }

    private ViewInjection getOrCreateViewInjection(int i)
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

    void addCollection(int ai[], CollectionBinding collectionbinding)
    {
        collectionBindings.put(collectionbinding, ai);
    }

    boolean addListener(int i, ListenerClass listenerclass, ListenerMethod listenermethod, ListenerBinding listenerbinding)
    {
        ViewInjection viewinjection = getOrCreateViewInjection(i);
        if (viewinjection.hasListenerBinding(listenerclass, listenermethod) && !"void".equals(listenermethod.returnType()))
        {
            return false;
        } else
        {
            viewinjection.addListenerBinding(listenerclass, listenermethod, listenerbinding);
            return true;
        }
    }

    void addView(int i, ViewBinding viewbinding)
    {
        getOrCreateViewInjection(i).addViewBinding(viewbinding);
    }

    String brewJava()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("// Generated code from Butter Knife. Do not modify!\n");
        stringbuilder.append("package ").append(classPackage).append(";\n\n");
        stringbuilder.append("import android.view.View;\n");
        stringbuilder.append("import butterknife.ButterKnife.Finder;\n");
        if (parentInjector == null)
        {
            stringbuilder.append("import butterknife.ButterKnife.Injector;\n");
        }
        stringbuilder.append('\n');
        stringbuilder.append("public class ").append(className);
        stringbuilder.append("<T extends ").append(targetClass).append(">");
        if (parentInjector != null)
        {
            stringbuilder.append(" extends ").append(parentInjector).append("<T>");
        } else
        {
            stringbuilder.append(" implements Injector<T>");
        }
        stringbuilder.append(" {\n");
        emitInject(stringbuilder);
        stringbuilder.append('\n');
        emitReset(stringbuilder);
        stringbuilder.append("}\n");
        return stringbuilder.toString();
    }

    String getFqcn()
    {
        return (new StringBuilder()).append(classPackage).append(".").append(className).toString();
    }

    ViewInjection getViewInjection(int i)
    {
        return (ViewInjection)viewIdMap.get(Integer.valueOf(i));
    }

    void setParentInjector(String s)
    {
        parentInjector = s;
    }

    private class _cls1
    {

        static final int $SwitchMap$butterknife$internal$CollectionBinding$Kind[];

        static 
        {
            $SwitchMap$butterknife$internal$CollectionBinding$Kind = new int[CollectionBinding.Kind.values().length];
            try
            {
                $SwitchMap$butterknife$internal$CollectionBinding$Kind[CollectionBinding.Kind.ARRAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$butterknife$internal$CollectionBinding$Kind[CollectionBinding.Kind.LIST.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
