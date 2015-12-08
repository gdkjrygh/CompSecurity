.class public interface abstract Lorg/chromium/base/ResourceExtractor$ResourceIntercepter;
.super Ljava/lang/Object;
.source "ResourceExtractor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/ResourceExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ResourceIntercepter"
.end annotation


# virtual methods
.method public abstract getInterceptableResourceList()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract interceptLoadingForResource(Ljava/lang/String;)Ljava/io/InputStream;
.end method
