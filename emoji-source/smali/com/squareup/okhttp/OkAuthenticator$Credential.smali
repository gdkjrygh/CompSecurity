.class public final Lcom/squareup/okhttp/OkAuthenticator$Credential;
.super Ljava/lang/Object;
.source "OkAuthenticator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/OkAuthenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Credential"
.end annotation


# instance fields
.field private final headerValue:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "headerValue"    # Ljava/lang/String;

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public static basic(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/OkAuthenticator$Credential;
    .locals 7
    .param p0, "userName"    # Ljava/lang/String;
    .param p1, "password"    # Ljava/lang/String;

    .prologue
    .line 98
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 99
    .local v3, "usernameAndPassword":Ljava/lang/String;
    const-string v4, "ISO-8859-1"

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 100
    .local v0, "bytes":[B
    invoke-static {v0}, Lcom/squareup/okhttp/internal/Base64;->encode([B)Ljava/lang/String;

    move-result-object v2

    .line 101
    .local v2, "encoded":Ljava/lang/String;
    new-instance v4, Lcom/squareup/okhttp/OkAuthenticator$Credential;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Basic "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/squareup/okhttp/OkAuthenticator$Credential;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    .line 102
    .end local v0    # "bytes":[B
    .end local v2    # "encoded":Ljava/lang/String;
    .end local v3    # "usernameAndPassword":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 103
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4}, Ljava/lang/AssertionError;-><init>()V

    throw v4
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 112
    instance-of v0, p1, Lcom/squareup/okhttp/OkAuthenticator$Credential;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/squareup/okhttp/OkAuthenticator$Credential;

    .end local p1    # "o":Ljava/lang/Object;
    iget-object v0, p1, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    iget-object v1, p0, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getHeaderValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/squareup/okhttp/OkAuthenticator$Credential;->headerValue:Ljava/lang/String;

    return-object v0
.end method
