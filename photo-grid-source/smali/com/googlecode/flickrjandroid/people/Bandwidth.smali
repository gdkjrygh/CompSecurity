.class public Lcom/googlecode/flickrjandroid/people/Bandwidth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isUnlimited:Z

.field private max:J

.field private maxBytes:J

.field private maxKb:J

.field private remainingBytes:J

.field private remainingKb:J

.field private used:J

.field private usedBytes:J

.field private usedKb:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public getMax()J
    .locals 2

    .prologue
    .line 34
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->max:J

    return-wide v0
.end method

.method public getMaxBytes()J
    .locals 2

    .prologue
    .line 66
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->maxBytes:J

    return-wide v0
.end method

.method public getMaxKb()J
    .locals 2

    .prologue
    .line 114
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->maxKb:J

    return-wide v0
.end method

.method public getRemainingBytes()J
    .locals 2

    .prologue
    .line 98
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->remainingBytes:J

    return-wide v0
.end method

.method public getRemainingKb()J
    .locals 2

    .prologue
    .line 146
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->remainingKb:J

    return-wide v0
.end method

.method public getUsed()J
    .locals 2

    .prologue
    .line 50
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->used:J

    return-wide v0
.end method

.method public getUsedBytes()J
    .locals 2

    .prologue
    .line 82
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->usedBytes:J

    return-wide v0
.end method

.method public getUsedKb()J
    .locals 2

    .prologue
    .line 130
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->usedKb:J

    return-wide v0
.end method

.method public isUnlimited()Z
    .locals 1

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->isUnlimited:Z

    return v0
.end method

.method public setMax(J)V
    .locals 1

    .prologue
    .line 42
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->max:J

    .line 43
    return-void
.end method

.method public setMaxBytes(J)V
    .locals 1

    .prologue
    .line 74
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->maxBytes:J

    .line 75
    return-void
.end method

.method public setMaxKb(J)V
    .locals 1

    .prologue
    .line 122
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->maxKb:J

    .line 123
    return-void
.end method

.method public setRemainingBytes(J)V
    .locals 1

    .prologue
    .line 106
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->remainingBytes:J

    .line 107
    return-void
.end method

.method public setRemainingKb(J)V
    .locals 1

    .prologue
    .line 154
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->remainingKb:J

    .line 155
    return-void
.end method

.method public setUnlimited(Z)V
    .locals 0

    .prologue
    .line 170
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->isUnlimited:Z

    .line 171
    return-void
.end method

.method public setUsed(J)V
    .locals 1

    .prologue
    .line 58
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->used:J

    .line 59
    return-void
.end method

.method public setUsedBytes(J)V
    .locals 1

    .prologue
    .line 90
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->usedBytes:J

    .line 91
    return-void
.end method

.method public setUsedKb(J)V
    .locals 1

    .prologue
    .line 138
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/Bandwidth;->usedKb:J

    .line 139
    return-void
.end method
