.class final Lcom/roidapp/cloudlib/sns/notification/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/p;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/p;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/r;->a:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/r;->a:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->a(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 137
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/r;->a:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->a(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/r;->a:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->b(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 133
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/r;->a:Lcom/roidapp/cloudlib/sns/notification/p;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/p;->b(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
