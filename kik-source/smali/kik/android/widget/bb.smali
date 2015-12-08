.class final Lkik/android/widget/bb;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/widget/GifSearchFragment;


# direct methods
.method constructor <init>(Lkik/android/widget/GifSearchFragment;Z)V
    .locals 0

    .prologue
    .line 646
    iput-object p1, p0, Lkik/android/widget/bb;->b:Lkik/android/widget/GifSearchFragment;

    iput-boolean p2, p0, Lkik/android/widget/bb;->a:Z

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 656
    iget-object v1, p0, Lkik/android/widget/bb;->b:Lkik/android/widget/GifSearchFragment;

    iget-boolean v0, p0, Lkik/android/widget/bb;->a:Z

    if-eqz v0, :cond_0

    sget v0, Lkik/android/widget/GifSearchFragment$a;->d:I

    :goto_0
    invoke-static {v1, v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;I)I

    .line 657
    return-void

    .line 656
    :cond_0
    sget v0, Lkik/android/widget/GifSearchFragment$a;->c:I

    goto :goto_0
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .prologue
    .line 650
    iget-object v1, p0, Lkik/android/widget/bb;->b:Lkik/android/widget/GifSearchFragment;

    iget-boolean v0, p0, Lkik/android/widget/bb;->a:Z

    if-eqz v0, :cond_0

    sget v0, Lkik/android/widget/GifSearchFragment$a;->a:I

    :goto_0
    invoke-static {v1, v0}, Lkik/android/widget/GifSearchFragment;->a(Lkik/android/widget/GifSearchFragment;I)I

    .line 651
    return-void

    .line 650
    :cond_0
    sget v0, Lkik/android/widget/GifSearchFragment$a;->b:I

    goto :goto_0
.end method
