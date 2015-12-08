.class final Lcom/google/android/gms/internal/vg;
.super Lcom/google/android/gms/internal/ve;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ve",
        "<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ve;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected final synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1000
    invoke-static {}, Lcom/google/android/gms/internal/ve;->f()Lcom/google/android/gms/internal/vk;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/vk;->b()Ljava/lang/Long;

    move-result-object v0

    .line 0
    return-object v0
.end method
