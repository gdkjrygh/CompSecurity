.class public Lcom/googlecode/flickrjandroid/groups/GroupList;
.super Lcom/googlecode/flickrjandroid/SearchResultList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/googlecode/flickrjandroid/SearchResultList",
        "<",
        "Lcom/googlecode/flickrjandroid/groups/Group;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2e6baf6e4c5ebcefL


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/SearchResultList;-><init>()V

    return-void
.end method


# virtual methods
.method public add(Lcom/googlecode/flickrjandroid/groups/Group;)Z
    .locals 1

    .prologue
    .line 14
    invoke-super {p0, p1}, Lcom/googlecode/flickrjandroid/SearchResultList;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/googlecode/flickrjandroid/groups/Group;

    invoke-virtual {p0, p1}, Lcom/googlecode/flickrjandroid/groups/GroupList;->add(Lcom/googlecode/flickrjandroid/groups/Group;)Z

    move-result v0

    return v0
.end method

.method public getGroupsArray()[Lcom/googlecode/flickrjandroid/groups/Group;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/groups/GroupList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/googlecode/flickrjandroid/groups/Group;

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/GroupList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/googlecode/flickrjandroid/groups/Group;

    return-object v0
.end method
