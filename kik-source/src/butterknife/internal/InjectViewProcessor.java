// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import butterknife.InjectView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnFocusChanged;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;
import butterknife.OnLongClick;
import butterknife.Optional;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
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
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileObject;

// Referenced classes of package butterknife.internal:
//            ViewInjector, ListenerClass, Listener, Parameter

public final class InjectViewProcessor extends AbstractProcessor
{

    private static final List LISTENERS = Arrays.asList(new Class[] {
        butterknife/OnCheckedChanged, butterknife/OnClick, butterknife/OnEditorAction, butterknife/OnFocusChanged, butterknife/OnItemClick, butterknife/OnItemLongClick, butterknife/OnLongClick
    });
    private static final Map LISTENER_MAP = new LinkedHashMap();
    public static final String SUFFIX = "$$ViewInjector";
    static final String VIEW_TYPE = "android.view.View";
    private Elements elementUtils;
    private Filer filer;
    private Types typeUtils;

    public InjectViewProcessor()
    {
    }

    private boolean containsTypeMirror(Collection collection, TypeMirror typemirror)
    {
        typemirror = typeUtils.erasure(typemirror);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            TypeMirror typemirror1 = (TypeMirror)collection.next();
            if (typeUtils.isSameType(typemirror1, typemirror))
            {
                return true;
            }
        }

