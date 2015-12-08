// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.media.ExifInterface;
import java.io.IOException;

public class ExifHelper
{

    private String aperture;
    private String datetime;
    private String exposureTime;
    private String flash;
    private String focalLength;
    private String gpsAltitude;
    private String gpsAltitudeRef;
    private String gpsDateStamp;
    private String gpsLatitude;
    private String gpsLatitudeRef;
    private String gpsLongitude;
    private String gpsLongitudeRef;
    private String gpsProcessingMethod;
    private String gpsTimestamp;
    private ExifInterface inFile;
    private String iso;
    private String make;
    private String model;
    private String orientation;
    private ExifInterface outFile;
    private String whiteBalance;

    public ExifHelper()
    {
        aperture = null;
        datetime = null;
        exposureTime = null;
        flash = null;
        focalLength = null;
        gpsAltitude = null;
        gpsAltitudeRef = null;
        gpsDateStamp = null;
        gpsLatitude = null;
        gpsLatitudeRef = null;
        gpsLongitude = null;
        gpsLongitudeRef = null;
        gpsProcessingMethod = null;
        gpsTimestamp = null;
        iso = null;
        make = null;
        model = null;
        orientation = null;
        whiteBalance = null;
        inFile = null;
        outFile = null;
    }

    public void createInFile(String s)
        throws IOException
    {
        inFile = new ExifInterface(s);
    }

    public void createOutFile(String s)
        throws IOException
    {
        outFile = new ExifInterface(s);
    }

    public int getOrientation()
    {
        int i = Integer.parseInt(orientation);
        if (i != 1)
        {
            if (i == 6)
            {
                return 90;
            }
            if (i == 3)
            {
                return 180;
            }
            if (i == 8)
            {
                return 270;
            }
        }
        return 0;
    }

    public void readExifData()
    {
        aperture = inFile.getAttribute("FNumber");
        datetime = inFile.getAttribute("DateTime");
        exposureTime = inFile.getAttribute("ExposureTime");
        flash = inFile.getAttribute("Flash");
        focalLength = inFile.getAttribute("FocalLength");
        gpsAltitude = inFile.getAttribute("GPSAltitude");
        gpsAltitudeRef = inFile.getAttribute("GPSAltitudeRef");
        gpsDateStamp = inFile.getAttribute("GPSDateStamp");
        gpsLatitude = inFile.getAttribute("GPSLatitude");
        gpsLatitudeRef = inFile.getAttribute("GPSLatitudeRef");
        gpsLongitude = inFile.getAttribute("GPSLongitude");
        gpsLongitudeRef = inFile.getAttribute("GPSLongitudeRef");
        gpsProcessingMethod = inFile.getAttribute("GPSProcessingMethod");
        gpsTimestamp = inFile.getAttribute("GPSTimeStamp");
        iso = inFile.getAttribute("ISOSpeedRatings");
        make = inFile.getAttribute("Make");
        model = inFile.getAttribute("Model");
        orientation = inFile.getAttribute("Orientation");
        whiteBalance = inFile.getAttribute("WhiteBalance");
    }

    public void resetOrientation()
    {
        orientation = "1";
    }

    public void writeExifData()
        throws IOException
    {
        if (outFile == null)
        {
            return;
        }
        if (aperture != null)
        {
            outFile.setAttribute("FNumber", aperture);
        }
        if (datetime != null)
        {
            outFile.setAttribute("DateTime", datetime);
        }
        if (exposureTime != null)
        {
            outFile.setAttribute("ExposureTime", exposureTime);
        }
        if (flash != null)
        {
            outFile.setAttribute("Flash", flash);
        }
        if (focalLength != null)
        {
            outFile.setAttribute("FocalLength", focalLength);
        }
        if (gpsAltitude != null)
        {
            outFile.setAttribute("GPSAltitude", gpsAltitude);
        }
        if (gpsAltitudeRef != null)
        {
            outFile.setAttribute("GPSAltitudeRef", gpsAltitudeRef);
        }
        if (gpsDateStamp != null)
        {
            outFile.setAttribute("GPSDateStamp", gpsDateStamp);
        }
        if (gpsLatitude != null)
        {
            outFile.setAttribute("GPSLatitude", gpsLatitude);
        }
        if (gpsLatitudeRef != null)
        {
            outFile.setAttribute("GPSLatitudeRef", gpsLatitudeRef);
        }
        if (gpsLongitude != null)
        {
            outFile.setAttribute("GPSLongitude", gpsLongitude);
        }
        if (gpsLongitudeRef != null)
        {
            outFile.setAttribute("GPSLongitudeRef", gpsLongitudeRef);
        }
        if (gpsProcessingMethod != null)
        {
            outFile.setAttribute("GPSProcessingMethod", gpsProcessingMethod);
        }
        if (gpsTimestamp != null)
        {
            outFile.setAttribute("GPSTimeStamp", gpsTimestamp);
        }
        if (iso != null)
        {
            outFile.setAttribute("ISOSpeedRatings", iso);
        }
        if (make != null)
        {
            outFile.setAttribute("Make", make);
        }
        if (model != null)
        {
            outFile.setAttribute("Model", model);
        }
        if (orientation != null)
        {
            outFile.setAttribute("Orientation", orientation);
        }
        if (whiteBalance != null)
        {
            outFile.setAttribute("WhiteBalance", whiteBalance);
        }
        outFile.saveAttributes();
    }
}
