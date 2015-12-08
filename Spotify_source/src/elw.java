// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class elw
{

    private static String a;
    private static Map b;
    private static List c;

    public static Genre a(String s, Resources resources)
    {
        elw;
        JVM INSTR monitorenter ;
        b(resources);
        s = (Genre)b.get(s);
        elw;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static List a(Resources resources)
    {
        elw;
        JVM INSTR monitorenter ;
        b(resources);
        resources = new ArrayList();
        String s;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); resources.add(b.get(s)))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_68;
        resources;
        throw resources;
        resources = Collections.unmodifiableList(resources);
        elw;
        JVM INSTR monitorexit ;
        return resources;
    }

    public static void a(Resources resources, List list)
    {
        elw;
        JVM INSTR monitorenter ;
        if (list == null) goto _L2; else goto _L1
_L1:
        b(resources);
        resources = list.iterator();
_L6:
        if (!resources.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Genre)resources.next()).a.equals("new_releases")) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        ArrayList arraylist;
        resources = new HashMap();
        arraylist = new ArrayList();
        resources.put("highlights", b.get("highlights"));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        resources.put("new_releases", b.get("new_releases"));
        Genre genre1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); resources.put(genre1.a, genre1))
        {
            genre1 = (Genre)iterator.next();
        }

        break MISSING_BLOCK_LABEL_159;
        resources;
        throw resources;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Genre genre = (Genre)list.next();
            if (genre.b() && !genre.a.equals("toplists"))
            {
                arraylist.add(genre.a);
            }
        } while (true);
        c = arraylist;
        b = resources;
