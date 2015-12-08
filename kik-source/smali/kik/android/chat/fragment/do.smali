.class final Lkik/android/chat/fragment/do;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Z)V
    .locals 0

    .prologue
    .line 2139
    iput-object p1, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-boolean p2, p0, Lkik/android/chat/fragment/do;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 2144
    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->v(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 2145
    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->ah(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 2146
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->k()Lkik/a/d/a/a;

    move-result-object v0

    .line 2147
    iget-object v1, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    const-string v2, "Attachment Overwritten"

    iget-boolean v3, p0, Lkik/android/chat/fragment/do;->a:Z

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;ZLjava/lang/String;)V

    .line 2148
    iget-object v1, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatFragment;->sendButton:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 2149
    iget-object v1, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->ai(Lkik/android/chat/fragment/KikChatFragment;)V

    .line 2150
    iget-object v1, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V

    .line 2151
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2154
    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lkik/android/widget/GalleryWidget;

    if-eqz v0, :cond_0

    .line 2155
    iget-object v0, p0, Lkik/android/chat/fragment/do;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lkik/android/widget/GalleryWidget;

    invoke-virtual {v0}, Lkik/android/widget/GalleryWidget;->c()V

    .line 2157
    :cond_0
    return-void
.end method
