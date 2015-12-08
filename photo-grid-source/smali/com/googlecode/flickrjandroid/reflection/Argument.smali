.class public Lcom/googlecode/flickrjandroid/reflection/Argument;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private description:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private optional:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->name:Ljava/lang/String;

    return-object v0
.end method

.method public isOptional()Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->optional:Z

    return v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->description:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->name:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setOptional(Z)V
    .locals 0

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/reflection/Argument;->optional:Z

    .line 35
    return-void
.end method
