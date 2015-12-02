.class Lcom/facebook/selfupdate/ad;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/selfupdate/ad;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/ad;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/af;
    .locals 12

    .prologue
    .line 89
    new-instance v0, Lcom/facebook/selfupdate/af;

    invoke-virtual {p0}, Lcom/facebook/selfupdate/ad;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v3}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/config/b/a;

    const-class v4, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v4}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/executors/a;

    const-class v5, Lcom/facebook/selfupdate/o;

    invoke-virtual {p0, v5}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/selfupdate/o;

    const-class v6, Lcom/facebook/c/s;

    invoke-virtual {p0, v6}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/c/s;

    const-class v7, Lcom/facebook/selfupdate/h;

    invoke-virtual {p0, v7}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/selfupdate/h;

    const-class v8, Lcom/facebook/common/f/d;

    invoke-virtual {p0, v8}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/f/d;

    const-class v9, Landroid/app/DownloadManager;

    invoke-virtual {p0, v9}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/app/DownloadManager;

    const-class v10, Lcom/facebook/base/broadcast/j;

    const-class v11, Lcom/facebook/base/broadcast/CrossFbAppBroadcast;

    invoke-virtual {p0, v10, v11}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/base/broadcast/j;

    const-class v11, Lcom/facebook/selfupdate/ae;

    invoke-virtual {p0, v11}, Lcom/facebook/selfupdate/ad;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/selfupdate/ae;

    invoke-direct/range {v0 .. v11}, Lcom/facebook/selfupdate/af;-><init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/config/b/a;Lcom/facebook/common/executors/a;Lcom/facebook/selfupdate/o;Lcom/facebook/c/s;Lcom/facebook/selfupdate/h;Lcom/facebook/common/f/d;Landroid/app/DownloadManager;Lcom/facebook/base/broadcast/j;Lcom/facebook/selfupdate/ae;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/facebook/selfupdate/ad;->a()Lcom/facebook/selfupdate/af;

    move-result-object v0

    return-object v0
.end method
