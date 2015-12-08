.class public Lcom/googlecode/flickrjandroid/uploader/ImageParameter;
.super Lcom/googlecode/flickrjandroid/Parameter;
.source "SourceFile"


# instance fields
.field private imageName:Ljava/lang/String;

.field private imageType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 21
    const-string v0, "photo"

    invoke-direct {p0, v0, p2}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    const-string v0, "jpeg"

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageType:Ljava/lang/String;

    .line 22
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageName:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public getImageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageName:Ljava/lang/String;

    return-object v0
.end method

.method public getImageType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageType:Ljava/lang/String;

    return-object v0
.end method

.method public setImageName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageName:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setImageType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/uploader/ImageParameter;->imageType:Ljava/lang/String;

    .line 51
    return-void
.end method
