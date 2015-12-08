// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;

import b.a.a.a;
import com.dropbox.client2.exception.DropboxParseException;
import com.dropbox.client2.exception.DropboxUnlinkedException;
import com.dropbox.client2.jsonextract.JsonExtractionException;
import com.dropbox.client2.jsonextract.JsonThing;
import com.dropbox.client2.session.Session;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.InputStreamEntity;

// Referenced classes of package com.dropbox.client2:
//            SdkVersion, RESTUtility, ProgressListener

public class DropboxAPI
{

    public static final long MAX_UPLOAD_SIZE = 0xb400000L;
    protected static final int METADATA_DEFAULT_LIMIT = 25000;
    private static final int REVISION_DEFAULT_LIMIT = 1000;
    public static final String SDK_VERSION = SdkVersion.get();
    private static final int SEARCH_DEFAULT_LIMIT = 10000;
    private static final int UPLOAD_SO_TIMEOUT_MS = 0x2bf20;
    public static final int VERSION = 1;
    protected final Session session;

    public DropboxAPI(Session session1)
    {
        if (session1 == null)
        {
            throw new IllegalArgumentException("Session must not be null.");
        } else
        {
            session = session1;
            return;
        }
    }

    private Entry commitChunkedUpload(String s, String s1, boolean flag, String s2)
    {
        if (s == null || s.equals(""))
        {
            throw new IllegalArgumentException("path is null or empty.");
        }
        assertAuthenticated();
        String s3 = s;
        if (!s.startsWith("/"))
        {
            s3 = (new StringBuilder("/")).append(s).toString();
        }
        s = (new StringBuilder("/commit_chunked_upload/")).append(session.getAccessType()).append(s3).toString();
        s3 = session.getLocale().toString();
        s = new HttpPost(RESTUtility.buildURL(session.getContentServer(), 1, s, new String[] {
            "overwrite", String.valueOf(flag), "parent_rev", s2, "locale", s3, "upload_id", s1
        }));
        session.sign(s);
        return new Entry((Map)RESTUtility.parseAsJSON(RESTUtility.execute(session, s)));
    }

    protected static boolean getFromMapAsBoolean(Map map, String s)
    {
        map = ((Map) (map.get(s)));
        if (map != null && (map instanceof Boolean))
        {
            return ((Boolean)map).booleanValue();
        } else
        {
            return false;
        }
    }

    protected static long getFromMapAsLong(Map map, String s)
    {
        map = ((Map) (map.get(s)));
        if (map != null)
        {
            if (map instanceof Number)
            {
                return ((Number)map).longValue();
            }
            if (map instanceof String)
            {
                return Long.parseLong((String)map, 16);
            }
        }
        return 0L;
    }

    private UploadRequest putFileRequest(String s, InputStream inputstream, long l, boolean flag, String s1, boolean flag1, 
            ProgressListener progresslistener)
    {
        if (s == null || s.equals(""))
        {
            throw new IllegalArgumentException("path is null or empty.");
        }
        assertAuthenticated();
        String s2 = s;
        if (!s.startsWith("/"))
        {
            s2 = (new StringBuilder("/")).append(s).toString();
        }
        s2 = (new StringBuilder("/files_put/")).append(session.getAccessType()).append(s2).toString();
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        s1 = session.getLocale().toString();
        s1 = new HttpPut(RESTUtility.buildURL(session.getContentServer(), 1, s2, new String[] {
            "overwrite", String.valueOf(flag), "parent_rev", s, "autorename", String.valueOf(flag1), "locale", s1
        }));
        session.sign(s1);
        s = new InputStreamEntity(inputstream, l);
        s.setContentEncoding("application/octet-stream");
        s.setChunked(false);
        if (progresslistener != null)
        {
            s = new ProgressListener.ProgressHttpEntity(s, progresslistener);
        }
        s1.setEntity(s);
        return new BasicUploadRequest(s1, session);
    }

    public Account accountInfo()
    {
        assertAuthenticated();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s = session.getAPIServer();
        String s1 = session.getLocale().toString();
        Session session1 = session;
        return new Account((Map)RESTUtility.request(requestmethod, s, "/account/info", 1, new String[] {
            "locale", s1
        }, session1));
    }

    public Entry addFromCopyRef(String s, String s1)
    {
        assertAuthenticated();
        if (!s1.startsWith("/"))
        {
            throw new IllegalArgumentException((new StringBuilder("'targetPath' doesn't start with \"/\": ")).append(s1).toString());
        } else
        {
            String s2 = session.getLocale().toString();
            String s3 = session.getAccessType().toString();
            RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
            String s4 = session.getAPIServer();
            Session session1 = session;
            return new Entry((Map)RESTUtility.request(requestmethod, s4, "/fileops/copy", 1, new String[] {
                "locale", s2, "root", s3, "from_copy_ref", s, "to_path", s1
            }, session1));
        }
    }

    protected void assertAuthenticated()
    {
        if (!session.isLinked())
        {
            throw new DropboxUnlinkedException();
        } else
        {
            return;
        }
    }

