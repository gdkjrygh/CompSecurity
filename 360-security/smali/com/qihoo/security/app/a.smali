.class public final Lcom/qihoo/security/app/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/app/a$b;,
        Lcom/qihoo/security/app/a$c;,
        Lcom/qihoo/security/app/a$a;
    }
.end annotation


# static fields
.field private static b:I

.field private static final c:I

.field private static d:I

.field private static e:I

.field private static f:I

.field private static g:Lcom/qihoo/security/app/a;


# instance fields
.field a:Lcom/qihoo/security/app/a$c;

.field private h:Lcom/qihoo360/mobilesafe/core/c/c;

.field private final i:Landroid/content/Context;

.field private final j:Lcom/qihoo/security/app/a$a;

.field private final k:Landroid/os/Handler;

.field private final l:Landroid/os/Handler;

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/app/a$b;",
            ">;>;"
        }
    .end annotation
.end field

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 71
    const/4 v0, -0x1

    sput v0, Lcom/qihoo/security/app/a;->b:I

    .line 72
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    sput v0, Lcom/qihoo/security/app/a;->c:I

    .line 74
    const/4 v0, 0x0

    sput v0, Lcom/qihoo/security/app/a;->d:I

    .line 75
    const/4 v0, 0x1

    sput v0, Lcom/qihoo/security/app/a;->e:I

    .line 76
    const/4 v0, 0x2

    sput v0, Lcom/qihoo/security/app/a;->f:I

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    new-instance v0, Lcom/qihoo/security/app/a$c;

    invoke-direct {v0}, Lcom/qihoo/security/app/a$c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    .line 289
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    .line 298
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/app/a;->n:Z

    .line 237
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/a;->i:Landroid/content/Context;

    .line 238
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 239
    iget-object v1, p0, Lcom/qihoo/security/app/a;->i:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 240
    new-instance v1, Landroid/os/HandlerThread;

    const-string/jumbo v2, "BoosterHelper"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 241
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 243
    new-instance v2, Lcom/qihoo/security/app/a$1;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/app/a$1;-><init>(Lcom/qihoo/security/app/a;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    .line 251
    new-instance v1, Lcom/qihoo/security/app/a$a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/app/a$a;-><init>(Lcom/qihoo/security/app/a;)V

    iput-object v1, p0, Lcom/qihoo/security/app/a;->j:Lcom/qihoo/security/app/a$a;

    .line 252
    iget-object v1, p0, Lcom/qihoo/security/app/a;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/app/a;->j:Lcom/qihoo/security/app/a$a;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 254
    new-instance v0, Lcom/qihoo/security/app/a$2;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/app/a$2;-><init>(Lcom/qihoo/security/app/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/app/a;->l:Landroid/os/Handler;

    .line 260
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/app/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/qihoo/security/app/a;
    .locals 2

    .prologue
    .line 221
    const-class v1, Lcom/qihoo/security/app/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/app/a;->g:Lcom/qihoo/security/app/a;

    if-nez v0, :cond_0

    .line 222
    new-instance v0, Lcom/qihoo/security/app/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/app/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/app/a;->g:Lcom/qihoo/security/app/a;

    .line 224
    :cond_0
    sget-object v0, Lcom/qihoo/security/app/a;->g:Lcom/qihoo/security/app/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 221
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 519
    const-string/jumbo v0, "key_boost_is_fastest"

    invoke-static {p0, v0, p1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 520
    return-void
.end method

.method private a(Landroid/os/Message;Landroid/os/Handler;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 302
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    if-ne p2, v2, :cond_3

    .line 303
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 406
    :cond_0
    :goto_0
    return-void

    .line 305
    :pswitch_0
    iget-object v2, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v2, :cond_2

    .line 309
    invoke-virtual {p0}, Lcom/qihoo/security/app/a;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 313
    iget-object v2, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    iget v3, p1, Landroid/os/Message;->arg1:I

    if-ne v3, v0, :cond_1

    :goto_1
    invoke-interface {v2, v0}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Z)V

    goto :goto_0

    .line 400
    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 313
    goto :goto_1

    .line 316
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/app/a;->n:Z

    goto :goto_0

    .line 324
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/IBinder;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 325
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/app/a;->j:Lcom/qihoo/security/app/a$a;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Lcom/qihoo360/mobilesafe/core/c/a;)V

    .line 326
    iget-boolean v0, p0, Lcom/qihoo/security/app/a;->n:Z

    if-eqz v0, :cond_0

    .line 330
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/app/a;->n:Z

    .line 331
    invoke-virtual {p0}, Lcom/qihoo/security/app/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Z)V

    goto :goto_0

    .line 341
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/app/a;->j:Lcom/qihoo/security/app/a$a;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V

    goto :goto_0

    .line 346
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->e()V

    .line 351
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V

    goto :goto_0

    .line 361
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 367
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/app/a$c;

    .line 368
    iget-object v2, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 369
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 370
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/app/a$b;

    .line 371
    if-eqz v1, :cond_4

    .line 375
    iget-object v4, v0, Lcom/qihoo/security/app/a$c;->a:Ljava/util/List;

    iget-object v5, v0, Lcom/qihoo/security/app/a$c;->b:Ljava/util/Map;

    invoke-interface {v1, v4, v5}, Lcom/qihoo/security/app/a$b;->a(Ljava/util/List;Ljava/util/Map;)V

    goto :goto_2

    .line 378
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_5
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 385
    :pswitch_5
    :try_start_4
    iget-object v1, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    monitor-enter v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 386
    :try_start_5
    iget-object v0, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 387
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/app/a$b;

    .line 388
    if-eqz v0, :cond_6

    .line 392
    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v4, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v3, v4}, Lcom/qihoo/security/app/a$b;->a(II)V

    goto :goto_3

    .line 395
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :cond_7
    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto/16 :goto_0

    .line 303
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 361
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/app/a;Landroid/os/Message;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/app/a;->a(Landroid/os/Message;Landroid/os/Handler;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/app/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/qihoo/security/app/a;->l:Landroid/os/Handler;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 515
    const-string/jumbo v0, "key_boost_is_fastest"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/app/a$b;)V
    .locals 3

    .prologue
    .line 415
    iget-object v1, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    monitor-enter v1

    .line 416
    :try_start_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 417
    iget-object v2, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 418
    monitor-exit v1

    .line 419
    return-void

    .line 418
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Z)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 447
    iget-object v1, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v1

    .line 448
    iput v0, v1, Landroid/os/Message;->what:I

    .line 449
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 450
    iget-object v0, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 452
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 460
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 462
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->f()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 470
    :goto_0
    return v0

    .line 463
    :catch_0
    move-exception v0

    .line 470
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/qihoo/security/app/a$b;)V
    .locals 3

    .prologue
    .line 422
    iget-object v1, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    monitor-enter v1

    .line 423
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 424
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 425
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 426
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/app/a$b;

    .line 427
    if-nez v0, :cond_1

    .line 428
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 435
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 430
    :cond_1
    if-ne v0, p1, :cond_0

    .line 431
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 435
    :cond_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 436
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 479
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 481
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->g()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 488
    :goto_0
    return v0

    .line 482
    :catch_0
    move-exception v0

    .line 488
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 492
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 494
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/app/a;->h:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->i()J
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 501
    :goto_0
    return-wide v0

    .line 495
    :catch_0
    move-exception v0

    .line 501
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 505
    iget-object v0, p0, Lcom/qihoo/security/app/a;->k:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 506
    return-void
.end method

.method public e()Lcom/qihoo/security/app/a$c;
    .locals 3

    .prologue
    .line 509
    iget-object v1, p0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    monitor-enter v1

    .line 510
    :try_start_0
    new-instance v0, Lcom/qihoo/security/app/a$c;

    iget-object v2, p0, Lcom/qihoo/security/app/a;->a:Lcom/qihoo/security/app/a$c;

    invoke-direct {v0, v2}, Lcom/qihoo/security/app/a$c;-><init>(Lcom/qihoo/security/app/a$c;)V

    monitor-exit v1

    return-object v0

    .line 511
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
