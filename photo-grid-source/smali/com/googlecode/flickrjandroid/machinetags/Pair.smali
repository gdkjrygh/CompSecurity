.class public Lcom/googlecode/flickrjandroid/machinetags/Pair;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/machinetags/ITag;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private namespace:Ljava/lang/String;

.field private predicate:Ljava/lang/String;

.field private usage:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public getNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public getPredicate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->predicate:Ljava/lang/String;

    return-object v0
.end method

.method public getUsage()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->usage:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 2

    .prologue
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->namespace:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->predicate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setNamespace(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->namespace:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setPredicate(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->predicate:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setUsage(I)V
    .locals 0

    .prologue
    .line 49
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Pair;->usage:I

    .line 50
    return-void
.end method

.method public setUsage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 44
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Pair;->setUsage(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
