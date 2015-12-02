.class public Lcom/qihoo360/mobilesafe/support/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field static d:Lcom/qihoo360/mobilesafe/support/a/c;

.field private static e:Z

.field private static f:Ljava/lang/String;

.field private static g:Ljava/lang/String;

.field private static h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    const-string/jumbo v0, "com.qihoo.msafe.service.ROOTSERVICE"

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->a:Ljava/lang/String;

    .line 47
    const-string/jumbo v0, "com.qihoo360.rootserver_msafe"

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->b:Ljava/lang/String;

    .line 48
    const-string/jumbo v0, "rt_server_aborad"

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->c:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo360/mobilesafe/support/a;->e:Z

    .line 280
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a;->d:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 480
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a;->f:Ljava/lang/String;

    .line 524
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a;->g:Ljava/lang/String;

    .line 565
    sput-object v1, Lcom/qihoo360/mobilesafe/support/a;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)I"
        }
    .end annotation

    .prologue
    const/4 v0, -0x1

    .line 127
    if-nez p0, :cond_0

    .line 136
    :goto_0
    return v0

    .line 131
    :cond_0
    :try_start_0
    invoke-interface/range {p0 .. p5}, Lcom/qihoo360/mobilesafe/support/a/b;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 132
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;[Ljava/lang/Object;)Lcom/qihoo360/mobilesafe/support/a/f;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 420
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    const-wide/16 v4, 0x1

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    .line 421
    new-instance v0, Ljava/lang/Exception;

    const-string/jumbo v1, "this method can\'t be called in ui thread"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 422
    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    .line 451
    :cond_1
    :goto_0
    return-object v0

    .line 425
    :cond_2
    new-instance v1, Lcom/qihoo360/mobilesafe/support/a/i;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/support/a/i;-><init>()V

    .line 426
    new-instance v2, Lcom/qihoo360/mobilesafe/support/a$2;

    invoke-direct {v2, p1, v1}, Lcom/qihoo360/mobilesafe/support/a$2;-><init>([Ljava/lang/Object;Lcom/qihoo360/mobilesafe/support/a/i;)V

    .line 443
    new-instance v3, Landroid/content/Intent;

    sget-object v4, Lcom/qihoo360/mobilesafe/support/a;->a:Ljava/lang/String;

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v3, v2, v7}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 444
    monitor-enter v1

    .line 445
    const v3, 0xea60

    :try_start_0
    invoke-virtual {v1, v3}, Lcom/qihoo360/mobilesafe/support/a/i;->a(I)V

    .line 444
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    aput-object v2, p1, v7

    .line 449
    aget-object v1, p1, v6

    if-eqz v1, :cond_1

    .line 451
    aget-object v0, p1, v6

    check-cast v0, Lcom/qihoo360/mobilesafe/support/a/f;

    goto :goto_0

    .line 444
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 507
    if-eqz p1, :cond_1

    .line 508
    invoke-virtual {p0, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 509
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 510
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 512
    :cond_0
    const/4 v1, 0x0

    invoke-static {p0, p1, v1}, Lcom/qihoo360/common/utils/Utils;->resetFile(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 513
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 516
    :cond_1
    return-object p1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 472
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a/h;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 60
    const-string/jumbo v0, "root_enable"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 61
    return-void
.end method

.method public static a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 180
    if-nez p0, :cond_1

    .line 181
    if-eqz p4, :cond_0

    .line 183
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a$a;->a(IZ[B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2

    .line 197
    :cond_0
    :goto_0
    return-void

    .line 189
    :cond_1
    :try_start_1
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/b;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 190
    :catch_0
    move-exception v0

    .line 191
    if-eqz p4, :cond_0

    .line 193
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a$a;->a(IZ[B)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 194
    :catch_1
    move-exception v0

    goto :goto_0

    .line 184
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Z)V
    .locals 0

    .prologue
    .line 54
    sput-boolean p0, Lcom/qihoo360/mobilesafe/support/a;->e:Z

    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 476
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 64
    const-string/jumbo v0, "root_enable"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/ServiceConnection;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 377
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 384
    :cond_0
    :goto_0
    return v0

    .line 381
    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/qihoo360/mobilesafe/support/a;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {p0, v1, p1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 382
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)[B"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 222
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 223
    if-eqz v1, :cond_0

    move-object v0, p0

    move-object v2, p2

    move-wide v4, p3

    .line 224
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    .line 226
    :goto_0
    return-object v0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B

    move-result-object v0

    goto :goto_0
.end method

.method public static b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)I"
        }
    .end annotation

    .prologue
    .line 249
    invoke-static {p1}, Lcom/qihoo360/mobilesafe/support/a/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "LD_LIBRARY_PATH="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "LD_LIBRARY_PATH"

    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    if-eqz v1, :cond_0

    move-object v0, p0

    move-object v2, p2

    move-wide v4, p3

    .line 253
    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I

    move-result v0

    .line 255
    :goto_0
    return v0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a;->a(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I

    move-result v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 78
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/qihoo360/mobilesafe/support/a;->e:Z

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/support/a$1;-><init>(Landroid/content/Context;)V

    .line 93
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a$1;->start()V

    .line 95
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;[Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 461
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    aget-object v0, p1, v2

    if-nez v0, :cond_1

    .line 469
    :cond_0
    :goto_0
    return-void

    .line 463
    :cond_1
    aget-object v0, p1, v2

    instance-of v0, v0, Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    .line 465
    const/4 v0, 0x1

    :try_start_0
    aget-object v0, p1, v0

    check-cast v0, Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 466
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Landroid/content/ServiceConnection;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 397
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 404
    :cond_0
    :goto_0
    return v0

    .line 400
    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    const/4 v0, 0x1

    goto :goto_0

    .line 401
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)[B"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 210
    if-nez p0, :cond_0

    .line 217
    :goto_0
    return-object v0

    .line 213
    :cond_0
    :try_start_0
    invoke-interface/range {p0 .. p5}, Lcom/qihoo360/mobilesafe/support/a/b;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 214
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 289
    if-nez p0, :cond_0

    .line 290
    const/4 v0, 0x0

    .line 295
    :goto_0
    return v0

    .line 291
    :cond_0
    const-class v1, Lcom/qihoo360/mobilesafe/support/a;

    monitor-enter v1

    .line 292
    :try_start_0
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->d:Lcom/qihoo360/mobilesafe/support/a/c;

    if-nez v0, :cond_1

    .line 293
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a;->d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->d:Lcom/qihoo360/mobilesafe/support/a/c;

    .line 291
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->d:Lcom/qihoo360/mobilesafe/support/a/c;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/c;->e()Z

    move-result v0

    goto :goto_0

    .line 291
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static d(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/support/a/c;
    .locals 2

    .prologue
    .line 299
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/a/h;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string/jumbo v0, "x86"

    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 300
    :cond_0
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/d;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/support/a/d;-><init>(Landroid/content/Context;)V

    .line 302
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/g;

    invoke-direct {v0, p0}, Lcom/qihoo360/mobilesafe/support/a/g;-><init>(Landroid/content/Context;)V

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 483
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 484
    const-string/jumbo v0, "rt.jar"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 485
    if-eqz v0, :cond_2

    .line 486
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_1

    .line 489
    :cond_0
    const-string/jumbo v1, "rt.jar"

    const/4 v2, 0x0

    invoke-static {p0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->resetFile(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 492
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->f:Ljava/lang/String;

    .line 496
    :cond_2
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 527
    sget-object v1, Lcom/qihoo360/mobilesafe/support/a;->g:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 529
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v4, "rt2.jar"

    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 532
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string/jumbo v4, "rt2.jar"

    invoke-virtual {v1, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 533
    :try_start_1
    invoke-static {v1}, Lcom/qihoo360/common/utils/SecurityUtil;->getMD5(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    .line 534
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v5

    if-eqz v5, :cond_1

    .line 553
    if-eqz v1, :cond_0

    .line 555
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 561
    :cond_0
    :goto_0
    return-object v0

    .line 538
    :cond_1
    const/4 v0, 0x1

    .line 539
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 540
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/qihoo360/common/utils/SecurityUtil;->getFileMD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 541
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v0, v2

    .line 547
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 548
    const-string/jumbo v0, "rt2.jar"

    const/4 v2, 0x0

    invoke-static {p0, v0, v3, v2}, Lcom/qihoo360/common/utils/FileUtil;->copyAssetToFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Z)Z

    .line 550
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/a;->g:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 553
    if-eqz v1, :cond_4

    .line 555
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 561
    :cond_4
    :goto_2
    sget-object v0, Lcom/qihoo360/mobilesafe/support/a;->g:Ljava/lang/String;

    goto :goto_0

    .line 544
    :cond_5
    :try_start_5
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    .line 551
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 553
    :goto_3
    if-eqz v0, :cond_4

    .line 555
    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_2

    .line 556
    :catch_1
    move-exception v0

    goto :goto_2

    .line 552
    :catchall_0
    move-exception v1

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    .line 553
    :goto_4
    if-eqz v1, :cond_6

    .line 555
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 558
    :cond_6
    :goto_5
    throw v0

    .line 556
    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_5

    :catch_4
    move-exception v0

    goto :goto_2

    .line 552
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 551
    :catch_5
    move-exception v1

    goto :goto_3
.end method
