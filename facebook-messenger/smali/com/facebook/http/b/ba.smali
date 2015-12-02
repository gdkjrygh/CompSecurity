.class Lcom/facebook/http/b/ba;
.super Ljava/lang/Object;
.source "TrustNonFacebookSocketFactory.java"

# interfaces
.implements Lorg/apache/http/conn/ssl/X509HostnameVerifier;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;


# direct methods
.method public constructor <init>([Ljava/lang/String;Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    .locals 4

    .prologue
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/http/b/ba;->a:Ljava/util/Set;

    .line 120
    if-eqz p1, :cond_0

    .line 121
    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 122
    iget-object v3, p0, Lcom/facebook/http/b/ba;->a:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 121
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 125
    :cond_0
    iput-object p2, p0, Lcom/facebook/http/b/ba;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 126
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 132
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 133
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 134
    :goto_0
    iget-object v0, p0, Lcom/facebook/http/b/ba;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 133
    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    const-string v0, "SELECTED_HOSTS_VERIFIER"

    return-object v0
.end method

.method public verify(Ljava/lang/String;Ljava/security/cert/X509Certificate;)V
    .locals 1

    .prologue
    .line 157
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ba;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/facebook/http/b/ba;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljava/security/cert/X509Certificate;)V

    .line 160
    :cond_0
    return-void
.end method

.method public verify(Ljava/lang/String;Ljavax/net/ssl/SSLSocket;)V
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ba;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/facebook/http/b/ba;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSocket;)V

    .line 152
    :cond_0
    return-void
.end method

.method public verify(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 165
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ba;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/facebook/http/b/ba;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 168
    :cond_0
    return-void
.end method

.method public verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 1

    .prologue
    .line 140
    invoke-direct {p0, p1}, Lcom/facebook/http/b/ba;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/facebook/http/b/ba;->b:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v0

    .line 143
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
