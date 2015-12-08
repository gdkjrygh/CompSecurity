.class public Lcom/cleanmaster/ui/app/market/Ad;
.super Lcom/cleanmaster/ui/app/market/b;
.source "SourceFile"


# static fields
.field public static final APP_CAN_UPDATE:I = 0x2

.field public static final APP_INSTALLED:I = 0x1

.field public static final APP_NOT_INSTALLED:I = 0x0

.field public static final APP_TAG_NOT_SHOW:I = 0x0

.field public static final APP_TAG_SHOW_HOT:I = 0x2

.field public static final APP_TAG_SHOW_NEW:I = 0x1

.field private static final BOLD_MASK:I = 0x1

.field private static final COLLECTION_AD_TYPE:I = 0x64

.field public static final COLOR_BLACK:I = 0x2

.field public static final COLOR_BLUE:I = 0x4

.field public static final COLOR_GREY:I = 0x1

.field public static final COLOR_LIGHT_GREY:I = 0x3

.field public static final COLOR_LIGHT_RED:I = 0x5

.field private static final COLOR_MASK:I = 0x1e

.field private static final DESC_MASK:I = 0x3e0

.field private static final DETAIL_MASK:I = 0x7c00

.field public static final ICON_LIST_MAX_COUNT:I = 0x4

.field public static final INMOBI_RES_TYPE:I = 0x3e9

.field public static final MT_TYPE_OPEN_BROWSER:I = 0x100

.field public static final MT_TYPE_OPEN_DEEPLINK:I = 0x200

.field public static final MT_TYPE_OPEN_DOWNLOAD:I = 0x8

.field public static final MT_TYPE_OPEN_INTERNAL:I = 0x40

.field public static final MT_TYPE_OPEN_WEBVIEW:I = 0x80

.field private static final OPERATION_AD_TYPE:I = 0x0

.field public static final RECOMMEND_SHOW_TYPE_HIGH:I = 0x3eb

.field public static final RECOMMEND_SHOW_TYPE_LOW:I = 0x3ed

.field public static final RECOMMEND_TYPE_THREE_APPS:I = 0xd

.field private static final SELF_ADV_AD_TYPE:I = 0x3

.field private static final SHOW_TOP_FAKE_PKGNAME:Ljava/lang/String; = "x_showtop"

.field public static final SHOW_TYPE_BANNER_GALLERY:I = 0x3fa

.field public static final SHOW_TYPE_BANNER_ICON_LIST:I = 0x3f5

.field public static final SHOW_TYPE_BANNER_SINGLE_APP:I = 0x3f4

.field public static final SHOW_TYPE_BANNER_TEXT:I = 0x3f6

.field public static final SHOW_TYPE_BAO_CARD:I = 0x3ea

.field public static final SHOW_TYPE_BAO_CARD_NEW:I = 0xc350

.field public static final SHOW_TYPE_BIG_ICON:I = 0x3ec

.field public static final SHOW_TYPE_BIG_PICKS:I = 0x3e8

.field public static final SHOW_TYPE_CONTENT_CHEETAH_JUMPTO:I = 0x2710

.field public static final SHOW_TYPE_EIGHT_ICON:I = 0x3f7

.field public static final SHOW_TYPE_FACEBOOK:I = 0x3f8

.field public static final SHOW_TYPE_GAMEBOX_3_ICON:I = 0x400

.field public static final SHOW_TYPE_GAMEBOX_BAO_CARD:I = 0x3fe

.field public static final SHOW_TYPE_GAME_BIG_CARD:I = 0x3f2

.field public static final SHOW_TYPE_GDT:I = 0x402

.field public static final SHOW_TYPE_GENERNAL_PICKS:I = 0x0

.field public static final SHOW_TYPE_GP_TOP:I = 0x401

.field public static final SHOW_TYPE_HAVE_PIC_BIG_CARD:I = 0xc350

.field public static final SHOW_TYPE_HTML5_CARD:I = 0x3ff

.field public static final SHOW_TYPE_ICON_LIST:I = 0x3ee

.field public static final SHOW_TYPE_NO_PIC_SMALL_CARD:I = 0xc351

.field public static final SHOW_TYPE_RESULTPAGE_BIGCARD:I = 0x3f8

.field public static final SHOW_TYPE_SPECIAL_RECOMMEND:I = 0x3e9

.field public static final SHOW_TYPE_TEXT:I = 0x3f1

.field public static final SHOW_TYPE_TEXT_WITH_ICON:I = 0x3f3

.field public static final SHOW_TYPE_THREE_ICON:I = 0x3f0

.field public static final SHOW_TYPE_TWO_PIC:I = 0x3ef

.field public static final SHOW_TYPE_VAST:I = 0xc353

.field public static final SIMILAR_MAX_COUNT:I = 0x3

.field private static final TITLE_MASK:I = 0x1f

.field public static final VERSION:I = 0x26


# instance fields
.field _conditionsjson:Lcom/cleanmaster/data/filter/b;

.field private app_action_type:I

.field private app_show_type:I

.field private app_tag:I

.field private background:Ljava/lang/String;

.field private button_txt:Ljava/lang/String;

.field private conditionsjson:Ljava/lang/String;

.field private context_code:Ljava/lang/String;

.field private des:Ljava/lang/String;

.field private desc:Ljava/lang/String;

.field private detail_id:Ljava/lang/String;

.field private detail_pg:Ljava/lang/String;

.field private download_num:Ljava/lang/String;

.field private genre:Ljava/lang/String;

.field private html:Ljava/lang/String;

.field public installedStatus:I

.field public isNativeAd:Z

.field private isShowGuess:Z

.field private mAdStatus:I

.field private mClickTrackingUrl:Ljava/lang/String;

.field private mCreateTime:J

.field private mDeepLink:Ljava/lang/String;

.field private mEditorExt:Ljava/lang/String;

.field private mEditorHeadLogo:Ljava/lang/String;

.field private mEditorName:Ljava/lang/String;

.field private mEditorRecommend:Ljava/lang/String;

.field private mExtension:Ljava/lang/String;

.field private mFont:I

.field private mImprTrackingUrl:Ljava/lang/String;

.field private mLikes:I

.field private mLoadClick:I

.field private mPosName:Ljava/lang/String;

.field private mPosid:Ljava/lang/String;

