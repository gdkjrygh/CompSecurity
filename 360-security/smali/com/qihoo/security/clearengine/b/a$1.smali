.class Lcom/qihoo/security/clearengine/b/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 222
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 223
    const/4 v1, 0x5

    iput v1, v0, Landroid/os/Message;->what:I

    .line 224
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 225
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v1}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/b/a$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/clearengine/b/a$b;->sendMessage(Landroid/os/Message;)Z

    .line 226
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .prologue
    .line 235
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 236
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->b(Lcom/qihoo/security/clearengine/b/a;Z)V

    .line 235
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a$1;->a:Lcom/qihoo/security/clearengine/b/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/b/a$b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a$b;->sendEmptyMessage(I)Z

    .line 240
    return-void

    .line 235
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
