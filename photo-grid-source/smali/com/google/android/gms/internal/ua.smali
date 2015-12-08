.class final Lcom/google/android/gms/internal/ua;
.super Lcom/google/android/gms/internal/uh;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tu;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/tu;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ua;->a:Lcom/google/android/gms/internal/tu;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/uh;-><init>(Lcom/google/android/gms/internal/tu;B)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/tu;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ua;-><init>(Lcom/google/android/gms/internal/tu;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ua;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->e(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/xi;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ua;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v1}, Lcom/google/android/gms/internal/tu;->f(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/common/internal/as;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ua;->a:Lcom/google/android/gms/internal/tu;

    invoke-static {v2}, Lcom/google/android/gms/internal/tu;->c(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/uj;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/internal/uj;->f:Ljava/util/Set;

    new-instance v3, Lcom/google/android/gms/internal/tw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ua;->a:Lcom/google/android/gms/internal/tu;

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/tw;-><init>(Lcom/google/android/gms/internal/tu;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/xi;->a(Lcom/google/android/gms/common/internal/as;Ljava/util/Set;Lcom/google/android/gms/signin/internal/f;)V

    return-void
.end method
