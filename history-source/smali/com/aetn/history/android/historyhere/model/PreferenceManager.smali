.class public Lcom/aetn/history/android/historyhere/model/PreferenceManager;
.super Ljava/lang/Object;
.source "PreferenceManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    }
.end annotation


# static fields
.field public static final PREF_FAVORITES:Ljava/lang/String; = "favorites"

.field public static final PREF_FULL_DB_REFRESH_DATE:Ljava/lang/String; = "db_refresh_date"

.field private static final PREF_HAS_HAD_FIRST_RUN:Ljava/lang/String; = "has_had_first_run"

.field private static final PREF_HAS_SHOWN_TOUR_INTRO:Ljava/lang/String; = "has_shown_tour_intro"

.field public static final PREF_LIMITED_DB_UPDATE_DATE:Ljava/lang/String; = "db_limited_update_date"

.field public static final PREF_RATE_REMINDER_COUNT:Ljava/lang/String; = "rate_reminder_count"

.field public static final PREF_RATE_REMINDER_DATE:Ljava/lang/String; = "remind_me_update_date"

.field public static final PREF_SHOW_RATE_REMINDER:Ljava/lang/String; = "show_rate_reminder"

.field private static final PREF_UPDATE_REMINDER_LATER_COUNT:Ljava/lang/String; = "update_remind_later_count"

.field private static final PREF_UPDATE_REMINDER_TF:Ljava/lang/String; = "update_tf"

.field private static final TAG:Ljava/lang/String;

