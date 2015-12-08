.class public Lorg/apache/cordova/CordovaWebView;
.super Lorg/xwalk/core/XWalkView;
.source "CordovaWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/CordovaWebView$ActivityResult;
    }
.end annotation


# static fields
.field public static final CORDOVA_VERSION:Ljava/lang/String; = "3.6.3"

.field static final COVER_SCREEN_GRAVITY_CENTER:Landroid/widget/FrameLayout$LayoutParams;

.field public static final TAG:Ljava/lang/String; = "CordovaWebView"


# instance fields
.field private boundKeyCodes:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field bridge:Lorg/apache/cordova/CordovaBridge;

.field private chromeClient:Lorg/apache/cordova/CordovaChromeClient;

.field private cordova:Lorg/apache/cordova/CordovaInterface;

.field private externalWhitelist:Lorg/apache/cordova/Whitelist;

.field private internalWhitelist:Lorg/apache/cordova/Whitelist;

.field private lastMenuEventTime:J

.field loadUrlTimeout:I

.field loadedUrl:Ljava/lang/String;

.field private paused:Z

.field public pluginManager:Lorg/apache/cordova/PluginManager;

.field private preferences:Lorg/apache/cordova/CordovaPreferences;

.field private receiver:Landroid/content/BroadcastReceiver;

.field private resourceApi:Lorg/apache/cordova/CordovaResourceApi;

