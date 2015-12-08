.class final Lkik/android/chat/fragment/mn;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;Z)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/mn;->a:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 442
    iget-object v0, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 443
    iget-boolean v0, p0, Lkik/android/chat/fragment/mn;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0d0023

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    :goto_0
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 444
    iget-object v0, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->c(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 446
    iget-object v0, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->d(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lkik/android/chat/fragment/mn;->b:Lkik/android/chat/fragment/KikMultiselectContactsListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikMultiselectContactsListFragment;->d(Lkik/android/chat/fragment/KikMultiselectContactsListFragment;)Landroid/view/View;

    move-result-object v0

    iget-boolean v2, p0, Lkik/android/chat/fragment/mn;->a:Z

    if-eqz v2, :cond_2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 449
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 443
    goto :goto_0

    .line 447
    :cond_2
    const/4 v1, 0x4

    goto :goto_1
.end method
