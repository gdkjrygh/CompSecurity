.class public interface abstract Lcom/squareup/okhttp/OkAuthenticator;
.super Ljava/lang/Object;
.source "OkAuthenticator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/OkAuthenticator$Credential;,
        Lcom/squareup/okhttp/OkAuthenticator$Challenge;
    }
.end annotation


# virtual methods
.method public abstract authenticate(Ljava/net/Proxy;Ljava/net/URL;Ljava/util/List;)Lcom/squareup/okhttp/OkAuthenticator$Credential;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Proxy;",
            "Ljava/net/URL;",
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/OkAuthenticator$Challenge;",
            ">;)",
            "Lcom/squareup/okhttp/OkAuthenticator$Credential;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract authenticateProxy(Ljava/net/Proxy;Ljava/net/URL;Ljava/util/List;)Lcom/squareup/okhttp/OkAuthenticator$Credential;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/Proxy;",
            "Ljava/net/URL;",
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/OkAuthenticator$Challenge;",
            ">;)",
            "Lcom/squareup/okhttp/OkAuthenticator$Credential;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
