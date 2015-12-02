.class public Lorg/acra/util/ACRAResponse;
.super Ljava/lang/Object;
.source "ACRAResponse.java"


# instance fields
.field private mStatus:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatusCode()I
    .locals 1

    .prologue
    .line 13
    iget v0, p0, Lorg/acra/util/ACRAResponse;->mStatus:I

    return v0
.end method

.method public setStatusCode(I)V
    .locals 0

    .prologue
    .line 9
    iput p1, p0, Lorg/acra/util/ACRAResponse;->mStatus:I

    .line 10
    return-void
.end method
