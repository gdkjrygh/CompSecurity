.class public Lcom/googlecode/flickrjandroid/commons/Institution;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private dateLaunch:Ljava/util/Date;

.field private flickrUrl:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private licenseUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private siteUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDateLaunch()Ljava/util/Date;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->dateLaunch:Ljava/util/Date;

    return-object v0
.end method

.method public getFlickrUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->flickrUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLicenseUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->licenseUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSiteUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->siteUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setDateLaunch(J)V
    .locals 1

    .prologue
    .line 45
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/commons/Institution;->setDateLaunch(Ljava/util/Date;)V

    .line 46
    return-void
.end method

.method public setDateLaunch(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 49
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 51
    :cond_0
    :goto_0
    return-void

    .line 50
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/commons/Institution;->setDateLaunch(J)V

    goto :goto_0
.end method

.method public setDateLaunch(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->dateLaunch:Ljava/util/Date;

    .line 42
    return-void
.end method

.method public setFlickrUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->flickrUrl:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->id:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setLicenseUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->licenseUrl:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->name:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public setSiteUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/commons/Institution;->siteUrl:Ljava/lang/String;

    .line 59
    return-void
.end method
