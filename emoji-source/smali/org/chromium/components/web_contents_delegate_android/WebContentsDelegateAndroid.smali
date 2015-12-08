.class public Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;
.super Ljava/lang/Object;
.source "WebContentsDelegateAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "web_contents_delegate_android"
.end annotation


# static fields
.field public static final INVALIDATE_TYPE_LOAD:I = 0x4

.field public static final INVALIDATE_TYPE_TAB:I = 0x2

.field public static final INVALIDATE_TYPE_TITLE:I = 0x8

.field public static final INVALIDATE_TYPE_URL:I = 0x1

.field public static final LOG_LEVEL_ERROR:I = 0x3

.field public static final LOG_LEVEL_LOG:I = 0x1

.field public static final LOG_LEVEL_TIP:I = 0x0

.field public static final LOG_LEVEL_WARNING:I = 0x2


# instance fields
.field private mMostRecentProgress:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/16 v0, 0x64

    iput v0, p0, Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;->mMostRecentProgress:I

    return-void
.end method

.method private final notifyLoadProgressChanged(D)V
    .locals 3
    .param p1, "progress"    # D
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 85
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, p1

    double-to-int v0, v0

    iput v0, p0, Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;->mMostRecentProgress:I

    .line 86
    iget v0, p0, Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;->mMostRecentProgress:I

    invoke-virtual {p0, v0}, Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;->onLoadProgressChanged(I)V

    .line 87
    return-void
.end method


# virtual methods
.method public activateContents()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 60
    return-void
.end method

.method public addMessageToConsole(ILjava/lang/String;ILjava/lang/String;)Z
    .locals 1
    .param p1, "level"    # I
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "lineNumber"    # I
    .param p4, "sourceId"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 136
    const/4 v0, 0x0

    return v0
.end method

.method public closeContents()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 64
    return-void
.end method

.method public getMostRecentProgress()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lorg/chromium/components/web_contents_delegate_android/WebContentsDelegateAndroid;->mMostRecentProgress:I

    return v0
.end method

.method public handleKeyboardEvent(Landroid/view/KeyEvent;)V
    .locals 0
    .param p1, "event"    # Landroid/view/KeyEvent;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 122
    return-void
.end method

.method public isFullscreenForTabOrPending()Z
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 153
    const/4 v0, 0x0

    return v0
.end method

.method public navigationStateChanged(I)V
    .locals 0
    .param p1, "flags"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 76
    return-void
.end method

.method public onLoadProgressChanged(I)V
    .locals 0
    .param p1, "progress"    # I

    .prologue
    .line 93
    return-void
.end method

.method public onLoadStarted()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 68
    return-void
.end method

.method public onLoadStopped()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 72
    return-void
.end method

.method public onUpdateUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 111
    return-void
.end method

.method public openNewTab(Ljava/lang/String;Ljava/lang/String;[BIZ)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "extraHeaders"    # Ljava/lang/String;
    .param p3, "postData"    # [B
    .param p4, "disposition"    # I
    .param p5, "isRendererInitiated"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 56
    return-void
.end method

.method public rendererResponsive()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 107
    return-void
.end method

.method public rendererUnresponsive()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 100
    return-void
.end method

.method public showRepostFormWarningDialog(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 0
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 145
    return-void
.end method

.method public takeFocus(Z)Z
    .locals 1
    .param p1, "reverse"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 115
    const/4 v0, 0x0

    return v0
.end method

.method public toggleFullscreenModeForTab(Z)V
    .locals 0
    .param p1, "enterFullscreen"    # Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 149
    return-void
.end method

.method public visibleSSLStateChanged()V
    .locals 0
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 80
    return-void
.end method
