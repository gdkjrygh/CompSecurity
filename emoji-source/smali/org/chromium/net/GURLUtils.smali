.class public final Lorg/chromium/net/GURLUtils;
.super Ljava/lang/Object;
.source "GURLUtils.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "net"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getOrigin(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 23
    invoke-static {p0}, Lorg/chromium/net/GURLUtils;->nativeGetOrigin(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getScheme(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "url"    # Ljava/lang/String;

    .prologue
    .line 33
    invoke-static {p0}, Lorg/chromium/net/GURLUtils;->nativeGetScheme(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static native nativeGetOrigin(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native nativeGetScheme(Ljava/lang/String;)Ljava/lang/String;
.end method
