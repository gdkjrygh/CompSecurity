.class final Lcom/google/android/gms/analytics/internal/ai;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/ComponentName;

.field final synthetic b:Lcom/google/android/gms/analytics/internal/ag;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/ag;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/ai;->b:Lcom/google/android/gms/analytics/internal/ag;

    iput-object p2, p0, Lcom/google/android/gms/analytics/internal/ai;->a:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ai;->b:Lcom/google/android/gms/analytics/internal/ag;

    iget-object v0, v0, Lcom/google/android/gms/analytics/internal/ag;->a:Lcom/google/android/gms/analytics/internal/ae;

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ai;->a:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lcom/google/android/gms/analytics/internal/ae;->a(Lcom/google/android/gms/analytics/internal/ae;Landroid/content/ComponentName;)V

    return-void
.end method
