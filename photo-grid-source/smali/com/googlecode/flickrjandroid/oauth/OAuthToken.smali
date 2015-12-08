.class public Lcom/googlecode/flickrjandroid/oauth/OAuthToken;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private oauthToken:Ljava/lang/String;

.field private oauthTokenSecret:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 85
    if-ne p0, p1, :cond_1

    .line 102
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    instance-of v2, p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    if-nez v2, :cond_3

    move v0, v1

    .line 90
    goto :goto_0

    .line 91
    :cond_3
    check-cast p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    .line 92
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 93
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    if-eqz v2, :cond_5

    move v0, v1

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 98
    iget-object v2, p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    .line 99
    goto :goto_0

    .line 100
    :cond_6
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 101
    goto :goto_0
.end method

.method public getOauthToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    return-object v0
.end method

.method public getOauthTokenSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 72
    .line 73
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    .line 72
    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    iget-object v2, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 74
    :goto_1
    add-int/2addr v0, v1

    .line 77
    return v0

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1
.end method

.method public setOauthToken(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setOauthTokenSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OAuthToken [oauthToken="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oauthTokenSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->oauthTokenSecret:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
