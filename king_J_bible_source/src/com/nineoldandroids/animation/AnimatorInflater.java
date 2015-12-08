// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.nineoldandroids.animation:
//            AnimatorSet, Animator, ValueAnimator, ArgbEvaluator, 
//            ObjectAnimator

public class AnimatorInflater
{

    private static final int Animator[] = {
        0x1010141, 0x1010198, 0x10101be, 0x10101bf, 0x10101c0, 0x10102de, 0x10102df, 0x10102e0
    };
    private static final int AnimatorSet[] = {
        0x10102e2
    };
    private static final int AnimatorSet_ordering = 0;
    private static final int Animator_duration = 1;
    private static final int Animator_interpolator = 0;
    private static final int Animator_repeatCount = 3;
    private static final int Animator_repeatMode = 4;
    private static final int Animator_startOffset = 2;
    private static final int Animator_valueFrom = 5;
    private static final int Animator_valueTo = 6;
    private static final int Animator_valueType = 7;
    private static final int PropertyAnimator[] = {
        0x10102e1
    };
    private static final int PropertyAnimator_propertyName = 0;
    private static final int TOGETHER = 0;
    private static final int VALUE_TYPE_FLOAT = 0;

    public AnimatorInflater()
    {
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlpullparser)
        throws XmlPullParserException, IOException
    {
        return createAnimatorFromXml(context, xmlpullparser, Xml.asAttributeSet(xmlpullparser), null, 0);
    }

    private static Animator createAnimatorFromXml(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, AnimatorSet animatorset, int i)
        throws XmlPullParserException, IOException
    {
        Object obj1 = null;
        ArrayList arraylist = null;
        int i1 = xmlpullparser.getDepth();
        do
        {
label0:
            {
                int j = xmlpullparser.next();
                if ((j != 3 || xmlpullparser.getDepth() > i1) && j != 1)
                {
                    if (j == 2)
                    {
                        Object obj = xmlpullparser.getName();
                        if (((String) (obj)).equals("objectAnimator"))
                        {
                            obj = loadObjectAnimator(context, attributeset);
                        } else
                        if (((String) (obj)).equals("animator"))
                        {
                            obj = loadAnimator(context, attributeset, null);
                        } else
                        if (((String) (obj)).equals("set"))
                        {
                            obj = new AnimatorSet();
                            obj1 = context.obtainStyledAttributes(attributeset, AnimatorSet);
                            TypedValue typedvalue = new TypedValue();
                            ((TypedArray) (obj1)).getValue(0, typedvalue);
                            int k;
                            if (typedvalue.type == 16)
                            {
                                k = typedvalue.data;
                            } else
                            {
                                k = 0;
                            }
                            createAnimatorFromXml(context, xmlpullparser, attributeset, (AnimatorSet)obj, k);
                            ((TypedArray) (obj1)).recycle();
                        } else
                        {
                            throw new RuntimeException((new StringBuilder()).append("Unknown animator name: ").append(xmlpullparser.getName()).toString());
                        }
                        obj1 = obj;
                        if (animatorset != null)
                        {
                            ArrayList arraylist1 = arraylist;
                            if (arraylist == null)
                            {
                                arraylist1 = new ArrayList();
                            }
                            arraylist1.add(obj);
                            obj1 = obj;
                            arraylist = arraylist1;
                        }
                    }
                    continue;
                }
                if (animatorset != null && arraylist != null)
                {
                    context = new Animator[arraylist.size()];
                    int l = 0;
                    for (xmlpullparser = arraylist.iterator(); xmlpullparser.hasNext();)
                    {
                        context[l] = (Animator)xmlpullparser.next();
                        l++;
                    }

                    if (i != 0)
                    {
                        break label0;
                    }
                    animatorset.playTogether(context);
                }
                return ((Animator) (obj1));
            }
            animatorset.playSequentially(context);
            return ((Animator) (obj1));
        } while (true);
    }

