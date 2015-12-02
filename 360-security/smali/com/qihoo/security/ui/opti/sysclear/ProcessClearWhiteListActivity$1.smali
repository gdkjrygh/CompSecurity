.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 94
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 98
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 104
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/opti/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/opti/a/c;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a(Ljava/util/List;)V

    .line 105
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 107
    sget-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;->UI_ENTER_IGNORE_PAGE:Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;

    invoke-static {v0}, Lcom/qihoo/security/quc/AccountLog;->b(Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;)V

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    .line 110
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)I

    move-result v0

    if-nez v0, :cond_4

    .line 112
    const/16 v0, 0x2b10

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    goto :goto_0

    .line 101
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 114
    :cond_4
    const/16 v0, 0x2c31

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    goto/16 :goto_0

    .line 94
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
