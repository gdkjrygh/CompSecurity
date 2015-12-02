.class Lcom/facebook/orca/phonenumber/identification/b;
.super Ljava/lang/Object;
.source "PhoneNumberIdentificationServiceHandler.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/d/a/ab;

.field final synthetic b:Lcom/facebook/orca/phonenumber/identification/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/phonenumber/identification/a;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/facebook/orca/phonenumber/identification/b;->b:Lcom/facebook/orca/phonenumber/identification/a;

    iput-object p2, p0, Lcom/facebook/orca/phonenumber/identification/b;->a:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 103
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/phonenumber/identification/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 106
    const-string v0, "orca:PhoneNumberIdentificationServiceHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Phone number verification Successful Code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    new-instance v0, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;

    invoke-direct {v0, p1}, Lcom/facebook/orca/phonenumber/identification/VerifyPhoneNumberResult;-><init>(Ljava/lang/String;)V

    .line 108
    iget-object v1, p0, Lcom/facebook/orca/phonenumber/identification/b;->a:Lcom/google/common/d/a/ab;

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 109
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 112
    const-string v0, "orca:PhoneNumberIdentificationServiceHandler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Phone number confirmation failure"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/phonenumber/identification/b;->a:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, p1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Throwable;)Z

    .line 114
    return-void
.end method
