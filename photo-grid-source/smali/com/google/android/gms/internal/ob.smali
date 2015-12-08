.class final Lcom/google/android/gms/internal/ob;
.super Ljava/lang/Object;


# instance fields
.field public final a:J

.field public final b:Lcom/google/android/gms/internal/ny;

.field final synthetic c:Lcom/google/android/gms/internal/oa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/oa;Lcom/google/android/gms/internal/ny;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ob;->c:Lcom/google/android/gms/internal/oa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbz()Lcom/google/android/gms/internal/wg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ob;->a:J

    iput-object p2, p0, Lcom/google/android/gms/internal/ob;->b:Lcom/google/android/gms/internal/ny;

    return-void
.end method
