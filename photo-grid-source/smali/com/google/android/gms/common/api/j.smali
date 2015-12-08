.class final Lcom/google/android/gms/common/api/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/h;

.field final synthetic b:Lcom/google/android/gms/common/api/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/j;->b:Lcom/google/android/gms/common/api/i;

    iput-object p2, p0, Lcom/google/android/gms/common/api/j;->a:Lcom/google/android/gms/common/api/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/j;->b:Lcom/google/android/gms/common/api/i;

    invoke-static {v0}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/i;)Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/j;->b:Lcom/google/android/gms/common/api/i;

    invoke-static {v0}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/i;)Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/j;->b:Lcom/google/android/gms/common/api/i;

    iget-object v1, p0, Lcom/google/android/gms/common/api/j;->b:Lcom/google/android/gms/common/api/i;

    invoke-static {v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/i;)Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/uz;->b(Landroid/support/v4/app/FragmentActivity;)Lcom/google/android/gms/internal/uz;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/common/api/j;->a:Lcom/google/android/gms/common/api/h;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/internal/uz;Lcom/google/android/gms/common/api/h;)V

    goto :goto_0
.end method
