.class public Lcom/googlecode/flickrjandroid/SearchResultList;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/ArrayList",
        "<TE;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x6e7fd6f9a1f9ba27L


# instance fields
.field private page:I

.field private pages:I

.field private perPage:I

.field private total:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public getPage()I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->page:I

    return v0
.end method

.method public getPages()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->pages:I

    return v0
.end method

.method public getPerPage()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->perPage:I

    return v0
.end method

.method public getTotal()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->total:I

    return v0
.end method

.method public setPage(I)V
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->page:I

    .line 29
    return-void
.end method

.method public setPage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 32
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/SearchResultList;->setPage(I)V

    .line 35
    :cond_0
    return-void
.end method

.method public setPages(I)V
    .locals 0

    .prologue
    .line 42
    iput p1, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->pages:I

    .line 43
    return-void
.end method

.method public setPages(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 46
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/SearchResultList;->setPages(I)V

    .line 49
    :cond_0
    return-void
.end method

.method public setPerPage(I)V
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->perPage:I

    .line 57
    return-void
.end method

.method public setPerPage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 60
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/SearchResultList;->setPerPage(I)V

    .line 63
    :cond_0
    return-void
.end method

.method public setTotal(I)V
    .locals 0

    .prologue
    .line 70
    iput p1, p0, Lcom/googlecode/flickrjandroid/SearchResultList;->total:I

    .line 71
    return-void
.end method

.method public setTotal(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 74
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/SearchResultList;->setTotal(I)V

    .line 77
    :cond_0
    return-void
.end method
