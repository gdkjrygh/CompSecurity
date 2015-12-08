.class public Lcom/googlecode/flickrjandroid/photosets/Photosets;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private canCreate:Z

.field private photosets:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method


# virtual methods
.method public getPhotosets()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;",
            ">;"
        }
    .end annotation

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photosets;->photosets:Ljava/util/Collection;

    return-object v0
.end method

.method public isCanCreate()Z
    .locals 1

    .prologue
    .line 24
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photosets/Photosets;->canCreate:Z

    return v0
.end method

.method public setCanCreate(Z)V
    .locals 0

    .prologue
    .line 28
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photosets;->canCreate:Z

    .line 29
    return-void
.end method

.method public setPhotosets(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/photosets/Photoset;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photosets/Photosets;->photosets:Ljava/util/Collection;

    .line 37
    return-void
.end method