    public static Animator loadAnimator(Context context, int i)
        throws android.content.res.Resources.NotFoundException
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj2 = null;
        obj1 = null;
        XmlResourceParser xmlresourceparser = context.getResources().getAnimation(i);
        obj1 = xmlresourceparser;
        obj = xmlresourceparser;
        obj2 = xmlresourceparser;
        context = createAnimatorFromXml(context, xmlresourceparser);
        if (xmlresourceparser != null)
        {
            xmlresourceparser.close();
        }
        return context;
        context;
        obj = obj1;
        obj2 = new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString());
        obj = obj1;
        ((android.content.res.Resources.NotFoundException) (obj2)).initCause(context);
        obj = obj1;
        throw obj2;
        context;
        if (obj != null)
        {
            ((XmlResourceParser) (obj)).close();
        }
        throw context;
        context;
        obj = obj2;
        obj1 = new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Can't load animation resource ID #0x").append(Integer.toHexString(i)).toString());
        obj = obj2;
        ((android.content.res.Resources.NotFoundException) (obj1)).initCause(context);
        obj = obj2;
        throw obj1;
    }

    private static ValueAnimator loadAnimator(Context context, AttributeSet attributeset, ValueAnimator valueanimator)
        throws android.content.res.Resources.NotFoundException
    {
        TypedArray typedarray;
        boolean flag;
        boolean flag1;
        int i1;
        int j1;
label0:
        {
            typedarray = context.obtainStyledAttributes(attributeset, Animator);
            long l1 = typedarray.getInt(1, 0);
            long l2 = typedarray.getInt(2, 0);
            int i = typedarray.getInt(7, 0);
            attributeset = valueanimator;
            if (valueanimator == null)
            {
                attributeset = new ValueAnimator();
            }
            boolean flag2;
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            valueanimator = typedarray.peekValue(5);
            if (valueanimator != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i1 = ((TypedValue) (valueanimator)).type;
            } else
            {
                i1 = 0;
            }
            valueanimator = typedarray.peekValue(6);
            if (valueanimator != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                j1 = ((TypedValue) (valueanimator)).type;
            } else
            {
                j1 = 0;
            }
            if (!flag || i1 < 28 || i1 > 31)
            {
                flag2 = i;
                if (!flag1)
                {
                    break label0;
                }
                flag2 = i;
                if (j1 < 28)
                {
                    break label0;
                }
                flag2 = i;
                if (j1 > 31)
                {
                    break label0;
                }
            }
            flag2 = false;
            attributeset.setEvaluator(new ArgbEvaluator());
        }
        if (!flag2) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            float f;
            if (i1 == 5)
            {
                f = typedarray.getDimension(5, 0.0F);
            } else
            {
                f = typedarray.getFloat(5, 0.0F);
            }
            if (flag1)
            {
                float f2;
                if (j1 == 5)
                {
                    f2 = typedarray.getDimension(6, 0.0F);
                } else
                {
                    f2 = typedarray.getFloat(6, 0.0F);
                }
                attributeset.setFloatValues(new float[] {
                    f, f2
                });
            } else
            {
                attributeset.setFloatValues(new float[] {
                    f
                });
            }
        } else
        {
            float f1;
            if (j1 == 5)
            {
                f1 = typedarray.getDimension(6, 0.0F);
            } else
            {
                f1 = typedarray.getFloat(6, 0.0F);
            }
            attributeset.setFloatValues(new float[] {
                f1
            });
        }
_L4:
        attributeset.setDuration(l1);
        attributeset.setStartDelay(l2);
        if (typedarray.hasValue(3))
        {
            attributeset.setRepeatCount(typedarray.getInt(3, 0));
        }
        if (typedarray.hasValue(4))
        {
            attributeset.setRepeatMode(typedarray.getInt(4, 1));
        }
        i = typedarray.getResourceId(0, 0);
        if (i > 0)
        {
            attributeset.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        }
        typedarray.recycle();
        return attributeset;
_L2:
        int k;
        if (flag)
        {
            int j;
            if (i1 == 5)
            {
                j = (int)typedarray.getDimension(5, 0.0F);
            } else
            if (i1 >= 28 && i1 <= 31)
            {
                j = typedarray.getColor(5, 0);
            } else
            {
                j = typedarray.getInt(5, 0);
            }
            if (flag1)
            {
                int l;
                if (j1 == 5)
                {
                    l = (int)typedarray.getDimension(6, 0.0F);
                } else
                if (j1 >= 28 && j1 <= 31)
                {
                    l = typedarray.getColor(6, 0);
                } else
                {
                    l = typedarray.getInt(6, 0);
                }
                attributeset.setIntValues(new int[] {
                    j, l
                });
            } else
            {
                attributeset.setIntValues(new int[] {
                    j
                });
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 != 5)
        {
            break; /* Loop/switch isn't completed */
        }
        k = (int)typedarray.getDimension(6, 0.0F);
_L5:
        attributeset.setIntValues(new int[] {
            k
        });
        if (true) goto _L4; else goto _L3
_L3:
        if (j1 >= 28 && j1 <= 31)
        {
            k = typedarray.getColor(6, 0);
        } else
        {
            k = typedarray.getInt(6, 0);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private static ObjectAnimator loadObjectAnimator(Context context, AttributeSet attributeset)
        throws android.content.res.Resources.NotFoundException
    {
        ObjectAnimator objectanimator = new ObjectAnimator();
        loadAnimator(context, attributeset, objectanimator);
        context = context.obtainStyledAttributes(attributeset, PropertyAnimator);
        objectanimator.setPropertyName(context.getString(0));
        context.recycle();
        return objectanimator;
    }

}
