// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.schema.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            Shortcut

public class ShortcutsStorage
{

    private final PropellerDatabase propeller;

    public ShortcutsStorage(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    private String getDisplayText(CursorReader cursorreader)
    {
        return cursorreader.getString(com.soundcloud.android.storage.Tables.Shortcuts.DISPLAY_TEXT);
    }

    private Urn getUrn(CursorReader cursorreader)
    {
        long l = cursorreader.getLong(com.soundcloud.android.storage.Tables.Shortcuts._ID);
        if ("following".equals(cursorreader.getString(com.soundcloud.android.storage.Tables.Shortcuts.KIND)))
        {
            return Urn.forUser(l);
        }
        if (cursorreader.getInt(com.soundcloud.android.storage.Tables.Shortcuts._TYPE) == 0)
        {
            return Urn.forTrack(l);
        } else
        {
            return Urn.forPlaylist(l);
        }
    }

    public List getShortcuts(String s, int i)
    {
        Object obj = propeller.query(((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Tables.Shortcuts.TABLE
        }).select(new Object[] {
            com.soundcloud.android.storage.Tables.Shortcuts.KIND, com.soundcloud.android.storage.Tables.Shortcuts._ID, com.soundcloud.android.storage.Tables.Shortcuts._TYPE, com.soundcloud.android.storage.Tables.Shortcuts.DISPLAY_TEXT
        }).where((new StringBuilder()).append(com.soundcloud.android.storage.Tables.Shortcuts.DISPLAY_TEXT).append(" LIKE '").append(s).append("%' or ").append(com.soundcloud.android.storage.Tables.Shortcuts.DISPLAY_TEXT).append(" LIKE '% ").append(s).append("%'").toString(), new Object[0])).limit(i));
        s = new ArrayList(i);
        CursorReader cursorreader;
        for (obj = ((QueryResult) (obj)).iterator(); ((Iterator) (obj)).hasNext(); s.add(Shortcut.create(getUrn(cursorreader), getDisplayText(cursorreader))))
        {
            cursorreader = (CursorReader)((Iterator) (obj)).next();
        }

        return s;
    }
}
