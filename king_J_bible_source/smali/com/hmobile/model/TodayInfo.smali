.class public Lcom/hmobile/model/TodayInfo;
.super Ljava/lang/Object;
.source "TodayInfo.java"


# instance fields
.field public BookCount:I

.field public BookName:Ljava/lang/String;

.field public ChapterCount:I

.field public TodayDate:Ljava/lang/String;

.field public TodayVerse:Ljava/lang/String;

.field public VerseCount:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/TodayInfo;->BookName:Ljava/lang/String;

    .line 14
    iput v1, p0, Lcom/hmobile/model/TodayInfo;->BookCount:I

    .line 15
    iput v1, p0, Lcom/hmobile/model/TodayInfo;->ChapterCount:I

    .line 16
    iput v1, p0, Lcom/hmobile/model/TodayInfo;->VerseCount:I

    .line 8
    return-void
.end method


# virtual methods
.method public saveTodayInfo()V
    .locals 0

    .prologue
    .line 26
    return-void
.end method
