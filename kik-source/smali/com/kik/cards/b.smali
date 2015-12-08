.class final Lcom/kik/cards/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/a;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 119
    iget-object v0, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/usermedia/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 121
    iget-object v0, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/usermedia/b;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/usermedia/b;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment;->setCancelable(Z)V

    .line 124
    iget-object v0, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    move-object v0, v1

    .line 129
    :goto_0
    iget-object v1, p0, Lcom/kik/cards/b;->a:Lcom/kik/cards/a;

    iget-object v1, v1, Lcom/kik/cards/a;->e:Lcom/kik/cards/KikCardsWebViewFragment;

    invoke-virtual {v1, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 130
    return-void

    :cond_0
    move-object v0, v2

    .line 127
    goto :goto_0
.end method
