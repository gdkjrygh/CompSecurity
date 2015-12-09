// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnFocusChange;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;
import butterknife.OnItemSelected;
import butterknife.OnLongClick;
import butterknife.OnPageChange;
import butterknife.OnTextChanged;
import butterknife.OnTouch;
import butterknife.Optional;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileObject;

// Referenced classes of package butterknife.internal:
//            ViewInjector, ViewInjection, ViewBinding, CollectionBinding, 
//            ListenerClass, ListenerMethod, Parameter, ListenerBinding

public final class ButterKnifeProcessor extends AbstractProcessor
{

    static final boolean $assertionsDisabled;
    public static final String ANDROID_PREFIX = "android.";
    public static final String JAVA_PREFIX = "java.";
    private static final List LISTENERS = Arrays.asList(new Class[] {
        butterknife/OnCheckedChanged, butterknife/OnClick, butterknife/OnEditorAction, butterknife/OnFocusChange, butterknife/OnItemClick, butterknife/OnItemLongClick, butterknife/OnItemSelected, butterknife/OnLongClick, butterknife/OnPageChange, butterknife/OnTextChanged, 
        butterknife/OnTouch
    });
    private static final String LIST_TYPE = java/util/List.getCanonicalName();
    public static final String SUFFIX = "$$ViewInjector";
    static final String VIEW_TYPE = "android.view.View";
    private Elements elementUtils;
    private Filer filer;
    private Types typeUtils;

    public ButterKnifeProcessor()
    {
    }

    private String doubleErasure(TypeMirror typemirror)
    {
        String s = typeUtils.erasure(typemirror).toString();
        int i = s.indexOf('<');
        typemirror = s;
        if (i != -1)
        {
            typemirror = s.substring(0, i);
        }
        return typemirror;
    }

