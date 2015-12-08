.class public Lcom/splunk/mint/DataSaverResponse;
.super Ljava/lang/Object;
.source "DataSaverResponse.java"


# instance fields
.field private data:Ljava/lang/String;

.field private exception:Ljava/lang/Exception;

.field private filepath:Ljava/lang/String;

.field private savedSuccessfully:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Ljava/lang/String;
    .param p2, "filepath"    # Ljava/lang/String;

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/splunk/mint/DataSaverResponse;->data:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/splunk/mint/DataSaverResponse;->filepath:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/splunk/mint/DataSaverResponse;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getException()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/splunk/mint/DataSaverResponse;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public getFilepath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/splunk/mint/DataSaverResponse;->filepath:Ljava/lang/String;

    return-object v0
.end method

.method public getSavedSuccessfully()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/splunk/mint/DataSaverResponse;->savedSuccessfully:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected setException(Ljava/lang/Exception;)V
    .locals 0
    .param p1, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 39
    iput-object p1, p0, Lcom/splunk/mint/DataSaverResponse;->exception:Ljava/lang/Exception;

    .line 40
    return-void
.end method

.method protected setSavedSuccessfully(Ljava/lang/Boolean;)V
    .locals 0
    .param p1, "savedSuccessfully"    # Ljava/lang/Boolean;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/splunk/mint/DataSaverResponse;->savedSuccessfully:Ljava/lang/Boolean;

    .line 52
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataSaverResponse [data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/DataSaverResponse;->data:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", filepath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/DataSaverResponse;->filepath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exception="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/DataSaverResponse;->exception:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", savedSuccessfully="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/splunk/mint/DataSaverResponse;->savedSuccessfully:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
