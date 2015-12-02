.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 288
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 292
    if-eqz p2, :cond_0

    .line 293
    const-string/jumbo v0, "action_get_data_size"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const-string/jumbo v1, "size"

    invoke-virtual {p2, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)J

    .line 311
    :cond_0
    :goto_0
    return-void

    .line 301
    :cond_1
    const-string/jumbo v0, "action_get_pre_data_size"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$12;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    const-string/jumbo v1, "size"

    invoke-virtual {p2, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)J

    goto :goto_0
.end method
