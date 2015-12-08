// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.CamelNotationHelper;
import com.hmobile.biblekjv.HolyBibleApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.hmobile.model:
//            BookInfo, VerseInfo

public class TodayVerseInfo extends ActiveRecordBase
{

    public static Integer m_verse_info_ids[] = {
        Integer.valueOf(3848), Integer.valueOf(3849), Integer.valueOf(3850), Integer.valueOf(8707), Integer.valueOf(13941), Integer.valueOf(13942), Integer.valueOf(13946), Integer.valueOf(13950), Integer.valueOf(13953), Integer.valueOf(13954), 
        Integer.valueOf(13956), Integer.valueOf(13957), Integer.valueOf(13958), Integer.valueOf(13961), Integer.valueOf(13963), Integer.valueOf(13967), Integer.valueOf(13971), Integer.valueOf(13972), Integer.valueOf(13977), Integer.valueOf(13980), 
        Integer.valueOf(13982), Integer.valueOf(13985), Integer.valueOf(13988), Integer.valueOf(13995), Integer.valueOf(13997), Integer.valueOf(14004), Integer.valueOf(14006), Integer.valueOf(14007), Integer.valueOf(14024), Integer.valueOf(14030), 
        Integer.valueOf(14031), Integer.valueOf(14032), Integer.valueOf(14040), Integer.valueOf(14059), Integer.valueOf(14064), Integer.valueOf(14073), Integer.valueOf(14078), Integer.valueOf(14080), Integer.valueOf(14081), Integer.valueOf(14094), 
        Integer.valueOf(14098), Integer.valueOf(14101), Integer.valueOf(14109), Integer.valueOf(14120), Integer.valueOf(14121), Integer.valueOf(14125), Integer.valueOf(14135), Integer.valueOf(14137), Integer.valueOf(14139), Integer.valueOf(14149), 
        Integer.valueOf(14165), Integer.valueOf(14176), Integer.valueOf(14178), Integer.valueOf(14189), Integer.valueOf(14193), Integer.valueOf(14197), Integer.valueOf(14231), Integer.valueOf(14237), Integer.valueOf(14240), Integer.valueOf(14242), 
        Integer.valueOf(14247), Integer.valueOf(14249), Integer.valueOf(14250), Integer.valueOf(14254), Integer.valueOf(14258), Integer.valueOf(14259), Integer.valueOf(14260), Integer.valueOf(14261), Integer.valueOf(14262), Integer.valueOf(14263), 
        Integer.valueOf(14265), Integer.valueOf(14269), Integer.valueOf(14270), Integer.valueOf(14271), Integer.valueOf(14272), Integer.valueOf(14273), Integer.valueOf(14290), Integer.valueOf(14292), Integer.valueOf(14293), Integer.valueOf(14296), 
        Integer.valueOf(14297), Integer.valueOf(14298), Integer.valueOf(14299), Integer.valueOf(14300), Integer.valueOf(14306), Integer.valueOf(14307), Integer.valueOf(14308), Integer.valueOf(14309), Integer.valueOf(14310), Integer.valueOf(14311), 
        Integer.valueOf(14322), Integer.valueOf(14323), Integer.valueOf(14324), Integer.valueOf(14330), Integer.valueOf(14332), Integer.valueOf(14335), Integer.valueOf(14337), Integer.valueOf(14338), Integer.valueOf(14355), Integer.valueOf(14356), 
        Integer.valueOf(14357), Integer.valueOf(14358), Integer.valueOf(14361), Integer.valueOf(14367), Integer.valueOf(14368), Integer.valueOf(14369), Integer.valueOf(14371), Integer.valueOf(14372), Integer.valueOf(14373), Integer.valueOf(14379), 
        Integer.valueOf(14385), Integer.valueOf(14388), Integer.valueOf(14389), Integer.valueOf(14390), Integer.valueOf(14393), Integer.valueOf(14405), Integer.valueOf(14406), Integer.valueOf(14420), Integer.valueOf(14422), Integer.valueOf(14435), 
        Integer.valueOf(14438), Integer.valueOf(14439), Integer.valueOf(14445), Integer.valueOf(14446), Integer.valueOf(14454), Integer.valueOf(14455), Integer.valueOf(14456), Integer.valueOf(14457), Integer.valueOf(14458), Integer.valueOf(14459), 
        Integer.valueOf(14460), Integer.valueOf(14461), Integer.valueOf(14462), Integer.valueOf(14468), Integer.valueOf(14469), Integer.valueOf(14473), Integer.valueOf(14474), Integer.valueOf(14475), Integer.valueOf(14478), Integer.valueOf(14479), 
        Integer.valueOf(14480), Integer.valueOf(14484), Integer.valueOf(14485), Integer.valueOf(14512), Integer.valueOf(14513), Integer.valueOf(14516), Integer.valueOf(14517), Integer.valueOf(14525), Integer.valueOf(14526), Integer.valueOf(14527), 
        Integer.valueOf(14529), Integer.valueOf(14530), Integer.valueOf(14531), Integer.valueOf(14532), Integer.valueOf(14542), Integer.valueOf(14543), Integer.valueOf(14544), Integer.valueOf(14545), Integer.valueOf(14546), Integer.valueOf(14547), 
        Integer.valueOf(14615), Integer.valueOf(14616), Integer.valueOf(14627), Integer.valueOf(14628), Integer.valueOf(14632), Integer.valueOf(14633), Integer.valueOf(14634), Integer.valueOf(14636), Integer.valueOf(14644), Integer.valueOf(14645), 
        Integer.valueOf(14649), Integer.valueOf(14650), Integer.valueOf(14652), Integer.valueOf(14653), Integer.valueOf(14693), Integer.valueOf(14694), Integer.valueOf(14695), Integer.valueOf(14696), Integer.valueOf(14702), Integer.valueOf(14703), 
        Integer.valueOf(14704), Integer.valueOf(14705), Integer.valueOf(14706), Integer.valueOf(14707), Integer.valueOf(14708), Integer.valueOf(14709), Integer.valueOf(14727), Integer.valueOf(14728), Integer.valueOf(14730), Integer.valueOf(14731), 
        Integer.valueOf(14732), Integer.valueOf(14749), Integer.valueOf(14750), Integer.valueOf(14751), Integer.valueOf(14760), Integer.valueOf(14765), Integer.valueOf(14766), Integer.valueOf(14767), Integer.valueOf(14768), Integer.valueOf(14770), 
        Integer.valueOf(14771), Integer.valueOf(14772), Integer.valueOf(14792), Integer.valueOf(14793), Integer.valueOf(14794), Integer.valueOf(14830), Integer.valueOf(14835), Integer.valueOf(14836), Integer.valueOf(14838), Integer.valueOf(14852), 
        Integer.valueOf(14865), Integer.valueOf(14880), Integer.valueOf(14882), Integer.valueOf(14893), Integer.valueOf(14894), Integer.valueOf(14895), Integer.valueOf(14896), Integer.valueOf(14897), Integer.valueOf(14899), Integer.valueOf(14949), 
        Integer.valueOf(14950), Integer.valueOf(14951), Integer.valueOf(14952), Integer.valueOf(14993), Integer.valueOf(14994), Integer.valueOf(15034), Integer.valueOf(15294), Integer.valueOf(15295), Integer.valueOf(15296), Integer.valueOf(15297), 
        Integer.valueOf(15298), Integer.valueOf(15299), Integer.valueOf(15300), Integer.valueOf(15301), Integer.valueOf(15342), Integer.valueOf(15343), Integer.valueOf(15344), Integer.valueOf(15397), Integer.valueOf(15398), Integer.valueOf(15399), 
        Integer.valueOf(15400), Integer.valueOf(15401), Integer.valueOf(15402), Integer.valueOf(15403), Integer.valueOf(15404), Integer.valueOf(15405), Integer.valueOf(15406), Integer.valueOf(15407), Integer.valueOf(15408), Integer.valueOf(15409), 
        Integer.valueOf(15410), Integer.valueOf(15411), Integer.valueOf(15412), Integer.valueOf(15413), Integer.valueOf(15414), Integer.valueOf(15415), Integer.valueOf(15416), Integer.valueOf(15417), Integer.valueOf(15467), Integer.valueOf(15468), 
        Integer.valueOf(15469), Integer.valueOf(15470), Integer.valueOf(15471), Integer.valueOf(15472), Integer.valueOf(15473), Integer.valueOf(15474), Integer.valueOf(15475), Integer.valueOf(15476), Integer.valueOf(15491), Integer.valueOf(15492), 
        Integer.valueOf(15493), Integer.valueOf(15495), Integer.valueOf(15496), Integer.valueOf(15497), Integer.valueOf(15511), Integer.valueOf(15512), Integer.valueOf(15513), Integer.valueOf(15514), Integer.valueOf(15515), Integer.valueOf(15523), 
        Integer.valueOf(15551), Integer.valueOf(15552), Integer.valueOf(15605), Integer.valueOf(15606), Integer.valueOf(15607), Integer.valueOf(15608), Integer.valueOf(15609), Integer.valueOf(15610), Integer.valueOf(15611), Integer.valueOf(15612), 
        Integer.valueOf(15626), Integer.valueOf(15652), Integer.valueOf(15653), Integer.valueOf(15655), Integer.valueOf(15656), Integer.valueOf(15657), Integer.valueOf(15699), Integer.valueOf(15700), Integer.valueOf(15701), Integer.valueOf(15702), 
        Integer.valueOf(15708), Integer.valueOf(15715), Integer.valueOf(15721), Integer.valueOf(15731), Integer.valueOf(15782), Integer.valueOf(15783), Integer.valueOf(15786), Integer.valueOf(15787), Integer.valueOf(15796), Integer.valueOf(15797), 
        Integer.valueOf(15798), Integer.valueOf(15799), Integer.valueOf(15800), Integer.valueOf(15801), Integer.valueOf(15802), Integer.valueOf(15805), Integer.valueOf(15816), Integer.valueOf(15817), Integer.valueOf(15818), Integer.valueOf(15819), 
        Integer.valueOf(15820), Integer.valueOf(15862), Integer.valueOf(15863), Integer.valueOf(15867), Integer.valueOf(15877), Integer.valueOf(15878), Integer.valueOf(15879), Integer.valueOf(15899), Integer.valueOf(15930), Integer.valueOf(15931), 
        Integer.valueOf(15932), Integer.valueOf(15933), Integer.valueOf(15934), Integer.valueOf(15935), Integer.valueOf(15936), Integer.valueOf(15937), Integer.valueOf(15938), Integer.valueOf(15939), Integer.valueOf(15940), Integer.valueOf(15941), 
        Integer.valueOf(15942), Integer.valueOf(16006), Integer.valueOf(16007), Integer.valueOf(16008), Integer.valueOf(16043), Integer.valueOf(16044), Integer.valueOf(16045), Integer.valueOf(16083), Integer.valueOf(16084), Integer.valueOf(16085), 
        Integer.valueOf(16086), Integer.valueOf(16087), Integer.valueOf(16088), Integer.valueOf(16089), Integer.valueOf(16090), Integer.valueOf(16179), Integer.valueOf(16198), Integer.valueOf(16199), Integer.valueOf(16200), Integer.valueOf(16201), 
        Integer.valueOf(16202), Integer.valueOf(16223), Integer.valueOf(16233), Integer.valueOf(16234), Integer.valueOf(16263), Integer.valueOf(16264), Integer.valueOf(16265), Integer.valueOf(16270), Integer.valueOf(16271), Integer.valueOf(16329), 
        Integer.valueOf(16330), Integer.valueOf(16331), Integer.valueOf(16332), Integer.valueOf(16338), Integer.valueOf(16343), Integer.valueOf(16344), Integer.valueOf(16350), Integer.valueOf(16351), Integer.valueOf(16396), Integer.valueOf(16397), 
        Integer.valueOf(16401), Integer.valueOf(16457), Integer.valueOf(16461), Integer.valueOf(16462), Integer.valueOf(16463), Integer.valueOf(16465), Integer.valueOf(16467), Integer.valueOf(16469), Integer.valueOf(16473), Integer.valueOf(16474), 
        Integer.valueOf(16475), Integer.valueOf(16620), Integer.valueOf(16623), Integer.valueOf(16624), Integer.valueOf(16648), Integer.valueOf(16649), Integer.valueOf(16684), Integer.valueOf(16685), Integer.valueOf(16686), Integer.valueOf(16687), 
        Integer.valueOf(16694), Integer.valueOf(16695), Integer.valueOf(16769), Integer.valueOf(16770), Integer.valueOf(16799), Integer.valueOf(16800), Integer.valueOf(16832), Integer.valueOf(16833), Integer.valueOf(16848), Integer.valueOf(16849), 
        Integer.valueOf(17017), Integer.valueOf(17018), Integer.valueOf(17019), Integer.valueOf(17020), Integer.valueOf(17202), Integer.valueOf(17203), Integer.valueOf(17315), Integer.valueOf(17316), Integer.valueOf(17361), Integer.valueOf(17362), 
        Integer.valueOf(17363), Integer.valueOf(17364), Integer.valueOf(17365), Integer.valueOf(17366), Integer.valueOf(17367), Integer.valueOf(17368), Integer.valueOf(17369), Integer.valueOf(17370), Integer.valueOf(17371), Integer.valueOf(17372), 
        Integer.valueOf(17373), Integer.valueOf(17374), Integer.valueOf(17375), Integer.valueOf(17376), Integer.valueOf(17377), Integer.valueOf(17378), Integer.valueOf(17379), Integer.valueOf(17380), Integer.valueOf(17381), Integer.valueOf(17382), 
        Integer.valueOf(17674), Integer.valueOf(19647), Integer.valueOf(19779), Integer.valueOf(23292), Integer.valueOf(26137), Integer.valueOf(26670), Integer.valueOf(26671), Integer.valueOf(26672), Integer.valueOf(26673), Integer.valueOf(26674), 
        Integer.valueOf(26675), Integer.valueOf(28667), Integer.valueOf(28668), Integer.valueOf(28669), Integer.valueOf(28670), Integer.valueOf(28671), Integer.valueOf(28672), Integer.valueOf(28673), Integer.valueOf(28674), Integer.valueOf(28675), 
        Integer.valueOf(28676), Integer.valueOf(28677), Integer.valueOf(28678), Integer.valueOf(28679), Integer.valueOf(29363), Integer.valueOf(29364), Integer.valueOf(29365), Integer.valueOf(29366), Integer.valueOf(29367), Integer.valueOf(29368), 
        Integer.valueOf(29369), Integer.valueOf(29370), Integer.valueOf(29371), Integer.valueOf(29372), Integer.valueOf(29373), Integer.valueOf(29374), Integer.valueOf(29375), Integer.valueOf(29376), Integer.valueOf(29377), Integer.valueOf(29378), 
        Integer.valueOf(29379), Integer.valueOf(29380), Integer.valueOf(29381), Integer.valueOf(29382), Integer.valueOf(29383), Integer.valueOf(29384), Integer.valueOf(29385), Integer.valueOf(29386), Integer.valueOf(29387), Integer.valueOf(29388), 
        Integer.valueOf(29389), Integer.valueOf(29390), Integer.valueOf(29391), Integer.valueOf(29392), Integer.valueOf(29393), Integer.valueOf(29394), Integer.valueOf(29395), Integer.valueOf(29396), Integer.valueOf(29397), Integer.valueOf(29398), 
        Integer.valueOf(29399), Integer.valueOf(29400), Integer.valueOf(29401), Integer.valueOf(29402), Integer.valueOf(29403), Integer.valueOf(29404), Integer.valueOf(29405), Integer.valueOf(29406), Integer.valueOf(29407), Integer.valueOf(29408), 
        Integer.valueOf(29409), Integer.valueOf(29410), Integer.valueOf(29411), Integer.valueOf(29412), Integer.valueOf(29413), Integer.valueOf(29414), Integer.valueOf(29415), Integer.valueOf(29416), Integer.valueOf(29417), Integer.valueOf(29418), 
        Integer.valueOf(29419), Integer.valueOf(29420), Integer.valueOf(29421), Integer.valueOf(29422), Integer.valueOf(29423), Integer.valueOf(29424), Integer.valueOf(29425), Integer.valueOf(29426), Integer.valueOf(29427), Integer.valueOf(29428), 
        Integer.valueOf(29429), Integer.valueOf(29430), Integer.valueOf(29431), Integer.valueOf(29432), Integer.valueOf(29433), Integer.valueOf(29434), Integer.valueOf(29435), Integer.valueOf(29436), Integer.valueOf(29437), Integer.valueOf(29438), 
        Integer.valueOf(29439), Integer.valueOf(29440), Integer.valueOf(29441), Integer.valueOf(29442), Integer.valueOf(29443), Integer.valueOf(29444), Integer.valueOf(29445), Integer.valueOf(29446), Integer.valueOf(29447), Integer.valueOf(29448), 
        Integer.valueOf(29449), Integer.valueOf(29450), Integer.valueOf(29451), Integer.valueOf(29452), Integer.valueOf(29453), Integer.valueOf(29454), Integer.valueOf(29455), Integer.valueOf(29456), Integer.valueOf(29457), Integer.valueOf(29458), 
        Integer.valueOf(29459), Integer.valueOf(29460), Integer.valueOf(29461), Integer.valueOf(29462), Integer.valueOf(29463), Integer.valueOf(29464), Integer.valueOf(29465), Integer.valueOf(29466), Integer.valueOf(29637), Integer.valueOf(30174), 
        Integer.valueOf(30697)
    };
    public int BookId;
    public int ChapterNumber;
    public String Verse;
    public int VerseNumber;

