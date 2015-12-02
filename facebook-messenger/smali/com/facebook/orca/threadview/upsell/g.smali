.class Lcom/facebook/orca/threadview/upsell/g;
.super Lcom/facebook/fbservice/ops/ac;
.source "MergedThreadsUpsellController.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/upsell/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 280
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/g;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 283
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/g;->a:Lcom/facebook/orca/threadview/upsell/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/upsell/a;->b(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 284
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/g;->a:Lcom/facebook/orca/threadview/upsell/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/upsell/a;->b(Lcom/facebook/orca/threadview/upsell/a;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 291
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/g;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threadview/upsell/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->audio_message_error_name:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 295
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 280
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/upsell/g;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
