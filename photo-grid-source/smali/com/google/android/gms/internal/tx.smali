.class final Lcom/google/android/gms/internal/tx;
.super Lcom/google/android/gms/internal/up;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;

.field final synthetic b:Lcom/google/android/gms/common/ConnectionResult;

.field final synthetic c:Lcom/google/android/gms/internal/tw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/tw;Lcom/google/android/gms/internal/uu;Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/tx;->c:Lcom/google/android/gms/internal/tw;

    iput-object p3, p0, Lcom/google/android/gms/internal/tx;->a:Lcom/google/android/gms/internal/tu;

    iput-object p4, p0, Lcom/google/android/gms/internal/tx;->b:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/up;-><init>(Lcom/google/android/gms/internal/uu;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/tx;->a:Lcom/google/android/gms/internal/tu;

    iget-object v1, p0, Lcom/google/android/gms/internal/tx;->b:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/tu;->c(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
