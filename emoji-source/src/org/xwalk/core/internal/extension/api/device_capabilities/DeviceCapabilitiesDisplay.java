// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.internal.extension.api.XWalkDisplayManager;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilities

class DeviceCapabilitiesDisplay
{

    private static final String TAG = "DeviceCapabilitiesDisplay";
    private DeviceCapabilities mDeviceCapabilities;
    private final SparseArray mDisplayList = new SparseArray();
    private final org.xwalk.core.internal.extension.api.XWalkDisplayManager.DisplayListener mDisplayListener = new org.xwalk.core.internal.extension.api.XWalkDisplayManager.DisplayListener() {

        final DeviceCapabilitiesDisplay this$0;

        public void onDisplayAdded(int i)
        {
            notifyAndSaveConnectedDisplay(mDisplayManager.getDisplay(i));
        }

        public void onDisplayChanged(int i)
        {
        }

        public void onDisplayRemoved(int i)
        {
            Display display = (Display)mDisplayList.get(i);
            if (display == null)
            {
                return;
            } else
            {
                notifyAndRemoveDisconnectedDisplay(display);
                return;
            }
        }

            
            {
                this$0 = DeviceCapabilitiesDisplay.this;
                super();
            }
    };
    private XWalkDisplayManager mDisplayManager;

    public DeviceCapabilitiesDisplay(DeviceCapabilities devicecapabilities, Context context)
    {
        mDeviceCapabilities = devicecapabilities;
        mDisplayManager = XWalkDisplayManager.getInstance(context);
        initDisplayList();
    }

    private void initDisplayList()
    {
        Display adisplay[] = mDisplayManager.getDisplays();
        int j = adisplay.length;
        for (int i = 0; i < j; i++)
        {
            Display display = adisplay[i];
            mDisplayList.put(display.getDisplayId(), display);
        }

    }

    private void notifyAndRemoveDisconnectedDisplay(Display display)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("reply", "disconnectDisplay");
            jsonobject.put("eventName", "displaydisconnect");
            jsonobject.put("data", convertDisplayToJSON(display));
            mDeviceCapabilities.broadcastMessage(jsonobject.toString());
            mDisplayList.remove(display.getDisplayId());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Display display)
        {
            mDeviceCapabilities.printErrorMessage(display);
        }
    }

    private void notifyAndSaveConnectedDisplay(Display display)
    {
        if (display == null)
        {
            return;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("reply", "connectDisplay");
            jsonobject.put("eventName", "displayconnect");
            jsonobject.put("data", convertDisplayToJSON(display));
            mDeviceCapabilities.broadcastMessage(jsonobject.toString());
            mDisplayList.put(display.getDisplayId(), display);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Display display)
        {
            mDeviceCapabilities.printErrorMessage(display);
        }
    }

    public JSONObject convertDisplayToJSON(Display display)
    {
        DisplayMetrics displaymetrics;
        Point point;
        Point point1;
        JSONObject jsonobject;
        boolean flag1;
        flag1 = true;
        displaymetrics = new DisplayMetrics();
        display.getRealMetrics(displaymetrics);
        point = new Point();
        display.getRealSize(point);
        point1 = new Point();
        display.getSize(point1);
        jsonobject = new JSONObject();
        jsonobject.put("id", Integer.toString(display.getDisplayId()));
        jsonobject.put("name", display.getName());
        boolean flag;
        if (display.getDisplayId() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsonobject.put("primary", flag);
        if (display.getDisplayId() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        try
        {
            jsonobject.put("external", flag);
            jsonobject.put("deviceXDPI", (int)displaymetrics.xdpi);
            jsonobject.put("deviceYDPI", (int)displaymetrics.ydpi);
            jsonobject.put("width", point.x);
            jsonobject.put("height", point.y);
            jsonobject.put("availWidth", point1.x);
            jsonobject.put("availHeight", point1.y);
            jsonobject.put("colorDepth", 24);
            jsonobject.put("pixelDepth", 24);
        }
        // Misplaced declaration of an exception variable
        catch (Display display)
        {
            return mDeviceCapabilities.setErrorMessage(display.toString());
        }
        return jsonobject;
    }

    public JSONObject getInfo()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        int i = 0;
        do
        {
            try
            {
                if (i >= mDisplayList.size())
                {
                    break;
                }
                jsonarray.put(convertDisplayToJSON((Display)mDisplayList.valueAt(i)));
            }
            catch (JSONException jsonexception)
            {
                return mDeviceCapabilities.setErrorMessage(jsonexception.toString());
            }
            i++;
        } while (true);
        jsonobject.put("displays", jsonarray);
        return jsonobject;
    }

    public void onDestroy()
    {
    }

    public void onPause()
    {
        mDisplayManager.unregisterDisplayListener(mDisplayListener);
    }

    public void onResume()
    {
        Display adisplay[] = mDisplayManager.getDisplays();
        int j = adisplay.length;
        int i = 0;
        while (i < j) 
        {
            Display display = adisplay[i];
            if ((Display)mDisplayList.get(display.getDisplayId()) == null)
            {
                notifyAndSaveConnectedDisplay(display);
            } else
            {
                mDisplayList.put(display.getDisplayId(), display);
            }
            i++;
        }
        i = 0;
label0:
        do
        {
            if (i < mDisplayList.size())
            {
                boolean flag1 = false;
                int l = adisplay.length;
                int k = 0;
                do
                {
label1:
                    {
                        boolean flag = flag1;
                        if (k < l)
                        {
                            Display display1 = adisplay[k];
                            if (((Display)mDisplayList.valueAt(i)).getDisplayId() != display1.getDisplayId())
                            {
                                break label1;
                            }
                            flag = true;
                        }
                        if (!flag)
                        {
                            notifyAndRemoveDisconnectedDisplay((Display)mDisplayList.valueAt(i));
                        }
                        i++;
                        continue label0;
                    }
                    k++;
                } while (true);
            }
            mDisplayManager.registerDisplayListener(mDisplayListener);
            return;
        } while (true);
    }




}
