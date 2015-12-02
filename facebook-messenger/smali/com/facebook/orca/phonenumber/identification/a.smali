.class public Lcom/facebook/orca/phonenumber/identification/a;
.super Ljava/lang/Object;
.source "PhoneNumberIdentificationServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Landroid/support/v4/a/e;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/orca/protocol/methods/ag;

.field private final d:Lcom/facebook/orca/phonenumber/identification/f;


# direct methods
.method public constructor <init>(Landroid/support/v4/a/e;Ljavax/inject/a;Lcom/facebook/orca/protocol/methods/ag;Lcom/facebook/orca/phonenumber/identification/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/a/e;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/orca/protocol/methods/ag;",
            "Lcom/facebook/orca/phonenumber/identification/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/a;->a:Landroid/support/v4/a/e;

    .line 53
    iput-object p2, p0, Lcom/facebook/orca/phonenumber/identification/a;->b:Ljavax/inject/a;

    .line 54
    iput-object p3, p0, Lcom/facebook/orca/phonenumber/identification/a;->c:Lcom/facebook/orca/protocol/methods/ag;

    .line 55
    iput-object p4, p0, Lcom/facebook/orca/phonenumber/identification/a;->d:Lcom/facebook/orca/phonenumber/identification/f;

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/phonenumber/identification/a;)Landroid/support/v4/a/e;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/a;->a:Landroid/support/v4/a/e;

    return-object v0
.end method

.method private a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 203
    const v1, 0x15f8f

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 186
    new-instance v0, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;

    invoke-virtual {p1}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;->a()Ljava/lang/String;

    move-result-object v2

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/a;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 193
    iget-object v2, p0, Lcom/facebook/orca/phonenumber/identification/a;->c:Lcom/facebook/orca/protocol/methods/ag;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 83
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 84
    const-string v0, "verifyPhoneNumberParams"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;

    .line 86
    const-string v2, "flow"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 87
    const-string v3, "reg_instance"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/phonenumber/identification/a;->a()Ljava/lang/String;

    move-result-object v3

    .line 95
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v4

    .line 96
    new-instance v5, Lcom/facebook/fbservice/service/FutureOperationResult;

    invoke-direct {v5, v4}, Lcom/facebook/fbservice/service/FutureOperationResult;-><init>(Lcom/google/common/d/a/s;)V

    .line 102
    iget-object v6, p0, Lcom/facebook/orca/phonenumber/identification/a;->d:Lcom/facebook/orca/phonenumber/identification/f;

    new-instance v7, Landroid/os/Handler;

    invoke-direct {v7}, Landroid/os/Handler;-><init>()V

    invoke-virtual {v6, v7, v3}, Lcom/facebook/orca/phonenumber/identification/f;->a(Landroid/os/Handler;Ljava/lang/String;)Lcom/google/common/d/a/s;

    move-result-object v6

    .line 103
    new-instance v7, Lcom/facebook/orca/phonenumber/identification/b;

    invoke-direct {v7, p0, v4}, Lcom/facebook/orca/phonenumber/identification/b;-><init>(Lcom/facebook/orca/phonenumber/identification/a;Lcom/google/common/d/a/ab;)V

    invoke-static {v6, v7}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 118
    :try_start_0
    invoke-direct {p0, v0, v3, v2, v1}, Lcom/facebook/orca/phonenumber/identification/a;->a(Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    return-object v5

    .line 119
    :catch_0
    move-exception v0

    .line 121
    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/a;->d:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {v1}, Lcom/facebook/orca/phonenumber/identification/f;->a()V

    .line 122
    throw v0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 141
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 142
    const-string v0, "verifyPhoneNumberParams"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;

    .line 144
    const-string v0, "flow"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 145
    const-string v0, "reg_instance"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/a;->d:Lcom/facebook/orca/phonenumber/identification/f;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    const-wide/32 v3, 0x927c0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/phonenumber/identification/f;->a(Landroid/os/Handler;Ljava/lang/String;JZ)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 153
    new-instance v1, Lcom/facebook/orca/phonenumber/identification/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/phonenumber/identification/c;-><init>(Lcom/facebook/orca/phonenumber/identification/a;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 170
    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v6, v0, v7, v8}, Lcom/facebook/orca/phonenumber/identification/a;->a(Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 171
    :catch_0
    move-exception v0

    .line 173
    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/a;->d:Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {v1}, Lcom/facebook/orca/phonenumber/identification/f;->a()V

    .line 174
    throw v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 64
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 66
    sget-object v1, Lcom/facebook/orca/server/aq;->G:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 67
    invoke-direct {p0, p1}, Lcom/facebook/orca/phonenumber/identification/a;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 69
    :goto_0
    return-object v0

    .line 68
    :cond_0
    sget-object v1, Lcom/facebook/orca/server/aq;->H:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 69
    invoke-direct {p0, p1}, Lcom/facebook/orca/phonenumber/identification/a;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 71
    :cond_1
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
