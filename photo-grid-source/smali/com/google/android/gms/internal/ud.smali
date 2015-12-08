.class final Lcom/google/android/gms/internal/ud;
.super Lcom/google/android/gms/internal/up;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/ConnectionResult;

.field final synthetic b:Lcom/google/android/gms/internal/uc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/uc;Lcom/google/android/gms/internal/uu;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ud;->b:Lcom/google/android/gms/internal/uc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ud;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/up;-><init>(Lcom/google/android/gms/internal/uu;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ud;->b:Lcom/google/android/gms/internal/uc;

    iget-object v0, v0, Lcom/google/android/gms/internal/uc;->a:Lcom/google/android/gms/internal/tu;

    iget-object v1, p0, Lcom/google/android/gms/internal/ud;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
