.class Lcom/qihoo/security/opti/a/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/b;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 133
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v1}, Lcom/qihoo/security/opti/a/b;->b(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->c(Lcom/qihoo/security/opti/a/b;)V

    .line 142
    :cond_0
    return-void

    .line 134
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 150
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    invoke-static {v1}, Lcom/qihoo/security/opti/a/b;->b(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b$1;->a:Lcom/qihoo/security/opti/a/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 158
    return-void

    .line 151
    :catch_0
    move-exception v0

    goto :goto_0
.end method
