.class final Lkik/android/chat/fragment/oq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikRegistrationFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikRegistrationFragment;)V
    .locals 0

    .prologue
    .line 622
    iput-object p1, p0, Lkik/android/chat/fragment/oq;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 626
    iget-object v0, p0, Lkik/android/chat/fragment/oq;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_usernameField:Landroid/widget/EditText;

    iget-object v1, p0, Lkik/android/chat/fragment/oq;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->k(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v1

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 627
    iget-object v0, p0, Lkik/android/chat/fragment/oq;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->k(Lkik/android/chat/fragment/KikRegistrationFragment;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0, v3, v3}, Landroid/graphics/drawable/AnimationDrawable;->setVisible(ZZ)Z

    .line 628
    return-void
.end method
