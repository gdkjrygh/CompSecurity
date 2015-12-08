.class final Lkik/android/widget/s;
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
    .line 247
    iput-object p1, p0, Lkik/android/widget/s;->a:Lkik/android/widget/ContentLinkView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 263
    iget-object v0, p0, Lkik/android/widget/s;->a:Lkik/android/widget/ContentLinkView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/widget/ContentLinkView;->setVisibility(I)V

    .line 264
    iget-object v0, p0, Lkik/android/widget/s;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0, v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;Z)Z

    .line 265
    iget-object v0, p0, Lkik/android/widget/s;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0, v2}, Lkik/android/widget/ContentLinkView;->b(Lkik/android/widget/ContentLinkView;Z)Z

    .line 266
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 258
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lkik/android/widget/s;->a:Lkik/android/widget/ContentLinkView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;Z)Z

    .line 253
    return-void
.end method
