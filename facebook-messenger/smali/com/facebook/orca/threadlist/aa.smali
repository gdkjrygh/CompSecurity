.class Lcom/facebook/orca/threadlist/aa;
.super Ljava/lang/Object;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/widget/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/t;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/facebook/orca/threadlist/aa;->a:Lcom/facebook/orca/threadlist/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/orca/threadlist/aa;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "find_contacts_failed_dismiss"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 288
    iget-object v0, p0, Lcom/facebook/orca/threadlist/aa;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->e(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/contacts/upload/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->a()V

    .line 289
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 295
    iget-object v0, p0, Lcom/facebook/orca/threadlist/aa;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;

    move-result-object v0

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "find_contacts_failed_try_again"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/threadlist/aa;->a:Lcom/facebook/orca/threadlist/t;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/t;->e(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/contacts/upload/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/ContactsUploadProgressMode;->SHOW_IN_THREAD_LIST_AND_DIVE_BAR:Lcom/facebook/contacts/upload/ContactsUploadProgressMode;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/upload/c;->a(Lcom/facebook/contacts/upload/ContactsUploadProgressMode;)V

    .line 301
    return-void
.end method
