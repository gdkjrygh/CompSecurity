.class final Lcom/google/android/gms/internal/az;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/fz;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/at;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/az;->a:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ry;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ry;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/az;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/at;->a(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/az;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/at;->d()V

    goto :goto_0
.end method
