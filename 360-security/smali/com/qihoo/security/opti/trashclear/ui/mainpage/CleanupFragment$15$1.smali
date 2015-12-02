.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;I)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 336
    :cond_0
    :goto_0
    return-void

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Landroid/support/v4/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_2

    .line 330
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V

    goto :goto_0

    .line 331
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)I

    .line 333
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15$1;->a:I

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;I)V

    goto :goto_0
.end method
