.class final Lkik/android/chat/fragment/on;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 541
    iput-object p1, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 4

    .prologue
    .line 545
    if-eqz p2, :cond_0

    .line 546
    iget-object v0, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/v;

    invoke-virtual {v0}, Lcom/kik/view/adapters/v;->a()I

    move-result v0

    .line 548
    iget-object v1, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_registerButton:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getBottom()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v2}, Lkik/android/widget/KikAutoCompleteTextView;->getBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikRegistrationFragment;->j(Lkik/android/chat/fragment/KikRegistrationFragment;)I

    move-result v2

    add-int/2addr v1, v2

    .line 549
    iget-object v2, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v2, v0}, Lkik/android/widget/KikAutoCompleteTextView;->setDropDownHeight(I)V

    .line 550
    iget-object v0, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 551
    iget-object v0, p0, Lkik/android/chat/fragment/on;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->showDropDown()V

    .line 566
    :cond_0
    :goto_0
    return-void

    .line 554
    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 555
    new-instance v1, Lkik/android/chat/fragment/oo;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/oo;-><init>(Lkik/android/chat/fragment/on;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
