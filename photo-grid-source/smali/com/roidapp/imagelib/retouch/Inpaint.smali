.class public Lcom/roidapp/imagelib/retouch/Inpaint;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 10
    sput-boolean v0, Lcom/roidapp/imagelib/retouch/Inpaint;->a:Z

    .line 13
    :try_start_0
    const-string v0, "imageprogress"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/imagelib/retouch/Inpaint;->a:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :goto_0
    return-void

    .line 16
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace()V

    .line 17
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/imagelib/retouch/Inpaint;->a:Z

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native Inpaint(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;[IIII)V
.end method