.field private mPriority:I

.field private mSugApps:Ljava/util/ArrayList;

.field private mThirdImpUrl:Ljava/lang/String;

.field private mTimeStamp:J

.field private mt_type:I

.field private name_space:Ljava/lang/String;

.field private pic_url:Ljava/lang/String;

.field private pkg:Ljava/lang/String;

.field private pkg_size:Ljava/lang/String;

.field private pkg_url:Ljava/lang/String;

.field private price:D

.field private rating:D

.field private res_type:I

.field private reviewers:Ljava/lang/String;

.field private showRating:I

.field private showedPos:I

.field private subject:I

.field private sug_app:Ljava/lang/String;

.field private sug_type:I

.field private title:Ljava/lang/String;

.field private trigger_src:Ljava/lang/String;

.field private vastModel:Lcom/cleanmaster/model/VastModel;

.field public versionCode:I

.field private x_posision:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 27
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/b;-><init>()V

    .line 222
    iput v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->subject:I

    .line 232
    iput v3, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_show_type:I

    .line 233
    iput v3, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_action_type:I

    .line 245
    iput v3, p0, Lcom/cleanmaster/ui/app/market/Ad;->x_posision:I

    .line 248
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPosName:Ljava/lang/String;

    .line 249
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorHeadLogo:Ljava/lang/String;

    .line 250
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorName:Ljava/lang/String;

    .line 251
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorRecommend:Ljava/lang/String;

    .line 252
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorExt:Ljava/lang/String;

    .line 253
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mTimeStamp:J

    .line 255
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mImprTrackingUrl:Ljava/lang/String;

    .line 256
    iput v3, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLikes:I

    .line 257
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->conditionsjson:Ljava/lang/String;

    .line 258
    iput-boolean v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->isShowGuess:Z

    .line 259
    iput-boolean v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->isNativeAd:Z

    .line 260
    iput v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->showedPos:I

    .line 261
    iput v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->mAdStatus:I

    .line 262
    iput v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->mFont:I

    .line 263
    iput v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLoadClick:I

    .line 1437
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->_conditionsjson:Lcom/cleanmaster/data/filter/b;

    return-void
.end method

