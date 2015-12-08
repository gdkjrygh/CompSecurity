.class final Lcom/roidapp/photogrid/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 704
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 704
    invoke-direct {p0}, Lcom/roidapp/photogrid/aw;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 707
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;)V

    .line 708
    return-void
.end method
