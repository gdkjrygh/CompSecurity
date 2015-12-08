.class public abstract Lcom/google/android/gms/internal/hb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$a;
.implements Lcom/google/android/gms/internal/hc$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/hb$e;,
        Lcom/google/android/gms/internal/hb$h;,
        Lcom/google/android/gms/internal/hb$g;,
        Lcom/google/android/gms/internal/hb$c;,
        Lcom/google/android/gms/internal/hb$d;,
        Lcom/google/android/gms/internal/hb$b;,
        Lcom/google/android/gms/internal/hb$a;,
        Lcom/google/android/gms/internal/hb$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/Api$a;",
        "Lcom/google/android/gms/internal/hc$b;"
    }
.end annotation


# static fields
.field public static final Gh:[Ljava/lang/String;


# instance fields
.field private final DF:Landroid/os/Looper;

.field private final DS:Lcom/google/android/gms/internal/hc;

.field private Gb:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final Gc:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/internal/hb",
            "<TT;>.b<*>;>;"
        }
    .end annotation
.end field

.field private Gd:Lcom/google/android/gms/internal/hb$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hb",
            "<TT;>.f;"
        }
    .end annotation
.end field

.field private volatile Ge:I

.field private final Gf:[Ljava/lang/String;

.field Gg:Z

.field private final mContext:Landroid/content/Context;

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

    sput-object v0, Lcom/google/android/gms/internal/hb;->Gh:[Ljava/lang/String;

    return-void
.end method

.method protected varargs constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/hb;->Ge:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hb;->Gg:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    const-string v0, "Looper must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/hm;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->DF:Landroid/os/Looper;

    new-instance v0, Lcom/google/android/gms/internal/hc;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/hc;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/internal/hc$b;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    new-instance v0, Lcom/google/android/gms/internal/hb$a;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/hb$a;-><init>(Lcom/google/android/gms/internal/hb;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/hb;->b([Ljava/lang/String;)V

    iput-object p5, p0, Lcom/google/android/gms/internal/hb;->Gf:[Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hb;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    invoke-static {p4}, Lcom/google/android/gms/internal/hm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hb;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    return-void
.end method

.method protected varargs constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/hb$c;

    invoke-direct {v3, p2}, Lcom/google/android/gms/internal/hb$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    new-instance v4, Lcom/google/android/gms/internal/hb$g;

    invoke-direct {v4, p3}, Lcom/google/android/gms/internal/hb$g;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    move-object v0, p0

    move-object v1, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hb;Landroid/os/IInterface;)Landroid/os/IInterface;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hb;->Gb:Landroid/os/IInterface;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/hb$f;)Lcom/google/android/gms/internal/hb$f;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hb;)Lcom/google/android/gms/internal/hc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hb;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hb;->am(I)V

    return-void
.end method

.method private am(I)V
    .locals 2

    const/4 v1, 0x3

    iget v0, p0, Lcom/google/android/gms/internal/hb;->Ge:I

    iput p1, p0, Lcom/google/android/gms/internal/hb;->Ge:I

    if-eq v0, p1, :cond_0

    if-ne p1, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->onConnected()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->onDisconnected()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/hb;)Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/hb;)Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gb:Landroid/os/IInterface;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/hb;)Lcom/google/android/gms/internal/hb$f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/hb;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method protected final I(Landroid/os/IBinder;)V
    .locals 2

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/hi$a;->L(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hi;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hb$e;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hb$e;-><init>(Lcom/google/android/gms/internal/hb;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/hb;->a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
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

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    new-instance v3, Lcom/google/android/gms/internal/hb$h;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/internal/hb$h;-><init>(Lcom/google/android/gms/internal/hb;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/hb$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/hb",
            "<TT;>.b<*>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

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

.method protected abstract a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public an(I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected varargs b([Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected abstract bu()Ljava/lang/String;
.end method

.method protected abstract bv()Ljava/lang/String;
.end method

.method protected final cn()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public connect()V
    .locals 4

    const/4 v3, 0x3

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/hb;->Gg:Z

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hb;->am(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/hb;->am(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    if-eqz v0, :cond_2

    const-string v0, "GmsClient"

    const-string v1, "Calling connect() while still connected, missing disconnect()."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->Gb:Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/hd;->E(Landroid/content/Context;)Lcom/google/android/gms/internal/hd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->bu()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hd;->b(Ljava/lang/String;Lcom/google/android/gms/internal/hb$f;)V

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/hb$f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hb$f;-><init>(Lcom/google/android/gms/internal/hb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/hd;->E(Landroid/content/Context;)Lcom/google/android/gms/internal/hd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->bu()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hd;->a(Ljava/lang/String;Lcom/google/android/gms/internal/hb$f;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GmsClient"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unable to connect to service: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->bu()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public disconnect()V
    .locals 5

    const/4 v4, 0x0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hb;->Gg:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hb$b;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hb$b;->fw()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gc:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hb;->am(I)V

    iput-object v4, p0, Lcom/google/android/gms/internal/hb;->Gb:Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/hd;->E(Landroid/content/Context;)Lcom/google/android/gms/internal/hd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->bu()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hd;->b(Ljava/lang/String;Lcom/google/android/gms/internal/hb$f;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/hb;->Gd:Lcom/google/android/gms/internal/hb$f;

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

.method public eO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hb;->Gg:Z

    return v0
.end method

.method public ef()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final fs()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gf:[Ljava/lang/String;

    return-object v0
.end method

.method public final ft()Landroid/os/IInterface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hb;->cn()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->Gb:Landroid/os/IInterface;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DF:Landroid/os/Looper;

    return-object v0
.end method

.method public isConnected()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/hb;->Ge:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isConnecting()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/hb;->Ge:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    new-instance v1, Lcom/google/android/gms/internal/hb$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/hb$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hc;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z

    move-result v0

    return v0
.end method

.method public isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hc;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z

    move-result v0

    return v0
.end method

.method protected onConnected()V
    .locals 0

    return-void
.end method

.method protected onDisconnected()V
    .locals 0

    return-void
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    new-instance v1, Lcom/google/android/gms/internal/hb$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/hb$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hc;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hc;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hc;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hc;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method public unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    .locals 2
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    new-instance v1, Lcom/google/android/gms/internal/hb$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/hb$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hc;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    return-void
.end method

.method public unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/hb;, "Lcom/google/android/gms/internal/hb<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->DS:Lcom/google/android/gms/internal/hc;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hc;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V

    return-void
.end method

.method protected abstract x(Landroid/os/IBinder;)Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")TT;"
        }
    .end annotation
.end method
