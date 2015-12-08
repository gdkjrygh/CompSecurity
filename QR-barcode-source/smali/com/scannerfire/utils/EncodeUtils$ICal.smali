.class public Lcom/scannerfire/utils/EncodeUtils$ICal;
.super Ljava/lang/Object;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/EncodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ICal"
.end annotation


# instance fields
.field des:Ljava/lang/String;

.field end:J

.field start:J

.field final synthetic this$0:Lcom/scannerfire/utils/EncodeUtils;

.field what:Ljava/lang/String;

.field where:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/scannerfire/utils/EncodeUtils;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1
    .param p2, "what"    # Ljava/lang/String;
    .param p3, "where"    # Ljava/lang/String;
    .param p4, "des"    # Ljava/lang/String;
    .param p5, "start"    # J
    .param p7, "end"    # J

    .prologue
    .line 293
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    iput-object p2, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->what:Ljava/lang/String;

    .line 295
    iput-object p3, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->where:Ljava/lang/String;

    .line 296
    iput-object p4, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->des:Ljava/lang/String;

    .line 297
    iput-wide p5, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->start:J

    .line 298
    iput-wide p7, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->end:J

    .line 299
    return-void
.end method


# virtual methods
.method public getDes()Ljava/lang/String;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->des:Ljava/lang/String;

    return-object v0
.end method

.method public getEnd()Ljava/lang/String;
    .locals 6

    .prologue
    .line 322
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 323
    .local v0, "current":Ljava/util/Locale;
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy/MM/dd HH:mm"

    invoke-direct {v1, v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 324
    .local v1, "sdf":Ljava/text/SimpleDateFormat;
    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->end:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getStart()Ljava/lang/String;
    .locals 6

    .prologue
    .line 314
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 315
    .local v0, "current":Ljava/util/Locale;
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy/MM/dd HH:mm"

    invoke-direct {v1, v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 316
    .local v1, "sdf":Ljava/text/SimpleDateFormat;
    new-instance v2, Ljava/util/Date;

    iget-wide v4, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->start:J

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public getStartMill()J
    .locals 2

    .prologue
    .line 330
    iget-wide v0, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->start:J

    return-wide v0
.end method

.method public getWhat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->what:Ljava/lang/String;

    return-object v0
.end method

.method public getWhere()Ljava/lang/String;
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ICal;->where:Ljava/lang/String;

    return-object v0
.end method
