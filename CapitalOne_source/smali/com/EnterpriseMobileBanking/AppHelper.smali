.class public Lcom/EnterpriseMobileBanking/AppHelper;
.super Ljava/lang/Object;
.source "AppHelper.java"


# static fields
.field public static final APP_INSTALL_TIME_KEY:Ljava/lang/String; = "appInstallTime"

.field public static final ATM_LINK:Ljava/lang/String; = "www/atm"

.field public static final COF_APP_INSTALL_TIME_KEY:Ljava/lang/String; = "cof_appInstallTime"

.field public static final EXIT_ON_SKIN_LOADER:Ljava/lang/String; = "exitOnSkinLoader"

.field public static final FALSE:Ljava/lang/String; = "false"

.field public static final FULL_HTTP:Ljava/lang/String; = "http://"

.field public static final FULL_HTTPS:Ljava/lang/String; = "https://"

.field private static final HOUR_MILLIS:J = 0x36ee80L

.field public static final HTTP:Ljava/lang/String; = "http"

.field public static final HTTPS:Ljava/lang/String; = "https"

.field public static final INPUT_STREAM_ISO:Ljava/lang/String; = "iso-8859-1"

.field private static final IS_CANADIAN_APP:Z

.field public static final JELLY_BEAN_VERSION_CODE:I = 0x10

.field public static final KEYSTORE_INSTANCE:Ljava/lang/String; = "BKS"

.field public static final LOAD_SKIN:Ljava/lang/String; = "loadSkin"

.field public static final LOB_START_PAGES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAILTO_PREFIX:Ljava/lang/String; = "mailto:"

.field public static final MENU:Ljava/lang/String; = "menu"

.field public static final SP_ATM_CAP360_ATM_LOCATOR:Ljava/lang/String; = "SP_ATM_CAP360_ATM_LOCATOR"

.field public static final SP_CONFIG_DETLA_HOURS:Ljava/lang/String; = "SP_CONFIG_DETLA_HOURS"

.field public static final SP_CONFIG_LAST_UPDATED_MILLIS:Ljava/lang/String; = "SP_CONFIG_LAST_UPDATED_MILLIS"

.field public static final SP_CONTACT_360_EMAIL:Ljava/lang/String; = "SP_CONTACT_360_EMAIL"

.field public static final SP_CONTACT_360_FACEBOOK:Ljava/lang/String; = "SP_CONTACT_360_FACEBOOK"

.field public static final SP_CONTACT_360_TWITTER:Ljava/lang/String; = "SP_CONTACT_360_TWITTER"

.field public static final SP_CONTACT_360_US_PHONE:Ljava/lang/String; = "SP_CONTACT_360_US_PHONE"

.field public static final SP_CONTACT_CAP1_FACEBOOK:Ljava/lang/String; = "SP_CONTACT_CAP1_FACEBOOK"

.field public static final SP_CONTACT_CAP1_NON_US_PHONE:Ljava/lang/String; = "SP_CONTACT_CAP1_NON_US_PHONE"

.field public static final SP_CONTACT_CAP1_TWITTER:Ljava/lang/String; = "SP_CONTACT_CAP1_TWITTER"

.field public static final SP_CONTACT_CAP1_US_PHONE:Ljava/lang/String; = "SP_CONTACT_CAP1_US_PHONE"

.field public static final SP_EULA_IS_ACCEPTED_VERSION:Ljava/lang/String; = "SP_EULA_IS_ACCEPTED_VERSION"

.field public static final SP_PRODUCTS_360_PRODUCTS_AUTH_URL:Ljava/lang/String; = "SP_PRODUCTS_360_PRODUCTS_AUTH_URL"

.field public static final SP_PRODUCTS_360_PRODUCTS_URL:Ljava/lang/String; = "SP_PRODUCTS_360_PRODUCTS_URL"

.field public static final SP_PRODUCTS_BRANCH_URL:Ljava/lang/String; = "SP_PRODUCTS_BRANCH_URL"

.field public static final SP_URL_OPEN_OUTSIDE:Ljava/lang/String; = "SP_URL_OPEN_OUTSIDE"

