.class Lcom/facebook/contacts/contactcard/ay;
.super Lcom/facebook/fbservice/ops/ac;
.source "VoipInfoLoader.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/contactcard/ax;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/contactcard/ax;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 152
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchVoipInfoResult;

    invoke-static {v1, v0}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Lcom/facebook/contacts/server/FetchVoipInfoResult;)Lcom/facebook/contacts/server/FetchVoipInfoResult;

    .line 153
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 154
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Z)Z

    .line 155
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-static {v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;)Lcom/facebook/common/time/a;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;J)J

    .line 156
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ax;->b(Lcom/facebook/contacts/contactcard/ax;)V

    .line 157
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 161
    invoke-static {}, Lcom/facebook/contacts/contactcard/ax;->g()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "Fetching voip_info failed"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-static {v0, v2}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Lcom/facebook/contacts/server/FetchVoipInfoResult;)Lcom/facebook/contacts/server/FetchVoipInfoResult;

    .line 163
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-static {v0, v2}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 164
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/contacts/contactcard/ax;->a(Lcom/facebook/contacts/contactcard/ax;Z)Z

    .line 165
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/ay;->a:Lcom/facebook/contacts/contactcard/ax;

    invoke-static {v0}, Lcom/facebook/contacts/contactcard/ax;->b(Lcom/facebook/contacts/contactcard/ax;)V

    .line 166
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 149
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/contactcard/ay;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
