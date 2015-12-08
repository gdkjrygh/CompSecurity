.class public Lcom/googlecode/flickrjandroid/stats/ReferrerList;
.super Lcom/googlecode/flickrjandroid/SearchResultList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/googlecode/flickrjandroid/SearchResultList",
        "<",
        "Lcom/googlecode/flickrjandroid/stats/Referrer;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/SearchResultList;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/stats/ReferrerList;->name:Ljava/lang/String;

    .line 39
    return-void
.end method
