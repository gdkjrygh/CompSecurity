.class public Lcom/facebook/fdlimit/FdLimitNative;
.super Ljava/lang/Object;
.source "FdLimitNative.java"


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 15
    const-class v0, Lcom/facebook/fdlimit/FdLimitNative;

    sput-object v0, Lcom/facebook/fdlimit/FdLimitNative;->a:Ljava/lang/Class;

    .line 20
    sput-boolean v1, Lcom/facebook/fdlimit/FdLimitNative;->b:Z

    .line 24
    :try_start_0
    const-string v0, "fb_fdlimit"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/fdlimit/FdLimitNative;->b:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    return-void

    .line 27
    :catch_0
    move-exception v0

    .line 28
    sput-boolean v1, Lcom/facebook/fdlimit/FdLimitNative;->b:Z

    .line 29
    const-string v1, "FdLimitOverride"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "got exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static native getHardFdLimit()I
.end method

.method static native getSoftFdLimit()I
.end method

.method static native setFdLimit(II)V
.end method
