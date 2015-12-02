.class public Lcom/qihoo/security/clearengine/sdk/a/c$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/SharedPreferences;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/qihoo360/i/v1/main/IIpcPref;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    if-eqz p2, :cond_0

    .line 42
    invoke-static {}, Lcom/qihoo/security/clearengine/sdk/a/c;->a()Lcom/qihoo360/mobilesafe/share/b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo360/mobilesafe/share/b;->getSharedPreferences(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    .line 47
    :goto_0
    return-void

    .line 44
    :cond_0
    invoke-static {}, Lcom/qihoo/security/clearengine/sdk/a/c;->a()Lcom/qihoo360/mobilesafe/share/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/share/b;->getDefaultSharedPreferences()Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    goto :goto_0
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1}, Lcom/qihoo360/i/v1/main/IIpcPref;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public edit()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method

.method public getAll()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->getAll()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getFloat(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getLong(Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 71
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo360/i/v1/main/IIpcPref;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    const/4 v0, 0x0

    return-object v0
.end method

.method public registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1}, Lcom/qihoo360/i/v1/main/IIpcPref;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 97
    return-void
.end method

.method public unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/c$a;->a:Lcom/qihoo360/i/v1/main/IIpcPref;

    invoke-interface {v0, p1}, Lcom/qihoo360/i/v1/main/IIpcPref;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 102
    return-void
.end method
