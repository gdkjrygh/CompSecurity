.class public Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;
.super Lcom/googlecode/flickrjandroid/SearchResultList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/googlecode/flickrjandroid/SearchResultList",
        "<",
        "Lcom/googlecode/flickrjandroid/people/User;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6f7e7abd268d7585L


# instance fields
.field private farm:I

.field private secret:Ljava/lang/String;

.field private server:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/SearchResultList;-><init>()V

    .line 21
    const/4 v0, -0x1

    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->farm:I

    .line 30
    return-void
.end method


# virtual methods
.method public getFarm()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->farm:I

    return v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->server:Ljava/lang/String;

    return-object v0
.end method

.method public setFarm(I)V
    .locals 0

    .prologue
    .line 57
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->farm:I

    .line 58
    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->secret:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoFavouriteUserList;->server:Ljava/lang/String;

    .line 72
    return-void
.end method
