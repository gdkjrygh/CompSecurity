.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;)V
    .locals 0

    .prologue
    .line 1860
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v0, 0x2

    .line 1863
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;)I

    move-result v1

    .line 1864
    if-ge v1, v0, :cond_0

    .line 1867
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$10;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v2, v3, v0, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$k;->sendMessage(Landroid/os/Message;)Z

    .line 1869
    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method
