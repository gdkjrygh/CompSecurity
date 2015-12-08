.class public abstract Lcom/google/android/gms/internal/jl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$a;
.implements Lcom/google/android/gms/internal/jm$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/jl$e;,
        Lcom/google/android/gms/internal/jl$h;,
        Lcom/google/android/gms/internal/jl$g;,
        Lcom/google/android/gms/internal/jl$c;,
        Lcom/google/android/gms/internal/jl$d;,
        Lcom/google/android/gms/internal/jl$b;,
        Lcom/google/android/gms/internal/jl$a;,
        Lcom/google/android/gms/internal/jl$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/Api$a;",
        "Lcom/google/android/gms/internal/jm$b;"
    }
.end annotation


# static fields
.field public static final MP:[Ljava/lang/String;


# instance fields
.field private final JF:Landroid/os/Looper;

.field private final JS:Lcom/google/android/gms/internal/jm;

.field private MJ:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final MK:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/internal/jl",
            "<TT;>.b<*>;>;"
        }
    .end annotation
.end field

.field private ML:Lcom/google/android/gms/internal/jl$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jl",
            "<TT;>.f;"
        }
    .end annotation
.end field

.field private MM:I

.field private final MN:[Ljava/lang/String;

.field MO:Z

.field private final mContext:Landroid/content/Context;

.field private final mH:Ljava/lang/Object;

.field final mHandler:Landroid/os/Handler;


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

    sput-object v0, Lcom/google/android/gms/internal/jl;->MP:[Ljava/lang/String;

    return-void
.end method

.method protected varargs constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/jl;->MM:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/jl;->MO:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    const-string v0, "Looper must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->JF:Landroid/os/Looper;

    new-instance v0, Lcom/google/android/gms/internal/jm;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/jm;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/jm$b;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    new-instance v0, Lcom/google/android/gms/internal/jl$a;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/jl$a;-><init>(Lcom/google/android/gms/internal/jl;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/jl;->c([Ljava/lang/String;)V

    iput-object p5, p0, Lcom/google/android/gms/internal/jl;->MN:[Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jl;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    invoke-static {p4}, Lcom/google/android/gms/internal/jx;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jl;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    return-void
.end method

.method protected varargs constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/jl$c;

    invoke-direct {v3, p2}, Lcom/google/android/gms/internal/jl$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    new-instance v4, Lcom/google/android/gms/internal/jl$g;

    invoke-direct {v4, p3}, Lcom/google/android/gms/internal/jl$g;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    move-object v0, p0

    move-object v1, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/jl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/jl;Lcom/google/android/gms/internal/jl$f;)Lcom/google/android/gms/internal/jl$f;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/jl;)Lcom/google/android/gms/internal/jm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    return-object v0
.end method

.method private a(ILandroid/os/IInterface;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-ne p1, v2, :cond_0

    move v3, v0

    :goto_0
    if-eqz p2, :cond_1

    move v2, v0

    :goto_1
    if-ne v3, v2, :cond_2

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/internal/jx;->L(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/jl;->MM:I

    iput-object p2, p0, Lcom/google/android/gms/internal/jl;->MJ:Landroid/os/IInterface;

    monitor-exit v1

    return-void

    :cond_0
    move v3, v1

    goto :goto_0

    :cond_1
    move v2, v1

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/jl;ILandroid/os/IInterface;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/jl;->a(ILandroid/os/IInterface;)V

    return-void
.end method

.method private a(IILandroid/os/IInterface;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IITT;)Z"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/jl;->MM:I

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    monitor-exit v1

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/jl;->a(ILandroid/os/IInterface;)V

    const/4 v0, 0x1

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/jl;IILandroid/os/IInterface;)Z
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/jl;->a(IILandroid/os/IInterface;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/jl;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/jl;)Lcom/google/android/gms/internal/jl$f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/jl;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method protected final N(Landroid/os/IBinder;)V
    .locals 3

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/jt$a;->Q(Landroid/os/IBinder;)Lcom/google/android/gms/internal/jt;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/jl$e;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/jl$e;-><init>(Lcom/google/android/gms/internal/jl;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/jl;->a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/jl$e;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GmsClient"

    const-string v1, "service died"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jl;->aD(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "GmsClient"

    const-string v2, "Remote exception occurred"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    new-instance v3, Lcom/google/android/gms/internal/jl$h;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/internal/jl$h;-><init>(Lcom/google/android/gms/internal/jl;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/jl$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jl",
            "<TT;>.b<*>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected abstract a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/jl$e;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public aD(I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected abstract bK()Ljava/lang/String;
.end method

.method protected abstract bL()Ljava/lang/String;
.end method

.method protected varargs c([Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public connect()V
    .locals 4

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/jl;->MO:Z

    const/4 v0, 0x2

    invoke-direct {p0, v0, v2}, Lcom/google/android/gms/internal/jl;->a(ILandroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/jl;->a(ILandroid/os/IInterface;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    if-eqz v0, :cond_2

    const-string v0, "GmsClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calling connect() while still connected, missing disconnect() for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->bK()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/jn;->J(Landroid/content/Context;)Lcom/google/android/gms/internal/jn;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->bK()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/jn;->b(Ljava/lang/String;Lcom/google/android/gms/internal/jl$f;)V

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/jl$f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/jl$f;-><init>(Lcom/google/android/gms/internal/jl;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/jn;->J(Landroid/content/Context;)Lcom/google/android/gms/internal/jn;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->bK()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/jn;->a(Ljava/lang/String;Lcom/google/android/gms/internal/jl$f;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GmsClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unable to connect to service: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->bK()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method protected final dS()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public disconnect()V
    .locals 5

    const/4 v4, 0x0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/jl;->MO:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/jl$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jl$b;->hz()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MK:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    invoke-direct {p0, v0, v4}, Lcom/google/android/gms/internal/jl;->a(ILandroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/jn;->J(Landroid/content/Context;)Lcom/google/android/gms/internal/jn;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->bK()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/jn;->b(Ljava/lang/String;Lcom/google/android/gms/internal/jl$f;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/jl;->ML:Lcom/google/android/gms/internal/jl$f;

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public fX()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public gN()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jl;->MO:Z

    return v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JF:Landroid/os/Looper;

    return-object v0
.end method

.method public final hv()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MN:[Ljava/lang/String;

    return-object v0
.end method

.method public final hw()Landroid/os/IInterface;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/jl;->MM:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    new-instance v0, Landroid/os/DeadObjectException;

    invoke-direct {v0}, Landroid/os/DeadObjectException;-><init>()V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/jl;->dS()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MJ:Landroid/os/IInterface;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Client is connected but service is null"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/jx;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->MJ:Landroid/os/IInterface;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isConnected()Z
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/jl;->MM:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isConnecting()Z
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/jl;->mH:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/jl;->MM:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    new-instance v1, Lcom/google/android/gms/internal/jl$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/jl$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jm;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z

    move-result v0

    return v0
.end method

.method public isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jm;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z

    move-result v0

    return v0
.end method

.method protected abstract l(Landroid/os/IBinder;)Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")TT;"
        }
    .end annotation
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    new-instance v1, Lcom/google/android/gms/internal/jl$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/jl$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jm;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jm;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jm;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jm;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    new-instance v1, Lcom/google/android/gms/internal/jl$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/jl$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jm;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/jl;, "Lcom/google/android/gms/internal/jl<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/jl;->JS:Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jm;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method
