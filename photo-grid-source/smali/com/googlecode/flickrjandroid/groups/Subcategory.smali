.class public Lcom/googlecode/flickrjandroid/groups/Subcategory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private count:I

.field private id:I

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->count:I

    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .prologue
    .line 43
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->count:I

    .line 44
    return-void
.end method

.method public setId(I)V
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->id:I

    .line 28
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Subcategory;->name:Ljava/lang/String;

    .line 36
    return-void
.end method
