.class interface abstract Lorg/xwalk/core/internal/XWalkContentsIoThreadClient;
.super Ljava/lang/Object;
.source "XWalkContentsIoThreadClient.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# virtual methods
.method public abstract getCacheMode()I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract newLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract shouldBlockContentUrls()Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract shouldBlockFileUrls()Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract shouldBlockNetworkLoads()Z
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method

.method public abstract shouldInterceptRequest(Ljava/lang/String;Z)Lorg/xwalk/core/internal/InterceptedRequestData;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation
.end method
