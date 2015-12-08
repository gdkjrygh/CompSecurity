.class Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;
.super Ljava/lang/Object;
.source "XWalkContentsClientCallbackHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DownloadInfo"
.end annotation


# instance fields
.field final mContentDisposition:Ljava/lang/String;

.field final mContentLength:J

.field final mMimeType:Ljava/lang/String;

.field final mUrl:Ljava/lang/String;

.field final mUserAgent:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "userAgent"    # Ljava/lang/String;
    .param p3, "contentDisposition"    # Ljava/lang/String;
    .param p4, "mimeType"    # Ljava/lang/String;
    .param p5, "contentLength"    # J

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mUrl:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mUserAgent:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mContentDisposition:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mMimeType:Ljava/lang/String;

    .line 41
    iput-wide p5, p0, Lorg/xwalk/core/internal/XWalkContentsClientCallbackHelper$DownloadInfo;->mContentLength:J

    .line 42
    return-void
.end method
