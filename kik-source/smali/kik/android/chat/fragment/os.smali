.class final Lkik/android/chat/fragment/os;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;Z)V
    .locals 0

    .prologue
    .line 708
    iput-object p1, p0, Lkik/android/chat/fragment/os;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/os;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 712
    iget-boolean v0, p0, Lkik/android/chat/fragment/os;->a:Z

    if-eqz v0, :cond_0

    .line 713
    iget-object v0, p0, Lkik/android/chat/fragment/os;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/os;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->i(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 718
    :goto_0
    return-void

    .line 716
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/os;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/os;->b:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->g(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method
