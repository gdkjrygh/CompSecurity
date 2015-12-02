.class Lcom/qihoo/security/opti/trashclear/service/e$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/service/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/service/e;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/service/e;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    .line 112
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 212
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 182
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v0

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/service/b;->a:Ljava/lang/String;

    .line 184
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v1

    iget-wide v2, v1, Lcom/qihoo/security/opti/trashclear/service/b;->b:J

    .line 185
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->a(Lcom/qihoo/security/opti/trashclear/service/e;)Lcom/qihoo/security/opti/trashclear/service/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/service/c;->b()Lcom/qihoo/security/opti/trashclear/service/b;

    move-result-object v1

    iget-wide v4, v1, Lcom/qihoo/security/opti/trashclear/service/b;->c:J

    .line 191
    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->b(Lcom/qihoo/security/opti/trashclear/service/e;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 192
    new-instance v1, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;

    invoke-direct {v1}, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;-><init>()V

    .line 193
    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;->appName:Ljava/lang/String;

    .line 194
    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/service/ResidualFileInfo;->fileSize:J

    .line 196
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 197
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 198
    const-string/jumbo v2, "uninstalled_app_info"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 200
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/e$1;->a:Lcom/qihoo/security/opti/trashclear/service/e;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/service/e;->c(Lcom/qihoo/security/opti/trashclear/service/e;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 112
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
