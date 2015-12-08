.class public Lcom/googlecode/flickrjandroid/stats/Domain;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private name:Ljava/lang/String;

.field private views:I


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
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/stats/Domain;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getViews()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/googlecode/flickrjandroid/stats/Domain;->views:I

    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/stats/Domain;->name:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setViews(I)V
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lcom/googlecode/flickrjandroid/stats/Domain;->views:I

    .line 47
    return-void
.end method
