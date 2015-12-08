.class final Lkik/android/chat/fragment/pf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Landroid/content/res/Resources;

.field final synthetic b:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/pf;->a:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .prologue
    .line 458
    iget-object v0, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 460
    iget-object v0, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 461
    :goto_0
    if-nez p2, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/pf;->a:Landroid/content/res/Resources;

    const v2, 0x7f0901ee

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 463
    iget-object v1, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->f(Lkik/android/chat/fragment/KikRegistrationFragment;)Ljava/util/Timer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    .line 464
    iget-object v1, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/chat/fragment/KikRegistrationFragment;Ljava/lang/String;)V

    .line 467
    :cond_0
    return-void

    .line 460
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/pf;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
