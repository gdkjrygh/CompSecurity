.class Lcom/facebook/orca/app/bo;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/l/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1393
    iput-object p1, p0, Lcom/facebook/orca/app/bo;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1393
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bo;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/l/c;
    .locals 10

    .prologue
    .line 1397
    new-instance v0, Lcom/facebook/l/c;

    invoke-virtual {p0}, Lcom/facebook/orca/app/bo;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Landroid/support/v4/a/e;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/a/e;

    const-class v4, Landroid/media/AudioManager;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/media/AudioManager;

    const-class v5, Lcom/facebook/l/b;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/l/b;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/IsMusicPresenceEnabled;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/app/bo;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    const-class v8, Landroid/os/Handler;

    const-class v9, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/app/bo;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/os/Handler;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/l/c;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Landroid/support/v4/a/e;Landroid/media/AudioManager;Lcom/facebook/l/b;Ljavax/inject/a;Lcom/facebook/common/e/h;Landroid/os/Handler;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1393
    invoke-virtual {p0}, Lcom/facebook/orca/app/bo;->a()Lcom/facebook/l/c;

    move-result-object v0

    return-object v0
.end method