_L2:
        elw;
        JVM INSTR monitorexit ;
        return;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Genre b(String s, Resources resources)
    {
        elw;
        JVM INSTR monitorenter ;
        b(resources);
        resources = (Genre)b.get(s);
        s = resources;
        if (resources == null) goto _L2; else goto _L1
_L1:
        boolean flag = resources.b();
        if (!flag) goto _L4; else goto _L3
_L3:
        s = resources;
_L2:
        elw;
        JVM INSTR monitorexit ;
        return s;
_L4:
        s = (Genre)b.get(((Genre) (resources)).b);
        if (true) goto _L2; else goto _L5
_L5:
        s;
        throw s;
    }

    private static void b(Resources resources)
    {
        elw;
        JVM INSTR monitorenter ;
        String s = (new StringBuilder()).append(resources.getConfiguration().locale.getCountry()).append(resources.getConfiguration().locale.getLanguage()).toString();
        if (b == null || a == null || !s.equals(a))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add("mood");
            arraylist.add("party");
            arraylist.add("pop");
            arraylist.add("workout");
            arraylist.add("rock");
            arraylist.add("chill");
            arraylist.add("club");
            arraylist.add("urban");
            arraylist.add("groove");
            arraylist.add("decades");
            arraylist.add("travel");
            arraylist.add("romance");
            arraylist.add("jazz");
            arraylist.add("popculture");
            arraylist.add("events");
            arraylist.add("folk");
            arraylist.add("classical");
            arraylist.add("kids");
            arraylist.add("holidays");
            arraylist.add("sleep");
            c = arraylist;
            a = s;
            resources = new elx(resources);
            resources.a("chill", 0x7f0800ea);
            resources.a("classical", 0x7f0800ed);
            resources.a("club", 0x7f0800ef);
            resources.a("decades", 0x7f0800f4);
            resources.a("events", 0x7f0800f9);
            resources.a("folk", 0x7f0800fd);
            resources.a("groove", 0x7f080104);
            resources.a("highlights", 0x7f080157);
            resources.a("holidays", 0x7f080108);
            resources.a("jazz", 0x7f08010e);
            resources.a("kids", 0x7f080111);
            resources.a("mood", 0x7f080119);
            resources.a("sleep", 0x7f08013a);
            resources.a("new_releases", 0x7f08011d);
            resources.a("trending_artists", 0x7f080148);
            resources.a("party", 0x7f080121);
            resources.a("popculture", 0x7f080126);
            resources.a("pop", 0x7f080123);
            resources.a("rock", 0x7f080132);
            resources.a("romance", 0x7f080136);
            resources.a("toplists", 0x7f080143);
            resources.a("travel", 0x7f080146);
            resources.a("urban", 0x7f08014b);
            resources.a("workout", 0x7f080150);
            resources.a("chill", "chill_misc", 0x7f0800eb);
            resources.a("chill", "lounge", 0x7f080116);
            resources.a("chill", "relax", 0x7f08012f);
            resources.a("classical", "baroque", 0x7f0800e7);
            resources.a("classical", "classical_misc", 0x7f0800ee);
            resources.a("classical", "contemporary", 0x7f0800f1);
            resources.a("classical", "romanticism", 0x7f080138);
            resources.a("club", "club_misc", 0x7f0800f0);
            resources.a("club", "dubstep", 0x7f0800f7);
            resources.a("club", "electro", 0x7f0800f8);
            resources.a("club", "house", 0x7f08010b);
            resources.a("club", "techno", 0x7f080141);
            resources.a("club", "trance", 0x7f080145);
            resources.a("decades", "00s", 0x7f0800de);
            resources.a("decades", "50s", 0x7f0800df);
            resources.a("decades", "60s", 0x7f0800e0);
            resources.a("decades", "70s", 0x7f0800e1);
            resources.a("decades", "80s", 0x7f0800e2);
            resources.a("decades", "90s", 0x7f0800e3);
            resources.a("events", "events_misc", 0x7f0800fa);
            resources.a("events", "festivals", 0x7f0800fb);
            resources.a("events", "live_concerts", 0x7f080115);
            resources.a("events", "sporting_events", 0x7f08013d);
            resources.a("folk", "bluegrass", 0x7f0800e8);
            resources.a("folk", "country", 0x7f0800f2);
            resources.a("folk", "folk_folk", 0x7f0800fe);
            resources.a("folk", "folk_misc", 0x7f0800ff);
            resources.a("folk", "world_music", 0x7f080152);
            resources.a("groove", "disco", 0x7f0800f6);
            resources.a("groove", "funk", 0x7f080101);
            resources.a("groove", "gospel", 0x7f080103);
            resources.a("groove", "groove_misc", 0x7f080105);
            resources.a("groove", "latino", 0x7f080114);
            resources.a("groove", "soul", 0x7f08013c);
            resources.a("holidays", "christmas", 0x7f0800ec);
            resources.a("holidays", "holidays_misc", 0x7f080109);
            resources.a("holidays", "national", 0x7f08011c);
            resources.a("holidays", "newyears", 0x7f08011e);
            resources.a("jazz", "blues", 0x7f0800e9);
            resources.a("jazz", "jazz_jazz", 0x7f08010f);
            resources.a("jazz", "jazz_misc", 0x7f080110);
            resources.a("kids", "fun", 0x7f080100);
            resources.a("kids", "kids_classics", 0x7f080112);
            resources.a("kids", "kids_misc", 0x7f080113);
            resources.a("kids", "stories", 0x7f08013e);
            resources.a("mood", "angry", 0x7f0800e6);
            resources.a("mood", "happy", 0x7f080106);
            resources.a("mood", "melancholic", 0x7f080117);
            resources.a("mood", "mood_misc", 0x7f08011a);
            resources.a("mood", "psyched", 0x7f08012a);
            resources.a("mood", "relaxed", 0x7f080130);
            resources.a("party", "after_party", 0x7f0800e4);
            resources.a("party", "dinner", 0x7f0800f5);
            resources.a("party", "floorfillers", 0x7f0800fc);
            resources.a("party", "party_misc", 0x7f080122);
            resources.a("party", "pre_party", 0x7f080129);
            resources.a("party", "theme_party", 0x7f080142);
            resources.a("pop", "indie_pop", 0x7f08010d);
            resources.a("pop", "one_hit_wonders", 0x7f080120);
            resources.a("pop", "pop_misc", 0x7f080124);
            resources.a("pop", "pop_pop", 0x7f080125);
            resources.a("pop", "power_pop", 0x7f080128);
            resources.a("pop", "songwriter", 0x7f08013b);
            resources.a("pop", "synth_pop", 0x7f080140);
            resources.a("popculture", "movies", 0x7f08011b);
            resources.a("popculture", "popculture_misc", 0x7f080127);
            resources.a("popculture", "radio", 0x7f08012d);
            resources.a("popculture", "tv", 0x7f080149);
            resources.a("popculture", "video_games", 0x7f08014e);
            resources.a("rock", "alt_rock", 0x7f0800e5);
            resources.a("rock", "hard_rock", 0x7f080107);
            resources.a("rock", "metal", 0x7f080118);
            resources.a("rock", "punk", 0x7f08012b);
            resources.a("rock", "rock_misc", 0x7f080133);
            resources.a("rock", "rock_n_roll", 0x7f080134);
            resources.a("rock", "rock_rock", 0x7f080135);
            resources.a("romance", "date", 0x7f0800f3);
            resources.a("romance", "romance_misc", 0x7f080137);
            resources.a("romance", "wedding", 0x7f08014f);
            resources.a("toplists", "sweden", 0x7f08013f);
            resources.a("toplists", "toplists_misc", 0x7f080144);
            resources.a("toplists", "uk", 0x7f08014a);
            resources.a("toplists", "usa", 0x7f08014d);
            resources.a("travel", "geographical", 0x7f080102);
            resources.a("travel", "on_the_beach", 0x7f08011f);
            resources.a("travel", "road_trip", 0x7f080131);
            resources.a("travel", "travel_misc", 0x7f080147);
            resources.a("urban", "hophop", 0x7f08010a);
            resources.a("urban", "reggae", 0x7f08012e);
            resources.a("urban", "r_n_b", 0x7f08012c);
            resources.a("urban", "urban_misc", 0x7f08014c);
            resources.a("workout", "in_the_gym", 0x7f08010c);
            resources.a("workout", "running", 0x7f080139);
            resources.a("workout", "workout_misc", 0x7f080151);
            b = Collections.unmodifiableMap(((elx) (resources)).a);
        }
        elw;
        JVM INSTR monitorexit ;
        return;
        resources;
        throw resources;
    }
}