.field viewClient:Lorg/apache/cordova/CordovaWebViewClient;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x1

    .line 115
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x11

    invoke-direct {v0, v3, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    sput-object v0, Lorg/apache/cordova/CordovaWebView;->COVER_SCREEN_GRAVITY_CENTER:Landroid/widget/FrameLayout$LayoutParams;

    .line 890
    const-string v0, "enable-javascript"

    invoke-static {v0, v2}, Lorg/xwalk/core/XWalkPreferences;->setValue(Ljava/lang/String;Z)V

    .line 892
    const-string v0, "javascript-can-open-window"

    invoke-static {v0, v2}, Lorg/xwalk/core/XWalkPreferences;->setValue(Ljava/lang/String;Z)V

    .line 894
    const-string v0, "allow-universal-access-from-file"

    invoke-static {v0, v2}, Lorg/xwalk/core/XWalkPreferences;->setValue(Ljava/lang/String;Z)V

    .line 896
    const-string v0, "support-multiple-windows"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/xwalk/core/XWalkPreferences;->setValue(Ljava/lang/String;Z)V

    .line 897
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 122
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/CordovaWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 123
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 126
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/XWalkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/cordova/CordovaWebView;->lastMenuEventTime:J

    .line 127
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 131
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/XWalkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/cordova/CordovaWebView;->lastMenuEventTime:J

    .line 132
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I
    .param p4, "privateBrowsing"    # Z
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 137
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/XWalkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    .line 86
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/cordova/CordovaWebView;->lastMenuEventTime:J

    .line 138
    return-void
.end method

.method static synthetic access$000(Lorg/apache/cordova/CordovaWebView;)Lorg/apache/cordova/CordovaInterface;
    .locals 1
    .param p0, "x0"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 67
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    return-object v0
.end method

.method private exposeJsInterface()V
    .locals 2

    .prologue
    .line 268
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    .line 269
    const-string v0, "CordovaWebView"

    const-string v1, "Disabled addJavascriptInterface() bridge since Android version is old."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    :goto_0
    return-void

    .line 275
    :cond_0
    new-instance v0, Lorg/apache/cordova/ExposedJsApi;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-direct {v0, v1}, Lorg/apache/cordova/ExposedJsApi;-><init>(Lorg/apache/cordova/CordovaBridge;)V

    const-string v1, "_cordovaNative"

    invoke-virtual {p0, v0, v1}, Lorg/apache/cordova/CordovaWebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private initIfNecessary()V
    .locals 8

    .prologue
    .line 170
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-nez v0, :cond_1

    .line 171
    const-string v0, "CordovaWebView"

    const-string v2, "CordovaWebView.init() was not called. This will soon be required."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lorg/apache/cordova/CordovaInterface;

    .line 174
    .local v1, "cdv":Lorg/apache/cordova/CordovaInterface;
    invoke-static {}, Lorg/apache/cordova/Config;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/cordova/Config;->init(Landroid/app/Activity;)V

    .line 177
    :cond_0
    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebView;->makeWebViewClient(Lorg/apache/cordova/CordovaInterface;)Lorg/apache/cordova/CordovaWebViewClient;

    move-result-object v2

    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebView;->makeWebChromeClient(Lorg/apache/cordova/CordovaInterface;)Lorg/apache/cordova/CordovaChromeClient;

    move-result-object v3

    invoke-static {}, Lorg/apache/cordova/Config;->getPluginEntries()Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lorg/apache/cordova/Config;->getWhitelist()Lorg/apache/cordova/Whitelist;

    move-result-object v5

    invoke-static {}, Lorg/apache/cordova/Config;->getExternalWhitelist()Lorg/apache/cordova/Whitelist;

    move-result-object v6

    invoke-static {}, Lorg/apache/cordova/Config;->getPreferences()Lorg/apache/cordova/CordovaPreferences;

    move-result-object v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lorg/apache/cordova/CordovaWebView;->init(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebViewClient;Lorg/apache/cordova/CordovaChromeClient;Ljava/util/List;Lorg/apache/cordova/Whitelist;Lorg/apache/cordova/Whitelist;Lorg/apache/cordova/CordovaPreferences;)V

    .line 179
    .end local v1    # "cdv":Lorg/apache/cordova/CordovaInterface;
    :cond_1
    return-void
.end method

.method private initWebViewSettings()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 185
    invoke-virtual {p0, v4}, Lorg/apache/cordova/CordovaWebView;->setVerticalScrollBarEnabled(Z)V

    .line 187
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->shouldRequestFocusOnInit()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 188
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->requestFocusFromTouch()Z

    .line 209
    :cond_0
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "database"

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 216
    .local v1, "databasePath":Ljava/lang/String;
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 217
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    iget v2, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    .line 218
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->enableRemoteDebugging()V

    .line 240
    :cond_1
    return-void
.end method


# virtual methods
.method public backHistory()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 527
    invoke-super {p0}, Lorg/xwalk/core/XWalkView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v1

    invoke-virtual {v1}, Lorg/xwalk/core/XWalkNavigationHistory;->canGoBack()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 528
    invoke-super {p0}, Lorg/xwalk/core/XWalkView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v1

    sget-object v2, Lorg/xwalk/core/XWalkNavigationHistory$Direction;->BACKWARD:Lorg/xwalk/core/XWalkNavigationHistory$Direction;

    invoke-virtual {v1, v2, v0}, Lorg/xwalk/core/XWalkNavigationHistory;->navigate(Lorg/xwalk/core/XWalkNavigationHistory$Direction;I)V

    .line 531
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bindButton(IZZ)V
    .locals 0
    .param p1, "keyCode"    # I
    .param p2, "keyDown"    # Z
    .param p3, "override"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 732
    invoke-virtual {p0, p1, p3}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    .line 733
    return-void
.end method

.method public bindButton(Ljava/lang/String;Z)V
    .locals 1
    .param p1, "button"    # Ljava/lang/String;
    .param p2, "override"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 722
    const-string v0, "volumeup"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 723
    const/16 v0, 0x18

    invoke-virtual {p0, v0, p2}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    .line 728
    :cond_0
    :goto_0
    return-void

    .line 725
    :cond_1
    const-string v0, "volumedown"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 726
    const/16 v0, 0x19

    invoke-virtual {p0, v0, p2}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    goto :goto_0
.end method

.method public bindButton(Z)V
    .locals 1
    .param p1, "override"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 717
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lorg/apache/cordova/CordovaWebView;->setButtonPlumbedToJs(IZ)V

    .line 718
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v3, 0x4

    const/4 v1, 0x1

    .line 646
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-eq v2, v1, :cond_1

    .line 647
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    .line 694
    :cond_0
    :goto_0
    return v1

    .line 649
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 651
    .local v0, "keyCode":I
    if-ne v0, v3, :cond_4

    .line 653
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->hasEnteredFullscreen()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 654
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->leaveFullscreen()V

    goto :goto_0

    .line 659
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/cordova/CordovaWebView;->isButtonPlumbedToJs(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 660
    const-string v2, "javascript:cordova.fireDocumentEvent(\'backbutton\');"

    invoke-virtual {p0, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 665
    :cond_3
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->backHistory()Z

    move-result v2

    if-nez v2, :cond_0

    .line 673
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 674
    const/4 v1, 0x0

    goto :goto_0

    .line 680
    :cond_4
    const/16 v2, 0x52

    if-ne v0, v2, :cond_6

    .line 681
    iget-wide v2, p0, Lorg/apache/cordova/CordovaWebView;->lastMenuEventTime:J

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-gez v1, :cond_5

    .line 682
    const-string v1, "javascript:cordova.fireDocumentEvent(\'menubutton\');"

    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 684
    :cond_5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, p0, Lorg/apache/cordova/CordovaWebView;->lastMenuEventTime:J

    .line 685
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_0

    .line 688
    :cond_6
    const/16 v2, 0x54

    if-ne v0, v2, :cond_7

    .line 689
    const-string v2, "javascript:cordova.fireDocumentEvent(\'searchbutton\');"

    invoke-virtual {p0, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 694
    :cond_7
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_0
.end method

.method public enableRemoteDebugging()V
    .locals 2

    .prologue
    .line 254
    const-string v0, "remote-debugging"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/xwalk/core/XWalkPreferences;->setValue(Ljava/lang/String;Z)V

    .line 255
    return-void
.end method

.method public getExternalWhitelist()Lorg/apache/cordova/Whitelist;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->externalWhitelist:Lorg/apache/cordova/Whitelist;

    return-object v0
.end method

.method public getPreferences()Lorg/apache/cordova/CordovaPreferences;
    .locals 1

    .prologue
    .line 885
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->preferences:Lorg/apache/cordova/CordovaPreferences;

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "defaultValue"    # Ljava/lang/String;

    .prologue
    .line 590
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 591
    .local v0, "bundle":Landroid/os/Bundle;
    if-nez v0, :cond_1

    .line 599
    .end local p2    # "defaultValue":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p2

    .line 594
    .restart local p2    # "defaultValue":Ljava/lang/String;
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 595
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 596
    .local v1, "p":Ljava/lang/Object;
    if-eqz v1, :cond_0

    .line 599
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method public getResourceApi()Lorg/apache/cordova/CordovaResourceApi;
    .locals 1

    .prologue
    .line 881
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->resourceApi:Lorg/apache/cordova/CordovaResourceApi;

    return-object v0
.end method

.method public getWebChromeClient()Lorg/apache/cordova/CordovaChromeClient;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->chromeClient:Lorg/apache/cordova/CordovaChromeClient;

    return-object v0
.end method

.method public getWhitelist()Lorg/apache/cordova/Whitelist;
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    return-object v0
.end method

.method public hadKeyEvent()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 834
    const/4 v0, 0x0

    return v0
.end method

.method public handleDestroy()V
    .locals 4

    .prologue
    .line 795
    const-string v1, "javascript:try{cordova.require(\'cordova/channel\').onDestroy.fire();}catch(e){console.log(\'exception firing destroy event from native\');};"

    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 798
    const-string v1, "about:blank"

    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 801
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v1, :cond_0

    .line 802
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v1}, Lorg/apache/cordova/PluginManager;->onDestroy()V

    .line 806
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->receiver:Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_1

    .line 808
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/CordovaWebView;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 813
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->onDestroy()V

    .line 814
    return-void

    .line 809
    :catch_0
    move-exception v0

    .line 810
    .local v0, "e":Ljava/lang/Exception;
    const-string v1, "CordovaWebView"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error unregistering configuration receiver: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public handlePause(Z)V
    .locals 2
    .param p1, "keepRunning"    # Z

    .prologue
    .line 759
    const-string v0, "CordovaWebView"

    const-string v1, "Handle the pause"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    const-string v0, "javascript:try{cordova.fireDocumentEvent(\'pause\');}catch(e){console.log(\'exception firing pause event from native\');};"

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 764
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v0, :cond_0

    .line 765
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/PluginManager;->onPause(Z)V

    .line 769
    :cond_0
    if-nez p1, :cond_1

    .line 771
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->pauseTimersForReal()V

    .line 773
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebView;->paused:Z

    .line 775
    return-void
.end method

.method public handleResume(ZZ)V
    .locals 1
    .param p1, "keepRunning"    # Z
    .param p2, "activityResultKeepRunning"    # Z

    .prologue
    .line 780
    const-string v0, "javascript:try{cordova.fireDocumentEvent(\'resume\');}catch(e){console.log(\'exception firing resume event from native\');};"

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 783
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v0, :cond_0

    .line 784
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/PluginManager;->onResume(Z)V

    .line 788
    :cond_0
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->resumeTimers()V

    .line 789
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebView;->paused:Z

    .line 790
    return-void
.end method

.method public init(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebViewClient;Lorg/apache/cordova/CordovaChromeClient;Ljava/util/List;Lorg/apache/cordova/Whitelist;Lorg/apache/cordova/Whitelist;Lorg/apache/cordova/CordovaPreferences;)V
    .locals 3
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "webViewClient"    # Lorg/apache/cordova/CordovaWebViewClient;
    .param p3, "webChromeClient"    # Lorg/apache/cordova/CordovaChromeClient;
    .param p5, "internalWhitelist"    # Lorg/apache/cordova/Whitelist;
    .param p6, "externalWhitelist"    # Lorg/apache/cordova/Whitelist;
    .param p7, "preferences"    # Lorg/apache/cordova/CordovaPreferences;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/cordova/CordovaInterface;",
            "Lorg/apache/cordova/CordovaWebViewClient;",
            "Lorg/apache/cordova/CordovaChromeClient;",
            "Ljava/util/List",
            "<",
            "Lorg/apache/cordova/PluginEntry;",
            ">;",
            "Lorg/apache/cordova/Whitelist;",
            "Lorg/apache/cordova/Whitelist;",
            "Lorg/apache/cordova/CordovaPreferences;",
            ")V"
        }
    .end annotation

    .prologue
    .line 144
    .local p4, "pluginEntries":Ljava/util/List;, "Ljava/util/List<Lorg/apache/cordova/PluginEntry;>;"
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    if-eqz v0, :cond_0

    .line 145
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 147
    :cond_0
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 148
    iput-object p2, p0, Lorg/apache/cordova/CordovaWebView;->viewClient:Lorg/apache/cordova/CordovaWebViewClient;

    .line 149
    iput-object p3, p0, Lorg/apache/cordova/CordovaWebView;->chromeClient:Lorg/apache/cordova/CordovaChromeClient;

    .line 150
    iput-object p5, p0, Lorg/apache/cordova/CordovaWebView;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    .line 151
    iput-object p6, p0, Lorg/apache/cordova/CordovaWebView;->externalWhitelist:Lorg/apache/cordova/Whitelist;

    .line 152
    iput-object p7, p0, Lorg/apache/cordova/CordovaWebView;->preferences:Lorg/apache/cordova/CordovaPreferences;

    .line 156
    invoke-super {p0, p2}, Lorg/xwalk/core/XWalkView;->setResourceClient(Lorg/xwalk/core/XWalkResourceClient;)V

    .line 157
    invoke-super {p0, p3}, Lorg/xwalk/core/XWalkView;->setUIClient(Lorg/xwalk/core/XWalkUIClient;)V

    .line 159
    new-instance v0, Lorg/apache/cordova/PluginManager;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-direct {v0, p0, v1, p4}, Lorg/apache/cordova/PluginManager;-><init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;Ljava/util/List;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    .line 160
    new-instance v0, Lorg/apache/cordova/CordovaBridge;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    new-instance v2, Lorg/apache/cordova/NativeToJsMessageQueue;

    invoke-direct {v2, p0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue;-><init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaInterface;)V

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/CordovaBridge;-><init>(Lorg/apache/cordova/PluginManager;Lorg/apache/cordova/NativeToJsMessageQueue;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    .line 161
    new-instance v0, Lorg/apache/cordova/CordovaResourceApi;

    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/CordovaResourceApi;-><init>(Landroid/content/Context;Lorg/apache/cordova/PluginManager;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebView;->resourceApi:Lorg/apache/cordova/CordovaResourceApi;

    .line 163
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    const-string v1, "App"

    const-string v2, "org.apache.cordova.App"

    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/PluginManager;->addService(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-direct {p0}, Lorg/apache/cordova/CordovaWebView;->initWebViewSettings()V

    .line 165
    invoke-direct {p0}, Lorg/apache/cordova/CordovaWebView;->exposeJsInterface()V

    .line 166
    return-void
.end method

.method public isBackButtonBound()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 738
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaWebView;->isButtonPlumbedToJs(I)Z

    move-result v0

    return v0
.end method

.method public isButtonPlumbedToJs(I)Z
    .locals 2
    .param p1, "keyCode"    # I

    .prologue
    .line 743
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isPaused()Z
    .locals 1

    .prologue
    .line 829
    iget-boolean v0, p0, Lorg/apache/cordova/CordovaWebView;->paused:Z

    return v0
.end method

.method public load(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "content"    # Ljava/lang/String;

    .prologue
    .line 320
    const-string v0, "about:blank"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "javascript:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrlNow(Ljava/lang/String;)V

    .line 326
    :goto_0
    return-void

    .line 324
    :cond_1
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 329
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/apache/cordova/CordovaWebView;->load(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    return-void
.end method

.method public loadUrl(Ljava/lang/String;I)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "time"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 341
    if-nez p1, :cond_0

    .line 343
    invoke-static {}, Lorg/apache/cordova/Config;->getStartUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;)V

    .line 349
    :goto_0
    return-void

    .line 347
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public loadUrlIntoView(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 352
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;Z)V

    .line 353
    return-void
.end method

.method public loadUrlIntoView(Ljava/lang/String;I)V
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "time"    # I

    .prologue
    .line 440
    const-string v0, "javascript:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xwalk/core/XWalkNavigationHistory;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 453
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrlIntoView(Ljava/lang/String;)V

    .line 454
    return-void

    .line 446
    :cond_1
    const-string v0, "CordovaWebView"

    const-string v1, "loadUrlIntoView(%s, %d)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    const-string v0, "splashscreen"

    const-string v1, "show"

    invoke-virtual {p0, v0, v1}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public loadUrlIntoView(Ljava/lang/String;Z)V
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "recreatePlugins"    # Z

    .prologue
    .line 361
    const-string v1, "CordovaWebView"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ">>> loadUrl("

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ")"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    invoke-direct {p0}, Lorg/apache/cordova/CordovaWebView;->initIfNecessary()V

    .line 365
    if-eqz p2, :cond_0

    .line 366
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView;->loadedUrl:Ljava/lang/String;

    .line 367
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v1, :cond_0

    .line 368
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v1}, Lorg/apache/cordova/PluginManager;->init()V

    .line 373
    :cond_0
    move-object v3, p0

    .line 374
    .local v3, "me":Lorg/apache/cordova/CordovaWebView;
    iget v4, v3, Lorg/apache/cordova/CordovaWebView;->loadUrlTimeout:I

    .line 375
    .local v4, "currentLoadUrlTimeout":I
    const-string v1, "LoadUrlTimeoutValue"

    const-string v6, "20000"

    invoke-virtual {p0, v1, v6}, Lorg/apache/cordova/CordovaWebView;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 378
    .local v2, "loadUrlTimeoutValue":I
    new-instance v5, Lorg/apache/cordova/CordovaWebView$1;

    invoke-direct {v5, p0, v3, p1}, Lorg/apache/cordova/CordovaWebView$1;-><init>(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/CordovaWebView;Ljava/lang/String;)V

    .line 389
    .local v5, "loadError":Ljava/lang/Runnable;
    new-instance v0, Lorg/apache/cordova/CordovaWebView$2;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lorg/apache/cordova/CordovaWebView$2;-><init>(Lorg/apache/cordova/CordovaWebView;ILorg/apache/cordova/CordovaWebView;ILjava/lang/Runnable;)V

    .line 407
    .local v0, "timeoutCheck":Ljava/lang/Runnable;
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v6, Lorg/apache/cordova/CordovaWebView$3;

    invoke-direct {v6, p0, v0, v3, p1}, Lorg/apache/cordova/CordovaWebView$3;-><init>(Lorg/apache/cordova/CordovaWebView;Ljava/lang/Runnable;Lorg/apache/cordova/CordovaWebView;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 413
    return-void
.end method

.method loadUrlNow(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 421
    const/4 v0, 0x3

    invoke-static {v0}, Lorg/apache/cordova/LOG;->isLoggable(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "javascript:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    const-string v0, "CordovaWebView"

    const-string v1, ">>> loadUrlNow()"

    invoke-static {v0, v1}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    :cond_0
    const-string v0, "file://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "javascript:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/Whitelist;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 425
    :cond_1
    const/4 v0, 0x0

    invoke-super {p0, p1, v0}, Lorg/xwalk/core/XWalkView;->load(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    :cond_2
    return-void
.end method

.method public makeWebChromeClient(Lorg/apache/cordova/CordovaInterface;)Lorg/apache/cordova/CordovaChromeClient;
    .locals 1
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;

    .prologue
    .line 243
    new-instance v0, Lorg/apache/cordova/CordovaChromeClient;

    invoke-direct {v0, p1, p0}, Lorg/apache/cordova/CordovaChromeClient;-><init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    return-object v0
.end method

.method public makeWebViewClient(Lorg/apache/cordova/CordovaInterface;)Lorg/apache/cordova/CordovaWebViewClient;
    .locals 2
    .param p1, "cordova"    # Lorg/apache/cordova/CordovaInterface;

    .prologue
    .line 247
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 248
    new-instance v0, Lorg/apache/cordova/CordovaWebViewClient;

    invoke-direct {v0, p1, p0}, Lorg/apache/cordova/CordovaWebViewClient;-><init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 250
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/apache/cordova/IceCreamCordovaWebViewClient;

    invoke-direct {v0, p1, p0}, Lorg/apache/cordova/IceCreamCordovaWebViewClient;-><init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 7
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v6, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 605
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 607
    const/16 v2, 0x19

    if-ne p1, v2, :cond_0

    .line 608
    const-string v2, "javascript:cordova.fireDocumentEvent(\'volumedownbutton\');"

    invoke-virtual {p0, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 640
    :goto_0
    return v3

    .line 612
    :cond_0
    const/16 v2, 0x18

    if-ne p1, v2, :cond_1

    .line 613
    const-string v2, "javascript:cordova.fireDocumentEvent(\'volumeupbutton\');"

    invoke-virtual {p0, v2}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 618
    :cond_1
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/XWalkView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    goto :goto_0

    .line 621
    :cond_2
    if-ne p1, v6, :cond_5

    .line 623
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->startOfHistory()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v6}, Lorg/apache/cordova/CordovaWebView;->isButtonPlumbedToJs(I)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    move v2, v3

    :cond_4
    move v3, v2

    goto :goto_0

    .line 625
    :cond_5
    const/16 v4, 0x52

    if-ne p1, v4, :cond_7

    .line 628
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 629
    .local v0, "childView":Landroid/view/View;
    if-eqz v0, :cond_6

    .line 632
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v4}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v4

    const-string v5, "input_method"

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 633
    .local v1, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v4

    invoke-virtual {v1, v4, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 634
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->openOptionsMenu()V

    goto :goto_0

    .line 637
    .end local v1    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_6
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/XWalkView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    goto :goto_0

    .line 640
    .end local v0    # "childView":Landroid/view/View;
    :cond_7
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/XWalkView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    goto :goto_0
.end method

.method public onNewIntent(Landroid/content/Intent;)Z
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 819
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->onNewIntent(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 824
    :goto_0
    return v0

    .line 821
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v0, :cond_1

    .line 822
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/PluginManager;->onNewIntent(Landroid/content/Intent;)V

    .line 824
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onScrollChanged(IIII)V
    .locals 6
    .param p1, "l"    # I
    .param p2, "t"    # I
    .param p3, "oldl"    # I
    .param p4, "oldt"    # I

    .prologue
    .line 464
    invoke-super {p0, p1, p2, p3, p4}, Lorg/xwalk/core/XWalkView;->onScrollChanged(IIII)V

    .line 466
    new-instance v0, Lorg/apache/cordova/ScrollEvent;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lorg/apache/cordova/ScrollEvent;-><init>(IIIILandroid/view/View;)V

    .line 467
    .local v0, "myEvent":Lorg/apache/cordova/ScrollEvent;
    const-string v1, "onScrollChanged"

    invoke-virtual {p0, v1, v0}, Lorg/apache/cordova/CordovaWebView;->postMessage(Ljava/lang/String;Ljava/lang/Object;)V

    .line 468
    return-void
.end method

.method public pauseTimers()V
    .locals 0

    .prologue
    .line 751
    return-void
.end method

.method public pauseTimersForReal()V
    .locals 0

    .prologue
    .line 754
    invoke-super {p0}, Lorg/xwalk/core/XWalkView;->pauseTimers()V

    .line 755
    return-void
.end method

.method public postMessage(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/Object;

    .prologue
    .line 513
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v0, :cond_0

    .line 514
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/PluginManager;->postMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    :cond_0
    return-void
.end method

.method public printBackForwardList()V
    .locals 8

    .prologue
    .line 838
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v0

    .line 839
    .local v0, "currentList":Lorg/xwalk/core/XWalkNavigationHistory;
    invoke-virtual {v0}, Lorg/xwalk/core/XWalkNavigationHistory;->size()I

    move-result v1

    .line 840
    .local v1, "currentSize":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v1, :cond_0

    .line 842
    invoke-virtual {v0, v2}, Lorg/xwalk/core/XWalkNavigationHistory;->getItemAt(I)Lorg/xwalk/core/XWalkNavigationItem;

    move-result-object v3

    .line 843
    .local v3, "item":Lorg/xwalk/core/XWalkNavigationItem;
    invoke-virtual {v3}, Lorg/xwalk/core/XWalkNavigationItem;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 844
    .local v4, "url":Ljava/lang/String;
    const-string v5, "CordovaWebView"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "The URL at index: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " is "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 846
    .end local v3    # "item":Lorg/xwalk/core/XWalkNavigationItem;
    .end local v4    # "url":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public restoreState(Landroid/os/Bundle;)Z
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 867
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->restoreState(Landroid/os/Bundle;)Z

    move-result v0

    .line 868
    .local v0, "result":Z
    const-string v1, "CordovaWebView"

    const-string v2, "WebView restoration crew now restoring!"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 870
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    if-eqz v1, :cond_0

    .line 871
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v1}, Lorg/apache/cordova/PluginManager;->init()V

    .line 873
    :cond_0
    return v0
.end method

.method public sendJavascript(Ljava/lang/String;)V
    .locals 1
    .param p1, "statement"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 492
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaBridge;->getMessageQueue()Lorg/apache/cordova/NativeToJsMessageQueue;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue;->addJavaScript(Ljava/lang/String;)V

    .line 493
    return-void
.end method

.method public sendPluginResult(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V
    .locals 1
    .param p1, "result"    # Lorg/apache/cordova/PluginResult;
    .param p2, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 503
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->bridge:Lorg/apache/cordova/CordovaBridge;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaBridge;->getMessageQueue()Lorg/apache/cordova/NativeToJsMessageQueue;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/NativeToJsMessageQueue;->addPluginResult(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V

    .line 504
    return-void
.end method

.method public setButtonPlumbedToJs(IZ)V
    .locals 3
    .param p1, "keyCode"    # I
    .param p2, "override"    # Z

    .prologue
    .line 698
    sparse-switch p1, :sswitch_data_0

    .line 710
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported keycode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 703
    :sswitch_0
    if-eqz p2, :cond_0

    .line 704
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 708
    :goto_0
    return-void

    .line 706
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->boundKeyCodes:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 698
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x18 -> :sswitch_0
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public setWebChromeClient(Lorg/apache/cordova/CordovaChromeClient;)V
    .locals 0
    .param p1, "client"    # Lorg/apache/cordova/CordovaChromeClient;

    .prologue
    .line 296
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView;->chromeClient:Lorg/apache/cordova/CordovaChromeClient;

    .line 297
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->setUIClient(Lorg/xwalk/core/XWalkUIClient;)V

    .line 298
    return-void
.end method

.method public setWebViewClient(Lorg/apache/cordova/CordovaWebViewClient;)V
    .locals 0
    .param p1, "client"    # Lorg/apache/cordova/CordovaWebViewClient;

    .prologue
    .line 286
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView;->viewClient:Lorg/apache/cordova/CordovaWebViewClient;

    .line 287
    invoke-super {p0, p1}, Lorg/xwalk/core/XWalkView;->setResourceClient(Lorg/xwalk/core/XWalkResourceClient;)V

    .line 288
    return-void
.end method

.method protected shouldRequestFocusOnInit()Z
    .locals 1

    .prologue
    .line 264
    const/4 v0, 0x1

    return v0
.end method

.method public showWebPage(Ljava/lang/String;ZZLjava/util/HashMap;)V
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "openExternal"    # Z
    .param p3, "clearHistory"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 546
    .local p4, "params":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v3, "CordovaWebView"

    const-string v4, "showWebPage(%s, %b, %b, HashMap"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    const/4 v6, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    if-eqz p3, :cond_0

    .line 550
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v3

    invoke-virtual {v3}, Lorg/xwalk/core/XWalkNavigationHistory;->clear()V

    .line 554
    :cond_0
    if-nez p2, :cond_3

    .line 557
    const-string v3, "file://"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lorg/apache/cordova/CordovaWebView;->internalWhitelist:Lorg/apache/cordova/Whitelist;

    invoke-virtual {v3, p1}, Lorg/apache/cordova/Whitelist;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 560
    :cond_1
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebView;->loadUrl(Ljava/lang/String;)V

    .line 580
    :goto_0
    return-void

    .line 564
    :cond_2
    const-string v3, "CordovaWebView"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "showWebPage: Cannot load URL into webview since it is not in white list.  Loading into browser instead. (URL="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/apache/cordova/LOG;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    :cond_3
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 570
    .local v1, "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 571
    .local v2, "uri":Landroid/net/Uri;
    const-string v3, "file"

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 572
    iget-object v3, p0, Lorg/apache/cordova/CordovaWebView;->resourceApi:Lorg/apache/cordova/CordovaResourceApi;

    invoke-virtual {v3, v2}, Lorg/apache/cordova/CordovaResourceApi;->getMimeType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 576
    :goto_1
    iget-object v3, p0, Lorg/apache/cordova/CordovaWebView;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 577
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "uri":Landroid/net/Uri;
    :catch_0
    move-exception v0

    .line 578
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v3, "CordovaWebView"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error loading url "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 574
    .end local v0    # "e":Landroid/content/ActivityNotFoundException;
    .restart local v1    # "intent":Landroid/content/Intent;
    .restart local v2    # "uri":Landroid/net/Uri;
    :cond_4
    :try_start_1
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public startOfHistory()Z
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 852
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getNavigationHistory()Lorg/xwalk/core/XWalkNavigationHistory;

    move-result-object v0

    .line 853
    .local v0, "currentList":Lorg/xwalk/core/XWalkNavigationHistory;
    invoke-virtual {v0, v4}, Lorg/xwalk/core/XWalkNavigationHistory;->getItemAt(I)Lorg/xwalk/core/XWalkNavigationItem;

    move-result-object v2

    .line 854
    .local v2, "item":Lorg/xwalk/core/XWalkNavigationItem;
    if-eqz v2, :cond_0

    .line 855
    invoke-virtual {v2}, Lorg/xwalk/core/XWalkNavigationItem;->getUrl()Ljava/lang/String;

    move-result-object v3

    .line 856
    .local v3, "url":Ljava/lang/String;
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 857
    .local v1, "currentUrl":Ljava/lang/String;
    const-string v4, "CordovaWebView"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "The current URL is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    const-string v4, "CordovaWebView"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "The URL at item 0 is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/apache/cordova/LOG;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 861
    .end local v1    # "currentUrl":Ljava/lang/String;
    .end local v3    # "url":Ljava/lang/String;
    :cond_0
    return v4
.end method

.method public stopLoading()V
    .locals 2

    .prologue
    .line 458
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebView;->chromeClient:Lorg/apache/cordova/CordovaChromeClient;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lorg/apache/cordova/CordovaChromeClient;->isCurrentlyLoading:Z

    .line 459
    invoke-super {p0}, Lorg/xwalk/core/XWalkView;->stopLoading()V

    .line 460
    return-void
.end method

.method public storeResult(IILandroid/content/Intent;)V
    .locals 0
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "intent"    # Landroid/content/Intent;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 878
    return-void
.end method
