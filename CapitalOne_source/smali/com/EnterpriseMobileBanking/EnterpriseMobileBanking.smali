.class public Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
.super Lcom/worklight/androidgap/WLDroidGap;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# static fields
.field public static final CAPITALONE_360_LOB:I = 0x7f080081

.field public static final CAPITALONE_BANK_LOB:I = 0x7f080080

.field public static final CAPITALONE_CARD_LOB:I = 0x7f08007f

.field private static final CARD_LOGIN_URL:Ljava/lang/String; = "www/cards/login"

.field private static COF_ATM_URI:Ljava/lang/String; = null

.field private static COF_LOGIN_RDC_URI:Ljava/lang/String; = null

.field private static TAG:Ljava/lang/String; = null

.field private static final TRANSITION_DURATION:I = 0x1f4

.field private static adapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private static anims:[Landroid/view/animation/Animation;

.field private static authenticated:Z

.field private static final carpetActions:[[Ljava/lang/String;

.field private static coverMargin:I

.field private static created:Z

.field private static disableback:Z

.field private static isThirdPartyTimer:Z

.field private static lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

.field private static lobRow:[I

.field private static menuItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field private static menuList:Landroid/widget/ListView;

.field private static navjsi:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

.field private static notFound:Landroid/app/AlertDialog;

.field private static quickNavButtons:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/EnterpriseMobileBanking/Plugins/Components/NativeButton;",
            ">;"
        }
    .end annotation
.end field

.field private static theWebViewLinker:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;


# instance fields
.field private accRunner:Ljava/lang/Runnable;

.field private closeLOBs:Ljava/lang/Runnable;

.field private hangOnDialog:Landroid/app/ProgressDialog;

.field private hasContactUsBeenInitialized:Z

.field private lastCarpet:Ljava/lang/String;

.field private lastLob:I

.field private mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

.field private mSplashSuppress:Z

.field private maskedUserName:Ljava/lang/String;

.field private nextCarpet:Ljava/lang/String;

.field public onQuickClick:Landroid/view/View$OnClickListener;

.field private patternValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 96
    const-string v0, "EnterpriseMobileBanking"

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->quickNavButtons:Ljava/util/ArrayList;

    .line 102
    sput-object v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->navjsi:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    .line 104
    new-array v0, v4, [Landroid/view/animation/Animation;

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->anims:[Landroid/view/animation/Animation;

    .line 106
    sput-object v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;

    .line 110
    sput-boolean v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    .line 112
    sput-boolean v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isThirdPartyTimer:Z

    .line 114
    sput-object v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    .line 116
    sput-object v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 118
    sput v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I

    .line 144
    sput-boolean v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->created:Z

    .line 165
    const-string v0, "COF.html#www/atm"

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->COF_ATM_URI:Ljava/lang/String;

    .line 166
    const-string v0, "COF.html#www/bank/login?redirect=www/bank/deposit/details.html"

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->COF_LOGIN_RDC_URI:Ljava/lang/String;

    .line 168
    new-array v0, v5, [[Ljava/lang/String;

    new-array v1, v5, [Ljava/lang/String;

    const-string v2, "COF.html#www/cards/login?redirect=www/cards/accounts"

    aput-object v2, v1, v3

    const-string v2, "COF.html#www/cards/login?redirect=www/cards/rewards"

    aput-object v2, v1, v7

    const-string v2, "COF.html#www/cards/login?redirect=www/cards/paybills/schedule"

    aput-object v2, v1, v4

    aput-object v1, v0, v3

    new-array v1, v5, [Ljava/lang/String;

    const-string v2, "COF.html#www/bank/login?redirect=www/bank/accounts"

    aput-object v2, v1, v3

    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->COF_LOGIN_RDC_URI:Ljava/lang/String;

    aput-object v2, v1, v7

    const-string v2, "COF.html#www/bank/login?redirect=www/bank/paybills/payBills.html"

    aput-object v2, v1, v4

    aput-object v1, v0, v7

    new-array v1, v5, [Ljava/lang/String;

    const-string v2, "ThreeSixty.html"

    aput-object v2, v1, v3

    const-string v2, "ThreeSixty.html?redCarpetDest=DepositChecks"

    aput-object v2, v1, v7

    const-string v2, "ThreeSixty.html?redCarpetDest=UnauthATMFinder"

    aput-object v2, v1, v4

    aput-object v1, v0, v4

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->carpetActions:[[Ljava/lang/String;

    .line 179
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    .line 1718
    sput-object v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;

    .line 1744
    sput-boolean v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z

    return-void

    .line 179
    nop

    :array_0
    .array-data 4
        0x7f08007f
        0x7f080080
        0x7f080081
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 94
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap;-><init>()V

    .line 120
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 122
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->nextCarpet:Ljava/lang/String;

    .line 124
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;

    .line 126
    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->maskedUserName:Ljava/lang/String;

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->patternValue:Ljava/lang/String;

    .line 151
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mSplashSuppress:Z

    .line 183
    iput v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    .line 185
    new-instance v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$1;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->closeLOBs:Ljava/lang/Runnable;

    .line 1426
    new-instance v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$23;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onQuickClick:Landroid/view/View$OnClickListener;

    .line 1568
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hasContactUsBeenInitialized:Z

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    .prologue
    .line 94
    sget v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I

    return v0
.end method

.method static synthetic access$002(I)I
    .locals 0
    .param p0, "x0"    # I

    .prologue
    .line 94
    sput p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->coverMargin:I

    return p0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1000()Landroid/widget/ArrayAdapter;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method static synthetic access$1302(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 94
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .param p1, "x1"    # Landroid/view/View;

    .prologue
    .line 94
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1500(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchContactUs()V

    return-void
.end method

.method static synthetic access$1600()Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic access$1702(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 94
    sput-boolean p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z

    return p0
.end method

.method static synthetic access$1800()Z
    .locals 1

    .prologue
    .line 94
    sget-boolean v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    return v0
.end method

.method static synthetic access$1900(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lorg/apache/cordova/CordovaWebView;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method static synthetic access$200()[I
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    return-object v0
.end method

.method static synthetic access$300(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-object v0
.end method

.method static synthetic access$400(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Landroid/app/ProgressDialog;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$402(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    .param p1, "x1"    # Landroid/app/ProgressDialog;

    .prologue
    .line 94
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hangOnDialog:Landroid/app/ProgressDialog;

    return-object p1
.end method

.method static synthetic access$500(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Ljava/lang/Runnable;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$600(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)Ljava/lang/Runnable;
    .locals 1
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->closeLOBs:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$700(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    .prologue
    .line 94
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleIntentUri()V

    return-void
.end method

.method static synthetic access$800()Ljava/util/List;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$900()Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    .locals 1

    .prologue
    .line 94
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    return-object v0
.end method

.method static synthetic access$902(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    .locals 0
    .param p0, "x0"    # Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .prologue
    .line 94
    sput-object p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastItem:Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    return-object p0
.end method

.method private addJSInterfaces(Lorg/apache/cordova/CordovaWebView;)V
    .locals 2
    .param p1, "wv"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 465
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->navjsi:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    const v1, 0x7f0900fe

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/apache/cordova/CordovaWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;-><init>()V

    const v1, 0x7f0900ff

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/apache/cordova/CordovaWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    move-result-object v0

    const-string v1, "_androidLocale"

    invoke-virtual {p1, v0, v1}, Lorg/apache/cordova/CordovaWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    return-void
.end method

.method public static addMenuItem(Lorg/json/JSONObject;)V
    .locals 2
    .param p0, "value"    # Lorg/json/JSONObject;

    .prologue
    .line 1034
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$16;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$16;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 1050
    return-void
.end method

.method public static clearAllMenuItems()V
    .locals 2

    .prologue
    .line 1019
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$15;

    invoke-direct {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$15;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 1030
    return-void
.end method

.method private configureWebView(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaWebViewClient;)V
    .locals 6
    .param p1, "browser"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "webViewClient"    # Lorg/apache/cordova/CordovaWebViewClient;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 220
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v3, "configureWebView()"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    new-instance v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$2;

    invoke-direct {v2, p0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$2;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lorg/apache/cordova/api/CordovaInterface;)V

    invoke-virtual {p1, v2}, Lorg/apache/cordova/CordovaWebView;->setWebChromeClient(Lorg/apache/cordova/CordovaChromeClient;)V

    .line 243
    invoke-virtual {p1, p2}, Lorg/apache/cordova/CordovaWebView;->setWebViewClient(Lorg/apache/cordova/CordovaWebViewClient;)V

    .line 246
    invoke-virtual {p2, p1}, Lorg/apache/cordova/CordovaWebViewClient;->setWebView(Lorg/apache/cordova/CordovaWebView;)V

    .line 248
    invoke-virtual {p1, v5}, Lorg/apache/cordova/CordovaWebView;->setInitialScale(I)V

    .line 249
    invoke-virtual {p1, v5}, Lorg/apache/cordova/CordovaWebView;->setVerticalScrollBarEnabled(Z)V

    .line 250
    invoke-virtual {p1}, Lorg/apache/cordova/CordovaWebView;->requestFocusFromTouch()Z

    .line 252
    invoke-virtual {p1}, Lorg/apache/cordova/CordovaWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 253
    .local v1, "settings":Landroid/webkit/WebSettings;
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 254
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 255
    sget-object v2, Landroid/webkit/WebSettings$LayoutAlgorithm;->NORMAL:Landroid/webkit/WebSettings$LayoutAlgorithm;

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 256
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 258
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0900fc

    invoke-static {v3}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v5}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 260
    .local v0, "databasePath":Ljava/lang/String;
    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 264
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 266
    iput-boolean v5, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->cancelLoadUrl:Z

    .line 272
    invoke-virtual {p0, p1, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->bindBrowser(Lorg/apache/cordova/CordovaWebView;Z)V

    .line 274
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->addJSInterfaces(Lorg/apache/cordova/CordovaWebView;)V

    .line 276
    return-void
.end method

.method private finishOnCreate()V
    .locals 7

    .prologue
    .line 484
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v3

    .line 486
    .local v3, "transiteWebView":Landroid/webkit/WebView;
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    new-instance v5, Lcom/EnterpriseMobileBanking/AppViewClient;

    iget-object v6, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {v5, p0, v6}, Lcom/EnterpriseMobileBanking/AppViewClient;-><init>(Lorg/apache/cordova/DroidGap;Lorg/apache/cordova/CordovaWebView;)V

    invoke-direct {p0, v4, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->configureWebView(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaWebViewClient;)V

    .line 489
    const v4, 0x7f080026

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    .line 491
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$6;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$6;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnNavOptionClick(Landroid/view/View$OnClickListener;)V

    .line 497
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$7;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setOnGlobalButtonClick(Landroid/view/View$OnClickListener;)V

    .line 523
    const v4, 0x7f0900a1

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 525
    const v4, 0x7f090100

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 526
    .local v1, "preLoadUrl":Ljava/lang/String;
    const v4, 0x7f090107

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f090109

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 528
    .local v2, "shouldPreLoadPreferences":Ljava/lang/String;
    const v4, 0x7f090108

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 530
    const v4, 0x7f090101

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 533
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getWebUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-super {p0, v4}, Lcom/worklight/androidgap/WLDroidGap;->loadUrl(Ljava/lang/String;)V

    .line 540
    new-instance v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$8;

    invoke-direct {v4, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$8;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 548
    new-instance v4, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {v4}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;-><init>()V

    sput-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->theWebViewLinker:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    .line 549
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;

    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->theWebViewLinker:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    invoke-direct {v0, v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;-><init>(Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;)V

    .line 550
    .local v0, "client":Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 552
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setupMenuList()V

    .line 553
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setupHomePage()V

    .line 554
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetTransiteView()V

    .line 556
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->root:Landroid/widget/LinearLayout;

    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$9;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    .line 568
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v5, "Finished finishOnCreate..."

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    return-void
.end method

.method public static getAuthenticated()Z
    .locals 1

    .prologue
    .line 1005
    sget-boolean v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    return v0
.end method

.method private getEulaFilename()Ljava/lang/String;
    .locals 3

    .prologue
    .line 644
    const-string v0, "eula.html"

    .line 646
    .local v0, "filename":Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 648
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FR"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 650
    const-string v0, "eula_frca.html"

    .line 658
    :cond_0
    :goto_0
    return-object v0

    .line 654
    :cond_1
    const-string v0, "eula_enca.html"

    goto :goto_0
.end method

.method private getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1269
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .end local p1    # "v":Landroid/view/View;
    check-cast p1, Landroid/view/View;

    .line 1271
    .restart local p1    # "v":Landroid/view/View;
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f08007f

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080080

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080081

    if-ne v0, v1, :cond_0

    .line 1273
    :cond_1
    const v0, 0x7f080097

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    return-object v0
.end method

.method public static getThirdPartyTimerFlag()Z
    .locals 1

    .prologue
    .line 1013
    sget-boolean v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isThirdPartyTimer:Z

    return v0
.end method

.method public static getWebViewLinker()Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;
    .locals 1

    .prologue
    .line 2379
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->theWebViewLinker:Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;

    return-object v0
.end method

.method private handleBackPressed(Z)Z
    .locals 11
    .param p1, "isOnHardwareBack"    # Z

    .prologue
    .line 1755
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "disableback is "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    sget-boolean v9, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1756
    sget-boolean v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z

    if-nez v7, :cond_1c

    .line 1764
    const/4 v7, 0x1

    sput-boolean v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z

    .line 1765
    new-instance v7, Ljava/lang/Thread;

    new-instance v8, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$25;

    invoke-direct {v8, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$25;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-direct {v7, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 1781
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "handleBackPressed() - on Back: is Menu Open: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1782
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showingMenu()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->keyboardShowing()Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_0
    const/4 v2, 0x1

    .line 1785
    .local v2, "handled":Z
    :goto_0
    if-eqz v2, :cond_4

    .line 1787
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideMenu()V

    .line 1788
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 1972
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 1974
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onBackFixMenuSelection()V

    .line 1979
    .end local v2    # "handled":Z
    :cond_2
    :goto_2
    return v2

    .line 1782
    :cond_3
    const/4 v2, 0x0

    goto :goto_0

    .line 1792
    .restart local v2    # "handled":Z
    :cond_4
    const/4 v2, 0x1

    .line 1793
    const v7, 0x7f0800a1

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/webkit/WebView;

    .line 1794
    .local v6, "transite":Landroid/webkit/WebView;
    const v7, 0x7f090132

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/webkit/WebView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1797
    const v7, 0x7f0800a2

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_6

    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    if-eqz v7, :cond_6

    .line 1798
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "Hiding contact view!"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1799
    const v7, 0x7f0800a2

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const/16 v8, 0x8

    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1805
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    const-string v8, "www/cards/login"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1806
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v9}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v9

    const-string v10, "www/cards/login"

    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    const-string v10, "www/cards/login"

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1807
    .local v1, "currentAppViewUrlWithStrippedParameters":Ljava/lang/String;
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 1819
    .end local v1    # "currentAppViewUrlWithStrippedParameters":Ljava/lang/String;
    :cond_5
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->clearView()V

    .line 1820
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->reload()V

    goto :goto_1

    .line 1823
    :cond_6
    const v7, 0x7f0800a2

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eqz v7, :cond_7

    const v7, 0x7f08009d

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_9

    const v7, 0x7f08009f

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->isSelected()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 1826
    :cond_7
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "contact us or atm back"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1828
    invoke-virtual {v6}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 1829
    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/webkit/WebView;->setTag(Ljava/lang/Object;)V

    .line 1830
    const v7, 0x7f08009f

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual {p0, v7, v8, v9, v10}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    goto/16 :goto_1

    .line 1833
    :cond_8
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "contactus or atm Returning Home!"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1834
    const v7, 0x7f080021

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->returnToHome(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1838
    :cond_9
    const v7, 0x7f08009c

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_a

    .line 1839
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finish()V

    goto/16 :goto_1

    .line 1841
    :cond_a
    invoke-virtual {v6}, Landroid/webkit/WebView;->getVisibility()I

    move-result v7

    if-nez v7, :cond_18

    .line 1842
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "transite is visible"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1843
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getProductsUri()Ljava/lang/String;

    move-result-object v5

    .line 1844
    .local v5, "productsUri":Ljava/lang/String;
    const v7, 0x7f0900a2

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 1847
    .local v3, "isAboutBlank":Z
    const/4 v0, 0x0

    .line 1848
    .local v0, "b360Products":Z
    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_b

    .line 1849
    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f0900ee

    invoke-static {v8}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_b

    .line 1850
    const/4 v0, 0x1

    .line 1854
    :cond_b
    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    if-nez v3, :cond_c

    if-eqz v0, :cond_12

    .line 1855
    :cond_c
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "products is visible"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1857
    if-eqz v0, :cond_e

    .line 1859
    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    if-nez v7, :cond_d

    const/4 v7, 0x1

    :goto_3
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchProducts(Z)V

    goto/16 :goto_1

    :cond_d
    const/4 v7, 0x0

    goto :goto_3

    .line 1862
    :cond_e
    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    if-nez v7, :cond_f

    .line 1865
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "products Returning Home!"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1866
    const v7, 0x7f080021

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->returnToHome(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1870
    :cond_f
    invoke-virtual {v6}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v7

    if-nez v7, :cond_11

    .line 1872
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "products CANNOT go back"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1873
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetTransiteView()V

    .line 1874
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Lorg/apache/cordova/CordovaWebView;->setVisibility(I)V

    .line 1883
    sget-boolean v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    if-nez v7, :cond_10

    .line 1885
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->clearView()V

    .line 1886
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->reload()V

    .line 1889
    :cond_10
    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    const v8, 0x7f080081

    if-ne v7, v8, :cond_1

    if-nez v3, :cond_1

    .line 1893
    const-string v7, "window.plugins.webView.back();"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1898
    :cond_11
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "products can go back"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1899
    invoke-virtual {v6}, Landroid/webkit/WebView;->goBack()V

    goto/16 :goto_1

    .line 1905
    :cond_12
    invoke-static {v6, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->findUrlIndexFromTopOfStack(Landroid/webkit/WebView;Ljava/lang/String;)I

    move-result v4

    .line 1907
    .local v4, "productsIndex":I
    const/4 v7, -0x1

    if-le v4, v7, :cond_13

    .line 1909
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "in 360 Products"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1910
    invoke-virtual {v6}, Landroid/webkit/WebView;->goBack()V

    .line 1913
    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    if-ne v4, v7, :cond_1

    .line 1917
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    goto/16 :goto_1

    .line 1920
    :cond_13
    iget v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    const v8, 0x7f080081

    if-ne v7, v8, :cond_1

    .line 1922
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "360 products not visible, going back with plugin"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1924
    if-eqz p1, :cond_16

    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavOption()I

    move-result v7

    if-nez v7, :cond_14

    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    const-string v8, "debitTabRender"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_14
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavOption()I

    move-result v7

    if-nez v7, :cond_16

    invoke-virtual {v6}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v7

    const-string v8, "coafPaymentConfirmation"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_16

    .line 1927
    :cond_15
    invoke-virtual {v6}, Landroid/webkit/WebView;->clearHistory()V

    .line 1930
    :cond_16
    const/4 v7, -0x2

    if-ne v4, v7, :cond_17

    .line 1931
    invoke-virtual {v6}, Landroid/webkit/WebView;->clearHistory()V

    .line 1932
    const-string v7, "Ext.dispatch({ controller : \'LoginController\', action : \'index\' });"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1935
    :cond_17
    const-string v7, "window.plugins.webView.back();"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1944
    .end local v0    # "b360Products":Z
    .end local v3    # "isAboutBlank":Z
    .end local v4    # "productsIndex":I
    .end local v5    # "productsUri":Ljava/lang/String;
    :cond_18
    if-nez p1, :cond_19

    .line 1951
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "sending software goBack"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1952
    const-string v7, "goBack();"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1955
    :cond_19
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "handling hardware back"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1958
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->getInstance()Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;

    move-result-object v7

    invoke-virtual {v7}, Lcom/EnterpriseMobileBanking/Plugins/AndroidLocaleJSI;->skipLanding()Z

    move-result v7

    if-nez v7, :cond_1a

    .line 1959
    const-string v7, "androidBackFunc();"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1962
    :cond_1a
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v7}, Lorg/apache/cordova/CordovaWebView;->canGoBack()Z

    move-result v7

    if-eqz v7, :cond_1b

    .line 1963
    const-string v7, "androidBackFunc();"

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1966
    :cond_1b
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finish()V

    goto/16 :goto_1

    .line 1979
    .end local v2    # "handled":Z
    .end local v6    # "transite":Landroid/webkit/WebView;
    :cond_1c
    const/4 v2, 0x1

    goto/16 :goto_2
.end method

.method private handleIntentUri()V
    .locals 6

    .prologue
    .line 311
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 313
    .local v1, "myIntent":Landroid/content/Intent;
    if-eqz v1, :cond_3

    .line 315
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Intent DataXX: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v0

    .line 318
    .local v0, "fragment":Ljava/lang/String;
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Fragment: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    if-eqz v0, :cond_1

    .line 321
    const v2, 0x7f08007f

    .line 322
    .local v2, "whichLob":I
    const-string v3, "bank"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 323
    const v2, 0x7f080080

    .line 327
    :cond_0
    :goto_0
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Loading: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f080099

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleLob(Landroid/view/View;)V

    .line 335
    .end local v0    # "fragment":Ljava/lang/String;
    .end local v2    # "whichLob":I
    :cond_1
    :goto_1
    return-void

    .line 324
    .restart local v0    # "fragment":Ljava/lang/String;
    .restart local v2    # "whichLob":I
    :cond_2
    const-string v3, "360"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 325
    const v2, 0x7f080081

    goto :goto_0

    .line 333
    .end local v0    # "fragment":Ljava/lang/String;
    .end local v2    # "whichLob":I
    :cond_3
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v4, "Intent was NULL!"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private handleNavigationSideMenu(Landroid/view/View;)V
    .locals 10
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 1081
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v8, "handleNavigationSideMenu!"

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1084
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v7}, Landroid/widget/ArrayAdapter;->getCount()I

    move-result v7

    if-nez v7, :cond_0

    .line 1126
    :goto_0
    return-void

    .line 1088
    :cond_0
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v7, v6}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .line 1089
    .local v3, "item":Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;
    invoke-virtual {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;->getText()Ljava/lang/String;

    move-result-object v7

    const-string v8, "unloaded"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1091
    sget-object v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v6, "****** MENU DATA IS UNLOADED"

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1096
    :cond_1
    invoke-static {v6}, Lcom/EnterpriseMobileBanking/AppHelper;->setNavigationEnabled(Z)V

    .line 1098
    const v7, 0x7f080024

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/AppRelContainer;

    .line 1099
    .local v1, "container":Lcom/EnterpriseMobileBanking/AppRelContainer;
    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getLeft()I

    move-result v7

    if-nez v7, :cond_5

    move v4, v5

    .line 1100
    .local v4, "opening":Z
    :goto_1
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->anims:[Landroid/view/animation/Animation;

    if-eqz v4, :cond_2

    move v5, v6

    :cond_2
    aget-object v0, v7, v5

    .line 1101
    .local v0, "as":Landroid/view/animation/Animation;
    if-eqz v4, :cond_3

    const/16 v6, 0xf0

    :cond_3
    invoke-static {v6}, Lcom/EnterpriseMobileBanking/AppHelper;->setLastMovement(I)V

    .line 1102
    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->supressClick(Z)V

    .line 1103
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 1104
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getCurrentFocus()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 1105
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getCurrentFocus()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->clearFocus()V

    .line 1107
    :cond_4
    monitor-enter v1

    .line 1109
    const v5, 0x7f080023

    :try_start_0
    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1111
    invoke-virtual {v1, v0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->startAnimation(Landroid/view/animation/Animation;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1113
    :try_start_1
    invoke-virtual {v0}, Landroid/view/animation/Animation;->getDuration()J

    move-result-wide v6

    const-wide/16 v8, 0x64

    add-long/2addr v6, v8

    invoke-virtual {v1, v6, v7}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1117
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1119
    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$17;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$17;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    const-wide/16 v6, 0x1f4

    invoke-virtual {p1, v5, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .end local v0    # "as":Landroid/view/animation/Animation;
    .end local v4    # "opening":Z
    :cond_5
    move v4, v6

    .line 1099
    goto :goto_1

    .line 1114
    .restart local v0    # "as":Landroid/view/animation/Animation;
    .restart local v4    # "opening":Z
    :catch_0
    move-exception v2

    .line 1115
    .local v2, "e":Ljava/lang/InterruptedException;
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_2

    .line 1117
    .end local v2    # "e":Ljava/lang/InterruptedException;
    :catchall_0
    move-exception v5

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v5
.end method

.method private handleNotFound()V
    .locals 3

    .prologue
    .line 1721
    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;

    if-nez v1, :cond_0

    .line 1722
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1723
    .local v0, "notFoundBuilder":Landroid/app/AlertDialog$Builder;
    const v1, 0x7f09008d

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 1724
    const v1, 0x7f0900f8

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 1725
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1726
    const-string v1, "OK"

    new-instance v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$24;

    invoke-direct {v2, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$24;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1734
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    sput-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;

    .line 1736
    .end local v0    # "notFoundBuilder":Landroid/app/AlertDialog$Builder;
    :cond_0
    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->notFound:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 1737
    return-void
.end method

.method private initConfigParameters()V
    .locals 14

    .prologue
    .line 580
    const-string v10, "SP_CONFIG_DETLA_HOURS"

    invoke-static {v10}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->contains(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 582
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    .line 586
    .local v9, "r":Landroid/content/res/Resources;
    const-string v10, "SP_CONTACT_CAP1_US_PHONE"

    const v11, 0x7f0900e5

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 588
    const-string v10, "SP_CONTACT_CAP1_NON_US_PHONE"

    const v11, 0x7f0900e6

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 590
    const-string v10, "SP_CONTACT_CAP1_TWITTER"

    const v11, 0x7f0900e7

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 592
    const-string v10, "SP_CONTACT_CAP1_FACEBOOK"

    const v11, 0x7f0900e8

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 595
    const-string v10, "SP_CONTACT_360_US_PHONE"

    const v11, 0x7f0900e9

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 597
    const-string v10, "SP_CONTACT_360_EMAIL"

    const v11, 0x7f0900ea

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 599
    const-string v10, "SP_CONTACT_360_TWITTER"

    const v11, 0x7f0900eb

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 601
    const-string v10, "SP_CONTACT_360_FACEBOOK"

    const v11, 0x7f0900ec

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 605
    const-string v10, "SP_CONFIG_DETLA_HOURS"

    const/high16 v11, 0x7f0b0000

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;I)Z

    .line 608
    const-string v10, "SP_ATM_CAP360_ATM_LOCATOR"

    const v11, 0x7f0900ed

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 609
    const-string v10, "SP_URL_OPEN_OUTSIDE"

    const v11, 0x7f0900f1

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 610
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const v11, 0x7f0900ef

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const v11, 0x7f0900ee

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 612
    .local v8, "products":Ljava/lang/String;
    const-string v10, "SP_PRODUCTS_360_PRODUCTS_URL"

    invoke-static {v10, v8}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 613
    const-string v10, "SP_PRODUCTS_360_PRODUCTS_AUTH_URL"

    invoke-static {v10, v8}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 614
    const-string v10, "SP_PRODUCTS_BRANCH_URL"

    const v11, 0x7f0900f0

    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 617
    .end local v8    # "products":Ljava/lang/String;
    .end local v9    # "r":Landroid/content/res/Resources;
    :cond_0
    const-string v10, "SP_CONFIG_LAST_UPDATED_MILLIS"

    const-wide/16 v12, 0x0

    invoke-static {v10, v12, v13}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;J)J

    move-result-wide v4

    .line 619
    .local v4, "lastDate":J
    const/4 v6, 0x1

    .line 620
    .local v6, "makeCall":Z
    const-wide/16 v10, 0x0

    cmp-long v10, v4, v10

    if-eqz v10, :cond_1

    .line 621
    const/4 v6, 0x0

    .line 623
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 624
    .local v1, "date":Ljava/util/Date;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 625
    .local v7, "now":Ljava/util/Date;
    invoke-static {v1, v7}, Lcom/EnterpriseMobileBanking/AppHelper;->hoursDiff(Ljava/util/Date;Ljava/util/Date;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 626
    .local v3, "hourDifference":I
    const-string v10, "SP_CONFIG_DETLA_HOURS"

    const/4 v11, 0x0

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;I)I

    move-result v2

    .line 627
    .local v2, "deltaHourCheck":I
    if-lt v3, v2, :cond_1

    .line 628
    const/4 v6, 0x1

    .line 633
    .end local v1    # "date":Ljava/util/Date;
    .end local v2    # "deltaHourCheck":I
    .end local v3    # "hourDifference":I
    .end local v7    # "now":Ljava/util/Date;
    :cond_1
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "makeCall: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    if-eqz v6, :cond_2

    .line 635
    new-instance v0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;

    const/4 v10, 0x0

    invoke-direct {v0, v10, p0}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;-><init>(ILandroid/content/Context;)V

    .line 636
    .local v0, "call":Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v11, "executing call"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Void;

    invoke-virtual {v0, v10}, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 638
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v11, "executed call"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    .end local v0    # "call":Lcom/EnterpriseMobileBanking/AsyncServiceCallTask;
    :cond_2
    return-void
.end method

.method private initEula()V
    .locals 8

    .prologue
    .line 664
    :try_start_0
    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getEulaFilename()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    const-string v6, "UTF-8"

    invoke-direct {v3, v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 665
    .local v3, "reader":Ljava/io/InputStreamReader;
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 666
    .local v0, "br":Ljava/io/BufferedReader;
    const-string v4, ""

    .line 667
    .local v4, "t":Ljava/lang/String;
    const-string v2, ""

    .line 668
    .local v2, "line":Ljava/lang/String;
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 669
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 672
    :cond_0
    const v5, 0x7f08005f

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v6

    sget-object v7, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v5, v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 678
    .end local v0    # "br":Ljava/io/BufferedReader;
    .end local v2    # "line":Ljava/lang/String;
    .end local v3    # "reader":Ljava/io/InputStreamReader;
    .end local v4    # "t":Ljava/lang/String;
    :goto_1
    const v5, 0x7f0800a3

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 679
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finishOnCreate()V

    .line 681
    const v5, 0x7f08005d

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Button;

    new-instance v6, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$10;

    invoke-direct {v6, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$10;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v5, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 697
    return-void

    .line 673
    :catch_0
    move-exception v1

    .line 675
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finish()V

    goto :goto_1
.end method

.method public static isCreated()Z
    .locals 1

    .prologue
    .line 162
    sget-boolean v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->created:Z

    return v0
.end method

.method private obliterate()V
    .locals 3

    .prologue
    .line 471
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 472
    .local v0, "preferences":Landroid/content/SharedPreferences;
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "appInstallTime"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cof_appInstallTime"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 473
    return-void
.end method

.method private onBackFixMenuSelection()V
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 1989
    const v4, 0x7f0800a2

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    move v0, v5

    .line 1990
    .local v0, "contactUsVisibility":Z
    :goto_0
    const v4, 0x7f0800a1

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/webkit/WebView;

    move-object v1, v4

    check-cast v1, Landroid/webkit/WebView;

    .line 1991
    .local v1, "transite":Landroid/webkit/WebView;
    invoke-virtual {v1}, Landroid/webkit/WebView;->getVisibility()I

    move-result v4

    if-nez v4, :cond_1

    move v2, v5

    .line 1992
    .local v2, "transiteVisibility":Z
    :goto_1
    const v4, 0x7f0800a0

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_2

    move v3, v5

    .line 1995
    .local v3, "webViewVisibility":Z
    :goto_2
    if-eqz v0, :cond_3

    if-nez v2, :cond_3

    if-nez v3, :cond_3

    .line 1997
    const v4, 0x7f090123

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(I)V

    .line 2013
    :goto_3
    return-void

    .end local v0    # "contactUsVisibility":Z
    .end local v1    # "transite":Landroid/webkit/WebView;
    .end local v2    # "transiteVisibility":Z
    .end local v3    # "webViewVisibility":Z
    :cond_0
    move v0, v6

    .line 1989
    goto :goto_0

    .restart local v0    # "contactUsVisibility":Z
    .restart local v1    # "transite":Landroid/webkit/WebView;
    :cond_1
    move v2, v6

    .line 1991
    goto :goto_1

    .restart local v2    # "transiteVisibility":Z
    :cond_2
    move v3, v6

    .line 1992
    goto :goto_2

    .line 2000
    .restart local v3    # "webViewVisibility":Z
    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f090105

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 2002
    const v4, 0x7f090124

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(I)V

    goto :goto_3

    .line 2005
    :cond_4
    if-eqz v3, :cond_5

    if-nez v0, :cond_5

    if-nez v2, :cond_5

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "atm"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 2007
    const v4, 0x7f090122

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(I)V

    goto :goto_3

    .line 2011
    :cond_5
    const/4 v4, 0x0

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    goto :goto_3
.end method

.method private resetHeader()V
    .locals 1

    .prologue
    .line 1341
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetHeader(Z)V

    .line 1342
    return-void
.end method

.method private resetHeader(Z)V
    .locals 3
    .param p1, "red"    # Z

    .prologue
    const v2, 0x7f0800af

    .line 1345
    if-eqz p1, :cond_0

    .line 1346
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const v1, 0x7f0200aa

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setBackgroundResource(I)V

    .line 1347
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->RED:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavButtonColor(Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;)V

    .line 1348
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v1, 0x7f020122

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 1354
    :goto_0
    return-void

    .line 1350
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const v1, 0x7f0200a9

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setBackgroundResource(I)V

    .line 1351
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->BLUE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavButtonColor(Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;)V

    .line 1352
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const v1, 0x7f020121

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method public static setAuthenticated(Z)V
    .locals 2
    .param p0, "newAuth"    # Z

    .prologue
    const v1, 0x7f080026

    .line 982
    sput-boolean p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    .line 984
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isCanadianApp()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 985
    if-eqz p0, :cond_2

    .line 986
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->showNavButton()V

    .line 992
    :cond_0
    :goto_0
    if-nez p0, :cond_1

    .line 994
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideConfirm()V

    .line 995
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/NotificationPlugin;->closeAllDialogs()V

    .line 997
    :cond_1
    if-eqz p0, :cond_3

    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->changeSignOut(I)V

    .line 998
    return-void

    .line 988
    :cond_2
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->findAppViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buryNavButton()V

    goto :goto_0

    .line 997
    :cond_3
    const/16 v0, 0x8

    goto :goto_1
.end method

.method public static setSelectedMenuItem(Ljava/lang/String;)V
    .locals 2
    .param p0, "menuItemId"    # Ljava/lang/String;

    .prologue
    .line 955
    if-eqz p0, :cond_0

    .line 956
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v0, 0x1

    .line 957
    .local v0, "makeSelection":Z
    :goto_0
    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;

    invoke-direct {v1, v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$14;-><init>(ZLjava/lang/String;)V

    invoke-static {v1}, Lcom/EnterpriseMobileBanking/AppHelper;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 979
    .end local v0    # "makeSelection":Z
    :cond_0
    return-void

    .line 956
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static setThirdPartyTimer(Z)V
    .locals 0
    .param p0, "flag"    # Z

    .prologue
    .line 1009
    sput-boolean p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isThirdPartyTimer:Z

    .line 1010
    return-void
.end method

.method private setupHomePage()V
    .locals 28

    .prologue
    .line 700
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v5, v0, [I

    fill-array-data v5, :array_0

    .line 701
    .local v5, "carpetIds":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v10, v0, [I

    fill-array-data v10, :array_1

    .line 703
    .local v10, "covers":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v0, v0, [I

    move-object/from16 v16, v0

    fill-array-data v16, :array_2

    .line 705
    .local v16, "lobTitles":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v15, v0, [I

    fill-array-data v15, :array_3

    .line 707
    .local v15, "lobSubtext":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v6, v0, [[I

    const/16 v23, 0x0

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_4

    aput-object v24, v6, v23

    const/16 v23, 0x1

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_5

    aput-object v24, v6, v23

    const/16 v23, 0x2

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_6

    aput-object v24, v6, v23

    .line 714
    .local v6, "carpetList":[[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v7, v0, [[I

    const/16 v23, 0x0

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_7

    aput-object v24, v7, v23

    const/16 v23, 0x1

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_8

    aput-object v24, v7, v23

    const/16 v23, 0x2

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_9

    aput-object v24, v7, v23

    .line 723
    .local v7, "carpetText":[[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v12, v0, [[I

    const/16 v23, 0x0

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_a

    aput-object v24, v12, v23

    const/16 v23, 0x1

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_b

    aput-object v24, v12, v23

    const/16 v23, 0x2

    const/16 v24, 0x3

    move/from16 v0, v24

    new-array v0, v0, [I

    move-object/from16 v24, v0

    fill-array-data v24, :array_c

    aput-object v24, v12, v23

    .line 730
    .local v12, "descriptions":[[I
    const v23, 0x7f08007b

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onQuickClick:Landroid/view/View$OnClickListener;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 731
    const v23, 0x7f08007d

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onQuickClick:Landroid/view/View$OnClickListener;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 732
    const v23, 0x7f08007c

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->onQuickClick:Landroid/view/View$OnClickListener;

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 734
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v0, v0, [I

    move-object/from16 v18, v0

    fill-array-data v18, :array_d

    .line 735
    .local v18, "quickNav":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v0, v0, [I

    move-object/from16 v19, v0

    fill-array-data v19, :array_e

    .line 737
    .local v19, "quickText":[I
    const/16 v23, 0x3

    move/from16 v0, v23

    new-array v0, v0, [I

    move-object/from16 v17, v0

    fill-array-data v17, :array_f

    .line 741
    .local v17, "quickIcon":[I
    const v23, 0x7f090127

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 742
    .local v13, "homeButtonString":Ljava/lang/String;
    sget v23, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v24, 0x10

    move/from16 v0, v23

    move/from16 v1, v24

    if-ge v0, v1, :cond_0

    .line 743
    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v23

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const-string v24, " "

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const v24, 0x7f09012e

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 745
    :cond_0
    const v23, 0x7f080021

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    move-object/from16 v0, v23

    invoke-virtual {v0, v13}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 747
    const/16 v20, 0x0

    .local v20, "row":I
    :goto_0
    sget-object v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    move-object/from16 v0, v23

    array-length v0, v0

    move/from16 v23, v0

    move/from16 v0, v20

    move/from16 v1, v23

    if-ge v0, v1, :cond_4

    .line 748
    sget-object v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    aget v23, v23, v20

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v14

    .line 749
    .local v14, "lob":Landroid/view/View;
    aget v23, v18, v20

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    const v24, 0x7f080083

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    aget v24, v17, v20

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 751
    aget v23, v18, v20

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    const v24, 0x7f080084

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    aget v24, v19, v20

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 756
    aget v23, v18, v20

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v23

    const v24, 0x7f080084

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    aget v25, v19, v20

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const v25, 0x7f09012e

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 762
    const v23, 0x7f0800c4

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    aget v24, v10, v20

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 766
    const v23, 0x7f0800c3

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setFocusable(Z)V

    .line 767
    const v23, 0x7f0800c3

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setFocusableInTouchMode(Z)V

    .line 770
    const v23, 0x7f0800c3

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    aget v25, v16, v20

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    const v26, 0x7f09008f

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v26

    const v27, 0x7f090090

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v25 .. v27}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const v25, 0x7f09012b

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const v25, 0x7f09012e

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 777
    const v23, 0x7f0800c7

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    aget v24, v16, v20

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 782
    const v23, 0x7f0800c7

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    aget v25, v16, v20

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    const v26, 0x7f09008f

    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v26

    const v27, 0x7f090090

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v25 .. v27}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const v25, 0x7f09012e

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 788
    aget v23, v15, v20

    if-eqz v23, :cond_1

    .line 789
    const v23, 0x7f0800c8

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    aget v24, v15, v20

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 791
    const v23, 0x7f0800c8

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const v24, 0x7f090134

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 793
    const v23, 0x7f0800c8

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setVisibility(I)V

    .line 800
    :goto_1
    const v23, 0x7f080099

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    sget-object v24, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    aget v24, v24, v20

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 802
    aget-object v9, v6, v20

    .line 803
    .local v9, "carpets":[I
    aget-object v21, v7, v20

    .line 804
    .local v21, "texts":[I
    sget-object v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->carpetActions:[[Ljava/lang/String;

    aget-object v22, v23, v20

    .line 805
    .local v22, "urls":[Ljava/lang/String;
    const/4 v4, 0x0

    .local v4, "carpet":I
    :goto_2
    array-length v0, v9

    move/from16 v23, v0

    move/from16 v0, v23

    if-ge v4, v0, :cond_3

    .line 806
    sget-object v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    const-string v25, "Setting: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " -- Image: "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " to "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    aget v25, v9, v4

    const/16 v26, 0x10

    invoke-static/range {v25 .. v26}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v23 .. v24}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    aget v23, v5, v4

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 809
    .local v8, "carpetView":Landroid/view/View;
    const v23, 0x7f080083

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    aget v24, v9, v4

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 812
    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v23, v12, v20

    aget v23, v23, v4

    if-nez v23, :cond_2

    aget v23, v21, v4

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v23

    :goto_3
    move-object/from16 v0, v24

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const-string v24, " "

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    const v24, 0x7f09012e

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 816
    .local v11, "descString":Ljava/lang/String;
    const v23, 0x7f080084

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const v24, 0x7f090132

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 818
    const v23, 0x7f080084

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    invoke-static {v11}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 820
    const v23, 0x7f080084

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    aget v24, v21, v4

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v24

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 824
    const v23, 0x7f080083

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setFocusable(Z)V

    .line 825
    const v23, 0x7f080084

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 826
    const v23, 0x7f080083

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/ImageView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/ImageView;->setFocusableInTouchMode(Z)V

    .line 827
    const v23, 0x7f080084

    move/from16 v0, v23

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const/16 v24, 0x0

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setFocusableInTouchMode(Z)V

    .line 828
    aget v23, v5, v4

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    aget-object v24, v22, v4

    invoke-virtual/range {v23 .. v24}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 805
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    .line 796
    .end local v4    # "carpet":I
    .end local v8    # "carpetView":Landroid/view/View;
    .end local v9    # "carpets":[I
    .end local v11    # "descString":Ljava/lang/String;
    .end local v21    # "texts":[I
    .end local v22    # "urls":[Ljava/lang/String;
    :cond_1
    const v23, 0x7f0800c8

    move/from16 v0, v23

    invoke-virtual {v14, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Landroid/widget/TextView;

    const/16 v24, 0x8

    invoke-virtual/range {v23 .. v24}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 812
    .restart local v4    # "carpet":I
    .restart local v8    # "carpetView":Landroid/view/View;
    .restart local v9    # "carpets":[I
    .restart local v21    # "texts":[I
    .restart local v22    # "urls":[Ljava/lang/String;
    :cond_2
    aget-object v23, v12, v20

    aget v23, v23, v4

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v23

    goto/16 :goto_3

    .line 831
    .end local v8    # "carpetView":Landroid/view/View;
    :cond_3
    new-instance v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v14}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$11;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V

    const-wide/16 v24, 0x1

    move-object/from16 v0, v23

    move-wide/from16 v1, v24

    invoke-virtual {v14, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 747
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_0

    .line 854
    .end local v4    # "carpet":I
    .end local v9    # "carpets":[I
    .end local v14    # "lob":Landroid/view/View;
    .end local v21    # "texts":[I
    .end local v22    # "urls":[Ljava/lang/String;
    :cond_4
    new-instance v23, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$12;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;

    .line 904
    return-void

    .line 700
    :array_0
    .array-data 4
        0x7f0800c0
        0x7f0800c1
        0x7f0800c2
    .end array-data

    .line 701
    :array_1
    .array-data 4
        0x7f0200cd
        0x7f0200ce
        0x7f0200ca
    .end array-data

    .line 703
    :array_2
    .array-data 4
        0x7f0900a6
        0x7f0900a7
        0x7f0900a8
    .end array-data

    .line 705
    :array_3
    .array-data 4
        0x0
        0x0
        0x7f0900a9
    .end array-data

    .line 707
    :array_4
    .array-data 4
        0x7f0200c5
        0x7f0200c8
        0x7f0200c3
    .end array-data

    :array_5
    .array-data 4
        0x7f0200c6
        0x7f0200c4
        0x7f0200c3
    .end array-data

    :array_6
    .array-data 4
        0x7f0200c0
        0x7f0200c4
        0x7f0200c7
    .end array-data

    .line 714
    :array_7
    .array-data 4
        0x7f0900ad
        0x7f0900ae
        0x7f0900af
    .end array-data

    :array_8
    .array-data 4
        0x7f0900b0
        0x7f0900b1
        0x7f0900b2
    .end array-data

    :array_9
    .array-data 4
        0x7f0900b3
        0x7f0900b4
        0x7f0900b5
    .end array-data

    .line 723
    :array_a
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_b
    .array-data 4
        0x7f09013b
        0x7f09013e
        0x0
    .end array-data

    :array_c
    .array-data 4
        0x7f09013c
        0x0
        0x7f09013d
    .end array-data

    .line 734
    :array_d
    .array-data 4
        0x7f08007b
        0x7f08007c
        0x7f08007d
    .end array-data

    .line 735
    :array_e
    .array-data 4
        0x7f0900aa
        0x7f0900ab
        0x7f0900ac
    .end array-data

    .line 737
    :array_f
    .array-data 4
        0x7f0200be
        0x7f0200a8
        0x7f0200bd
    .end array-data
.end method

.method private setupMenuList()V
    .locals 4

    .prologue
    .line 907
    const v0, 0x7f0800b0

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    .line 908
    new-instance v0, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/MenuAdapter;-><init>(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/util/List;)V

    sput-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    .line 911
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->adapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 913
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuList:Landroid/widget/ListView;

    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$13;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 943
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->setSignOut(Z)V

    .line 944
    return-void
.end method

.method private solidify()V
    .locals 2

    .prologue
    .line 476
    const-string v0, "cof_appInstallTime"

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 477
    return-void
.end method

.method private switchContactUs()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1575
    const v0, 0x7f080039

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1576
    const v0, 0x7f08003d

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1578
    const v0, 0x7f080045

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1579
    const v0, 0x7f080024

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1580
    const v0, 0x7f08009c

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1582
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->initializeContactUs()V

    .line 1584
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->showBackButton()V

    .line 1586
    const v0, 0x7f0800a2

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1587
    return-void
.end method


# virtual methods
.method public carpetClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1369
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v1, "Clicked on a carpet!"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1370
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 1371
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    .line 1372
    new-instance v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;

    invoke-direct {v0, p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$21;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1379
    return-void
.end method

.method public clearLastCarpet()V
    .locals 1

    .prologue
    .line 1602
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 1603
    return-void
.end method

.method public dialNumber(Ljava/lang/String;)V
    .locals 5
    .param p1, "number"    # Ljava/lang/String;

    .prologue
    .line 1608
    if-eqz p1, :cond_0

    .line 1610
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Clicked a number link: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1611
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.DIAL"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1612
    .local v1, "intent":Landroid/content/Intent;
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1615
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1620
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 1616
    .restart local v1    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 1617
    .local v0, "anf":Landroid/content/ActivityNotFoundException;
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNotFound()V

    goto :goto_0
.end method

.method public getAppHeader()Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
    .locals 1

    .prologue
    .line 2271
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    return-object v0
.end method

.method public getAppView()Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 1357
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    return-object v0
.end method

.method public getLastCarpet()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1361
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    return-object v0
.end method

.method public getLastLob()I
    .locals 1

    .prologue
    .line 947
    iget v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    return v0
.end method

.method public getMaskedUserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2275
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->maskedUserName:Ljava/lang/String;

    return-object v0
.end method

.method public getMenuItems()Ljava/util/List;
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
    .line 2051
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->menuItems:Ljava/util/List;

    return-object v0
.end method

.method public getPatternValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2283
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->patternValue:Ljava/lang/String;

    return-object v0
.end method

.method public handleLob(Landroid/view/View;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1263
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearLastCarpet()V

    .line 1264
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleLobHelper(Landroid/view/View;)V

    .line 1265
    return-void
.end method

.method public handleLobHelper(Landroid/view/View;)V
    .locals 9
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v8, 0x7f090108

    const v7, 0x7f090107

    const/16 v6, 0x8

    .line 1194
    const v3, 0x7f0800a3

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_0

    .line 1195
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "in handleLob: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p1}, Landroid/view/View;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1196
    const v3, 0x7f08009d

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1197
    const v3, 0x7f0800a1

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1199
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v0

    .line 1200
    .local v0, "cover":Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollX()I

    move-result v3

    if-nez v3, :cond_1

    .line 1201
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 1260
    .end local v0    # "cover":Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    :cond_0
    :goto_0
    return-void

    .line 1202
    .restart local v0    # "cover":Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    :cond_1
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetLast()Z

    move-result v3

    if-nez v3, :cond_0

    .line 1203
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    .line 1204
    const-string v1, ""

    .line 1205
    .local v1, "header":Ljava/lang/String;
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "lastLob: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1206
    iget v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    packed-switch v3, :pswitch_data_0

    .line 1232
    :goto_1
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    .line 1234
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "lastCarpet:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1235
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->nextCarpet:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 1236
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->nextCarpet:Ljava/lang/String;

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 1238
    :cond_2
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->nextCarpet:Ljava/lang/String;

    .line 1239
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 1240
    const/4 v2, -0x1

    .line 1241
    .local v2, "loc":I
    :cond_3
    iget v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    add-int/lit8 v2, v2, 0x1

    aget v4, v4, v2

    if-ne v3, v4, :cond_3

    .line 1243
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->carpetActions:[[Ljava/lang/String;

    aget-object v3, v3, v2

    const/4 v4, 0x0

    aget-object v3, v3, v4

    iput-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 1246
    .end local v2    # "loc":I
    :cond_4
    iget-object v3, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v3, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setText(Ljava/lang/String;)V

    .line 1247
    const v3, 0x7f0800ae

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1248
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "lastLOB: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1249
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getWebUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f090100

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-super {p0, v3}, Lcom/worklight/androidgap/WLDroidGap;->loadUrl(Ljava/lang/String;)V

    .line 1250
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->showRelContainer()V

    .line 1251
    new-instance v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;

    invoke-direct {v3, p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V

    invoke-virtual {v0, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    .line 1208
    :pswitch_0
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v4, "setting card lob"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1211
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearAllMenuItems()V

    .line 1212
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1213
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0900a3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1215
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetHeader()V

    goto/16 :goto_1

    .line 1218
    :pswitch_1
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v4, "setting bank lob"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1219
    invoke-static {}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->clearAllMenuItems()V

    .line 1220
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticWrite(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1221
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0900a4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1223
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetHeader()V

    goto/16 :goto_1

    .line 1226
    :pswitch_2
    sget-object v3, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v4, "setting 360 lob"

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1227
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0900a5

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1228
    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetHeader(Z)V

    goto/16 :goto_1

    .line 1206
    nop

    :pswitch_data_0
    .packed-switch 0x7f08007f
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public handleNavigation(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1063
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "in handleNavigation: view "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1064
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hasBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1066
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleBackPressed(Z)Z

    .line 1072
    :goto_0
    return-void

    .line 1070
    :cond_0
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNavigationSideMenu(Landroid/view/View;)V

    goto :goto_0
.end method

.method public hideBackButton()V
    .locals 2

    .prologue
    .line 1132
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 1133
    return-void
.end method

.method public initializeContactUs()V
    .locals 1

    .prologue
    .line 1590
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hasContactUsBeenInitialized:Z

    if-nez v0, :cond_0

    .line 1592
    invoke-static {p0}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->getInstance(Landroid/app/Activity;)Lcom/EnterpriseMobileBanking/ContactUsHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->initContactUs()V

    .line 1594
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hasContactUsBeenInitialized:Z

    .line 1596
    :cond_0
    return-void
.end method

.method public isSplashSuppress()Z
    .locals 1

    .prologue
    .line 154
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mSplashSuppress:Z

    return v0
.end method

.method protected loadMobileConfig(Ljava/lang/String;Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 11
    .param p1, "fname"    # Ljava/lang/String;
    .param p2, "ctx"    # Landroid/content/Context;

    .prologue
    .line 284
    const/4 v4, 0x0

    .line 286
    .local v4, "jObj":Lorg/json/JSONObject;
    const/4 v2, 0x0

    .line 288
    .local v2, "in":Ljava/io/InputStream;
    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 289
    .end local v2    # "in":Ljava/io/InputStream;
    .local v3, "in":Ljava/io/InputStream;
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v7

    new-array v0, v7, [B

    .line 290
    .local v0, "data":[B
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    .line 291
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 293
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V

    .line 294
    .local v6, "str":Ljava/lang/String;
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "loadMobileConfig: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 301
    .end local v4    # "jObj":Lorg/json/JSONObject;
    .local v5, "jObj":Lorg/json/JSONObject;
    if-eqz v3, :cond_0

    .line 302
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    move-object v2, v3

    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    move-object v4, v5

    .line 307
    .end local v0    # "data":[B
    .end local v5    # "jObj":Lorg/json/JSONObject;
    .end local v6    # "str":Ljava/lang/String;
    .restart local v4    # "jObj":Lorg/json/JSONObject;
    :cond_1
    :goto_0
    return-object v4

    .line 303
    .end local v2    # "in":Ljava/io/InputStream;
    .end local v4    # "jObj":Lorg/json/JSONObject;
    .restart local v0    # "data":[B
    .restart local v3    # "in":Ljava/io/InputStream;
    .restart local v5    # "jObj":Lorg/json/JSONObject;
    .restart local v6    # "str":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 304
    .local v1, "e":Ljava/io/IOException;
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error closing: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v3

    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    move-object v4, v5

    .line 306
    .end local v5    # "jObj":Lorg/json/JSONObject;
    .restart local v4    # "jObj":Lorg/json/JSONObject;
    goto :goto_0

    .line 296
    .end local v0    # "data":[B
    .end local v1    # "e":Ljava/io/IOException;
    .end local v6    # "str":Ljava/lang/String;
    :catch_1
    move-exception v1

    .line 297
    .local v1, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_3
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error reading config file "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 301
    if-eqz v2, :cond_1

    .line 302
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 303
    :catch_2
    move-exception v1

    .line 304
    .local v1, "e":Ljava/io/IOException;
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Error closing: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 300
    .end local v1    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v7

    .line 301
    :goto_2
    if-eqz v2, :cond_2

    .line 302
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 305
    :cond_2
    :goto_3
    throw v7

    .line 303
    :catch_3
    move-exception v1

    .line 304
    .restart local v1    # "e":Ljava/io/IOException;
    sget-object v8, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Error closing: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " : "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 300
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    :catchall_1
    move-exception v7

    move-object v2, v3

    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    goto :goto_2

    .line 296
    .end local v2    # "in":Ljava/io/InputStream;
    .restart local v3    # "in":Ljava/io/InputStream;
    :catch_4
    move-exception v1

    move-object v2, v3

    .end local v3    # "in":Ljava/io/InputStream;
    .restart local v2    # "in":Ljava/io/InputStream;
    goto :goto_1
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 1145
    invoke-super {p0, p1, p2, p3}, Lcom/worklight/androidgap/WLDroidGap;->onActivityResult(IILandroid/content/Intent;)V

    .line 1147
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EMB onActivityResult(requestCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1149
    const/16 v0, 0x4d2

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_2

    .line 1150
    const-string v0, "mypattern"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1151
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v1, "EMB mypattern is not null"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1152
    const-string v0, "mypattern"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setPatternValue(Ljava/lang/String;)V

    .line 1154
    :cond_0
    const-string v0, "maskedUserName"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1155
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v1, "EMB maskedUserName is not null"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1156
    const-string v0, "maskedUserName"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setMaskedUserName(Ljava/lang/String;)V

    .line 1159
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSplashSuppress(Z)V

    .line 1161
    :cond_2
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    .prologue
    .line 1165
    invoke-super {p0}, Lcom/worklight/androidgap/WLDroidGap;->onAttachedToWindow()V

    .line 1166
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebView;->getRootView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1167
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;

    invoke-direct {v1, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$18;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lorg/apache/cordova/CordovaWebView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1189
    return-void
.end method

.method public onClickCallNumber(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1622
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 1624
    .local v0, "tag":Ljava/lang/Object;
    if-eqz v0, :cond_0

    .line 1626
    check-cast v0, Ljava/lang/String;

    .end local v0    # "tag":Ljava/lang/Object;
    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->dialNumber(Ljava/lang/String;)V

    .line 1628
    :cond_0
    return-void
.end method

.method public onClickEmail(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1631
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    .line 1633
    .local v3, "tag":Ljava/lang/Object;
    if-eqz v3, :cond_0

    move-object v1, v3

    .line 1634
    check-cast v1, Ljava/lang/String;

    .line 1635
    .local v1, "email":Ljava/lang/String;
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Clicked an email link: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1636
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.SEND"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1637
    .local v2, "intent":Landroid/content/Intent;
    const v4, 0x7f090104

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1638
    const-string v4, "android.intent.extra.EMAIL"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 1640
    const-string v4, "android.intent.extra.SUBJECT"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1641
    const-string v4, "android.intent.extra.TEXT"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1642
    const/high16 v4, 0x10000000

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1645
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1650
    .end local v1    # "email":Ljava/lang/String;
    .end local v2    # "intent":Landroid/content/Intent;
    :cond_0
    :goto_0
    return-void

    .line 1646
    .restart local v1    # "email":Ljava/lang/String;
    .restart local v2    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 1647
    .local v0, "anf":Landroid/content/ActivityNotFoundException;
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNotFound()V

    goto :goto_0
.end method

.method public onClickSocialLink(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v13, 0x0

    .line 1653
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    .line 1655
    .local v6, "tag":Ljava/lang/Object;
    if-eqz v6, :cond_0

    move-object v8, v6

    .line 1656
    check-cast v8, Ljava/lang/String;

    .line 1657
    .local v8, "tagString":Ljava/lang/String;
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Clicked a social link: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1659
    if-eqz v8, :cond_0

    .line 1660
    const/4 v7, 0x0

    .line 1663
    .local v7, "tagJSON":Lorg/json/JSONObject;
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .end local v7    # "tagJSON":Lorg/json/JSONObject;
    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1669
    .restart local v7    # "tagJSON":Lorg/json/JSONObject;
    const-string v10, "app"

    invoke-virtual {v7, v10, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1670
    .local v1, "app":Ljava/lang/String;
    const-string v10, "web"

    invoke-virtual {v7, v10, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1671
    .local v9, "web":Ljava/lang/String;
    if-nez v1, :cond_1

    if-nez v9, :cond_1

    .line 1672
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v11, "Invalid tag found on click!"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1705
    .end local v1    # "app":Ljava/lang/String;
    .end local v7    # "tagJSON":Lorg/json/JSONObject;
    .end local v8    # "tagString":Ljava/lang/String;
    .end local v9    # "web":Ljava/lang/String;
    :cond_0
    :goto_0
    return-void

    .line 1664
    .restart local v8    # "tagString":Ljava/lang/String;
    :catch_0
    move-exception v4

    .line 1665
    .local v4, "e":Lorg/json/JSONException;
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 1666
    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v11, "Tag is not JSON data!"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1674
    .end local v4    # "e":Lorg/json/JSONException;
    .restart local v1    # "app":Ljava/lang/String;
    .restart local v7    # "tagJSON":Lorg/json/JSONObject;
    .restart local v9    # "web":Ljava/lang/String;
    :cond_1
    const/4 v5, 0x0

    .line 1676
    .local v5, "handled":Z
    const/4 v2, 0x0

    .line 1677
    .local v2, "appIntent":Landroid/content/Intent;
    if-eqz v1, :cond_3

    .line 1679
    :try_start_1
    new-instance v3, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v3, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1681
    .end local v2    # "appIntent":Landroid/content/Intent;
    .local v3, "appIntent":Landroid/content/Intent;
    const/high16 v10, 0x10000000

    :try_start_2
    invoke-virtual {v3, v10}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1682
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_4

    .line 1683
    const/4 v5, 0x1

    .line 1688
    :goto_1
    if-nez v5, :cond_2

    if-eqz v9, :cond_2

    .line 1690
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v2, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1692
    .end local v3    # "appIntent":Landroid/content/Intent;
    .restart local v2    # "appIntent":Landroid/content/Intent;
    const/high16 v10, 0x10000000

    :try_start_4
    invoke-virtual {v2, v10}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1693
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1694
    const/4 v5, 0x1

    .line 1699
    :goto_2
    if-nez v5, :cond_0

    .line 1700
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNotFound()V

    goto :goto_0

    .line 1684
    :catch_1
    move-exception v0

    .line 1685
    .local v0, "anf":Landroid/content/ActivityNotFoundException;
    :goto_3
    const/4 v5, 0x0

    move-object v3, v2

    .end local v2    # "appIntent":Landroid/content/Intent;
    .restart local v3    # "appIntent":Landroid/content/Intent;
    goto :goto_1

    .line 1695
    .end local v0    # "anf":Landroid/content/ActivityNotFoundException;
    :catch_2
    move-exception v0

    move-object v2, v3

    .line 1696
    .end local v3    # "appIntent":Landroid/content/Intent;
    .restart local v0    # "anf":Landroid/content/ActivityNotFoundException;
    .restart local v2    # "appIntent":Landroid/content/Intent;
    :goto_4
    const/4 v5, 0x0

    goto :goto_2

    .line 1695
    .end local v0    # "anf":Landroid/content/ActivityNotFoundException;
    :catch_3
    move-exception v0

    goto :goto_4

    .line 1684
    .end local v2    # "appIntent":Landroid/content/Intent;
    .restart local v3    # "appIntent":Landroid/content/Intent;
    :catch_4
    move-exception v0

    move-object v2, v3

    .end local v3    # "appIntent":Landroid/content/Intent;
    .restart local v2    # "appIntent":Landroid/content/Intent;
    goto :goto_3

    .end local v2    # "appIntent":Landroid/content/Intent;
    .restart local v3    # "appIntent":Landroid/content/Intent;
    :cond_2
    move-object v2, v3

    .end local v3    # "appIntent":Landroid/content/Intent;
    .restart local v2    # "appIntent":Landroid/content/Intent;
    goto :goto_2

    :cond_3
    move-object v3, v2

    .end local v2    # "appIntent":Landroid/content/Intent;
    .restart local v3    # "appIntent":Landroid/content/Intent;
    goto :goto_1
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 1715
    invoke-static {p0}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->getInstance(Landroid/app/Activity;)Lcom/EnterpriseMobileBanking/ContactUsHelper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 339
    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setRequestedOrientation(I)V

    .line 341
    invoke-static {p0}, Lcom/EnterpriseMobileBanking/AppHelper;->setApplicationLink(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    .line 343
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget v7, v7, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v7, v7, 0x2

    if-eqz v7, :cond_3

    move v5, v8

    .line 344
    .local v5, "isDebuggable":Z
    :goto_0
    invoke-static {v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->setDebug(Z)V

    .line 346
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->isNewApp()Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "cof_appInstallTime"

    invoke-static {v7}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->contains(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "cof_appInstallTime"

    const-string v10, ""

    invoke-static {v7, v10}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    :cond_0
    move v3, v8

    .line 349
    .local v3, "firstTime":Z
    :goto_1
    if-eqz v3, :cond_1

    .line 350
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->obliterate()V

    .line 353
    :cond_1
    new-instance v4, Ljava/lang/Thread;

    new-instance v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;

    invoke-direct {v7, p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$3;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Z)V

    invoke-direct {v4, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 370
    .local v4, "hangOn":Ljava/lang/Thread;
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->anims:[Landroid/view/animation/Animation;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    const v11, 0x7f040005

    invoke-static {v10, v11}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v10

    aput-object v10, v7, v9

    .line 372
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->anims:[Landroid/view/animation/Animation;

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    const v11, 0x7f040006

    invoke-static {v10, v11}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v10

    aput-object v10, v7, v8

    .line 375
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 379
    new-instance v2, Landroid/content/IntentFilter;

    const-string v7, "android.intent.action.SCREEN_ON"

    invoke-direct {v2, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 380
    .local v2, "filter":Landroid/content/IntentFilter;
    const-string v7, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v2, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 381
    new-instance v0, Lcom/EnterpriseMobileBanking/ScreenReceiver;

    invoke-direct {v0}, Lcom/EnterpriseMobileBanking/ScreenReceiver;-><init>()V

    .line 382
    .local v0, "aReceiver":Landroid/content/BroadcastReceiver;
    invoke-virtual {p0, v0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 396
    invoke-super {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->onCreate(Landroid/os/Bundle;)V

    .line 399
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->initConfigParameters()V

    .line 402
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->root:Landroid/widget/LinearLayout;

    invoke-virtual {v7}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewManager;

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->root:Landroid/widget/LinearLayout;

    invoke-interface {v7, v10}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 404
    const v7, 0x7f030013

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setContentView(I)V

    .line 406
    new-instance v7, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    sget-object v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->quickNavButtons:Ljava/util/ArrayList;

    invoke-direct {v7, v10}, Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;-><init>(Ljava/util/ArrayList;)V

    sput-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->navjsi:Lcom/EnterpriseMobileBanking/Plugins/QuickNavJSI;

    .line 408
    const v7, 0x7f08009b

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    iput-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->root:Landroid/widget/LinearLayout;

    .line 409
    const v7, 0x7f0800a0

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lorg/apache/cordova/CordovaWebView;

    iput-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 412
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->addJSInterfaces(Lorg/apache/cordova/CordovaWebView;)V

    .line 414
    iget-object v7, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    const v10, 0x7f090132

    invoke-virtual {p0, v10}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Lorg/apache/cordova/CordovaWebView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 417
    const-string v7, "SP_EULA_IS_ACCEPTED_VERSION"

    const-string v10, ""

    invoke-static {v7, v10}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->appVersion()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 418
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->initEula()V

    .line 427
    :goto_2
    sput-boolean v8, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->created:Z

    .line 428
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->solidify()V

    .line 430
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    const-string v8, "always_finish_activities"

    invoke-static {v7, v8, v9}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v6

    .line 431
    .local v6, "value":I
    sget-object v7, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "ALWAYS_FINISH_ACTIVITIES IS: "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    if-eqz v6, :cond_2

    .line 434
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v8, 0x7f09014f

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    const v8, 0x7f090150

    new-instance v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$5;

    invoke-direct {v10, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$5;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v7, v8, v10}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    const v8, 0x7f090151

    new-instance v10, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$4;

    invoke-direct {v10, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$4;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    invoke-virtual {v7, v8, v10}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    invoke-virtual {v7, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 462
    :cond_2
    return-void

    .end local v0    # "aReceiver":Landroid/content/BroadcastReceiver;
    .end local v2    # "filter":Landroid/content/IntentFilter;
    .end local v3    # "firstTime":Z
    .end local v4    # "hangOn":Ljava/lang/Thread;
    .end local v5    # "isDebuggable":Z
    .end local v6    # "value":I
    :cond_3
    move v5, v9

    .line 343
    goto/16 :goto_0

    .restart local v5    # "isDebuggable":Z
    :cond_4
    move v3, v9

    .line 346
    goto/16 :goto_1

    .line 422
    .restart local v0    # "aReceiver":Landroid/content/BroadcastReceiver;
    .restart local v2    # "filter":Landroid/content/IntentFilter;
    .restart local v3    # "firstTime":Z
    .restart local v4    # "hangOn":Ljava/lang/Thread;
    :cond_5
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->finishOnCreate()V

    .line 423
    const v7, 0x7f0800a3

    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 424
    .local v1, "eulaLayout":Landroid/view/View;
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewManager;

    invoke-interface {v7, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    goto :goto_2
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1
    .param p1, "menu"    # Landroid/view/ContextMenu;
    .param p2, "v"    # Landroid/view/View;
    .param p3, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;

    .prologue
    .line 1709
    invoke-super {p0, p1, p2, p3}, Lcom/worklight/androidgap/WLDroidGap;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 1711
    invoke-static {p0}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->getInstance(Landroid/app/Activity;)Lcom/EnterpriseMobileBanking/ContactUsHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/EnterpriseMobileBanking/ContactUsHelper;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)Z

    .line 1712
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 2370
    const/4 v0, 0x1

    return v0
.end method

.method public onGripperClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1382
    invoke-direct {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getScrollParent(Landroid/view/View;)Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    move-result-object v0

    .line 1383
    .local v0, "cover":Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
    new-instance v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;

    invoke-direct {v1, p0, p1, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$22;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->post(Ljava/lang/Runnable;)Z

    .line 1421
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 4
    .param p1, "v"    # Landroid/view/View;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x1

    .line 2042
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v3, "onKey"

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2043
    const/4 v2, 0x4

    if-ne p2, v2, :cond_1

    move v0, v1

    .line 2044
    .local v0, "handled":Z
    :goto_0
    if-eqz v0, :cond_0

    .line 2045
    invoke-direct {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleBackPressed(Z)Z

    move-result v0

    .line 2047
    :cond_0
    return v0

    .line 2043
    .end local v0    # "handled":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const v3, 0x7f080024

    .line 2017
    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v2, "onKeyDown"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2018
    const/4 v0, 0x0

    .line 2021
    .local v0, "handled":Z
    const/16 v1, 0x52

    if-ne p1, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hasMenu()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 2026
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getNavButton()Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNavigation(Landroid/view/View;)V

    .line 2027
    const/4 v0, 0x1

    .line 2037
    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    .end local v0    # "handled":Z
    :goto_1
    return v0

    .line 2028
    .restart local v0    # "handled":Z
    :cond_1
    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 2030
    const/4 v0, 0x1

    .line 2031
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/AppRelContainer;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/AppRelContainer;->isAnimating()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2032
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleBackPressed(Z)Z

    goto :goto_0

    .line 2037
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/worklight/androidgap/WLDroidGap;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 2102
    invoke-super {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->onNewIntent(Landroid/content/Intent;)V

    .line 2103
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setIntent(Landroid/content/Intent;)V

    .line 2104
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 2105
    return-void
.end method

.method public onPause()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 2085
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v1

    check-cast v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->setmAppWebViewDisplayBlocked(Z)V

    .line 2086
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    invoke-virtual {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setAppHeaderDisabled(Z)V

    .line 2089
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v1}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v0

    .line 2091
    .local v0, "sm":Lcom/capitalone/mobile/banking/session/SessionManager;
    if-eqz v0, :cond_0

    invoke-static {}, Lcom/EnterpriseMobileBanking/ScreenReceiver;->getScreenFlag()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/session/SessionManager;->isTimeoutScheduled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2092
    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v2, "Display off..."

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2093
    invoke-virtual {v0}, Lcom/capitalone/mobile/banking/session/SessionManager;->saveTime()V

    .line 2097
    :cond_0
    invoke-super {p0}, Lcom/worklight/androidgap/WLDroidGap;->onPause()V

    .line 2098
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 2375
    const/4 v0, 0x1

    return v0
.end method

.method public onReceivedError(ILjava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "errorCode"    # I
    .param p2, "description"    # Ljava/lang/String;
    .param p3, "failingUrl"    # Ljava/lang/String;

    .prologue
    .line 2294
    move-object v3, p0

    .line 2295
    .local v3, "me":Lorg/apache/cordova/DroidGap;
    sget-object v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ERROR: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2296
    const-string v5, "errorUrl"

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Lorg/apache/cordova/DroidGap;->getStringProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2297
    .local v2, "errorUrl":Ljava/lang/String;
    if-eqz v2, :cond_2

    const-string v5, "file://"

    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_0
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 2299
    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;

    invoke-direct {v5, p0, v3, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$31;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lorg/apache/cordova/DroidGap;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lorg/apache/cordova/DroidGap;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2363
    :cond_1
    :goto_0
    return-void

    .line 2326
    :cond_2
    invoke-static {p3}, Lcom/EnterpriseMobileBanking/Plugins/Components/WebViewClient;->getTrimedUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/EnterpriseMobileBanking/AppHelper;->getURLAttributes(Ljava/lang/String;)Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;

    move-result-object v0

    .line 2327
    .local v0, "attr":Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;
    if-eqz v0, :cond_4

    .line 2329
    sget-object v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "************** attr.getMode() "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " *********************"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2330
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "quiet"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2332
    sget-object v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "QUIET MODE DETECTED - NO REPORTING: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2335
    :cond_3
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->getMode()Ljava/lang/String;

    move-result-object v5

    const-string v6, "rewards"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 2337
    monitor-enter v0

    .line 2339
    const/4 v5, 0x1

    :try_start_0
    invoke-virtual {v0, v5}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->setTimedOut(Z)V

    .line 2340
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->cancelTimer()V

    .line 2341
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2342
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Utils/WebViewHelper;->handleError()V

    goto/16 :goto_0

    .line 2341
    :catchall_0
    move-exception v5

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 2348
    :cond_4
    const/4 v1, 0x0

    .line 2349
    .local v1, "bPreloadFlag":Z
    const-string v4, "preload.aspx"

    .line 2351
    .local v4, "preloadToken":Ljava/lang/String;
    if-eqz p3, :cond_5

    .line 2352
    const-string v5, "preload.aspx"

    invoke-virtual {p3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    .line 2355
    :cond_5
    if-eqz v1, :cond_1

    .line 2356
    sget-object v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ERROR: Rewards preload detected: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public onResume()V
    .locals 9

    .prologue
    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 2112
    sget-boolean v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplication()Landroid/app/Application;

    move-result-object v4

    check-cast v4, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/session/SessionManager;->isTimeoutScheduled()Z

    move-result v4

    if-nez v4, :cond_3

    sget-boolean v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isThirdPartyTimer:Z

    if-nez v4, :cond_3

    .line 2114
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4, v8}, Lorg/apache/cordova/CordovaWebView;->setVisibility(I)V

    .line 2120
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4}, Lorg/apache/cordova/CordovaWebView;->clearView()V

    .line 2121
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    const-string v5, "about:blank"

    invoke-virtual {v4, v5}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 2123
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "cof.flag_return_to_login"

    invoke-virtual {v4, v5, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2125
    :cond_0
    const-string v4, "app.returnToLogin(\'\', \'timeout\');"

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 2126
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "cof.flag_return_to_login"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 2129
    :cond_1
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v4, v7}, Lorg/apache/cordova/CordovaWebView;->setVisibility(I)V

    .line 2143
    :cond_2
    :goto_0
    const v4, 0x7f080013

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 2145
    .local v3, "splash":Landroid/view/View;
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isSplashSuppress()Z

    move-result v4

    if-nez v4, :cond_4

    .line 2146
    new-instance v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$27;

    invoke-direct {v4, p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$27;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V

    const-wide/16 v6, 0x3e8

    invoke-virtual {v3, v4, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2162
    :goto_1
    iget v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    if-nez v4, :cond_5

    .line 2164
    const/4 v1, 0x0

    .local v1, "row":I
    :goto_2
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    array-length v4, v4

    if-ge v1, v4, :cond_5

    .line 2165
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lobRow:[I

    aget v4, v4, v1

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2166
    .local v0, "lob":Landroid/view/View;
    new-instance v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$28;

    invoke-direct {v4, p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$28;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Landroid/view/View;)V

    const-wide/16 v6, 0x1

    invoke-virtual {v0, v4, v6, v7}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2164
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 2134
    .end local v0    # "lob":Landroid/view/View;
    .end local v1    # "row":I
    .end local v3    # "splash":Landroid/view/View;
    :cond_3
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getApplication()Landroid/app/Application;

    move-result-object v4

    check-cast v4, Lcom/capitalone/mobile/banking/app/Application;

    invoke-virtual {v4}, Lcom/capitalone/mobile/banking/app/Application;->getSessionManager()Lcom/capitalone/mobile/banking/session/SessionManager;

    move-result-object v2

    .line 2135
    .local v2, "sm":Lcom/capitalone/mobile/banking/session/SessionManager;
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Onresume: isTimeoutScheduled: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/session/SessionManager;->isTimeoutScheduled()Z

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2136
    if-eqz v2, :cond_2

    sget-boolean v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/session/SessionManager;->isTimeoutScheduled()Z

    move-result v4

    if-eqz v4, :cond_2

    sget-boolean v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->isThirdPartyTimer:Z

    if-nez v4, :cond_2

    .line 2137
    sget-object v4, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v5, "Display back on..."

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2138
    invoke-virtual {v2}, Lcom/capitalone/mobile/banking/session/SessionManager;->restartTimer()V

    goto :goto_0

    .line 2154
    .end local v2    # "sm":Lcom/capitalone/mobile/banking/session/SessionManager;
    .restart local v3    # "splash":Landroid/view/View;
    :cond_4
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2156
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSplashSuppress(Z)V

    goto :goto_1

    .line 2193
    :cond_5
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getAppView()Landroid/webkit/WebView;

    move-result-object v4

    check-cast v4, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;

    invoke-virtual {v4}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppWebView;->ismAppWebViewDisplayBlocked()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 2195
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$29;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    const-wide/16 v6, 0x6d6

    invoke-virtual {v4, v5, v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2214
    :cond_6
    invoke-super {p0}, Lcom/worklight/androidgap/WLDroidGap;->onResume()V

    .line 2226
    iget-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    new-instance v5, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$30;

    invoke-direct {v5, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$30;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    const-wide/16 v6, 0x2328

    invoke-virtual {v4, v5, v6, v7}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2238
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "icicle"    # Landroid/os/Bundle;

    .prologue
    .line 279
    invoke-super {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 280
    const-string v0, "param"

    const-wide/32 v2, -0x21524111

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 281
    return-void
.end method

.method public onSignOut(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1053
    const v1, 0x7f080024

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/EnterpriseMobileBanking/AppRelContainer;

    .line 1054
    .local v0, "container":Lcom/EnterpriseMobileBanking/AppRelContainer;
    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/AppRelContainer;->getLeft()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1055
    invoke-virtual {p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleNavigation(Landroid/view/View;)V

    .line 1058
    :cond_0
    const-string v1, "lobDidRequestLogout();"

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    .line 1060
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 2079
    const v0, 0x7f080013

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2080
    invoke-super {p0}, Lcom/worklight/androidgap/WLDroidGap;->onStop()V

    .line 2081
    return-void
.end method

.method public resetTransiteView()V
    .locals 3

    .prologue
    const v2, 0x7f0800a1

    .line 1327
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1328
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    const v1, 0x7f0900a2

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1329
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1330
    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090132

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1332
    return-void
.end method

.method public returnToHome(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 1278
    sget-boolean v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->authenticated:Z

    if-eqz v0, :cond_0

    .line 1279
    const-string v0, ""

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/AppHelper;->promptForLogout(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    :goto_0
    return-void

    .line 1281
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->root:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->accRunner:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    .line 1283
    sget-object v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v1, "returnToHome"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1284
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebView;->stopLoading()V

    .line 1291
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebView;->clearView()V

    .line 1293
    iput v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastLob:I

    .line 1294
    iput-object v4, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 1295
    if-eqz p1, :cond_1

    .line 1296
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/AppHelper;->setNavigationEnabled(Z)V

    .line 1298
    :cond_1
    invoke-super {p0}, Lcom/worklight/androidgap/WLDroidGap;->cancelLoadUrl()V

    .line 1299
    const v0, 0x7f0900a2

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->loadUrl(Ljava/lang/String;)V

    .line 1300
    const-string v0, "busyIndicator.hide();"

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/AppHelper;->sendJavascript(Ljava/lang/String;)V

    .line 1301
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->hideKeyboard()V

    .line 1302
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->closeLOBs:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1303
    const v0, 0x7f08009d

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1304
    const v0, 0x7f0800a2

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1306
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetTransiteView()V

    .line 1307
    const v0, 0x7f080024

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1308
    const v0, 0x7f08009c

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1309
    if-eqz p1, :cond_2

    .line 1310
    new-instance v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$20;

    invoke-direct {v0, p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$20;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1318
    :cond_2
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    .line 1319
    invoke-direct {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->resetHeader()V

    .line 1320
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    .line 1321
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceHide()V

    goto :goto_0
.end method

.method public sendJavascript(Ljava/lang/String;)V
    .locals 5
    .param p1, "statement"    # Ljava/lang/String;

    .prologue
    .line 2252
    const v2, 0x7f090106

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2254
    const-string v2, "\'"

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v1, v2, 0x1

    .line 2255
    .local v1, "start":I
    const-string v2, "\'"

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 2256
    .local v0, "hash":Ljava/lang/String;
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Hash: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 2257
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2259
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getTransiteView()Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/TransiteWebView;->setVisibility(I)V

    .line 2262
    .end local v0    # "hash":Ljava/lang/String;
    .end local v1    # "start":I
    :cond_0
    invoke-super {p0, p1}, Lcom/worklight/androidgap/WLDroidGap;->sendJavascript(Ljava/lang/String;)V

    .line 2263
    return-void
.end method

.method public setLastItem(Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V
    .locals 1
    .param p1, "item"    # Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;

    .prologue
    .line 2055
    new-instance v0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;

    invoke-direct {v0, p0, p1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$26;-><init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lcom/EnterpriseMobileBanking/Plugins/Components/MenuItem;)V

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2075
    return-void
.end method

.method public setMaskedUserName(Ljava/lang/String;)V
    .locals 0
    .param p1, "maskedUserName"    # Ljava/lang/String;

    .prologue
    .line 2279
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->maskedUserName:Ljava/lang/String;

    .line 2280
    return-void
.end method

.method public setNextCarpet(Ljava/lang/String;)V
    .locals 0
    .param p1, "nextCarpet"    # Ljava/lang/String;

    .prologue
    .line 1365
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->nextCarpet:Ljava/lang/String;

    .line 1366
    return-void
.end method

.method public setPatternValue(Ljava/lang/String;)V
    .locals 0
    .param p1, "patternValue"    # Ljava/lang/String;

    .prologue
    .line 2287
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->patternValue:Ljava/lang/String;

    .line 2288
    return-void
.end method

.method public setSelectedMenuItem(I)V
    .locals 1
    .param p1, "menuItemResId"    # I

    .prologue
    .line 952
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->setSelectedMenuItem(Ljava/lang/String;)V

    .line 953
    return-void
.end method

.method public setSplashSuppress(Z)V
    .locals 0
    .param p1, "splSuppress"    # Z

    .prologue
    .line 158
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mSplashSuppress:Z

    .line 159
    return-void
.end method

.method public showBackButton()V
    .locals 2

    .prologue
    .line 1140
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->mAppHeader:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 1141
    return-void
.end method

.method public switchATM(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v4, 0x7f0900a2

    const/4 v3, 0x1

    .line 1495
    sget-object v1, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    const-string v2, "in switchAtm"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1497
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v1}, Lorg/apache/cordova/CordovaWebView;->stopLoading()V

    .line 1498
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 1499
    const v1, 0x7f0800a1

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 1500
    .local v0, "transite":Landroid/webkit/WebView;
    const v1, 0x7f090132

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1501
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 1502
    invoke-virtual {p0, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1503
    const/4 v1, 0x0

    invoke-virtual {p0, p1, v3, v3, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    .line 1504
    return-void
.end method

.method public switchATM(Landroid/view/View;ZZLjava/lang/String;)V
    .locals 9
    .param p1, "v"    # Landroid/view/View;
    .param p2, "showBack"    # Z
    .param p3, "loadAsNewUrl"    # Z
    .param p4, "url"    # Ljava/lang/String;

    .prologue
    const v8, 0x7f0800a1

    const v7, 0x7f08009e

    const v6, 0x7f0900b6

    const/4 v5, 0x0

    .line 1507
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "in switchATM: showBack: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1509
    const/4 v0, 0x0

    .line 1510
    .local v0, "showTabs":Z
    if-nez p1, :cond_0

    .line 1511
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 1512
    const/4 v0, 0x1

    .line 1515
    :cond_0
    if-eqz p2, :cond_2

    .line 1516
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->showBackButton()V

    .line 1522
    :goto_0
    const v2, 0x7f08009f

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setSelected(Z)V

    .line 1523
    invoke-virtual {p0, v7}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setSelected(Z)V

    .line 1525
    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    .line 1526
    .local v1, "transite":Landroid/webkit/WebView;
    const v2, 0x7f090132

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1527
    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 1528
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaWebView;->stopLoading()V

    .line 1529
    if-eqz p3, :cond_4

    .line 1531
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 1556
    :goto_1
    const v2, 0x7f080024

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1557
    const v2, 0x7f08009c

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1558
    if-eqz v0, :cond_1

    .line 1560
    const v2, 0x7f08009d

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1562
    :cond_1
    return-void

    .line 1519
    .end local v1    # "transite":Landroid/webkit/WebView;
    :cond_2
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    goto :goto_0

    .line 1533
    .restart local v1    # "transite":Landroid/webkit/WebView;
    :pswitch_0
    invoke-virtual {v1}, Landroid/webkit/WebView;->stopLoading()V

    .line 1534
    const-string v2, "SP_ATM_CAP360_ATM_LOCATOR"

    invoke-virtual {p0, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-le v2, v3, :cond_3

    .line 1535
    const-string v2, "SP_ATM_CAP360_ATM_LOCATOR"

    invoke-virtual {p0, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1541
    :goto_2
    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 1539
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SP_ATM_CAP360_ATM_LOCATOR"

    invoke-virtual {p0, v6}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/EnterpriseMobileBanking/Plugins/NativeCache;->staticRead(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "?site_preference=MOBILE&capability_preference=CONTAINER"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 1544
    :pswitch_1
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->COF_ATM_URI:Ljava/lang/String;

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->lastCarpet:Ljava/lang/String;

    .line 1545
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getWebUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const v3, 0x7f090100

    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-super {p0, v2}, Lcom/worklight/androidgap/WLDroidGap;->loadUrl(Ljava/lang/String;)V

    .line 1546
    const v2, 0x7f0900a2

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1552
    :cond_4
    sget-object v2, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sending javascript: window.location.hash=\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\';"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/EnterpriseMobileBanking/Utils/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 1553
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "window.location.hash=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\';"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->sendJavascript(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1531
    :pswitch_data_0
    .packed-switch 0x7f08009e
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public switchProducts(Z)V
    .locals 9
    .param p1, "showBack"    # Z

    .prologue
    const v8, 0x7f0800a1

    const/16 v7, 0x8

    const/4 v6, 0x0

    .line 1458
    if-eqz p1, :cond_0

    .line 1459
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->showBackButton()V

    .line 1464
    :goto_0
    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/webkit/WebView;

    .line 1465
    .local v4, "transite":Landroid/webkit/WebView;
    const v5, 0x7f090132

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1467
    iget-object v5, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v5}, Lorg/apache/cordova/CordovaWebView;->stopLoading()V

    .line 1470
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1473
    .local v1, "outsideLinksArray":Lorg/json/JSONArray;
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    const v5, 0x7f09011c

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v1    # "outsideLinksArray":Lorg/json/JSONArray;
    .local v2, "outsideLinksArray":Lorg/json/JSONArray;
    move-object v1, v2

    .line 1478
    .end local v2    # "outsideLinksArray":Lorg/json/JSONArray;
    .restart local v1    # "outsideLinksArray":Lorg/json/JSONArray;
    :goto_1
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/WebViewLinker;->setOutsideAppList(Lorg/json/JSONArray;)V

    .line 1480
    invoke-static {v4}, Lcom/EnterpriseMobileBanking/AppHelper;->fixupUserAgentString(Landroid/webkit/WebView;)V

    .line 1484
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->getProductsUri()Ljava/lang/String;

    move-result-object v3

    .line 1485
    .local v3, "productsName":Ljava/lang/String;
    invoke-virtual {v4, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1487
    invoke-virtual {p0, v8}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1488
    const v5, 0x7f080024

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1489
    const v5, 0x7f08009c

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1490
    const v5, 0x7f0800a2

    invoke-virtual {p0, v5}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1491
    return-void

    .line 1461
    .end local v1    # "outsideLinksArray":Lorg/json/JSONArray;
    .end local v3    # "productsName":Ljava/lang/String;
    .end local v4    # "transite":Landroid/webkit/WebView;
    :cond_0
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->hideBackButton()V

    goto :goto_0

    .line 1474
    .restart local v1    # "outsideLinksArray":Lorg/json/JSONArray;
    .restart local v4    # "transite":Landroid/webkit/WebView;
    :catch_0
    move-exception v0

    .line 1475
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method
