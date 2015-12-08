.class public Lcom/kik/android/stickers/MediaItemPlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Z

.field private final d:Lkik/a/e/u;

.field private final e:Lcom/kik/android/c/f;

.field private f:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-string v0, "MediaItemPlugin"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/android/stickers/MediaItemPlugin;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/u;Lcom/kik/android/c/f;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 36
    const-string v0, "MediaItems"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 32
    const-string v0, "^(https://stickers\\.kik\\.com|https://cards\\-sticker\\.herokuapp\\.com|https://cards\\-sticker\\-dev\\.herokuapp\\.com|https://my\\.kik\\.com)(.*)"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->f:Ljava/util/regex/Pattern;

    .line 38
    iput-object p1, p0, Lcom/kik/android/stickers/MediaItemPlugin;->d:Lkik/a/e/u;

    .line 39
    invoke-static {p3}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->b:Z

    .line 40
    iput-object p2, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    .line 41
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->b:Z

    if-eqz v0, :cond_0

    .line 47
    const/4 v0, 0x1

    .line 54
    :goto_0
    return v0

    .line 50
    :cond_0
    if-eqz p1, :cond_1

    .line 51
    iget-object v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public addItemsToCache(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 7
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 136
    const-string v0, "urls"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 138
    if-eqz v2, :cond_0

    .line 139
    const/4 v0, 0x0

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 141
    :try_start_0
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 142
    iget-object v4, p0, Lcom/kik/android/stickers/MediaItemPlugin;->d:Lkik/a/e/u;

    invoke-interface {v4, v0}, Lkik/a/e/u;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 144
    :catch_0
    move-exception v0

    .line 145
    sget-object v4, Lcom/kik/android/stickers/MediaItemPlugin;->a:Lorg/c/b;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error attempting to cache sticker URL"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 150
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public deleteAlternateSmileys(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 120
    const-string v0, "ids"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 121
    if-eqz v1, :cond_1

    .line 122
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 123
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v2

    .line 124
    if-eqz v2, :cond_0

    .line 125
    iget-object v3, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    invoke-virtual {v3, v2}, Lcom/kik/android/c/f;->c(Ljava/lang/String;)V

    .line 122
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 129
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 130
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1
.end method

.method public getAlternateSmileys(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 97
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    iget-object v1, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    invoke-virtual {v1}, Lcom/kik/android/c/f;->f()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/android/c/f;->a(Ljava/util/List;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public getInstalledStickerPacks(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 6
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 60
    iget-object v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->d:Lkik/a/e/u;

    invoke-interface {v0}, Lkik/a/e/u;->a()Ljava/util/List;

    move-result-object v0

    .line 61
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 62
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/x;

    .line 63
    invoke-virtual {v0}, Lkik/a/d/x;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 66
    :cond_0
    const/4 v1, 0x0

    .line 68
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :try_start_1
    const-string v1, "links"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    :goto_1
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1

    .line 71
    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    .line 72
    :goto_2
    sget-object v2, Lcom/kik/android/stickers/MediaItemPlugin;->a:Lorg/c/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error firing back event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 71
    :catch_1
    move-exception v1

    goto :goto_2
.end method

.method public installAlternateSmileys(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    invoke-virtual {v0, p1}, Lcom/kik/android/c/f;->a(Lorg/json/JSONObject;)V

    .line 82
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 83
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1
.end method

.method public installStickerPack(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 156
    invoke-static {p1}, Lcom/kik/android/stickers/b;->a(Lorg/json/JSONObject;)Lkik/a/d/x;

    move-result-object v0

    .line 157
    iget-object v1, p0, Lcom/kik/android/stickers/MediaItemPlugin;->d:Lkik/a/e/u;

    invoke-interface {v1, v0}, Lkik/a/e/u;->a(Lkik/a/d/x;)V

    .line 158
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    return-object v0
.end method

.method public preloadAlternateSmileys(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 2
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 89
    invoke-static {p1}, Lcom/kik/android/c/f;->b(Lorg/json/JSONObject;)V

    .line 90
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 91
    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    return-object v1
.end method

.method public setActiveSmiley(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 103
    const-string v0, "alternateId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 104
    const-string v1, "categoryId"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 106
    iget-object v2, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    invoke-virtual {v2, v0}, Lcom/kik/android/c/f;->d(Ljava/lang/String;)Lcom/kik/android/c/e;

    move-result-object v2

    .line 108
    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x2

    if-lt v0, v3, :cond_0

    invoke-virtual {v2}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 110
    :cond_0
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(ILorg/json/JSONObject;)V

    .line 114
    :goto_0
    return-object v0

    .line 112
    :cond_1
    iget-object v0, p0, Lcom/kik/android/stickers/MediaItemPlugin;->e:Lcom/kik/android/c/f;

    invoke-virtual {v0, v2}, Lcom/kik/android/c/f;->a(Lcom/kik/android/c/e;)V

    .line 113
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 114
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    goto :goto_0
.end method
