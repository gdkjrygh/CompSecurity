.class final Lkik/android/widget/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lkik/android/widget/BugmeBarView;


# direct methods
.method constructor <init>(Lkik/android/widget/BugmeBarView;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lkik/android/widget/k;->a:Lkik/android/widget/BugmeBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 295
    iget-object v0, p0, Lkik/android/widget/k;->a:Lkik/android/widget/BugmeBarView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/widget/BugmeBarView;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lkik/android/widget/k;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0, v2}, Lkik/android/widget/BugmeBarView;->b(Lkik/android/widget/BugmeBarView;Z)Z

    .line 297
    iget-object v0, p0, Lkik/android/widget/k;->a:Lkik/android/widget/BugmeBarView;

    invoke-static {v0, v2}, Lkik/android/widget/BugmeBarView;->c(Lkik/android/widget/BugmeBarView;Z)Z

    .line 298
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 290
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 284
    iget-object v0, p0, Lkik/android/widget/k;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->b(Lkik/android/widget/BugmeBarView;Z)Z

    .line 285
    return-void
.end method
