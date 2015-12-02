.class Lcom/facebook/orca/images/k;
.super Lcom/facebook/fbservice/ops/h;
.source "ThreadIconPickerActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/images/ThreadIconPickerActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/images/ThreadIconPickerActivity;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/images/k;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/images/k;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/images/ThreadIconPickerActivity;->finish()V

    .line 105
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/orca/images/k;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/images/k;->a:Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(Landroid/app/Activity;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 114
    return-void
.end method
