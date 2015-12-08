.class final Lcom/google/android/gms/internal/mx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/rf;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/mv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/mv;Lcom/google/android/gms/internal/rf;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mx;->c:Lcom/google/android/gms/internal/mv;

    iput-object p2, p0, Lcom/google/android/gms/internal/mx;->a:Lcom/google/android/gms/internal/rf;

    iput-object p3, p0, Lcom/google/android/gms/internal/mx;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mx;->a:Lcom/google/android/gms/internal/rf;

    iget-object v1, p0, Lcom/google/android/gms/internal/mx;->c:Lcom/google/android/gms/internal/mv;

    invoke-static {v1}, Lcom/google/android/gms/internal/mv;->a(Lcom/google/android/gms/internal/mv;)Lcom/google/android/gms/ads/internal/zzn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzn;->zzbo()Lcom/google/android/gms/internal/wb;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mx;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/wb;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/rf;->b(Ljava/lang/Object;)V

    return-void
.end method
