// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.people;

import com.googlecode.flickrjandroid.util.BuddyIconable;
import com.googlecode.flickrjandroid.util.StringUtilities;
import com.googlecode.flickrjandroid.util.UrlUtilities;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.googlecode.flickrjandroid.people:
//            a, Bandwidth

public class User
    implements BuddyIconable, Serializable
{

    private static final ThreadLocal DATE_FORMATS = new a();
    private static final long serialVersionUID = 12L;
    private boolean admin;
    private Bandwidth bandwidth;
    private Date faveDate;
    private long filesizeMax;
    private int iconFarm;
    private int iconServer;
    private String id;
    private String location;
    private String mbox_sha1sum;
    private String mobileurl;
    private String pathAlias;
    private int photosCount;
    private Date photosFirstDate;
    private Date photosFirstDateTaken;
    private String photosurl;
    private boolean pro;
    private String profileurl;
    private String realName;
    private boolean revContact;
    private boolean revFamily;
    private boolean revFriend;
    private String username;

    public User()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Method amethod[];
        int i;
        obj = (User)obj;
        amethod = getClass().getMethods();
        i = 0;
_L12:
        if (i >= amethod.length)
        {
            return true;
        }
        if (!StringUtilities.getterPattern.matcher(amethod[i].getName()).find() || amethod[i].getName().equals("getClass"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        String s;
        obj1 = amethod[i].invoke(this, null);
        obj2 = amethod[i].invoke(obj, null);
        s = amethod[i].getReturnType().toString();
        if (s.indexOf("class") != 0) goto _L4; else goto _L3
_L3:
        if (obj1 == null || obj2 == null) goto _L6; else goto _L5
_L5:
        if (!obj1.equals(obj2)) goto _L1; else goto _L7
_L4:
        if (!s.equals("int")) goto _L9; else goto _L8
_L8:
        if (!((Integer)obj1).equals((Integer)obj2))
        {
            return false;
        }
          goto _L7
_L9:
        if (!s.equals("boolean")) goto _L11; else goto _L10
_L10:
        if (!((Boolean)obj1).equals((Boolean)obj2))
        {
            return false;
        }
          goto _L7
_L11:
        if (s.equals("long"))
        {
            if (!((Long)obj1).equals((Long)obj2))
            {
                return false;
            }
        } else
        {
            try
            {
                System.out.println((new StringBuilder("User#equals() missing type ")).append(amethod[i].getName()).append("|").append(amethod[i].getReturnType().toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                System.out.println((new StringBuilder("equals ")).append(amethod[i].getName()).append(" ").append(obj1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                System.out.println((new StringBuilder("equals ")).append(amethod[i].getName()).append(" ").append(obj1).toString());
            }
        }
_L7:
        i++;
          goto _L12
_L6:
        if (obj1 == null && obj2 == null) goto _L7; else goto _L13
_L13:
        if (obj1 == null) goto _L1; else goto _L14
_L14:
        if (obj2 == null)
        {
            return false;
        }
          goto _L7
    }

    public Bandwidth getBandwidth()
    {
        return bandwidth;
    }

    public String getBuddyIconUrl()
    {
        return UrlUtilities.createBuddyIconUrl(iconFarm, iconServer, id);
    }

    public Date getFaveDate()
    {
        return faveDate;
    }

    public long getFilesizeMax()
    {
        return filesizeMax;
    }

    public int getIconFarm()
    {
        return iconFarm;
    }

    public int getIconServer()
    {
        return iconServer;
    }

    public String getId()
    {
        return id;
    }

    public String getLocation()
    {
        return location;
    }

    public String getMbox_sha1sum()
    {
        return mbox_sha1sum;
    }

    public String getMobileurl()
    {
        return mobileurl;
    }

    public String getPathAlias()
    {
        return pathAlias;
    }

    public int getPhotosCount()
    {
        return photosCount;
    }

    public Date getPhotosFirstDate()
    {
        return photosFirstDate;
    }

    public Date getPhotosFirstDateTaken()
    {
        return photosFirstDateTaken;
    }

    public String getPhotosurl()
    {
        return photosurl;
    }

    public String getProfileurl()
    {
        return profileurl;
    }

    public String getRealName()
    {
        return realName;
    }

    public String getUsername()
    {
        return username;
    }

    public int hashCode()
    {
        Method amethod[];
        int j;
        int k;
        amethod = getClass().getMethods();
        k = 1;
        j = 0;
_L2:
        Object obj;
        int i;
        if (j >= amethod.length)
        {
            return k;
        }
        i = k;
        if (StringUtilities.getterPattern.matcher(amethod[j].getName()).find())
        {
            i = k;
            if (!amethod[j].getName().equals("getClass"))
            {
                try
                {
                    obj = amethod[j].invoke(this, null);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    System.out.println((new StringBuilder("hashCode ")).append(amethod[j].getName()).append(" ").append(obj).toString());
                    obj = null;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = null;
                }
                i = k;
                if (obj != null)
                {
                    if (!(obj instanceof Boolean))
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    i = k + ((Boolean)obj).hashCode();
                }
            }
        }
_L3:
        j++;
        k = i;
        if (true) goto _L2; else goto _L1
_L1:
        if (obj instanceof Integer)
        {
            i = k + ((Integer)obj).hashCode();
        } else
        if (obj instanceof String)
        {
            i = k + ((String)obj).hashCode();
        } else
        if (obj instanceof Long)
        {
            i = k + ((Long)obj).hashCode();
        } else
        {
            System.out.println((new StringBuilder("User hashCode unrecognised object: ")).append(obj.getClass().getName()).toString());
            i = k;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public boolean isAdmin()
    {
        return admin;
    }

    public boolean isPro()
    {
        return pro;
    }

    public boolean isRevContact()
    {
        return revContact;
    }

    public boolean isRevFamily()
    {
        return revFamily;
    }

    public boolean isRevFriend()
    {
        return revFriend;
    }

    public void setAdmin(boolean flag)
    {
        admin = flag;
    }

    public void setBandwidth(Bandwidth bandwidth1)
    {
        bandwidth = bandwidth1;
    }

    public void setFaveDate(long l)
    {
        setFaveDate(new Date(l));
    }

    public void setFaveDate(String s)
    {
        try
        {
            setFaveDate(Long.parseLong(s) * 1000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setFaveDate(Date date)
    {
        faveDate = date;
    }

    public void setFilesizeMax(long l)
    {
        filesizeMax = l;
    }

    public void setFilesizeMax(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setFilesizeMax(Long.parseLong(s));
        return;
        s;
    }

    public void setIconFarm(int i)
    {
        iconFarm = i;
    }

    public void setIconFarm(String s)
    {
        if (s != null)
        {
            setIconFarm(Integer.parseInt(s));
        }
    }

    public void setIconServer(int i)
    {
        iconServer = i;
    }

    public void setIconServer(String s)
    {
        if (s != null)
        {
            setIconServer(Integer.parseInt(s));
        }
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLocation(String s)
    {
        location = s;
    }

    public void setMbox_sha1sum(String s)
    {
        mbox_sha1sum = s;
    }

    public void setMobileurl(String s)
    {
        mobileurl = s;
    }

    public void setPathAlias(String s)
    {
        pathAlias = s;
    }

    public void setPhotosCount(int i)
    {
        photosCount = i;
    }

    public void setPhotosCount(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setPhotosCount(Integer.parseInt(s));
        return;
        s;
        setPhotosCount(-1);
        return;
    }

    public void setPhotosFirstDate(long l)
    {
        setPhotosFirstDate(new Date(l));
    }

    public void setPhotosFirstDate(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        setPhotosFirstDate(Long.parseLong(s) * 1000L);
        return;
        s;
    }

    public void setPhotosFirstDate(Date date)
    {
        photosFirstDate = date;
    }

    public void setPhotosFirstDateTaken(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        setPhotosFirstDateTaken(((DateFormat)DATE_FORMATS.get()).parse(s));
        return;
        s;
        setPhotosFirstDateTaken(new Date());
        return;
    }

    public void setPhotosFirstDateTaken(Date date)
    {
        photosFirstDateTaken = date;
    }

    public void setPhotosurl(String s)
    {
        photosurl = s;
    }

    public void setPro(boolean flag)
    {
        pro = flag;
    }

    public void setProfileurl(String s)
    {
        profileurl = s;
    }

    public void setRealName(String s)
    {
        realName = s;
    }

    public void setRevContact(boolean flag)
    {
        revContact = flag;
    }

    public void setRevFamily(boolean flag)
    {
        revFamily = flag;
    }

    public void setRevFriend(boolean flag)
    {
        revFriend = flag;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public String toString()
    {
        return (new StringBuilder("User [id=")).append(id).append(", username=").append(username).append("]").toString();
    }

}
