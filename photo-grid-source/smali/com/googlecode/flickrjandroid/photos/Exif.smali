.class public Lcom/googlecode/flickrjandroid/photos/Exif;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private clean:Ljava/lang/String;

.field private label:Ljava/lang/String;

.field private raw:Ljava/lang/String;

.field private tag:Ljava/lang/String;

.field private tagspace:Ljava/lang/String;

.field private tagspaceId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getClean()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->clean:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getRaw()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->raw:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public getTagspace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tagspace:Ljava/lang/String;

    return-object v0
.end method

.method public getTagspaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tagspaceId:Ljava/lang/String;

    return-object v0
.end method

.method public setClean(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->clean:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->label:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setRaw(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->raw:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tag:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setTagspace(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tagspace:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setTagspaceId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Exif;->tagspaceId:Ljava/lang/String;

    .line 34
    return-void
.end method
