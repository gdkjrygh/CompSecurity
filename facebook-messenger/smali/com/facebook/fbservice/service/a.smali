.class public Lcom/facebook/fbservice/service/a;
.super Lcom/facebook/base/d/b;
.source "BlueService.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/fbservice/service/b;

.field private c:Lcom/facebook/fbservice/service/o;

.field private d:Lcom/facebook/fbservice/service/p;

.field private e:Lcom/facebook/auth/viewercontext/e;

.field private f:Lcom/facebook/common/e/h;

.field private g:Lcom/facebook/prefs/shared/d;

.field private h:Lcom/facebook/analytics/av;

.field private i:Lcom/facebook/common/process/d;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class;",
            "Lcom/facebook/fbservice/service/h;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final k:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const-class v0, Lcom/facebook/fbservice/service/a;

    sput-object v0, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/base/d/b;-><init>()V

    .line 69
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    .line 72
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 326
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/os/RemoteException;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xf
    .end annotation

    .prologue
    .line 300
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-lt v0, v1, :cond_0

    .line 301
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0, p1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 303
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    goto :goto_0
.end method

.method private a(Ljava/lang/Class;Ljavax/inject/a;Ljavax/inject/a;)Lcom/facebook/fbservice/service/h;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/fbservice/service/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/fbservice/service/n;",
            ">;>;)",
            "Lcom/facebook/fbservice/service/h;"
        }
    .end annotation

    .prologue
    .line 253
    new-instance v0, Lcom/facebook/fbservice/service/h;

    new-instance v4, Lcom/facebook/fbservice/service/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BlueServiceQueue - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/facebook/fbservice/service/c;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/facebook/fbservice/service/a;->c:Lcom/facebook/fbservice/service/o;

    iget-object v6, p0, Lcom/facebook/fbservice/service/a;->e:Lcom/facebook/auth/viewercontext/e;

    iget-object v7, p0, Lcom/facebook/fbservice/service/a;->f:Lcom/facebook/common/e/h;

    iget-object v8, p0, Lcom/facebook/fbservice/service/a;->g:Lcom/facebook/prefs/shared/d;

    iget-object v9, p0, Lcom/facebook/fbservice/service/a;->h:Lcom/facebook/analytics/av;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v10

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v10}, Lcom/facebook/fbservice/service/h;-><init>(Ljava/lang/Class;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/fbservice/service/o;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/e/h;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method private declared-synchronized a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 155
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->c:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/o;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 160
    :cond_0
    if-eqz p2, :cond_1

    .line 161
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/fbservice/service/a;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 164
    :cond_1
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 166
    if-eqz p2, :cond_3

    .line 167
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->d:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/p;->b(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 168
    const-class v1, Lcom/facebook/fbservice/service/LocalQueueSet;

    if-ne v0, v1, :cond_3

    .line 169
    const-string v0, "calling_process_name"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 170
    iget-object v1, p0, Lcom/facebook/fbservice/service/a;->i:Lcom/facebook/common/process/d;

    invoke-interface {v1}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lcom/facebook/common/process/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 172
    const-string v1, "startOperation(%s, %s) called in process %s; expected process %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/facebook/fbservice/service/a;->i:Lcom/facebook/common/process/d;

    invoke-interface {v4}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 175
    sget-object v1, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 176
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v0

    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    :catch_0
    move-exception v0

    .line 236
    :try_start_2
    sget-object v1, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error occurred in startOperation("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error occurred in startOperation("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "), exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 239
    iget-object v2, p0, Lcom/facebook/fbservice/service/a;->f:Lcom/facebook/common/e/h;

    const-string v3, "BlueService"

    invoke-interface {v2, v3, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xf

    if-lt v2, v3, :cond_8

    .line 241
    invoke-direct {p0, v1}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->d:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/common/process/c;)Ljava/lang/Class;

    move-result-object v0

    .line 180
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_3

    .line 182
    const-string v1, "startOperation(%s, %s) called in service %s; expected service %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v0

    throw v0

    .line 190
    :cond_3
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->d:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v1

    .line 191
    if-nez v1, :cond_4

    .line 193
    const-string v0, "startOperation(%s, %s) called but no queue registered for type %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 196
    sget-object v1, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 197
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v0

    throw v0

    .line 200
    :cond_4
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->d:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/p;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    .line 201
    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v2, v0, :cond_5

    .line 203
    const-string v1, "startOperation(%s, %s) called in service %s; expected service %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 206
    sget-object v1, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 207
    invoke-direct {p0, v0}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;)Landroid/os/RemoteException;

    move-result-object v0

    throw v0

    .line 210
    :cond_5
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/h;

    .line 211
    if-nez v0, :cond_6

    .line 212
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 213
    const-class v2, Lcom/facebook/fbservice/service/e;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    .line 216
    const-class v3, Lcom/facebook/fbservice/service/n;

    invoke-static {v3, v1}, Lcom/google/inject/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/inject/a;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/inject/t;->d(Lcom/google/inject/a;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 217
    const-class v3, Lcom/facebook/fbservice/service/n;

    invoke-virtual {v0, v3, v1}, Lcom/facebook/inject/t;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    .line 222
    :goto_0
    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/Class;Ljavax/inject/a;Ljavax/inject/a;)Lcom/facebook/fbservice/service/h;

    move-result-object v0

    .line 227
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/h;->b()V

    .line 228
    iget-object v2, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    :cond_6
    iget-object v1, p0, Lcom/facebook/fbservice/service/a;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 232
    new-instance v2, Lcom/facebook/fbservice/service/ac;

    invoke-direct {v2, v1, p1, p2}, Lcom/facebook/fbservice/service/ac;-><init>(Ljava/lang/String;Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 233
    invoke-virtual {v0, v2}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/ac;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 234
    monitor-exit p0

    return-object v1

    .line 219
    :cond_7
    :try_start_4
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/b/a;->a(Ljava/lang/Object;)Ljavax/inject/a;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 243
    :cond_8
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/a;Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/a;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/fbservice/service/a;Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/facebook/fbservice/service/a;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z
    .locals 4

    .prologue
    .line 269
    const/4 v1, 0x0

    .line 270
    monitor-enter p0

    .line 271
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/h;

    .line 272
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/h;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 277
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    if-eqz v0, :cond_1

    .line 281
    invoke-virtual {v0, p1, p2}, Lcom/facebook/fbservice/service/h;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z

    move-result v0

    .line 282
    if-eqz v0, :cond_1

    .line 283
    const/4 v0, 0x1

    .line 288
    :goto_1
    return v0

    .line 277
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 288
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->b:Lcom/facebook/fbservice/service/b;

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 76
    invoke-super {p0}, Lcom/facebook/base/d/b;->onCreate()V

    .line 78
    sget-object v0, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p0}, Lcom/facebook/fbservice/service/a;->a()Lcom/facebook/inject/t;

    move-result-object v1

    .line 81
    new-instance v0, Lcom/facebook/fbservice/service/b;

    invoke-direct {v0, p0}, Lcom/facebook/fbservice/service/b;-><init>(Lcom/facebook/fbservice/service/a;)V

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->b:Lcom/facebook/fbservice/service/b;

    .line 82
    const-class v0, Lcom/facebook/fbservice/service/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/o;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->c:Lcom/facebook/fbservice/service/o;

    .line 83
    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->d:Lcom/facebook/fbservice/service/p;

    .line 84
    const-class v0, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/e;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->e:Lcom/facebook/auth/viewercontext/e;

    .line 85
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->f:Lcom/facebook/common/e/h;

    .line 86
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->g:Lcom/facebook/prefs/shared/d;

    .line 87
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->h:Lcom/facebook/analytics/av;

    .line 88
    const-class v0, Lcom/facebook/common/process/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/process/d;

    iput-object v0, p0, Lcom/facebook/fbservice/service/a;->i:Lcom/facebook/common/process/d;

    .line 89
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 93
    invoke-super {p0}, Lcom/facebook/base/d/b;->onDestroy()V

    .line 94
    sget-object v0, Lcom/facebook/fbservice/service/a;->a:Ljava/lang/Class;

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 96
    monitor-enter p0

    .line 97
    :try_start_0
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/h;

    .line 98
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/h;->c()V

    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 100
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 101
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    return-void
.end method

.method public onRebind(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 149
    invoke-super {p0, p1}, Lcom/facebook/base/d/b;->onRebind(Landroid/content/Intent;)V

    .line 150
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 110
    if-nez p1, :cond_0

    .line 133
    :goto_0
    return v2

    .line 114
    :cond_0
    monitor-enter p0

    .line 115
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 116
    const-string v1, "Orca.START"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 132
    :cond_1
    :goto_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 118
    :cond_2
    :try_start_1
    const-string v1, "Orca.STOP"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 124
    invoke-virtual {p0, p3}, Lcom/facebook/fbservice/service/a;->stopSelf(I)V

    goto :goto_1

    .line 125
    :cond_3
    const-string v1, "Orca.DRAIN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/h;

    .line 128
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/h;->c()V

    goto :goto_2

    .line 130
    :cond_4
    iget-object v0, p0, Lcom/facebook/fbservice/service/a;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 143
    invoke-super {p0, p1}, Lcom/facebook/base/d/b;->onUnbind(Landroid/content/Intent;)Z

    .line 144
    const/4 v0, 0x1

    return v0
.end method
