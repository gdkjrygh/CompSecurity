.class public Lorg/chromium/content/browser/DownloadController;
.super Ljava/lang/Object;
.source "DownloadController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "DownloadController"

.field private static sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

.field private static final sInstance:Lorg/chromium/content/browser/DownloadController;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lorg/chromium/content/browser/DownloadController;

    invoke-direct {v0}, Lorg/chromium/content/browser/DownloadController;-><init>()V

    sput-object v0, Lorg/chromium/content/browser/DownloadController;->sInstance:Lorg/chromium/content/browser/DownloadController;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-direct {p0}, Lorg/chromium/content/browser/DownloadController;->nativeInit()V

    .line 48
    return-void
.end method

.method private static downloadDelegateFromView(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/ContentViewDownloadDelegate;
    .locals 1
    .param p0, "view"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    .line 51
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewCore;->getDownloadDelegate()Lorg/chromium/content/browser/ContentViewDownloadDelegate;

    move-result-object v0

    return-object v0
.end method

.method public static getInstance()Lorg/chromium/content/browser/DownloadController;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 43
    sget-object v0, Lorg/chromium/content/browser/DownloadController;->sInstance:Lorg/chromium/content/browser/DownloadController;

    return-object v0
.end method

.method private native nativeInit()V
.end method

.method public static setDownloadNotificationService(Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;)V
    .locals 0
    .param p0, "service"    # Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    .prologue
    .line 55
    sput-object p0, Lorg/chromium/content/browser/DownloadController;->sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    .line 56
    return-void
.end method


# virtual methods
.method public newHttpGetDownload(Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V
    .locals 4
    .param p1, "view"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "userAgent"    # Ljava/lang/String;
    .param p4, "contentDisposition"    # Ljava/lang/String;
    .param p5, "mimeType"    # Ljava/lang/String;
    .param p6, "cookie"    # Ljava/lang/String;
    .param p7, "referer"    # Ljava/lang/String;
    .param p8, "hasUserGesture"    # Z
    .param p9, "filename"    # Ljava/lang/String;
    .param p10, "contentLength"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 69
    invoke-static {p1}, Lorg/chromium/content/browser/DownloadController;->downloadDelegateFromView(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/ContentViewDownloadDelegate;

    move-result-object v0

    .line 71
    .local v0, "downloadDelegate":Lorg/chromium/content/browser/ContentViewDownloadDelegate;
    if-eqz v0, :cond_0

    .line 72
    new-instance v2, Lorg/chromium/content/browser/DownloadInfo$Builder;

    invoke-direct {v2}, Lorg/chromium/content/browser/DownloadInfo$Builder;-><init>()V

    invoke-virtual {v2, p2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setUrl(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p3}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setUserAgent(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p4}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setContentDisposition(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p5}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setMimeType(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p6}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setCookie(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p7}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setReferer(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p8}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setHasUserGesture(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p9}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setFileName(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p10, p11}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setContentLength(J)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setIsGETRequest(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->build()Lorg/chromium/content/browser/DownloadInfo;

    move-result-object v1

    .line 84
    .local v1, "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    invoke-interface {v0, v1}, Lorg/chromium/content/browser/ContentViewDownloadDelegate;->requestHttpGetDownload(Lorg/chromium/content/browser/DownloadInfo;)V

    .line 86
    .end local v1    # "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    :cond_0
    return-void
.end method

.method public onDangerousDownload(Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;I)V
    .locals 1
    .param p1, "view"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "downloadId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 159
    invoke-static {p1}, Lorg/chromium/content/browser/DownloadController;->downloadDelegateFromView(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/ContentViewDownloadDelegate;

    move-result-object v0

    .line 160
    .local v0, "downloadDelegate":Lorg/chromium/content/browser/ContentViewDownloadDelegate;
    if-eqz v0, :cond_0

    .line 161
    invoke-interface {v0, p2, p3}, Lorg/chromium/content/browser/ContentViewDownloadDelegate;->onDangerousDownload(Ljava/lang/String;I)V

    .line 163
    :cond_0
    return-void
.end method

.method public onDownloadCompleted(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZI)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "mimeType"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "path"    # Ljava/lang/String;
    .param p6, "contentLength"    # J
    .param p8, "successful"    # Z
    .param p9, "downloadId"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 111
    sget-object v1, Lorg/chromium/content/browser/DownloadController;->sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    if-eqz v1, :cond_0

    .line 112
    new-instance v1, Lorg/chromium/content/browser/DownloadInfo$Builder;

    invoke-direct {v1}, Lorg/chromium/content/browser/DownloadInfo$Builder;-><init>()V

    invoke-virtual {v1, p2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setUrl(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p3}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setMimeType(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p4}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setFileName(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p5}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setFilePath(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p6, p7}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setContentLength(J)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p8}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setIsSuccessful(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p4}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setDescription(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p9}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setDownloadId(I)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setHasDownloadId(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/chromium/content/browser/DownloadInfo$Builder;->build()Lorg/chromium/content/browser/DownloadInfo;

    move-result-object v0

    .line 123
    .local v0, "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    sget-object v1, Lorg/chromium/content/browser/DownloadController;->sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    invoke-interface {v1, v0}, Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;->onDownloadCompleted(Lorg/chromium/content/browser/DownloadInfo;)V

    .line 125
    .end local v0    # "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    :cond_0
    return-void
.end method

.method public onDownloadStarted(Lorg/chromium/content/browser/ContentViewCore;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "view"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p2, "filename"    # Ljava/lang/String;
    .param p3, "mimeType"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 97
    invoke-static {p1}, Lorg/chromium/content/browser/DownloadController;->downloadDelegateFromView(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/ContentViewDownloadDelegate;

    move-result-object v0

    .line 99
    .local v0, "downloadDelegate":Lorg/chromium/content/browser/ContentViewDownloadDelegate;
    if-eqz v0, :cond_0

    .line 100
    invoke-interface {v0, p2, p3}, Lorg/chromium/content/browser/ContentViewDownloadDelegate;->onDownloadStarted(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_0
    return-void
.end method

.method public onDownloadUpdated(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIIJ)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "mimeType"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "path"    # Ljava/lang/String;
    .param p6, "contentLength"    # J
    .param p8, "successful"    # Z
    .param p9, "downloadId"    # I
    .param p10, "percentCompleted"    # I
    .param p11, "timeRemainingInMs"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 135
    sget-object v1, Lorg/chromium/content/browser/DownloadController;->sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    if-eqz v1, :cond_0

    .line 136
    new-instance v1, Lorg/chromium/content/browser/DownloadInfo$Builder;

    invoke-direct {v1}, Lorg/chromium/content/browser/DownloadInfo$Builder;-><init>()V

    invoke-virtual {v1, p2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setUrl(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p3}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setMimeType(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p4}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setFileName(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p5}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setFilePath(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p6, p7}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setContentLength(J)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p8}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setIsSuccessful(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p4}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setDescription(Ljava/lang/String;)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p9}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setDownloadId(I)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setHasDownloadId(Z)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p10}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setPercentCompleted(I)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1, p11, p12}, Lorg/chromium/content/browser/DownloadInfo$Builder;->setTimeRemainingInMillis(J)Lorg/chromium/content/browser/DownloadInfo$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/chromium/content/browser/DownloadInfo$Builder;->build()Lorg/chromium/content/browser/DownloadInfo;

    move-result-object v0

    .line 149
    .local v0, "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    sget-object v1, Lorg/chromium/content/browser/DownloadController;->sDownloadNotificationService:Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;

    invoke-interface {v1, v0}, Lorg/chromium/content/browser/DownloadController$DownloadNotificationService;->onDownloadUpdated(Lorg/chromium/content/browser/DownloadInfo;)V

    .line 151
    .end local v0    # "downloadInfo":Lorg/chromium/content/browser/DownloadInfo;
    :cond_0
    return-void
.end method
