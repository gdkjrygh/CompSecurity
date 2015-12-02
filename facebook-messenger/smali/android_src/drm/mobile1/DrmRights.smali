.class public Landroid_src/drm/mobile1/DrmRights;
.super Ljava/lang/Object;
.source "DrmRights.java"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 130
    :try_start_0
    const-string v0, "drm1_jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_0
    return-void

    .line 132
    :catch_0
    move-exception v0

    .line 133
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "WARNING: Could not load libdrm1_jni.so"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const-string v0, ""

    iput-object v0, p0, Landroid_src/drm/mobile1/DrmRights;->a:Ljava/lang/String;

    .line 63
    return-void
.end method

.method private native nativeConsumeRights(I)I
.end method

.method private native nativeGetConstraintInfo(ILandroid_src/drm/mobile1/a;)I
.end method
