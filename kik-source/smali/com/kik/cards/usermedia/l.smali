.class final Lcom/kik/cards/usermedia/l;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/kik/g/p;

.field final synthetic c:Lcom/kik/cards/usermedia/k;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/k;ZLcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/kik/cards/usermedia/l;->c:Lcom/kik/cards/usermedia/k;

    iput-boolean p2, p0, Lcom/kik/cards/usermedia/l;->a:Z

    iput-object p3, p0, Lcom/kik/cards/usermedia/l;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const v5, 0x7f090062

    const/4 v4, 0x1

    .line 52
    check-cast p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/kik/cards/usermedia/l;->c:Lcom/kik/cards/usermedia/k;

    invoke-static {v0}, Lcom/kik/cards/usermedia/k;->a(Lcom/kik/cards/usermedia/k;)Lcom/kik/cards/web/CardsWebViewFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->t()Landroid/content/Context;

    move-result-object v1

    iget-boolean v0, p0, Lcom/kik/cards/usermedia/l;->a:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lkik/android/util/e;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2, v1}, Lkik/android/util/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v1, p0, Lcom/kik/cards/usermedia/l;->b:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "CustomGalleryActivity.EXTRA_RESULTS"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/kik/cards/usermedia/l;->b:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 90
    return-void
.end method
