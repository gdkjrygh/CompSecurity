.class public Lcom/googlecode/flickrjandroid/tags/TagRaw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field clean:Ljava/lang/String;

.field owner:Ljava/lang/String;

.field raw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->raw:Ljava/util/List;

    .line 19
    return-void
.end method


# virtual methods
.method public addRaw(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->raw:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    return-void
.end method

.method public getClean()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->clean:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->owner:Ljava/lang/String;

    return-object v0
.end method

.method public getRaw()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 38
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->raw:Ljava/util/List;

    return-object v0
.end method

.method public setClean(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->clean:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setOwner(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/tags/TagRaw;->owner:Ljava/lang/String;

    .line 35
    return-void
.end method
