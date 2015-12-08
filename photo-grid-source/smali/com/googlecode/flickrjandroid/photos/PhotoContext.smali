.class public Lcom/googlecode/flickrjandroid/photos/PhotoContext;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private count:I

.field private nextPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

.field private previousPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->count:I

    return v0
.end method

.method public getNextPhoto()Lcom/googlecode/flickrjandroid/photos/Photo;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->nextPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    return-object v0
.end method

.method public getPreviousPhoto()Lcom/googlecode/flickrjandroid/photos/Photo;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->previousPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->count:I

    .line 33
    return-void
.end method

.method public setNextPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->nextPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 50
    return-void
.end method

.method public setPreviousPhoto(Lcom/googlecode/flickrjandroid/photos/Photo;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoContext;->previousPhoto:Lcom/googlecode/flickrjandroid/photos/Photo;

    .line 42
    return-void
.end method
