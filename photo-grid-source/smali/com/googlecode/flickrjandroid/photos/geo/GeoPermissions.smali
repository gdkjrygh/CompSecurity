.class public Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private contact:Z

.field private family:Z

.field private friend:Z

.field private pub:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isContact()Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->contact:Z

    return v0
.end method

.method public isFamily()Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->family:Z

    return v0
.end method

.method public isFriend()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->friend:Z

    return v0
.end method

.method public isPublic()Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->pub:Z

    return v0
.end method

.method public setContact(Z)V
    .locals 0

    .prologue
    .line 29
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->contact:Z

    .line 30
    return-void
.end method

.method public setFamily(Z)V
    .locals 0

    .prologue
    .line 42
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->family:Z

    .line 43
    return-void
.end method

.method public setFriend(Z)V
    .locals 0

    .prologue
    .line 55
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->friend:Z

    .line 56
    return-void
.end method

.method public setPublic(Z)V
    .locals 0

    .prologue
    .line 68
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/geo/GeoPermissions;->pub:Z

    .line 69
    return-void
.end method
