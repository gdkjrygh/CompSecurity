.class final Lcom/kik/cards/c;
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
    .line 138
    iput-object p1, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 143
    iget-object v0, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->d:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v0, v0, Lcom/kik/cards/a;->d:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->dismissAllowingStateLoss()V

    .line 146
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 147
    iget-object v1, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v1, v1, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    invoke-virtual {v1}, Lcom/kik/cards/web/usermedia/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    .line 148
    iget-object v1, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v1, v1, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    invoke-virtual {v1}, Lcom/kik/cards/web/usermedia/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;)V

    .line 149
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->setCancelable(Z)V

    .line 150
    iget-object v1, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v1, v1, Lcom/kik/cards/a;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 151
    iget-object v1, p0, Lcom/kik/cards/c;->a:Lcom/kik/cards/a;

    iget-object v1, v1, Lcom/kik/cards/a;->e:Lcom/kik/cards/KikCardsWebViewFragment;

    invoke-virtual {v1, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 152
    return-void
.end method
