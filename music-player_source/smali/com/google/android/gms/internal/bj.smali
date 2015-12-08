.class public final Lcom/google/android/gms/internal/bj;
.super Lcom/google/android/gms/internal/be;


# instance fields
.field private final a:Lcom/google/a/a/b;

.field private final b:Lcom/google/a/a/h;


# direct methods
.method public constructor <init>(Lcom/google/a/a/b;Lcom/google/a/a/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/be;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/bj;->b:Lcom/google/a/a/h;

    return-void
.end method

.method private a(Ljava/lang/String;ILjava/lang/String;)Lcom/google/a/a/e;
    .locals 6

    if-eqz p1, :cond_3

    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not get MediationServerParameters."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Landroid/os/RemoteException;

    invoke-direct {v1}, Landroid/os/RemoteException;-><init>()V

    throw v1

    :cond_0
    move-object v3, v2

    :goto_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-interface {v1}, Lcom/google/a/a/b;->c()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/a/a/e;

    invoke-virtual {v1, v3}, Lcom/google/a/a/e;->a(Ljava/util/Map;)V

    move-object v2, v1

    :cond_1
    instance-of v1, v2, Lcom/google/a/a/a/a;

    if-eqz v1, :cond_2

    move-object v0, v2

    check-cast v0, Lcom/google/a/a/a/a;

    move-object v1, v0

    iput-object p3, v1, Lcom/google/a/a/a/a;->b:Ljava/lang/String;

    iput p2, v1, Lcom/google/a/a/a/a;->c:I

    :cond_2
    return-object v2

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v1

    goto :goto_1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/a/c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    instance-of v0, v0, Lcom/google/a/a/c;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediationAdapter is not a MediationBannerAdapter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    check-cast v0, Lcom/google/a/a/c;

    invoke-interface {v0}, Lcom/google/a/a/c;->e()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/a/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/c;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not get banner view from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/ab;Lcom/google/android/gms/internal/z;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/bj;->a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/ab;Lcom/google/android/gms/internal/z;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/ab;Lcom/google/android/gms/internal/z;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    instance-of v0, v0, Lcom/google/a/a/c;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediationAdapter is not a MediationBannerAdapter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    const-string v0, "Requesting banner ad from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    check-cast v0, Lcom/google/a/a/c;

    new-instance v1, Lcom/google/android/gms/internal/bk;

    invoke-direct {v1, p6}, Lcom/google/android/gms/internal/bk;-><init>(Lcom/google/android/gms/internal/bg;)V

    invoke-static {p1}, Lcom/google/android/gms/a/f;->a(Lcom/google/android/gms/a/c;)Ljava/lang/Object;

    iget v1, p3, Lcom/google/android/gms/internal/z;->h:I

    invoke-direct {p0, p4, v1, p5}, Lcom/google/android/gms/internal/bj;->a(Ljava/lang/String;ILjava/lang/String;)Lcom/google/a/a/e;

    new-instance v1, Lcom/google/a/c;

    iget v2, p2, Lcom/google/android/gms/internal/ab;->g:I

    iget v3, p2, Lcom/google/android/gms/internal/ab;->d:I

    iget-object v4, p2, Lcom/google/android/gms/internal/ab;->c:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/ads/f;->a(IILjava/lang/String;)Lcom/google/android/gms/ads/d;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/a/c;-><init>(Lcom/google/android/gms/ads/d;)V

    invoke-static {p3}, Lcom/google/android/gms/internal/bl;->a(Lcom/google/android/gms/internal/z;)Lcom/google/a/a/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->b:Lcom/google/a/a/h;

    invoke-interface {v0}, Lcom/google/a/a/c;->d()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not request banner ad from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/z;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/bj;->a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/z;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/a/c;Lcom/google/android/gms/internal/z;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/bg;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    instance-of v0, v0, Lcom/google/a/a/d;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediationAdapter is not a MediationInterstitialAdapter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    const-string v0, "Requesting interstitial ad from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    check-cast v0, Lcom/google/a/a/d;

    new-instance v1, Lcom/google/android/gms/internal/bk;

    invoke-direct {v1, p5}, Lcom/google/android/gms/internal/bk;-><init>(Lcom/google/android/gms/internal/bg;)V

    invoke-static {p1}, Lcom/google/android/gms/a/f;->a(Lcom/google/android/gms/a/c;)Ljava/lang/Object;

    iget v1, p2, Lcom/google/android/gms/internal/z;->h:I

    invoke-direct {p0, p3, v1, p4}, Lcom/google/android/gms/internal/bj;->a(Ljava/lang/String;ILjava/lang/String;)Lcom/google/a/a/e;

    invoke-static {p2}, Lcom/google/android/gms/internal/bl;->a(Lcom/google/android/gms/internal/z;)Lcom/google/a/a/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->b:Lcom/google/a/a/h;

    invoke-interface {v0}, Lcom/google/a/a/d;->d()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not request interstitial ad from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    instance-of v0, v0, Lcom/google/a/a/d;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediationAdapter is not a MediationInterstitialAdapter: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    const-string v0, "Showing interstitial from adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    check-cast v0, Lcom/google/a/a/d;

    invoke-interface {v0}, Lcom/google/a/a/d;->e()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not show interstitial from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->a:Lcom/google/a/a/b;

    invoke-interface {v0}, Lcom/google/a/a/b;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not destroy adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method
