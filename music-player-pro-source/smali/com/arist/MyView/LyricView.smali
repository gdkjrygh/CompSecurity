.class public Lcom/arist/MyView/LyricView;
.super Landroid/widget/TextView;
.source "LyricView.java"


# instance fields
.field private LyricList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation
.end field

.field private color:I

.field private highLightColor:I

.field private highLightPaint:Landroid/graphics/Paint;

.field private hight:F

.field private index:I

.field private paint:Landroid/graphics/Paint;

.field private textHigh:F

.field private textSize:F

.field private width:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 51
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MyView/LyricView;->index:I

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    .line 52
    invoke-direct {p0}, Lcom/arist/MyView/LyricView;->init()V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MyView/LyricView;->index:I

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    .line 62
    invoke-direct {p0}, Lcom/arist/MyView/LyricView;->init()V

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/MyView/LyricView;->index:I

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    .line 57
    invoke-direct {p0}, Lcom/arist/MyView/LyricView;->init()V

    .line 58
    return-void
.end method

.method private init()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 66
    invoke-virtual {p0, v2}, Lcom/arist/MyView/LyricView;->setFocusable(Z)V

    .line 67
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getLrcSize()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/arist/MyView/LyricView;->textSize:F

    .line 68
    iget v0, p0, Lcom/arist/MyView/LyricView;->textSize:F

    const/high16 v1, 0x41200000    # 10.0f

    add-float/2addr v0, v1

    iput v0, p0, Lcom/arist/MyView/LyricView;->textHigh:F

    .line 70
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getLrcColor()I

    move-result v0

    iput v0, p0, Lcom/arist/MyView/LyricView;->color:I

    .line 71
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-virtual {v0}, Lcom/arist/util/MusicPreference;->getHighLightColor()I

    move-result v0

    iput v0, p0, Lcom/arist/MyView/LyricView;->highLightColor:I

    .line 73
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    .line 74
    iget-object v0, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 75
    iget-object v0, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 78
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    .line 79
    iget-object v0, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 80
    iget-object v0, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 81
    return-void
.end method


# virtual methods
.method public clearText()V
    .locals 2

    .prologue
    .line 122
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    .line 123
    new-instance v0, Lcom/arist/entity/Lyric;

    invoke-direct {v0}, Lcom/arist/entity/Lyric;-><init>()V

    .line 124
    .local v0, "lyric":Lcom/arist/entity/Lyric;
    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/arist/entity/Lyric;->setLyric(Ljava/lang/String;)V

    .line 125
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/entity/Lyric;->setLyricTime(I)V

    .line 127
    const-string v1, ""

    invoke-virtual {p0, v1}, Lcom/arist/MyView/LyricView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    invoke-virtual {p0}, Lcom/arist/MyView/LyricView;->invalidate()V

    .line 129
    return-void
.end method

.method public getLyricList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 85
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 86
    if-nez p1, :cond_1

    .line 119
    :cond_0
    :goto_0
    return-void

    .line 89
    :cond_1
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/arist/MyView/LyricView;->highLightColor:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/arist/MyView/LyricView;->color:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/arist/MyView/LyricView;->textSize:F

    const/high16 v4, 0x40400000    # 3.0f

    add-float/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 93
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/arist/MyView/LyricView;->textSize:F

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 95
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 96
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 99
    :try_start_0
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    iget v3, p0, Lcom/arist/MyView/LyricView;->index:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Lyric;

    invoke-virtual {v2}, Lcom/arist/entity/Lyric;->getLyric()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/arist/MyView/LyricView;->width:F

    div-float/2addr v3, v6

    .line 100
    iget v4, p0, Lcom/arist/MyView/LyricView;->hight:F

    div-float/2addr v4, v6

    iget-object v5, p0, Lcom/arist/MyView/LyricView;->highLightPaint:Landroid/graphics/Paint;

    .line 99
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 101
    iget v2, p0, Lcom/arist/MyView/LyricView;->hight:F

    div-float v1, v2, v6

    .line 103
    .local v1, "tempY":F
    iget v2, p0, Lcom/arist/MyView/LyricView;->index:I

    add-int/lit8 v0, v2, -0x1

    .local v0, "i":I
    :goto_1
    if-gez v0, :cond_2

    .line 109
    iget v2, p0, Lcom/arist/MyView/LyricView;->hight:F

    div-float v1, v2, v6

    .line 111
    iget v2, p0, Lcom/arist/MyView/LyricView;->index:I

    add-int/lit8 v0, v2, 0x1

    :goto_2
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 113
    iget v2, p0, Lcom/arist/MyView/LyricView;->textHigh:F

    add-float/2addr v1, v2

    .line 114
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Lyric;

    invoke-virtual {v2}, Lcom/arist/entity/Lyric;->getLyric()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/arist/MyView/LyricView;->width:F

    div-float/2addr v3, v6

    .line 115
    iget-object v4, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    .line 114
    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 111
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 105
    :cond_2
    iget v2, p0, Lcom/arist/MyView/LyricView;->textHigh:F

    sub-float/2addr v1, v2

    .line 106
    iget-object v2, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/arist/entity/Lyric;

    invoke-virtual {v2}, Lcom/arist/entity/Lyric;->getLyric()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/arist/MyView/LyricView;->width:F

    div-float/2addr v3, v6

    .line 107
    iget-object v4, p0, Lcom/arist/MyView/LyricView;->paint:Landroid/graphics/Paint;

    .line 106
    invoke-virtual {p1, v2, v3, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 117
    .end local v0    # "i":I
    .end local v1    # "tempY":F
    :catch_0
    move-exception v2

    goto/16 :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1
    .param p1, "w"    # I
    .param p2, "h"    # I
    .param p3, "oldw"    # I
    .param p4, "oldh"    # I

    .prologue
    .line 133
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onSizeChanged(IIII)V

    .line 134
    int-to-float v0, p2

    iput v0, p0, Lcom/arist/MyView/LyricView;->hight:F

    .line 135
    int-to-float v0, p1

    iput v0, p0, Lcom/arist/MyView/LyricView;->width:F

    .line 136
    return-void
.end method

.method public setColor(I)V
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 34
    iput p1, p0, Lcom/arist/MyView/LyricView;->color:I

    .line 35
    return-void
.end method

.method public setHighLightColor(I)V
    .locals 0
    .param p1, "highLightColor"    # I

    .prologue
    .line 30
    iput p1, p0, Lcom/arist/MyView/LyricView;->highLightColor:I

    .line 31
    return-void
.end method

.method public setIndex(I)V
    .locals 0
    .param p1, "index"    # I

    .prologue
    .line 139
    iput p1, p0, Lcom/arist/MyView/LyricView;->index:I

    .line 140
    return-void
.end method

.method public setLyricList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/arist/entity/Lyric;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    .local p1, "lyricList":Ljava/util/List;, "Ljava/util/List<Lcom/arist/entity/Lyric;>;"
    iput-object p1, p0, Lcom/arist/MyView/LyricView;->LyricList:Ljava/util/List;

    .line 48
    return-void
.end method

.method public setTextSize(F)V
    .locals 1
    .param p1, "textSize"    # F

    .prologue
    .line 38
    iput p1, p0, Lcom/arist/MyView/LyricView;->textSize:F

    .line 39
    const/high16 v0, 0x41200000    # 10.0f

    add-float/2addr v0, p1

    iput v0, p0, Lcom/arist/MyView/LyricView;->textHigh:F

    .line 40
    return-void
.end method
