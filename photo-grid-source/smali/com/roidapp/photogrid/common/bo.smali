.class public final Lcom/roidapp/photogrid/common/bo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# static fields
.field private static a:Lcom/roidapp/photogrid/common/bo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/bo;->a:Lcom/roidapp/photogrid/common/bo;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/common/bo;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/roidapp/photogrid/common/bo;->a:Lcom/roidapp/photogrid/common/bo;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/roidapp/photogrid/common/bo;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bo;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/bo;->a:Lcom/roidapp/photogrid/common/bo;

    .line 26
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/bo;->a:Lcom/roidapp/photogrid/common/bo;

    return-object v0
.end method

.method public static a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 2

    .prologue
    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    const/4 v0, 0x1

    .line 34
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
