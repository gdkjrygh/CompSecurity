.class Landroid_src/mms/transaction/t;
.super Landroid/os/Handler;
.source "TransactionService.java"


# instance fields
.field final synthetic a:Landroid_src/mms/transaction/TransactionService;


# direct methods
.method constructor <init>(Landroid_src/mms/transaction/TransactionService;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Landroid_src/mms/transaction/t;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 139
    const/4 v0, 0x0

    .line 141
    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v1, v3, :cond_2

    .line 142
    iget-object v0, p0, Landroid_src/mms/transaction/t;->a:Landroid_src/mms/transaction/TransactionService;

    sget v1, Lcom/facebook/o;->message_queued:I

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/TransactionService;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 147
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 148
    iget-object v1, p0, Landroid_src/mms/transaction/t;->a:Landroid_src/mms/transaction/TransactionService;

    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 151
    :cond_1
    return-void

    .line 143
    :cond_2
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 144
    iget-object v0, p0, Landroid_src/mms/transaction/t;->a:Landroid_src/mms/transaction/TransactionService;

    sget v1, Lcom/facebook/o;->download_later:I

    invoke-virtual {v0, v1}, Landroid_src/mms/transaction/TransactionService;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
