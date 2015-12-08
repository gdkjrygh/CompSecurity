.class final Lcom/google/android/gms/internal/qx;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/vp;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/vq;

.field final synthetic b:Lcom/google/android/gms/internal/qv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/vq;Lcom/google/android/gms/internal/qv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/qx;->a:Lcom/google/android/gms/internal/vq;

    iput-object p2, p0, Lcom/google/android/gms/internal/qx;->b:Lcom/google/android/gms/internal/qv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/xm;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/qx;->a:Lcom/google/android/gms/internal/vq;

    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->b:Lcom/google/android/gms/internal/qv;

    invoke-interface {v1}, Lcom/google/android/gms/internal/qv;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/vq;->a(Ljava/lang/Object;)V

    return-void
.end method
