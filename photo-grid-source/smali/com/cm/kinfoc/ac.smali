.class final Lcom/cm/kinfoc/ac;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/z;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/z;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/cm/kinfoc/ac;->a:Lcom/cm/kinfoc/z;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 136
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 137
    const-string v1, "com.roidapp.photogrid.common.kinfoc.ActivityTimer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/cm/kinfoc/ac;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->b(Lcom/cm/kinfoc/z;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 139
    invoke-static {}, Lcom/cm/kinfoc/z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "REPORT="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/z;->a(Ljava/lang/String;)V

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/cm/kinfoc/ac;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->b(Lcom/cm/kinfoc/z;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/cm/kinfoc/ac;->a:Lcom/cm/kinfoc/z;

    invoke-static {v1}, Lcom/cm/kinfoc/z;->c(Lcom/cm/kinfoc/z;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    :cond_1
    return-void
.end method
