.class final Lcom/cm/kinfoc/ab;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/z;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/z;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/cm/kinfoc/ab;->a:Lcom/cm/kinfoc/z;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 123
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 124
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/cm/kinfoc/ab;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->b(Lcom/cm/kinfoc/z;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/cm/kinfoc/ab;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->b(Lcom/cm/kinfoc/z;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/cm/kinfoc/ab;->a:Lcom/cm/kinfoc/z;

    invoke-static {v1}, Lcom/cm/kinfoc/z;->c(Lcom/cm/kinfoc/z;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/cm/kinfoc/ab;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {v2}, Lcom/cm/kinfoc/z;->c()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 129
    :cond_0
    return-void
.end method
