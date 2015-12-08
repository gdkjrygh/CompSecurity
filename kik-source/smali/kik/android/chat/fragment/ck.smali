.class final Lkik/android/chat/fragment/ck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:Lkik/android/chat/fragment/cj;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/cj;Ljava/lang/Boolean;)V
    .locals 0

    .prologue
    .line 351
    iput-object p1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iput-object p2, p0, Lkik/android/chat/fragment/ck;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 355
    iget-object v0, p0, Lkik/android/chat/fragment/ck;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 357
    iget-object v0, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v0, v0, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 359
    const-string v1, "card:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "cards:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 361
    :goto_0
    if-nez v0, :cond_3

    .line 363
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 364
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v1, v1, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikChatFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/util/au;->a(Landroid/content/Intent;Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 365
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v1, v1, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->startActivity(Landroid/content/Intent;)V

    .line 387
    :cond_1
    :goto_1
    return-void

    .line 359
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 370
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v0, v0, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v0, v0, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Browser Screen Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Link"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Depth"

    invoke-static {}, Lkik/android/chat/activity/k;->e()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 377
    new-instance v0, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 378
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    const-string v2, "https://kik.com/"

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->c(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v2, v2, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikChatFragment$a;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 382
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v1, v1, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v2, v2, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/chat/fragment/KikChatFragment$b;

    move-result-object v2

    invoke-static {v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$b;)V

    .line 383
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v1, v1, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v2, v2, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v2, v2, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;)Lkik/android/widget/ImeAwareEditText;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->b(Landroid/view/View;)V

    .line 385
    iget-object v1, p0, Lkik/android/chat/fragment/ck;->b:Lkik/android/chat/fragment/cj;

    iget-object v1, v1, Lkik/android/chat/fragment/cj;->b:Lkik/android/chat/fragment/ci;

    iget-object v1, v1, Lkik/android/chat/fragment/ci;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    goto/16 :goto_1
.end method
