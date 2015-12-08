.class final Lcom/google/android/gms/analytics/internal/t;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/analytics/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/s;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/t;->b:Lcom/google/android/gms/analytics/internal/s;

    iput-boolean p2, p0, Lcom/google/android/gms/analytics/internal/t;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/t;->b:Lcom/google/android/gms/analytics/internal/s;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/s;->a(Lcom/google/android/gms/analytics/internal/s;)Lcom/google/android/gms/analytics/internal/am;

    move-result-object v0

    .line 1000
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/am;->g()V

    .line 0
    return-void
.end method