        return false;
    }

    private transient void error(Element element, String s, Object aobj[])
    {
        processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.ERROR, String.format(s, aobj), element);
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
                    stringwriter.toString()
                });
            }
        }

        for (Iterator iterator1 = LISTENERS.iterator(); iterator1.hasNext(); findAndParseListener(roundenvironment, (Class)iterator1.next(), linkedhashmap, linkedhashset)) { }
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

    private String findParentFqcn(TypeElement typeelement, Set set)
    {
        TypeMirror typemirror;
        do
        {
            typemirror = typeelement.getSuperclass();
            if (typemirror.getKind() == TypeKind.NONE)
            {
                return null;
            }
            typeelement = (TypeElement)((DeclaredType)typemirror).asElement();
        } while (!containsTypeMirror(set, typemirror));
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

    private boolean isValidForGeneratedCode(Class class1, String s, Element element)
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

    private void parseInjectView(Element element, Map map, Set set)
    {
        boolean flag = true;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        String s;
        String s1;
        int i;
        if (!isSubtypeOfType(element.asType(), "android.view.View"))
        {
            error(element, "@InjectView fields must extend from View (%s.%s).", new Object[] {
                typeelement.getQualifiedName(), element.getSimpleName()
            });
            i = 1;
        } else
        {
            i = 0;
        }
        if (i | isValidForGeneratedCode(butterknife/InjectView, "fields", element))
        {
            return;
        }
        s = element.getSimpleName().toString();
        i = ((InjectView)element.getAnnotation(butterknife/InjectView)).value();
        s1 = element.asType().toString();
        if (element.getAnnotation(butterknife/Optional) != null)
        {
            flag = false;
        }
        getOrCreateTargetClass(map, typeelement).addField(i, s, s1, flag);
        set.add(typeUtils.erasure(typeelement.asType()));
    }

    private void parseListenerAnnotation(Class class1, Element element, Map map, Set set)
    {
        if (!(element instanceof ExecutableElement) || element.getKind() != ElementKind.METHOD)
        {
            error(element, "@%s annotation must be on a method.", new Object[] {
                class1.getSimpleName()
            });
        } else
        {
            ExecutableElement executableelement = (ExecutableElement)element;
            TypeElement typeelement = (TypeElement)element.getEnclosingElement();
            Object obj = element.getAnnotation(class1);
            Object obj1 = class1.getDeclaredMethod("value", new Class[0]);
            if (obj1 == null || ((Method) (obj1)).getReturnType() != [I)
            {
                error(element, "@%s annotation lacks int[] value property. (%s.%s)", new Object[] {
                    class1, typeelement.getQualifiedName(), element.getSimpleName()
                });
                return;
            }
            int ai[] = (int[])((Method) (obj1)).invoke(obj, new Object[0]);
            String s = executableelement.getSimpleName().toString();
            int l;
            boolean flag;
            boolean flag1;
            if (element.getAnnotation(butterknife/Optional) == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = isValidForGeneratedCode(class1, "methods", element);
            obj = new LinkedHashSet(ai.length);
            l = ai.length;
            for (int i = 0; i < l; i++)
            {
                int k1 = ai[i];
                if (!((Set) (obj)).add(Integer.valueOf(k1)))
                {
                    error(element, "@%s annotation for method contains duplicate ID %d. (%s.%s)", new Object[] {
                        class1.getSimpleName(), Integer.valueOf(k1), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    flag = true;
                }
            }

            obj = (ListenerClass)class1.getAnnotation(butterknife/internal/ListenerClass);
            if (obj == null)
            {
                error(element, "No @%s defined on @%s.", new Object[] {
                    butterknife/internal/ListenerClass.getSimpleName(), class1.getSimpleName()
                });
                return;
            }
            obj1 = ((ListenerClass) (obj)).value();
            obj = (Listener)LISTENER_MAP.get(obj1);
            List list;
            if (obj == null)
            {
                try
                {
                    obj = Listener.from(elementUtils.getTypeElement(((CharSequence) (obj1))), typeUtils);
                    LISTENER_MAP.put(obj1, obj);
                }
                // Misplaced declaration of an exception variable
                catch (Element element)
                {
                    error(elementUtils.getTypeElement(class1.getName()), "%s (%s on @%s)", new Object[] {
                        element.getMessage(), obj1, class1.getName()
                    });
                    return;
                }
            }
            list = executableelement.getParameters();
            if (list.size() > ((Listener) (obj)).getParameterTypes().size())
            {
                error(element, "@%s methods can have at most %s parameter(s). (%s.%s)", new Object[] {
                    class1.getSimpleName(), Integer.valueOf(((Listener) (obj)).getParameterTypes().size()), typeelement.getQualifiedName(), element.getSimpleName()
                });
                flag = true;
            }
            if (!executableelement.getReturnType().toString().equals(((Listener) (obj)).getReturnType()))
            {
                error(element, "@%s methods must have a '%s' return type. (%s.%s)", new Object[] {
                    class1.getSimpleName(), ((Listener) (obj)).getReturnType(), typeelement.getQualifiedName(), element.getSimpleName()
                });
                flag = true;
            }
            if (!flag)
            {
                obj1 = Parameter.NONE;
                if (!list.isEmpty())
                {
                    obj1 = new Parameter[list.size()];
                    BitSet bitset = new BitSet(list.size());
                    List list1 = ((Listener) (obj)).getParameterTypes();
                    int j = 0;
label0:
                    do
                    {
label1:
                        {
                            if (j >= list.size())
                            {
                                break label0;
                            }
                            TypeMirror typemirror = ((VariableElement)list.get(j)).asType();
                            int i1 = 0;
label2:
                            do
                            {
label3:
                                {
                                    if (i1 < list1.size())
                                    {
                                        if (bitset.get(i1) || !isSubtypeOfType(typemirror, (String)list1.get(i1)))
                                        {
                                            break label3;
                                        }
                                        obj1[j] = new Parameter(i1, typemirror.toString());
                                        bitset.set(i1);
                                    }
                                    if (obj1[j] != null)
                                    {
                                        break label1;
                                    }
                                    map = new StringBuilder();
                                    map.append("Unable to match @").append(class1.getSimpleName()).append(" method arguments. (").append(typeelement.getQualifiedName()).append('.').append(element.getSimpleName()).append(')');
                                    j = 0;
                                    while (j < obj1.length) 
                                    {
                                        class1 = obj1[j];
                                        map.append("\n\n  Parameter #").append(j + 1).append(": ").append(((VariableElement)list.get(j)).asType().toString()).append("\n    ");
                                        if (class1 == null)
                                        {
                                            map.append("did not match any listener parameters");
                                        } else
                                        {
                                            map.append("matched listener parameter #").append(class1.getListenerPosition() + 1).append(": ").append(class1.getType());
                                        }
                                        j++;
                                    }
                                    break label2;
                                }
                                i1++;
                            } while (true);
                            map.append("\n\nMethods may have up to ").append(((Listener) (obj)).getParameterTypes().size()).append(" parameter(s):\n");
                            for (class1 = ((Listener) (obj)).getParameterTypes().iterator(); class1.hasNext(); map.append("\n  ").append(element))
                            {
                                element = (String)class1.next();
                            }

                            map.append("\n\nThese may be listed in any order but will be searched for from top to bottom.");
                            error(executableelement, map.toString(), new Object[0]);
                            return;
                        }
                        j++;
                    } while (true);
                }
                map = getOrCreateTargetClass(map, typeelement);
                int j1 = ai.length;
                for (int k = 0; k < j1; k++)
                {
                    int l1 = ai[k];
                    if (!map.addMethod(l1, ((Listener) (obj)), s, Arrays.asList(((Object []) (obj1))), flag1))
                    {
                        error(element, "Multiple @%s methods declared for ID %s in %s.", new Object[] {
                            class1.getSimpleName(), Integer.valueOf(l1), typeelement.getQualifiedName()
                        });
                        return;
                    }
                }

                set.add(typeUtils.erasure(typeelement.asType()));
                return;
            }
        }
    }

    public final Set getSupportedAnnotationTypes()
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        linkedhashset.add(butterknife/InjectView.getCanonicalName());
        for (Iterator iterator = LISTENERS.iterator(); iterator.hasNext(); linkedhashset.add(((Class)iterator.next()).getCanonicalName())) { }
        return linkedhashset;
    }

    public final SourceVersion getSupportedSourceVersion()
    {
        return SourceVersion.latestSupported();
    }

    public final void init(ProcessingEnvironment processingenvironment)
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

    public final boolean process(Set set, RoundEnvironment roundenvironment)
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

}
