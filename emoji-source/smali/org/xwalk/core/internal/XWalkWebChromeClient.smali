.class public Lorg/xwalk/core/internal/XWalkWebChromeClient;
.super Ljava/lang/Object;
.source "XWalkWebChromeClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;
    }
.end annotation


# instance fields
.field private XWALK_MAX_QUOTA:J

.field private mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

.field private mContext:Landroid/content/Context;

.field private mCustomViewCallback:Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

.field private mCustomXWalkView:Landroid/view/View;

.field private mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 2
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    .line 46
    const-wide/32 v0, 0x6400000

    iput-wide v0, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->XWALK_MAX_QUOTA:J

    .line 49
    invoke-virtual {p1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContext:Landroid/content/Context;

    .line 50
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 51
    return-void
.end method


# virtual methods
.method public getVisitedHistory(Landroid/webkit/ValueCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/ValueCallback",
            "<[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 271
    .local p1, "callback":Landroid/webkit/ValueCallback;, "Landroid/webkit/ValueCallback<[Ljava/lang/String;>;"
    return-void
.end method

.method public onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "lineNumber"    # I
    .param p3, "sourceID"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 253
    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 3
    .param p1, "consoleMessage"    # Landroid/webkit/ConsoleMessage;

    .prologue
    .line 263
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    move-result v1

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lorg/xwalk/core/internal/XWalkWebChromeClient;->onConsoleMessage(Ljava/lang/String;ILjava/lang/String;)V

    .line 265
    const/4 v0, 0x0

    return v0
.end method

.method public onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "databaseIdentifier"    # Ljava/lang/String;
    .param p3, "quota"    # J
    .param p5, "estimatedDatabaseSize"    # J
    .param p7, "totalQuota"    # J
    .param p9, "quotaUpdater"    # Landroid/webkit/WebStorage$QuotaUpdater;

    .prologue
    .line 172
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->XWALK_MAX_QUOTA:J

    invoke-interface {p9, v0, v1}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 173
    return-void
.end method

.method public onGeolocationPermissionsHidePrompt()V
    .locals 0

    .prologue
    .line 227
    return-void
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;)V
    .locals 2
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "callback"    # Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;

    .prologue
    .line 218
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v0, v1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 219
    return-void
.end method

.method public onHideCustomView()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 123
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v2}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 125
    .local v0, "activity":Landroid/app/Activity;
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomXWalkView:Landroid/view/View;

    if-eqz v2, :cond_0

    if-nez v0, :cond_1

    .line 138
    :cond_0
    :goto_0
    return-void

    .line 127
    :cond_1
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v2, :cond_2

    .line 128
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/XWalkContentsClient;->onToggleFullscreen(Z)V

    .line 132
    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 133
    .local v1, "decor":Landroid/widget/FrameLayout;
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomXWalkView:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 134
    iget-object v2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomViewCallback:Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    invoke-interface {v2}, Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 136
    iput-object v4, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomXWalkView:Landroid/view/View;

    .line 137
    iput-object v4, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomViewCallback:Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    goto :goto_0
.end method

.method public onJsTimeout()Z
    .locals 1

    .prologue
    .line 240
    const/4 v0, 0x1

    return v0
.end method

.method public onReachedMaxAppCacheSize(JJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 2
    .param p1, "requiredStorage"    # J
    .param p3, "quota"    # J
    .param p5, "quotaUpdater"    # Landroid/webkit/WebStorage$QuotaUpdater;

    .prologue
    .line 200
    iget-wide v0, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->XWALK_MAX_QUOTA:J

    invoke-interface {p5, v0, v1}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 201
    return-void
.end method

.method public onReceivedIcon(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;
    .param p2, "icon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 62
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;ILorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V
    .locals 0
    .param p1, "view"    # Landroid/view/View;
    .param p2, "requestedOrientation"    # I
    .param p3, "callback"    # Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .prologue
    .line 116
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;)V
    .locals 5
    .param p1, "view"    # Landroid/view/View;
    .param p2, "callback"    # Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .prologue
    const/4 v4, -0x1

    .line 84
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mXWalkView:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-virtual {v1}, Lorg/xwalk/core/internal/XWalkViewInternal;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 86
    .local v0, "activity":Landroid/app/Activity;
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomXWalkView:Landroid/view/View;

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    .line 87
    :cond_0
    invoke-interface {p2}, Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 104
    :goto_0
    return-void

    .line 91
    :cond_1
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomXWalkView:Landroid/view/View;

    .line 92
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mCustomViewCallback:Lorg/xwalk/core/internal/XWalkWebChromeClient$CustomViewCallback;

    .line 94
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    if-eqz v1, :cond_2

    .line 95
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/xwalk/core/internal/XWalkContentsClient;->onToggleFullscreen(Z)V

    .line 99
    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v2, v4, v4, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, p1, v2}, Landroid/view/Window;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method setContentsClient(Lorg/xwalk/core/internal/XWalkContentsClient;)V
    .locals 0
    .param p1, "client"    # Lorg/xwalk/core/internal/XWalkContentsClient;

    .prologue
    .line 54
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkWebChromeClient;->mContentsClient:Lorg/xwalk/core/internal/XWalkContentsClient;

    .line 55
    return-void
.end method

.method public setInstallableWebApp()V
    .locals 0

    .prologue
    .line 278
    return-void
.end method

.method public setupAutoFill(Landroid/os/Message;)V
    .locals 0
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 288
    return-void
.end method
