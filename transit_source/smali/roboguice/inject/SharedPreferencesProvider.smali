.class public Lroboguice/inject/SharedPreferencesProvider;
.super Ljava/lang/Object;
.source "SharedPreferencesProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/inject/SharedPreferencesProvider$PreferencesNameHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# static fields
.field protected static final ROBOGUICE_1_DEFAULT_FILENAME:Ljava/lang/String; = "default.xml"


# instance fields
.field protected application:Landroid/app/Application;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field protected preferencesName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "preferencesName"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lroboguice/inject/SharedPreferencesProvider;->preferencesName:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public constructor <init>(Lroboguice/inject/SharedPreferencesProvider$PreferencesNameHolder;)V
    .locals 1
    .param p1, "preferencesNameHolder"    # Lroboguice/inject/SharedPreferencesProvider$PreferencesNameHolder;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iget-object v0, p1, Lroboguice/inject/SharedPreferencesProvider$PreferencesNameHolder;->value:Ljava/lang/String;

    iput-object v0, p0, Lroboguice/inject/SharedPreferencesProvider;->preferencesName:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method public get()Landroid/content/SharedPreferences;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 56
    iget-object v0, p0, Lroboguice/inject/SharedPreferencesProvider;->preferencesName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lroboguice/inject/SharedPreferencesProvider;->application:Landroid/app/Application;

    iget-object v1, p0, Lroboguice/inject/SharedPreferencesProvider;->preferencesName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 62
    :goto_0
    return-object v0

    .line 59
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "shared_prefs/default.xml"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lroboguice/inject/SharedPreferencesProvider;->application:Landroid/app/Application;

    const-string v1, "default.xml"

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    goto :goto_0

    .line 62
    :cond_1
    iget-object v0, p0, Lroboguice/inject/SharedPreferencesProvider;->application:Landroid/app/Application;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Lroboguice/inject/SharedPreferencesProvider;->get()Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