    private transient void error(Element element, String s, Object aobj[])
    {
        String s1 = s;
        if (aobj.length > 0)
        {
            s1 = String.format(s, aobj);
        }
        processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.ERROR, s1, element);
    }

    private void findAndParseListener(RoundEnvironment roundenvironment, Class class1, Map map, Set set)
    {
        for (roundenvironment = roundenvironment.getElementsAnnotatedWith(class1).iterator(); roundenvironment.hasNext();)
        {
            Element element = (Element)roundenvironment.next();
            try
            {
                parseListenerAnnotation(class1, element, map, set);
            }
            catch (Exception exception)
            {
                StringWriter stringwriter = new StringWriter();
                exception.printStackTrace(new PrintWriter(stringwriter));
                error(element, "Unable to generate view injector for @%s.\n\n%s", new Object[] {
                    class1.getSimpleName(), stringwriter.toString()
                });
            }
        }

    }

    private Map findAndParseTargets(RoundEnvironment roundenvironment)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (Iterator iterator = roundenvironment.getElementsAnnotatedWith(butterknife/InjectView).iterator(); iterator.hasNext();)
        {
            Element element = (Element)iterator.next();
            try
            {
                parseInjectView(element, linkedhashmap, linkedhashset);
            }
            catch (Exception exception)
            {
                StringWriter stringwriter = new StringWriter();
                exception.printStackTrace(new PrintWriter(stringwriter));
                error(element, "Unable to generate view injector for @InjectView.\n\n%s", new Object[] {
                    stringwriter
                });
            }
        }

        for (Iterator iterator1 = roundenvironment.getElementsAnnotatedWith(butterknife/InjectViews).iterator(); iterator1.hasNext();)
        {
            Element element1 = (Element)iterator1.next();
            try
            {
                parseInjectViews(element1, linkedhashmap, linkedhashset);
            }
            catch (Exception exception1)
            {
                StringWriter stringwriter1 = new StringWriter();
                exception1.printStackTrace(new PrintWriter(stringwriter1));
                error(element1, "Unable to generate view injector for @InjectViews.\n\n%s", new Object[] {
                    stringwriter1
                });
            }
        }

        for (Iterator iterator2 = LISTENERS.iterator(); iterator2.hasNext(); findAndParseListener(roundenvironment, (Class)iterator2.next(), linkedhashmap, linkedhashset)) { }
        roundenvironment = linkedhashmap.entrySet().iterator();
        do
        {
            if (!roundenvironment.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)roundenvironment.next();
            String s = findParentFqcn((TypeElement)entry.getKey(), linkedhashset);
            if (s != null)
            {
                ((ViewInjector)entry.getValue()).setParentInjector((new StringBuilder()).append(s).append("$$ViewInjector").toString());
            }
        } while (true);
        return linkedhashmap;
    }

    private static Integer findDuplicate(int ai[])
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (!linkedhashset.add(Integer.valueOf(k)))
            {
                return Integer.valueOf(k);
            }
        }

        return null;
    }

    private String findParentFqcn(TypeElement typeelement, Set set)
    {
        do
        {
            typeelement = typeelement.getSuperclass();
            if (typeelement.getKind() == TypeKind.NONE)
            {
                return null;
            }
            typeelement = (TypeElement)((DeclaredType)typeelement).asElement();
        } while (!set.contains(typeelement.toString()));
        set = getPackageName(typeelement);
        return (new StringBuilder()).append(set).append(".").append(getClassName(typeelement, set)).toString();
    }

    private static String getClassName(TypeElement typeelement, String s)
    {
        int i = s.length();
        return typeelement.getQualifiedName().toString().substring(i + 1).replace('.', '$');
    }

    private ViewInjector getOrCreateTargetClass(Map map, TypeElement typeelement)
    {
        ViewInjector viewinjector = (ViewInjector)map.get(typeelement);
        Object obj = viewinjector;
        if (viewinjector == null)
        {
            obj = typeelement.getQualifiedName().toString();
            String s = getPackageName(typeelement);
            obj = new ViewInjector(s, (new StringBuilder()).append(getClassName(typeelement, s)).append("$$ViewInjector").toString(), ((String) (obj)));
            map.put(typeelement, obj);
        }
        return ((ViewInjector) (obj));
    }

    private String getPackageName(TypeElement typeelement)
    {
        return elementUtils.getPackageOf(typeelement).getQualifiedName().toString();
    }

    private boolean isBindingInWrongPackage(Class class1, Element element)
    {
        String s = ((TypeElement)element.getEnclosingElement()).getQualifiedName().toString();
        if (s.startsWith("android."))
        {
            error(element, "@%s-annotated class incorrectly in Android framework package. (%s)", new Object[] {
                class1.getSimpleName(), s
            });
            return true;
        }
        if (s.startsWith("java."))
        {
            error(element, "@%s-annotated class incorrectly in Java framework package. (%s)", new Object[] {
                class1.getSimpleName(), s
            });
            return true;
        } else
        {
            return false;
        }
    }

    private boolean isInaccessibleViaGeneratedCode(Class class1, String s, Element element)
    {
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Set set = element.getModifiers();
        boolean flag;
        if (set.contains(Modifier.PRIVATE) || set.contains(Modifier.STATIC))
        {
            error(element, "@%s %s must not be private or static. (%s.%s)", new Object[] {
                class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        } else
        {
            flag = false;
        }
        if (typeelement.getKind() != ElementKind.CLASS)
        {
            error(typeelement, "@%s %s may only be contained in classes. (%s.%s)", new Object[] {
                class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (typeelement.getModifiers().contains(Modifier.PRIVATE))
        {
            error(typeelement, "@%s %s may not be contained in private classes. (%s.%s)", new Object[] {
                class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
            });
            return true;
        } else
        {
            return flag;
        }
    }

    private boolean isInterface(TypeMirror typemirror)
    {
        while (!(typemirror instanceof DeclaredType) || ((DeclaredType)typemirror).asElement().getKind() != ElementKind.INTERFACE) 
        {
            return false;
        }
        return true;
    }

    private boolean isSubtypeOfType(TypeMirror typemirror, String s)
    {
        boolean flag1 = false;
        if (!s.equals(typemirror.toString())) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(typemirror instanceof DeclaredType))
        {
            continue; /* Loop/switch isn't completed */
        }
        typemirror = (DeclaredType)typemirror;
        List list = typemirror.getTypeArguments();
        if (list.size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder(typemirror.asElement().toString());
            stringbuilder.append('<');
            for (int i = 0; i < list.size(); i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append('?');
            }

            stringbuilder.append('>');
            if (stringbuilder.toString().equals(s))
            {
                return true;
            }
        }
        typemirror = typemirror.asElement();
        flag = flag1;
        if (!(typemirror instanceof TypeElement))
        {
            continue; /* Loop/switch isn't completed */
        }
        typemirror = (TypeElement)typemirror;
        if (isSubtypeOfType(typemirror.getSuperclass(), s))
        {
            return true;
        }
        typemirror = typemirror.getInterfaces().iterator();
        do
        {
            flag = flag1;
            if (!typemirror.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (isSubtypeOfType((TypeMirror)typemirror.next(), s))
            {
                return true;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void parseInjectView(Element element, Map map, Set set)
    {
        boolean flag = true;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Object obj = element.asType();
        if (obj instanceof TypeVariable)
        {
            obj = ((TypeVariable)obj).getUpperBound();
        }
        Object obj1;
        int i;
        if (!isSubtypeOfType(((TypeMirror) (obj)), "android.view.View") && !isInterface(((TypeMirror) (obj))))
        {
            error(element, "@InjectView fields must extend from View or be an interface. (%s.%s)", new Object[] {
                typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        } else
        {
            i = 0;
        }
        i = i | isInaccessibleViaGeneratedCode(butterknife/InjectView, "fields", element) | isBindingInWrongPackage(butterknife/InjectView, element);
        if (element.getAnnotation(butterknife/InjectViews) != null)
        {
            error(element, "Only one of @InjectView and @InjectViews is allowed. (%s.%s)", new Object[] {
                typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        }
        if (i != 0)
        {
            return;
        }
        i = ((InjectView)element.getAnnotation(butterknife/InjectView)).value();
        obj1 = (ViewInjector)map.get(typeelement);
        if (obj1 != null)
        {
            obj1 = ((ViewInjector) (obj1)).getViewInjection(i);
            if (obj1 != null)
            {
                obj1 = ((ViewInjection) (obj1)).getViewBindings().iterator();
                if (((Iterator) (obj1)).hasNext())
                {
                    error(element, "Attempt to use @InjectView for an already injected ID %d on '%s'. (%s.%s)", new Object[] {
                        Integer.valueOf(i), ((ViewBinding)((Iterator) (obj1)).next()).getName(), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    return;
                }
            }
        }
        obj1 = element.getSimpleName().toString();
        obj = ((TypeMirror) (obj)).toString();
        if (element.getAnnotation(butterknife/Optional) != null)
        {
            flag = false;
        }
        getOrCreateTargetClass(map, typeelement).addView(i, new ViewBinding(((String) (obj1)), ((String) (obj)), flag));
        set.add(typeelement.toString());
    }

    private void parseInjectViews(Element element, Map map, Set set)
    {
        CollectionBinding.Kind kind = null;
        boolean flag2 = true;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Object obj = element.asType();
        String s = doubleErasure(((TypeMirror) (obj)));
        boolean flag;
        boolean flag1;
        if (((TypeMirror) (obj)).getKind() == TypeKind.ARRAY)
        {
            obj = ((ArrayType)obj).getComponentType();
            kind = CollectionBinding.Kind.ARRAY;
            flag = false;
        } else
        if (LIST_TYPE.equals(s))
        {
            obj = ((DeclaredType)obj).getTypeArguments();
            if (((List) (obj)).size() != 1)
            {
                error(element, "@InjectViews List must have a generic component. (%s.%s)", new Object[] {
                    typeelement.getQualifiedName(), element.getSimpleName()
                });
                obj = null;
                flag = true;
            } else
            {
                obj = (TypeMirror)((List) (obj)).get(0);
                flag = false;
            }
            kind = CollectionBinding.Kind.LIST;
        } else
        {
            error(element, "@InjectViews must be a List or array. (%s.%s)", new Object[] {
                typeelement.getQualifiedName(), element.getSimpleName()
            });
            obj = null;
            flag = true;
        }
        if (obj instanceof TypeVariable)
        {
            obj = ((TypeVariable)obj).getUpperBound();
        }
        flag1 = flag;
        if (obj != null)
        {
            flag1 = flag;
            if (!isSubtypeOfType(((TypeMirror) (obj)), "android.view.View"))
            {
                flag1 = flag;
                if (!isInterface(((TypeMirror) (obj))))
                {
                    error(element, "@InjectViews type must extend from View or be an interface. (%s.%s)", new Object[] {
                        typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    flag1 = true;
                }
            }
        }
        if (isInaccessibleViaGeneratedCode(butterknife/InjectViews, "fields", element) | flag1 | isBindingInWrongPackage(butterknife/InjectViews, element))
        {
            return;
        }
        s = element.getSimpleName().toString();
        int ai[] = ((InjectViews)element.getAnnotation(butterknife/InjectViews)).value();
        if (ai.length == 0)
        {
            error(element, "@InjectViews must specify at least one ID. (%s.%s)", new Object[] {
                typeelement.getQualifiedName(), element.getSimpleName()
            });
            return;
        }
        Integer integer = findDuplicate(ai);
        if (integer != null)
        {
            error(element, "@InjectViews annotation contains duplicate ID %d. (%s.%s)", new Object[] {
                integer, typeelement.getQualifiedName(), element.getSimpleName()
            });
        }
        if (!$assertionsDisabled && obj == null)
        {
            throw new AssertionError();
        }
        obj = ((TypeMirror) (obj)).toString();
        if (element.getAnnotation(butterknife/Optional) != null)
        {
            flag2 = false;
        }
        getOrCreateTargetClass(map, typeelement).addCollection(ai, new CollectionBinding(s, ((String) (obj)), kind, flag2));
        set.add(typeelement.toString());
    }

    private void parseListenerAnnotation(Class class1, Element element, Map map, Set set)
    {
        if (!(element instanceof ExecutableElement) || element.getKind() != ElementKind.METHOD)
        {
            throw new IllegalStateException(String.format("@%s annotation must be on a method.", new Object[] {
                class1.getSimpleName()
            }));
        }
        ExecutableElement executableelement = (ExecutableElement)element;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Object obj = element.getAnnotation(class1);
        Object obj1 = class1.getDeclaredMethod("value", new Class[0]);
        if (((Method) (obj1)).getReturnType() != [I)
        {
            throw new IllegalStateException(String.format("@%s annotation value() type not int[].", new Object[] {
                class1
            }));
        }
        int ai[] = (int[])(int[])((Method) (obj1)).invoke(obj, new Object[0]);
        String s = executableelement.getSimpleName().toString();
        ListenerClass listenerclass;
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (element.getAnnotation(butterknife/Optional) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = isInaccessibleViaGeneratedCode(class1, "methods", element);
        flag2 = isBindingInWrongPackage(class1, element);
        obj1 = findDuplicate(ai);
        int k;
        int l;
        if (obj1 != null)
        {
            error(element, "@%s annotation for method contains duplicate ID %d. (%s.%s)", new Object[] {
                class1.getSimpleName(), obj1, typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        } else
        {
            i = flag1 | flag2;
        }
        listenerclass = (ListenerClass)class1.getAnnotation(butterknife/internal/ListenerClass);
        if (listenerclass == null)
        {
            throw new IllegalStateException(String.format("No @%s defined on @%s.", new Object[] {
                butterknife/internal/ListenerClass.getSimpleName(), class1.getSimpleName()
            }));
        }
        l = ai.length;
        k = 0;
        while (k < l) 
        {
            int j = ai[k];
            if (j == -1)
            {
                if (ai.length == 1)
                {
                    Object obj2;
                    ListenerMethod alistenermethod[];
                    Object obj3;
                    Parameter aparameter[];
                    TypeMirror typemirror;
                    List list;
                    BitSet bitset;
                    String as[];
                    if (!flag)
                    {
                        error(element, "ID free injection must not be annotated with @Optional. (%s.%s)", new Object[] {
                            typeelement.getQualifiedName(), element.getSimpleName()
                        });
                        j = 1;
                    } else
                    {
                        j = i;
                    }
                    obj2 = listenerclass.targetType();
                    i = j;
                    if (!isSubtypeOfType(typeelement.asType(), ((String) (obj2))))
                    {
                        i = j;
                        if (!isInterface(typeelement.asType()))
                        {
                            error(element, "@%s annotation without an ID may only be used with an object of type \"%s\" or an interface. (%s.%s)", new Object[] {
                                class1.getSimpleName(), obj2, typeelement.getQualifiedName(), element.getSimpleName()
                            });
                            i = 1;
                        }
                    }
                } else
                {
                    error(element, "@%s annotation contains invalid ID %d. (%s.%s)", new Object[] {
                        class1.getSimpleName(), Integer.valueOf(j), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    i = 1;
                }
            }
            k++;
        }
        alistenermethod = listenerclass.method();
        if (alistenermethod.length > 1)
        {
            throw new IllegalStateException(String.format("Multiple listener methods specified on @%s.", new Object[] {
                class1.getSimpleName()
            }));
        }
        if (alistenermethod.length == 1)
        {
            if (listenerclass.callbacks() != butterknife/internal/ListenerClass$NONE)
            {
                throw new IllegalStateException(String.format("Both method() and callback() defined on @%s.", new Object[] {
                    class1.getSimpleName()
                }));
            }
            obj = alistenermethod[0];
        } else
        {
            obj3 = (Enum)class1.getDeclaredMethod("callback", new Class[0]).invoke(obj, new Object[0]);
            alistenermethod = (ListenerMethod)((Enum) (obj3)).getDeclaringClass().getField(((Enum) (obj3)).name()).getAnnotation(butterknife/internal/ListenerMethod);
            obj = alistenermethod;
            if (alistenermethod == null)
            {
                throw new IllegalStateException(String.format("No @%s defined on @%s's %s.%s.", new Object[] {
                    butterknife/internal/ListenerMethod.getSimpleName(), class1.getSimpleName(), ((Enum) (obj3)).getDeclaringClass().getSimpleName(), ((Enum) (obj3)).name()
                }));
            }
        }
        list = executableelement.getParameters();
        if (list.size() > ((ListenerMethod) (obj)).parameters().length)
        {
            error(element, "@%s methods can have at most %s parameter(s). (%s.%s)", new Object[] {
                class1.getSimpleName(), Integer.valueOf(((ListenerMethod) (obj)).parameters().length), typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        }
        obj3 = executableelement.getReturnType();
        alistenermethod = ((ListenerMethod []) (obj3));
        if (obj3 instanceof TypeVariable)
        {
            alistenermethod = ((TypeVariable)obj3).getUpperBound();
        }
        if (!alistenermethod.toString().equals(((ListenerMethod) (obj)).returnType()))
        {
            error(element, "@%s methods must have a '%s' return type. (%s.%s)", new Object[] {
                class1.getSimpleName(), ((ListenerMethod) (obj)).returnType(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        }
        if (i != 0)
        {
            return;
        }
        alistenermethod = Parameter.NONE;
        if (list.isEmpty()) goto _L2; else goto _L1
_L1:
        aparameter = new Parameter[list.size()];
        bitset = new BitSet(list.size());
        as = ((ListenerMethod) (obj)).parameters();
        i = 0;
_L9:
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        typemirror = ((VariableElement)list.get(i)).asType();
        alistenermethod = typemirror;
        if (typemirror instanceof TypeVariable)
        {
            alistenermethod = ((TypeVariable)typemirror).getUpperBound();
        }
        j = 0;
_L5:
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L3
_L7:
        j++;
        if (true) goto _L5; else goto _L4
_L3:
        if (bitset.get(j) || !isSubtypeOfType(alistenermethod, as[j]) && !isInterface(alistenermethod)) goto _L7; else goto _L6
_L6:
        aparameter[i] = new Parameter(j, alistenermethod.toString());
        bitset.set(j);
_L4:
        if (aparameter[i] == null)
        {
            map = new StringBuilder();
            map.append("Unable to match @").append(class1.getSimpleName()).append(" method arguments. (").append(typeelement.getQualifiedName()).append('.').append(element.getSimpleName()).append(')');
            i = 0;
            while (i < aparameter.length) 
            {
                class1 = aparameter[i];
                map.append("\n\n  Parameter #").append(i + 1).append(": ").append(((VariableElement)list.get(i)).asType().toString()).append("\n    ");
                if (class1 == null)
                {
                    map.append("did not match any listener parameters");
                } else
                {
                    map.append("matched listener parameter #").append(class1.getListenerPosition() + 1).append(": ").append(class1.getType());
                }
                i++;
            }
            map.append("\n\nMethods may have up to ").append(((ListenerMethod) (obj)).parameters().length).append(" parameter(s):\n");
            class1 = ((ListenerMethod) (obj)).parameters();
            j = class1.length;
            for (i = 0; i < j; i++)
            {
                element = class1[i];
                map.append("\n  ").append(element);
            }

            map.append("\n\nThese may be listed in any order but will be searched for from top to bottom.");
            error(executableelement, map.toString(), new Object[0]);
            return;
        }
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        class1 = aparameter;
_L11:
        class1 = new ListenerBinding(s, Arrays.asList(class1), flag);
        map = getOrCreateTargetClass(map, typeelement);
        j = ai.length;
        for (i = 0; i < j; i++)
        {
            k = ai[i];
            if (!map.addListener(k, listenerclass, ((ListenerMethod) (obj)), class1))
            {
                error(element, "Multiple listener methods with return value specified for ID %d. (%s.%s)", new Object[] {
                    Integer.valueOf(k), typeelement.getQualifiedName(), element.getSimpleName()
                });
                return;
            }
        }

        set.add(typeelement.toString());
        return;
_L2:
        class1 = alistenermethod;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Set getSupportedAnnotationTypes()
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        linkedhashset.add(butterknife/InjectView.getCanonicalName());
        linkedhashset.add(butterknife/InjectViews.getCanonicalName());
        for (Iterator iterator = LISTENERS.iterator(); iterator.hasNext(); linkedhashset.add(((Class)iterator.next()).getCanonicalName())) { }
        return linkedhashset;
    }

    public SourceVersion getSupportedSourceVersion()
    {
        return SourceVersion.latestSupported();
    }

    public void init(ProcessingEnvironment processingenvironment)
    {
        this;
        JVM INSTR monitorenter ;
        super.init(processingenvironment);
        elementUtils = processingenvironment.getElementUtils();
        typeUtils = processingenvironment.getTypeUtils();
        filer = processingenvironment.getFiler();
        this;
        JVM INSTR monitorexit ;
        return;
        processingenvironment;
        throw processingenvironment;
    }

    public boolean process(Set set, RoundEnvironment roundenvironment)
    {
        for (set = findAndParseTargets(roundenvironment).entrySet().iterator(); set.hasNext();)
        {
            Object obj = (java.util.Map.Entry)set.next();
            roundenvironment = (TypeElement)((java.util.Map.Entry) (obj)).getKey();
            obj = (ViewInjector)((java.util.Map.Entry) (obj)).getValue();
            try
            {
                Writer writer = filer.createSourceFile(((ViewInjector) (obj)).getFqcn(), new Element[] {
                    roundenvironment
                }).openWriter();
                writer.write(((ViewInjector) (obj)).brewJava());
                writer.flush();
                writer.close();
            }
            catch (IOException ioexception)
            {
                error(roundenvironment, "Unable to write injector for type %s: %s", new Object[] {
                    roundenvironment, ioexception.getMessage()
                });
            }
        }

        return true;
    }

    static 
    {
        boolean flag;
        if (!butterknife/internal/ButterKnifeProcessor.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
