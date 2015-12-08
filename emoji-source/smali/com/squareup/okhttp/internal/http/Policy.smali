.class public interface abstract Lcom/squareup/okhttp/internal/http/Policy;
.super Ljava/lang/Object;
.source "Policy.java"


# virtual methods
.method public abstract getChunkLength()I
.end method

.method public abstract getFixedContentLength()J
.end method

.method public abstract getHttpConnectionToCache()Ljava/net/HttpURLConnection;
.end method

.method public abstract getIfModifiedSince()J
.end method

.method public abstract getURL()Ljava/net/URL;
.end method

.method public abstract getUseCaches()Z
.end method

.method public abstract setSelectedProxy(Ljava/net/Proxy;)V
.end method

.method public abstract usingProxy()Z
.end method
