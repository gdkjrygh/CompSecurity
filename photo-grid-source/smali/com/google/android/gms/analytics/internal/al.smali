.class public final Lcom/google/android/gms/analytics/internal/al;
.super Lcom/google/android/gms/analytics/internal/y;


# instance fields
.field private final a:Lcom/google/android/gms/internal/wu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/aa;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/y;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    new-instance v0, Lcom/google/android/gms/internal/wu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wu;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/al;->a:Lcom/google/android/gms/internal/wu;

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 3

    .prologue
    .line 0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/al;->p()Lcom/google/android/gms/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/c/f;->a()Lcom/google/android/gms/internal/wu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/al;->a:Lcom/google/android/gms/internal/wu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wu;->a(Lcom/google/android/gms/internal/wu;)V

    .line 1000
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/al;->t()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/al;->a:Lcom/google/android/gms/internal/wu;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/wu;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/al;->a:Lcom/google/android/gms/internal/wu;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/wu;->b(Ljava/lang/String;)V

    .line 0
    :cond_1
    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/wu;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/al;->B()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/al;->a:Lcom/google/android/gms/internal/wu;

    return-object v0
.end method
