// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.model:
//            SimplePlacemark

public class NearbyRoutesRequest
    implements Serializable
{
    public static final class ErrorType extends Enum
    {

        private static final ErrorType ENUM$VALUES[];
        public static final ErrorType LINES_INACTIVE;
        public static final ErrorType MESSAGE;
        public static final ErrorType NO_INTERNET;
        public static final ErrorType NO_NEARBY_STOPS;
        public static final ErrorType OUT_OF_SERVICE;
        public static final ErrorType REGION_IN_MAINTENANCE;
        public static final ErrorType REGION_UNSUPPORTED;
        public static final ErrorType TIMEOUT;
        public static final ErrorType TIME_DELTA_OUT;
        public static final ErrorType UNAUTHORIZED;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType, s);
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
            NO_NEARBY_STOPS = new ErrorType("NO_NEARBY_STOPS", 1);
            LINES_INACTIVE = new ErrorType("LINES_INACTIVE", 2);
            REGION_IN_MAINTENANCE = new ErrorType("REGION_IN_MAINTENANCE", 3);
            OUT_OF_SERVICE = new ErrorType("OUT_OF_SERVICE", 4);
            UNAUTHORIZED = new ErrorType("UNAUTHORIZED", 5);
            MESSAGE = new ErrorType("MESSAGE", 6);
            TIMEOUT = new ErrorType("TIMEOUT", 7);
            NO_INTERNET = new ErrorType("NO_INTERNET", 8);
            TIME_DELTA_OUT = new ErrorType("TIME_DELTA_OUT", 9);
            ENUM$VALUES = (new ErrorType[] {
                REGION_UNSUPPORTED, NO_NEARBY_STOPS, LINES_INACTIVE, REGION_IN_MAINTENANCE, OUT_OF_SERVICE, UNAUTHORIZED, MESSAGE, TIMEOUT, NO_INTERNET, TIME_DELTA_OUT
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x153e5f82217bc7cL;
    private String bannedModesParameter;
    private boolean cancelled;
    private ErrorType error;
    private String errorMessage;
    private String errorTitle;
    private Date fetchDate;
    private boolean fetchIsFromServer;
    private boolean finished;
    private String hudStatus;
    private List inactiveRoutes;
    private boolean loadInactives;
    private boolean locked;
    private SimplePlacemark placemark;
    private List routes;
    private boolean running;
    private boolean shouldExitTripPlanner;
    private boolean shouldLoadInBackground;
    private boolean shouldPopToEmptyMapViewFirst;
    private boolean shouldPushRoutesViewOnCompletion;
    private boolean shouldRefreshLocalFeedsFirst;
    private boolean shouldResetContentOffset;
    private boolean shouldRestoreIfPossible;
    private boolean shouldScrollToResults;
    private ErrorType warning;

    public NearbyRoutesRequest()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof NearbyRoutesRequest;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof NearbyRoutesRequest))
        {
            return false;
        }
        obj = (NearbyRoutesRequest)obj;
        if (!((NearbyRoutesRequest) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getPlacemark();
        Object obj2 = ((NearbyRoutesRequest) (obj)).getPlacemark();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (isLoadInactives() != ((NearbyRoutesRequest) (obj)).isLoadInactives())
        {
            return false;
        }
        obj1 = getHudStatus();
        obj2 = ((NearbyRoutesRequest) (obj)).getHudStatus();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getBannedModesParameter();
        obj2 = ((NearbyRoutesRequest) (obj)).getBannedModesParameter();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFetchDate();
        obj2 = ((NearbyRoutesRequest) (obj)).getFetchDate();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRoutes();
        obj2 = ((NearbyRoutesRequest) (obj)).getRoutes();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getInactiveRoutes();
        obj2 = ((NearbyRoutesRequest) (obj)).getInactiveRoutes();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getError();
        obj2 = ((NearbyRoutesRequest) (obj)).getError();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getErrorTitle();
        obj2 = ((NearbyRoutesRequest) (obj)).getErrorTitle();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getErrorMessage();
        obj2 = ((NearbyRoutesRequest) (obj)).getErrorMessage();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getWarning();
        obj2 = ((NearbyRoutesRequest) (obj)).getWarning();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (isShouldRestoreIfPossible() != ((NearbyRoutesRequest) (obj)).isShouldRestoreIfPossible())
        {
            return false;
        }
        if (isShouldPopToEmptyMapViewFirst() != ((NearbyRoutesRequest) (obj)).isShouldPopToEmptyMapViewFirst())
        {
            return false;
        }
        if (isShouldRefreshLocalFeedsFirst() != ((NearbyRoutesRequest) (obj)).isShouldRefreshLocalFeedsFirst())
        {
            return false;
        }
        if (isShouldLoadInBackground() != ((NearbyRoutesRequest) (obj)).isShouldLoadInBackground())
        {
            return false;
        }
        if (isShouldExitTripPlanner() != ((NearbyRoutesRequest) (obj)).isShouldExitTripPlanner())
        {
            return false;
        }
        if (isShouldPushRoutesViewOnCompletion() != ((NearbyRoutesRequest) (obj)).isShouldPushRoutesViewOnCompletion())
        {
            return false;
        }
        if (isShouldResetContentOffset() != ((NearbyRoutesRequest) (obj)).isShouldResetContentOffset())
        {
            return false;
        }
        if (isShouldScrollToResults() != ((NearbyRoutesRequest) (obj)).isShouldScrollToResults())
        {
            return false;
        }
        if (isLocked() != ((NearbyRoutesRequest) (obj)).isLocked())
        {
            return false;
        }
        if (isRunning() != ((NearbyRoutesRequest) (obj)).isRunning())
        {
            return false;
        }
        if (isFinished() != ((NearbyRoutesRequest) (obj)).isFinished())
        {
            return false;
        }
        if (isCancelled() != ((NearbyRoutesRequest) (obj)).isCancelled())
        {
            return false;
        }
        return isFetchIsFromServer() == ((NearbyRoutesRequest) (obj)).isFetchIsFromServer();
    }

    public String getBannedModesParameter()
    {
        return bannedModesParameter;
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

    public Date getFetchDate()
    {
        return fetchDate;
    }

    public String getHudStatus()
    {
        return hudStatus;
    }

    public List getInactiveRoutes()
    {
        return inactiveRoutes;
    }

    public SimplePlacemark getPlacemark()
    {
        return placemark;
    }

    public List getRoutes()
    {
        return routes;
    }

    public ErrorType getWarning()
    {
        return warning;
    }

    public int hashCode()
    {
        Object obj = getPlacemark();
        int i;
        char c;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (isLoadInactives())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        obj = getHudStatus();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getBannedModesParameter();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getFetchDate();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getRoutes();
        if (obj == null)
        {
            i1 = 0;
        } else
        {
            i1 = obj.hashCode();
        }
        obj = getInactiveRoutes();
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        obj = getError();
        if (obj == null)
        {
            k1 = 0;
        } else
        {
            k1 = obj.hashCode();
        }
        obj = getErrorTitle();
        if (obj == null)
        {
            l1 = 0;
        } else
        {
            l1 = obj.hashCode();
        }
        obj = getErrorMessage();
        if (obj == null)
        {
            i2 = 0;
        } else
        {
            i2 = obj.hashCode();
        }
        obj = getWarning();
        if (obj == null)
        {
            j2 = 0;
        } else
        {
            j2 = obj.hashCode();
        }
        if (isShouldRestoreIfPossible())
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (isShouldPopToEmptyMapViewFirst())
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (isShouldRefreshLocalFeedsFirst())
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        if (isShouldLoadInBackground())
        {
            c4 = '\u04CF';
        } else
        {
            c4 = '\u04D5';
        }
        if (isShouldExitTripPlanner())
        {
            c5 = '\u04CF';
        } else
        {
            c5 = '\u04D5';
        }
        if (isShouldPushRoutesViewOnCompletion())
        {
            c6 = '\u04CF';
        } else
        {
            c6 = '\u04D5';
        }
        if (isShouldResetContentOffset())
        {
            c7 = '\u04CF';
        } else
        {
            c7 = '\u04D5';
        }
        if (isShouldScrollToResults())
        {
            c8 = '\u04CF';
        } else
        {
            c8 = '\u04D5';
        }
        if (isLocked())
        {
            c9 = '\u04CF';
        } else
        {
            c9 = '\u04D5';
        }
        if (isRunning())
        {
            c10 = '\u04CF';
        } else
        {
            c10 = '\u04D5';
        }
        if (isFinished())
        {
            c11 = '\u04CF';
        } else
        {
            c11 = '\u04D5';
        }
        if (isCancelled())
        {
            c12 = '\u04CF';
        } else
        {
            c12 = '\u04D5';
        }
        if (isFetchIsFromServer())
        {
            c13 = '\u04CF';
        } else
        {
            c13 = '\u04D5';
        }
        return (((((((((((((((((((((((i + 31) * 31 + c) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + c2) * 31 + c3) * 31 + c4) * 31 + c5) * 31 + c6) * 31 + c7) * 31 + c8) * 31 + c9) * 31 + c10) * 31 + c11) * 31 + c12) * 31 + c13;
    }

    public boolean isCancelled()
    {
        return cancelled;
    }

    public boolean isFetchIsFromServer()
    {
        return fetchIsFromServer;
    }

    public boolean isFinished()
    {
        return finished;
    }

    public boolean isLoadInactives()
    {
        return loadInactives;
    }

    public boolean isLocked()
    {
        return locked;
    }

    public boolean isRunning()
    {
        return running;
    }

    public boolean isShouldExitTripPlanner()
    {
        return shouldExitTripPlanner;
    }

    public boolean isShouldLoadInBackground()
    {
        return shouldLoadInBackground;
    }

    public boolean isShouldPopToEmptyMapViewFirst()
    {
        return shouldPopToEmptyMapViewFirst;
    }

    public boolean isShouldPushRoutesViewOnCompletion()
    {
        return shouldPushRoutesViewOnCompletion;
    }

    public boolean isShouldRefreshLocalFeedsFirst()
    {
        return shouldRefreshLocalFeedsFirst;
    }

    public boolean isShouldResetContentOffset()
    {
        return shouldResetContentOffset;
    }

    public boolean isShouldRestoreIfPossible()
    {
        return shouldRestoreIfPossible;
    }

    public boolean isShouldScrollToResults()
    {
        return shouldScrollToResults;
    }

    public void setBannedModesParameter(String s)
    {
        bannedModesParameter = s;
    }

    public void setCancelled(boolean flag)
    {
        cancelled = flag;
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

    public void setFetchDate(Date date)
    {
        fetchDate = date;
    }

    public void setFetchIsFromServer(boolean flag)
    {
        fetchIsFromServer = flag;
    }

    public void setFinished(boolean flag)
    {
        finished = flag;
    }

    public void setHudStatus(String s)
    {
        hudStatus = s;
    }

    public void setInactiveRoutes(List list)
    {
        inactiveRoutes = list;
    }

    public void setLoadInactives(boolean flag)
    {
        loadInactives = flag;
    }

    public void setLocked(boolean flag)
    {
        locked = flag;
    }

    public void setPlacemark(SimplePlacemark simpleplacemark)
    {
        placemark = simpleplacemark;
    }

    public void setRoutes(List list)
    {
        routes = list;
    }

    public void setRunning(boolean flag)
    {
        running = flag;
    }

    public void setShouldExitTripPlanner(boolean flag)
    {
        shouldExitTripPlanner = flag;
    }

    public void setShouldLoadInBackground(boolean flag)
    {
        shouldLoadInBackground = flag;
    }

    public void setShouldPopToEmptyMapViewFirst(boolean flag)
    {
        shouldPopToEmptyMapViewFirst = flag;
    }

    public void setShouldPushRoutesViewOnCompletion(boolean flag)
    {
        shouldPushRoutesViewOnCompletion = flag;
    }

    public void setShouldRefreshLocalFeedsFirst(boolean flag)
    {
        shouldRefreshLocalFeedsFirst = flag;
    }

    public void setShouldResetContentOffset(boolean flag)
    {
        shouldResetContentOffset = flag;
    }

    public void setShouldRestoreIfPossible(boolean flag)
    {
        shouldRestoreIfPossible = flag;
    }

    public void setShouldScrollToResults(boolean flag)
    {
        shouldScrollToResults = flag;
    }

    public void setWarning(ErrorType errortype)
    {
        warning = errortype;
    }

    public String toString()
    {
        return (new StringBuilder("NearbyRoutesRequest(placemark=")).append(getPlacemark()).append(", loadInactives=").append(isLoadInactives()).append(", hudStatus=").append(getHudStatus()).append(", bannedModesParameter=").append(getBannedModesParameter()).append(", fetchDate=").append(getFetchDate()).append(", routes=").append(getRoutes()).append(", inactiveRoutes=").append(getInactiveRoutes()).append(", error=").append(getError()).append(", errorTitle=").append(getErrorTitle()).append(", errorMessage=").append(getErrorMessage()).append(", warning=").append(getWarning()).append(", shouldRestoreIfPossible=").append(isShouldRestoreIfPossible()).append(", shouldPopToEmptyMapViewFirst=").append(isShouldPopToEmptyMapViewFirst()).append(", shouldRefreshLocalFeedsFirst=").append(isShouldRefreshLocalFeedsFirst()).append(", shouldLoadInBackground=").append(isShouldLoadInBackground()).append(", shouldExitTripPlanner=").append(isShouldExitTripPlanner()).append(", shouldPushRoutesViewOnCompletion=").append(isShouldPushRoutesViewOnCompletion()).append(", shouldResetContentOffset=").append(isShouldResetContentOffset()).append(", shouldScrollToResults=").append(isShouldScrollToResults()).append(", locked=").append(isLocked()).append(", running=").append(isRunning()).append(", finished=").append(isFinished()).append(", cancelled=").append(isCancelled()).append(", fetchIsFromServer=").append(isFetchIsFromServer()).append(")").toString();
    }
}
