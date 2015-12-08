.class final Lcom/google/android/gms/internal/hz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hx;

.field private final b:Lcom/google/android/gms/internal/tj;

.field private final c:Lcom/google/android/gms/internal/vo;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hx;Lcom/google/android/gms/internal/tj;Lcom/google/android/gms/internal/vo;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hz;->a:Lcom/google/android/gms/internal/hx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    iput-object p3, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/android/gms/internal/vo;

    iput-object p4, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tj;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tj;->b(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/android/gms/internal/vo;

    .line 1000
    iget-object v0, v0, Lcom/google/android/gms/internal/vo;->c:Lcom/google/android/gms/internal/xm;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 0
    :goto_1
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/android/gms/internal/vo;

    iget-object v1, v1, Lcom/google/android/gms/internal/vo;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tj;->a(Ljava/lang/Object;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/android/gms/internal/vo;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/vo;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tj;->a(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 1000
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 0
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    iget-object v1, p0, Lcom/google/android/gms/internal/hz;->c:Lcom/google/android/gms/internal/vo;

    iget-object v1, v1, Lcom/google/android/gms/internal/vo;->c:Lcom/google/android/gms/internal/xm;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tj;->b(Lcom/google/android/gms/internal/xm;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/hz;->b:Lcom/google/android/gms/internal/tj;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tj;->b(Ljava/lang/String;)V

    goto :goto_3
.end method
