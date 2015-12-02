.class Lcom/facebook/contacts/upload/d;
.super Lcom/facebook/fbservice/ops/l;
.source "ContactsUploadRunner.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/upload/c;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/upload/c;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/contacts/upload/d;->a:Lcom/facebook/contacts/upload/c;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    .line 106
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 107
    iget-object v1, p0, Lcom/facebook/contacts/upload/d;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v1}, Lcom/facebook/contacts/upload/c;->b(Lcom/facebook/contacts/upload/c;)Lcom/facebook/analytics/av;

    move-result-object v1

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "contacts_upload_running"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/facebook/contacts/upload/d;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v3}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "num_processed"

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->b()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "num_matched"

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "total"

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 119
    invoke-static {}, Lcom/facebook/contacts/upload/c;->f()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Contacts upload state ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    iget-object v1, p0, Lcom/facebook/contacts/upload/d;->a:Lcom/facebook/contacts/upload/c;

    invoke-static {v1, v0}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/c;Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 121
    return-void
.end method
