.class public final Lcom/google/android/gms/internal/s;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/az;

.field private final b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/ads/a;

.field private d:Lcom/google/android/gms/internal/g;

.field private e:Ljava/lang/String;

.field private f:Lcom/google/android/gms/ads/doubleclick/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/az;

    invoke-direct {v0}, Lcom/google/android/gms/internal/az;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/s;->a:Lcom/google/android/gms/internal/az;

    iput-object p1, p0, Lcom/google/android/gms/internal/s;->b:Landroid/content/Context;

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The ad unit ID must be set on InterstitialAd before "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/s;->c:Lcom/google/android/gms/ads/a;

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/lo;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/lo;-><init>(Lcom/google/android/gms/ads/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/g;->a(Lcom/google/android/gms/internal/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/google/android/gms/internal/p;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    if-nez v0, :cond_2

    const-string v0, "loadAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/s;->e:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/s;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/s;->b:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ab;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ab;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/s;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/s;->a:Lcom/google/android/gms/internal/az;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/lp;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Lcom/google/android/gms/internal/az;)Lcom/google/android/gms/internal/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->c:Lcom/google/android/gms/ads/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    new-instance v1, Lcom/google/android/gms/internal/lo;

    iget-object v2, p0, Lcom/google/android/gms/internal/s;->c:Lcom/google/android/gms/ads/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/lo;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/g;->a(Lcom/google/android/gms/internal/d;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/s;->f:Lcom/google/android/gms/ads/doubleclick/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    new-instance v1, Lcom/google/android/gms/internal/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/s;->f:Lcom/google/android/gms/ads/doubleclick/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/c;-><init>(Lcom/google/android/gms/ads/doubleclick/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/g;->a(Lcom/google/android/gms/internal/m;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    new-instance v1, Lcom/google/android/gms/internal/z;

    iget-object v2, p0, Lcom/google/android/gms/internal/s;->b:Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/z;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/p;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/g;->a(Lcom/google/android/gms/internal/z;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->a:Lcom/google/android/gms/internal/az;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/p;->i()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/az;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/s;->e:Ljava/lang/String;

    return-void
.end method

.method public final a()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    invoke-interface {v1}, Lcom/google/android/gms/internal/g;->c()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/s;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/s;->d:Lcom/google/android/gms/internal/g;

    invoke-interface {v0}, Lcom/google/android/gms/internal/g;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
