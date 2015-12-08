.class public Lcom/cleanmaster/model/VastModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private adTitle:Ljava/lang/String;

.field private behindImgUrl:Ljava/lang/String;

.field private clickThrough:Ljava/lang/String;

.field private clickTrackings:Ljava/util/List;

.field private closeReportUrls:Ljava/util/List;

.field private completeReportUrls:Ljava/util/List;

.field private createViewReportUrls:Ljava/util/List;

.field private delivery:Ljava/lang/String;

.field private errorReportUrl:Ljava/lang/String;

.field private exitFullScreenReportUrls:Ljava/util/List;

.field private firstQuartileReportUrls:Ljava/util/List;

.field private frontImgUrl:Ljava/lang/String;

.field private fullScreenReportUrls:Ljava/util/List;

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private impressionReportUrls:Ljava/util/List;

.field private midpointReportUrls:Ljava/util/List;

.field private muteReportUrls:Ljava/util/List;

.field private pauseReportUrls:Ljava/util/List;

.field private resumeReportUrls:Ljava/util/List;

.field private rewindReportUrls:Ljava/util/List;

.field private startReportUrls:Ljava/util/List;

.field private thirdQuartileReportUrls:Ljava/util/List;

.field private unmuteReportUrls:Ljava/util/List;

.field private videoFilePath:Ljava/lang/String;

.field private videoHeight:I

.field private videoType:Ljava/lang/String;

.field private videoUrl:Ljava/lang/String;

.field private videoWidth:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput p1, p0, Lcom/cleanmaster/model/VastModel;->id:I

    .line 62
    iput-object p2, p0, Lcom/cleanmaster/model/VastModel;->adTitle:Ljava/lang/String;

    .line 63
    iput-object p3, p0, Lcom/cleanmaster/model/VastModel;->errorReportUrl:Ljava/lang/String;

    .line 64
    iput-object p4, p0, Lcom/cleanmaster/model/VastModel;->impressionReportUrls:Ljava/util/List;

    .line 65
    iput-object p5, p0, Lcom/cleanmaster/model/VastModel;->createViewReportUrls:Ljava/util/List;

    .line 66
    iput-object p6, p0, Lcom/cleanmaster/model/VastModel;->startReportUrls:Ljava/util/List;

    .line 67
    iput-object p7, p0, Lcom/cleanmaster/model/VastModel;->firstQuartileReportUrls:Ljava/util/List;

    .line 68
    iput-object p8, p0, Lcom/cleanmaster/model/VastModel;->midpointReportUrls:Ljava/util/List;

    .line 69
    iput-object p9, p0, Lcom/cleanmaster/model/VastModel;->thirdQuartileReportUrls:Ljava/util/List;

    .line 70
    iput-object p10, p0, Lcom/cleanmaster/model/VastModel;->completeReportUrls:Ljava/util/List;

    .line 71
    iput-object p11, p0, Lcom/cleanmaster/model/VastModel;->closeReportUrls:Ljava/util/List;

    .line 72
    iput-object p12, p0, Lcom/cleanmaster/model/VastModel;->pauseReportUrls:Ljava/util/List;

    .line 73
    iput-object p13, p0, Lcom/cleanmaster/model/VastModel;->muteReportUrls:Ljava/util/List;

    .line 74
    iput-object p14, p0, Lcom/cleanmaster/model/VastModel;->unmuteReportUrls:Ljava/util/List;

    .line 75
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->rewindReportUrls:Ljava/util/List;

    .line 76
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->resumeReportUrls:Ljava/util/List;

    .line 77
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->fullScreenReportUrls:Ljava/util/List;

    .line 78
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->exitFullScreenReportUrls:Ljava/util/List;

    .line 79
    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->clickThrough:Ljava/lang/String;

    .line 80
    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->clickTrackings:Ljava/util/List;

    .line 81
    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->delivery:Ljava/lang/String;

    .line 82
    move/from16 v0, p22

    iput v0, p0, Lcom/cleanmaster/model/VastModel;->videoWidth:I

    .line 83
    move/from16 v0, p23

    iput v0, p0, Lcom/cleanmaster/model/VastModel;->videoHeight:I

    .line 84
    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoUrl:Ljava/lang/String;

    .line 85
    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoType:Ljava/lang/String;

    .line 86
    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->frontImgUrl:Ljava/lang/String;

    .line 87
    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->behindImgUrl:Ljava/lang/String;

    .line 88
    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->iconUrl:Ljava/lang/String;

    .line 89
    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoFilePath:Ljava/lang/String;

    .line 90
    return-void
.end method


# virtual methods
.method public getAdTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->adTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getBehindImgUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->behindImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getClickThrough()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->clickThrough:Ljava/lang/String;

    return-object v0
.end method

.method public getClickTrackings()Ljava/util/List;
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->clickTrackings:Ljava/util/List;

    return-object v0
.end method

.method public getCloseReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->closeReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getCompleteReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->completeReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getCreateViewReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->createViewReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getDelivery()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->delivery:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorReportUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->errorReportUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getExitFullScreenReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->exitFullScreenReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getFirstQuartileReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->firstQuartileReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getFrontImgUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->frontImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getFullScreenReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->fullScreenReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/cleanmaster/model/VastModel;->id:I

    return v0
.end method

