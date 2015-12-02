.class public Lcom/facebook/auth/broadcast/m;
.super Ljava/lang/Object;
.source "ToastThreadUtil.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0
    .param p2    # Landroid/os/Handler;
        .annotation runtime Lcom/facebook/common/executors/ForUiThread;
        .end annotation
    .end param

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/auth/broadcast/m;->a:Landroid/content/Context;

    .line 21
    iput-object p2, p0, Lcom/facebook/auth/broadcast/m;->b:Landroid/os/Handler;

    .line 22
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/broadcast/m;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/facebook/auth/broadcast/m;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/auth/broadcast/m;->a(Ljava/lang/String;I)V

    .line 26
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/auth/broadcast/m;->b:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/auth/broadcast/n;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/auth/broadcast/n;-><init>(Lcom/facebook/auth/broadcast/m;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    return-void
.end method
