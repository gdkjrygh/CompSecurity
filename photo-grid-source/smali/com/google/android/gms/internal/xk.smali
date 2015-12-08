.class public final Lcom/google/android/gms/internal/xk;
.super Ljava/lang/Object;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/common/api/m;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/xj;
    .locals 8

    new-instance v0, Lcom/google/android/gms/internal/xj;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/xk;->a:Z

    iget-boolean v2, p0, Lcom/google/android/gms/internal/xk;->b:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/xk;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/xk;->d:Lcom/google/android/gms/common/api/m;

    iget-boolean v5, p0, Lcom/google/android/gms/internal/xk;->e:Z

    iget-boolean v6, p0, Lcom/google/android/gms/internal/xk;->f:Z

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/xj;-><init>(ZZLjava/lang/String;Lcom/google/android/gms/common/api/m;ZZB)V

    return-object v0
.end method
