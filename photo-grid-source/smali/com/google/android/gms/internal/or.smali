.class public final Lcom/google/android/gms/internal/or;
.super Lcom/google/android/gms/ads/internal/reward/mediation/client/zza$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/op;

.field private b:Lcom/google/android/gms/internal/os;

.field private c:Lcom/google/android/gms/internal/oq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/oq;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/reward/mediation/client/zza$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/op;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/or;->a:Lcom/google/android/gms/internal/op;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/os;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/or;->b:Lcom/google/android/gms/internal/os;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/b/a;Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/oq;->a(Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V

    :cond_0
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/b/a;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->a:Lcom/google/android/gms/internal/op;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->a:Lcom/google/android/gms/internal/op;

    invoke-interface {v0}, Lcom/google/android/gms/internal/op;->b()V

    :cond_0
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/b/a;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->b:Lcom/google/android/gms/internal/os;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->b:Lcom/google/android/gms/internal/os;

    invoke-static {p1}, Lcom/google/android/gms/b/d;->a(Lcom/google/android/gms/b/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/os;->a(I)V

    :cond_0
    return-void
.end method

.method public final zzg(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->a:Lcom/google/android/gms/internal/op;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->a:Lcom/google/android/gms/internal/op;

    invoke-interface {v0}, Lcom/google/android/gms/internal/op;->a()V

    :cond_0
    return-void
.end method

.method public final zzh(Lcom/google/android/gms/b/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->b:Lcom/google/android/gms/internal/os;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->b:Lcom/google/android/gms/internal/os;

    invoke-static {p1}, Lcom/google/android/gms/b/d;->a(Lcom/google/android/gms/b/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/os;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final zzi(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/oq;->g()V

    :cond_0
    return-void
.end method

.method public final zzj(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/oq;->h()V

    :cond_0
    return-void
.end method

.method public final zzk(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/oq;->i()V

    :cond_0
    return-void
.end method

.method public final zzl(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/oq;->j()V

    :cond_0
    return-void
.end method

.method public final zzm(Lcom/google/android/gms/b/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/or;->c:Lcom/google/android/gms/internal/oq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/oq;->k()V

    :cond_0
    return-void
.end method
