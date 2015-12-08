.class final Lkik/android/b/l;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lkik/android/chat/fragment/KikCardBrowserFragment;

.field final synthetic d:Lkik/android/b/k;


# direct methods
.method constructor <init>(Lkik/android/b/k;Lcom/kik/g/p;Ljava/util/List;Lkik/android/chat/fragment/KikCardBrowserFragment;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lkik/android/b/l;->d:Lkik/android/b/k;

    iput-object p2, p0, Lkik/android/b/l;->a:Lcom/kik/g/p;

    iput-object p3, p0, Lkik/android/b/l;->b:Ljava/util/List;

    iput-object p4, p0, Lkik/android/b/l;->c:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 169
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 170
    iget-object v0, p0, Lkik/android/b/l;->c:Lkik/android/chat/fragment/KikCardBrowserFragment;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lkik/android/b/l;->c:Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->Q()V

    .line 173
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 150
    check-cast p1, Lkik/a/d/k;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/b/l;->a:Lcom/kik/g/p;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/b/l;->d:Lkik/android/b/k;

    iget-object v1, p0, Lkik/android/b/l;->b:Ljava/util/List;

    iget-object v2, p0, Lkik/android/b/l;->d:Lkik/android/b/k;

    invoke-static {v2}, Lkik/android/b/k;->a(Lkik/android/b/k;)Lcom/kik/cards/web/CardsWebViewFragment;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v2

    invoke-static {v0, p1, v1, v2}, Lkik/android/b/k;->a(Lkik/android/b/k;Lkik/a/d/k;Ljava/util/List;I)Lcom/kik/g/p;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 162
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 163
    iget-object v0, p0, Lkik/android/b/l;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 164
    return-void
.end method
