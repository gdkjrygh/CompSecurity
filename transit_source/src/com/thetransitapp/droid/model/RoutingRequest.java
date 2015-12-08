// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            SimplePlacemark

public class RoutingRequest
    implements Serializable
{
    public static final class ErrorType extends Enum
    {

        public static final ErrorType DIRECTION_UNAVAILABLE;
        private static final ErrorType ENUM$VALUES[];
        public static final ErrorType MESSAGE;
        public static final ErrorType NO_INTERNET;
        public static final ErrorType OUT_OF_SERVICE;
        public static final ErrorType REGION_IN_MAINTENANCE;
        public static final ErrorType REGION_UNSUPPORTED;
        public static final ErrorType TIMEOUT;
        public static final ErrorType UNAUTHORIZED;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/thetransitapp/droid/model/RoutingRequest$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            ErrorType aerrortype[] = ENUM$VALUES;
            int i = aerrortype.length;
            ErrorType aerrortype1[] = new ErrorType[i];
            System.arraycopy(aerrortype, 0, aerrortype1, 0, i);
            return aerrortype1;
        }

        static 
        {
            REGION_UNSUPPORTED = new ErrorType("REGION_UNSUPPORTED", 0);
            DIRECTION_UNAVAILABLE = new ErrorType("DIRECTION_UNAVAILABLE", 1);
            REGION_IN_MAINTENANCE = new ErrorType("REGION_IN_MAINTENANCE", 2);
            OUT_OF_SERVICE = new ErrorType("OUT_OF_SERVICE", 3);
            UNAUTHORIZED = new ErrorType("UNAUTHORIZED", 4);
            MESSAGE = new ErrorType("MESSAGE", 5);
            TIMEOUT = new ErrorType("TIMEOUT", 6);
            NO_INTERNET = new ErrorType("NO_INTERNET", 7);
            ENUM$VALUES = (new ErrorType[] {
                REGION_UNSUPPORTED, DIRECTION_UNAVAILABLE, REGION_IN_MAINTENANCE, OUT_OF_SERVICE, UNAUTHORIZED, MESSAGE, TIMEOUT, NO_INTERNET
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0xebced9ef657a7715L;
    private boolean arriveBy;
    private Date date;
    private SimplePlacemark end;
    private ErrorType error;
    private String errorMessage;
    private String errorTitle;
    private String feedId;
    private List itineraries;
    private SimplePlacemark start;

    public RoutingRequest()
    {
        itineraries = new ArrayList(4);
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof RoutingRequest;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RoutingRequest))
        {
            return false;
        }
        obj = (RoutingRequest)obj;
        if (!((RoutingRequest) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getStart();
        Object obj2 = ((RoutingRequest) (obj)).getStart();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getEnd();
        obj2 = ((RoutingRequest) (obj)).getEnd();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFeedId();
        obj2 = ((RoutingRequest) (obj)).getFeedId();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getItineraries();
        obj2 = ((RoutingRequest) (obj)).getItineraries();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getDate();
        obj2 = ((RoutingRequest) (obj)).getDate();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getError();
        obj2 = ((RoutingRequest) (obj)).getError();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getErrorTitle();
        obj2 = ((RoutingRequest) (obj)).getErrorTitle();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getErrorMessage();
        obj2 = ((RoutingRequest) (obj)).getErrorMessage();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        return isArriveBy() == ((RoutingRequest) (obj)).isArriveBy();
    }

    public Date getDate()
    {
        return date;
    }

    public SimplePlacemark getEnd()
    {
        return end;
    }

    public ErrorType getError()
    {
        return error;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getErrorTitle()
    {
        return errorTitle;
    }

    public String getFeedId()
    {
        return feedId;
    }

    public List getItineraries()
    {
        return itineraries;
    }

    public SimplePlacemark getStart()
    {
        return start;
    }

    public int hashCode()
    {
        int l1 = 0;
        Object obj = getStart();
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        char c;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getEnd();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getFeedId();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getItineraries();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getDate();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getError();
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        obj = getErrorTitle();
        if (obj == null)
        {
            k1 = 0;
        } else
        {
            k1 = obj.hashCode();
        }
        obj = getErrorMessage();
        if (obj != null)
        {
            l1 = obj.hashCode();
        }
        if (isArriveBy())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return ((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + c;
    }

    public boolean isArriveBy()
    {
        return arriveBy;
    }

    public void setArriveBy(boolean flag)
    {
        arriveBy = flag;
    }

    public void setDate(Date date1)
    {
        date = date1;
    }

    public void setEnd(SimplePlacemark simpleplacemark)
    {
        end = simpleplacemark;
    }

    public void setError(ErrorType errortype)
    {
        error = errortype;
    }

    public void setErrorMessage(String s)
    {
        errorMessage = s;
    }

    public void setErrorTitle(String s)
    {
        errorTitle = s;
    }

    public void setFeedId(String s)
    {
        feedId = s;
    }

    public void setItineraries(List list)
    {
        itineraries = list;
    }

    public void setStart(SimplePlacemark simpleplacemark)
    {
        start = simpleplacemark;
    }

    public String toString()
    {
        return (new StringBuilder("RoutingRequest(start=")).append(getStart()).append(", end=").append(getEnd()).append(", feedId=").append(getFeedId()).append(", itineraries=").append(getItineraries()).append(", date=").append(getDate()).append(", error=").append(getError()).append(", errorTitle=").append(getErrorTitle()).append(", errorMessage=").append(getErrorMessage()).append(", arriveBy=").append(isArriveBy()).append(")").toString();
    }
}
