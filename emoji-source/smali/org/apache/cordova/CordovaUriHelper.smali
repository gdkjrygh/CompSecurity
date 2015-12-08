.class Lorg/apache/cordova/CordovaUriHelper;
.super Ljava/lang/Object;
.source "CordovaUriHelper.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "CordovaUriHelper"


# instance fields
.field private appView:Lorg/apache/cordova/CordovaWebView;

.field private cordova:Lorg/apache/cordova/CordovaInterface;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0
    .param p1, "cdv"    # Lorg/apache/cordova/CordovaInterface;
    .param p2, "webView"    # Lorg/apache/cordova/CordovaWebView;

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p2, p0, Lorg/apache/cordova/CordovaUriHelper;->appView:Lorg/apache/cordova/CordovaWebView;

    .line 39
    iput-object p1, p0, Lorg/apache/cordova/CordovaUriHelper;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 40
    return-void
.end method


# virtual methods
.method shouldOverrideUrlLoading(Lorg/xwalk/core/XWalkView;Ljava/lang/String;)Z
    .locals 6
    .param p1, "view"    # Lorg/xwalk/core/XWalkView;
    .param p2, "url"    # Ljava/lang/String;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xf
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 53
    iget-object v3, p0, Lorg/apache/cordova/CordovaUriHelper;->appView:Lorg/apache/cordova/CordovaWebView;

    iget-object v3, v3, Lorg/apache/cordova/CordovaWebView;->pluginManager:Lorg/apache/cordova/PluginManager;

    invoke-virtual {v3, p2}, Lorg/apache/cordova/PluginManager;->onOverrideUrlLoading(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 85
    :cond_0
    :goto_0
    return v2

    .line 58
    :cond_1
    const-string v3, "file://"

    invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "data:"

    invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    or-int/2addr v3, v4

    if-eqz v3, :cond_2

    .line 62
    const-string v2, "app_webview"

    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    goto :goto_0

    .line 64
    :cond_2
    iget-object v3, p0, Lorg/apache/cordova/CordovaUriHelper;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v3}, Lorg/apache/cordova/CordovaWebView;->getWhitelist()Lorg/apache/cordova/Whitelist;

    move-result-object v3

    invoke-virtual {v3, p2}, Lorg/apache/cordova/Whitelist;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 66
    const/4 v2, 0x0

    goto :goto_0

    .line 68
    :cond_3
    iget-object v3, p0, Lorg/apache/cordova/CordovaUriHelper;->appView:Lorg/apache/cordova/CordovaWebView;

    invoke-virtual {v3}, Lorg/apache/cordova/CordovaWebView;->getExternalWhitelist()Lorg/apache/cordova/Whitelist;

    move-result-object v3

    invoke-virtual {v3, p2}, Lorg/apache/cordova/Whitelist;->isUrlWhiteListed(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 71
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 72
    .local v1, "intent":Landroid/content/Intent;
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 73
    const-string v3, "android.intent.category.BROWSABLE"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 75
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xf

    if-lt v3, v4, :cond_4

    .line 76
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setSelector(Landroid/content/Intent;)V

    .line 78
    :cond_4
    iget-object v3, p0, Lorg/apache/cordova/CordovaUriHelper;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v3}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 80
    .end local v1    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 81
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const-string v3, "CordovaUriHelper"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error loading url "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v0}, Lorg/apache/cordova/LOG;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
