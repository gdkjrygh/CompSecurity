.class public Lcom/arist/util/MainGridPreference;
.super Ljava/lang/Object;
.source "MainGridPreference.java"


# instance fields
.field sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, "main_activity_pref"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    .line 22
    return-void
.end method


# virtual methods
.method public getAdd()I
    .locals 3

    .prologue
    .line 75
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_add"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getAlbum()I
    .locals 3

    .prologue
    .line 48
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_album"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getAllMusic()I
    .locals 3

    .prologue
    .line 30
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_all_music"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getArtist()I
    .locals 3

    .prologue
    .line 39
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_artist"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getDownload()I
    .locals 3

    .prologue
    .line 84
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_download"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getFav()I
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_favorite"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getFolder()I
    .locals 3

    .prologue
    .line 57
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    const-string v1, "num_of_all_folder"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public saveAdd(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 71
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_add"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 72
    return-void
.end method

.method public saveAlbum(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 44
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_album"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 45
    return-void
.end method

.method public saveAllMusic(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 26
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_all_music"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 27
    return-void
.end method

.method public saveArtist(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 35
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_artist"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 36
    return-void
.end method

.method public saveDownload(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 80
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_download"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 81
    return-void
.end method

.method public saveFav(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 62
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_favorite"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 63
    return-void
.end method

.method public saveFolder(I)V
    .locals 2
    .param p1, "num"    # I

    .prologue
    .line 53
    iget-object v0, p0, Lcom/arist/util/MainGridPreference;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "num_of_all_folder"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 54
    return-void
.end method
