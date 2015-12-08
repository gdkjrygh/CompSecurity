.class public Lcom/googlecode/flickrjandroid/stats/Referrer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private searchterm:Ljava/lang/String;

.field private url:Ljava/net/URL;

.field private views:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method


# virtual methods
.method public getSearchterm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->searchterm:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/net/URL;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->url:Ljava/net/URL;

    return-object v0
.end method

.method public getViews()I
    .locals 1

    .prologue
    .line 42
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->views:I

    return v0
.end method

.method public setSearchterm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->searchterm:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setUrl(Ljava/net/URL;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->url:Ljava/net/URL;

    .line 36
    return-void
.end method

.method public setViews(I)V
    .locals 0

    .prologue
    .line 49
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/Referrer;->views:I

    .line 50
    return-void
.end method
