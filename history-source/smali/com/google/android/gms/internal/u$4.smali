.class Lcom/google/android/gms/internal/u$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/u;->a(Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/internal/ef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lG:Lcom/google/android/gms/internal/u;

.field final synthetic lI:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/u;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/u$4;->lI:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lI:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/internal/ei;->d(Landroid/content/Intent;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/u$b;->lT:Lcom/google/android/gms/internal/fy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/u$b;->lT:Lcom/google/android/gms/internal/fy;

    iget-object v0, v0, Lcom/google/android/gms/internal/fy;->se:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/u$b;->lT:Lcom/google/android/gms/internal/fy;

    iget-object v0, v0, Lcom/google/android/gms/internal/fy;->se:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dC()Lcom/google/android/gms/internal/dp;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/u$b;->lT:Lcom/google/android/gms/internal/fy;

    iget-object v0, v0, Lcom/google/android/gms/internal/fy;->se:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dC()Lcom/google/android/gms/internal/dp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->close()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/u$4;->lG:Lcom/google/android/gms/internal/u;

    invoke-static {v0}, Lcom/google/android/gms/internal/u;->a(Lcom/google/android/gms/internal/u;)Lcom/google/android/gms/internal/u$b;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/u$b;->mh:Z

    return-void
.end method