    public ChunkedUploadRequest chunkedUploadRequest(InputStream inputstream, long l, ProgressListener progresslistener, long l1, String s)
    {
        if (l1 == 0L)
        {
            s = new String[0];
        } else
        {
            String as[] = new String[4];
            as[0] = "upload_id";
            as[1] = s;
            as[2] = "offset";
            as[3] = String.valueOf(l1);
            s = as;
        }
        s = new HttpPut(RESTUtility.buildURL(session.getContentServer(), 1, "/chunked_upload/", s));
        session.sign(s);
        inputstream = new InputStreamEntity(inputstream, l);
        inputstream.setContentEncoding("application/octet-stream");
        inputstream.setChunked(false);
        if (progresslistener != null)
        {
            inputstream = new ProgressListener.ProgressHttpEntity(inputstream, progresslistener);
        }
        s.setEntity(inputstream);
        return new ChunkedUploadRequest(s, session);
    }

    public Entry copy(String s, String s1)
    {
        assertAuthenticated();
        String s2 = session.getAccessType().toString();
        String s3 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.POST;
        String s4 = session.getAPIServer();
        Session session1 = session;
        return new Entry((Map)RESTUtility.request(requestmethod, s4, "/fileops/copy", 1, new String[] {
            "root", s2, "from_path", s, "to_path", s1, "locale", s3
        }, session1));
    }