.field private static mFavoritesChangedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public static addFavorite(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 212
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 213
    .local v2, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 214
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v3, "favorites"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 215
    .local v1, "favoritesString":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 216
    const-string v3, "favorites"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 217
    sget-object v3, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "addFavorite: the favs are: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 219
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->notifyFavoritesChanged()V

    .line 220
    return-void
.end method

.method public static getFavorites(Landroid/content/Context;)[Ljava/lang/String;
    .locals 9
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 263
    const/4 v1, 0x0

    .line 265
    .local v1, "favs":[Ljava/lang/String;
    :try_start_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 266
    .local v3, "sp":Landroid/content/SharedPreferences;
    const-string v4, "favorites"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 267
    .local v0, "favoritesString":Ljava/lang/String;
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 268
    array-length v5, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v5, :cond_0

    aget-object v2, v1, v4

    .line 269
    .local v2, "s":Ljava/lang/String;
    sget-object v6, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "getFavorites(): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 271
    .end local v0    # "favoritesString":Ljava/lang/String;
    .end local v2    # "s":Ljava/lang/String;
    .end local v3    # "sp":Landroid/content/SharedPreferences;
    :catch_0
    move-exception v4

    .line 274
    :cond_0
    return-object v1
.end method

.method public static getFavoritesString(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 279
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 280
    .local v1, "sp":Landroid/content/SharedPreferences;
    const-string v2, "favorites"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 282
    .local v0, "pref":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 283
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 285
    :cond_0
    return-object v0
.end method

.method public static getFullDatabaseRefreshDate(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 173
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 174
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "db_refresh_date"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static getLimitedDatabaseUpdateDate(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 186
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 187
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "db_limited_update_date"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static getRateReminderCount(Landroid/content/Context;)I
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 156
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 157
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "rate_reminder_count"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    return v1
.end method

.method public static getRateReminderDate(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 132
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 133
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "remind_me_update_date"

    invoke-static {}, Lcom/aetn/history/android/historyhere/utils/Utils;->getTodaysDateString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static getShouldShowRateReminder(Landroid/content/Context;)Z
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 144
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 145
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "show_rate_reminder"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method public static getUpdateReminderCount(Landroid/content/Context;)I
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 51
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 52
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "update_remind_later_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    return v1
.end method

.method public static getUpdateReminderTF(Landroid/content/Context;)Z
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 33
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 34
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "update_tf"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method public static hasFavorites(Landroid/content/Context;)Z
    .locals 5
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 253
    const/4 v2, 0x0

    .line 254
    .local v2, "tf":Z
    if-eqz p0, :cond_0

    .line 255
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 256
    .local v1, "sp":Landroid/content/SharedPreferences;
    const-string v3, "favorites"

    const-string v4, ""

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 257
    .local v0, "favoritesString":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v2, 0x0

    .line 259
    .end local v0    # "favoritesString":Ljava/lang/String;
    .end local v1    # "sp":Landroid/content/SharedPreferences;
    :cond_0
    :goto_0
    return v2

    .line 257
    .restart local v0    # "favoritesString":Ljava/lang/String;
    .restart local v1    # "sp":Landroid/content/SharedPreferences;
    :cond_1
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static hasHadFirstRun(Landroid/content/Context;)Z
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 118
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 119
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "has_had_first_run"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method public static hasShownTourIntro(Landroid/content/Context;)Z
    .locals 3
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 199
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 200
    .local v0, "sp":Landroid/content/SharedPreferences;
    const-string v1, "has_shown_tour_intro"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    return v1
.end method

.method public static incrementUpdateReminderCount(Landroid/content/Context;)V
    .locals 6
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 68
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 69
    .local v2, "sp":Landroid/content/SharedPreferences;
    const-string v3, "update_remind_later_count"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 70
    .local v0, "count":I
    sget-object v3, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "count starts at:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    sget-object v3, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "count now at:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 75
    .local v1, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v3, "update_remind_later_count"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 76
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 77
    return-void
.end method

.method public static isFavorite(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 9
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 236
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFavorites(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    .line 237
    .local v1, "f":[Ljava/lang/String;
    sget-object v4, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "isFavorite: f:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    :try_start_0
    array-length v5, v1

    move v4, v3

    :goto_0
    if-ge v4, v5, :cond_0

    aget-object v2, v1, v4

    .line 240
    .local v2, "s":Ljava/lang/String;
    sget-object v6, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "getFavorites(): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-eqz v6, :cond_1

    .line 242
    const/4 v3, 0x1

    .line 249
    .end local v2    # "s":Ljava/lang/String;
    :cond_0
    :goto_1
    return v3

    .line 239
    .restart local v2    # "s":Ljava/lang/String;
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 245
    .end local v2    # "s":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 246
    .local v0, "e":Ljava/lang/NullPointerException;
    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_1
.end method

.method private static notifyFavoritesChanged()V
    .locals 3

    .prologue
    .line 103
    sget-object v1, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 104
    sget-object v1, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v0, "l":Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "l":Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    check-cast v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    .line 105
    .restart local v0    # "l":Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    invoke-interface {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;->onFavoritesChanged()V

    goto :goto_0

    .line 108
    :cond_0
    return-void
.end method

.method public static removeFavorite(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 223
    sget-object v4, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "removeFavorite: id:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 225
    .local v3, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 226
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v4, "favorites"

    const-string v5, ""

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 227
    .local v1, "favoritesString":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 228
    .local v2, "removeStr":Ljava/lang/String;
    const-string v4, ""

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 229
    const-string v4, "favorites"

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 230
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 231
    sget-object v4, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "removeFavorite: favoritesString:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    invoke-static {}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->notifyFavoritesChanged()V

    .line 233
    return-void
.end method

.method public static removePreferencesChangedListener(Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;)V
    .locals 4
    .param p0, "listener"    # Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    .prologue
    .line 88
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    .line 89
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 90
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    .line 91
    .local v1, "l":Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    if-ne v1, p0, :cond_0

    .line 92
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    const-string v3, "removed listener"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 89
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 95
    :cond_0
    sget-object v2, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->TAG:Ljava/lang/String;

    const-string v3, "didnt find listener"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 100
    .end local v0    # "i":I
    .end local v1    # "l":Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;
    :cond_1
    return-void
.end method

.method public static setFirstRun(Landroid/content/Context;)V
    .locals 4
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 123
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 124
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 125
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "has_had_first_run"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 126
    invoke-static {}, Lcom/aetn/history/android/historyhere/utils/Utils;->getTodaysDateString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->setRateReminderDate(Landroid/content/Context;Ljava/lang/String;)V

    .line 127
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 128
    return-void
.end method

.method public static setFullDatabaseRefreshDate(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "date"    # Ljava/lang/String;

    .prologue
    .line 179
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 180
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 181
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "db_refresh_date"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 182
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 183
    return-void
.end method

.method public static setHasShownTourIntro(Landroid/content/Context;)V
    .locals 4
    .param p0, "c"    # Landroid/content/Context;

    .prologue
    .line 204
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 205
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 206
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "has_shown_tour_intro"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 207
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 208
    return-void
.end method

.method public static setLimitedDatabaseUpdateDate(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "date"    # Ljava/lang/String;

    .prologue
    .line 191
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 192
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 193
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "db_limited_update_date"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 194
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 195
    return-void
.end method

.method public static setPreferencesChangedListener(Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;)V
    .locals 1
    .param p0, "listener"    # Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;

    .prologue
    .line 81
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    .line 84
    :cond_0
    sget-object v0, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->mFavoritesChangedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    return-void
.end method

.method public static setRateReminderCount(Landroid/content/Context;I)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "count"    # I

    .prologue
    .line 161
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 162
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 163
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "rate_reminder_count"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 164
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 165
    return-void
.end method

.method public static setRateReminderDate(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "date"    # Ljava/lang/String;

    .prologue
    .line 137
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 138
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 139
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "remind_me_update_date"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 140
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 141
    return-void
.end method

.method public static setShouldShowRateReminder(Landroid/content/Context;Z)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "tf"    # Z

    .prologue
    .line 149
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 150
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 151
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "show_rate_reminder"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 152
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 153
    return-void
.end method

.method public static setUpdateReminderCount(Landroid/content/Context;I)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "count"    # I

    .prologue
    .line 61
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 62
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 63
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "update_remind_later_count"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 65
    return-void
.end method

.method public static setUpdateReminderTF(Landroid/content/Context;Z)V
    .locals 3
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "tf"    # Z

    .prologue
    .line 44
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 45
    .local v1, "sp":Landroid/content/SharedPreferences;
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 46
    .local v0, "edit":Landroid/content/SharedPreferences$Editor;
    const-string v2, "update_tf"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 47
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 48
    return-void
.end method
