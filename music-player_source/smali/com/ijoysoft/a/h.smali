.class final Lcom/ijoysoft/a/h;
.super Lcom/google/android/gms/ads/a;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Z

.field private final synthetic c:Landroid/app/Activity;

.field private final synthetic d:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;ZLandroid/app/Activity;)V
    .locals 1

    iput-object p1, p0, Lcom/ijoysoft/a/h;->a:Lcom/ijoysoft/a/a;

    iput-boolean p2, p0, Lcom/ijoysoft/a/h;->b:Z

    iput-object p3, p0, Lcom/ijoysoft/a/h;->c:Landroid/app/Activity;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ijoysoft/a/h;->d:Ljava/lang/Runnable;

    invoke-direct {p0}, Lcom/google/android/gms/ads/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/a;->a()V

    iget-object v0, p0, Lcom/ijoysoft/a/h;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/h;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 4

    iget-boolean v0, p0, Lcom/ijoysoft/a/h;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/h;->a:Lcom/ijoysoft/a/a;

    invoke-static {v0}, Lcom/ijoysoft/a/a;->a(Lcom/ijoysoft/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/h;->a:Lcom/ijoysoft/a/a;

    invoke-static {v0}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;)V

    iget-object v0, p0, Lcom/ijoysoft/a/h;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/h;->c:Landroid/app/Activity;

    new-instance v2, Lcom/ijoysoft/a/i;

    iget-object v3, p0, Lcom/ijoysoft/a/h;->c:Landroid/app/Activity;

    invoke-direct {v2, p0, v3}, Lcom/ijoysoft/a/i;-><init>(Lcom/ijoysoft/a/h;Landroid/app/Activity;)V

    invoke-static {v0, v1, v2}, Lcom/ijoysoft/a/a;->a(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
