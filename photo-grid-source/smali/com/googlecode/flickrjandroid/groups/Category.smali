.class public Lcom/googlecode/flickrjandroid/groups/Category;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private groups:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Group;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private path:Ljava/lang/String;

.field private pathIds:Ljava/lang/String;

.field private subcategories:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Subcategory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public getGroups()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Group;",
            ">;"
        }
    .end annotation

    .prologue
    .line 59
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Category;->groups:Ljava/util/Collection;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Category;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getPathIds()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Category;->pathIds:Ljava/lang/String;

    return-object v0
.end method

.method public getSubcategories()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Subcategory;",
            ">;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Category;->subcategories:Ljava/util/Collection;

    return-object v0
.end method

.method public setGroups(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Group;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 63
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Category;->groups:Ljava/util/Collection;

    .line 64
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Category;->name:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Category;->path:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setPathIds(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Category;->pathIds:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setSubcategories(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/groups/Subcategory;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 55
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Category;->subcategories:Ljava/util/Collection;

    .line 56
    return-void
.end method
