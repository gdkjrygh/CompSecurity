.class public Lnet/coocent/android/xmlparser/GiftEntity;
.super Ljava/lang/Object;
.source "GiftEntity.java"


# instance fields
.field private icon_imagePath:Ljava/lang/String;

.field private id:I

.field private packagename:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftEntity;->icon_imagePath:Ljava/lang/String;

    .line 3
    return-void
.end method


# virtual methods
.method public getIcon_imagePath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftEntity;->icon_imagePath:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lnet/coocent/android/xmlparser/GiftEntity;->id:I

    return v0
.end method

.method public getPackagename()Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftEntity;->packagename:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setIcon_imagePath(Ljava/lang/String;)V
    .locals 0
    .param p1, "icon_image"    # Ljava/lang/String;

    .prologue
    .line 39
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftEntity;->icon_imagePath:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setId(I)V
    .locals 0
    .param p1, "id"    # I

    .prologue
    .line 15
    iput p1, p0, Lnet/coocent/android/xmlparser/GiftEntity;->id:I

    .line 16
    return-void
.end method

.method public setPackagename(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 23
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftEntity;->packagename:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "detailed"    # Ljava/lang/String;

    .prologue
    .line 31
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftEntity;->title:Ljava/lang/String;

    .line 32
    return-void
.end method
