.class public Lcom/googlecode/flickrjandroid/photos/PhotoUrl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoUrl;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/PhotoUrl;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoUrl;->type:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/PhotoUrl;->url:Ljava/lang/String;

    .line 20
    return-void
.end method
