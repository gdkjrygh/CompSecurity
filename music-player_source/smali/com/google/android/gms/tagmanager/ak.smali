.class final Lcom/google/android/gms/tagmanager/ak;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/google/android/gms/internal/ej;)Lcom/google/android/gms/internal/ej;
    .locals 2

    new-instance v1, Lcom/google/android/gms/internal/ej;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ej;-><init>()V

    iget v0, p0, Lcom/google/android/gms/internal/ej;->a:I

    iput v0, v1, Lcom/google/android/gms/internal/ej;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ej;->k:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, v1, Lcom/google/android/gms/internal/ej;->k:[I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ej;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ej;->l:Z

    iput-boolean v0, v1, Lcom/google/android/gms/internal/ej;->l:Z

    :cond_0
    return-object v1
.end method
