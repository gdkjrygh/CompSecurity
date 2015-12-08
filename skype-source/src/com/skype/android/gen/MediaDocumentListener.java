// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class MediaDocumentListener
    implements com.skype.MediaDocument.MediaDocumentIListener, com.skype.ObjectInterface.ObjectInterfaceIListener
{
    public static class OnDownloadError
    {

        private com.skype.MediaDocument.NETWORK_ERROR _error;
        private boolean _isCritical;
        private String _profile;
        private MediaDocument _sender;

        public com.skype.MediaDocument.NETWORK_ERROR getError()
        {
            return _error;
        }

        public boolean getIsCritical()
        {
            return _isCritical;
        }

        public String getProfile()
        {
            return _profile;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public OnDownloadError(MediaDocument mediadocument, String s, com.skype.MediaDocument.NETWORK_ERROR network_error, boolean flag)
        {
            _sender = mediadocument;
            _profile = s;
            _error = network_error;
            _isCritical = flag;
        }
    }

    public static class OnMediaLinkProgress
    {

        private int _preparationPercents;
        private String _profile;
        private MediaDocument _sender;
        private int _sizeDownloaded;
        private int _totalSize;

        public int getPreparationPercents()
        {
            return _preparationPercents;
        }

        public String getProfile()
        {
            return _profile;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public int getSizeDownloaded()
        {
            return _sizeDownloaded;
        }

        public int getTotalSize()
        {
            return _totalSize;
        }

        public OnMediaLinkProgress(MediaDocument mediadocument, String s, int i, int j, int k)
        {
            _sender = mediadocument;
            _profile = s;
            _preparationPercents = i;
            _sizeDownloaded = j;
            _totalSize = k;
        }
    }

    public static class OnMediaLinkStatusChange
    {

        private String _path;
        private String _profile;
        private MediaDocument _sender;
        private com.skype.MediaDocument.MEDIA_STATUS _status;

        public String getPath()
        {
            return _path;
        }

        public String getProfile()
        {
            return _profile;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public com.skype.MediaDocument.MEDIA_STATUS getStatus()
        {
            return _status;
        }

        public OnMediaLinkStatusChange(MediaDocument mediadocument, com.skype.MediaDocument.MEDIA_STATUS media_status, String s, String s1)
        {
            _sender = mediadocument;
            _status = media_status;
            _profile = s;
            _path = s1;
        }
    }

    public static class OnMetadataUpdated
    {

        private MediaDocument _sender;

        public MediaDocument getSender()
        {
            return _sender;
        }

        public OnMetadataUpdated(MediaDocument mediadocument)
        {
            _sender = mediadocument;
        }
    }

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

    public static class OnUploadError
    {

        private String _contentId;
        private com.skype.MediaDocument.NETWORK_ERROR _error;
        private boolean _isCritical;
        private MediaDocument _sender;

        public String getContentId()
        {
            return _contentId;
        }

        public com.skype.MediaDocument.NETWORK_ERROR getError()
        {
            return _error;
        }

        public boolean getIsCritical()
        {
            return _isCritical;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public OnUploadError(MediaDocument mediadocument, String s, com.skype.MediaDocument.NETWORK_ERROR network_error, boolean flag)
        {
            _sender = mediadocument;
            _contentId = s;
            _error = network_error;
            _isCritical = flag;
        }
    }

    public static class OnUploadProgress
    {

        private String _contentId;
        private MediaDocument _sender;
        private int _sizeUploaded;
        private int _totalSize;

        public String getContentId()
        {
            return _contentId;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public int getSizeUploaded()
        {
            return _sizeUploaded;
        }

        public int getTotalSize()
        {
            return _totalSize;
        }

        public OnUploadProgress(MediaDocument mediadocument, String s, int i, int j)
        {
            _sender = mediadocument;
            _contentId = s;
            _sizeUploaded = i;
            _totalSize = j;
        }
    }

    public static class OnUploadStatusChanged
    {

        private String _contentId;
        private MediaDocument _sender;
        private com.skype.MediaDocument.UPLOAD_STATUS _status;

        public String getContentId()
        {
            return _contentId;
        }

        public MediaDocument getSender()
        {
            return _sender;
        }

        public com.skype.MediaDocument.UPLOAD_STATUS getStatus()
        {
            return _status;
        }

        public OnUploadStatusChanged(MediaDocument mediadocument, String s, com.skype.MediaDocument.UPLOAD_STATUS upload_status)
        {
            _sender = mediadocument;
            _contentId = s;
            _status = upload_status;
        }
    }


    EventBus eventBus;

    public MediaDocumentListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onDownloadError(MediaDocument mediadocument, String s, com.skype.MediaDocument.NETWORK_ERROR network_error, boolean flag)
    {
        mediadocument = new OnDownloadError(mediadocument, s, network_error, flag);
        eventBus.a(mediadocument);
    }

    public void onMediaLinkProgress(MediaDocument mediadocument, String s, int i, int j, int k)
    {
        mediadocument = new OnMediaLinkProgress(mediadocument, s, i, j, k);
        eventBus.a(mediadocument);
    }

    public void onMediaLinkStatusChange(MediaDocument mediadocument, com.skype.MediaDocument.MEDIA_STATUS media_status, String s, String s1)
    {
        mediadocument = new OnMediaLinkStatusChange(mediadocument, media_status, s, s1);
        eventBus.a(mediadocument);
    }

    public void onMetadataUpdated(MediaDocument mediadocument)
    {
        mediadocument = new OnMetadataUpdated(mediadocument);
        eventBus.a(mediadocument);
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }

    public void onUploadError(MediaDocument mediadocument, String s, com.skype.MediaDocument.NETWORK_ERROR network_error, boolean flag)
    {
        mediadocument = new OnUploadError(mediadocument, s, network_error, flag);
        eventBus.a(mediadocument);
    }

    public void onUploadProgress(MediaDocument mediadocument, String s, int i, int j)
    {
        mediadocument = new OnUploadProgress(mediadocument, s, i, j);
        eventBus.a(mediadocument);
    }

    public void onUploadStatusChanged(MediaDocument mediadocument, String s, com.skype.MediaDocument.UPLOAD_STATUS upload_status)
    {
        mediadocument = new OnUploadStatusChanged(mediadocument, s, upload_status);
        eventBus.a(mediadocument);
    }
}
