.class final Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 429
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 433
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->m()V

    .line 434
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->c()V

    .line 435
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->j()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->b(F)V

    .line 436
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iget-boolean v0, v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a:Z

    if-eqz v0, :cond_0

    .line 439
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iput-boolean v2, v0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a:Z

    .line 440
    const-wide/16 v0, 0x534

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 441
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->a:Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/g;->a(Z)V

    .line 445
    :goto_0
    return-void

    .line 443
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    const/high16 v2, 0x40a00000    # 5.0f

    rem-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;F)F

    goto :goto_0
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 423
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/modifiedrefresh/e;->b:Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;->a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/c;F)F

    .line 424
    return-void
.end method
