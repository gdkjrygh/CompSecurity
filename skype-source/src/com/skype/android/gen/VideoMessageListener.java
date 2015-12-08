// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.VideoMessage;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class VideoMessageListener
    implements com.skype.ObjectInterface.ObjectInterfaceIListener, com.skype.VideoMessage.VideoMessageIListener
{
    public static class OnPropertyChange
    {

        private PROPKEY _propKey;
        private ObjectInterface _sender;

        public PROPKEY getPropKey()
        {
            return _propKey;
        }

        public ObjectInterface getSender()
        {
            return _sender;
        }

        public OnPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
        {
            _sender = objectinterface;
            _propKey = propkey;
        }
    }

    public static class OnThumbnailPath
    {

        private String _localPath;
        private VideoMessage _sender;

        public String getLocalPath()
        {
            return _localPath;
        }

        public VideoMessage getSender()
        {
            return _sender;
        }

        public OnThumbnailPath(VideoMessage videomessage, String s)
        {
            _sender = videomessage;
            _localPath = s;
        }
    }


    EventBus eventBus;

    public VideoMessageListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }

    public void onThumbnailPath(VideoMessage videomessage, String s)
    {
        videomessage = new OnThumbnailPath(videomessage, s);
        eventBus.a(videomessage);
    }
}
