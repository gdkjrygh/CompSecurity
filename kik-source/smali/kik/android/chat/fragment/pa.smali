.class final Lkik/android/chat/fragment/pa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 323
    iput-object p1, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 338
    if-nez p1, :cond_0

    .line 362
    :goto_0
    return-void

    .line 341
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->f(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 342
    iget-object v0, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    new-instance v1, Ljava/util/Timer;

    const-string v2, "UsernameCheckTimer"

    invoke-direct {v1, v2}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/chat/fragment/KikRegistrationFragment;Ljava/util/Timer;)Ljava/util/Timer;

    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 344
    iget-object v0, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 347
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_firstnameField:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0901ee

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 348
    iget-object v0, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->g(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v3, v3, v1, v3}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 352
    :cond_2
    new-instance v0, Lkik/android/chat/fragment/pb;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/pb;-><init>(Lkik/android/chat/fragment/pa;Landroid/text/Editable;)V

    .line 359
    iget-object v1, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 360
    iget-object v1, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->f(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Timer;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 361
    iget-object v0, p0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->h(Lkik/android/chat/fragment/KikRegistrationFragment;)Z

    goto :goto_0
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 333
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 328
    return-void
.end method
