.class public Lcom/googlecode/flickrjandroid/tags/Cluster;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private tags:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/tags/Cluster;->tags:Ljava/util/ArrayList;

    .line 12
    return-void
.end method


# virtual methods
.method public addTag(Lcom/googlecode/flickrjandroid/tags/Tag;)V
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/Cluster;->tags:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    return-void
.end method

.method public getTags()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 21
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/Cluster;->tags:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setTags(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/googlecode/flickrjandroid/tags/Tag;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/tags/Cluster;->tags:Ljava/util/ArrayList;

    .line 26
    return-void
.end method
