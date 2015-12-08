.class final Lkik/android/chat/fragment/dy;
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
    .line 2708
    iput-object p1, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 2713
    iget-object v0, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->o(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2731
    :goto_0
    return-void

    .line 2718
    :cond_0
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Camera"

    iget-object v3, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatFragment;->L(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 2721
    :goto_1
    iget-object v3, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2722
    iget-object v1, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1, v0, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;ZZ)V

    .line 2723
    iget-object v0, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->c:I

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;I)V

    goto :goto_0

    .line 2726
    :cond_1
    iget-object v2, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v3, "Minimized Tray"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Landscape"

    iget-object v4, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Tab"

    iget-object v4, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v4}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v4

    iget-object v5, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v5}, Lkik/android/chat/fragment/KikChatFragment;->L(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/android/a$f;->b()V

    .line 2727
    iget-object v2, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatFragment;->_mediaItemArea:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 2728
    iget-object v1, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Z)V

    .line 2729
    iget-object v0, p0, Lkik/android/chat/fragment/dy;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget v1, Lkik/android/chat/fragment/KikChatFragment$c;->b:I

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;I)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method
