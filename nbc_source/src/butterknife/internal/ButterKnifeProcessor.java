// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import butterknife.Bind;
import butterknife.BindBool;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindInt;
import butterknife.BindString;
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
import javax.lang.model.element.AnnotationMirror;
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
//            BindingClass, FieldCollectionViewBinding, ViewBindings, FieldViewBinding, 
//            ListenerClass, ListenerMethod, Parameter, MethodViewBinding, 
//            FieldResourceBinding

public final class ButterKnifeProcessor extends AbstractProcessor
{

    static final boolean $assertionsDisabled;
    public static final String ANDROID_PREFIX = "android.";
    private static final String COLOR_STATE_LIST_TYPE = "android.content.res.ColorStateList";
    private static final String DRAWABLE_TYPE = "android.graphics.drawable.Drawable";
    private static final String ITERABLE_TYPE = "java.lang.Iterable<?>";
    public static final String JAVA_PREFIX = "java.";
    private static final List LISTENERS = Arrays.asList(new Class[] {
        butterknife/OnCheckedChanged, butterknife/OnClick, butterknife/OnEditorAction, butterknife/OnFocusChange, butterknife/OnItemClick, butterknife/OnItemLongClick, butterknife/OnItemSelected, butterknife/OnLongClick, butterknife/OnPageChange, butterknife/OnTextChanged, 
        butterknife/OnTouch
    });
    private static final String LIST_TYPE = java/util/List.getCanonicalName();
    private static final String NULLABLE_ANNOTATION_NAME = "Nullable";
    public static final String SUFFIX = "$$ViewBinder";
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
                error(element, "Unable to generate view binder for @%s.\n\n%s", new Object[] {
                    class1.getSimpleName(), stringwriter.toString()
                });
            }
        }

    }

    private Map findAndParseTargets(RoundEnvironment roundenvironment)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        for (Iterator iterator = roundenvironment.getElementsAnnotatedWith(butterknife/Bind).iterator(); iterator.hasNext();)
        {
            Element element1 = (Element)iterator.next();
            try
            {
                parseBind(element1, linkedhashmap, linkedhashset);
            }
            catch (Exception exception1)
            {
                logParsingError(element1, butterknife/Bind, exception1);
            }
        }

        for (Iterator iterator1 = LISTENERS.iterator(); iterator1.hasNext(); findAndParseListener(roundenvironment, (Class)iterator1.next(), linkedhashmap, linkedhashset)) { }
        for (Iterator iterator2 = roundenvironment.getElementsAnnotatedWith(butterknife/BindBool).iterator(); iterator2.hasNext();)
        {
            Element element2 = (Element)iterator2.next();
            try
            {
                parseResourceBool(element2, linkedhashmap, linkedhashset);
            }
            catch (Exception exception2)
            {
                logParsingError(element2, butterknife/BindBool, exception2);
            }
        }

        for (Iterator iterator3 = roundenvironment.getElementsAnnotatedWith(butterknife/BindColor).iterator(); iterator3.hasNext();)
        {
            Element element3 = (Element)iterator3.next();
            try
            {
                parseResourceColor(element3, linkedhashmap, linkedhashset);
            }
            catch (Exception exception3)
            {
                logParsingError(element3, butterknife/BindColor, exception3);
            }
        }

        for (Iterator iterator4 = roundenvironment.getElementsAnnotatedWith(butterknife/BindDimen).iterator(); iterator4.hasNext();)
        {
            Element element4 = (Element)iterator4.next();
            try
            {
                parseResourceDimen(element4, linkedhashmap, linkedhashset);
            }
            catch (Exception exception4)
            {
                logParsingError(element4, butterknife/BindDimen, exception4);
            }
        }

        for (Iterator iterator5 = roundenvironment.getElementsAnnotatedWith(butterknife/BindDrawable).iterator(); iterator5.hasNext();)
        {
            Element element5 = (Element)iterator5.next();
            try
            {
                parseResourceDrawable(element5, linkedhashmap, linkedhashset);
            }
            catch (Exception exception5)
            {
                logParsingError(element5, butterknife/BindDrawable, exception5);
            }
        }

        for (Iterator iterator6 = roundenvironment.getElementsAnnotatedWith(butterknife/BindInt).iterator(); iterator6.hasNext();)
        {
            Element element6 = (Element)iterator6.next();
            try
            {
                parseResourceInt(element6, linkedhashmap, linkedhashset);
            }
            catch (Exception exception6)
            {
                logParsingError(element6, butterknife/BindInt, exception6);
            }
        }

        for (roundenvironment = roundenvironment.getElementsAnnotatedWith(butterknife/BindString).iterator(); roundenvironment.hasNext();)
        {
            Element element = (Element)roundenvironment.next();
            try
            {
                parseResourceString(element, linkedhashmap, linkedhashset);
            }
            catch (Exception exception)
            {
                logParsingError(element, butterknife/BindString, exception);
            }
        }

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
                ((BindingClass)entry.getValue()).setParentViewBinder((new StringBuilder()).append(s).append("$$ViewBinder").toString());
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
        TypeElement typeelement1;
        do
        {
            typeelement = typeelement.getSuperclass();
            if (typeelement.getKind() == TypeKind.NONE)
            {
                return null;
            }
            typeelement1 = (TypeElement)((DeclaredType)typeelement).asElement();
            typeelement = typeelement1;
        } while (!set.contains(typeelement1.toString()));
        typeelement = getPackageName(typeelement1);
        return (new StringBuilder()).append(typeelement).append(".").append(getClassName(typeelement1, typeelement)).toString();
    }

    private static String getClassName(TypeElement typeelement, String s)
    {
        int i = s.length();
        return typeelement.getQualifiedName().toString().substring(i + 1).replace('.', '$');
    }

    private BindingClass getOrCreateTargetClass(Map map, TypeElement typeelement)
    {
        BindingClass bindingclass = (BindingClass)map.get(typeelement);
        Object obj = bindingclass;
        if (bindingclass == null)
        {
            obj = typeelement.getQualifiedName().toString();
            String s = getPackageName(typeelement);
            obj = new BindingClass(s, (new StringBuilder()).append(getClassName(typeelement, s)).append("$$ViewBinder").toString(), ((String) (obj)));
            map.put(typeelement, obj);
        }
        return ((BindingClass) (obj));
    }

    private String getPackageName(TypeElement typeelement)
    {
        return elementUtils.getPackageOf(typeelement).getQualifiedName().toString();
    }

    private static boolean hasAnnotationWithName(Element element, String s)
    {
        for (element = element.getAnnotationMirrors().iterator(); element.hasNext();)
        {
            if (s.equals(((AnnotationMirror)element.next()).getAnnotationType().asElement().getSimpleName().toString()))
            {
                return true;
            }
        }

        return false;
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
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Set set = element.getModifiers();
        if (set.contains(Modifier.PRIVATE) || set.contains(Modifier.STATIC))
        {
            error(element, "@%s %s must not be private or static. (%s.%s)", new Object[] {
                class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
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
            flag = true;
        }
        return flag;
    }

    private boolean isInterface(TypeMirror typemirror)
    {
        while (!(typemirror instanceof DeclaredType) || ((DeclaredType)typemirror).asElement().getKind() != ElementKind.INTERFACE) 
        {
            return false;
        }
        return true;
    }

    private static boolean isRequiredBinding(Element element)
    {
        return !hasAnnotationWithName(element, "Nullable");
    }

    private boolean isSubtypeOfType(TypeMirror typemirror, String s)
    {
        if (!s.equals(typemirror.toString())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        StringBuilder stringbuilder;
        if (typemirror.getKind() != TypeKind.DECLARED)
        {
            return false;
        }
        typemirror = (DeclaredType)typemirror;
        List list = typemirror.getTypeArguments();
        if (list.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder = new StringBuilder(typemirror.asElement().toString());
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
        if (stringbuilder.toString().equals(s)) goto _L1; else goto _L3
_L3:
        typemirror = typemirror.asElement();
        if (!(typemirror instanceof TypeElement))
        {
            return false;
        }
        typemirror = (TypeElement)typemirror;
        if (!isSubtypeOfType(typemirror.getSuperclass(), s))
        {
            for (typemirror = typemirror.getInterfaces().iterator(); typemirror.hasNext();)
            {
                if (isSubtypeOfType((TypeMirror)typemirror.next(), s))
                {
                    return true;
                }
            }

            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void logParsingError(Element element, Class class1, Exception exception)
    {
        StringWriter stringwriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringwriter));
        error(element, "Unable to parse @%s binding.\n\n%s", new Object[] {
            class1.getSimpleName(), stringwriter
        });
    }

    private void parseBind(Element element, Map map, Set set)
    {
        if (isInaccessibleViaGeneratedCode(butterknife/Bind, "fields", element) || isBindingInWrongPackage(butterknife/Bind, element))
        {
            return;
        }
        TypeMirror typemirror = element.asType();
        if (typemirror.getKind() == TypeKind.ARRAY)
        {
            parseBindMany(element, map, set);
            return;
        }
        if (LIST_TYPE.equals(doubleErasure(typemirror)))
        {
            parseBindMany(element, map, set);
            return;
        }
        if (isSubtypeOfType(typemirror, "java.lang.Iterable<?>"))
        {
            error(element, "@%s must be a List or array. (%s.%s)", new Object[] {
                butterknife/Bind.getSimpleName(), ((TypeElement)element.getEnclosingElement()).getQualifiedName(), element.getSimpleName()
            });
            return;
        } else
        {
            parseBindOne(element, map, set);
            return;
        }
    }

    private void parseBindMany(Element element, Map map, Set set)
    {
        boolean flag1 = false;
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Object obj1 = element.asType();
        Object obj2 = doubleErasure(((TypeMirror) (obj1)));
        Object obj = null;
        if (((TypeMirror) (obj1)).getKind() == TypeKind.ARRAY)
        {
            obj = ((ArrayType)obj1).getComponentType();
            obj1 = FieldCollectionViewBinding.Kind.ARRAY;
        } else
        if (LIST_TYPE.equals(obj2))
        {
            obj1 = ((DeclaredType)obj1).getTypeArguments();
            if (((List) (obj1)).size() != 1)
            {
                error(element, "@%s List must have a generic component. (%s.%s)", new Object[] {
                    butterknife/Bind.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
                });
                flag = true;
            } else
            {
                obj = (TypeMirror)((List) (obj1)).get(0);
                flag = flag1;
            }
            obj1 = FieldCollectionViewBinding.Kind.LIST;
        } else
        {
            throw new AssertionError();
        }
        obj2 = obj;
        if (obj != null)
        {
            obj2 = obj;
            if (((TypeMirror) (obj)).getKind() == TypeKind.TYPEVAR)
            {
                obj2 = ((TypeVariable)obj).getUpperBound();
            }
        }
        flag1 = flag;
        if (obj2 != null)
        {
            flag1 = flag;
            if (!isSubtypeOfType(((TypeMirror) (obj2)), "android.view.View"))
            {
                flag1 = flag;
                if (!isInterface(((TypeMirror) (obj2))))
                {
                    error(element, "@%s List or array type must extend from View or be an interface. (%s.%s)", new Object[] {
                        butterknife/Bind.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    flag1 = true;
                }
            }
        }
        if (flag1)
        {
            return;
        }
        obj = element.getSimpleName().toString();
        int ai[] = ((Bind)element.getAnnotation(butterknife/Bind)).value();
        if (ai.length == 0)
        {
            error(element, "@%s must specify at least one ID. (%s.%s)", new Object[] {
                butterknife/Bind.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            return;
        }
        Integer integer = findDuplicate(ai);
        if (integer != null)
        {
            error(element, "@%s annotation contains duplicate ID %d. (%s.%s)", new Object[] {
                butterknife/Bind.getSimpleName(), integer, typeelement.getQualifiedName(), element.getSimpleName()
            });
        }
        if (!$assertionsDisabled && obj2 == null)
        {
            throw new AssertionError();
        } else
        {
            obj2 = ((TypeMirror) (obj2)).toString();
            boolean flag2 = isRequiredBinding(element);
            getOrCreateTargetClass(map, typeelement).addFieldCollection(ai, new FieldCollectionViewBinding(((String) (obj)), ((String) (obj2)), ((FieldCollectionViewBinding.Kind) (obj1)), flag2));
            set.add(typeelement.toString());
            return;
        }
    }

    private void parseBindOne(Element element, Map map, Set set)
    {
        boolean flag1 = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        Object obj = element.asType();
        TypeMirror typemirror = ((TypeMirror) (obj));
        if (((TypeMirror) (obj)).getKind() == TypeKind.TYPEVAR)
        {
            typemirror = ((TypeVariable)obj).getUpperBound();
        }
        boolean flag = flag1;
        if (!isSubtypeOfType(typemirror, "android.view.View"))
        {
            flag = flag1;
            if (!isInterface(typemirror))
            {
                error(element, "@%s fields must extend from View or be an interface. (%s.%s)", new Object[] {
                    butterknife/Bind.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
                });
                flag = true;
            }
        }
        int ai[] = ((Bind)element.getAnnotation(butterknife/Bind)).value();
        if (ai.length != 1)
        {
            error(element, "@%s for a view must only specify one ID. Found: %s. (%s.%s)", new Object[] {
                butterknife/Bind.getSimpleName(), Arrays.toString(ai), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (flag)
        {
            return;
        }
        int i = ai[0];
        ai = (BindingClass)map.get(typeelement);
        if (ai != null)
        {
            Object obj1 = ai.getViewBinding(i);
            map = ai;
            if (obj1 != null)
            {
                obj1 = ((ViewBindings) (obj1)).getFieldBindings().iterator();
                map = ai;
                if (((Iterator) (obj1)).hasNext())
                {
                    map = (FieldViewBinding)((Iterator) (obj1)).next();
                    error(element, "Attempt to use @%s for an already bound ID %d on '%s'. (%s.%s)", new Object[] {
                        butterknife/Bind.getSimpleName(), Integer.valueOf(i), map.getName(), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    return;
                }
            }
        } else
        {
            map = getOrCreateTargetClass(map, typeelement);
        }
        map.addField(i, new FieldViewBinding(element.getSimpleName().toString(), typemirror.toString(), isRequiredBinding(element)));
        set.add(typeelement.toString());
    }

    private void parseListenerAnnotation(Class class1, Element element, Map map, Set set)
        throws Exception
    {
        Object obj;
        Object obj1;
        ExecutableElement executableelement;
        TypeElement typeelement;
        int ai[];
        ListenerClass listenerclass;
        String s;
        List list;
        boolean flag2;
        if (!(element instanceof ExecutableElement) || element.getKind() != ElementKind.METHOD)
        {
            throw new IllegalStateException(String.format("@%s annotation must be on a method.", new Object[] {
                class1.getSimpleName()
            }));
        }
        executableelement = (ExecutableElement)element;
        typeelement = (TypeElement)element.getEnclosingElement();
        obj = element.getAnnotation(class1);
        obj1 = class1.getDeclaredMethod("value", new Class[0]);
        if (((Method) (obj1)).getReturnType() != [I)
        {
            throw new IllegalStateException(String.format("@%s annotation value() type not int[].", new Object[] {
                class1
            }));
        }
        ai = (int[])(int[])((Method) (obj1)).invoke(obj, new Object[0]);
        s = executableelement.getSimpleName().toString();
        flag2 = isRequiredBinding(element);
        boolean flag1 = isInaccessibleViaGeneratedCode(class1, "methods", element) | isBindingInWrongPackage(class1, element);
        obj1 = findDuplicate(ai);
        if (obj1 != null)
        {
            error(element, "@%s annotation for method contains duplicate ID %d. (%s.%s)", new Object[] {
                class1.getSimpleName(), obj1, typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag1 = true;
        }
        listenerclass = (ListenerClass)class1.getAnnotation(butterknife/internal/ListenerClass);
        if (listenerclass == null)
        {
            throw new IllegalStateException(String.format("No @%s defined on @%s.", new Object[] {
                butterknife/internal/ListenerClass.getSimpleName(), class1.getSimpleName()
            }));
        }
        int l1 = ai.length;
        int j1 = 0;
        while (j1 < l1) 
        {
            int i2 = ai[j1];
            boolean flag = flag1;
            if (i2 == -1)
            {
                if (ai.length == 1)
                {
                    if (!flag2)
                    {
                        error(element, "ID-free binding must not be annotated with @Nullable. (%s.%s)", new Object[] {
                            typeelement.getQualifiedName(), element.getSimpleName()
                        });
                        flag1 = true;
                    }
                    obj1 = listenerclass.targetType();
                    flag = flag1;
                    if (!isSubtypeOfType(typeelement.asType(), ((String) (obj1))))
                    {
                        flag = flag1;
                        if (!isInterface(typeelement.asType()))
                        {
                            error(element, "@%s annotation without an ID may only be used with an object of type \"%s\" or an interface. (%s.%s)", new Object[] {
                                class1.getSimpleName(), obj1, typeelement.getQualifiedName(), element.getSimpleName()
                            });
                            flag = true;
                        }
                    }
                } else
                {
                    error(element, "@%s annotation contains invalid ID %d. (%s.%s)", new Object[] {
                        class1.getSimpleName(), Integer.valueOf(i2), typeelement.getQualifiedName(), element.getSimpleName()
                    });
                    flag = true;
                }
            }
            j1++;
            flag1 = flag;
        }
        ListenerMethod alistenermethod[] = listenerclass.method();
        if (alistenermethod.length > 1)
        {
            throw new IllegalStateException(String.format("Multiple listener methods specified on @%s.", new Object[] {
                class1.getSimpleName()
            }));
        }
        TypeMirror typemirror;
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
            Enum enum = (Enum)class1.getDeclaredMethod("callback", new Class[0]).invoke(obj, new Object[0]);
            alistenermethod = (ListenerMethod)enum.getDeclaringClass().getField(enum.name()).getAnnotation(butterknife/internal/ListenerMethod);
            obj = alistenermethod;
            if (alistenermethod == null)
            {
                throw new IllegalStateException(String.format("No @%s defined on @%s's %s.%s.", new Object[] {
                    butterknife/internal/ListenerMethod.getSimpleName(), class1.getSimpleName(), enum.getDeclaringClass().getSimpleName(), enum.name()
                }));
            }
        }
        list = executableelement.getParameters();
        if (list.size() > ((ListenerMethod) (obj)).parameters().length)
        {
            error(element, "@%s methods can have at most %s parameter(s). (%s.%s)", new Object[] {
                class1.getSimpleName(), Integer.valueOf(((ListenerMethod) (obj)).parameters().length), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag1 = true;
        }
        typemirror = executableelement.getReturnType();
        alistenermethod = typemirror;
        if (typemirror instanceof TypeVariable)
        {
            alistenermethod = ((TypeVariable)typemirror).getUpperBound();
        }
        if (!alistenermethod.toString().equals(((ListenerMethod) (obj)).returnType()))
        {
            error(element, "@%s methods must have a '%s' return type. (%s.%s)", new Object[] {
                class1.getSimpleName(), ((ListenerMethod) (obj)).returnType(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag1 = true;
        }
        if (flag1)
        {
            return;
        }
        alistenermethod = Parameter.NONE;
        if (list.isEmpty()) goto _L2; else goto _L1
_L1:
        Parameter aparameter[];
        BitSet bitset;
        String as[];
        int i;
        aparameter = new Parameter[list.size()];
        bitset = new BitSet(list.size());
        as = ((ListenerMethod) (obj)).parameters();
        i = 0;
_L8:
        int k;
        alistenermethod = aparameter;
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        TypeMirror typemirror1 = ((VariableElement)list.get(i)).asType();
        alistenermethod = typemirror1;
        if (typemirror1 instanceof TypeVariable)
        {
            alistenermethod = ((TypeVariable)typemirror1).getUpperBound();
        }
        k = 0;
_L5:
        if (k >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L3
_L7:
        k++;
        if (true) goto _L5; else goto _L4
_L3:
        if (bitset.get(k) || !isSubtypeOfType(alistenermethod, as[k]) && !isInterface(alistenermethod)) goto _L7; else goto _L6
_L6:
        aparameter[i] = new Parameter(k, alistenermethod.toString());
        bitset.set(k);
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
            int l = class1.length;
            for (i = 0; i < l; i++)
            {
                element = class1[i];
                map.append("\n  ").append(element);
            }

            map.append("\n\nThese may be listed in any order but will be searched for from top to bottom.");
            error(executableelement, map.toString(), new Object[0]);
            return;
        }
        i++;
        if (true) goto _L8; else goto _L2
_L2:
        class1 = new MethodViewBinding(s, Arrays.asList(alistenermethod), flag2);
        map = getOrCreateTargetClass(map, typeelement);
        int i1 = ai.length;
        for (int j = 0; j < i1; j++)
        {
            int k1 = ai[j];
            if (!map.addMethod(k1, listenerclass, ((ListenerMethod) (obj)), class1))
            {
                error(element, "Multiple listener methods with return value specified for ID %d. (%s.%s)", new Object[] {
                    Integer.valueOf(k1), typeelement.getQualifiedName(), element.getSimpleName()
                });
                return;
            }
        }

        set.add(typeelement.toString());
        return;
    }

    private void parseResourceBool(Element element, Map map, Set set)
    {
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        if (element.asType().getKind() != TypeKind.BOOLEAN)
        {
            error(element, "@%s field type must be 'boolean'. (%s.%s)", new Object[] {
                butterknife/BindBool.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (flag | isInaccessibleViaGeneratedCode(butterknife/BindBool, "fields", element) | isBindingInWrongPackage(butterknife/BindBool, element))
        {
            return;
        } else
        {
            String s = element.getSimpleName().toString();
            int i = ((BindBool)element.getAnnotation(butterknife/BindBool)).value();
            getOrCreateTargetClass(map, typeelement).addResource(new FieldResourceBinding(i, s, "getBoolean"));
            set.add(typeelement.toString());
            return;
        }
    }

    private void parseResourceColor(Element element, Map map, Set set)
    {
        TypeElement typeelement;
        TypeMirror typemirror;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        typeelement = (TypeElement)element.getEnclosingElement();
        flag2 = false;
        typemirror = element.asType();
        if (!"android.content.res.ColorStateList".equals(typemirror.toString())) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag1 | isInaccessibleViaGeneratedCode(butterknife/BindColor, "fields", element) | isBindingInWrongPackage(butterknife/BindColor, element))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = flag2;
        if (typemirror.getKind() != TypeKind.INT)
        {
            error(element, "@%s field type must be 'int' or 'ColorStateList'. (%s.%s)", new Object[] {
                butterknife/BindColor.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag1 = true;
            flag = flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s = element.getSimpleName().toString();
        int i = ((BindColor)element.getAnnotation(butterknife/BindColor)).value();
        map = getOrCreateTargetClass(map, typeelement);
        if (flag)
        {
            element = "getColorStateList";
        } else
        {
            element = "getColor";
        }
        map.addResource(new FieldResourceBinding(i, s, element));
        set.add(typeelement.toString());
        return;
    }

    private void parseResourceDimen(Element element, Map map, Set set)
    {
        TypeElement typeelement;
        TypeMirror typemirror;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        typeelement = (TypeElement)element.getEnclosingElement();
        flag2 = false;
        typemirror = element.asType();
        if (typemirror.getKind() != TypeKind.INT) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag1 | isInaccessibleViaGeneratedCode(butterknife/BindDimen, "fields", element) | isBindingInWrongPackage(butterknife/BindDimen, element))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = flag2;
        if (typemirror.getKind() != TypeKind.FLOAT)
        {
            error(element, "@%s field type must be 'int' or 'float'. (%s.%s)", new Object[] {
                butterknife/BindDimen.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag1 = true;
            flag = flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s = element.getSimpleName().toString();
        int i = ((BindDimen)element.getAnnotation(butterknife/BindDimen)).value();
        map = getOrCreateTargetClass(map, typeelement);
        if (flag)
        {
            element = "getDimensionPixelSize";
        } else
        {
            element = "getDimension";
        }
        map.addResource(new FieldResourceBinding(i, s, element));
        set.add(typeelement.toString());
        return;
    }

    private void parseResourceDrawable(Element element, Map map, Set set)
    {
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        if (!"android.graphics.drawable.Drawable".equals(element.asType().toString()))
        {
            error(element, "@%s field type must be 'Drawable'. (%s.%s)", new Object[] {
                butterknife/BindDrawable.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (flag | isInaccessibleViaGeneratedCode(butterknife/BindDrawable, "fields", element) | isBindingInWrongPackage(butterknife/BindDrawable, element))
        {
            return;
        } else
        {
            String s = element.getSimpleName().toString();
            int i = ((BindDrawable)element.getAnnotation(butterknife/BindDrawable)).value();
            getOrCreateTargetClass(map, typeelement).addResource(new FieldResourceBinding(i, s, "getDrawable"));
            set.add(typeelement.toString());
            return;
        }
    }

    private void parseResourceInt(Element element, Map map, Set set)
    {
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        if (element.asType().getKind() != TypeKind.INT)
        {
            error(element, "@%s field type must be 'int'. (%s.%s)", new Object[] {
                butterknife/BindInt.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (flag | isInaccessibleViaGeneratedCode(butterknife/BindInt, "fields", element) | isBindingInWrongPackage(butterknife/BindInt, element))
        {
            return;
        } else
        {
            String s = element.getSimpleName().toString();
            int i = ((BindInt)element.getAnnotation(butterknife/BindInt)).value();
            getOrCreateTargetClass(map, typeelement).addResource(new FieldResourceBinding(i, s, "getInteger"));
            set.add(typeelement.toString());
            return;
        }
    }

    private void parseResourceString(Element element, Map map, Set set)
    {
        boolean flag = false;
        TypeElement typeelement = (TypeElement)element.getEnclosingElement();
        if (!"java.lang.String".equals(element.asType().toString()))
        {
            error(element, "@%s field type must be 'String'. (%s.%s)", new Object[] {
                butterknife/BindString.getSimpleName(), typeelement.getQualifiedName(), element.getSimpleName()
            });
            flag = true;
        }
        if (flag | isInaccessibleViaGeneratedCode(butterknife/BindString, "fields", element) | isBindingInWrongPackage(butterknife/BindString, element))
        {
            return;
        } else
        {
            String s = element.getSimpleName().toString();
            int i = ((BindString)element.getAnnotation(butterknife/BindString)).value();
            getOrCreateTargetClass(map, typeelement).addResource(new FieldResourceBinding(i, s, "getString"));
            set.add(typeelement.toString());
            return;
        }
    }

    public Set getSupportedAnnotationTypes()
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        linkedhashset.add(butterknife/Bind.getCanonicalName());
        for (Iterator iterator = LISTENERS.iterator(); iterator.hasNext(); linkedhashset.add(((Class)iterator.next()).getCanonicalName())) { }
        linkedhashset.add(butterknife/BindBool.getCanonicalName());
        linkedhashset.add(butterknife/BindColor.getCanonicalName());
        linkedhashset.add(butterknife/BindDimen.getCanonicalName());
        linkedhashset.add(butterknife/BindDrawable.getCanonicalName());
        linkedhashset.add(butterknife/BindInt.getCanonicalName());
        linkedhashset.add(butterknife/BindString.getCanonicalName());
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
            obj = (BindingClass)((java.util.Map.Entry) (obj)).getValue();
            try
            {
                Writer writer = filer.createSourceFile(((BindingClass) (obj)).getFqcn(), new Element[] {
                    roundenvironment
                }).openWriter();
                writer.write(((BindingClass) (obj)).brewJava());
                writer.flush();
                writer.close();
            }
            catch (IOException ioexception)
            {
                error(roundenvironment, "Unable to write view binder for type %s: %s", new Object[] {
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