.method public static LONG(Landroid/database/Cursor;Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 1227
    :try_start_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p2

    .line 1231
    :goto_0
    return-wide p2

    .line 1229
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1217
    :try_start_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1221
    :goto_0
    return-object v0

    .line 1219
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static createAd(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 2

    .prologue
    .line 1423
    new-instance v0, Lcom/cleanmaster/ui/app/market/Ad;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    .line 1424
    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDes(Ljava/lang/String;)V

    .line 1425
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setSugType(I)V

    .line 1426
    invoke-virtual {v0, p0}, Lcom/cleanmaster/ui/app/market/Ad;->createAdFromPckName(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    return-object v0
.end method

.method public static createTable(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1246
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE IF NOT EXISTS "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(_id INTEGER PRIMARY KEY,title TEXT,desc TEXT,pic_url TEXT,pkg TEXT,pkg_url TEXT,des TEXT,app_tag INTEGER,detail_id TEXT,download_num TEXT,rating DOUBLE,show_rating TEXT,price DOUBLE,reviewers TEXT,genre TEXT,pkg_size TEXT,sug_type INTEGER,res_type INTEGER,subject INTEGER,app_action_type INTEGER,app_show_type INTEGER,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mt_type INTEGER,background TEXT,context_code TEXT,name_space TEXT,trigger_src TEXT,button_txt TEXT,sug_app TEXT,pos_name TEXT,timestamp INTEGER,editor_head_logo TEXT,editor_name TEXT,editor_ext TEXT,detail_pg TEXT,editor_recommend TEXT,impr_tracking_url TEXT,likes INTEGER,conditionsjson TEXT,is_ad INTEGER,font INTEGER,load_clk INTEGER,html TEXT,extension"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT,deeplink TEXT,priority INTEGER,click_tracking_url TEXT,third_imp_url TEXT,create_time INTEGER,posid TEXT);"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1297
    return-void
.end method

.method private getDescFont()I
    .locals 1

    .prologue
    .line 843
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v0

    and-int/lit16 v0, v0, 0x3e0

    shr-int/lit8 v0, v0, 0x5

    return v0
.end method

.method private getDetailFont()I
    .locals 1

    .prologue
    .line 847
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v0

    and-int/lit16 v0, v0, 0x7c00

    shr-int/lit8 v0, v0, 0xa

    return v0
.end method

.method private getTitleFont()I
    .locals 1

    .prologue
    .line 839
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v0

    and-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public static getTopAds(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    .prologue
    .line 1338
    const-string v0, "x_showtop"

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "x_showtop"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static notnull(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 1093
    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method


# virtual methods
.method public canUpdate()Z
    .locals 2

    .prologue
    .line 1334
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public createAdFromPckName(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 0

    .prologue
    .line 402
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg:Ljava/lang/String;

    .line 403
    return-object p0
.end method

.method public fromCursor(Landroid/database/Cursor;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 4

    .prologue
    .line 1163
    const-string v0, "title"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setTitle(Ljava/lang/String;)V

    .line 1164
    const-string v0, "pic_url"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPicUrl(Ljava/lang/String;)V

    .line 1165
    const-string v0, "pkg"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPkg(Ljava/lang/String;)V

    .line 1166
    const-string v0, "pkg_url"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPkgUrl(Ljava/lang/String;)V

    .line 1167
    const-string v0, "app_tag"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setAppTag(I)V

    .line 1168
    const-string v0, "des"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDes(Ljava/lang/String;)V

    .line 1169
    const-string v0, "desc"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDesc(Ljava/lang/String;)V

    .line 1170
    const-string v0, "detail_id"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDetailId(Ljava/lang/String;)V

    .line 1171
    const-string v0, "download_num"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDownloadNum(Ljava/lang/String;)V

    .line 1172
    const-string v0, "subject"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setSubject(I)V

    .line 1173
    const-string v0, "rating"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setRating(D)V

    .line 1174
    const-string v0, "price"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPrice(D)V

    .line 1175
    const-string v0, "reviewers"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setReviewers(Ljava/lang/String;)V

    .line 1176
    const-string v0, "genre"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setgenre(Ljava/lang/String;)V

    .line 1177
    const-string v0, "pkg_size"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPkgSize(Ljava/lang/String;)V

    .line 1178
    const-string v0, "sug_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setSugType(I)V

    .line 1179
    const-string v0, "res_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 1180
    const-string v0, "mt_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setMtType(I)V

    .line 1181
    const-string v0, "app_show_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setAppShowType(I)V

    .line 1182
    const-string v0, "app_action_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setAppActionType(I)V

    .line 1183
    const-string v0, "background"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setBackground(Ljava/lang/String;)V

    .line 1184
    const-string v0, "context_code"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setContextCode(Ljava/lang/String;)V

    .line 1185
    const-string v0, "name_space"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setNameSpace(Ljava/lang/String;)V

    .line 1186
    const-string v0, "trigger_src"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setTriggerSrc(Ljava/lang/String;)V

    .line 1187
    const-string v0, "sug_app"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setSugApp(Ljava/lang/String;)V

    .line 1188
    const-string v0, "button_txt"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setButtonTxt(Ljava/lang/String;)V

    .line 1189
    const-string v0, "detail_pg"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDetail_pg(Ljava/lang/String;)V

    .line 1191
    const-string v0, "pos_name"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPosName(Ljava/lang/String;)V

    .line 1192
    const-string v0, "timestamp"

    const-wide/16 v2, 0x0

    invoke-static {p1, v0, v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->LONG(Landroid/database/Cursor;Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setTimeStamp(J)V

    .line 1193
    const-string v0, "editor_head_logo"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorHeadLogo(Ljava/lang/String;)V

    .line 1194
    const-string v0, "editor_name"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorName(Ljava/lang/String;)V

    .line 1195
    const-string v0, "editor_recommend"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorRecommend(Ljava/lang/String;)V

    .line 1196
    const-string v0, "editor_ext"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorExt(Ljava/lang/String;)V

    .line 1197
    const-string v0, "impr_tracking_url"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setImprTrackingUrl(Ljava/lang/String;)V

    .line 1198
    const-string v0, "likes"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setLikes(I)V

    .line 1199
    const-string v0, "conditionsjson"

    const-string v1, ""

    invoke-static {p1, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->STRING(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setConditionsJson(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    .line 1200
    const-string v0, "is_ad"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setAdStatus(I)V

    .line 1201
    const-string v0, "font"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setFont(I)V

    .line 1202
    const-string v0, "load_clk"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setLoadClick(I)V

    .line 1203
    const-string v0, "html"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setHtml(Ljava/lang/String;)V

    .line 1204
    const-string v0, "extension"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setExtension(Ljava/lang/String;)V

    .line 1205
    const-string v0, "deeplink"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDeepLink(Ljava/lang/String;)V

    .line 1206
    const-string v0, "priority"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPriority(I)V

    .line 1207
    const-string v0, "click_tracking_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setClickTrackingUrl(Ljava/lang/String;)V

    .line 1208
    const-string v0, "third_imp_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setThirdImpUrl(Ljava/lang/String;)V

    .line 1209
    const-string v0, "create_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setCreateTime(J)V

    .line 1210
    const-string v0, "posid"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPosid(Ljava/lang/String;)V

    .line 1211
    return-object p0
.end method

.method public bridge synthetic fromCursor(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->fromCursor(Landroid/database/Cursor;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    return-object v0
.end method

.method public fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 933
    if-eqz p1, :cond_2f

    .line 935
    :try_start_0
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 936
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setTitle(Ljava/lang/String;)V

    .line 938
    :cond_0
    const-string v1, "desc"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 939
    const-string v1, "desc"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDesc(Ljava/lang/String;)V

    .line 941
    :cond_1
    const-string v1, "pic_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 942
    const-string v1, "pic_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPicUrl(Ljava/lang/String;)V

    .line 944
    :cond_2
    const-string v1, "pkg"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 945
    const-string v1, "pkg"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPkg(Ljava/lang/String;)V

    .line 947
    :cond_3
    const-string v1, "pkg_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 948
    const-string v1, "pkg_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPkgUrl(Ljava/lang/String;)V

    .line 950
    :cond_4
    const-string v1, "des"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 951
    const-string v1, "des"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDes(Ljava/lang/String;)V

    .line 953
    :cond_5
    const-string v1, "app_tag"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 954
    const-string v1, "app_tag"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setAppTag(I)V

    .line 956
    :cond_6
    const-string v1, "detail_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 957
    const-string v1, "detail_id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDetailId(Ljava/lang/String;)V

    .line 959
    :cond_7
    const-string v1, "download_num"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 960
    const-string v1, "download_num"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDownloadNum(Ljava/lang/String;)V

    .line 962
    :cond_8
    const-string v1, "subject"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 963
    const-string v1, "subject"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setSubject(I)V

    .line 965
    :cond_9
    const-string v1, "rating"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 966
    const-string v1, "rating"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->setRating(D)V

    .line 968
    :cond_a
    const-string v1, "versioncode"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 969
    const-string v1, "versioncode"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->versionCode:I

    .line 971
    :cond_b
    const-string v1, "price"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 972
    const-string v1, "price"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->setPrice(D)V

    .line 974
    :cond_c
    const-string v1, "reviewers"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    .line 975
    const-string v1, "reviewers"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setReviewers(Ljava/lang/String;)V

    .line 977
    :cond_d
    const-string v1, "genre"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    .line 978
    const-string v1, "genre"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setgenre(Ljava/lang/String;)V

    .line 980
    :cond_e
    const-string v1, "pkg_size"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 981
    const-string v1, "pkg_size"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPkgSize(Ljava/lang/String;)V

    .line 983
    :cond_f
    const-string v1, "sug_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 984
    const-string v1, "sug_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setSugType(I)V

    .line 986
    :cond_10
    const-string v1, "res_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    .line 987
    const-string v1, "res_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setResType(I)V

    .line 989
    :cond_11
    const-string v1, "mt_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_12

    .line 990
    const-string v1, "mt_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setMtType(I)V

    .line 992
    :cond_12
    const-string v1, "app_show_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_13

    .line 993
    const-string v1, "app_show_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setAppShowType(I)V

    .line 995
    :cond_13
    const-string v1, "app_action_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 996
    const-string v1, "app_action_type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setAppActionType(I)V

    .line 998
    :cond_14
    const-string v1, "background"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_15

    .line 999
    const-string v1, "background"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setBackground(Ljava/lang/String;)V

    .line 1001
    :cond_15
    const-string v1, "context_code"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_16

    .line 1002
    const-string v1, "context_code"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setContextCode(Ljava/lang/String;)V

    .line 1004
    :cond_16
    const-string v1, "name_space"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    .line 1005
    const-string v1, "name_space"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setNameSpace(Ljava/lang/String;)V

    .line 1007
    :cond_17
    const-string v1, "trigger_src"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_18

    .line 1008
    const-string v1, "trigger_src"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setTriggerSrc(Ljava/lang/String;)V

    .line 1010
    :cond_18
    const-string v1, "sug_app"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_19

    .line 1011
    const-string v1, "sug_app"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setSugApp(Ljava/lang/String;)V

    .line 1013
    :cond_19
    const-string v1, "button_txt"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1a

    .line 1014
    const-string v1, "button_txt"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setButtonTxt(Ljava/lang/String;)V

    .line 1016
    :cond_1a
    const-string v1, "detail_pg"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1b

    .line 1017
    const-string v1, "detail_pg"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setDetail_pg(Ljava/lang/String;)V

    .line 1019
    :cond_1b
    const-string v1, "pos_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 1020
    const-string v1, "pos_name"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setPosName(Ljava/lang/String;)V

    .line 1022
    :cond_1c
    const-string v1, "timestamp"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1d

    .line 1023
    const-string v1, "timestamp"

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->setTimeStamp(J)V

    .line 1025
    :cond_1d
    const-string v1, "editor_head_logo"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    .line 1026
    const-string v1, "editor_head_logo"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorHeadLogo(Ljava/lang/String;)V

    .line 1028
    :cond_1e
    const-string v1, "editor_name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1f

    .line 1029
    const-string v1, "editor_name"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorName(Ljava/lang/String;)V

    .line 1031
    :cond_1f
    const-string v1, "editor_recommend"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_20

    .line 1032
    const-string v1, "editor_recommend"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorRecommend(Ljava/lang/String;)V

    .line 1034
    :cond_20
    const-string v1, "editor_ext"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_21

    .line 1035
    const-string v1, "editor_ext"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setEditorExt(Ljava/lang/String;)V

    .line 1037
    :cond_21
    const-string v1, "impr_tracking_url"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_22

    .line 1038
    const-string v1, "impr_tracking_url"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setImprTrackingUrl(Ljava/lang/String;)V

    .line 1040
    :cond_22
    const-string v1, "likes"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_23

    .line 1041
    const-string v1, "likes"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setLikes(I)V

    .line 1043
    :cond_23
    const-string v1, "conditionsjson"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_24

    .line 1044
    const-string v1, "conditionsjson"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setConditionsJson(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;

    .line 1048
    :cond_24
    const-string v1, "is_ad"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_25

    .line 1049
    const-string v0, "is_ad"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 1051
    :cond_25
    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setAdStatus(I)V

    .line 1053
    const-string v0, "font"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_26

    .line 1054
    const-string v0, "font"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setFont(I)V

    .line 1056
    :cond_26
    const-string v0, "load_clk"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_27

    .line 1057
    const-string v0, "load_clk"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setLoadClick(I)V

    .line 1060
    :cond_27
    const-string v0, "html"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_28

    .line 1061
    const-string v0, "html"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setHtml(Ljava/lang/String;)V

    .line 1064
    :cond_28
    const-string v0, "extension"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_29

    .line 1065
    const-string v0, "extension"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setExtension(Ljava/lang/String;)V

    .line 1067
    :cond_29
    const-string v0, "deeplink"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2a

    .line 1068
    const-string v0, "deeplink"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setDeepLink(Ljava/lang/String;)V

    .line 1070
    :cond_2a
    const-string v0, "priority"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2b

    .line 1071
    const-string v0, "priority"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPriority(I)V

    .line 1073
    :cond_2b
    const-string v0, "click_tracking_url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2c

    .line 1074
    const-string v0, "click_tracking_url"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setClickTrackingUrl(Ljava/lang/String;)V

    .line 1076
    :cond_2c
    const-string v0, "third_imp_url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2d

    .line 1077
    const-string v0, "third_imp_url"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setThirdImpUrl(Ljava/lang/String;)V

    .line 1079
    :cond_2d
    const-string v0, "create_time"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 1080
    const-string v0, "create_time"

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/Ad;->setCreateTime(J)V

    .line 1082
    :cond_2e
    const-string v0, "posid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 1083
    const-string v0, "posid"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/Ad;->setPosid(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1089
    :cond_2f
    :goto_0
    return-object p0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public bridge synthetic fromJSONObject(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;

    move-result-object v0

    return-object v0
.end method

.method public getActionForMaidian()I
    .locals 1

    .prologue
    .line 1300
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isOpenInternal()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1301
    const/4 v0, 0x6

    .line 1313
    :goto_0
    return v0

    .line 1303
    :cond_0
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    packed-switch v0, :pswitch_data_0

    .line 1313
    const/4 v0, 0x0

    goto :goto_0

    .line 1305
    :pswitch_0
    const/4 v0, 0x4

    goto :goto_0

    .line 1307
    :pswitch_1
    const/4 v0, 0x3

    goto :goto_0

    .line 1309
    :pswitch_2
    const/4 v0, 0x2

    goto :goto_0

    .line 1303
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public getAdStatus()I
    .locals 1

    .prologue
    .line 390
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mAdStatus:I

    return v0
.end method

.method public getAppActionType()I
    .locals 1

    .prologue
    .line 704
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_action_type:I

    return v0
.end method

.method public getAppShowType()I
    .locals 1

    .prologue
    .line 700
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_show_type:I

    return v0
.end method

.method public getAppTag()I
    .locals 1

    .prologue
    .line 569
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_tag:I

    return v0
.end method

.method public getBackground()Ljava/lang/String;
    .locals 1

    .prologue
    .line 739
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->background:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonTxt()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1396
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->button_txt:Ljava/lang/String;

    return-object v0
.end method

.method public getClickTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mClickTrackingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getConditionsJson()Ljava/lang/String;
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->conditionsjson:Ljava/lang/String;

    return-object v0
.end method

.method public getContextCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 747
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->context_code:Ljava/lang/String;

    return-object v0
.end method

.method public getCreateTime()J
    .locals 4

    .prologue
    .line 365
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mCreateTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 366
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mCreateTime:J

    .line 368
    :cond_0
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mCreateTime:J

    return-wide v0
.end method

.method public getDeepLink()Ljava/lang/String;
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mDeepLink:Ljava/lang/String;

    return-object v0
.end method

.method public getDes()Ljava/lang/String;
    .locals 1

    .prologue
    .line 555
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->des:Ljava/lang/String;

    return-object v0
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->desc:Ljava/lang/String;

    return-object v0
.end method

.method public getDescColor()I
    .locals 1

    .prologue
    .line 865
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDescFont()I

    move-result v0

    and-int/lit8 v0, v0, 0x1e

    shr-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getDetailColor()I
    .locals 1

    .prologue
    .line 868
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetailFont()I

    move-result v0

    and-int/lit8 v0, v0, 0x1e

    shr-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getDetailId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->detail_id:Ljava/lang/String;

    return-object v0
.end method

.method public getDetail_pg()Ljava/lang/String;
    .locals 1

    .prologue
    .line 483
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->detail_pg:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadNum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 597
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->download_num:Ljava/lang/String;

    return-object v0
.end method

.method public getEditorExt()Ljava/lang/String;
    .locals 1

    .prologue
    .line 799
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorExt:Ljava/lang/String;

    return-object v0
.end method

.method public getEditorHeadLogo()Ljava/lang/String;
    .locals 1

    .prologue
    .line 775
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorHeadLogo:Ljava/lang/String;

    return-object v0
.end method

.method public getEditorName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 783
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorName:Ljava/lang/String;

    return-object v0
.end method

.method public getEditorRecommend()Ljava/lang/String;
    .locals 1

    .prologue
    .line 791
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorRecommend:Ljava/lang/String;

    return-object v0
.end method

.method public getExtension()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1412
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mExtension:Ljava/lang/String;

    return-object v0
.end method

.method public getFont()I
    .locals 1

    .prologue
    .line 831
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mFont:I

    return v0
.end method

.method public getGenre()Ljava/lang/String;
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->genre:Ljava/lang/String;

    return-object v0
.end method

.method public getHtml()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1430
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->html:Ljava/lang/String;

    return-object v0
.end method

.method public getImprTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 430
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mImprTrackingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLikes()I
    .locals 1

    .prologue
    .line 679
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLikes:I

    return v0
.end method

.method public getLoadClk()I
    .locals 1

    .prologue
    .line 872
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLoadClick:I

    return v0
.end method

.method public getMtType()I
    .locals 1

    .prologue
    .line 696
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    return v0
.end method

.method public getNameSpace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 755
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->name_space:Ljava/lang/String;

    return-object v0
.end method

.method public getPicUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 511
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->pic_url:Ljava/lang/String;

    return-object v0
.end method

.method public getPkg()Ljava/lang/String;
    .locals 1

    .prologue
    .line 525
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg:Ljava/lang/String;

    return-object v0
.end method

.method public getPkgUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 539
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg_url:Ljava/lang/String;

    return-object v0
.end method

.method public getPosName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 759
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPosName:Ljava/lang/String;

    return-object v0
.end method

.method public getPosid()Ljava/lang/String;
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPosid:Ljava/lang/String;

    return-object v0
.end method

.method public getPosision()I
    .locals 1

    .prologue
    .line 1326
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->x_posision:I

    return v0
.end method

.method public getPrice()D
    .locals 2

    .prologue
    .line 623
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->price:D

    return-wide v0
.end method

.method public getPriority()I
    .locals 1

    .prologue
    .line 374
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPriority:I

    return v0
.end method

.method public getRating()D
    .locals 2

    .prologue
    .line 675
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->rating:D

    return-wide v0
.end method

.method public getResType()I
    .locals 1

    .prologue
    .line 671
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->res_type:I

    return v0
.end method

.method public getReviewers()Ljava/lang/String;
    .locals 1

    .prologue
    .line 635
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->reviewers:Ljava/lang/String;

    return-object v0
.end method

.method public getShowType()I
    .locals 1

    .prologue
    .line 615
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->showRating:I

    return v0
.end method

.method public getShowedPos()I
    .locals 1

    .prologue
    .line 1404
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->showedPos:I

    return v0
.end method

.method public getSubject()I
    .locals 1

    .prologue
    .line 611
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->subject:I

    return v0
.end method

.method public getSugApp()Ljava/lang/String;
    .locals 1

    .prologue
    .line 815
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_app:Ljava/lang/String;

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSugApps()Ljava/util/ArrayList;
    .locals 5

    .prologue
    .line 1368
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mSugApps:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1369
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mSugApps:Ljava/util/ArrayList;

    .line 1388
    :goto_0
    return-object v0

    .line 1371
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1372
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_app:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1374
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_app:Ljava/lang/String;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 1375
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 1376
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 1377
    new-instance v4, Lcom/cleanmaster/ui/app/market/Ad;

    invoke-direct {v4}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    .line 1378
    invoke-virtual {v4, v3}, Lcom/cleanmaster/ui/app/market/Ad;->fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;

    .line 1380
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1375
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1384
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 1387
    :cond_1
    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mSugApps:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method public getSugType()I
    .locals 1

    .prologue
    .line 663
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_type:I

    return v0
.end method

.method public getThirdImpUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mThirdImpUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .prologue
    .line 767
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mTimeStamp:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 468
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()I
    .locals 1

    .prologue
    .line 862
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitleFont()I

    move-result v0

    and-int/lit8 v0, v0, 0x1e

    shr-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getTriggerSrc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 827
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->trigger_src:Ljava/lang/String;

    return-object v0
.end method

.method public getTriggerSrcAsList()Ljava/util/List;
    .locals 5

    .prologue
    .line 1343
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1344
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->trigger_src:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1345
    const-string v1, "x_showtop"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1354
    :cond_0
    return-object v0

    .line 1348
    :cond_1
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->trigger_src:Ljava/lang/String;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1349
    if-eqz v2, :cond_0

    .line 1350
    array-length v3, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 1351
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1350
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public getVastModel()Lcom/cleanmaster/model/VastModel;
    .locals 1

    .prologue
    .line 1461
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->vastModel:Lcom/cleanmaster/model/VastModel;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    .prologue
    .line 439
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->versionCode:I

    return v0
.end method

.method public getpkg_size()Ljava/lang/String;
    .locals 1

    .prologue
    .line 655
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg_size:Ljava/lang/String;

    return-object v0
.end method

.method public hasDetail()Z
    .locals 1

    .prologue
    .line 1392
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetail_pg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isAvailAble()Z
    .locals 6

    .prologue
    .line 727
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/ui/app/market/c;->b(Ljava/lang/String;)J

    move-result-wide v0

    .line 728
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    .line 729
    const-wide/32 v0, 0x36ee80

    .line 731
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getCreateTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isDeepLink()Z
    .locals 2

    .prologue
    .line 723
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isDescBold()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 855
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDescFont()I

    move-result v1

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isDetailBold()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 859
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetailFont()I

    move-result v1

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isForOpen()Z
    .locals 2

    .prologue
    .line 1239
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isSubjectAd()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isOpenInternal()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isInstalled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    const/16 v1, 0x3ec

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    const/16 v1, 0x3ea

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    const/16 v1, 0x3fe

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v0

    const v1, 0xc350

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isForOpen_Uninstall()Z
    .locals 1

    .prologue
    .line 1235
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isSubjectAd()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isOpenInternal()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->isInstalled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isInstalled()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 443
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    if-ne v0, v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isNotInstalled()Z
    .locals 1

    .prologue
    .line 1330
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->installedStatus:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOpenBrowser()Z
    .locals 2

    .prologue
    .line 720
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOpenInternal()Z
    .locals 2

    .prologue
    .line 716
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOpenWebview()Z
    .locals 2

    .prologue
    .line 343
    iget v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOperationOrCollectionAd()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 451
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->res_type:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->res_type:I

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->res_type:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 455
    :cond_0
    :goto_0
    return v0

    .line 453
    :cond_1
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mAdStatus:I

    if-nez v1, :cond_0

    .line 455
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPreloadUrl()Z
    .locals 1

    .prologue
    .line 880
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLoadClk()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPriority()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 340
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPriority()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isShowGuess()Z
    .locals 1

    .prologue
    .line 273
    iget-boolean v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->isShowGuess:Z

    return v0
.end method

.method public isShowRating()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 639
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->showRating:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isSubjectAd()Z
    .locals 1

    .prologue
    .line 447
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSubject()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isTitleBold()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 851
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitleFont()I

    move-result v1

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public match(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1440
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->conditionsjson:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1453
    :cond_0
    :goto_0
    return v0

    .line 1444
    :cond_1
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->_conditionsjson:Lcom/cleanmaster/data/filter/b;

    if-nez v1, :cond_2

    .line 1445
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->conditionsjson:Ljava/lang/String;

    invoke-static {v1}, Lcom/cleanmaster/ui/app/market/data/filter/b;->a(Ljava/lang/String;)Lcom/cleanmaster/data/filter/b;

    move-result-object v1

    iput-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->_conditionsjson:Lcom/cleanmaster/data/filter/b;

    .line 1448
    :cond_2
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->_conditionsjson:Lcom/cleanmaster/data/filter/b;

    if-eqz v1, :cond_0

    .line 1452
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/Ad;->_conditionsjson:Lcom/cleanmaster/data/filter/b;

    invoke-interface {v0, p1}, Lcom/cleanmaster/data/filter/b;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public setAdStatus(I)V
    .locals 0

    .prologue
    .line 394
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mAdStatus:I

    .line 395
    return-void
.end method

.method public setAppActionType(I)V
    .locals 0

    .prologue
    .line 712
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_action_type:I

    .line 713
    return-void
.end method

.method public setAppShowType(I)V
    .locals 0

    .prologue
    .line 708
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_show_type:I

    .line 709
    return-void
.end method

.method public setAppTag(I)V
    .locals 0

    .prologue
    .line 562
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->app_tag:I

    .line 563
    return-void
.end method

.method public setBackground(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 735
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->background:Ljava/lang/String;

    .line 736
    return-void
.end method

.method public setButtonTxt(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1400
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->button_txt:Ljava/lang/String;

    .line 1401
    return-void
.end method

.method public setClickTrackingUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mClickTrackingUrl:Ljava/lang/String;

    .line 350
    return-void
.end method

.method public setConditionsJson(Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 0

    .prologue
    .line 407
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->conditionsjson:Ljava/lang/String;

    .line 408
    return-object p0
.end method

.method public setContextCode(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 743
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->context_code:Ljava/lang/String;

    .line 744
    return-void
.end method

.method public setCreateTime(J)V
    .locals 1

    .prologue
    .line 371
    iput-wide p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mCreateTime:J

    .line 372
    return-void
.end method

.method public setDeepLink(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 386
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mDeepLink:Ljava/lang/String;

    .line 387
    return-void
.end method

.method public setDes(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 547
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->des:Ljava/lang/String;

    .line 548
    return-void
.end method

.method public setDesc(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 475
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->desc:Ljava/lang/String;

    .line 476
    return-void
.end method

.method public setDetailId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->detail_id:Ljava/lang/String;

    .line 577
    return-void
.end method

.method public setDetail_pg(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 490
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->detail_pg:Ljava/lang/String;

    .line 491
    return-void
.end method

.method public setDownloadNum(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 590
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->download_num:Ljava/lang/String;

    .line 591
    return-void
.end method

.method public setEditorExt(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 803
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorExt:Ljava/lang/String;

    .line 804
    return-void
.end method

.method public setEditorHeadLogo(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 779
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorHeadLogo:Ljava/lang/String;

    .line 780
    return-void
.end method

.method public setEditorName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 787
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorName:Ljava/lang/String;

    .line 788
    return-void
.end method

.method public setEditorRecommend(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 795
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mEditorRecommend:Ljava/lang/String;

    .line 796
    return-void
.end method

.method public setExtension(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1416
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mExtension:Ljava/lang/String;

    .line 1417
    return-void
.end method

.method public setFont(I)V
    .locals 0

    .prologue
    .line 835
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mFont:I

    .line 836
    return-void
.end method

.method public setHtml(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1434
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->html:Ljava/lang/String;

    .line 1435
    return-void
.end method

.method public setImprTrackingUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mImprTrackingUrl:Ljava/lang/String;

    .line 436
    return-void
.end method

.method public setLikes(I)V
    .locals 0

    .prologue
    .line 683
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLikes:I

    .line 684
    return-void
.end method

.method public setLoadClick(I)V
    .locals 0

    .prologue
    .line 876
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mLoadClick:I

    .line 877
    return-void
.end method

.method public setMtType(I)V
    .locals 0

    .prologue
    .line 691
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mt_type:I

    .line 692
    return-void
.end method

.method public setNameSpace(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 751
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->name_space:Ljava/lang/String;

    .line 752
    return-void
.end method

.method public setPicUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 504
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->pic_url:Ljava/lang/String;

    .line 505
    return-void
.end method

.method public setPkg(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 518
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg:Ljava/lang/String;

    .line 519
    return-void
.end method

.method public setPkgSize(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 651
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg_size:Ljava/lang/String;

    .line 652
    return-void
.end method

.method public setPkgUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 532
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->pkg_url:Ljava/lang/String;

    .line 533
    return-void
.end method

.method public setPosName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 763
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPosName:Ljava/lang/String;

    .line 764
    return-void
.end method

.method public setPosid(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 362
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPosid:Ljava/lang/String;

    .line 363
    return-void
.end method

.method public setPosision(I)V
    .locals 0

    .prologue
    .line 1322
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->x_posision:I

    .line 1323
    return-void
.end method

.method public setPrice(D)V
    .locals 1

    .prologue
    .line 627
    iput-wide p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->price:D

    .line 628
    return-void
.end method

.method public setPriority(I)V
    .locals 0

    .prologue
    .line 378
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mPriority:I

    .line 379
    return-void
.end method

.method public setRating(D)V
    .locals 1

    .prologue
    .line 687
    iput-wide p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->rating:D

    .line 688
    return-void
.end method

.method public setResType(I)V
    .locals 0

    .prologue
    .line 667
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->res_type:I

    .line 668
    return-void
.end method

.method public setReviewers(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 631
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->reviewers:Ljava/lang/String;

    .line 632
    return-void
.end method

.method public setShowGuess(Z)V
    .locals 0

    .prologue
    .line 277
    iput-boolean p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->isShowGuess:Z

    .line 278
    return-void
.end method

.method public setShowType(I)V
    .locals 0

    .prologue
    .line 619
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->showRating:I

    .line 620
    return-void
.end method

.method public setShowedPos(I)V
    .locals 0

    .prologue
    .line 1408
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->showedPos:I

    .line 1409
    return-void
.end method

.method public setSubject(I)V
    .locals 0

    .prologue
    .line 604
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->subject:I

    .line 605
    return-void
.end method

.method public setSugApp(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 819
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_app:Ljava/lang/String;

    .line 820
    return-void
.end method

.method public setSugApps(Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1364
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mSugApps:Ljava/util/ArrayList;

    .line 1365
    return-void
.end method

.method public setSugType(I)V
    .locals 0

    .prologue
    .line 659
    iput p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->sug_type:I

    .line 660
    return-void
.end method

.method public setThirdImpUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 356
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mThirdImpUrl:Ljava/lang/String;

    .line 357
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 1

    .prologue
    .line 771
    iput-wide p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->mTimeStamp:J

    .line 772
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 461
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->title:Ljava/lang/String;

    .line 462
    return-void
.end method

.method public setTriggerSrc(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 807
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->trigger_src:Ljava/lang/String;

    .line 808
    return-void
.end method

.method public setVastModel(Lcom/cleanmaster/model/VastModel;)V
    .locals 0

    .prologue
    .line 1458
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->vastModel:Lcom/cleanmaster/model/VastModel;

    .line 1459
    return-void
.end method

.method public setgenre(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 647
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/Ad;->genre:Ljava/lang/String;

    .line 648
    return-void
.end method

.method public toBuinessDataItem()Lcom/cleanmaster/util/f;
    .locals 5

    .prologue
    .line 412
    new-instance v0, Lcom/cleanmaster/util/f;

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugType()I

    move-result v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v3

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDes()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/cleanmaster/util/f;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 413
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->x_posision:I

    invoke-virtual {v0, v1}, Lcom/cleanmaster/util/f;->a(I)Lcom/cleanmaster/util/f;

    .line 414
    return-object v0
.end method

.method public toBuinessDataItem(III)Lcom/cleanmaster/util/f;
    .locals 8

    .prologue
    .line 418
    new-instance v0, Lcom/cleanmaster/util/f;

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugType()I

    move-result v2

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v3

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDes()Ljava/lang/String;

    move-result-object v4

    move v5, p1

    move v6, p2

    move v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/cleanmaster/util/f;-><init>(Ljava/lang/String;IILjava/lang/String;III)V

    .line 419
    iget v1, p0, Lcom/cleanmaster/ui/app/market/Ad;->x_posision:I

    invoke-virtual {v0, v1}, Lcom/cleanmaster/util/f;->a(I)Lcom/cleanmaster/util/f;

    .line 420
    return-object v0
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 4

    .prologue
    .line 1099
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 1101
    :try_start_0
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1102
    const-string v0, "pic_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPicUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1103
    const-string v0, "pkg"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1104
    const-string v0, "pkg_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1105
    const-string v0, "app_tag"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppTag()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1106
    const-string v0, "desc"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDesc()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1107
    const-string v0, "des"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDes()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1108
    const-string v0, "detail_id"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetailId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1109
    const-string v0, "download_num"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDownloadNum()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1110
    const-string v0, "subject"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSubject()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1111
    const-string v0, "price"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPrice()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 1112
    const-string v0, "reviewers"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getReviewers()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    const-string v0, "genre"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getGenre()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1114
    const-string v0, "rating"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getRating()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 1115
    const-string v0, "pkg_size"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getpkg_size()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1116
    const-string v0, "sug_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1117
    const-string v0, "res_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1118
    const-string v0, "mt_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getMtType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1119
    const-string v0, "app_action_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppActionType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1120
    const-string v0, "app_show_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1121
    const-string v0, "background"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getBackground()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1122
    const-string v0, "context_code"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1123
    const-string v0, "name_space"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1124
    const-string v0, "trigger_src"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTriggerSrc()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    const-string v0, "sug_app"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugApp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1126
    const-string v0, "button_txt"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getButtonTxt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1127
    const-string v0, "pos_name"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1128
    const-string v0, "editor_head_logo"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorHeadLogo()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1129
    const-string v0, "editor_name"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1130
    const-string v0, "editor_recommend"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorRecommend()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1131
    const-string v0, "timestamp"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTimeStamp()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1132
    const-string v0, "editor_ext"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorExt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1133
    const-string v0, "impr_tracking_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getImprTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1134
    const-string v0, "detail_pg"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetail_pg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/cleanmaster/ui/app/market/Ad;->notnull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1135
    const-string v0, "likes"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLikes()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1136
    const-string v0, "conditionsjson"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getConditionsJson()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1137
    const-string v0, "is_ad"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAdStatus()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1138
    const-string v0, "font"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1139
    const-string v0, "load_clk"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLoadClk()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1140
    const-string v0, "html"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getHtml()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1141
    const-string v0, "extension"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getExtension()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    const-string v0, "deeplink"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDeepLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1143
    const-string v0, "priority"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPriority()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1144
    const-string v0, "click_tracking_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1145
    const-string v0, "third_imp_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/cleanmaster/ui/app/market/Ad;->setCreateTime(J)V

    .line 1147
    const-string v0, "create_time"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getCreateTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1148
    const-string v0, "posid"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1152
    :goto_0
    return-object v1

    .line 1150
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public toContentValues(Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 1

    .prologue
    .line 1157
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->setPosid(Ljava/lang/String;)V

    .line 1158
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->toContentValues()Landroid/content/ContentValues;

    move-result-object v0

    return-object v0
.end method

.method public toJson()Ljava/lang/String;
    .locals 4

    .prologue
    .line 282
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 284
    :try_start_0
    const-string v1, "title"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    const-string v1, "desc"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 286
    const-string v1, "pic_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPicUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 287
    const-string v1, "pkg"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 288
    const-string v1, "pkg_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 289
    const-string v1, "des"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDes()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 290
    const-string v1, "app_tag"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppTag()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 291
    const-string v1, "detail_id"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetailId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 292
    const-string v1, "download_num"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDownloadNum()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 293
    const-string v1, "subject"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSubject()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 294
    const-string v1, "rating"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getRating()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 295
    const-string v1, "versioncode"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getVersionCode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 296
    const-string v1, "price"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPrice()D

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 297
    const-string v1, "reviewers"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getReviewers()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 298
    const-string v1, "genre"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getGenre()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 299
    const-string v1, "pkg_size"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getpkg_size()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    const-string v1, "sug_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 301
    const-string v1, "res_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getResType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 302
    const-string v1, "mt_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getMtType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 303
    const-string v1, "app_show_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 304
    const-string v1, "app_action_type"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppActionType()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 305
    const-string v1, "background"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getBackground()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 306
    const-string v1, "context_code"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 307
    const-string v1, "name_space"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 308
    const-string v1, "trigger_src"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 309
    const-string v1, "sug_app"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugApp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 310
    const-string v1, "button_txt"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getButtonTxt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    const-string v1, "pos_name="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 313
    const-string v1, "timestamp="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTimeStamp()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 314
    const-string v1, "editor_head_logo="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorHeadLogo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 315
    const-string v1, "editor_name="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 316
    const-string v1, "editor_recommend="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorRecommend()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 317
    const-string v1, "editor_ext="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorExt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 318
    const-string v1, "detail_pg="

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetail_pg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 320
    const-string v1, "impr_tracking_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getImprTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 321
    const-string v1, "likes"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLikes()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 322
    const-string v1, "conditionsjson"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getConditionsJson()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 323
    const-string v1, "is_ad"

    iget v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->mAdStatus:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 324
    const-string v1, "font"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 325
    const-string v1, "load_clk"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLoadClk()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 326
    const-string v1, "html"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getHtml()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 327
    const-string v1, "extension"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getExtension()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 328
    const-string v1, "deeplink"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDeepLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 329
    const-string v1, "priority"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPriority()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 330
    const-string v1, "click_tracking_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 331
    const-string v1, "third_imp_url"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 332
    const-string v1, "create_time"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getCreateTime()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 333
    const-string v1, "posid"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 884
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 885
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[ "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    const-string v1, "        title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 887
    const-string v1, "         desc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    const-string v1, "      pic_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPicUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    const-string v1, "          pkg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 890
    const-string v1, "      pkg_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPkgUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    const-string v1, "          des="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDes()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 892
    const-string v1, "      app_tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppTag()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 893
    const-string v1, "    detail_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetailId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    const-string v1, " download_num="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDownloadNum()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    const-string v1, "      subject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSubject()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    const-string v1, "       rating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getRating()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 897
    const-string v1, "  versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/cleanmaster/ui/app/market/Ad;->versionCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    const-string v1, "  show_rating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getShowType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    const-string v1, "      mt_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getMtType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    const-string v1, "    app_action_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppActionType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    const-string v1, "      app_show_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    const-string v1, "         background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getBackground()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    const-string v1, "       context_code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getContextCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    const-string v1, "         name_space="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getNameSpace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    const-string v1, "        trigger_src="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTriggerSrc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    const-string v1, "            sug_app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getSugApp()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    const-string v1, "            button_txt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getButtonTxt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 908
    const-string v1, "      pos_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    const-string v1, "      timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getTimeStamp()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 910
    const-string v1, "      editor_head_logo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorHeadLogo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 911
    const-string v1, "      editor_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    const-string v1, "      editor_recommend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorRecommend()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    const-string v1, "      editor_ext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getEditorExt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 914
    const-string v1, "     impr_tracking_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getImprTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 915
    const-string v1, "     detail_pg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDetail_pg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 916
    const-string v1, "     likes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLikes()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    const-string v1, "     conditionsjson="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getConditionsJson()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    const-string v1, "     font="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getFont()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    const-string v1, "     load_clk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getLoadClk()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 920
    const-string v1, "     html="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getHtml()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    const-string v1, "     extension="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getExtension()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    const-string v1, "     deeplink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getDeepLink()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    const-string v1, "     priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPriority()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    const-string v1, "     clickTrackUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 925
    const-string v1, "     thirdImpUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getThirdImpUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    const-string v1, "     createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getCreateTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 927
    const-string v1, "     posid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/Ad;->getPosid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 928
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
