.class Lcom/qihoo/security/opti/a/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/a/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/a/c;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;)Ljava/lang/Thread;

    move-result-object v0

    if-nez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/qihoo/security/opti/a/c$1$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/a/c$1$1;-><init>(Lcom/qihoo/security/opti/a/c$1;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;Ljava/lang/Thread;)Ljava/lang/Thread;

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/qihoo/security/opti/a/c$1;->a:Lcom/qihoo/security/opti/a/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/a/c;->a(Lcom/qihoo/security/opti/a/c;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 128
    return-void
.end method
