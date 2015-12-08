// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.net.Uri;
import com.soundcloud.android.rx.ScSchedulers;
import rx.b;

public class TrackStorage
{

    private ContentResolver resolver;

    public TrackStorage(ContentResolver contentresolver)
    {
        resolver = contentresolver;
    }

    public b getTracksForUriAsync(final Uri uri)
    {
        return b.create(new _cls1()).subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER);
    }


    private class _cls1
        implements rx.b.f
    {

        final TrackStorage this$0;
        final Uri val$uri;

        private List toTrackUrns(String s, Cursor cursor)
        {
            if (cursor != null) goto _L2; else goto _L1
_L1:
            Object obj = Collections.emptyList();
_L4:
            return ((List) (obj));
_L2:
            ArrayList arraylist = new ArrayList(cursor.getCount());
            do
            {
                obj = arraylist;
                if (!cursor.moveToNext())
                {
                    continue;
                }
                arraylist.add(Urn.forTrack(cursor.getLong(cursor.getColumnIndex(s))));
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Object obj;
            boolean flag = Content.match(uri).isActivitiesItem();
            String s;
            String s1;
            Uri uri1;
            ContentResolver contentresolver;
            if (Content.match(uri) == Content.ME_SOUNDS)
            {
                s = (new StringBuilder()).append(Table.Posts.field("target_id")).append(" as ").append("target_id").toString();
                obj = Table.Posts.field("target_type");
                s1 = "target_id";
            } else
            if (flag)
            {
                s = (new StringBuilder()).append(Table.ActivityView).append(".sound_id").toString();
                obj = (new StringBuilder()).append(Table.ActivityView).append(".sound_type").toString();
                s1 = "sound_id";
            } else
            {
                s = (new StringBuilder()).append(Table.SoundView).append("._id as _id").toString();
                obj = (new StringBuilder()).append(Table.SoundView).append("._type").toString();
                s1 = "_id";
            }
            if (Content.match(uri) == Content.PLAYLIST)
            {
                uri1 = Content.PLAYLIST_TRACKS.forQuery(uri.getLastPathSegment());
            } else
            {
                uri1 = uri;
            }
            contentresolver = resolver;
            obj = (new StringBuilder()).append(((String) (obj))).append(" = ?").toString();
            obj = contentresolver.query(uri1, new String[] {
                s
            }, ((String) (obj)), new String[] {
                "0"
            }, null);
            if (x.isUnsubscribed())
            {
                break MISSING_BLOCK_LABEL_182;
            }
            x.onNext(toTrackUrns(s1, ((Cursor) (obj))));
            x.onCompleted();
            ((Cursor) (obj)).close();
            return;
            x;
            ((Cursor) (obj)).close();
            throw x;
        }

        _cls1()
        {
            this$0 = TrackStorage.this;
            uri = uri1;
            super();
        }
    }

}
