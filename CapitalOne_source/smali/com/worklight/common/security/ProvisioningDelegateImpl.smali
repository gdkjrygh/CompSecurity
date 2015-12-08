.class public Lcom/worklight/common/security/ProvisioningDelegateImpl;
.super Ljava/lang/Object;
.source "ProvisioningDelegateImpl.java"

# interfaces
.implements Lcom/worklight/common/security/WLProvisioningDelegate;


# static fields
.field protected static final PROVISIONING_ENTITY:Ljava/lang/String; = "provisioningEntity"

.field protected static final REALM:Ljava/lang/String; = "realm"


# instance fields
.field listener:Lcom/worklight/common/security/DefaultCsrRequestListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/common/security/ProvisioningDelegateImpl;->listener:Lcom/worklight/common/security/DefaultCsrRequestListener;

    .line 38
    return-void
.end method


# virtual methods
.method public sendCSR(Ljava/lang/String;Landroid/content/Context;)V
    .locals 13
    .param p1, "csrJsonData"    # Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 49
    :try_start_0
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/worklight/common/security/WLDeviceAuthManager;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v10

    .line 50
    .local v10, "keyPair":Ljava/security/KeyPair;
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 51
    .local v7, "csrJwsHeaderJson":Lorg/json/JSONObject;
    const-string v1, "realm"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 52
    .local v12, "realm":Ljava/lang/String;
    const-string v1, "provisioningEntity"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 53
    .local v11, "provisioningEntity":Ljava/lang/String;
    invoke-static {}, Lcom/worklight/common/security/WLDeviceAuthManager;->getInstance()Lcom/worklight/common/security/WLDeviceAuthManager;

    move-result-object v1

    invoke-virtual {v1, v10, p1}, Lcom/worklight/common/security/WLDeviceAuthManager;->createCsrHeader(Ljava/security/KeyPair;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 55
    .local v6, "csrHeaderString":Ljava/lang/String;
    new-instance v3, Lcom/worklight/wlclient/api/WLRequestOptions;

    invoke-direct {v3}, Lcom/worklight/wlclient/api/WLRequestOptions;-><init>()V

    .line 56
    .local v3, "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    const-string v1, "csr"

    invoke-virtual {v3, v1, v6}, Lcom/worklight/wlclient/api/WLRequestOptions;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v1, "realm"

    invoke-virtual {v3, v1, v12}, Lcom/worklight/wlclient/api/WLRequestOptions;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 59
    .local v9, "invocationContextObject":Lorg/json/JSONObject;
    const-string v1, "provisioningEntity"

    invoke-virtual {v9, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    invoke-virtual {v3, v9}, Lcom/worklight/wlclient/api/WLRequestOptions;->setInvocationContext(Ljava/lang/Object;)V

    .line 62
    new-instance v1, Lcom/worklight/common/security/DefaultCsrRequestListener;

    invoke-direct {v1, v10}, Lcom/worklight/common/security/DefaultCsrRequestListener;-><init>(Ljava/security/KeyPair;)V

    iput-object v1, p0, Lcom/worklight/common/security/ProvisioningDelegateImpl;->listener:Lcom/worklight/common/security/DefaultCsrRequestListener;

    .line 63
    new-instance v2, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v2}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    .line 64
    .local v2, "httpContext":Lorg/apache/http/protocol/HttpContext;
    new-instance v4, Lcom/worklight/common/WLConfig;

    invoke-direct {v4, p2}, Lcom/worklight/common/WLConfig;-><init>(Landroid/content/Context;)V

    .line 65
    .local v4, "config":Lcom/worklight/common/WLConfig;
    new-instance v0, Lcom/worklight/wlclient/WLRequest;

    .line 66
    iget-object v1, p0, Lcom/worklight/common/security/ProvisioningDelegateImpl;->listener:Lcom/worklight/common/security/DefaultCsrRequestListener;

    move-object v5, p2

    .line 65
    invoke-direct/range {v0 .. v5}, Lcom/worklight/wlclient/WLRequest;-><init>(Lcom/worklight/wlclient/WLRequestListener;Lorg/apache/http/protocol/HttpContext;Lcom/worklight/wlclient/api/WLRequestOptions;Lcom/worklight/common/WLConfig;Landroid/content/Context;)V

    .line 72
    .local v0, "csrRequest":Lcom/worklight/wlclient/WLRequest;
    const-string v1, "provisioning"

    const/4 v5, 0x1

    invoke-virtual {v0, v1, v5}, Lcom/worklight/wlclient/WLRequest;->makeRequest(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 82
    .end local v0    # "csrRequest":Lcom/worklight/wlclient/WLRequest;
    .end local v2    # "httpContext":Lorg/apache/http/protocol/HttpContext;
    .end local v3    # "requestOptions":Lcom/worklight/wlclient/api/WLRequestOptions;
    .end local v4    # "config":Lcom/worklight/common/WLConfig;
    .end local v6    # "csrHeaderString":Ljava/lang/String;
    .end local v7    # "csrJwsHeaderJson":Lorg/json/JSONObject;
    .end local v9    # "invocationContextObject":Lorg/json/JSONObject;
    .end local v10    # "keyPair":Ljava/security/KeyPair;
    .end local v11    # "provisioningEntity":Ljava/lang/String;
    .end local v12    # "realm":Ljava/lang/String;
    :goto_0
    return-void

    .line 73
    :catch_0
    move-exception v8

    .line 74
    .local v8, "e":Ljava/security/NoSuchAlgorithmException;
    invoke-virtual {v8}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0

    .line 75
    .end local v8    # "e":Ljava/security/NoSuchAlgorithmException;
    :catch_1
    move-exception v8

    .line 76
    .local v8, "e":Ljava/security/InvalidKeyException;
    invoke-virtual {v8}, Ljava/security/InvalidKeyException;->printStackTrace()V

    goto :goto_0

    .line 77
    .end local v8    # "e":Ljava/security/InvalidKeyException;
    :catch_2
    move-exception v8

    .line 78
    .local v8, "e":Ljava/security/SignatureException;
    invoke-virtual {v8}, Ljava/security/SignatureException;->printStackTrace()V

    goto :goto_0

    .line 79
    .end local v8    # "e":Ljava/security/SignatureException;
    :catch_3
    move-exception v8

    .line 80
    .local v8, "e":Ljava/lang/Exception;
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
