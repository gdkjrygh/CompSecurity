.class public final Lcom/google/android/gms/analytics/internal/bd;
.super Lcom/google/android/gms/analytics/internal/y;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/aa;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/y;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 0

    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/ww;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/bd;->B()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/bd;->p()Lcom/google/android/gms/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/c/f;->b()Lcom/google/android/gms/internal/ww;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/bd;->B()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/bd;->b()Lcom/google/android/gms/internal/ww;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1000
    iget v2, v0, Lcom/google/android/gms/internal/ww;->b:I

    .line 0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 2000
    iget v0, v0, Lcom/google/android/gms/internal/ww;->c:I

    .line 0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
