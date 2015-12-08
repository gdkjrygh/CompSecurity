.class public final Lcom/google/android/gms/internal/bo;
.super Lcom/google/android/gms/internal/bq$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final px:Lcom/google/android/gms/internal/w;

.field private final py:Ljava/lang/String;

.field private final pz:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/w;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/bq$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bo;->px:Lcom/google/android/gms/internal/w;

    iput-object p2, p0, Lcom/google/android/gms/internal/bo;->py:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/bo;->pz:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/dynamic/d;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/bo;->px:Lcom/google/android/gms/internal/w;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/w;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method public av()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->px:Lcom/google/android/gms/internal/w;

    invoke-interface {v0}, Lcom/google/android/gms/internal/w;->av()V

    return-void
.end method

.method public aw()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->px:Lcom/google/android/gms/internal/w;

    invoke-interface {v0}, Lcom/google/android/gms/internal/w;->aw()V

    return-void
.end method

.method public bA()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pz:Ljava/lang/String;

    return-object v0
.end method

.method public bz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bo;->py:Ljava/lang/String;

    return-object v0
.end method
