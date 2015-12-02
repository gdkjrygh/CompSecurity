.class Lcom/facebook/orca/activity/a;
.super Lcom/facebook/fbservice/ops/ac;
.source "AddContactsActivity.java"


# instance fields
.field final synthetic a:Landroid/app/ProgressDialog;

.field final synthetic b:Lcom/facebook/orca/activity/AddContactsActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/activity/AddContactsActivity;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    iput-object p2, p0, Lcom/facebook/orca/activity/a;->a:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    iget-object v1, p0, Lcom/facebook/orca/activity/a;->a:Landroid/app/ProgressDialog;

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Landroid/app/ProgressDialog;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 103
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "result"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 104
    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {v0}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    .line 107
    iget-object v2, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v4, "phone_number_search_success"

    invoke-direct {v3, v4}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v4, "uid"

    invoke-virtual {v3, v4, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/facebook/analytics/cb;)V

    .line 110
    iget-object v2, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-static {v2, v1, v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_0
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "phone_number_search_no_match"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/facebook/analytics/cb;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-static {v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;)V

    goto :goto_0
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "phone_number_search_server_error"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/facebook/analytics/cb;)V

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    iget-object v1, p0, Lcom/facebook/orca/activity/a;->a:Landroid/app/ProgressDialog;

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Landroid/app/ProgressDialog;)V

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-static {v0}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;)V

    .line 124
    iget-object v0, p0, Lcom/facebook/orca/activity/a;->b:Lcom/facebook/orca/activity/AddContactsActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/activity/AddContactsActivity;->a(Lcom/facebook/orca/activity/AddContactsActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 125
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 98
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/activity/a;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
