.class final Lcom/google/android/gms/internal/nn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field final synthetic c:Lcom/google/android/gms/internal/nt;

.field final synthetic d:Lcom/google/android/gms/internal/dm;

.field final synthetic e:Lcom/google/android/gms/internal/dk;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lcom/google/android/gms/internal/cn;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/nt;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/internal/dk;Ljava/lang/String;Lcom/google/android/gms/internal/cn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nn;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/nn;->b:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/nn;->c:Lcom/google/android/gms/internal/nt;

    iput-object p4, p0, Lcom/google/android/gms/internal/nn;->d:Lcom/google/android/gms/internal/dm;

    iput-object p5, p0, Lcom/google/android/gms/internal/nn;->e:Lcom/google/android/gms/internal/dk;

    iput-object p6, p0, Lcom/google/android/gms/internal/nn;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/nn;->g:Lcom/google/android/gms/internal/cn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbw()Lcom/google/android/gms/internal/sf;

    iget-object v0, p0, Lcom/google/android/gms/internal/nn;->a:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>()V

    const/4 v4, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/nn;->b:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v5, v3, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzqj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move v3, v2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/sf;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;ZZLcom/google/android/gms/internal/ad;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzby()Lcom/google/android/gms/internal/pe;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/pe;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ry;->clearCache(Z)V

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->a()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/webkit/WebView;->setWillNotDraw(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/nn;->c:Lcom/google/android/gms/internal/nt;

    .line 1000
    iput-object v0, v1, Lcom/google/android/gms/internal/nt;->a:Lcom/google/android/gms/internal/ry;

    .line 0
    iget-object v1, p0, Lcom/google/android/gms/internal/nn;->d:Lcom/google/android/gms/internal/dm;

    iget-object v3, p0, Lcom/google/android/gms/internal/nn;->e:Lcom/google/android/gms/internal/dk;

    new-array v4, v6, [Ljava/lang/String;

    const-string v5, "rwc"

    aput-object v5, v4, v2

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/dm;->a(Lcom/google/android/gms/internal/dk;[Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/nn;->d:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dm;->a()Lcom/google/android/gms/internal/dk;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/nn;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/nn;->d:Lcom/google/android/gms/internal/dm;

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/nj;->a(Ljava/lang/String;Lcom/google/android/gms/internal/dm;Lcom/google/android/gms/internal/dk;)Lcom/google/android/gms/internal/sb;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ry;->k()Lcom/google/android/gms/internal/zzja;

    move-result-object v2

    const-string v3, "/invalidRequest"

    iget-object v4, p0, Lcom/google/android/gms/internal/nn;->c:Lcom/google/android/gms/internal/nt;

    iget-object v4, v4, Lcom/google/android/gms/internal/nt;->c:Lcom/google/android/gms/internal/fz;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v3, "/loadAdURL"

    iget-object v4, p0, Lcom/google/android/gms/internal/nn;->c:Lcom/google/android/gms/internal/nt;

    iget-object v4, v4, Lcom/google/android/gms/internal/nt;->d:Lcom/google/android/gms/internal/fz;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v3, "/log"

    sget-object v4, Lcom/google/android/gms/internal/fo;->h:Lcom/google/android/gms/internal/fz;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/zzja;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/zzja;->zza(Lcom/google/android/gms/internal/sb;)V

    const-string v1, "Loading the JS library."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzaF(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/nn;->g:Lcom/google/android/gms/internal/cn;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cn;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ry;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
