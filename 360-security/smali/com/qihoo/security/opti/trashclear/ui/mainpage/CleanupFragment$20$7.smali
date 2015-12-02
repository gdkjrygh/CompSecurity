.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(ILjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/d;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 0

    .prologue
    .line 865
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->a:Lcom/qihoo/security/opti/trashclear/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 869
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 870
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->J(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V

    .line 874
    :goto_0
    return-void

    .line 873
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20$7;->a:Lcom/qihoo/security/opti/trashclear/d;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$20;Lcom/qihoo/security/opti/trashclear/d;)V

    goto :goto_0
.end method
