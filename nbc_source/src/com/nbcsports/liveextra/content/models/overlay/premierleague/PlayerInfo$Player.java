// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;


// Referenced classes of package com.nbcsports.liveextra.content.models.overlay.premierleague:
//            PlayerInfo

public class this._cls0
{

    String birthPlace;
    String country;
    String dob;
    String foot;
    String ha;
    int height;
    int jersey;
    String name;
    String nationality;
    int pid;
    String posReal;
    String position;
    String positionSide;
    final PlayerInfo this$0;
    int weight;

    protected boolean canEqual(Object obj)
    {
        return obj instanceof this._cls0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof this._cls0))
        {
            return false;
        }
        obj = (this._cls0)obj;
        if (!((this._cls0) (obj)).canEqual(this))
        {
            return false;
        }
        String s = getHa();
        String s1 = ((getHa) (obj)).getHa();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getPosition();
        s1 = ((getPosition) (obj)).getPosition();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        if (getJersey() != ((getJersey) (obj)).getJersey())
        {
            return false;
        }
        if (getPid() != ((getPid) (obj)).getPid())
        {
            return false;
        }
        s = getName();
        s1 = ((getName) (obj)).getName();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getDob();
        s1 = ((getDob) (obj)).getDob();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        if (getHeight() != ((getHeight) (obj)).getHeight())
        {
            return false;
        }
        if (getWeight() != ((getWeight) (obj)).getWeight())
        {
            return false;
        }
        s = getCountry();
        s1 = ((getCountry) (obj)).getCountry();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getPosReal();
        s1 = ((getPosReal) (obj)).getPosReal();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getPositionSide();
        s1 = ((getPositionSide) (obj)).getPositionSide();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getBirthPlace();
        s1 = ((getBirthPlace) (obj)).getBirthPlace();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getNationality();
        s1 = ((getNationality) (obj)).getNationality();
        if (s != null ? !s.equals(s1) : s1 != null)
        {
            return false;
        }
        s = getFoot();
        obj = ((getFoot) (obj)).getFoot();
        return s != null ? !s.equals(obj) : obj != null;
    }

    public String getBirthPlace()
    {
        return birthPlace;
    }

    public String getCountry()
    {
        return country;
    }

    public String getDob()
    {
        return dob;
    }

    public String getFoot()
    {
        return foot;
    }

    public String getHa()
    {
        return ha;
    }

    public int getHeight()
    {
        return height;
    }

    public int getJersey()
    {
        return jersey;
    }

    public String getName()
    {
        return name;
    }

    public String getNationality()
    {
        return nationality;
    }

    public int getPid()
    {
        return pid;
    }

    public String getPosReal()
    {
        return posReal;
    }

    public String getPosition()
    {
        return position;
    }

    public String getPositionSide()
    {
        return positionSide;
    }

    public int getWeight()
    {
        return weight;
    }

    public int hashCode()
    {
        int j2 = 0;
        String s = getHa();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getPosition();
        if (s == null)
        {
            j = 0;
        } else
        {
            j = s.hashCode();
        }
        k2 = getJersey();
        l2 = getPid();
        s = getName();
        if (s == null)
        {
            k = 0;
        } else
        {
            k = s.hashCode();
        }
        s = getDob();
        if (s == null)
        {
            l = 0;
        } else
        {
            l = s.hashCode();
        }
        i3 = getHeight();
        j3 = getWeight();
        s = getCountry();
        if (s == null)
        {
            i1 = 0;
        } else
        {
            i1 = s.hashCode();
        }
        s = getPosReal();
        if (s == null)
        {
            j1 = 0;
        } else
        {
            j1 = s.hashCode();
        }
        s = getPositionSide();
        if (s == null)
        {
            k1 = 0;
        } else
        {
            k1 = s.hashCode();
        }
        s = getBirthPlace();
        if (s == null)
        {
            l1 = 0;
        } else
        {
            l1 = s.hashCode();
        }
        s = getNationality();
        if (s == null)
        {
            i2 = 0;
        } else
        {
            i2 = s.hashCode();
        }
        s = getFoot();
        if (s != null)
        {
            j2 = s.hashCode();
        }
        return (((((((((((((i + 59) * 59 + j) * 59 + k2) * 59 + l2) * 59 + k) * 59 + l) * 59 + i3) * 59 + j3) * 59 + i1) * 59 + j1) * 59 + k1) * 59 + l1) * 59 + i2) * 59 + j2;
    }

    public ()
    {
        this$0 = PlayerInfo.this;
        super();
    }
}
