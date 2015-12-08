.class final Lkik/android/chat/fragment/es;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Lkik/android/chat/fragment/eq;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/eq;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 3423
    iput-object p1, p0, Lkik/android/chat/fragment/es;->b:Lkik/android/chat/fragment/eq;

    iput-object p2, p0, Lkik/android/chat/fragment/es;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 3428
    iget-object v0, p0, Lkik/android/chat/fragment/es;->a:Ljava/lang/Throwable;

    instance-of v0, v0, Lkik/android/v;

    if-eqz v0, :cond_0

    .line 3429
    iget-object v0, p0, Lkik/android/chat/fragment/es;->b:Lkik/android/chat/fragment/eq;

    iget-object v0, v0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aq(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090205

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 3434
    :goto_0
    return-void

    .line 3432
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/es;->b:Lkik/android/chat/fragment/eq;

    iget-object v0, v0, Lkik/android/chat/fragment/eq;->c:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aq(Lkik/android/chat/fragment/KikChatFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090204

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
