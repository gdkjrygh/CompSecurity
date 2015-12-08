.class Ltwitter4j/internal/json/ProfileImageImpl;
.super Ltwitter4j/internal/json/TwitterResponseImpl;
.source "ProfileImageImpl.java"

# interfaces
.implements Ltwitter4j/ProfileImage;


# static fields
.field private static final serialVersionUID:J = -0x337e31feac04b651L


# instance fields
.field private url:Ljava/lang/String;


# direct methods
.method constructor <init>(Ltwitter4j/internal/http/HttpResponse;)V
    .locals 1
    .param p1, "res"    # Ltwitter4j/internal/http/HttpResponse;

    .prologue
    .line 31
    invoke-direct {p0, p1}, Ltwitter4j/internal/json/TwitterResponseImpl;-><init>(Ltwitter4j/internal/http/HttpResponse;)V

    .line 32
    const-string v0, "Location"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/http/HttpResponse;->getResponseHeader(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/internal/json/ProfileImageImpl;->url:Ljava/lang/String;

    .line 33
    return-void
.end method


# virtual methods
.method public getURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Ltwitter4j/internal/json/ProfileImageImpl;->url:Ljava/lang/String;

    return-object v0
.end method
