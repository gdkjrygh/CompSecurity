.class final Lkik/android/chat/fragment/ew;
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
    .line 3762
    iput-object p1, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 3766
    iget-object v0, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Unread Messages Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 3768
    iget-object v0, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aJ(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/s;

    move-result-object v0

    .line 3769
    if-eqz v0, :cond_0

    .line 3770
    iget-object v1, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->ar(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/au;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kik/view/adapters/au;->getPosition(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getHeaderViewsCount()I

    move-result v1

    add-int/2addr v0, v1

    .line 3771
    if-ltz v0, :cond_1

    iget-object v1, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 3772
    iget-object v1, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/widget/ResizeEventList;->smoothScrollToPosition(I)V

    .line 3779
    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aF(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3780
    iget-object v0, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aK(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 3781
    return-void

    .line 3774
    :cond_1
    if-gez v0, :cond_0

    .line 3775
    iget-object v0, p0, Lkik/android/chat/fragment/ew;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->m(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ResizeEventList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/ResizeEventList;->smoothScrollToPosition(I)V

    goto :goto_0
.end method
