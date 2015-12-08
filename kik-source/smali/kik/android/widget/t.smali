.class final Lkik/android/widget/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lkik/android/widget/ContentLinkView;


# direct methods
.method constructor <init>(Lkik/android/widget/ContentLinkView;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lkik/android/widget/t;->a:Lkik/android/widget/ContentLinkView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 292
    iget-object v0, p0, Lkik/android/widget/t;->a:Lkik/android/widget/ContentLinkView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/widget/ContentLinkView;->c(Lkik/android/widget/ContentLinkView;Z)Z

    .line 293
    iget-object v0, p0, Lkik/android/widget/t;->a:Lkik/android/widget/ContentLinkView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/ContentLinkView;->b(Lkik/android/widget/ContentLinkView;Z)Z

    .line 294
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 287
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 280
    iget-object v0, p0, Lkik/android/widget/t;->a:Lkik/android/widget/ContentLinkView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/ContentLinkView;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lkik/android/widget/t;->a:Lkik/android/widget/ContentLinkView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/ContentLinkView;->c(Lkik/android/widget/ContentLinkView;Z)Z

    .line 282
    return-void
.end method
