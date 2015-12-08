// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            Annotated, AnnotationMap, AnnotatedMember, AnnotatedMethodMap, 
//            AnnotatedMethod, MemberKey, AnnotatedConstructor, AnnotatedField

public final class AnnotatedClass extends Annotated
{

    private static final AnnotationMap NO_ANNOTATION_MAPS[] = new AnnotationMap[0];
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final Class _class;
    protected AnnotationMap _classAnnotations;
    protected List _constructors;
    protected List _creatorMethods;
    protected boolean _creatorsResolved;
    protected AnnotatedConstructor _defaultConstructor;
    protected List _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final ClassIntrospector.MixInResolver _mixInResolver;
    protected final Class _primaryMixIn;
    protected final List _superTypes;

    private AnnotatedClass(Class class1, List list, AnnotationIntrospector annotationintrospector, ClassIntrospector.MixInResolver mixinresolver, AnnotationMap annotationmap)
    {
        _creatorsResolved = false;
        _class = class1;
        _superTypes = list;
        _annotationIntrospector = annotationintrospector;
        _mixInResolver = mixinresolver;
        if (_mixInResolver == null)
        {
            class1 = null;
        } else
        {
            class1 = _mixInResolver.findMixInClassFor(_class);
        }
        _primaryMixIn = class1;
        _classAnnotations = annotationmap;
    }

    private void _addAnnotationsIfNotPresent(AnnotatedMember annotatedmember, Annotation aannotation[])
    {
        if (aannotation != null)
        {
            LinkedList linkedlist = null;
            int j = aannotation.length;
            for (int i = 0; i < j;)
            {
                Annotation annotation = aannotation[i];
                LinkedList linkedlist1 = linkedlist;
                if (annotatedmember.addIfNotPresent(annotation))
                {
                    linkedlist1 = linkedlist;
                    if (_isAnnotationBundle(annotation))
                    {
                        linkedlist1 = linkedlist;
                        if (linkedlist == null)
                        {
                            linkedlist1 = new LinkedList();
                        }
                        linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    }
                }
                i++;
                linkedlist = linkedlist1;
            }

            if (linkedlist != null)
            {
                for (aannotation = linkedlist.iterator(); aannotation.hasNext(); _addAnnotationsIfNotPresent(annotatedmember, (Annotation[])aannotation.next())) { }
            }
        }
    }

    private void _addAnnotationsIfNotPresent(AnnotationMap annotationmap, Annotation aannotation[])
    {
        if (aannotation != null)
        {
            LinkedList linkedlist = null;
            int j = aannotation.length;
            for (int i = 0; i < j;)
            {
                Annotation annotation = aannotation[i];
                LinkedList linkedlist1 = linkedlist;
                if (annotationmap.addIfNotPresent(annotation))
                {
                    linkedlist1 = linkedlist;
                    if (_isAnnotationBundle(annotation))
                    {
                        linkedlist1 = linkedlist;
                        if (linkedlist == null)
                        {
                            linkedlist1 = new LinkedList();
                        }
                        linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    }
                }
                i++;
                linkedlist = linkedlist1;
            }

            if (linkedlist != null)
            {
                for (aannotation = linkedlist.iterator(); aannotation.hasNext(); _addAnnotationsIfNotPresent(annotationmap, (Annotation[])aannotation.next())) { }
            }
        }
    }

    private void _addOrOverrideAnnotations(AnnotatedMember annotatedmember, Annotation aannotation[])
    {
        if (aannotation != null)
        {
            LinkedList linkedlist = null;
            int j = aannotation.length;
            for (int i = 0; i < j;)
            {
                Annotation annotation = aannotation[i];
                LinkedList linkedlist1 = linkedlist;
                if (annotatedmember.addOrOverride(annotation))
                {
                    linkedlist1 = linkedlist;
                    if (_isAnnotationBundle(annotation))
                    {
                        linkedlist1 = linkedlist;
                        if (linkedlist == null)
                        {
                            linkedlist1 = new LinkedList();
                        }
                        linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    }
                }
                i++;
                linkedlist = linkedlist1;
            }

            if (linkedlist != null)
            {
                for (aannotation = linkedlist.iterator(); aannotation.hasNext(); _addOrOverrideAnnotations(annotatedmember, (Annotation[])aannotation.next())) { }
            }
        }
    }

