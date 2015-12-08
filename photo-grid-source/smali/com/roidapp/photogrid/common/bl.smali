.class public final Lcom/roidapp/photogrid/common/bl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# static fields
.field private static a:Lcom/roidapp/photogrid/common/bl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/bl;->a:Lcom/roidapp/photogrid/common/bl;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/common/bl;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/roidapp/photogrid/common/bl;->a:Lcom/roidapp/photogrid/common/bl;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lcom/roidapp/photogrid/common/bl;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bl;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/bl;->a:Lcom/roidapp/photogrid/common/bl;

    .line 23
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/bl;->a:Lcom/roidapp/photogrid/common/bl;

    return-object v0
.end method

.method public static a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 27
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 28
    return-void
.end method

.method public static a(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 53
    return-void
.end method

.method public static a(Landroid/graphics/Canvas;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 40
    :try_start_0
    const-class v0, Landroid/graphics/Canvas;

    const-string v2, "isHardwareAccelerated"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 47
    :goto_0
    return v0

    .line 45
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    move v0, v1

    .line 47
    goto :goto_0
.end method

.method public static b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 35
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 36
    return-void
.end method
