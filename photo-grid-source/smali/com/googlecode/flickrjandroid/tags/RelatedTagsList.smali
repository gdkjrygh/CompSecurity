.class public Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/googlecode/flickrjandroid/tags/Tag;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private source:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public getSource()Ljava/lang/String;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;->source:Ljava/lang/String;

    return-object v0
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/tags/RelatedTagsList;->source:Ljava/lang/String;

    .line 23
    return-void
.end method
