.class public Lcom/googlecode/flickrjandroid/places/PlacesList;
.super Lcom/googlecode/flickrjandroid/SearchResultList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/googlecode/flickrjandroid/SearchResultList",
        "<",
        "Lcom/googlecode/flickrjandroid/places/Place;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x5e00b6786c718932L


# instance fields
.field private latitude:D

.field private longitude:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/SearchResultList;-><init>()V

    .line 19
    return-void
.end method


# virtual methods
.method public getLatitude()D
    .locals 2

    .prologue
    .line 39
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/PlacesList;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 25
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/places/PlacesList;->longitude:D

    return-wide v0
.end method

.method public setLatitude(D)V
    .locals 1

    .prologue
    .line 46
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/PlacesList;->latitude:D

    .line 47
    return-void
.end method

.method public setLongitude(D)V
    .locals 1

    .prologue
    .line 32
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/places/PlacesList;->longitude:D

    .line 33
    return-void
.end method
