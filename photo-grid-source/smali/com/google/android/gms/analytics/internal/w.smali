.class final Lcom/google/android/gms/analytics/internal/w;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/analytics/internal/bf;

.field final synthetic b:Lcom/google/android/gms/analytics/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/s;Lcom/google/android/gms/analytics/internal/bf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/w;->b:Lcom/google/android/gms/analytics/internal/s;

    iput-object p2, p0, Lcom/google/android/gms/analytics/internal/w;->a:Lcom/google/android/gms/analytics/internal/bf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/w;->b:Lcom/google/android/gms/analytics/internal/s;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/s;->a(Lcom/google/android/gms/analytics/internal/s;)Lcom/google/android/gms/analytics/internal/am;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/w;->a:Lcom/google/android/gms/analytics/internal/bf;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/am;->a(Lcom/google/android/gms/analytics/internal/bf;)V

    return-void
.end method
