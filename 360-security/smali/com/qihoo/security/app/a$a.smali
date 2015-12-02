.class Lcom/qihoo/security/app/a$a;
.super Lcom/qihoo/security/booster/b;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/app/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/a;)V
    .locals 1

    .prologue
    .line 176
    iput-object p1, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    .line 177
    invoke-static {p1}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/booster/b;-><init>(Landroid/os/Handler;)V

    .line 178
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 183
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v1, v0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    monitor-enter v1

    .line 184
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v0, v0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    iput-object p1, v0, Lcom/qihoo/security/app/a$c;->a:Ljava/util/List;

    .line 185
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    invoke-static {p1}, Lcom/qihoo/security/opti/a/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    .line 187
    iget-object v1, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v1, v1, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    monitor-enter v1

    .line 188
    :try_start_1
    iget-object v2, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v2, v2, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    iget-object v2, v2, Lcom/qihoo/security/app/a$c;->a:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 189
    iget-object v2, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v2, v2, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    iput-object v0, v2, Lcom/qihoo/security/app/a$c;->b:Ljava/util/Map;

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v0, v0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/app/a$c;->c:J

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    iget-object v3, v3, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    invoke-static {v0, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 192
    iget-object v2, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v2}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 194
    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 195
    return-void

    .line 185
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 194
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public a_(II)V
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 201
    iget-object v1, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v1}, Lcom/qihoo/security/app/a;->b(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 203
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 209
    iget-object v1, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v1}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 210
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Lcom/qihoo/security/app/a$a;->a:Lcom/qihoo/security/app/a;

    invoke-static {v0}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 216
    return-void
.end method
