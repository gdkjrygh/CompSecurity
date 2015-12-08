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
            int j = aannotation.length;
            LinkedList linkedlist = null;
            int i = 0;
            while (i < j) 
            {
                Annotation annotation = aannotation[i];
                if (_isAnnotationBundle(annotation))
                {
                    LinkedList linkedlist1 = linkedlist;
                    if (linkedlist == null)
                    {
                        linkedlist1 = new LinkedList();
                    }
                    linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    linkedlist = linkedlist1;
                } else
                {
                    annotatedmember.addIfNotPresent(annotation);
                }
                i++;
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
            int j = aannotation.length;
            LinkedList linkedlist = null;
            int i = 0;
            while (i < j) 
            {
                Annotation annotation = aannotation[i];
                if (_isAnnotationBundle(annotation))
                {
                    LinkedList linkedlist1 = linkedlist;
                    if (linkedlist == null)
                    {
                        linkedlist1 = new LinkedList();
                    }
                    linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    linkedlist = linkedlist1;
                } else
                {
                    annotationmap.addIfNotPresent(annotation);
                }
                i++;
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
            int j = aannotation.length;
            LinkedList linkedlist = null;
            int i = 0;
            while (i < j) 
            {
                Annotation annotation = aannotation[i];
                if (_isAnnotationBundle(annotation))
                {
                    LinkedList linkedlist1 = linkedlist;
                    if (linkedlist == null)
                    {
                        linkedlist1 = new LinkedList();
                    }
                    linkedlist1.add(annotation.annotationType().getDeclaredAnnotations());
                    linkedlist = linkedlist1;
                } else
                {
                    annotatedmember.addOrOverride(annotation);
                }
                i++;
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
        boolean flag = false;
        Object aobj[] = _class.getDeclaredConstructors();
        int i1 = aobj.length;
        int i = 0;
        arraylist = null;
        while (i < i1) 
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
                int j = _constructors.size();
                do
                {
                    j--;
                    if (j < 0)
                    {
                        break;
                    }
                    if (_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_constructors.get(j)))
                    {
                        _constructors.remove(j);
                    }
                } while (true);
            }
        }
        aobj = _class.getDeclaredMethods();
        i1 = aobj.length;
        arraylist = null;
        for (int k = ((flag) ? 1 : 0); k < i1;)
        {
            Method method = aobj[k];
            ArrayList arraylist2 = arraylist;
            if (Modifier.isStatic(method.getModifiers()))
            {
                arraylist2 = arraylist;
                if (arraylist == null)
                {
                    arraylist2 = new ArrayList(8);
                }
                arraylist2.add(_constructCreatorMethod(method));
            }
            k++;
            arraylist = arraylist2;
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
        int l = _creatorMethods.size();
        do
        {
            l--;
            if (l < 0)
            {
                continue;
            }
            if (_annotationIntrospector.hasIgnoreMarker((AnnotatedMember)_creatorMethods.get(l)))
            {
                _creatorMethods.remove(l);
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

    protected final void _addClassMixIns(AnnotationMap annotationmap, Class class1)
    {
        if (_mixInResolver != null)
        {
            _addClassMixIns(annotationmap, class1, _mixInResolver.findMixInClassFor(class1));
        }
    }

    protected final void _addClassMixIns(AnnotationMap annotationmap, Class class1, Class class2)
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

    protected final void _addConstructorMixIns(Class class1)
    {
        Object obj;
        Constructor constructor;
        int i;
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
        class1 = null;
        if (j >= i1) goto _L2; else goto _L1
_L1:
        constructor = aconstructor[j];
        if (constructor.getParameterTypes().length != 0) goto _L4; else goto _L3
_L3:
        obj = class1;
        if (_defaultConstructor != null)
        {
            _addMixOvers(constructor, _defaultConstructor, false);
            obj = class1;
        }
_L7:
        j++;
        class1 = ((Class) (obj));
        break MISSING_BLOCK_LABEL_24;
_L4:
        int l;
        if (class1 == null)
        {
            obj = new MemberKey[i];
            int k = 0;
            do
            {
                class1 = ((Class) (obj));
                if (k >= i)
                {
                    break;
                }
                obj[k] = new MemberKey(((AnnotatedConstructor)_constructors.get(k)).getAnnotated());
                k++;
            } while (true);
        }
        obj = new MemberKey(constructor);
        l = 0;
_L5:
label0:
        {
            if (l >= i)
            {
                break MISSING_BLOCK_LABEL_219;
            }
            if (!((MemberKey) (obj)).equals(class1[l]))
            {
                break label0;
            }
            _addMixOvers(constructor, (AnnotatedConstructor)_constructors.get(l), true);
            obj = class1;
        }
        continue; /* Loop/switch isn't completed */
        l++;
        if (true) goto _L5; else goto _L2
_L2:
        return;
        continue; /* Loop/switch isn't completed */
        obj = class1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void _addFactoryMixIns(Class class1)
    {
        Method amethod[];
        int i;
        int l;
        int i1;
        Object obj = null;
        l = _creatorMethods.size();
        amethod = class1.getDeclaredMethods();
        i1 = amethod.length;
        i = 0;
        class1 = obj;
_L7:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        Method method;
        MemberKey memberkey;
        int k;
        method = amethod[i];
        if (!Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length == 0)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        if (class1 == null)
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
        memberkey = new MemberKey(method);
        k = 0;
_L8:
        Class class2 = class1;
        if (k >= l) goto _L4; else goto _L3
_L3:
        if (!memberkey.equals(class1[k])) goto _L6; else goto _L5
_L5:
        _addMixOvers(method, (AnnotatedMethod)_creatorMethods.get(k), true);
        class2 = class1;
_L4:
        i++;
        class1 = class2;
          goto _L7
_L6:
        k++;
          goto _L8
_L2:
        return;
        class2 = class1;
          goto _L4
    }

    protected final void _addFieldMixIns(Class class1, Class class2, Map map)
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

    protected final void _addMemberMethods(Class class1, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
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

    protected final void _addMethodMixIns(Class class1, AnnotatedMethodMap annotatedmethodmap, Class class2, AnnotatedMethodMap annotatedmethodmap1)
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

    protected final void _addMixOvers(Constructor constructor, AnnotatedConstructor annotatedconstructor, boolean flag)
    {
        _addOrOverrideAnnotations(annotatedconstructor, constructor.getDeclaredAnnotations());
        if (flag)
        {
            constructor = constructor.getParameterAnnotations();
            int k = constructor.length;
            for (int i = 0; i < k; i++)
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

    protected final void _addMixOvers(Method method, AnnotatedMethod annotatedmethod, boolean flag)
    {
        _addOrOverrideAnnotations(annotatedmethod, method.getDeclaredAnnotations());
        if (flag)
        {
            method = method.getParameterAnnotations();
            int k = method.length;
            for (int i = 0; i < k; i++)
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

    protected final void _addMixUnders(Method method, AnnotatedMethod annotatedmethod)
    {
        _addAnnotationsIfNotPresent(annotatedmethod, method.getDeclaredAnnotations());
    }

    protected final AnnotationMap _collectRelevantAnnotations(Annotation aannotation[])
    {
        AnnotationMap annotationmap = new AnnotationMap();
        _addAnnotationsIfNotPresent(annotationmap, aannotation);
        return annotationmap;
    }

    protected final AnnotationMap[] _collectRelevantAnnotations(Annotation aannotation[][])
    {
        int j = aannotation.length;
        AnnotationMap aannotationmap[] = new AnnotationMap[j];
        for (int i = 0; i < j; i++)
        {
            aannotationmap[i] = _collectRelevantAnnotations(aannotation[i]);
        }

        return aannotationmap;
    }

    protected final AnnotatedConstructor _constructConstructor(Constructor constructor, boolean flag)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedConstructor(constructor, _emptyAnnotationMap(), _emptyAnnotationMaps(constructor.getParameterTypes().length));
        }
        if (flag)
        {
            return new AnnotatedConstructor(constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), null);
        }
        Annotation aannotation[][] = constructor.getParameterAnnotations();
        int i = constructor.getParameterTypes().length;
        if (i != aannotation.length)
        {
            Object obj = constructor.getDeclaringClass();
            AnnotationMap aannotationmap1[];
            if (((Class) (obj)).isEnum() && i == aannotation.length + 2)
            {
                obj = new Annotation[aannotation.length + 2][];
                System.arraycopy(aannotation, 0, obj, 2, aannotation.length);
                AnnotationMap aannotationmap[] = _collectRelevantAnnotations(((Annotation [][]) (obj)));
                aannotation = ((Annotation [][]) (obj));
                obj = aannotationmap;
            } else
            if (((Class) (obj)).isMemberClass() && i == aannotation.length + 1)
            {
                aannotationmap1 = new Annotation[aannotation.length + 1][];
                System.arraycopy(aannotation, 0, aannotationmap1, 1, aannotation.length);
                obj = _collectRelevantAnnotations(aannotationmap1);
                aannotation = aannotationmap1;
            } else
            {
                obj = null;
            }
            aannotationmap1 = ((AnnotationMap []) (obj));
            if (obj == null)
            {
                throw new IllegalStateException((new StringBuilder("Internal error: constructor for ")).append(constructor.getDeclaringClass().getName()).append(" has mismatch: ").append(i).append(" parameters; ").append(aannotation.length).append(" sets of annotations").toString());
            }
        } else
        {
            aannotationmap1 = _collectRelevantAnnotations(aannotation);
        }
        return new AnnotatedConstructor(constructor, _collectRelevantAnnotations(constructor.getDeclaredAnnotations()), aannotationmap1);
    }

    protected final AnnotatedMethod _constructCreatorMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), _emptyAnnotationMaps(method.getParameterTypes().length));
        } else
        {
            return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), _collectRelevantAnnotations(method.getParameterAnnotations()));
        }
    }

    protected final AnnotatedField _constructField(Field field)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedField(field, _emptyAnnotationMap());
        } else
        {
            return new AnnotatedField(field, _collectRelevantAnnotations(field.getDeclaredAnnotations()));
        }
    }

    protected final AnnotatedMethod _constructMethod(Method method)
    {
        if (_annotationIntrospector == null)
        {
            return new AnnotatedMethod(method, _emptyAnnotationMap(), null);
        } else
        {
            return new AnnotatedMethod(method, _collectRelevantAnnotations(method.getDeclaredAnnotations()), null);
        }
    }

    protected final Map _findFields(Class class1, Map map)
    {
        Class class2 = class1.getSuperclass();
        if (class2 != null)
        {
            map = _findFields(class2, map);
            Field afield[] = class1.getDeclaredFields();
            int j = afield.length;
            for (int i = 0; i < j;)
            {
                Field field = afield[i];
                Object obj = map;
                if (_isIncludableField(field))
                {
                    obj = map;
                    if (map == null)
                    {
                        obj = new LinkedHashMap();
                    }
                    ((Map) (obj)).put(field.getName(), _constructField(field));
                }
                i++;
                map = ((Map) (obj));
            }

            if (_mixInResolver != null)
            {
                class1 = _mixInResolver.findMixInClassFor(class1);
                if (class1 != null)
                {
                    _addFieldMixIns(class2, class1, map);
                }
            }
            return map;
        } else
        {
            return map;
        }
    }

    protected final boolean _isIncludableMemberMethod(Method method)
    {
        while (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) 
        {
            return false;
        }
        return true;
    }

    public final Iterable fields()
    {
        if (_fields == null)
        {
            resolveFields();
        }
        return _fields;
    }

    public final AnnotatedMethod findMethod(String s, Class aclass[])
    {
        if (_memberMethods == null)
        {
            resolveMemberMethods();
        }
        return _memberMethods.find(s, aclass);
    }

    protected final AnnotationMap getAllAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations;
    }

    public final Class getAnnotated()
    {
        return _class;
    }

    public final volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public final Annotation getAnnotation(Class class1)
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations.get(class1);
    }

    public final Annotations getAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations;
    }

    public final List getConstructors()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _constructors;
    }

    public final AnnotatedConstructor getDefaultConstructor()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _defaultConstructor;
    }

    public final Type getGenericType()
    {
        return _class;
    }

    public final String getName()
    {
        return _class.getName();
    }

    public final Class getRawType()
    {
        return _class;
    }

    public final List getStaticMethods()
    {
        if (!_creatorsResolved)
        {
            resolveCreators();
        }
        return _creatorMethods;
    }

    public final boolean hasAnnotations()
    {
        if (_classAnnotations == null)
        {
            resolveClassAnnotations();
        }
        return _classAnnotations.size() > 0;
    }

    public final Iterable memberMethods()
    {
        if (_memberMethods == null)
        {
            resolveMemberMethods();
        }
        return _memberMethods;
    }

    public final String toString()
    {
        return (new StringBuilder("[AnnotedClass ")).append(_class.getName()).append("]").toString();
    }

}