.field public static final SSL_CTX_INSTANCE:Ljava/lang/String; = "TLS"

.field public static final SWITCH_HOME_CONFIRM:Ljava/lang/String; = "SWITCH_HOME_CONFIRMED"

.field public static final SWITCH_LOB_CONFIRM:Ljava/lang/String; = "SWITCH_LOB_CONFIRMED"

.field private static final TAG:Ljava/lang/String; = "AppHelper"

.field public static final TELEPHONE_PREFIX:Ljava/lang/String; = "tel:"

.field public static final TRUE:Ljava/lang/String; = "true"

.field private static final WEB_VIEW_TEXT_CLASS_NAME:Ljava/lang/String; = "android.webkit.WebTextView"

.field private static appVersion:Ljava/lang/String;

.field private static application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field private static gothicFace:Landroid/graphics/Typeface;

.field private static isFreezeCardFlow:Z

.field private static keyboard:Z

.field private static lastMovement:I

.field private static logout:Landroid/app/AlertDialog;

.field private static mURLAttributeTable:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;",
            ">;"
        }
    .end annotation
.end field

.field private static metrics:Landroid/util/DisplayMetrics;

.field private static myDensity:F

.field private static updateRunnable:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 42
    sput-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .line 124
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->createMap()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->LOB_START_PAGES:Ljava/util/Map;

    .line 132
    sput v2, Lcom/EnterpriseMobileBanking/AppHelper;->lastMovement:I

    .line 136
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->metrics:Landroid/util/DisplayMetrics;

    .line 138
    sput-boolean v2, Lcom/EnterpriseMobileBanking/AppHelper;->keyboard:Z

    .line 140
    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, Lcom/EnterpriseMobileBanking/AppHelper;->myDensity:F

    .line 142
    sput-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->gothicFace:Landroid/graphics/Typeface;

    .line 144
    sput-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    .line 146
    sput-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion:Ljava/lang/String;

    .line 150
    sput-boolean v2, Lcom/EnterpriseMobileBanking/AppHelper;->isFreezeCardFlow:Z

    .line 161
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->mURLAttributeTable:Ljava/util/Map;

    .line 185
    new-instance v0, Lcom/EnterpriseMobileBanking/AppHelper$1;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/AppHelper$1;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->updateRunnable:Ljava/lang/Runnable;

    .line 814
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->setCanadianPreference()Z

    move-result v0

    sput-boolean v0, Lcom/EnterpriseMobileBanking/AppHelper;->IS_CANADIAN_APP:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    return-object v0
.end method

