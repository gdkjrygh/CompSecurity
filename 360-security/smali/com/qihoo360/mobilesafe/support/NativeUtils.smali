.class public Lcom/qihoo360/mobilesafe/support/NativeUtils;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/NativeUtils;->a:Z

    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 11
    sget-boolean v0, Lcom/qihoo360/mobilesafe/support/NativeUtils;->a:Z

    if-nez v0, :cond_0

    .line 13
    :try_start_0
    const-string/jumbo v0, "NativeUtils"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/NativeUtils;->a:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    :cond_0
    :goto_0
    sget-boolean v0, Lcom/qihoo360/mobilesafe/support/NativeUtils;->a:Z

    return v0

    .line 15
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static native getEncryptByte([B)[B
.end method

.method public static native getEncryptString(Ljava/lang/String;)Ljava/lang/String;
.end method
