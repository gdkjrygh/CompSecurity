.class public abstract Lcom/google/android/gms/internal/fr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/b;
.implements Lcom/google/android/gms/internal/gc;


# static fields
.field public static final c:[Ljava/lang/String;


# instance fields
.field final a:Landroid/os/Handler;

.field b:Z

.field private final d:Landroid/content/Context;

.field private final e:Landroid/os/Looper;

.field private f:Landroid/os/IInterface;

.field private final g:Ljava/util/ArrayList;

.field private h:Lcom/google/android/gms/internal/fw;

.field private volatile i:I

.field private final j:[Ljava/lang/String;

.field private final k:Lcom/google/android/gms/internal/ga;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "service_esmobile"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "service_googleme"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/fr;->c:[Ljava/lang/String;

    return-void
.end method

.method private varargs constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/api/c;[Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/fr;->i:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fr;->b:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    const-string v0, "Looper must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->e:Landroid/os/Looper;

    new-instance v0, Lcom/google/android/gms/internal/ga;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/ga;-><init>(Landroid/os/Looper;Lcom/google/android/gms/internal/gc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->k:Lcom/google/android/gms/internal/ga;

    new-instance v0, Lcom/google/android/gms/internal/fs;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/fs;-><init>(Lcom/google/android/gms/internal/fr;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    iput-object p5, p0, Lcom/google/android/gms/internal/fr;->j:[Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->k:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/common/api/b;)V

    invoke-static {p4}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->k:Lcom/google/android/gms/internal/ga;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ga;->a(Lcom/google/android/gms/common/d;)V

    return-void
.end method

.method protected varargs constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/c;Lcom/google/android/gms/common/d;[Ljava/lang/String;)V
    .locals 6

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/fu;

    invoke-direct {v3, p2}, Lcom/google/android/gms/internal/fu;-><init>(Lcom/google/android/gms/common/c;)V

    new-instance v4, Lcom/google/android/gms/internal/fx;

    invoke-direct {v4, p3}, Lcom/google/android/gms/internal/fx;-><init>(Lcom/google/android/gms/common/d;)V

    move-object v0, p0

    move-object v1, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fr;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/common/api/c;[Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fr;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/fr;->i:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fr;Landroid/os/IInterface;)Landroid/os/IInterface;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fr;->f:Landroid/os/IInterface;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/fr;)Lcom/google/android/gms/internal/ga;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->k:Lcom/google/android/gms/internal/ga;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/fr;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/fr;)Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->f:Landroid/os/IInterface;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/fr;)Lcom/google/android/gms/internal/fw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/fr;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/fr;)Lcom/google/android/gms/internal/fw;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    return-object v0
.end method


# virtual methods
.method protected abstract a(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method protected abstract a()Ljava/lang/String;
.end method

.method protected final a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    const/4 v2, 0x1

    new-instance v3, Lcom/google/android/gms/internal/fz;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/fr;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/gk;Lcom/google/android/gms/internal/fv;)V
.end method

.method protected abstract b()Ljava/lang/String;
.end method

.method protected final b(Landroid/os/IBinder;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/gl;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/gk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/fv;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/fv;-><init>(Lcom/google/android/gms/internal/fr;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/fr;->a(Lcom/google/android/gms/internal/gk;Lcom/google/android/gms/internal/fv;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GmsClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final d()V
    .locals 4

    const/4 v3, 0x3

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/fr;->b:Z

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/fr;->i:I

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/g;->a(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    iput v1, p0, Lcom/google/android/gms/internal/fr;->i:I

    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    if-eqz v0, :cond_2

    const-string v0, "GmsClient"

    const-string v1, "Calling connect() while still connected, missing disconnect()."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->f:Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/gd;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/gd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fr;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gd;->b(Ljava/lang/String;Lcom/google/android/gms/internal/fw;)V

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/fw;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fw;-><init>(Lcom/google/android/gms/internal/fr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/gd;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/gd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fr;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gd;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fw;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GmsClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to connect to service: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fr;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->a:Landroid/os/Handler;

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public final e()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/fr;->i:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/fr;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()V
    .locals 5

    const/4 v4, 0x0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/fr;->b:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ft;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ft;->c()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/fr;->i:I

    iput-object v4, p0, Lcom/google/android/gms/internal/fr;->f:Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/gd;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/gd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fr;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gd;->b(Ljava/lang/String;Lcom/google/android/gms/internal/fw;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/fr;->h:Lcom/google/android/gms/internal/fw;

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public final h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->d:Landroid/content/Context;

    return-object v0
.end method

.method protected final i()Landroid/os/IInterface;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/fr;->e()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fr;->f:Landroid/os/IInterface;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/fr;->b:Z

    return v0
.end method
