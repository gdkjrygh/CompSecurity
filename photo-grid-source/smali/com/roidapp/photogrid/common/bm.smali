.class public final Lcom/roidapp/photogrid/common/bm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# static fields
.field private static a:Lcom/roidapp/photogrid/common/bm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/bm;->a:Lcom/roidapp/photogrid/common/bm;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public static a(Landroid/view/Display;)I
    .locals 2

    .prologue
    .line 30
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-lt v0, v1, :cond_0

    .line 31
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 32
    invoke-virtual {p0, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 33
    iget v0, v0, Landroid/graphics/Point;->x:I

    .line 38
    :goto_0
    return v0

    .line 35
    :cond_0
    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a()Lcom/roidapp/photogrid/common/bm;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/roidapp/photogrid/common/bm;->a:Lcom/roidapp/photogrid/common/bm;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Lcom/roidapp/photogrid/common/bm;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bm;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/bm;->a:Lcom/roidapp/photogrid/common/bm;

    .line 25
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/bm;->a:Lcom/roidapp/photogrid/common/bm;

    return-object v0
.end method

.method public static b(Landroid/view/Display;)I
    .locals 2

    .prologue
    .line 44
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-lt v0, v1, :cond_0

    .line 45
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 46
    invoke-virtual {p0, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 47
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 52
    :goto_0
    return v0

    .line 49
    :cond_0
    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 52
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
