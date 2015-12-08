.class public Lcom/googlecode/flickrjandroid/photos/Photocount;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private count:I

.field private fromDate:Ljava/util/Date;

.field private toDate:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->count:I

    return v0
.end method

.method public getFromDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->fromDate:Ljava/util/Date;

    return-object v0
.end method

.method public getToDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->toDate:Ljava/util/Date;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->count:I

    .line 28
    return-void
.end method

.method public setCount(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 31
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photocount;->setCount(I)V

    .line 32
    :cond_0
    return-void
.end method

.method public setFromDate(J)V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photocount;->setFromDate(Ljava/util/Date;)V

    .line 44
    return-void
.end method

.method public setFromDate(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 47
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/photos/Photocount;->setFromDate(J)V

    .line 48
    :cond_0
    return-void
.end method

.method public setFromDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->fromDate:Ljava/util/Date;

    .line 40
    return-void
.end method

.method public setToDate(J)V
    .locals 1

    .prologue
    .line 59
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/photos/Photocount;->setToDate(Ljava/util/Date;)V

    .line 60
    return-void
.end method

.method public setToDate(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 63
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/photos/Photocount;->setToDate(J)V

    .line 64
    :cond_0
    return-void
.end method

.method public setToDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/Photocount;->toDate:Ljava/util/Date;

    .line 56
    return-void
.end method
