.class final Lkik/android/chat/fragment/rj;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lkik/android/chat/fragment/rj;->a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 129
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 130
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 108
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    iget-object v1, p0, Lkik/android/chat/fragment/rj;->a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 122
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 123
    iget-object v0, p0, Lkik/android/chat/fragment/rj;->a:Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->setResult(I)V

    .line 124
    return-void
.end method
