.class public Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl$NalUnitHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/tracks/H265TrackImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NalUnitHeader"
.end annotation


# instance fields
.field forbiddenZeroFlag:I

.field nalUnitType:I

.field nuhLayerId:I

.field nuhTemporalIdPlusOne:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
