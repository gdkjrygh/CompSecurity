.class final Lcom/google/android/gms/internal/bj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field final synthetic c:Lcom/google/android/gms/internal/rf;

.field final synthetic d:Lcom/google/android/gms/internal/ad;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/google/android/gms/internal/bi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/bi;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/rf;Lcom/google/android/gms/internal/ad;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/bj;->f:Lcom/google/android/gms/internal/bi;

    iput-object p2, p0, Lcom/google/android/gms/internal/bj;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/bj;->b:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p4, p0, Lcom/google/android/gms/internal/bj;->c:Lcom/google/android/gms/internal/rf;

    iput-object p5, p0, Lcom/google/android/gms/internal/bj;->d:Lcom/google/android/gms/internal/ad;

    iput-object p6, p0, Lcom/google/android/gms/internal/bj;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->f:Lcom/google/android/gms/internal/bi;

    iget-object v1, p0, Lcom/google/android/gms/internal/bj;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/bj;->b:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v3, p0, Lcom/google/android/gms/internal/bj;->c:Lcom/google/android/gms/internal/rf;

    iget-object v4, p0, Lcom/google/android/gms/internal/bj;->d:Lcom/google/android/gms/internal/ad;

    .line 2000
    new-instance v5, Lcom/google/android/gms/internal/bl;

    invoke-direct {v5, v1, v2, v4}, Lcom/google/android/gms/internal/bl;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ad;)V

    new-instance v1, Lcom/google/android/gms/internal/bk;

    invoke-direct {v1, v0, v3, v5}, Lcom/google/android/gms/internal/bk;-><init>(Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/rf;Lcom/google/android/gms/internal/bg;)V

    invoke-interface {v5, v1}, Lcom/google/android/gms/internal/bg;->a(Lcom/google/android/gms/internal/bh;)V

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/bj;->e:Ljava/lang/String;

    invoke-interface {v5, v0}, Lcom/google/android/gms/internal/bg;->b(Ljava/lang/String;)V

    return-void
.end method
