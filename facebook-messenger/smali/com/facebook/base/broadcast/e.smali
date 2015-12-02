.class Lcom/facebook/base/broadcast/e;
.super Ljava/lang/Object;
.source "BaseFbBroadcastManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private final a:Lcom/facebook/c/b;

.field private final b:Landroid/os/Handler;


# direct methods
.method private constructor <init>(Lcom/facebook/c/b;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lcom/facebook/base/broadcast/e;->a:Lcom/facebook/c/b;

    .line 114
    iput-object p2, p0, Lcom/facebook/base/broadcast/e;->b:Landroid/os/Handler;

    .line 115
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/c/b;Landroid/os/Handler;Lcom/facebook/base/broadcast/c;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/base/broadcast/e;-><init>(Lcom/facebook/c/b;Landroid/os/Handler;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/broadcast/e;)Lcom/facebook/c/b;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/base/broadcast/e;->a:Lcom/facebook/c/b;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/base/broadcast/e;->b:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/base/broadcast/f;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/facebook/base/broadcast/f;-><init>(Lcom/facebook/base/broadcast/e;Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 126
    return-void
.end method
