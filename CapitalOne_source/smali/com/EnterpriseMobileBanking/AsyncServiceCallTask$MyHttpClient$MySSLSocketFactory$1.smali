.class Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory$1;
.super Ljava/lang/Object;
.source "AsyncServiceCallTask.java"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;-><init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;Ljava/security/KeyStore;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;

.field final synthetic val$this$1:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;)V
    .locals 0

    .prologue
    .line 320
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory$1;->this$2:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory$1;->val$this$1:Lcom/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 0
    .param p1, "chain"    # [Ljava/security/cert/X509Certificate;
    .param p2, "authType"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    .line 322
    return-void
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 0
    .param p1, "chain"    # [Ljava/security/cert/X509Certificate;
    .param p2, "authType"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .prologue
    .line 325
    return-void
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    .prologue
    .line 328
    const/4 v0, 0x0

    return-object v0
.end method
