.class final Lcom/kik/cards/a;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/kik/cards/web/usermedia/b;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lkik/android/chat/fragment/ProgressDialogFragment;

.field final synthetic e:Lcom/kik/cards/KikCardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/KikCardsWebViewFragment;Landroid/app/Activity;Lcom/kik/cards/web/usermedia/b;Ljava/lang/String;Lkik/android/chat/fragment/ProgressDialogFragment;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/kik/cards/a;->e:Lcom/kik/cards/KikCardsWebViewFragment;

    iput-object p2, p0, Lcom/kik/cards/a;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/kik/cards/a;->b:Lcom/kik/cards/web/usermedia/b;

    iput-object p4, p0, Lcom/kik/cards/a;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/kik/cards/a;->d:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lcom/kik/cards/a;->a:Landroid/app/Activity;

    new-instance v1, Lcom/kik/cards/b;

    invoke-direct {v1, p0}, Lcom/kik/cards/b;-><init>(Lcom/kik/cards/a;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/kik/cards/a;->a:Landroid/app/Activity;

    new-instance v1, Lcom/kik/cards/c;

    invoke-direct {v1, p0}, Lcom/kik/cards/c;-><init>(Lcom/kik/cards/a;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 155
    return-void
.end method
