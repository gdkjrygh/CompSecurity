.class public Lcom/googlecode/flickrjandroid/oauth/OAuth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private token:Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

.field private user:Lcom/googlecode/flickrjandroid/people/User;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method


# virtual methods
.method public getToken()Lcom/googlecode/flickrjandroid/oauth/OAuthToken;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->token:Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    return-object v0
.end method

.method public getUser()Lcom/googlecode/flickrjandroid/people/User;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->user:Lcom/googlecode/flickrjandroid/people/User;

    return-object v0
.end method

.method public setToken(Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->token:Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    .line 42
    return-void
.end method

.method public setUser(Lcom/googlecode/flickrjandroid/people/User;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->user:Lcom/googlecode/flickrjandroid/people/User;

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OAuth [token="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->token:Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 64
    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuth;->user:Lcom/googlecode/flickrjandroid/people/User;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
