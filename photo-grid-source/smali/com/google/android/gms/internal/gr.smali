.class final Lcom/google/android/gms/internal/gr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/gq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gr;->a:Lcom/google/android/gms/internal/gq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbI()Lcom/google/android/gms/internal/gs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gr;->a:Lcom/google/android/gms/internal/gq;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gs;->b(Lcom/google/android/gms/internal/gq;)V

    return-void
.end method
