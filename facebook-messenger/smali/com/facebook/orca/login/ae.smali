.class public Lcom/facebook/orca/login/ae;
.super Ljava/lang/Object;
.source "WildfireRegistrationHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/http/protocol/i;

.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/f/f;

.field private final d:Lcom/facebook/orca/protocol/methods/be;

.field private final e:Lcom/facebook/orca/protocol/methods/d;

.field private final f:Lcom/facebook/orca/protocol/methods/u;

.field private final g:Lcom/facebook/orca/protocol/methods/ag;

.field private final h:Lcom/facebook/f/a;

.field private i:Lcom/facebook/fbservice/service/OperationResult;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/i;Lcom/facebook/auth/b/b;Lcom/facebook/f/f;Lcom/facebook/orca/protocol/methods/be;Lcom/facebook/orca/protocol/methods/d;Lcom/facebook/orca/protocol/methods/u;Lcom/facebook/orca/protocol/methods/ag;Lcom/facebook/f/a;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    .line 55
    iput-object p2, p0, Lcom/facebook/orca/login/ae;->b:Lcom/facebook/auth/b/b;

    .line 56
    iput-object p3, p0, Lcom/facebook/orca/login/ae;->c:Lcom/facebook/f/f;

    .line 57
    iput-object p4, p0, Lcom/facebook/orca/login/ae;->d:Lcom/facebook/orca/protocol/methods/be;

    .line 58
    iput-object p5, p0, Lcom/facebook/orca/login/ae;->e:Lcom/facebook/orca/protocol/methods/d;

    .line 59
    iput-object p6, p0, Lcom/facebook/orca/login/ae;->f:Lcom/facebook/orca/protocol/methods/u;

    .line 60
    iput-object p7, p0, Lcom/facebook/orca/login/ae;->g:Lcom/facebook/orca/protocol/methods/ag;

    .line 61
    iput-object p8, p0, Lcom/facebook/orca/login/ae;->h:Lcom/facebook/f/a;

    .line 62
    return-void
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/login/ae;->i:Lcom/facebook/fbservice/service/OperationResult;

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/login/ae;->i:Lcom/facebook/fbservice/service/OperationResult;

    .line 99
    :goto_0
    return-object v0

    .line 89
    :cond_0
    new-instance v0, Lcom/facebook/f/b;

    iget-object v1, p0, Lcom/facebook/orca/login/ae;->c:Lcom/facebook/f/f;

    invoke-interface {v1}, Lcom/facebook/f/f;->a()Lcom/google/common/a/fi;

    move-result-object v1

    sget-object v2, Lcom/facebook/f/c;->IS_SESSIONLESS:Lcom/facebook/f/c;

    invoke-direct {v0, v1, v2}, Lcom/facebook/f/b;-><init>(Lcom/google/common/a/fi;Lcom/facebook/f/c;)V

    .line 94
    new-instance v1, Lcom/facebook/http/protocol/l;

    invoke-direct {v1}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 95
    sget-object v2, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/m;)V

    .line 97
    iget-object v2, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    iget-object v3, p0, Lcom/facebook/orca/login/ae;->h:Lcom/facebook/f/a;

    invoke-interface {v2, v3, v0, v1}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 98
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/ae;->i:Lcom/facebook/fbservice/service/OperationResult;

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/login/ae;->i:Lcom/facebook/fbservice/service/OperationResult;

    goto :goto_0
.end method

.method private d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 10

    .prologue
    .line 104
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v8

    .line 105
    new-instance v0, Lcom/facebook/orca/server/UserValidateRegistrationDataParams;

    const-string v1, "firstName"

    invoke-virtual {v8, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "lastName"

    invoke-virtual {v8, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "email"

    invoke-virtual {v8, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "phone"

    invoke-virtual {v8, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "countryCode"

    invoke-virtual {v8, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "password"

    invoke-virtual {v8, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "gender"

    invoke-virtual {v8, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "birthday"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/server/UserValidateRegistrationDataParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget-object v1, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/login/ae;->d:Lcom/facebook/orca/protocol/methods/be;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    .line 123
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 124
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 125
    const-string v2, "countryCode"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 126
    const-string v3, "confirmationCode"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 127
    const-string v4, "fullName"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 128
    const-string v5, "firstName"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 129
    const-string v6, "lastName"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 130
    new-instance v0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountParams;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/login/ae;->e:Lcom/facebook/orca/protocol/methods/d;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;

    .line 142
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private f(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 147
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/login/ae;->f:Lcom/facebook/orca/protocol/methods/u;

    const-string v3, "uid"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 151
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 66
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 67
    sget-object v1, Lcom/facebook/orca/server/aq;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ae;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 76
    :goto_0
    return-object v0

    .line 69
    :cond_0
    sget-object v1, Lcom/facebook/orca/server/aq;->b:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 70
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ae;->d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 71
    :cond_1
    sget-object v1, Lcom/facebook/orca/server/aq;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 72
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ae;->e(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 73
    :cond_2
    sget-object v1, Lcom/facebook/orca/server/aq;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/ae;->f(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 75
    :cond_3
    sget-object v1, Lcom/facebook/orca/server/aq;->D:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 76
    invoke-virtual {p0, p1}, Lcom/facebook/orca/login/ae;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 78
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 156
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 157
    const-string v1, "requestSmsConfirmationCodeParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;

    .line 160
    iget-object v1, p0, Lcom/facebook/orca/login/ae;->a:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/login/ae;->g:Lcom/facebook/orca/protocol/methods/ag;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
