.class public abstract Lorg/xwalk/core/internal/XWalkExtensionInternal;
.super Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;
.source "XWalkExtensionInternal.java"


# annotations
.annotation build Lorg/xwalk/core/internal/XWalkAPI;
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "entryPoints"    # [Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 37
    return-void
.end method


# virtual methods
.method public broadcastMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 64
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->broadcastMessage(Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method protected destroyExtension()V
    .locals 0

    .prologue
    .line 43
    invoke-super {p0}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->destroyExtension()V

    .line 44
    return-void
.end method

.method public abstract onMessage(ILjava/lang/String;)V
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end method

.method public abstract onSyncMessage(ILjava/lang/String;)Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation
.end method

.method public postMessage(ILjava/lang/String;)V
    .locals 0
    .param p1, "instanceID"    # I
    .param p2, "message"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 54
    invoke-super {p0, p1, p2}, Lorg/xwalk/core/internal/extensions/XWalkExtensionAndroid;->postMessage(ILjava/lang/String;)V

    .line 55
    return-void
.end method
