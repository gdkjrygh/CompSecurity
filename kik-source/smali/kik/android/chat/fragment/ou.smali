.class final Lkik/android/chat/fragment/ou;
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
    .line 781
    iput-object p1, p0, Lkik/android/chat/fragment/ou;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 785
    iget-object v0, p0, Lkik/android/chat/fragment/ou;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/ou;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->b(Landroid/view/View;)V

    .line 786
    iget-object v0, p0, Lkik/android/chat/fragment/ou;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikRegistrationFragment;->_emailField:Lkik/android/widget/KikAutoCompleteTextView;

    invoke-virtual {v0}, Lkik/android/widget/KikAutoCompleteTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0902f7

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 787
    return-void
.end method
