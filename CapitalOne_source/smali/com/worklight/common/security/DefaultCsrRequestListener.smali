.class Lcom/worklight/common/security/DefaultCsrRequestListener;
.super Ljava/lang/Object;
.source "ProvisioningDelegateImpl.java"

# interfaces
.implements Lcom/worklight/wlclient/WLRequestListener;


# instance fields
.field private keyPair:Ljava/security/KeyPair;


# direct methods
.method public constructor <init>(Ljava/security/KeyPair;)V
    .locals 1
    .param p1, "keypair"    # Ljava/security/KeyPair;

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/common/security/DefaultCsrRequestListener;->keyPair:Ljava/security/KeyPair;

    .line 93
    iput-object p1, p0, Lcom/worklight/common/security/DefaultCsrRequestListener;->keyPair:Ljava/security/KeyPair;

    .line 94
    return-void
.end method


# virtual methods
.method public onFailure(Lcom/worklight/wlclient/api/WLFailResponse;)V
    .locals 2
    .param p1, "failResponse"    # Lcom/worklight/wlclient/api/WLFailResponse;

    .prologue
    .line 98
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/worklight/wlclient/api/WLFailResponse;->getResponseText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/worklight/common/security/WLDeviceAuthManager;->csrCertificateRecieveFailed(Ljava/lang/String;)V

    .line 99
    return-void
.end method

.method public onSuccess(Lcom/worklight/wlclient/api/WLResponse;)V
    .locals 11
    .param p1, "response"    # Lcom/worklight/wlclient/api/WLResponse;

    .prologue
    .line 104
    :try_start_0
    new-instance v6, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;

    invoke-direct {v6, p1}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;-><init>(Lcom/worklight/wlclient/api/WLResponse;)V

    .line 105
    .local v6, "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    invoke-virtual {v6}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->getResponseText()Ljava/lang/String;

    move-result-object v8

    .line 106
    .local v8, "responseText":Ljava/lang/String;
    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v9

    invoke-static {v9}, Lcom/worklight/utils/Base64;->decode([B)[B

    move-result-object v3

    .line 107
    .local v3, "encodedCert":[B
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 108
    .local v4, "inStream":Ljava/io/InputStream;
    const-string v9, "X.509"

    invoke-static {v9}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    .line 109
    .local v1, "cf":Ljava/security/cert/CertificateFactory;
    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 110
    .local v0, "cert":Ljava/security/cert/X509Certificate;
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 112
    invoke-virtual {v6}, Lcom/worklight/wlclient/api/WLProcedureInvocationResult;->getInvocationContext()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/json/JSONObject;

    .line 113
    .local v5, "invocationContext":Lorg/json/JSONObject;
    const-string v9, "provisioningEntity"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 114
    .local v7, "provisioningEntity":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v9

    iget-object v10, p0, Lcom/worklight/common/security/DefaultCsrRequestListener;->keyPair:Ljava/security/KeyPair;

    invoke-virtual {v9, v7, v10, v0}, Lcom/worklight/common/security/WLDeviceAuthManager;->saveCertificate(Ljava/lang/String;Ljava/security/KeyPair;Ljava/security/cert/Certificate;)V

    .line 115
    const/4 v9, 0x0

    iput-object v9, p0, Lcom/worklight/common/security/DefaultCsrRequestListener;->keyPair:Ljava/security/KeyPair;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .end local v0    # "cert":Ljava/security/cert/X509Certificate;
    .end local v1    # "cf":Ljava/security/cert/CertificateFactory;
    .end local v3    # "encodedCert":[B
    .end local v4    # "inStream":Ljava/io/InputStream;
    .end local v5    # "invocationContext":Lorg/json/JSONObject;
    .end local v6    # "piResponse":Lcom/worklight/wlclient/api/WLProcedureInvocationResult;
    .end local v7    # "provisioningEntity":Ljava/lang/String;
    .end local v8    # "responseText":Ljava/lang/String;
    :goto_0
    return-void

    .line 117
    :catch_0
    move-exception v2

    .line 118
    .local v2, "e":Ljava/lang/Exception;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/worklight/common/security/WLDeviceAuthManager;->csrCertificateRecieveFailed(Ljava/lang/String;)V

    goto :goto_0
.end method
