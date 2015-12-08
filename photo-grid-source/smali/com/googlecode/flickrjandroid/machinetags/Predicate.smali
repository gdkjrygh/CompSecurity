.class public Lcom/googlecode/flickrjandroid/machinetags/Predicate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/machinetags/ITag;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private namespaces:I

.field private usage:I

.field private value:Ljava/lang/String;


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
.method public getNamespaces()I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->namespaces:I

    return v0
.end method

.method public getUsage()I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->usage:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setNamespaces(I)V
    .locals 0

    .prologue
    .line 55
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->namespaces:I

    .line 56
    return-void
.end method

.method public setNamespaces(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->setNamespaces(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setUsage(I)V
    .locals 0

    .prologue
    .line 41
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->usage:I

    .line 42
    return-void
.end method

.method public setUsage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 36
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->setUsage(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Predicate;->value:Ljava/lang/String;

    .line 28
    return-void
.end method
