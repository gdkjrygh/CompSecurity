// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.view.View;
import com.a.c.a.a;

// Referenced classes of package com.facebook.widget:
//            l

public class s
    implements l
{

    private View a;
    private a b;

    public s(View view)
    {
        a = view;
        if (a.a)
        {
            b = com.a.c.a.a.a(view);
        }
    }

    public float getAlpha()
    {
        if (!a.a)
        {
            return a.getAlpha();
        } else
        {
            return b.getAlpha();
        }
    }

    public float getPivotX()
    {
        if (!a.a)
        {
            return a.getPivotX();
        } else
        {
            return b.getPivotX();
        }
    }

    public float getPivotY()
    {
        if (!a.a)
        {
            return a.getPivotY();
        } else
        {
            return b.getPivotY();
        }
    }

    public float getRotation()
    {
        if (!a.a)
        {
            return a.getRotation();
        } else
        {
            return b.getRotation();
        }
    }

    public float getScaleX()
    {
        if (!a.a)
        {
            return a.getScaleX();
        } else
        {
            return b.getScaleX();
        }
    }

    public float getScaleY()
    {
        if (!a.a)
        {
            return a.getScaleY();
        } else
        {
            return b.getScaleY();
        }
    }

    public float getTranslationX()
    {
        if (!a.a)
        {
            return a.getTranslationX();
        } else
        {
            return b.getTranslationX();
        }
    }

    public float getTranslationY()
    {
        if (!a.a)
        {
            return a.getTranslationY();
        } else
        {
            return b.getTranslationY();
        }
    }

    public float getX()
    {
        if (!a.a)
        {
            return a.getX();
        } else
        {
            return b.getX();
        }
    }

    public float getY()
    {
        if (!a.a)
        {
            return a.getY();
        } else
        {
            return b.getY();
        }
    }

    public void setAlpha(float f)
    {
        if (!a.a)
        {
            a.setAlpha(f);
            return;
        } else
        {
            b.setAlpha(f);
            return;
        }
    }

    public void setPivotX(float f)
    {
        if (!a.a)
        {
            a.setPivotX(f);
            return;
        } else
        {
            b.setPivotX(f);
            return;
        }
    }

    public void setPivotY(float f)
    {
        if (!a.a)
        {
            a.setPivotY(f);
            return;
        } else
        {
            b.setPivotY(f);
            return;
        }
    }

    public void setRotation(float f)
    {
        if (!a.a)
        {
            a.setRotation(f);
            return;
        } else
        {
            b.setRotation(f);
            return;
        }
    }

    public void setScaleX(float f)
    {
        if (!a.a)
        {
            a.setScaleX(f);
            return;
        } else
        {
            b.setScaleX(f);
            return;
        }
    }

    public void setScaleY(float f)
    {
        if (!a.a)
        {
            a.setScaleY(f);
            return;
        } else
        {
            b.setScaleY(f);
            return;
        }
    }

    public void setTranslationX(float f)
    {
        if (!a.a)
        {
            a.setTranslationX(f);
            return;
        } else
        {
            b.setTranslationX(f);
            return;
        }
    }

    public void setTranslationY(float f)
    {
        if (!a.a)
        {
            a.setTranslationY(f);
            return;
        } else
        {
            b.setTranslationY(f);
            return;
        }
    }

    public void setVisibility(int i)
    {
        if (!a.a) goto _L2; else goto _L1
_L1:
        if (i != 8 && i != 4) goto _L4; else goto _L3
_L3:
        a.clearAnimation();
_L2:
        a.setVisibility(i);
        return;
_L4:
        if (i == 0)
        {
            a.setAnimation(b);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void setX(float f)
    {
        if (!a.a)
        {
            a.setX(f);
            return;
        } else
        {
            b.setX(f);
            return;
        }
    }

    public void setY(float f)
    {
        if (!a.a)
        {
            a.setY(f);
            return;
        } else
        {
            b.setY(f);
            return;
        }
    }
}
