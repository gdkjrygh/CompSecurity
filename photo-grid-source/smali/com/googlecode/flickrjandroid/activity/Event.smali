.class public Lcom/googlecode/flickrjandroid/activity/Event;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private dateadded:Ljava/util/Date;

.field private id:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private user:Ljava/lang/String;

.field private username:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public getDateadded()Ljava/util/Date;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->dateadded:Ljava/util/Date;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUser()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->user:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->username:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Event;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setDateadded(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 35
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    new-instance v0, Ljava/util/Date;

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/activity/Event;->setDateadded(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setDateadded(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->dateadded:Ljava/util/Date;

    .line 32
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->id:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->type:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->user:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->username:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Event;->value:Ljava/lang/String;

    .line 77
    return-void
.end method
