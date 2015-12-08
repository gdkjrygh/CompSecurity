.class Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;
.super Ljava/lang/Object;
.source "XWalkDownloadListenerImpl.java"

# interfaces
.implements Lorg/xwalk/core/internal/DownloadListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/XWalkDownloadListenerImpl$FileTransfer;
    }
.end annotation


# static fields
.field private static DOWNLOAD_ALREADY_EXISTS_TOAST:Ljava/lang/String;

.field private static DOWNLOAD_FAILED_TOAST:Ljava/lang/String;

.field private static DOWNLOAD_FINISHED_TOAST:Ljava/lang/String;

.field private static DOWNLOAD_NO_PERMISSION_TOAST:Ljava/lang/String;

.field private static DOWNLOAD_START_TOAST:Ljava/lang/String;


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    sget v1, Lorg/xwalk/core/internal/R$string;->download_start_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_START_TOAST:Ljava/lang/String;

    .line 42
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    sget v1, Lorg/xwalk/core/internal/R$string;->download_no_permission_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_NO_PERMISSION_TOAST:Ljava/lang/String;

    .line 44
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    sget v1, Lorg/xwalk/core/internal/R$string;->download_already_exists_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_ALREADY_EXISTS_TOAST:Ljava/lang/String;

    .line 46
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    sget v1, Lorg/xwalk/core/internal/R$string;->download_failed_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_FAILED_TOAST:Ljava/lang/String;

    .line 48
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    sget v1, Lorg/xwalk/core/internal/R$string;->download_finished_toast:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_FINISHED_TOAST:Ljava/lang/String;

    .line 50
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;

    .prologue
    .line 29
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_FAILED_TOAST:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->popupMessages(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_ALREADY_EXISTS_TOAST:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_FINISHED_TOAST:Ljava/lang/String;

    return-object v0
.end method

.method private checkWriteExternalPermission()Z
    .locals 3

    .prologue
    .line 96
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    .line 98
    .local v0, "result":I
    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 101
    :goto_0
    return v1

    .line 100
    :cond_0
    sget-object v1, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_NO_PERMISSION_TOAST:Ljava/lang/String;

    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->popupMessages(Ljava/lang/String;)V

    .line 101
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private getDownloadManager()Landroid/app/DownloadManager;
    .locals 3

    .prologue
    .line 90
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    const-string v2, "download"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/DownloadManager;

    .line 92
    .local v0, "downloadManager":Landroid/app/DownloadManager;
    return-object v0
.end method

.method private getFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "contentDisposition"    # Ljava/lang/String;
    .param p3, "mimetype"    # Ljava/lang/String;

    .prologue
    .line 74
    invoke-static {p1, p2, p3}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 75
    .local v2, "fileName":Ljava/lang/String;
    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 76
    .local v1, "extensionIndex":I
    const/4 v0, 0x0

    .line 77
    .local v0, "extension":Ljava/lang/String;
    const/4 v3, 0x1

    if-le v1, v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 78
    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 82
    :cond_0
    if-nez v0, :cond_1

    .line 83
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    if-eqz v0, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 86
    :cond_1
    return-object v2
.end method

.method private popupMessages(Ljava/lang/String;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 105
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 106
    return-void
.end method


# virtual methods
.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 5
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "userAgent"    # Ljava/lang/String;
    .param p3, "contentDisposition"    # Ljava/lang/String;
    .param p4, "mimetype"    # Ljava/lang/String;
    .param p5, "contentLength"    # J

    .prologue
    .line 55
    invoke-direct {p0, p1, p3, p4}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->getFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    .local v0, "fileName":Ljava/lang/String;
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->checkWriteExternalPermission()Z

    move-result v3

    if-nez v3, :cond_0

    .line 71
    :goto_0
    return-void

    .line 61
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 62
    .local v2, "src":Landroid/net/Uri;
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "http"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "https"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 63
    :cond_1
    new-instance v1, Landroid/app/DownloadManager$Request;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    .line 64
    .local v1, "request":Landroid/app/DownloadManager$Request;
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v1, v3, v0}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 66
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->getDownloadManager()Landroid/app/DownloadManager;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->DOWNLOAD_START_TOAST:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;->popupMessages(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    .end local v1    # "request":Landroid/app/DownloadManager$Request;
    :cond_2
    new-instance v3, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl$FileTransfer;

    invoke-direct {v3, p0, p1, v0}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl$FileTransfer;-><init>(Lorg/xwalk/core/internal/XWalkDownloadListenerImpl;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Void;

    invoke-virtual {v3, v4}, Lorg/xwalk/core/internal/XWalkDownloadListenerImpl$FileTransfer;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method
