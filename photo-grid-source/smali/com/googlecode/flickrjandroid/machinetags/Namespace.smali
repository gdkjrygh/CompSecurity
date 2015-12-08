.class public Lcom/googlecode/flickrjandroid/machinetags/Namespace;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/machinetags/ITag;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private predicates:I

.field private usage:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method public getPredicates()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->predicates:I

    return v0
.end method

.method public getUsage()I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->usage:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setPredicates(I)V
    .locals 0

    .prologue
    .line 48
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->predicates:I

    .line 49
    return-void
.end method

.method public setPredicates(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 43
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->setPredicates(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setUsage(I)V
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->usage:I

    .line 30
    return-void
.end method

.method public setUsage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 24
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->setUsage(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Namespace;->value:Ljava/lang/String;

    .line 57
    return-void
.end method
