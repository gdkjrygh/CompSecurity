.class final Lcom/google/android/gms/internal/ov;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/pa;

.field final synthetic b:Lcom/google/android/gms/internal/ot;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ot;Lcom/google/android/gms/internal/pa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ov;->b:Lcom/google/android/gms/internal/ot;

    iput-object p2, p0, Lcom/google/android/gms/internal/ov;->a:Lcom/google/android/gms/internal/pa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ov;->b:Lcom/google/android/gms/internal/ot;

    invoke-static {v0}, Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/internal/ot;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ov;->a:Lcom/google/android/gms/internal/pa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/oj;->zzb(Lcom/google/android/gms/internal/pa;)V

    return-void
.end method
