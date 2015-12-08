.class public final Lcom/mopub/common/SharedPreferencesHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PREFERENCE_NAME:Ljava/lang/String; = "mopubSettings"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .prologue
    .line 14
    const-string v0, "mopubSettings"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
