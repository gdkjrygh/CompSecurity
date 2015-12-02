.class public Lcom/qihoo/security/clearengine/d/c;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 42
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/c;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/sdk/a/c;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 44
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/c;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/sdk/a/c;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 29
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 48
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/c;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/sdk/a/c;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 51
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 52
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 53
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 34
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/a/c;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/sdk/a/c;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 36
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 37
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 39
    return-void
.end method
