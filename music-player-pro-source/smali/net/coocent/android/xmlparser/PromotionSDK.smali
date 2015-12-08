.class public Lnet/coocent/android/xmlparser/PromotionSDK;
.super Ljava/lang/Object;
.source "PromotionSDK.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field public static final BASE_URL:Ljava/lang/String; = "http://www.coocent.net/coocentPromotion/yonggift/"

.field public static final DOWNLOAD_ICON_PATH:Ljava/lang/String;

.field public static final IS_NO_AD_VERSION:Ljava/lang/String; = "is_no_ad_version"

.field public static final PREFERENCE_BASE_INFO:Ljava/lang/String; = "APP_BASE_INFOS"

.field public static final PREFERENCE_KEY_RATE:Ljava/lang/String; = "APP_RATE"

.field private static appinfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;"
        }
    .end annotation
.end field

.field private static db:Landroid/content/SharedPreferences;

.field private static giftIcons:[I

.field private static isFirstNew:Z

.field private static mContext:Landroid/app/Activity;

.field private static mlAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/gift/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->DOWNLOAD_ICON_PATH:Ljava/lang/String;

    .line 45
    sput-boolean v2, Lnet/coocent/android/xmlparser/PromotionSDK;->isFirstNew:Z

    .line 49
    const/4 v0, 0x0

    sput-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    .line 50
    const/16 v0, 0xa

    new-array v0, v0, [I

    sget v1, Lnet/coocent/promotionsdk/R$drawable;->icon_gift:I

    aput v1, v0, v2

    const/4 v1, 0x1

    .line 51
    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_1:I

    aput v2, v0, v1

    const/4 v1, 0x2

    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_2:I

    aput v2, v0, v1

    const/4 v1, 0x3

    .line 52
    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_3:I

    aput v2, v0, v1

    const/4 v1, 0x4

    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_4:I

    aput v2, v0, v1

    const/4 v1, 0x5

    .line 53
    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_5:I

    aput v2, v0, v1

    const/4 v1, 0x6

    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_6:I

    aput v2, v0, v1

    const/4 v1, 0x7

    .line 54
    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_7:I

    aput v2, v0, v1

    const/16 v1, 0x8

    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_8:I

    aput v2, v0, v1

    const/16 v1, 0x9

    .line 55
    sget v2, Lnet/coocent/promotionsdk/R$drawable;->icon_gift_9:I

    aput v2, v0, v1

    .line 50
    sput-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->giftIcons:[I

    .line 55
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static GetAppInfoList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;"
        }
    .end annotation

    .prologue
    .line 92
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static Init(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/app/Activity;)V
    .locals 2
    .param p0, "loadAppInfoListener"    # Lnet/coocent/android/xmlparser/LoadAppInfoListener;
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 59
    sput-object p0, Lnet/coocent/android/xmlparser/PromotionSDK;->mlAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

    .line 60
    sput-object p1, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 61
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 62
    const-string v0, "APP_BASE_INFOS"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    .line 63
    :cond_0
    return-void
.end method

.method public static InitAppInfoList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 88
    .local p0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    sput-object p0, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    .line 89
    return-void
.end method

.method public static InitMyActionBar(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/app/Activity;)V
    .locals 2
    .param p0, "loadAppInfoListener"    # Lnet/coocent/android/xmlparser/LoadAppInfoListener;
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 67
    sput-object p0, Lnet/coocent/android/xmlparser/PromotionSDK;->mlAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

    .line 68
    sput-object p1, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 69
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 70
    const-string v0, "APP_BASE_INFOS"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    .line 71
    :cond_0
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    sget v1, Lnet/coocent/promotionsdk/R$id;->promotion_icon:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 72
    new-instance v1, Lnet/coocent/android/xmlparser/PromotionSDK$1;

    invoke-direct {v1}, Lnet/coocent/android/xmlparser/PromotionSDK$1;-><init>()V

    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    return-void
.end method

.method public static UpdateNewcount()V
    .locals 5

    .prologue
    .line 132
    :try_start_0
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    sget v4, Lnet/coocent/promotionsdk/R$id;->newcount_tv:I

    invoke-virtual {v3, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 133
    .local v2, "tv":Landroid/widget/TextView;
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->getNewCount()I

    move-result v1

    .line 134
    .local v1, "i":I
    if-lez v1, :cond_0

    .line 135
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    sget v4, Lnet/coocent/promotionsdk/R$id;->promotion_icon:I

    invoke-virtual {v3, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 136
    const/4 v4, 0x0

    .line 135
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 137
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 139
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 140
    sget v4, Lnet/coocent/promotionsdk/R$anim;->newcount_in:I

    .line 139
    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 141
    .local v0, "animation":Landroid/view/animation/Animation;
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 149
    .end local v0    # "animation":Landroid/view/animation/Animation;
    .end local v1    # "i":I
    :goto_0
    return-void

    .line 143
    .restart local v1    # "i":I
    :cond_0
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    sget v4, Lnet/coocent/promotionsdk/R$id;->promotion_icon:I

    invoke-virtual {v3, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 144
    const/16 v4, 0x8

    .line 143
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 146
    .end local v1    # "i":I
    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method static synthetic access$0()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public static getGiftIconForActionBar()I
    .locals 2

    .prologue
    .line 174
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->giftIcons:[I

    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->getNewCount()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public static getIsNoAdVersion(Ljava/lang/String;)Z
    .locals 7
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x1

    .line 213
    sget-object v4, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 212
    invoke-static {v4}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 213
    const-string v5, "is_no_ad_version"

    const/4 v6, 0x0

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 214
    .local v0, "isNoAdVersion":Z
    if-eqz v0, :cond_0

    .line 228
    :goto_0
    return v3

    .line 216
    :cond_0
    new-instance v2, Lnet/coocent/android/exitwithrate/InstallTimeChecker;

    invoke-direct {v2}, Lnet/coocent/android/exitwithrate/InstallTimeChecker;-><init>()V

    .line 217
    .local v2, "itc":Lnet/coocent/android/exitwithrate/InstallTimeChecker;
    invoke-virtual {v2, p0}, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->setpromotionTime(Ljava/lang/String;)V

    .line 218
    sget-object v4, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-virtual {v2, v4}, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->isPromotionTime(Landroid/content/Context;)Z

    move-result v1

    .line 219
    .local v1, "isPromotion":Z
    if-nez v0, :cond_1

    .line 220
    sget-object v4, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-static {v4}, Lnet/coocent/android/exitwithrate/AppturboUnlockTools;->isAppturboUnlockable(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 221
    if-eqz v1, :cond_1

    .line 222
    sget-object v4, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-static {v4}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 223
    const-string v5, "is_no_ad_version"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 224
    const/4 v0, 0x1

    .line 225
    sget-object v4, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 226
    sget-object v5, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    sget v6, Lnet/coocent/promotionsdk/R$string;->appturbo_promotion:I

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 225
    invoke-static {v4, v5, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    .line 226
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    :cond_1
    move v3, v0

    .line 228
    goto :goto_0
.end method

.method public static getNewCount()I
    .locals 4

    .prologue
    .line 158
    const/4 v0, 0x0

    .line 160
    .local v0, "count":I
    :try_start_0
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 161
    .local v2, "size":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-lt v1, v2, :cond_0

    .line 170
    .end local v1    # "i":I
    .end local v2    # "size":I
    :goto_1
    return v0

    .line 162
    .restart local v1    # "i":I
    .restart local v2    # "size":I
    :cond_0
    sget-object v3, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v3}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/coocent/android/xmlparser/PromotionSDK;->isNew(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 163
    add-int/lit8 v0, v0, 0x1

    .line 164
    if-nez v1, :cond_1

    .line 165
    const/4 v3, 0x1

    sput-boolean v3, Lnet/coocent/android/xmlparser/PromotionSDK;->isFirstNew:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 168
    .end local v1    # "i":I
    .end local v2    # "size":I
    :catch_0
    move-exception v3

    goto :goto_1
.end method

.method protected static isNew(Ljava/lang/String;)Z
    .locals 1
    .param p0, "packagename"    # Ljava/lang/String;

    .prologue
    .line 96
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const/4 v0, 0x0

    .line 99
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static onResume()V
    .locals 1

    .prologue
    .line 152
    sget-object v0, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 153
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->UpdateNewcount()V

    .line 155
    :cond_0
    return-void
.end method

.method protected static setListOnItemClickListner(Landroid/widget/GridView;Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V
    .locals 1
    .param p0, "gridView"    # Landroid/widget/GridView;
    .param p1, "giftGridViewAdapter"    # Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    .prologue
    .line 180
    new-instance v0, Lnet/coocent/android/xmlparser/PromotionSDK$2;

    invoke-direct {v0, p1}, Lnet/coocent/android/xmlparser/PromotionSDK$2;-><init>(Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V

    invoke-virtual {p0, v0}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 209
    return-void
.end method

.method public static showPromoationApp()V
    .locals 10

    .prologue
    .line 104
    :try_start_0
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    new-instance v7, Landroid/content/Intent;

    sget-object v8, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    const-class v9, Lnet/coocent/android/xmlparser/GiftActivity;

    invoke-direct {v7, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v6, v7}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 105
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->db:Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 106
    .local v1, "ed":Landroid/content/SharedPreferences$Editor;
    sget-boolean v6, Lnet/coocent/android/xmlparser/PromotionSDK;->isFirstNew:Z

    if-eqz v6, :cond_0

    .line 107
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->appinfoList:Ljava/util/ArrayList;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v6}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v4

    .line 108
    .local v4, "packagename":Ljava/lang/String;
    invoke-interface {v1, v4, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 109
    const/4 v6, 0x0

    sput-boolean v6, Lnet/coocent/android/xmlparser/PromotionSDK;->isFirstNew:Z

    .line 110
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 111
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "market://details?id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 113
    .local v3, "marketUrl":Ljava/lang/String;
    :try_start_1
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 114
    .local v5, "uri":Landroid/net/Uri;
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 115
    const-string v7, "com.android.vending"

    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 116
    const-string v7, "android.intent.action.VIEW"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 117
    .local v2, "intent":Landroid/content/Intent;
    invoke-virtual {v2, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 118
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 124
    :goto_0
    :try_start_2
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    const/16 v7, 0x2e

    const/16 v8, 0x5f

    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 128
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "marketUrl":Ljava/lang/String;
    .end local v4    # "packagename":Ljava/lang/String;
    .end local v5    # "uri":Landroid/net/Uri;
    :cond_0
    :goto_1
    return-void

    .line 119
    .restart local v3    # "marketUrl":Ljava/lang/String;
    .restart local v4    # "packagename":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 120
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 121
    .restart local v5    # "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-direct {v2, v6, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 122
    .restart local v2    # "intent":Landroid/content/Intent;
    sget-object v6, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    invoke-virtual {v6, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 126
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v2    # "intent":Landroid/content/Intent;
    .end local v3    # "marketUrl":Ljava/lang/String;
    .end local v4    # "packagename":Ljava/lang/String;
    .end local v5    # "uri":Landroid/net/Uri;
    :catch_1
    move-exception v6

    goto :goto_1
.end method

.method public static starAppInfoLoadTask()V
    .locals 4

    .prologue
    .line 82
    new-instance v0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;

    sget-object v1, Lnet/coocent/android/xmlparser/PromotionSDK;->mlAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

    .line 83
    sget-object v2, Lnet/coocent/android/xmlparser/PromotionSDK;->mContext:Landroid/app/Activity;

    .line 82
    invoke-direct {v0, v1, v2}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;-><init>(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/content/Context;)V

    .line 84
    .local v0, "task":Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "http://www.coocent.net/coocentPromotion/yonggift/giftList.xml"

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 85
    return-void
.end method
