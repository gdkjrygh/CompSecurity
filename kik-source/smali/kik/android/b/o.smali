.class final Lkik/android/b/o;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/b/n;


# direct methods
.method constructor <init>(Lkik/android/b/n;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lkik/android/b/o;->a:Lkik/android/b/n;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 118
    check-cast p1, Lcom/kik/cards/web/av$a;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    new-instance v0, Lkik/android/chat/fragment/KikPermissionsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPermissionsFragment$a;-><init>()V

    iget-object v1, p0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v1, v1, Lkik/android/b/n;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/KikPermissionsFragment$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikPermissionsFragment$a;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikPermissionsFragment$a;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikPermissionsFragment$a;

    invoke-virtual {p1}, Lcom/kik/cards/web/av$a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment$a;->e(Ljava/lang/String;)Lkik/android/chat/fragment/KikPermissionsFragment$a;

    :cond_0
    iget-object v1, p0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v1, v1, Lkik/android/b/n;->c:Lkik/android/b/m;

    invoke-static {v1}, Lkik/android/b/m;->b(Lkik/android/b/m;)Lcom/kik/cards/web/CardsWebViewFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/b/p;

    invoke-direct {v1, p0}, Lkik/android/b/p;-><init>(Lkik/android/b/o;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 174
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 175
    iget-object v0, p0, Lkik/android/b/o;->a:Lkik/android/b/n;

    iget-object v0, v0, Lkik/android/b/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 176
    return-void
.end method
