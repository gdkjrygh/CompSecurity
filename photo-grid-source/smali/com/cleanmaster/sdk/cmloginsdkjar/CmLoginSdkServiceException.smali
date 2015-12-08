.class public Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;
.super Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;


# direct methods
.method public constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkException;-><init>(Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    .line 20
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{CmLoginSdkServiceException: httpResponseCode: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getRequestStatusCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CmLoginErrorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CmLoginErrorType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getErrorType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkServiceException;->error:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;

    invoke-virtual {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
