.class Lcom/qihoo/security/clearengine/sdk/a/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/sdk/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/sdk/a/b;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/support/a/b$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/b;->a(Lcom/qihoo/security/clearengine/sdk/a/b;Lcom/qihoo360/mobilesafe/support/a/b;)V

    .line 36
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/a/b;->a(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/f;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/sdk/a/b;->b(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/support/a/f;->a(Lcom/qihoo360/mobilesafe/support/a/b;)V

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/a/b;->a(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/f;

    move-result-object v1

    monitor-enter v1

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/a/b;->c(Lcom/qihoo/security/clearengine/sdk/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/a/b;->a(Lcom/qihoo/security/clearengine/sdk/a/b;)Lcom/qihoo360/mobilesafe/support/a/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/b$1;->a:Lcom/qihoo/security/clearengine/sdk/a/b;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/sdk/a/b;->a(Lcom/qihoo/security/clearengine/sdk/a/b;Z)V

    .line 40
    :cond_0
    monitor-exit v1

    .line 49
    return-void

    .line 40
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .prologue
    .line 53
    return-void
.end method
