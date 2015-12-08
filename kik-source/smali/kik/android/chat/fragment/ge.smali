.class final Lkik/android/chat/fragment/ge;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 5642
    iput-object p1, p0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 5642
    check-cast p1, Lkik/a/d/a/a;

    iget-object v0, p0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ag(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/f/a/f;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    new-instance v1, Lkik/android/chat/fragment/gf;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/gf;-><init>(Lkik/android/chat/fragment/ge;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Ljava/lang/Runnable;)V

    invoke-super {p0}, Lcom/kik/g/r;->c()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 5661
    iget-object v0, p0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aq(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5662
    iget-object v0, p0, Lkik/android/chat/fragment/ge;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aq(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Failed to attach!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 5664
    :cond_0
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 5665
    return-void
.end method
