.class public Lcom/qihoo360/mobilesafe/share/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo360/mobilesafe/share/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    invoke-static {}, Lcom/qihoo360/mobilesafe/share/b;->a()Lcom/qihoo360/mobilesafe/share/b;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/share/d;->a:Lcom/qihoo360/mobilesafe/share/b;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 152
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 154
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 155
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 37
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 38
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 39
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 40
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 83
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 84
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 86
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    .prologue
    .line 106
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 107
    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 108
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 110
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 48
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 49
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 51
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 63
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/i/v1/main/IIpcPref;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 64
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 65
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 66
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .prologue
    .line 90
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 92
    :try_start_0
    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 98
    :goto_0
    return p2

    .line 93
    :catch_0
    move-exception v1

    .line 95
    const/4 v1, 0x0

    :try_start_1
    invoke-interface {v0, p1, v1}, Lcom/qihoo360/i/v1/main/IIpcPref;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result p2

    goto :goto_0

    .line 97
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;J)J
    .locals 2

    .prologue
    .line 113
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 115
    :try_start_0
    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo360/i/v1/main/IIpcPref;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide p2

    .line 122
    :goto_0
    return-wide p2

    .line 116
    :catch_0
    move-exception v1

    .line 119
    const/4 v1, 0x0

    :try_start_1
    invoke-interface {v0, p1, v1}, Lcom/qihoo360/i/v1/main/IIpcPref;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 120
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide p2

    goto :goto_0

    .line 121
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;
    .locals 1

    .prologue
    .line 29
    if-eqz p0, :cond_0

    .line 30
    sget-object v0, Lcom/qihoo360/mobilesafe/share/d;->a:Lcom/qihoo360/mobilesafe/share/b;

    invoke-virtual {v0, p0}, Lcom/qihoo360/mobilesafe/share/b;->getSharedPreferences(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 32
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/share/d;->a:Lcom/qihoo360/mobilesafe/share/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/share/b;->getDefaultSharedPreferences()Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    goto :goto_0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 55
    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 43
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 44
    invoke-interface {v0, p1}, Lcom/qihoo360/i/v1/main/IIpcPref;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 69
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;)Lcom/qihoo360/i/v1/main/IIpcPref;

    move-result-object v0

    .line 71
    :try_start_0
    invoke-interface {v0, p1, p2}, Lcom/qihoo360/i/v1/main/IIpcPref;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p2

    .line 77
    :goto_0
    return p2

    .line 72
    :catch_0
    move-exception v1

    .line 74
    const/4 v1, 0x0

    :try_start_1
    invoke-interface {v0, p1, v1}, Lcom/qihoo360/i/v1/main/IIpcPref;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result p2

    goto :goto_0

    .line 76
    :catch_1
    move-exception v0

    goto :goto_0
.end method