.method static synthetic access$102(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 39
    sput-boolean p0, Lcom/EnterpriseMobileBanking/AppHelper;->keyboard:Z

    return p0
.end method

.method static synthetic access$200()Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic access$202(Landroid/app/AlertDialog;)Landroid/app/AlertDialog;
    .locals 0
    .param p0, "x0"    # Landroid/app/AlertDialog;

    .prologue
    .line 39
    sput-object p0, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    return-object p0
.end method

.method static synthetic access$300(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 39
    invoke-static {p0, p1}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLob(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static addURLAttributes(Ljava/lang/String;Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    .locals 1
    .param p0, "key"    # Ljava/lang/String;
    .param p1, "data"    # Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    .prologue
    .line 178
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->mURLAttributeTable:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    return-object v0
.end method

.method public static appVersion()Ljava/lang/String;
    .locals 5

    .prologue
    .line 791
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion:Ljava/lang/String;

    if-nez v3, :cond_0

    .line 792
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 794
    .local v2, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 795
    .local v1, "packageInfo":Landroid/content/pm/PackageInfo;
    iget-object v3, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 801
    .end local v1    # "packageInfo":Landroid/content/pm/PackageInfo;
    :cond_0
    :goto_0
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion:Ljava/lang/String;

    return-object v3

    .line 796
    :catch_0
    move-exception v0

    .line 797
    .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public static changeButtonImage(Z)V
    .locals 3
    .param p0, "b"    # Z

    .prologue
    .line 696
    sget-object v2, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getGlobalButton()Landroid/widget/ImageButton;

    move-result-object v0

    .line 697
    .local v0, "btnHome":Landroid/widget/ImageButton;
    sget-object v2, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v1

    .line 698
    .local v1, "btnMenu":Landroid/widget/ImageButton;
    if-nez p0, :cond_0

    .line 699
    const v2, 0x7f0200b1

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 700
    const v2, 0x7f0200b8

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 705
    :goto_0
    return-void

    .line 702
    :cond_0
    const v2, 0x7f0200b0

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 703
    const v2, 0x7f0200b7

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method

.method public static changeSignOut(I)V
    .locals 1
    .param p0, "visibility"    # I

    .prologue
    .line 708
    new-instance v0, Lcom/EnterpriseMobileBanking/AppHelper$14;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/AppHelper$14;-><init>(I)V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 715
    return-void
.end method

.method private static createMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 127
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 128
    .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "360"

    const-string v2, "ThreeSixty.html"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    return-object v1
.end method

.method public static findAppViewById(I)Landroid/view/View;
    .locals 1
    .param p0, "id"    # I

    .prologue
    .line 733
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-static {v0, p0}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(Landroid/content/Context;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public static findAppViewById(Landroid/content/Context;I)Landroid/view/View;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "id"    # I

    .prologue
    .line 737
    check-cast p0, Landroid/app/Activity;

    .end local p0    # "context":Landroid/content/Context;
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized fixupUserAgentString(Landroid/webkit/WebView;)V
    .locals 5
    .param p0, "view"    # Landroid/webkit/WebView;

    .prologue
    .line 852
    const-class v2, Lcom/EnterpriseMobileBanking/AppHelper;

    monitor-enter v2

    if-eqz p0, :cond_0

    .line 853
    :try_start_0
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v0

    .line 854
    .local v0, "ws":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 855
    const v1, 0x7f090117

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 856
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f090117

    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 860
    .end local v0    # "ws":Ljava/lang/String;
    :cond_0
    monitor-exit v2

    return-void

    .line 852
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static focusAppView()V
    .locals 1

    .prologue
    .line 389
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    .line 390
    return-void
.end method

.method public static genericError(I)V
    .locals 9
    .param p0, "errorCode"    # I

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 415
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    add-int/2addr v3, v4

    int-to-long v0, v3

    .line 416
    .local v0, "alteredCode":J
    if-gez p0, :cond_0

    .line 417
    const-wide/16 v4, -0x1

    mul-long/2addr v0, v4

    .line 421
    :cond_0
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f09014a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v7, [Ljava/lang/Object;

    sget-object v5, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v6, 0x7f090149

    invoke-virtual {v5, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v7, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 424
    .local v2, "htmlError":Ljava/lang/String;
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v4, Lcom/EnterpriseMobileBanking/AppHelper$8;

    invoke-direct {v4, v2}, Lcom/EnterpriseMobileBanking/AppHelper$8;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 430
    return-void
.end method

.method public static getAppContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 723
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static getAppString(I)Ljava/lang/String;
    .locals 1
    .param p0, "id"    # I

    .prologue
    .line 182
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getAppView()Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 305
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    if-eqz v0, :cond_0

    .line 307
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    .line 309
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getApplicationLink()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .locals 1

    .prologue
    .line 222
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    return-object v0
.end method

.method public static getDensity()F
    .locals 1

    .prologue
    .line 380
    sget v0, Lcom/EnterpriseMobileBanking/AppHelper;->myDensity:F

    return v0
.end method

.method public static getIsFreezeCardFlow()Z
    .locals 1

    .prologue
    .line 153
    sget-boolean v0, Lcom/EnterpriseMobileBanking/AppHelper;->isFreezeCardFlow:Z

    return v0
.end method

.method public static getLastLob()I
    .locals 1

    .prologue
    .line 728
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getLastLob()I

    move-result v0

    return v0
.end method

.method public static getLastMovement()I
    .locals 1

    .prologue
    .line 371
    sget v0, Lcom/EnterpriseMobileBanking/AppHelper;->lastMovement:I

    return v0
.end method

.method public static getLobPage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 409
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getLastCarpet()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getMenuItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation

    .prologue
    .line 606
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getMenuItems()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getProductsUri()Ljava/lang/String;
    .locals 3

    .prologue
    .line 165
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    if-eqz v0, :cond_0

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getWebUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f09011d

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 168
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;
    .locals 2

    .prologue
    .line 230
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    return-object v0
.end method

.method public static getTypeface()Landroid/graphics/Typeface;
    .locals 1

    .prologue
    .line 433
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->gothicFace:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public static getURLAttributes(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    .locals 1
    .param p0, "key"    # Ljava/lang/String;

    .prologue
    .line 173
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->mURLAttributeTable:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    return-object v0
.end method

.method public static handleNative(Ljava/lang/String;)Z
    .locals 8
    .param p0, "action"    # Ljava/lang/String;

    .prologue
    const v7, 0x7f0900f6

    const/16 v4, 0x8

    const/4 v2, 0x0

    .line 437
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 438
    const-string v3, "cmd:"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    .line 439
    .local v1, "isNative":Z
    const-string v3, "AppHelper"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "handleNative: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    if-eqz v1, :cond_3

    .line 441
    const-string v3, "cmd:"

    const-string v5, ""

    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 442
    const-string v3, "switch:"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 443
    const-string v3, "AppHelper"

    const-string v4, "Switch command found"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 444
    const-string v3, "switch:"

    const-string v4, ""

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 445
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 446
    .local v0, "cache":Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAuthenticated()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_0

    const-string v3, "1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    const/4 v2, 0x1

    .line 448
    .local v2, "prompt":Z
    :cond_1
    const-string v3, "AppHelper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "authed: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAuthenticated()Z

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " -- "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    if-nez v0, :cond_2

    const-string v0, "NULL"

    .end local v0    # "cache":Ljava/lang/String;
    :cond_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    const-string v3, "confirmation:"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 451
    const-string v3, "confirmation:"

    const-string v4, ""

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 452
    const-string v3, "AppHelper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Calling for confirmation: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    const-string v3, "confirmSwitch"

    invoke-static {v3, p0}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLob(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    .end local v2    # "prompt":Z
    :cond_3
    :goto_0
    const-string v3, "AppHelper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isNative: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    return v1

    .line 455
    .restart local v2    # "prompt":Z
    :cond_4
    if-eqz v2, :cond_5

    .line 456
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0}, Lcom/EnterpriseMobileBanking/AppHelper;->promptForLogout(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 458
    :cond_5
    const-string v3, "AppHelper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Going to switchLob: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    invoke-static {p0}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLob(Ljava/lang/String;)V

    goto :goto_0

    .line 462
    .end local v2    # "prompt":Z
    :cond_6
    const-string v3, "contact:"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 463
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 464
    const-string v3, "contact:"

    const-string v5, ""

    invoke-virtual {p0, v3, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 465
    const-string v3, "AppHelper"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Action: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->initializeContactUs()V

    .line 467
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v5, 0x7f0800a2

    invoke-virtual {v3, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 469
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    .line 471
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v5, 0x7f080039

    invoke-virtual {v3, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const-string v3, "360"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "threesixty"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    move v3, v2

    :goto_1
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 473
    sget-object v3, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v5, 0x7f080045

    invoke-virtual {v3, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const-string v5, "360"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v5, "threesixty"

    invoke-virtual {p0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    move v4, v2

    :cond_8
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_9
    move v3, v4

    .line 471
    goto :goto_1
.end method

.method public static hideBackButton()V
    .locals 2

    .prologue
    .line 290
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$5;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/AppHelper$5;-><init>()V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 296
    return-void
.end method

.method public static hideConfirm()V
    .locals 1

    .prologue
    .line 518
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 519
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 520
    const/4 v0, 0x0

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    .line 522
    :cond_0
    return-void
.end method

.method public static hideKeyboard()V
    .locals 1

    .prologue
    .line 313
    new-instance v0, Lcom/EnterpriseMobileBanking/AppHelper$6;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/AppHelper$6;-><init>()V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 337
    return-void
.end method

.method public static hideMenu()V
    .locals 2

    .prologue
    .line 260
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$3;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/AppHelper$3;-><init>()V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 270
    :cond_0
    return-void
.end method

.method public static hoursDiff(Ljava/util/Date;Ljava/util/Date;)I
    .locals 6
    .param p0, "earlierDate"    # Ljava/util/Date;
    .param p1, "laterDate"    # Ljava/util/Date;

    .prologue
    const-wide/32 v4, 0x36ee80

    .line 600
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 602
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    div-long/2addr v0, v4

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    div-long/2addr v2, v4

    sub-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_0
.end method

.method public static isAuthenticated()Z
    .locals 1

    .prologue
    .line 485
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAuthenticated()Z

    move-result v0

    return v0
.end method

.method public static isCanadianApp()Z
    .locals 1

    .prologue
    .line 823
    sget-boolean v0, Lcom/EnterpriseMobileBanking/AppHelper;->IS_CANADIAN_APP:Z

    return v0
.end method

.method public static isNewApp()Z
    .locals 12

    .prologue
    const/4 v8, 0x0

    .line 773
    const/4 v4, 0x1

    .line 775
    .local v4, "isNew":Z
    sget-object v9, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v9, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 778
    .local v5, "prefs":Landroid/content/SharedPreferences;
    :try_start_0
    sget-object v9, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v9}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v9

    sget-object v10, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPackageName()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v9, v10, v11}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    iget-object v0, v9, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 779
    .local v0, "appFile":Ljava/lang/String;
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 780
    .local v2, "bundleInstallTime":J
    const-string v9, "appInstallTime"

    const-wide/16 v10, 0x0

    invoke-interface {v5, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 781
    .local v6, "storedInstallTime":J
    cmp-long v9, v2, v6

    if-lez v9, :cond_0

    const/4 v4, 0x1

    .line 786
    .end local v0    # "appFile":Ljava/lang/String;
    .end local v2    # "bundleInstallTime":J
    .end local v6    # "storedInstallTime":J
    :goto_0
    return v4

    .restart local v0    # "appFile":Ljava/lang/String;
    .restart local v2    # "bundleInstallTime":J
    .restart local v6    # "storedInstallTime":J
    :cond_0
    move v4, v8

    .line 781
    goto :goto_0

    .line 782
    .end local v0    # "appFile":Ljava/lang/String;
    .end local v2    # "bundleInstallTime":J
    .end local v6    # "storedInstallTime":J
    :catch_0
    move-exception v1

    .line 783
    .local v1, "e":Ljava/lang/Exception;
    const/4 v4, 0x1

    goto :goto_0
.end method

.method public static keyboardShowing()Z
    .locals 1

    .prologue
    .line 401
    sget-boolean v0, Lcom/EnterpriseMobileBanking/AppHelper;->keyboard:Z

    return v0
.end method

.method public static logoutUser()V
    .locals 2

    .prologue
    .line 491
    const-string v0, ""

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/AppHelper;->logoutUser(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    return-void
.end method

.method public static logoutUser(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "save"    # Ljava/lang/String;
    .param p1, "actionLob"    # Ljava/lang/String;

    .prologue
    .line 495
    const-string v1, "AppHelper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "in logoutUser: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    if-eqz p0, :cond_0

    const-string v1, ""

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 497
    const-string v1, "1"

    invoke-static {p0, v1}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 500
    :cond_0
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 501
    const-string v0, ""

    .line 502
    .local v0, "lob":Ljava/lang/String;
    move-object v0, p1

    .line 504
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lobDidDisappear( \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' );"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 511
    .end local v0    # "lob":Ljava/lang/String;
    :goto_0
    return-void

    .line 508
    :cond_1
    invoke-static {p1}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLobFinish(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static minimize()V
    .locals 2

    .prologue
    .line 384
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const-string v1, "INGDirectApp.hideBusyIndicator();"

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 385
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->moveTaskToBack(Z)Z

    .line 386
    return-void
.end method

.method public static promptForLogout(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "save"    # Ljava/lang/String;
    .param p1, "lob"    # Ljava/lang/String;

    .prologue
    .line 619
    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 620
    .local v0, "ab_logout":Landroid/app/AlertDialog$Builder;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 621
    const v1, 0x7f0900f4

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 622
    const v1, 0x7f0900f5

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 623
    const v1, 0x7f0900f6

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHelper$11;

    invoke-direct {v2, p0, p1}, Lcom/EnterpriseMobileBanking/AppHelper$11;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 631
    const v1, 0x7f0900f7

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHelper$12;

    invoke-direct {v2}, Lcom/EnterpriseMobileBanking/AppHelper$12;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 640
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    sput-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    .line 641
    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->logout:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 642
    return-void
.end method

.method public static removeSplash()V
    .locals 0

    .prologue
    .line 376
    return-void
.end method

.method public static returnToHome()V
    .locals 2

    .prologue
    .line 582
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$10;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/AppHelper$10;-><init>()V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 590
    return-void
.end method

.method public static runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1
    .param p0, "action"    # Ljava/lang/Runnable;

    .prologue
    .line 340
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 341
    return-void
.end method

.method public static sendJavascript(Ljava/lang/String;)V
    .locals 3
    .param p0, "script"    # Ljava/lang/String;

    .prologue
    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "(function() { try { "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " } catch( e ) { console.log( \'Error running: \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" -- \' + e ); } })()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 243
    .local v0, "js":Ljava/lang/String;
    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHelper$2;

    invoke-direct {v2, v0}, Lcom/EnterpriseMobileBanking/AppHelper$2;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 257
    return-void
.end method

.method public static setApplicationLink(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 3
    .param p0, "link"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 211
    sput-object p0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .line 212
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->metrics:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 213
    const-string v0, "AppHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Density: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/EnterpriseMobileBanking/AppHelper;->metrics:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->metrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    const/high16 v1, 0x43a00000    # 320.0f

    div-float/2addr v0, v1

    sput v0, Lcom/EnterpriseMobileBanking/AppHelper;->myDensity:F

    .line 215
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->gothicFace:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 216
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/Trade-Gothic-LT-Bold.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->gothicFace:Landroid/graphics/Typeface;

    .line 218
    :cond_0
    return-void
.end method

.method private static setCanadianPreference()Z
    .locals 2

    .prologue
    .line 842
    const-string v0, "canada"

    const-string v1, "us"

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public static setCopyrightYear(Landroid/widget/TextView;)V
    .locals 4
    .param p0, "copyrightTextView"    # Landroid/widget/TextView;

    .prologue
    .line 805
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 807
    .local v0, "copyrightText":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u00a9 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 808
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 809
    return-void
.end method

.method public static setIsFreezeCardFlow(Z)V
    .locals 0
    .param p0, "theFlag"    # Z

    .prologue
    .line 157
    sput-boolean p0, Lcom/EnterpriseMobileBanking/AppHelper;->isFreezeCardFlow:Z

    .line 158
    return-void
.end method

.method public static setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
    .locals 1
    .param p0, "item"    # Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .prologue
    .line 610
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 611
    return-void
.end method

.method public static setLastMovement(I)V
    .locals 0
    .param p0, "movement"    # I

    .prologue
    .line 367
    sput p0, Lcom/EnterpriseMobileBanking/AppHelper;->lastMovement:I

    .line 368
    return-void
.end method

.method public static setNavigationEnabled(Z)V
    .locals 4
    .param p0, "b"    # Z

    .prologue
    const v3, 0x7f080026

    const v2, 0x7f080021

    .line 683
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 684
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getGlobalButton()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 685
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 686
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 687
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 688
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 689
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    .line 690
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setClickable(Z)V

    .line 691
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 692
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getGlobalButton()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 693
    return-void
.end method

.method public static setSelectedMenuItem(I)V
    .locals 1
    .param p0, "menuItemResId"    # I

    .prologue
    .line 767
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(I)V

    .line 768
    return-void
.end method

.method public static setSignOut(Z)V
    .locals 4
    .param p0, "enabled"    # Z

    .prologue
    .line 359
    const-string v1, "AppHelper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Signout: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f0800af

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 361
    .local v0, "signOutButton":Landroid/view/View;
    invoke-virtual {v0, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 362
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz p0, :cond_0

    const/16 v1, 0xff

    :goto_0
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 363
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    .line 364
    return-void

    .line 362
    :cond_0
    const/16 v1, 0x4f

    goto :goto_0
.end method

.method public static setupKeyboardListener()V
    .locals 1

    .prologue
    .line 226
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->updateRunnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 227
    return-void
.end method

.method public static showBackButton()V
    .locals 2

    .prologue
    .line 277
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$4;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/AppHelper$4;-><init>()V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 283
    return-void
.end method

.method public static showError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "title"    # Ljava/lang/String;
    .param p1, "messageDialog"    # Ljava/lang/String;

    .prologue
    .line 646
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$13;

    invoke-direct {v1, p0, p1}, Lcom/EnterpriseMobileBanking/AppHelper$13;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 680
    return-void
.end method

.method public static showRelContainer()V
    .locals 2

    .prologue
    .line 614
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f080024

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 615
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f08009c

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 616
    return-void
.end method

.method public static showingMenu()Z
    .locals 3

    .prologue
    .line 235
    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v2, 0x7f080024

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 237
    .local v0, "relContainer":Landroid/view/View;
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static startActivity(Landroid/content/Intent;)V
    .locals 1
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    .line 405
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivity(Landroid/content/Intent;)V

    .line 406
    return-void
.end method

.method public static supressClick(Z)V
    .locals 4
    .param p0, "suppress"    # Z

    .prologue
    .line 344
    const-string v1, "AppHelper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Supressing: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    .line 346
    .local v0, "webview":Landroid/webkit/WebView;
    if-eqz v0, :cond_0

    .line 348
    if-eqz p0, :cond_1

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$7;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/AppHelper$7;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 356
    :cond_0
    return-void

    .line 348
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static switchATM(Landroid/view/View;ZZLjava/lang/String;)V
    .locals 1
    .param p0, "v"    # Landroid/view/View;
    .param p1, "showBack"    # Z
    .param p2, "loadAsNewUrl"    # Z
    .param p3, "url"    # Ljava/lang/String;

    .prologue
    .line 742
    new-instance v0, Lcom/EnterpriseMobileBanking/AppHelper$15;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/AppHelper$15;-><init>(Landroid/view/View;ZZLjava/lang/String;)V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 748
    return-void
.end method

.method private static switchLob(Ljava/lang/String;)V
    .locals 1
    .param p0, "actionLob"    # Ljava/lang/String;

    .prologue
    .line 514
    const-string v0, "confirmSwitch"

    invoke-static {v0, p0}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLob(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    return-void
.end method

.method private static switchLob(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "save"    # Ljava/lang/String;
    .param p1, "actionLob"    # Ljava/lang/String;

    .prologue
    .line 526
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 527
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v0

    .line 528
    .local v0, "wv":Landroid/webkit/WebView;
    if-eqz v0, :cond_0

    .line 530
    sget-object v1, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getRootView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNavigation(Landroid/view/View;)V

    .line 533
    .end local v0    # "wv":Landroid/webkit/WebView;
    :cond_0
    const-string v1, "AppHelper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "in SwitchLOB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    invoke-static {p0, p1}, Lcom/EnterpriseMobileBanking/AppHelper;->logoutUser(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    return-void
.end method

.method public static switchLobFinish(Ljava/lang/String;)V
    .locals 1
    .param p0, "actionLob"    # Ljava/lang/String;

    .prologue
    .line 540
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/EnterpriseMobileBanking/AppHelper;->switchLobFinish(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    return-void
.end method

.method public static switchLobFinish(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p0, "actionLob"    # Ljava/lang/String;
    .param p1, "urlParams"    # Ljava/lang/String;

    .prologue
    .line 549
    const-string v0, "AppHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "in native.switchLobFinish: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    sget-object v0, Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    new-instance v1, Lcom/EnterpriseMobileBanking/AppHelper$9;

    invoke-direct {v1, p0, p1}, Lcom/EnterpriseMobileBanking/AppHelper$9;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 575
    return-void
.end method

.method public static switchProducts()V
    .locals 1

    .prologue
    .line 756
    new-instance v0, Lcom/EnterpriseMobileBanking/AppHelper$16;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/AppHelper$16;-><init>()V

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 763
    return-void
.end method
