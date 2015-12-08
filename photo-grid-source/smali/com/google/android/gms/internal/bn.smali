.class final Lcom/google/android/gms/internal/bn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/bl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/bn;->c:Lcom/google/android/gms/internal/bl;

    iput-object p2, p0, Lcom/google/android/gms/internal/bn;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/bn;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/bn;->c:Lcom/google/android/gms/internal/bl;

    invoke-static {v0}, Lcom/google/android/gms/internal/bl;->a(Lcom/google/android/gms/internal/bl;)Lcom/google/android/gms/internal/ry;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/bn;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/bn;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
