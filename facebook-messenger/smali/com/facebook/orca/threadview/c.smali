.class Lcom/facebook/orca/threadview/c;
.super Lcom/facebook/fbservice/ops/h;
.source "AddMembersActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/AddMembersActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/AddMembersActivity;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/facebook/orca/threadview/c;->a:Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/orca/threadview/c;->a:Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/AddMembersActivity;->finish()V

    .line 160
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/threadview/c;->a:Lcom/facebook/orca/threadview/AddMembersActivity;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 168
    return-void
.end method
