.class public Lcom/googlecode/flickrjandroid/machinetags/Value;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/machinetags/ITag;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private firstAdded:Ljava/util/Date;

.field private lastAdded:Ljava/util/Date;

.field private namespace:Ljava/lang/String;

.field private predicate:Ljava/lang/String;

.field private usage:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method public getFirstAdded()Ljava/util/Date;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->firstAdded:Ljava/util/Date;

    return-object v0
.end method

.method public getLastAdded()Ljava/util/Date;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->lastAdded:Ljava/util/Date;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public getPredicate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->predicate:Ljava/lang/String;

    return-object v0
.end method

.method public getUsage()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->usage:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setFirstAdded(J)V
    .locals 1

    .prologue
    .line 60
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setFirstAdded(Ljava/util/Date;)V

    .line 61
    return-void
.end method

.method public setFirstAdded(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 64
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    :cond_0
    :goto_0
    return-void

    .line 65
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setFirstAdded(J)V

    goto :goto_0
.end method

.method public setFirstAdded(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->firstAdded:Ljava/util/Date;

    .line 57
    return-void
.end method

.method public setLastAdded(J)V
    .locals 1

    .prologue
    .line 73
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setLastAdded(Ljava/util/Date;)V

    .line 74
    return-void
.end method

.method public setLastAdded(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 77
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setLastAdded(J)V

    goto :goto_0
.end method

.method public setLastAdded(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->lastAdded:Ljava/util/Date;

    .line 70
    return-void
.end method

.method public setNamespace(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->namespace:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setPredicate(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->predicate:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setUsage(I)V
    .locals 0

    .prologue
    .line 88
    iput p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->usage:I

    .line 89
    return-void
.end method

.method public setUsage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 83
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/machinetags/Value;->setUsage(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/machinetags/Value;->value:Ljava/lang/String;

    .line 33
    return-void
.end method
