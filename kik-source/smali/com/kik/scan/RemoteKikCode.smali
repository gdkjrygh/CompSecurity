.class public Lcom/kik/scan/RemoteKikCode;
.super Lcom/kik/scan/KikCode;
.source "SourceFile"


# instance fields
.field private _payloadId:[B


# direct methods
.method public constructor <init>([BI)V
    .locals 1

    .prologue
    .line 10
    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lcom/kik/scan/KikCode;-><init>(II)V

    .line 12
    iput-object p1, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    .line 13
    return-void
.end method


# virtual methods
.method public encode()[B
    .locals 1

    .prologue
    .line 52
    sget-boolean v0, Lcom/kik/scan/RemoteKikCode;->_isLoaded:Z

    if-nez v0, :cond_0

    .line 53
    const/4 v0, 0x0

    .line 56
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/kik/scan/RemoteKikCode;->encodeInternal()[B

    move-result-object v0

    goto :goto_0
.end method

.method protected native encodeInternal()[B
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 27
    instance-of v0, p1, Lcom/kik/scan/RemoteKikCode;

    if-nez v0, :cond_0

    move v0, v1

    .line 46
    :goto_0
    return v0

    :cond_0
    move-object v0, p1

    .line 31
    check-cast v0, Lcom/kik/scan/RemoteKikCode;

    .line 33
    invoke-super {p0, p1}, Lcom/kik/scan/KikCode;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    move v0, v1

    .line 34
    goto :goto_0

    .line 37
    :cond_1
    iget-object v2, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    if-nez v2, :cond_3

    .line 38
    :cond_2
    iget-object v2, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    iget-object v0, v0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    if-eq v2, v0, :cond_4

    move v0, v1

    .line 39
    goto :goto_0

    .line 42
    :cond_3
    iget-object v2, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    iget-object v0, v0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    .line 43
    goto :goto_0

    .line 46
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getPayloadId()[B
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lcom/kik/scan/KikCode;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", payloadId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/scan/RemoteKikCode;->_payloadId:[B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