    private AnnotationMap _emptyAnnotationMap()
    {
        return new AnnotationMap();
    }

    private AnnotationMap[] _emptyAnnotationMaps(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        AnnotationMap aannotationmap[] = NO_ANNOTATION_MAPS;
_L4:
        return aannotationmap;
_L2:
        AnnotationMap aannotationmap1[] = new AnnotationMap[i];
        int j = 0;
        do
        {
            aannotationmap = aannotationmap1;
            if (j >= i)
            {
                continue;
            }
            aannotationmap1[j] = _emptyAnnotationMap();
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final boolean _isAnnotationBundle(Annotation annotation)
    {
        return _annotationIntrospector != null && _annotationIntrospector.isAnnotationBundle(annotation);
    }

    private boolean _isIncludableField(Field field)
    {
        int i;
        if (!field.isSynthetic())
        {
            if (!Modifier.isStatic(i = field.getModifiers()) && !Modifier.isTransient(i))
            {
                return true;
            }
        }
        return false;
    }

    public static AnnotatedClass construct(Class class1, AnnotationIntrospector annotationintrospector, ClassIntrospector.MixInResolver mixinresolver)
    {
        return new AnnotatedClass(class1, ClassUtil.findSuperTypes(class1, null), annotationintrospector, mixinresolver, null);
    }

    public static AnnotatedClass constructWithoutSuperTypes(Class class1, AnnotationIntrospector annotationintrospector, ClassIntrospector.MixInResolver mixinresolver)
    {
        return new AnnotatedClass(class1, Collections.emptyList(), annotationintrospector, mixinresolver, null);
    }

    private void resolveClassAnnotations()
    {
        _classAnnotations = new AnnotationMap();
        if (_annotationIntrospector != null)
        {
            if (_primaryMixIn != null)
            {
                _addClassMixIns(_classAnnotations, _class, _primaryMixIn);
            }
            _addAnnotationsIfNotPresent(_classAnnotations, _class.getDeclaredAnnotations());
            Class class1;
            for (Iterator iterator = _superTypes.iterator(); iterator.hasNext(); _addAnnotationsIfNotPresent(_classAnnotations, class1.getDeclaredAnnotations()))
            {
                class1 = (Class)iterator.next();
                _addClassMixIns(_classAnnotations, class1);
            }

            _addClassMixIns(_classAnnotations, java/lang/Object);
        }
    }

    private void resolveCreators()
    {
        ArrayList arraylist;
        arraylist = null;
        Object aobj[] = _class.getDeclaredConstructors();
        int k = aobj.length;
        int i = 0;
        while (i < k) 
        {
            Constructor constructor = aobj[i];
            if (constructor.getParameterTypes().length == 0)
            {
                _defaultConstructor = _constructConstructor(constructor, true);
            } else
            {
                ArrayList arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(Math.max(10, aobj.length));
                }
                arraylist1.add(_constructConstructor(constructor, false));
                arraylist = arraylist1;
            }
            i++;
        }
        if (arraylist == null)
        {
            _constructors = Collections.emptyList();
        } else
        {
            _constructors = arraylist;
        }
        if (_primaryMixIn != null && (_defaultConstructor != null || !_constructors.isEmpty()))
        {
            _addConstructorMixIns(_primaryMixIn);
        }
        if (_annotationIntrospector != null)
        {
            if (_defaultConstructor != null && _annotationIntrospector.hasIgnoreMarker(_defaultConstructor))
            {
                _defaultConstructor = null;
            }
            if (_constructors != null)
            {
                i = _constructors.size();
                do
                {
                    k = i - 1;
                    if (k < 0)
                    {
                        break;
                    }
                    i = k;
                    if (_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_constructors.get(k)))
                    {
                        _constructors.remove(k);
                        i = k;
                    }
                } while (true);
            }
        }
        arraylist = null;
        aobj = _class.getDeclaredMethods();
        k = aobj.length;
        i = 0;
        while (i < k) 
        {
            Method method = aobj[i];
            if (Modifier.isStatic(method.getModifiers()))
            {
                ArrayList arraylist2 = arraylist;
                if (arraylist == null)
                {
                    arraylist2 = new ArrayList(8);
                }
                arraylist2.add(_constructCreatorMethod(method));
                arraylist = arraylist2;
            }
            i++;
        }
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        _creatorMethods = Collections.emptyList();
_L4:
        _creatorsResolved = true;
        return;
_L2:
        _creatorMethods = arraylist;
        if (_primaryMixIn != null)
        {
            _addFactoryMixIns(_primaryMixIn);
        }
        if (_annotationIntrospector == null)
        {
            continue;
        }
        int j = _creatorMethods.size();
        do
        {
            int l = j - 1;
            if (l < 0)
            {
                continue;
            }
            j = l;
            if (_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_creatorMethods.get(l)))
            {
                _creatorMethods.remove(l);
                j = l;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void resolveFields()
    {
        Map map = _findFields(_class, null);
        if (map == null || map.size() == 0)
        {
            _fields = Collections.emptyList();
            return;
        } else
        {
            _fields = new ArrayList(map.size());
            _fields.addAll(map.values());
            return;
        }
    }

    private void resolveMemberMethods()
    {
        Object obj;
        _memberMethods = new AnnotatedMethodMap();
        obj = new AnnotatedMethodMap();
        _addMemberMethods(_class, _memberMethods, _primaryMixIn, ((AnnotatedMethodMap) (obj)));
        Iterator iterator1 = _superTypes.iterator();
        while (iterator1.hasNext()) 
        {
            Class class3 = (Class)iterator1.next();
            Class class1;
            if (_mixInResolver == null)
            {
                class1 = null;
            } else
            {
                class1 = _mixInResolver.findMixInClassFor(class3);
            }
            _addMemberMethods(class3, _memberMethods, class1, ((AnnotatedMethodMap) (obj)));
        }
        if (_mixInResolver != null)
        {
            Class class2 = _mixInResolver.findMixInClassFor(java/lang/Object);
            if (class2 != null)
            {
                _addMethodMixIns(_class, _memberMethods, class2, ((AnnotatedMethodMap) (obj)));
            }
        }
        if (_annotationIntrospector == null || ((AnnotatedMethodMap) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((AnnotatedMethodMap) (obj)).iterator();
_L3:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (AnnotatedMethod)iterator.next();
        Object obj1 = java/lang/Object.getDeclaredMethod(((AnnotatedMethod) (obj)).getName(), ((AnnotatedMethod) (obj)).getRawParameterTypes());
        if (obj1 != null)
        {
            try
            {
                obj1 = _constructMethod(((Method) (obj1)));
                _addMixOvers(((AnnotatedMethod) (obj)).getAnnotated(), ((AnnotatedMethod) (obj1)), false);
                _memberMethods.add(((AnnotatedMethod) (obj1)));
            }
            catch (Exception exception) { }
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected void _addClassMixIns(AnnotationMap annotationmap, Class class1)
    {
        if (_mixInResolver != null)
        {
            _addClassMixIns(annotationmap, class1, _mixInResolver.findMixInClassFor(class1));
        }
    }

    protected void _addClassMixIns(AnnotationMap annotationmap, Class class1, Class class2)
    {
        if (class2 != null)
        {
            _addAnnotationsIfNotPresent(annotationmap, class2.getDeclaredAnnotations());
            class1 = ClassUtil.findSuperTypes(class2, class1).iterator();
            while (class1.hasNext()) 
            {
                _addAnnotationsIfNotPresent(annotationmap, ((Class)class1.next()).getDeclaredAnnotations());
            }
        }
    }

    protected void _addConstructorMixIns(Class class1)
    {
        MemberKey memberkey;
        Class class2;
        Constructor constructor;
        int i;
        memberkey = null;
        Constructor aconstructor[];
        int j;
        int i1;
        if (_constructors == null)
        {
            i = 0;
        } else
        {
            i = _constructors.size();
        }
        aconstructor = class1.getDeclaredConstructors();
        i1 = aconstructor.length;
        j = 0;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        constructor = aconstructor[j];
        if (constructor.getParameterTypes().length != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        class2 = memberkey;
        if (_defaultConstructor != null)
        {
            _addMixOvers(constructor, _defaultConstructor, false);
            class2 = memberkey;
        }
_L4:
        j++;
        memberkey = class2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_26;
_L1:
        int l;
        class1 = memberkey;
        if (memberkey == null)
        {
            MemberKey amemberkey[] = new MemberKey[i];
            int k = 0;
            do
            {
                class1 = amemberkey;
                if (k >= i)
                {
                    break;
                }
                amemberkey[k] = new MemberKey(((AnnotatedConstructor)_constructors.get(k)).getAnnotated());
                k++;
            } while (true);
        }
        amemberkey = new MemberKey(constructor);
        l = 0;
        do
        {
            class2 = class1;
            if (l >= i)
            {
                continue; /* Loop/switch isn't completed */
            }
label0:
            {
                if (amemberkey.equals(class1[l]))
                {
                    break label0;
                }
                l++;
            }
        } while (true);
        _addMixOvers(constructor, (AnnotatedConstructor)_constructors.get(l), true);
        class2 = class1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void _addFactoryMixIns(Class class1)
    {
        MemberKey memberkey;
        Method amethod[];
        int i;
        int l;
        int i1;
        memberkey = null;
        l = _creatorMethods.size();
        amethod = class1.getDeclaredMethods();
        i1 = amethod.length;
        i = 0;
_L2:
        Class class2;
        Method method;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        method = amethod[i];
        if (Modifier.isStatic(method.getModifiers()))
        {
            break; /* Loop/switch isn't completed */
        }
        class2 = memberkey;
_L4:
        i++;
        memberkey = class2;
        if (true) goto _L2; else goto _L1
_L1:
        class2 = memberkey;
        if (method.getParameterTypes().length == 0) goto _L4; else goto _L3
_L3:
        int k;
        class1 = memberkey;
        if (memberkey == null)
        {
            MemberKey amemberkey[] = new MemberKey[l];
            int j = 0;
            do
            {
                class1 = amemberkey;
                if (j >= l)
                {
                    break;
                }
                amemberkey[j] = new MemberKey(((AnnotatedMethod)_creatorMethods.get(j)).getAnnotated());
                j++;
            } while (true);
        }
        amemberkey = new MemberKey(method);
        k = 0;
_L6:
        class2 = class1;
        if (k >= l) goto _L4; else goto _L5
_L5:
label0:
        {
            if (amemberkey.equals(class1[k]))
            {
                break label0;
            }
            k++;
        }
          goto _L6
        _addMixOvers(method, (AnnotatedMethod)_creatorMethods.get(k), true);
        class2 = class1;
          goto _L4
    }

    protected void _addFieldMixIns(Class class1, Class class2, Map map)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(class2);
        ClassUtil.findSuperTypes(class2, class1, arraylist);
        for (class1 = arraylist.iterator(); class1.hasNext();)
        {
            class2 = ((Class)class1.next()).getDeclaredFields();
            int j = class2.length;
            int i = 0;
            while (i < j) 
            {
                Field field = class2[i];
                if (_isIncludableField(field))
                {
                    AnnotatedField annotatedfield = (AnnotatedField)map.get(field.getName());
                    if (annotatedfield != null)
                    {
                        _addOrOverrideAnnotations(annotatedfield, field.getDeclaredAnnotations());
                    }
                }
                i++;
            }
        }

    }

    protected void _addMemberMethods(Class class1, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
    {
        if (class2 != null)
        {
            _addMethodMixIns(class1, annotatedmethodmap, class2, annotatedmethodmap1);
        }
        if (class1 != null)
        {
            class1 = class1.getDeclaredMethods();
            int j = class1.length;
            int i = 0;
            while (i < j) 
            {
                class2 = class1[i];
                if (_isIncludableMemberMethod(class2))
                {
                    AnnotatedMethod annotatedmethod = annotatedmethodmap.find(class2);
                    if (annotatedmethod == null)
                    {
                        annotatedmethod = _constructMethod(class2);
                        annotatedmethodmap.add(annotatedmethod);
                        class2 = annotatedmethodmap1.remove(class2);
                        if (class2 != null)
                        {
                            _addMixOvers(class2.getAnnotated(), annotatedmethod, false);
                        }
                    } else
                    {
                        _addMixUnders(class2, annotatedmethod);
                        if (annotatedmethod.getDeclaringClass().isInterface() && !class2.getDeclaringClass().isInterface())
                        {
                            annotatedmethodmap.add(annotatedmethod.withMethod(class2));
                        }
                    }
                }
                i++;
            }
        }
    }

    protected void _addMethodMixIns(Class class1, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(class2);
        ClassUtil.findSuperTypes(class2, class1, arraylist);
        for (class1 = arraylist.iterator(); class1.hasNext();)
        {
            class2 = ((Class)class1.next()).getDeclaredMethods();
            int j = class2.length;
            int i = 0;
            while (i < j) 
            {
                Method method = class2[i];
                if (_isIncludableMemberMethod(method))
                {
                    AnnotatedMethod annotatedmethod = annotatedmethodmap.find(method);
                    if (annotatedmethod != null)
                    {
                        _addMixUnders(method, annotatedmethod);
                    } else
                    {
                        AnnotatedMethod annotatedmethod1 = annotatedmethodmap1.find(method);
                        if (annotatedmethod1 != null)
                        {
                            _addMixUnders(method, annotatedmethod1);
                        } else
                        {
                            annotatedmethodmap1.add(_constructMethod(method));
                        }
                    }
                }
                i++;
            }
        }

    }

    protected void _addMixOvers(Constructor constructor, AnnotatedConstructor annotatedconstructor, boolean flag)
    {
        _addOrOverrideAnnotations(annotatedconstructor, constructor.getDeclaredAnnotations());
        if (flag)
        {
            constructor = constructor.getParameterAnnotations();
            int i = 0;
            for (int k = constructor.length; i < k; i++)
            {
                Object obj = constructor[i];
                int l = obj.length;
                for (int j = 0; j < l; j++)
                {
                    annotatedconstructor.addOrOverrideParam(i, obj[j]);
                }

            }

        }
    }

    protected void _addMixOvers(Method method, AnnotatedMethod annotatedmethod, boolean flag)
    {
        _addOrOverrideAnnotations(annotatedmethod, method.getDeclaredAnnotations());
        if (flag)
        {
            method = method.getParameterAnnotations();
            int i = 0;
            for (int k = method.length; i < k; i++)
            {
                Object obj = method[i];
                int l = obj.length;
                for (int j = 0; j < l; j++)
                {
                    annotatedmethod.addOrOverrideParam(i, obj[j]);
                }

            }

        }
    }

    protected void _addMixUnders(Method method, AnnotatedMethod annotatedmethod)
    {
        _addAnnotationsIfNotPresent(annotatedmethod, method.getDeclaredAnnotations());
    }

    protected AnnotationMap _collectRelevantAnnotations(Annotation aannotation[])
    {
        AnnotationMap annotationmap = new AnnotationMap();
        _addAnnotationsIfNotPresent(annotationmap, aannotation);
        return annotationmap;
    }

    protected AnnotationMap[] _collectRelevantAnnotations(Annotation aannotation[][])
    {
        int j = aannotation.length;
        AnnotationMap aannotationmap[] = new AnnotationMap[j];
        for (int i = 0; i < j; i++)
        {
            aannotationmap[i] = _collectRelevantAnnotations(aannotation[i]);
        }

        return aannotationmap;
    }

    protected AnnotatedConstructor _constructConstructor(Constructor constructor, boolean flag)
    {
        AnnotationMap aannotationmap1[];
        Object obj;
        int i;
        if (_annotationIntrospector == null)
        {
            return new AnnotatedConstructor(this, constructor, _emptyAnnotationMap(), _emptyAnnotationMaps(constructor.getParameterTypes().length));
        }
        if (flag)
        {
            return new AnnotatedConstructor(this, constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), null);
        }
        aannotationmap1 = constructor.getParameterAnnotations();
        i = constructor.getParameterTypes().length;
        obj = null;
        if (i == aannotationmap1.length) goto _L2; else goto _L1
_L1:
        Class class1 = constructor.getDeclaringClass();
        if (!class1.isEnum() || i != aannotationmap1.length + 2) goto _L4; else goto _L3
_L3:
        AnnotationMap aannotationmap[];
        Annotation aannotation[][];
        aannotation = new Annotation[aannotationmap1.length + 2][];
        System.arraycopy(aannotationmap1, 0, aannotation, 2, aannotationmap1.length);
        aannotationmap = _collectRelevantAnnotations(aannotation);
_L6:
        aannotationmap1 = aannotationmap;
        if (aannotationmap == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Internal error: constructor for ").append(constructor.getDeclaringClass().getName()).append(" has mismatch: ").append(i).append(" parameters; ").append(aannotation.length).append(" sets of annotations").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        aannotation = aannotationmap1;
        aannotationmap = obj;
        if (class1.isMemberClass())
        {
            aannotation = aannotationmap1;
            aannotationmap = obj;
            if (i == aannotationmap1.length + 1)
            {
                aannotation = new Annotation[aannotationmap1.length + 1][];
                System.arraycopy(aannotationmap1, 0, aannotation, 1, aannotationmap1.length);
                aannotationmap = _collectRelevantAnnotations(aannotation);
            }
        }
        if (true) goto _L6; else goto _L5
_L2:
        aannotationmap1 = _collectRelevantAnnotations(aannotationmap1);
_L5:
        return new AnnotatedConstructor(this, constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), aannotationmap1);
    }

    protected AnnotatedMethod _constructCreatorMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(this, method, _emptyAnnotationMap(), _emptyAnnotationMaps(method.getParameterTypes().length));
        } else
        {
            return new AnnotatedMethod(this, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
        }
    }

    protected AnnotatedField _constructField(Field field)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedField(this, field, _emptyAnnotationMap());
        } else
        {
            return new AnnotatedField(this, field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
        }
    }

    protected AnnotatedMethod _constructMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(this, method, _emptyAnnotationMap(), null);
        } else
        {
            return new AnnotatedMethod(this, method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), null);
        }
    }

    protected Map _findFields(Class class1, Map map)
    {
        Class class2 = class1.getSuperclass();
        Object obj = map;
        if (class2 != null)
        {
            map = _findFields(class2, map);
            Field afield[] = class1.getDeclaredFields();
            int j = afield.length;
            int i = 0;
            while (i < j) 
            {
                Field field = afield[i];
                if (_isIncludableField(field))
                {
                    obj = map;
                    if (map == null)
                    {
                        obj = new LinkedHashMap();
                    }
                    ((Map) (obj)).put(field.getName(), _constructField(field));
                    map = ((Map) (obj));
                }
                i++;
            }
            obj = map;
            if (_mixInResolver != null)
            {
                class1 = _mixInResolver.findMixInClassFor(class1);
                obj = map;
                if (class1 != null)
                {
                    _addFieldMixIns(class2, class1, map);
                    obj = map;
                }
            }
        }
        return ((Map) (obj));
    }

    protected boolean _isIncludableMemberMethod(Method method)
    {
        while (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) 
        {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            if (((AnnotatedClass)obj)._class != _class)
            {
                return false;
            }
        }
        return true;
    }

    public Iterable fields()
    {
        if (_fields == null)
        {
            resolveFields();
        }
        return _fields;
    }

    public AnnotatedMethod findMethod(String s, Class aclass[])
    {
        if (_memberMethods == null)
        {
            resolveMemberMethods();
        }
        return _memberMethods.find(s, aclass);
    }

    protected AnnotationMap getAllAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations;
    }

    public Class getAnnotated()
    {
        return _class;
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Annotation getAnnotation(Class class1)
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations.get(class1);
    }

    public Annotations getAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations;
    }

    public List getConstructors()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _constructors;
    }

    public AnnotatedConstructor getDefaultConstructor()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _defaultConstructor;
    }

    public Type getGenericType()
    {
        return _class;
    }

    public String getName()
    {
        return _class.getName();
    }

    public Class getRawType()
    {
        return _class;
    }

    public List getStaticMethods()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _creatorMethods;
    }

    public boolean hasAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations.size() > 0;
    }

    public int hashCode()
    {
        return _class.getName().hashCode();
    }

    public Iterable memberMethods()
    {
        if (_memberMethods == null)
        {
            resolveMemberMethods();
        }
        return _memberMethods;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[AnnotedClass ").append(_class.getName()).append("]").toString();
    }

}
