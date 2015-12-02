.class public Lcom/facebook/auth/login/s;
.super Ljava/lang/Object;
.source "AuthServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private a:Lcom/facebook/auth/login/o;

.field private b:Lcom/facebook/auth/login/bc;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/login/o;Lcom/facebook/auth/login/bc;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/auth/login/s;->a:Lcom/facebook/auth/login/o;

    .line 24
    iput-object p2, p0, Lcom/facebook/auth/login/s;->b:Lcom/facebook/auth/login/bc;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 29
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 30
    sget-object v1, Lcom/facebook/auth/login/n;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/s;->a:Lcom/facebook/auth/login/o;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "accessToken"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/o;->a(Ljava/lang/String;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    .line 33
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 47
    :goto_0
    return-object v0

    .line 34
    :cond_0
    sget-object v1, Lcom/facebook/auth/login/n;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "passwordCredentials"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/credentials/PasswordCredentials;

    .line 37
    iget-object v1, p0, Lcom/facebook/auth/login/s;->a:Lcom/facebook/auth/login/o;

    invoke-virtual {v1, v0}, Lcom/facebook/auth/login/o;->a(Lcom/facebook/auth/credentials/PasswordCredentials;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    .line 38
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 39
    :cond_1
    sget-object v1, Lcom/facebook/auth/login/n;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 40
    iget-object v0, p0, Lcom/facebook/auth/login/s;->a:Lcom/facebook/auth/login/o;

    invoke-virtual {v0}, Lcom/facebook/auth/login/o;->a()V

    .line 41
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 42
    :cond_2
    sget-object v1, Lcom/facebook/auth/login/n;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 43
    iget-object v0, p0, Lcom/facebook/auth/login/s;->a:Lcom/facebook/auth/login/o;

    invoke-virtual {v0}, Lcom/facebook/auth/login/o;->b()V

    .line 44
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 45
    :cond_3
    sget-object v1, Lcom/facebook/auth/login/bb;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 46
    iget-object v0, p0, Lcom/facebook/auth/login/s;->b:Lcom/facebook/auth/login/bc;

    invoke-virtual {v0}, Lcom/facebook/auth/login/bc;->a()V

    .line 47
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 49
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unhandled operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
