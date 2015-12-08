.class final Lkik/android/widget/l;
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
    .line 315
    iput-object p1, p0, Lkik/android/widget/l;->a:Lkik/android/widget/BugmeBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 332
    iget-object v0, p0, Lkik/android/widget/l;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->d(Lkik/android/widget/BugmeBarView;Z)Z

    .line 333
    iget-object v0, p0, Lkik/android/widget/l;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->c(Lkik/android/widget/BugmeBarView;Z)Z

    .line 334
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 327
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 320
    iget-object v0, p0, Lkik/android/widget/l;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/BugmeBarView;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lkik/android/widget/l;->a:Lkik/android/widget/BugmeBarView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/BugmeBarView;->d(Lkik/android/widget/BugmeBarView;Z)Z

    .line 322
    return-void
.end method
