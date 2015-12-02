.class Lcom/facebook/contacts/upload/e;
.super Ljava/lang/Object;
.source "ContactsUploadRunner.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/upload/c;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/upload/c;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 126
    invoke-static {}, Lcom/facebook/contacts/upload/c;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Contacts upload succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 128
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v0}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/c;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "contacts_upload_succeeded"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 131
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v1, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 133
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 123
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/upload/e;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 137
    invoke-static {}, Lcom/facebook/contacts/upload/c;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Contacts upload failed: "

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/fbservice/ops/n;)Lcom/facebook/fbservice/ops/n;

    .line 139
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v0}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/c;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "contacts_upload_failed"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v2}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 142
    instance-of v0, p1, Lcom/facebook/fbservice/service/ServiceException;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    iget-object v1, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v1

    check-cast p1, Lcom/facebook/fbservice/service/ServiceException;

    invoke-static {v1, p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a(Lcom/facebook/contacts/upload/ContactsUploadState;Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 147
    :goto_0
    return-void

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/upload/e;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {}, Lcom/facebook/contacts/upload/ContactsUploadState;->g()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    goto :goto_0
.end method
