.class final Lkik/android/util/cw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:I

.field final synthetic c:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field final synthetic d:Landroid/animation/Animator$AnimatorListener;

.field final synthetic e:J

.field final synthetic f:J


# direct methods
.method constructor <init>(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;)V
    .locals 2

    .prologue
    .line 694
    iput-object p1, p0, Lkik/android/util/cw;->a:Landroid/view/View;

    iput p2, p0, Lkik/android/util/cw;->b:I

    iput-object p3, p0, Lkik/android/util/cw;->c:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    iput-object p4, p0, Lkik/android/util/cw;->d:Landroid/animation/Animator$AnimatorListener;

    const-wide/16 v0, 0x12c

    iput-wide v0, p0, Lkik/android/util/cw;->e:J

    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Lkik/android/util/cw;->f:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 698
    iget-object v0, p0, Lkik/android/util/cw;->a:Landroid/view/View;

    iget v1, p0, Lkik/android/util/cw;->b:I

    iget-object v2, p0, Lkik/android/util/cw;->c:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    iget-object v3, p0, Lkik/android/util/cw;->d:Landroid/animation/Animator$AnimatorListener;

    iget-wide v4, p0, Lkik/android/util/cw;->e:J

    iget-wide v6, p0, Lkik/android/util/cw;->f:J

    invoke-static/range {v0 .. v7}, Lkik/android/util/cv;->a(Landroid/view/View;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;Landroid/animation/Animator$AnimatorListener;JJ)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 699
    return-void
.end method
