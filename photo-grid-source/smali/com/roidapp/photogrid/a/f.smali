.class final Lcom/roidapp/photogrid/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a/e;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/a/e;)V
    .locals 0

    .prologue
    .line 217
    iput-object p1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/16 v4, -0x3e9

    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 276
    :cond_0
    :goto_0
    return-void

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 227
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const-string v2, "Checking for in-app billing 3 support."

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 230
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    if-eqz v1, :cond_0

    .line 233
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    const/4 v2, 0x3

    const-string v3, "inapp"

    invoke-interface {v1, v2, v0, v3}, Lcom/a/d/a/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 234
    if-eqz v1, :cond_4

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    new-instance v2, Lcom/roidapp/photogrid/a/l;

    const-string v3, "Error checking for billing v3 support."

    invoke-direct {v2, v1, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v2}, Lcom/roidapp/photogrid/a/j;->a(Lcom/roidapp/photogrid/a/l;)V

    .line 239
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/a/d;->d:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 258
    :catch_0
    move-exception v0

    .line 259
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    if-eqz v1, :cond_3

    .line 260
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    new-instance v2, Lcom/roidapp/photogrid/a/l;

    const-string v3, "RemoteException while setting up in-app billing."

    invoke-direct {v2, v4, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/roidapp/photogrid/a/j;->a(Lcom/roidapp/photogrid/a/l;)V

    .line 263
    :cond_3
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 242
    :cond_4
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "In-app billing version 3 supported for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 245
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    if-eqz v1, :cond_5

    .line 246
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    const/4 v2, 0x3

    const-string v3, "subs"

    invoke-interface {v1, v2, v0, v3}, Lcom/a/d/a/a;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 247
    if-nez v0, :cond_6

    .line 248
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const-string v1, "Subscriptions AVAILABLE."

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/a/d;->d:Z

    .line 256
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/a/d;->c:Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1

    .line 273
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v0, v0, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    new-instance v1, Lcom/roidapp/photogrid/a/l;

    const-string v2, "Setup successful."

    invoke-direct {v1, v5, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/a/j;->a(Lcom/roidapp/photogrid/a/l;)V

    goto/16 :goto_0

    .line 252
    :cond_6
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Subscriptions NOT AVAILABLE. Response: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 265
    :catch_1
    move-exception v0

    .line 266
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    if-eqz v1, :cond_7

    .line 267
    iget-object v1, p0, Lcom/roidapp/photogrid/a/f;->a:Lcom/roidapp/photogrid/a/e;

    iget-object v1, v1, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    new-instance v2, Lcom/roidapp/photogrid/a/l;

    const-string v3, "NullPointerException while setting up in-app billing."

    invoke-direct {v2, v4, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/roidapp/photogrid/a/j;->a(Lcom/roidapp/photogrid/a/l;)V

    .line 270
    :cond_7
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2
.end method
