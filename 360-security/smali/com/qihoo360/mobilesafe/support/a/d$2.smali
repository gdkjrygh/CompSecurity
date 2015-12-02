.class Lcom/qihoo360/mobilesafe/support/a/d$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/d;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLcom/qihoo360/mobilesafe/support/a/a;J)Lcom/qihoo360/mobilesafe/support/a/c$a;
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
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    iput-boolean p3, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->c:Z

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->f:Ljava/util/List;

    iput-object p7, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->g:Ljava/util/List;

    iput-wide p8, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->h:J

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    .line 212
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->h()V

    .line 213
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->i()Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 215
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 216
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 217
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 215
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_0

    .line 222
    :try_start_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 256
    :cond_0
    :goto_0
    return-void

    .line 215
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 231
    :cond_1
    :try_start_3
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/d;->i()Lcom/qihoo360/mobilesafe/support/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->f:Ljava/util/List;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->g:Ljava/util/List;

    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->h:J

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I

    move-result v0

    iput v0, v6, Lcom/qihoo360/mobilesafe/support/a/c$a;->a:I

    .line 232
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_2

    .line 233
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v2}, Lcom/qihoo360/mobilesafe/support/a/c$a;->a()Z

    move-result v2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 248
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    monitor-enter v1

    .line 249
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/qihoo360/mobilesafe/support/a/c$a;->d:Z

    .line 250
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 248
    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 235
    :catch_0
    move-exception v0

    .line 240
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_2

    .line 242
    :try_start_5
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$2;->d:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_1

    .line 243
    :catch_1
    move-exception v0

    goto :goto_1

    .line 223
    :catch_2
    move-exception v0

    goto :goto_0
.end method
