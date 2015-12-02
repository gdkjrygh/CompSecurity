.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;
.super Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;)V
    .locals 1

    .prologue
    .line 711
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;)V

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 3

    .prologue
    .line 715
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 743
    :cond_0
    :goto_0
    return-void

    .line 718
    :cond_1
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    .line 720
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;

    invoke-direct {v2, p0, p1, p2, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$3;JLjava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
