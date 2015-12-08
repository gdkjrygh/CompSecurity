.class final Lkik/android/chat/fragment/ev;
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
    .line 3747
    iput-object p1, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 3751
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ay(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3752
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Z)V

    .line 3753
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->i(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 3754
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->as(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3755
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->at(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3757
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "New Messages Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "New Messages"

    iget-object v2, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->aH(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 3758
    iget-object v0, p0, Lkik/android/chat/fragment/ev;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aI(Lkik/android/chat/fragment/KikChatFragment;)I

    .line 3759
    return-void
.end method
