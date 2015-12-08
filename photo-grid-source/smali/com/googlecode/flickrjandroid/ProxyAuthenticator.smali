.class public Lcom/googlecode/flickrjandroid/ProxyAuthenticator;
.super Ljava/net/Authenticator;
.source "SourceFile"


# instance fields
.field passWord:Ljava/lang/String;

.field userName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->userName:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->passWord:Ljava/lang/String;

    .line 18
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->userName:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->passWord:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method protected getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .locals 3

    .prologue
    .line 23
    new-instance v0, Ljava/net/PasswordAuthentication;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->userName:Ljava/lang/String;

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/ProxyAuthenticator;->passWord:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/net/PasswordAuthentication;-><init>(Ljava/lang/String;[C)V

    return-object v0
.end method
