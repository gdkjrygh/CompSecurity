.class final Lkik/android/chat/fragment/op;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 569
    iput-object p1, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 3

    .prologue
    .line 574
    invoke-super {p0}, Landroid/database/DataSetObserver;->onChanged()V

    .line 575
    iget-object v0, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_registerButton:Landroid/widget/Button;

    if-nez v0, :cond_1

    .line 582
    :cond_0
    :goto_0
    return-void

    .line 578
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/v;

    invoke-virtual {v0}, Lcom/kik/view/adapters/v;->a()I

    move-result v0

    .line 579
    iget-object v1, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_registerButton:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getBottom()I

    move-result v1

    iget-object v2, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v2}, Lkik/android/widget/KikAutoCompleteTextView;->getBottom()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikRegistrationFragment;->j(Lkik/android/chat/fragment/KikRegistrationFragment;)I

    move-result v2

    add-int/2addr v1, v2

    .line 580
    iget-object v2, p0, Lkik/android/chat/fragment/op;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v2, v0}, Lkik/android/widget/KikAutoCompleteTextView;->setDropDownHeight(I)V

    goto :goto_0
.end method
