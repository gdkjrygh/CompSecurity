.class Lcom/qihoo360/mobilesafe/support/a/d$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/qihoo360/mobilesafe/support/a/a;J)[B
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/d;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/c$a;

.field private final synthetic c:Z

.field private final synthetic d:Lcom/qihoo360/mobilesafe/support/a/a;

.field private final synthetic e:Ljava/lang/String;

.field private final synthetic f:Ljava/util/List;

.field private final synthetic g:Ljava/util/List;

.field private final synthetic h:J


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/d;Lcom/qihoo360/mobilesafe/support/a/c$a;ZLcom/qihoo360/mobilesafe/support/a/a;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput-boolean p3, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->c:Z

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->f:Ljava/util/List;

    iput-object p7, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->g:Ljava/util/List;

    iput-wide p8, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->h:J

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 131
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->h()V

    .line 132
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->i()Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 135
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 137
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 135
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_0

    .line 142
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 175
    :cond_0
    :goto_0
    return-void

    .line 135
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 150
    :cond_1
    :try_start_3
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->i()Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->f:Ljava/util/List;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->g:Ljava/util/List;

    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->h:J

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    iput-object v0, v6, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    .line 152
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_2

    .line 153
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iget-object v3, v3, Lcom/qihoo360/mobilesafe/support/a/c$a;->c:[B

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 167
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 168
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 169
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 167
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 172
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iget-boolean v0, v0, Lcom/qihoo360/mobilesafe/support/a/d;->f:Z

    if-eqz v0, :cond_0

    .line 173
    const-string/jumbo v0, "RootClient"

    const-string/jumbo v1, "Exec thread finished."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 155
    :catch_0
    move-exception v0

    .line 156
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iget-boolean v1, v1, Lcom/qihoo360/mobilesafe/support/a/d;->f:Z

    if-eqz v1, :cond_3

    .line 157
    const-string/jumbo v1, "RootClient"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 158
    :cond_3
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_2

    .line 160
    :try_start_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$1;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    .line 161
    :catch_1
    move-exception v0

    goto :goto_1

    .line 167
    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0

    .line 143
    :catch_2
    move-exception v0

    goto :goto_0
.end method
