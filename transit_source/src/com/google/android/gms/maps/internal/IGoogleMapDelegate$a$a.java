// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPositionCreator;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.maps.model.internal.d;
import com.google.android.gms.maps.model.internal.e;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IGoogleMapDelegate, b, d, ILocationSourceDelegate, 
//            e, f, h, i, 
//            j, k, l, m, 
//            n, o, IProjectionDelegate, IUiSettingsDelegate

private static class dG
    implements IGoogleMapDelegate
{

    private IBinder dG;

    public com.google.android.gms.maps.model.internal.b addCircle(CircleOptions circleoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (circleoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        circleoptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        circleoptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return circleoptions;
        parcel.writeInt(0);
          goto _L1
        circleoptions;
        parcel1.recycle();
        parcel.recycle();
        throw circleoptions;
    }

    public c addGroundOverlay(GroundOverlayOptions groundoverlayoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        groundoverlayoptions = com.google.android.gms.maps.model.internal.el(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return groundoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        groundoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw groundoverlayoptions;
    }

    public d addMarker(MarkerOptions markeroptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        markeroptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        markeroptions = com.google.android.gms.maps.model.internal.el(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return markeroptions;
        parcel.writeInt(0);
          goto _L1
        markeroptions;
        parcel1.recycle();
        parcel.recycle();
        throw markeroptions;
    }

    public e addPolygon(PolygonOptions polygonoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polygonoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polygonoptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        polygonoptions = com.google.android.gms.maps.model.internal.el(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polygonoptions;
        parcel.writeInt(0);
          goto _L1
        polygonoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polygonoptions;
    }

    public IPolylineDelegate addPolyline(PolylineOptions polylineoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polylineoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        polylineoptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        polylineoptions = com.google.android.gms.maps.model.internal.el(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return polylineoptions;
        parcel.writeInt(0);
          goto _L1
        polylineoptions;
        parcel1.recycle();
        parcel.recycle();
        throw polylineoptions;
    }

    public f addTileOverlay(TileOverlayOptions tileoverlayoptions)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        parcel.writeInt(1);
        tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
        dG.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        tileoverlayoptions = com.google.android.gms.maps.model.internal.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return tileoverlayoptions;
        parcel.writeInt(0);
          goto _L1
        tileoverlayoptions;
        parcel1.recycle();
        parcel.recycle();
        throw tileoverlayoptions;
    }

    public void animateCamera(b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        dG.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void animateCameraWithCallback(b b1, com.google.android.gms.maps.internal.b b2)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        b1 = obj;
        if (b2 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        b1 = b2.asBinder();
        parcel.writeStrongBinder(b1);
        dG.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void animateCameraWithDurationAndCallback(b b1, int i1, com.google.android.gms.maps.internal.b b2)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        parcel.writeInt(i1);
        b1 = obj;
        if (b2 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b1 = b2.asBinder();
        parcel.writeStrongBinder(b1);
        dG.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public void clear()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public CameraPosition getCameraPosition()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        CameraPosition cameraposition = CameraPosition.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return cameraposition;
_L2:
        cameraposition = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int getMapType()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float getMaxZoomLevel()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float getMinZoomLevel()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Location getMyLocation()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Location location = (Location)Location.CREATOR.teFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return location;
_L2:
        location = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IProjectionDelegate getProjection()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IProjectionDelegate iprojectiondelegate;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        iprojectiondelegate = (parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return iprojectiondelegate;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public b getTestingHelper()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        b b1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        b1 = com.google.android.gms.dynamic.e.a.a.dG(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return b1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IUiSettingsDelegate getUiSettings()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        IUiSettingsDelegate iuisettingsdelegate;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        iuisettingsdelegate = b(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return iuisettingsdelegate;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean isBuildingsEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean isIndoorEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean isMyLocationEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean isTrafficEnabled()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void moveCamera(b b1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        dG.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public void setBuildingsEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean setIndoorEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        dG.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        if (i1 != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void setInfoWindowAdapter(com.google.android.gms.maps.internal.d d1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        d1 = d1.asBinder();
_L1:
        parcel.writeStrongBinder(d1);
        dG.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        d1 = null;
          goto _L1
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
    }

    public void setLocationSource(ILocationSourceDelegate ilocationsourcedelegate)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ilocationsourcedelegate == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ilocationsourcedelegate = ilocationsourcedelegate.asBinder();
_L1:
        parcel.writeStrongBinder(ilocationsourcedelegate);
        dG.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ilocationsourcedelegate = null;
          goto _L1
        ilocationsourcedelegate;
        parcel1.recycle();
        parcel.recycle();
        throw ilocationsourcedelegate;
    }

    public void setMapType(int i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        dG.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void setMyLocationEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void setOnCameraChangeListener(com.google.android.gms.maps.internal.e e1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        dG.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        dG.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    public void setOnMapClickListener(h h1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        h1 = h1.asBinder();
_L1:
        parcel.writeStrongBinder(h1);
        dG.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        h1 = null;
          goto _L1
        h1;
        parcel1.recycle();
        parcel.recycle();
        throw h1;
    }

    public void setOnMapLoadedCallback(i i1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (i1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        i1 = i1.asBinder();
_L1:
        parcel.writeStrongBinder(i1);
        dG.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        i1 = null;
          goto _L1
        i1;
        parcel1.recycle();
        parcel.recycle();
        throw i1;
    }

    public void setOnMapLongClickListener(j j1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        dG.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public void setOnMarkerClickListener(k k1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        k1 = k1.asBinder();
_L1:
        parcel.writeStrongBinder(k1);
        dG.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        k1 = null;
          goto _L1
        k1;
        parcel1.recycle();
        parcel.recycle();
        throw k1;
    }

    public void setOnMarkerDragListener(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        dG.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    public void setOnMyLocationButtonClickListener(m m1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        m1 = m1.asBinder();
_L1:
        parcel.writeStrongBinder(m1);
        dG.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        m1 = null;
          goto _L1
        m1;
        parcel1.recycle();
        parcel.recycle();
        throw m1;
    }

    public void setOnMyLocationChangeListener(n n1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        n1 = n1.asBinder();
_L1:
        parcel.writeStrongBinder(n1);
        dG.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        n1 = null;
          goto _L1
        n1;
        parcel1.recycle();
        parcel.recycle();
        throw n1;
    }

    public void setPadding(int i1, int j1, int k1, int l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        parcel.writeInt(l1);
        dG.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void setTrafficEnabled(boolean flag)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i1;
        i1 = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        dG.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void snapshot(o o1, b b1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        o1 = o1.asBinder();
_L1:
        parcel.writeStrongBinder(o1);
        o1 = obj;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        o1 = b1.asBinder();
        parcel.writeStrongBinder(o1);
        dG.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        o1 = null;
          goto _L1
        o1;
        parcel1.recycle();
        parcel.recycle();
        throw o1;
    }

    public void stopAnimation()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        dG.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