    public CreatedCopyRef createCopyRef(String s)
    {
        assertAuthenticated();
        if (!s.startsWith("/"))
        {
            throw new IllegalArgumentException((new StringBuilder("'sourcePath' must start with \"/\": ")).append(s).toString());
        }
        String s1 = session.getLocale().toString();
        s = (new StringBuilder("/copy_ref/")).append(session.getAccessType()).append(s).toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s2 = session.getAPIServer();
        Session session1 = session;
        s = ((String) (RESTUtility.request(requestmethod, s2, s, 1, new String[] {
            "locale", s1
        }, session1)));
        try
        {
            s = CreatedCopyRef.extractFromJson(new JsonThing(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DropboxParseException((new StringBuilder("Error parsing /copy_ref results: ")).append(s.getMessage()).toString());
        }
        return s;
    }

    public Entry createFolder(String s)
    {
        assertAuthenticated();
        String s1 = session.getAccessType().toString();
        String s2 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.POST;
        String s3 = session.getAPIServer();
        Session session1 = session;
        return new Entry((Map)RESTUtility.request(requestmethod, s3, "/fileops/create_folder", 1, new String[] {
            "root", s1, "path", s, "locale", s2
        }, session1));
    }

    public void delete(String s)
    {
        assertAuthenticated();
        String s1 = session.getAccessType().toString();
        String s2 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.POST;
        String s3 = session.getAPIServer();
        Session session1 = session;
        RESTUtility.request(requestmethod, s3, "/fileops/delete", 1, new String[] {
            "root", s1, "path", s, "locale", s2
        }, session1);
    }

    public DeltaPage delta(String s)
    {
        String s1 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.POST;
        String s2 = session.getAPIServer();
        Session session1 = session;
        s = ((String) (RESTUtility.request(requestmethod, s2, "/delta", 1, new String[] {
            "cursor", s, "locale", s1
        }, session1)));
        try
        {
            s = DeltaPage.extractFromJson(new JsonThing(s), com.dropbox.client2.Entry.JsonExtractor);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new DropboxParseException((new StringBuilder("Error parsing /delta results: ")).append(s.getMessage()).toString());
        }
        return s;
    }

    public ChunkedUploader getChunkedUploader(InputStream inputstream)
    {
        return new ChunkedUploader(inputstream, -1L, null);
    }

    public ChunkedUploader getChunkedUploader(InputStream inputstream, long l)
    {
        return new ChunkedUploader(inputstream, l, null);
    }

    public ChunkedUploader getChunkedUploader(InputStream inputstream, long l, int i)
    {
        return new ChunkedUploader(inputstream, l, i, null);
    }

    public DropboxFileInfo getFile(String s, String s1, OutputStream outputstream, ProgressListener progresslistener)
    {
        s = getFileStream(s, s1);
        s.copyStreamToOutput(outputstream, progresslistener);
        return s.getFileInfo();
    }

    public DropboxInputStream getFileStream(String s, String s1)
    {
        assertAuthenticated();
        String s2 = s;
        if (!s.startsWith("/"))
        {
            s2 = (new StringBuilder("/")).append(s).toString();
        }
        s = (new StringBuilder("/files/")).append(session.getAccessType()).append(s2).toString();
        s2 = session.getLocale().toString();
        s = new HttpGet(RESTUtility.buildURL(session.getContentServer(), 1, s, new String[] {
            "rev", s1, "locale", s2
        }));
        session.sign(s);
        return new DropboxInputStream(s, RESTUtility.execute(session, s));
    }

    public Session getSession()
    {
        return session;
    }

    public DropboxFileInfo getThumbnail(String s, OutputStream outputstream, ThumbSize thumbsize, ThumbFormat thumbformat, ProgressListener progresslistener)
    {
        s = getThumbnailStream(s, thumbsize, thumbformat);
        s.copyStreamToOutput(outputstream, progresslistener);
        return s.getFileInfo();
    }

    public DropboxInputStream getThumbnailStream(String s, ThumbSize thumbsize, ThumbFormat thumbformat)
    {
        assertAuthenticated();
        s = (new StringBuilder("/thumbnails/")).append(session.getAccessType()).append(s).toString();
        thumbsize = thumbsize.toAPISize();
        thumbformat = thumbformat.toString();
        String s1 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s2 = session.getContentServer();
        Session session1 = session;
        s = RESTUtility.streamRequest(requestmethod, s2, s, 1, new String[] {
            "size", thumbsize, "format", thumbformat, "locale", s1
        }, session1);
        return new DropboxInputStream(((RequestAndResponse) (s)).request, ((RequestAndResponse) (s)).response);
    }

    public DropboxLink media(String s, boolean flag)
    {
        assertAuthenticated();
        s = (new StringBuilder("/media/")).append(session.getAccessType()).append(s).toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s1 = session.getAPIServer();
        String s2 = session.getLocale().toString();
        Session session1 = session;
        return new DropboxLink((Map)RESTUtility.request(requestmethod, s1, s, 1, new String[] {
            "locale", s2
        }, session1), flag, null);
    }

    public Entry metadata(String s, int i, String s1, boolean flag, String s2)
    {
        assertAuthenticated();
        int j = i;
        if (i <= 0)
        {
            j = 25000;
        }
        String s3 = session.getLocale().toString();
        s = (new StringBuilder("/metadata/")).append(session.getAccessType()).append(s).toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s4 = session.getAPIServer();
        Session session1 = session;
        return new Entry((Map)RESTUtility.request(requestmethod, s4, s, 1, new String[] {
            "file_limit", String.valueOf(j), "hash", s1, "list", String.valueOf(flag), "rev", s2, "locale", s3
        }, session1));
    }

    public Entry move(String s, String s1)
    {
        assertAuthenticated();
        String s2 = session.getAccessType().toString();
        String s3 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.POST;
        String s4 = session.getAPIServer();
        Session session1 = session;
        return new Entry((Map)RESTUtility.request(requestmethod, s4, "/fileops/move", 1, new String[] {
            "root", s2, "from_path", s, "to_path", s1, "locale", s3
        }, session1));
    }

    public Entry putFile(String s, InputStream inputstream, long l, String s1, ProgressListener progresslistener)
    {
        return putFileRequest(s, inputstream, l, s1, progresslistener).upload();
    }

    public Entry putFile(String s, InputStream inputstream, long l, String s1, boolean flag, ProgressListener progresslistener)
    {
        return putFileRequest(s, inputstream, l, s1, flag, progresslistener).upload();
    }

    public Entry putFileOverwrite(String s, InputStream inputstream, long l, ProgressListener progresslistener)
    {
        return putFileOverwriteRequest(s, inputstream, l, progresslistener).upload();
    }

    public UploadRequest putFileOverwriteRequest(String s, InputStream inputstream, long l, ProgressListener progresslistener)
    {
        return putFileRequest(s, inputstream, l, true, null, true, progresslistener);
    }

    public UploadRequest putFileRequest(String s, InputStream inputstream, long l, String s1, ProgressListener progresslistener)
    {
        return putFileRequest(s, inputstream, l, false, s1, true, progresslistener);
    }

    public UploadRequest putFileRequest(String s, InputStream inputstream, long l, String s1, boolean flag, ProgressListener progresslistener)
    {
        return putFileRequest(s, inputstream, l, false, s1, flag, progresslistener);
    }

    public Entry restore(String s, String s1)
    {
        assertAuthenticated();
        String s2 = session.getLocale().toString();
        s = (new StringBuilder("/restore/")).append(session.getAccessType()).append(s).toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s3 = session.getAPIServer();
        Session session1 = session;
        return new Entry((Map)RESTUtility.request(requestmethod, s3, s, 1, new String[] {
            "rev", s1, "locale", s2
        }, session1));
    }

    public List revisions(String s, int i)
    {
        assertAuthenticated();
        int j = i;
        if (i <= 0)
        {
            j = 1000;
        }
        Object obj = session.getLocale().toString();
        s = (new StringBuilder("/revisions/")).append(session.getAccessType()).append(s).toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s1 = session.getAPIServer();
        Session session1 = session;
        obj = (a)RESTUtility.request(requestmethod, s1, s, 1, new String[] {
            "rev_limit", String.valueOf(j), "locale", obj
        }, session1);
        s = new LinkedList();
        for (obj = ((a) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(new Entry((Map)((Iterator) (obj)).next()))) { }
        return s;
    }

    public List search(String s, String s1, int i, boolean flag)
    {
        assertAuthenticated();
        int j = i;
        if (i <= 0)
        {
            j = 10000;
        }
        s = (new StringBuilder("/search/")).append(session.getAccessType()).append(s).toString();
        String s2 = session.getLocale().toString();
        RESTUtility.RequestMethod requestmethod = RESTUtility.RequestMethod.GET;
        String s3 = session.getAPIServer();
        Session session1 = session;
        s1 = ((String) (RESTUtility.request(requestmethod, s3, s, 1, new String[] {
            "query", s1, "file_limit", String.valueOf(j), "include_deleted", String.valueOf(flag), "locale", s2
        }, session1)));
        s = new ArrayList();
        if (s1 instanceof a)
        {
            s1 = ((a)s1).iterator();
            do
            {
                if (!s1.hasNext())
                {
                    break;
                }
                Object obj = s1.next();
                if (obj instanceof Map)
                {
                    s.add(new Entry((Map)obj));
                }
            } while (true);
        }
        return s;
    }

    public DropboxLink share(String s)
    {
        assertAuthenticated();
        s = (new StringBuilder("/shares/")).append(session.getAccessType()).append(s).toString();
        Object obj = RESTUtility.RequestMethod.GET;
        Object obj1 = session.getAPIServer();
        String s1 = session.getLocale().toString();
        Session session1 = session;
        s = (Map)RESTUtility.request(((RESTUtility.RequestMethod) (obj)), ((String) (obj1)), s, 1, new String[] {
            "locale", s1
        }, session1);
        obj = (String)s.get("url");
        obj1 = RESTUtility.parseDate((String)s.get("expires"));
        if (obj == null || obj1 == null)
        {
            throw new DropboxParseException("Could not parse share response.");
        } else
        {
            return new DropboxLink(s, null);
        }
    }



    private class Entry
    {

        public static final JsonExtractor JsonExtractor = new _cls1();
        public long bytes;
        public String clientMtime;
        public List contents;
        public String hash;
        public String icon;
        public boolean isDeleted;
        public boolean isDir;
        public String mimeType;
        public String modified;
        public String path;
        public boolean readOnly;
        public String rev;
        public String root;
        public String size;
        public boolean thumbExists;

        public String fileName()
        {
            int i = path.lastIndexOf('/');
            return path.substring(i + 1, path.length());
        }

        public String parentPath()
        {
            if (path.equals("/"))
            {
                return "";
            } else
            {
                int i = path.lastIndexOf('/');
                return path.substring(0, i + 1);
            }
        }


        public Entry()
        {
        }

        public Entry(Map map)
        {
            bytes = DropboxAPI.getFromMapAsLong(map, "bytes");
            hash = (String)map.get("hash");
            icon = (String)map.get("icon");
            isDir = DropboxAPI.getFromMapAsBoolean(map, "is_dir");
            modified = (String)map.get("modified");
            clientMtime = (String)map.get("client_mtime");
            path = (String)map.get("path");
            readOnly = DropboxAPI.getFromMapAsBoolean(map, "read_only");
            root = (String)map.get("root");
            size = (String)map.get("size");
            mimeType = (String)map.get("mime_type");
            rev = (String)map.get("rev");
            thumbExists = DropboxAPI.getFromMapAsBoolean(map, "thumb_exists");
            isDeleted = DropboxAPI.getFromMapAsBoolean(map, "is_deleted");
            map = ((Map) (map.get("contents")));
            if (map != null && (map instanceof a))
            {
                contents = new ArrayList();
                map = ((a)map).iterator();
                do
                {
                    if (!map.hasNext())
                    {
                        break;
                    }
                    Object obj = map.next();
                    if (obj instanceof Map)
                    {
                        contents.add(new Entry((Map)obj));
                    }
                } while (true);
            } else
            {
                contents = null;
            }
        }

        class _cls1 extends JsonExtractor
        {

            public final Entry extract(JsonThing jsonthing)
            {
                return new Entry((Map)jsonthing.expectMap().internal);
            }

            public final volatile Object extract(JsonThing jsonthing)
            {
                return extract(jsonthing);
            }

                _cls1()
                {
                }
        }

    }


    private class BasicUploadRequest
        implements UploadRequest
    {

        private final HttpUriRequest request;
        private final Session session;

        public final void abort()
        {
            request.abort();
        }

        public final Entry upload()
        {
            HttpResponse httpresponse;
            try
            {
                httpresponse = RESTUtility.execute(session, request, 0x2bf20);
            }
            catch (DropboxIOException dropboxioexception)
            {
                if (request.isAborted())
                {
                    throw new DropboxPartialFileException(-1L);
                } else
                {
                    throw dropboxioexception;
                }
            }
            return new Entry((Map)RESTUtility.parseAsJSON(httpresponse));
        }

        public BasicUploadRequest(HttpUriRequest httpurirequest, Session session1)
        {
            request = httpurirequest;
            session = session1;
        }
    }


    private class Account extends VersionedSerializable
    {
        private class NameDetails extends VersionedSerializable
        {

            private static int MY_VERSION = 0;
            private static final long serialVersionUID = 0x1d1be5b63d0357f6L;
            public final String familiarName;
            public final String givenName;
            public final String surname;

            public int getLatestVersion()
            {
                return MY_VERSION;
            }

            static 
            {
                MY_VERSION = 1;
            }

            protected NameDetails(String s, String s1, String s2)
            {
                givenName = s;
                surname = s1;
                familiarName = s2;
            }

            protected NameDetails(Map map)
            {
                givenName = (String)map.get("given_name");
                surname = (String)map.get("surname");
                familiarName = (String)map.get("familiar_name");
            }
        }

        private class TeamInfo extends VersionedSerializable
        {

            private static int MY_VERSION = 0;
            private static final long serialVersionUID = 0x1d1be5b63d0357f5L;
            public final String name;
            public final String teamId;

            public int getLatestVersion()
            {
                return MY_VERSION;
            }

            static 
            {
                MY_VERSION = 1;
            }

            protected TeamInfo(String s, String s1)
            {
                teamId = s;
                name = s1;
            }

            protected TeamInfo(Map map)
            {
                name = (String)map.get("name");
                teamId = (String)map.get("team_id");
            }
        }


        private static int MY_VERSION = 0;
        private static final long serialVersionUID = 0x1d1be5b63d0357f4L;
        public final String country;
        public final String displayName;
        public final String email;
        public final boolean emailVerified;
        public final boolean isPaired;
        public final String locale;
        public final NameDetails nameDetails;
        public final long quota;
        public final long quotaNormal;
        public final long quotaShared;
        public final String referralLink;
        public final TeamInfo teamInfo;
        public final long uid;

        public int getLatestVersion()
        {
            return MY_VERSION;
        }

        boolean isOverQuota()
        {
            return quotaNormal + quotaShared > quota;
        }

        static 
        {
            MY_VERSION = 2;
        }

        protected Account(String s, String s1, String s2, boolean flag, long l, String s3, 
                boolean flag1, String s4, NameDetails namedetails, TeamInfo teaminfo, long l1, long l2, long l3)
        {
            country = s;
            displayName = s1;
            email = s2;
            emailVerified = flag;
            uid = l;
            referralLink = s3;
            isPaired = flag1;
            locale = s4;
            nameDetails = namedetails;
            teamInfo = teaminfo;
            quota = l1;
            quotaNormal = l2;
            quotaShared = l3;
        }

        protected Account(Map map)
        {
            country = (String)map.get("country");
            displayName = (String)map.get("display_name");
            email = (String)map.get("email");
            emailVerified = DropboxAPI.getFromMapAsBoolean(map, "email_verified");
            uid = DropboxAPI.getFromMapAsLong(map, "uid");
            referralLink = (String)map.get("referral_link");
            isPaired = DropboxAPI.getFromMapAsBoolean(map, "is_paired");
            locale = (String)map.get("locale");
            Object obj = map.get("name_details");
            if (obj != null && (obj instanceof Map))
            {
                nameDetails = new NameDetails((Map)obj);
            } else
            {
                nameDetails = null;
            }
            obj = map.get("team");
            if (obj != null && (obj instanceof Map))
            {
                teamInfo = new TeamInfo((Map)obj);
            } else
            {
                teamInfo = null;
            }
            map = (Map)map.get("quota_info");
            quota = DropboxAPI.getFromMapAsLong(map, "quota");
            quotaNormal = DropboxAPI.getFromMapAsLong(map, "normal");
            quotaShared = DropboxAPI.getFromMapAsLong(map, "shared");
        }
    }


    private class ChunkedUploadRequest
    {

        private final HttpUriRequest request;
        private final Session session;

        public final void abort()
        {
            request.abort();
        }

        public final ChunkedUploadResponse upload()
        {
            HttpResponse httpresponse;
            try
            {
                httpresponse = RESTUtility.execute(session, request, 0x2bf20);
            }
            catch (DropboxIOException dropboxioexception)
            {
                if (request.isAborted())
                {
                    throw new DropboxPartialFileException(-1L);
                } else
                {
                    throw dropboxioexception;
                }
            }
            return new ChunkedUploadResponse((Map)RESTUtility.parseAsJSON(httpresponse));
        }

        protected ChunkedUploadRequest(HttpUriRequest httpurirequest, Session session1)
        {
            request = httpurirequest;
            session = session1;
        }

        private class ChunkedUploadResponse
        {

            private final long offset;
            private final String uploadId;

            public final long getOffset()
            {
                return offset;
            }

            public final String getUploadId()
            {
                return uploadId;
            }

            public ChunkedUploadResponse(Map map)
            {
                uploadId = (String)map.get("upload_id");
                offset = ((Long)map.get("offset")).longValue();
            }
        }

    }


    private class CreatedCopyRef
    {

        public final String copyRef;
        public final String expiration;

        public static CreatedCopyRef extractFromJson(JsonThing jsonthing)
        {
            jsonthing = jsonthing.expectMap();
            return new CreatedCopyRef(jsonthing.get("copy_ref").expectString(), jsonthing.get("expires").expectString());
        }

        public CreatedCopyRef(String s, String s1)
        {
            copyRef = s;
            expiration = s1;
        }
    }


    private class DeltaPage
    {

        public final String cursor;
        public final List entries;
        public final boolean hasMore;
        public final boolean reset;

        public static DeltaPage extractFromJson(JsonThing jsonthing, JsonExtractor jsonextractor)
        {
            jsonthing = jsonthing.expectMap();
            boolean flag = jsonthing.get("reset").expectBoolean();
            String s = jsonthing.get("cursor").expectString();
            boolean flag1 = jsonthing.get("has_more").expectBoolean();
            class DeltaEntry.JsonExtractor extends JsonExtractor
            {

                public final JsonExtractor mdExtractor;

                public static DeltaEntry extract(JsonThing jsonthing1, JsonExtractor jsonextractor1)
                {
                    jsonthing1 = jsonthing1.expectList();
                    return new DeltaEntry(jsonthing1.get(0).expectString(), jsonthing1.get(1).optionalExtract(jsonextractor1));
                }

                public final DeltaEntry extract(JsonThing jsonthing1)
                {
                    return extract(jsonthing1, mdExtractor);
                }

                public final volatile Object extract(JsonThing jsonthing1)
                {
                    return extract(jsonthing1);
                }

                public DeltaEntry.JsonExtractor(JsonExtractor jsonextractor)
                {
                    mdExtractor = jsonextractor;
                }

                private class DeltaEntry
                {

                    public final String lcPath;
                    public final Object metadata;

                    public DeltaEntry(String s, Object obj)
                    {
                        lcPath = s;
                        metadata = obj;
                    }
                }

            }

            return new DeltaPage(flag, jsonthing.get("entries").expectList().extract(new DeltaEntry.JsonExtractor(jsonextractor)), s, flag1);
        }

        public DeltaPage(boolean flag, List list, String s, boolean flag1)
        {
            reset = flag;
            entries = list;
            cursor = s;
            hasMore = flag1;
        }
    }


    private class ChunkedUploader
    {

        static final boolean $assertionsDisabled;
        private static final int DEFAULT_CHUNK_SIZE = 0x400000;
        private boolean active;
        private int bytesInChunkToUpload;
        private byte chunk[];
        private ChunkedUploadRequest lastRequest;
        private long offset;
        private InputStream stream;
        private long targetLength;
        final DropboxAPI this$0;
        private String uploadId;

        public void abort()
        {
            this;
            JVM INSTR monitorenter ;
            if (lastRequest != null)
            {
                lastRequest.abort();
            }
            active = false;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public Entry finish(String s, String s1)
        {
            return commitChunkedUpload(s, uploadId, false, s1);
        }

        public boolean getActive()
        {
            return active;
        }

        public long getOffset()
        {
            return offset;
        }

        public boolean isComplete()
        {
            return offset == targetLength;
        }

        public void upload()
        {
            upload(null);
        }

        public void upload(ProgressListener progresslistener)
        {
            Object obj;
            boolean flag;
            if (targetLength == -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
_L8:
            obj = null;
            if (progresslistener != null)
            {
                obj = new ProgressListener.Adjusted(progresslistener, offset, targetLength);
            }
            if (bytesInChunkToUpload != 0) goto _L2; else goto _L1
_L1:
            int i;
            if (flag)
            {
                i = chunk.length;
            } else
            {
                i = (int)Math.min(chunk.length, targetLength - offset);
            }
            bytesInChunkToUpload = stream.read(chunk, 0, i);
            if (bytesInChunkToUpload != -1) goto _L2; else goto _L3
_L3:
            if (!flag) goto _L5; else goto _L4
_L4:
            targetLength = offset;
            bytesInChunkToUpload = 0;
_L10:
            return;
_L5:
            abort();
            throw new IllegalStateException((new StringBuilder("InputStream ended after ")).append(offset).append(" bytes, expecting ").append(targetLength).append(" bytes.").toString());
_L2:
            this;
            JVM INSTR monitorenter ;
            if (!active)
            {
                throw new DropboxPartialFileException(0L);
            }
              goto _L6
            obj;
            this;
            JVM INSTR monitorexit ;
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            if (!((DropboxServerException) (obj)).body.fields.containsKey("offset"))
            {
                break MISSING_BLOCK_LABEL_373;
            }
            long l = ((Long)((DropboxServerException) (obj)).body.fields.get("offset")).longValue();
            if (l <= offset)
            {
                break MISSING_BLOCK_LABEL_371;
            }
            bytesInChunkToUpload = 0;
            offset = l;
_L11:
            if (flag || offset < targetLength) goto _L8; else goto _L7
_L7:
            if ($assertionsDisabled || offset == targetLength) goto _L10; else goto _L9
_L9:
            throw new AssertionError();
_L6:
            lastRequest = chunkedUploadRequest(new ByteArrayInputStream(chunk), bytesInChunkToUpload, ((ProgressListener) (obj)), offset, uploadId);
            this;
            JVM INSTR monitorexit ;
            obj = lastRequest.upload();
            offset = ((ChunkedUploadResponse) (obj)).getOffset();
            uploadId = ((ChunkedUploadResponse) (obj)).getUploadId();
            bytesInChunkToUpload = 0;
              goto _L11
            throw obj;
            throw obj;
        }

        static 
        {
            boolean flag;
            if (!com/dropbox/client2/DropboxAPI.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private ChunkedUploader(InputStream inputstream, long l)
        {
            this(inputstream, l, 0x400000);
        }

        private ChunkedUploader(InputStream inputstream, long l, int i)
        {
            this$0 = DropboxAPI.this;
            super();
            offset = 0L;
            bytesInChunkToUpload = 0;
            active = true;
            lastRequest = null;
            stream = inputstream;
            targetLength = l;
            chunk = new byte[i];
        }

        ChunkedUploader(InputStream inputstream, long l, int i, _cls1 _pcls1)
        {
            this(inputstream, l, i);
        }

        ChunkedUploader(InputStream inputstream, long l, _cls1 _pcls1)
        {
            this(inputstream, l);
        }
    }


    private class DropboxInputStream extends FilterInputStream
    {
        private class DropboxFileInfo
        {

            private String charset;
            private long fileSize;
            private Entry metadata;
            private String mimeType;

            private static long parseFileSize(HttpResponse httpresponse, Entry entry)
            {
                long l = httpresponse.getEntity().getContentLength();
                if (l >= 0L)
                {
                    return l;
                }
                if (entry != null)
                {
                    return entry.bytes;
                } else
                {
                    return -1L;
                }
            }

            private static Entry parseXDropboxMetadata(HttpResponse httpresponse)
            {
                if (httpresponse == null)
                {
                    return null;
                }
                httpresponse = httpresponse.getFirstHeader("X-Dropbox-Metadata");
                if (httpresponse == null)
                {
                    return null;
                }
                httpresponse = ((HttpResponse) (d.a(new StringReader(httpresponse.getValue()))));
                if (httpresponse == null)
                {
                    return null;
                } else
                {
                    return new Entry((Map)httpresponse);
                }
            }

            public final String getCharset()
            {
                return charset;
            }

            public final long getContentLength()
            {
                return getFileSize();
            }

            public final long getFileSize()
            {
                return fileSize;
            }

            public final Entry getMetadata()
            {
                return metadata;
            }

            public final String getMimeType()
            {
                return mimeType;
            }

            private DropboxFileInfo(HttpResponse httpresponse)
            {
                mimeType = null;
                fileSize = -1L;
                charset = null;
                metadata = null;
                metadata = parseXDropboxMetadata(httpresponse);
                if (metadata == null)
                {
                    throw new DropboxParseException("Error parsing metadata.");
                }
                fileSize = parseFileSize(httpresponse, metadata);
                if (fileSize == -1L)
                {
                    throw new DropboxParseException("Error determining file size.");
                }
                httpresponse = httpresponse.getFirstHeader("Content-Type");
                if (httpresponse != null)
                {
                    httpresponse = httpresponse.getValue();
                    if (httpresponse != null)
                    {
                        httpresponse = httpresponse.split(";");
                        if (httpresponse.length > 0)
                        {
                            mimeType = httpresponse[0].trim();
                        }
                        if (httpresponse.length > 1)
                        {
                            httpresponse = httpresponse[1].split("=");
                            if (httpresponse.length > 1)
                            {
                                charset = httpresponse[1].trim();
                            }
                        }
                    }
                }
            }

            DropboxFileInfo(HttpResponse httpresponse, _cls1 _pcls1)
            {
                this(httpresponse);
            }
        }


        private final DropboxFileInfo info;
        private final HttpUriRequest request;

        public void close()
        {
            request.abort();
        }

        public void copyStreamToOutput(OutputStream outputstream, ProgressListener progresslistener)
        {
            Object obj1;
            long l2;
            long l4;
            obj1 = null;
            l2 = 0L;
            l4 = info.getFileSize();
            Object obj = new BufferedOutputStream(outputstream);
            obj1 = new byte[4096];
            long l;
            long l1;
            l1 = 0L;
            l = 0L;
_L11:
            l2 = l1;
            int i = read(((byte []) (obj1)));
            if (i >= 0) goto _L2; else goto _L1
_L1:
            if (l4 < 0L || l1 >= l4) goto _L4; else goto _L3
_L3:
            long l3;
            l2 = l1;
            try
            {
                throw new DropboxPartialFileException(l1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                progresslistener = ((ProgressListener) (obj));
            }
            finally { }
            obj = obj1;
_L8:
            obj = ((IOException) (obj)).getMessage();
            if (obj == null) goto _L6; else goto _L5
_L5:
            if (((String) (obj)).startsWith("No space"))
            {
                throw new DropboxLocalStorageFullException();
            }
              goto _L6
            obj1;
            obj = progresslistener;
            progresslistener = ((ProgressListener) (obj1));
_L7:
            if (obj != null)
            {
                try
                {
                    ((BufferedOutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            if (outputstream != null)
            {
                try
                {
                    outputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (OutputStream outputstream) { }
            }
            try
            {
                close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
            throw progresslistener;
_L2:
            l2 = l1;
            ((BufferedOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
            l3 = l1 + (long)i;
            l1 = l3;
            if (progresslistener == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            l2 = l3;
            l1 = System.currentTimeMillis();
            l2 = l3;
            if (l1 - l <= progresslistener.progressInterval())
            {
                break MISSING_BLOCK_LABEL_340;
            }
            l2 = l3;
            progresslistener.onProgress(l3, l4);
            l = l1;
            break MISSING_BLOCK_LABEL_340;
_L4:
            l2 = l1;
            ((BufferedOutputStream) (obj)).flush();
            l2 = l1;
            outputstream.flush();
            l2 = l1;
            if (!(outputstream instanceof FileOutputStream))
            {
                break MISSING_BLOCK_LABEL_260;
            }
            l2 = l1;
            ((FileOutputStream)outputstream).getFD().sync();
_L9:
            try
            {
                ((BufferedOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (ProgressListener progresslistener) { }
            if (outputstream != null)
            {
                try
                {
                    outputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch (OutputStream outputstream) { }
            }
            try
            {
                close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                return;
            }
_L6:
            throw new DropboxPartialFileException(l2);
            progresslistener;
            obj = null;
              goto _L7
            obj;
            progresslistener = ((ProgressListener) (obj1));
              goto _L8
            IOException ioexception;
            ioexception;
            progresslistener = ((ProgressListener) (obj));
            obj = ioexception;
              goto _L8
            progresslistener;
              goto _L9
            l1 = l3;
            if (true) goto _L11; else goto _L10
_L10:
        }

        public DropboxFileInfo getFileInfo()
        {
            return info;
        }

        public DropboxInputStream(HttpUriRequest httpurirequest, HttpResponse httpresponse)
        {
            super(null);
            HttpEntity httpentity = httpresponse.getEntity();
            if (httpentity == null)
            {
                throw new DropboxException("Didn't get entity from HttpResponse");
            }
            try
            {
                in = httpentity.getContent();
            }
            // Misplaced declaration of an exception variable
            catch (HttpUriRequest httpurirequest)
            {
                throw new DropboxIOException(httpurirequest);
            }
            request = httpurirequest;
            info = new DropboxFileInfo(httpresponse, null);
        }
    }


    private class ThumbSize extends Enum
    {

        private static final ThumbSize $VALUES[];
        public static final ThumbSize BESTFIT_1024x768;
        public static final ThumbSize BESTFIT_320x240;
        public static final ThumbSize BESTFIT_480x320;
        public static final ThumbSize BESTFIT_640x480;
        public static final ThumbSize BESTFIT_960x640;
        public static final ThumbSize ICON_128x128;
        public static final ThumbSize ICON_256x256;
        public static final ThumbSize ICON_32x32;
        public static final ThumbSize ICON_64x64;
        private String size;

        public static ThumbSize valueOf(String s)
        {
            return (ThumbSize)Enum.valueOf(com/dropbox/client2/DropboxAPI$ThumbSize, s);
        }

        public static ThumbSize[] values()
        {
            return (ThumbSize[])$VALUES.clone();
        }

        public final String toAPISize()
        {
            return size;
        }

        static 
        {
            ICON_32x32 = new ThumbSize("ICON_32x32", 0, "small");
            ICON_64x64 = new ThumbSize("ICON_64x64", 1, "medium");
            ICON_128x128 = new ThumbSize("ICON_128x128", 2, "large");
            ICON_256x256 = new ThumbSize("ICON_256x256", 3, "256x256");
            BESTFIT_320x240 = new ThumbSize("BESTFIT_320x240", 4, "320x240_bestfit");
            BESTFIT_480x320 = new ThumbSize("BESTFIT_480x320", 5, "480x320_bestfit");
            BESTFIT_640x480 = new ThumbSize("BESTFIT_640x480", 6, "640x480_bestfit");
            BESTFIT_960x640 = new ThumbSize("BESTFIT_960x640", 7, "960x640_bestfit");
            BESTFIT_1024x768 = new ThumbSize("BESTFIT_1024x768", 8, "1024x768_bestfit");
            $VALUES = (new ThumbSize[] {
                ICON_32x32, ICON_64x64, ICON_128x128, ICON_256x256, BESTFIT_320x240, BESTFIT_480x320, BESTFIT_640x480, BESTFIT_960x640, BESTFIT_1024x768
            });
        }

        private ThumbSize(String s, int i, String s1)
        {
            super(s, i);
            size = s1;
        }
    }


    private class ThumbFormat extends Enum
    {

        private static final ThumbFormat $VALUES[];
        public static final ThumbFormat JPEG;
        public static final ThumbFormat PNG;

        public static ThumbFormat valueOf(String s)
        {
            return (ThumbFormat)Enum.valueOf(com/dropbox/client2/DropboxAPI$ThumbFormat, s);
        }

        public static ThumbFormat[] values()
        {
            return (ThumbFormat[])$VALUES.clone();
        }

        static 
        {
            PNG = new ThumbFormat("PNG", 0);
            JPEG = new ThumbFormat("JPEG", 1);
            $VALUES = (new ThumbFormat[] {
                PNG, JPEG
            });
        }

        private ThumbFormat(String s, int i)
        {
            super(s, i);
        }
    }


    private class RequestAndResponse
    {

        public final HttpUriRequest request;
        public final HttpResponse response;

        protected RequestAndResponse(HttpUriRequest httpurirequest, HttpResponse httpresponse)
        {
            request = httpurirequest;
            response = httpresponse;
        }
    }


    private class DropboxLink
    {

        public final Date expires;
        public final String url;

        private DropboxLink(String s, boolean flag)
        {
            String s1 = s;
            if (!flag)
            {
                s1 = s;
                if (s.startsWith("https://"))
                {
                    s1 = s.replaceFirst("https://", "http://").replaceFirst(":443/", "/");
                }
            }
            url = s1;
            expires = null;
        }

        private DropboxLink(Map map)
        {
            this(map, true);
        }

        DropboxLink(Map map, _cls1 _pcls1)
        {
            this(map);
        }

        private DropboxLink(Map map, boolean flag)
        {
            String s = (String)map.get("url");
            map = (String)map.get("expires");
            if (map != null)
            {
                expires = RESTUtility.parseDate(map);
            } else
            {
                expires = null;
            }
            map = s;
            if (!flag)
            {
                map = s;
                if (s.startsWith("https://"))
                {
                    map = s.replaceFirst("https://", "http://").replaceFirst(":443/", "/");
                }
            }
            url = map;
        }

        DropboxLink(Map map, boolean flag, _cls1 _pcls1)
        {
            this(map, flag);
        }
    }


    private class UploadRequest
    {

        public abstract void abort();

        public abstract Entry upload();
    }

}
