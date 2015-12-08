.class public Lorg/chromium/content/app/ContentMain;
.super Ljava/lang/Object;
.source "ContentMain.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static initApplicationContext(Landroid/content/Context;)V
    .locals 0
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 27
    invoke-static {p0}, Lorg/chromium/content/app/ContentMain;->nativeInitApplicationContext(Landroid/content/Context;)V

    .line 28
    return-void
.end method

.method private static native nativeInitApplicationContext(Landroid/content/Context;)V
.end method

.method private static native nativeStart()I
.end method

.method public static start()I
    .locals 1

    .prologue
    .line 34
    invoke-static {}, Lorg/chromium/content/app/ContentMain;->nativeStart()I

    move-result v0

    return v0
.end method
