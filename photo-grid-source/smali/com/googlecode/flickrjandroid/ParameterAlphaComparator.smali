.class public Lcom/googlecode/flickrjandroid/ParameterAlphaComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/googlecode/flickrjandroid/Parameter;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/googlecode/flickrjandroid/Parameter;Lcom/googlecode/flickrjandroid/Parameter;)I
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p1}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/googlecode/flickrjandroid/Parameter;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/googlecode/flickrjandroid/Parameter;

    check-cast p2, Lcom/googlecode/flickrjandroid/Parameter;

    invoke-virtual {p0, p1, p2}, Lcom/googlecode/flickrjandroid/ParameterAlphaComparator;->compare(Lcom/googlecode/flickrjandroid/Parameter;Lcom/googlecode/flickrjandroid/Parameter;)I

    move-result v0

    return v0
.end method
