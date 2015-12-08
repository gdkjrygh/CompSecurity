.class public Lcom/googlecode/flickrjandroid/reflection/Error;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private code:I

.field private explaination:Ljava/lang/String;

.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->code:I

    return v0
.end method

.method public getExplaination()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->explaination:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->message:Ljava/lang/String;

    return-object v0
.end method

.method public setCode(I)V
    .locals 0

    .prologue
    .line 26
    iput p1, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->code:I

    .line 27
    return-void
.end method

.method public setCode(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/reflection/Error;->setCode(I)V

    .line 31
    return-void
.end method

.method public setExplaination(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->explaination:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/reflection/Error;->message:Ljava/lang/String;

    .line 39
    return-void
.end method
