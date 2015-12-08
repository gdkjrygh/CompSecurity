.class final Lkik/android/chat/fragment/fb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 580
    iput-object p1, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 585
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->o(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 604
    :goto_0
    return-void

    .line 588
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->p(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 589
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->q(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 590
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->r(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v0

    if-nez v0, :cond_1

    .line 591
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    .line 592
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$b;->d:Lkik/android/chat/fragment/KikChatFragment$b;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$b;Z)V

    .line 593
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->s(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 595
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->t(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 596
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    const-string v1, "Close"

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    .line 597
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->u(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 598
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->s(Lkik/android/chat/fragment/KikChatFragment;)V

    goto :goto_0

    .line 601
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    const-string v1, "Close"

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    .line 602
    iget-object v0, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/fb;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Landroid/view/View;)V

    goto :goto_0
.end method
