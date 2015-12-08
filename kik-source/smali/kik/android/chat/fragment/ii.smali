.class final Lkik/android/chat/fragment/ii;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ih;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ih;)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lkik/android/chat/fragment/ii;->a:Lkik/android/chat/fragment/ih;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .prologue
    .line 497
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/ii;->a:Lkik/android/chat/fragment/ih;

    iget-object v2, v2, Lkik/android/chat/fragment/ih;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikCodeFragment;->_fakeCode:Lkik/android/widget/KikCodeBackgroundImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 498
    return-void
.end method
