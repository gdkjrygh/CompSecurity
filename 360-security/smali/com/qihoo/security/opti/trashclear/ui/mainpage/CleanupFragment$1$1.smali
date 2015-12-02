.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 283
    :cond_0
    :goto_0
    return-void

    .line 282
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)V

    goto :goto_0
.end method
