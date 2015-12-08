.class final Lcom/miteksystems/misnap/ak;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->r(Lcom/miteksystems/misnap/u;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v3}, Lcom/miteksystems/misnap/u;->s(Lcom/miteksystems/misnap/u;)Ljava/lang/Runnable;

    move-result-object v3

    const-wide/16 v4, 0x46

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v2, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->t(Lcom/miteksystems/misnap/u;)V

    const-wide/16 v2, 0x12c

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x43960000    # 300.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const-wide/16 v4, 0x258

    cmp-long v0, v0, v4

    if-gez v0, :cond_0

    sub-float v0, v6, v2

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float/2addr v0, v1

    sub-float v0, v6, v0

    iget-object v1, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    iget-object v2, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    iget-object v3, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v3}, Lcom/miteksystems/misnap/u;->u(Lcom/miteksystems/misnap/u;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Ljava/util/List;F)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Ljava/util/List;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->s(Lcom/miteksystems/misnap/u;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    iget-object v1, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    iget-object v2, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->u(Lcom/miteksystems/misnap/u;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2, v6}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Ljava/util/List;F)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;Ljava/util/List;)V

    iget-object v0, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->postInvalidate()V

    iget-object v0, p0, Lcom/miteksystems/misnap/ak;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->v(Lcom/miteksystems/misnap/u;)V

    goto :goto_0
.end method
