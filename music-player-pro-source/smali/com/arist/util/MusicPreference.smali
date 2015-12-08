.class public Lcom/arist/util/MusicPreference;
.super Ljava/lang/Object;
.source "MusicPreference.java"


# instance fields
.field sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, "music_preference"

    .line 26
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 28
    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 3

    .prologue
    .line 57
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "data"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHighLightColor()I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 101
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "lrc_high_light_color"

    .line 102
    const/16 v2, 0xff

    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    .line 101
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getLrcColor()I
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 90
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "lrc_color"

    const/16 v2, 0xff

    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getLrcSize()I
    .locals 4

    .prologue
    .line 79
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "lrc_size"

    .line 80
    sget-object v2, Lcom/arist/MusicPlayer/MyApplication;->context:Landroid/content/Context;

    const v3, 0x7f080030

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 79
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getPlayMode()I
    .locals 3

    .prologue
    .line 69
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "playmode"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getPosition()I
    .locals 3

    .prologue
    .line 47
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "position"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getProgress()I
    .locals 3

    .prologue
    .line 37
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "progress"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getTagCount()I
    .locals 3

    .prologue
    .line 112
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "tab_count"

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getTagPos([Ljava/lang/String;Landroid/content/Context;)I
    .locals 4
    .param p1, "data"    # [Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 117
    const/4 v1, 0x0

    .line 118
    .local v1, "n":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v2, p1

    if-lt v0, v2, :cond_0

    .line 124
    :goto_1
    return v1

    .line 119
    :cond_0
    invoke-virtual {p0}, Lcom/arist/util/MusicPreference;->getTagCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    aget-object v3, p1, v0

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 120
    move v1, v0

    .line 121
    goto :goto_1

    .line 118
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public saveData(Ljava/lang/String;)V
    .locals 2
    .param p1, "data"    # Ljava/lang/String;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "data"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 53
    return-void
.end method

.method public saveHightLightColor(I)V
    .locals 2
    .param p1, "hight_light_color"    # I

    .prologue
    .line 95
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 96
    const-string v1, "lrc_high_light_color"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 97
    return-void
.end method

.method public saveLrcColor(I)V
    .locals 2
    .param p1, "lrc_color"    # I

    .prologue
    .line 85
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lrc_color"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 86
    return-void
.end method

.method public saveLrcSize(I)V
    .locals 2
    .param p1, "lrc_size"    # I

    .prologue
    .line 74
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lrc_size"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 75
    return-void
.end method

.method public savePlayMode(I)V
    .locals 2
    .param p1, "playmode"    # I

    .prologue
    .line 64
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "playmode"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 65
    return-void
.end method

.method public savePosition(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 42
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "position"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 43
    return-void
.end method

.method public saveProgress(I)V
    .locals 2
    .param p1, "progress"    # I

    .prologue
    .line 32
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "progress"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 33
    return-void
.end method

.method public saveTagCount(I)V
    .locals 2
    .param p1, "tab_count"    # I

    .prologue
    .line 107
    iget-object v0, p0, Lcom/arist/util/MusicPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "tab_count"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 108
    return-void
.end method
