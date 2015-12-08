.class public Lcom/arist/entity/Lyric;
.super Ljava/lang/Object;
.source "Lyric.java"


# instance fields
.field private Lyric:Ljava/lang/String;

.field private LyricTime:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLyric()Ljava/lang/String;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/arist/entity/Lyric;->Lyric:Ljava/lang/String;

    return-object v0
.end method

.method public getLyricTime()I
    .locals 1

    .prologue
    .line 19
    iget v0, p0, Lcom/arist/entity/Lyric;->LyricTime:I

    return v0
.end method

.method public setLyric(Ljava/lang/String;)V
    .locals 0
    .param p1, "lyric"    # Ljava/lang/String;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/arist/entity/Lyric;->Lyric:Ljava/lang/String;

    .line 16
    return-void
.end method

.method public setLyricTime(I)V
    .locals 0
    .param p1, "lyricTime"    # I

    .prologue
    .line 23
    iput p1, p0, Lcom/arist/entity/Lyric;->LyricTime:I

    .line 24
    return-void
.end method
