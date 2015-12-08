.class final Lcom/google/android/gms/internal/nk$b;
.super Lcom/google/android/gms/internal/nh$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/nk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private ahc:Lcom/google/android/gms/location/c$a;

.field private ahd:Lcom/google/android/gms/location/c$b;

.field private ahe:Lcom/google/android/gms/internal/nk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/location/c$a;Lcom/google/android/gms/internal/nk;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/nh$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/c$b;Lcom/google/android/gms/internal/nk;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/nh$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    return-void
.end method


# virtual methods
.method public a(ILandroid/app/PendingIntent;)V
    .locals 8

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    if-nez v0, :cond_0

    const-string v0, "LocationClientImpl"

    const-string v1, "onRemoveGeofencesByPendingIntentResult called multiple times"

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v6, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    new-instance v0, Lcom/google/android/gms/internal/nk$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/nk$c;-><init>(Lcom/google/android/gms/internal/nk;ILcom/google/android/gms/location/c$b;ILandroid/app/PendingIntent;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/internal/jl$b;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    goto :goto_0
.end method

.method public a(I[Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    if-nez v0, :cond_0

    const-string v0, "LocationClientImpl"

    const-string v1, "onAddGeofenceResult called multiple times"

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    new-instance v1, Lcom/google/android/gms/internal/nk$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/nk$a;-><init>(Lcom/google/android/gms/internal/nk;Lcom/google/android/gms/location/c$a;I[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/internal/jl$b;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    iput-object v4, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    iput-object v4, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    goto :goto_0
.end method

.method public b(I[Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    if-nez v0, :cond_0

    const-string v0, "LocationClientImpl"

    const-string v1, "onRemoveGeofencesByRequestIdsResult called multiple times"

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v6, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    new-instance v0, Lcom/google/android/gms/internal/nk$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/nk$c;-><init>(Lcom/google/android/gms/internal/nk;ILcom/google/android/gms/location/c$b;I[Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/internal/jl$b;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahe:Lcom/google/android/gms/internal/nk;

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahc:Lcom/google/android/gms/location/c$a;

    iput-object v7, p0, Lcom/google/android/gms/internal/nk$b;->ahd:Lcom/google/android/gms/location/c$b;

    goto :goto_0
.end method