    public TodayVerseInfo()
    {
        ChapterNumber = 0;
        BookId = 0;
        VerseNumber = 0;
        Verse = "";
    }

    public static TodayVerseInfo getVerseInfoByVerse(String s, android.content.SharedPreferences.Editor editor)
    {
        s = HolyBibleApplication.LocalConnection().find(com/hmobile/model/TodayVerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("Verse")))).append("=?").toString(), new String[] {
            s
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (s.size() > 0)
        {
            return (TodayVerseInfo)s.get(0);
        }
        s = BookInfo.getTodayVerse();
        editor.putString("TodayVerse", ((TodayVerseInfo) (s)).Verse);
        editor.putInt("BookCount", ((TodayVerseInfo) (s)).BookId);
        editor.putInt("ChapterCount", ((TodayVerseInfo) (s)).ChapterNumber);
        editor.putInt("VerseCount", ((TodayVerseInfo) (s)).VerseNumber);
        s = new Date();
        editor.putString("TodayDate", (new SimpleDateFormat("MM/dd/yyyy")).format(s));
        editor.commit();
        s = BookInfo.getTodayVerse();
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    public static void saveTodayVerse()
    {
        int i = 0;
_L2:
        if (i >= m_verse_info_ids.length)
        {
            return;
        }
        VerseInfo verseinfo = (VerseInfo)HolyBibleApplication.Connection().findByID(com/hmobile/model/VerseInfo, m_verse_info_ids[i].intValue());
        if (verseinfo == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        List list = HolyBibleApplication.LocalConnection().find(com/hmobile/model/TodayVerseInfo, (new StringBuilder(String.valueOf(CamelNotationHelper.toSQLName("BookId")))).append("=? and ").append(CamelNotationHelper.toSQLName("ChapterNumber")).append("=? and ").append(CamelNotationHelper.toSQLName("VerseNumber")).append("=?").toString(), new String[] {
            String.valueOf(verseinfo.BookId), String.valueOf(verseinfo.ChapterNumber), String.valueOf(verseinfo.VerseNumber)
        });
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (list.size() > 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        TodayVerseInfo todayverseinfo = (TodayVerseInfo)HolyBibleApplication.LocalConnection().newEntity(com/hmobile/model/TodayVerseInfo);
        todayverseinfo.ChapterNumber = verseinfo.ChapterNumber;
        todayverseinfo.BookId = verseinfo.BookId;
        todayverseinfo.VerseNumber = verseinfo.VerseNumber;
        todayverseinfo.Verse = verseinfo.Verse;
        todayverseinfo.save();
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        activerecordexception.printStackTrace();
          goto _L3
    }

}
