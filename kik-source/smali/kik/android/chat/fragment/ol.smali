.class final Lkik/android/chat/fragment/ol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Landroid/content/res/Resources;

.field final synthetic b:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 470
    iput-object p1, p0, Lkik/android/chat/fragment/ol;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ol;->a:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 485
    .line 486
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/fragment/ol;->a:Landroid/content/res/Resources;

    const v3, 0x7f0901ec

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lkik/android/chat/fragment/ol;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->i(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 492
    :goto_0
    iget-object v2, p0, Lkik/android/chat/fragment/ol;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikRegistrationFragment;->_passwordField:Landroid/widget/EditText;

    invoke-virtual {v2, v1, v1, v0, v1}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 493
    return-void

    .line 489
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 490
    iget-object v0, p0, Lkik/android/chat/fragment/ol;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->g(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 480
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 475
    return-void
.end method
