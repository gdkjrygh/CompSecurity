.class public Lorg/chromium/base/ImportantFileWriterAndroid;
.super Ljava/lang/Object;
.source "ImportantFileWriterAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "base::android"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native nativeWriteFileAtomically(Ljava/lang/String;[B)Z
.end method

.method public static writeFileAtomically(Ljava/lang/String;[B)Z
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "data"    # [B

    .prologue
    .line 24
    invoke-static {p0, p1}, Lorg/chromium/base/ImportantFileWriterAndroid;->nativeWriteFileAtomically(Ljava/lang/String;[B)Z

    move-result v0

    return v0
.end method
