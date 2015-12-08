.class public abstract Lorg/xwalk/core/SharedXWalkExceptionHandler;
.super Ljava/lang/Object;
.source "SharedXWalkExceptionHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method handleException(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 9
    invoke-virtual {p0}, Lorg/xwalk/core/SharedXWalkExceptionHandler;->onSharedLibraryNotFound()V

    .line 10
    const/4 v0, 0x1

    return v0
.end method

.method public abstract onSharedLibraryNotFound()V
.end method
