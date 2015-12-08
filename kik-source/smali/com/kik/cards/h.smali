.class final Lcom/kik/cards/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/kik/cards/KikCardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/KikCardsWebViewFragment;ZLandroid/app/Activity;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/kik/cards/h;->c:Lcom/kik/cards/KikCardsWebViewFragment;

    iput-boolean p2, p0, Lcom/kik/cards/h;->a:Z

    iput-object p3, p0, Lcom/kik/cards/h;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    const/16 v1, 0x400

    .line 231
    iget-boolean v0, p0, Lcom/kik/cards/h;->a:Z

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lcom/kik/cards/h;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 237
    :goto_0
    iget-object v1, p0, Lcom/kik/cards/h;->c:Lcom/kik/cards/KikCardsWebViewFragment;

    iget-boolean v0, p0, Lcom/kik/cards/h;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-static {v1, v0}, Lcom/kik/cards/KikCardsWebViewFragment;->a(Lcom/kik/cards/KikCardsWebViewFragment;Z)Z

    .line 238
    return-void

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/h;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    goto :goto_0

    .line 237
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
