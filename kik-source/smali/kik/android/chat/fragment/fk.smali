.class final Lkik/android/chat/fragment/fk;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/a/a;

.field final synthetic b:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 4615
    iput-object p1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/fk;->a:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 4615
    check-cast p1, Landroid/content/Intent;

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->a:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.kik.ext.camera"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Camera"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    :goto_0
    const-string v0, "CardLauncher.EXTRA_KIK_MESSAGE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    :try_start_0
    const-string v1, "CardsWebViewFragment.EXTRA_REFERER_URL"

    const-string v2, "https://kik.com/"

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->j(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "CardsWebViewFragment.EXTRA_CONVO_ID"

    iget-object v2, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->j(Lkik/android/chat/fragment/KikChatFragment;)Lkik/a/d/k;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/widget/ImeAwareEditText;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, Lkik/android/chat/activity/k;->a(Landroid/content/Intent;Landroid/content/Context;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/fl;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/fragment/fl;-><init>(Lkik/android/chat/fragment/fk;Z)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_1
    const-string v1, "com.kik.ext.gallery"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Gallery"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    :cond_2
    const-string v1, "com.kik.ext.video-gallery"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Video Gallery"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :cond_3
    const-string v1, "com.kik.ext.video-camera"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Video Camera"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :cond_4
    const-string v1, "com.kik.cards"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->a:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Web"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Content Message Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Message Type"

    const-string v2, "Card"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Card URL"

    iget-object v2, p0, Lkik/android/chat/fragment/fk;->a:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :cond_6
    iget-object v1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v2, "Content Message Opened"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Message Type"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f090174

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 4671
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkik/android/b/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4672
    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->aQ(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 4680
    :cond_0
    :goto_0
    return-void

    .line 4674
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkik/android/b/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4678
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f090174

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