.method public getImpressionReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->impressionReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getMidpointReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->midpointReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getMuteReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->muteReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getPauseReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->pauseReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getResumeReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->resumeReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getRewindReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->rewindReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getStartReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->startReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getThirdQuartileReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->thirdQuartileReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getUnmuteReportUrls()Ljava/util/List;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->unmuteReportUrls:Ljava/util/List;

    return-object v0
.end method

.method public getVideoFilePath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoFilePath:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoHeight()I
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Lcom/cleanmaster/model/VastModel;->videoHeight:I

    return v0
.end method

.method public getVideoType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoType:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/cleanmaster/model/VastModel;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoWidth()I
    .locals 1

    .prologue
    .line 169
    iget v0, p0, Lcom/cleanmaster/model/VastModel;->videoWidth:I

    return v0
.end method

.method public setAdTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->adTitle:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setBehindImgUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->behindImgUrl:Ljava/lang/String;

    .line 298
    return-void
.end method

.method public setClickThrough(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->clickThrough:Ljava/lang/String;

    .line 254
    return-void
.end method

.method public setClickTrackings(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 257
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->clickTrackings:Ljava/util/List;

    .line 258
    return-void
.end method

.method public setCloseReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->closeReportUrls:Ljava/util/List;

    .line 230
    return-void
.end method

.method public setCompleteReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->completeReportUrls:Ljava/util/List;

    .line 226
    return-void
.end method

.method public setCreateViewReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->createViewReportUrls:Ljava/util/List;

    .line 206
    return-void
.end method

.method public setDelivery(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 261
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->delivery:Ljava/lang/String;

    .line 262
    return-void
.end method

.method public setErrorReportUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->errorReportUrl:Ljava/lang/String;

    .line 198
    return-void
.end method

.method public setExitFullScreenReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->exitFullScreenReportUrls:Ljava/util/List;

    .line 322
    return-void
.end method

.method public setFirstQuartileReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->firstQuartileReportUrls:Ljava/util/List;

    .line 214
    return-void
.end method

.method public setFrontImgUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->frontImgUrl:Ljava/lang/String;

    .line 290
    return-void
.end method

.method public setFullScreenReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 313
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->fullScreenReportUrls:Ljava/util/List;

    .line 314
    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->iconUrl:Ljava/lang/String;

    .line 306
    return-void
.end method

.method public setId(I)V
    .locals 0

    .prologue
    .line 189
    iput p1, p0, Lcom/cleanmaster/model/VastModel;->id:I

    .line 190
    return-void
.end method

.method public setImpressionReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->impressionReportUrls:Ljava/util/List;

    .line 202
    return-void
.end method

.method public setMidpointReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 217
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->midpointReportUrls:Ljava/util/List;

    .line 218
    return-void
.end method

.method public setMuteReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 237
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->muteReportUrls:Ljava/util/List;

    .line 238
    return-void
.end method

.method public setPauseReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->pauseReportUrls:Ljava/util/List;

    .line 234
    return-void
.end method

.method public setResumeReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->resumeReportUrls:Ljava/util/List;

    .line 250
    return-void
.end method

.method public setRewindReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->rewindReportUrls:Ljava/util/List;

    .line 246
    return-void
.end method

.method public setStartReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->startReportUrls:Ljava/util/List;

    .line 210
    return-void
.end method

.method public setThirdQuartileReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 221
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->thirdQuartileReportUrls:Ljava/util/List;

    .line 222
    return-void
.end method

.method public setUnmuteReportUrls(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->unmuteReportUrls:Ljava/util/List;

    .line 242
    return-void
.end method

.method public setVideoFilePath(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->videoFilePath:Ljava/lang/String;

    .line 282
    return-void
.end method

.method public setVideoHeight(I)V
    .locals 0

    .prologue
    .line 269
    iput p1, p0, Lcom/cleanmaster/model/VastModel;->videoHeight:I

    .line 270
    return-void
.end method

.method public setVideoType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->videoType:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public setVideoUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 273
    iput-object p1, p0, Lcom/cleanmaster/model/VastModel;->videoUrl:Ljava/lang/String;

    .line 274
    return-void
.end method

.method public setVideoWidth(I)V
    .locals 0

    .prologue
    .line 265
    iput p1, p0, Lcom/cleanmaster/model/VastModel;->videoWidth:I

    .line 266
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 326
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VastModel{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/cleanmaster/model/VastModel;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", adTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->adTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorReportUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->errorReportUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", impressionReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->impressionReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createViewReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->createViewReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->startReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstQuartileReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->firstQuartileReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", midpointReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->midpointReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdQuartileReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->thirdQuartileReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completeReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->completeReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", closeReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->closeReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pauseReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->pauseReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", muteReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->muteReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", unmuteReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->unmuteReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rewindReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->rewindReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resumeReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->resumeReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fullScreenReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->fullScreenReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", exitFullScreenReportUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->exitFullScreenReportUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clickThrough=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->clickThrough:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clickTrackings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->clickTrackings:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", delivery=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->delivery:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/cleanmaster/model/VastModel;->videoWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/cleanmaster/model/VastModel;->videoHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->videoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->videoType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frontImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->frontImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", behindImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->behindImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->iconUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoFilePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/model/VastModel;->videoFilePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
