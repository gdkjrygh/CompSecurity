.class final Lkik/android/widget/r;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/q;


# direct methods
.method constructor <init>(Lkik/android/widget/q;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 60
    check-cast p1, Landroid/content/Intent;

    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0}, Lkik/android/widget/ContentLinkView;->d(Lkik/android/widget/ContentLinkView;)Lcom/kik/android/a;

    move-result-object v0

    const-string v1, "Content Link Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "image"

    iget-object v2, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v2, v2, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Content Type"

    const-string v2, "Image"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    :goto_0
    iget-object v1, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v1, v1, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v1}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v1, "Has Byline"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    :goto_1
    const-string v1, "URL"

    iget-object v2, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v2, v2, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0}, Lkik/android/widget/ContentLinkView;->e(Lkik/android/widget/ContentLinkView;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0}, Lkik/android/widget/ContentLinkView;->f(Lkik/android/widget/ContentLinkView;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0}, Lkik/android/widget/ContentLinkView;->d(Lkik/android/widget/ContentLinkView;)Lcom/kik/android/a;

    move-result-object v0

    const-string v1, "Browser Screen Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Brand Chat"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v2, v2, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v2, v2, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

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

    :cond_1
    const-string v0, "CardLauncher.EXTRA_KIK_MESSAGE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    :try_start_0
    const-string v0, "CardsWebViewFragment.EXTRA_REFERER_URL"

    const-string v1, "https://kik.com/"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-virtual {v0}, Lkik/android/widget/ContentLinkView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lkik/android/chat/activity/k;->a(Landroid/content/Intent;Landroid/content/Context;)Lcom/kik/g/p;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    return-void

    :cond_2
    iget-object v1, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v1, v1, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v1}, Lkik/android/widget/ContentLinkView;->e(Lkik/android/widget/ContentLinkView;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "Content Type"

    const-string v2, "Card"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v1, v1, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v1}, Lkik/android/widget/ContentLinkView;->f(Lkik/android/widget/ContentLinkView;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "Content Type"

    const-string v2, "Web"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    goto/16 :goto_0

    :cond_4
    const-string v1, "Content Type"

    const-string v2, "Native"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    goto/16 :goto_0

    :cond_5
    const-string v1, "Has Byline"

    invoke-virtual {v0, v1, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    goto/16 :goto_1

    :catch_0
    move-exception v0

    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-virtual {v0}, Lkik/android/widget/ContentLinkView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090174

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 109
    iget-object v0, p0, Lkik/android/widget/r;->a:Lkik/android/widget/q;

    iget-object v0, v0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-virtual {v0}, Lkik/android/widget/ContentLinkView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090174

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 110
    return-void
.end method
