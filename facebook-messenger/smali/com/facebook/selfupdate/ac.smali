.class Lcom/facebook/selfupdate/ac;
.super Lcom/facebook/inject/d;
.source "SelfUpdateModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/selfupdate/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/selfupdate/u;


# direct methods
.method private constructor <init>(Lcom/facebook/selfupdate/u;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/selfupdate/ac;->a:Lcom/facebook/selfupdate/u;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/ac;-><init>(Lcom/facebook/selfupdate/u;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/selfupdate/q;
    .locals 14

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/selfupdate/q;

    const-class v1, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/base/a/d;

    const-class v2, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/b/a;

    const-class v3, Landroid/content/Context;

    invoke-virtual {p0, v3}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    const-class v4, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v4}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/time/a;

    const-class v5, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v5}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    const-class v6, Lcom/facebook/selfupdate/o;

    invoke-virtual {p0, v6}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/selfupdate/o;

    const-class v7, Landroid/app/DownloadManager;

    invoke-virtual {p0, v7}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/DownloadManager;

    const-class v8, Lcom/facebook/selfupdate/af;

    invoke-virtual {p0, v8}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/selfupdate/af;

    const-class v9, Lcom/facebook/selfupdate/g;

    invoke-virtual {p0, v9}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/selfupdate/g;

    const-class v10, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v10}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/common/executors/a;

    const-class v11, Lcom/facebook/selfupdate/i;

    invoke-virtual {p0, v11}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/selfupdate/i;

    const-class v12, Lcom/facebook/common/f/d;

    invoke-virtual {p0, v12}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/common/f/d;

    const-class v13, Lcom/facebook/common/f/f;

    invoke-virtual {p0, v13}, Lcom/facebook/selfupdate/ac;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/facebook/common/f/f;

    invoke-direct/range {v0 .. v13}, Lcom/facebook/selfupdate/q;-><init>(Lcom/facebook/base/a/d;Lcom/facebook/config/b/a;Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/selfupdate/o;Landroid/app/DownloadManager;Lcom/facebook/selfupdate/af;Lcom/facebook/selfupdate/g;Lcom/facebook/common/executors/a;Lcom/facebook/selfupdate/i;Lcom/facebook/common/f/d;Lcom/facebook/common/f/f;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/selfupdate/ac;->a()Lcom/facebook/selfupdate/q;

    move-result-object v0

    return-object v0
.end method
