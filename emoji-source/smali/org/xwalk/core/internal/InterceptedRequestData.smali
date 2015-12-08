.class Lorg/xwalk/core/internal/InterceptedRequestData;
.super Ljava/lang/Object;
.source "InterceptedRequestData.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# instance fields
.field private mCharset:Ljava/lang/String;

.field private mData:Ljava/io/InputStream;

.field private mMimeType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    .locals 0
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "encoding"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/io/InputStream;

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mMimeType:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mCharset:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mData:Ljava/io/InputStream;

    .line 26
    return-void
.end method


# virtual methods
.method public getCharset()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mCharset:Ljava/lang/String;

    return-object v0
.end method

.method public getData()Ljava/io/InputStream;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mData:Ljava/io/InputStream;

    return-object v0
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 30
    iget-object v0, p0, Lorg/xwalk/core/internal/InterceptedRequestData;->mMimeType:Ljava/lang/String;

    return-object v0
.end method
