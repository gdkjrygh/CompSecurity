.class public Lcom/facebook/prefs/shared/a;
.super Ljava/lang/Object;
.source "AndroidSharedPreferencesHelper.java"


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/a;->a:Landroid/content/Context;

    .line 24
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, p1}, Lcom/facebook/prefs/shared/a;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 82
    if-eqz v1, :cond_0

    .line 83
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 84
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 86
    :cond_0
    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 50
    :goto_0
    return-object v0

    .line 33
    :catch_0
    move-exception v0

    .line 49
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/a;->b(Ljava/lang/String;)Z

    .line 50
    iget-object v0, p0, Lcom/facebook/prefs/shared/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 61
    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getSharedPrefsFile"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 66
    :try_start_1
    iget-object v2, p0, Lcom/facebook/prefs/shared/a;->a:Landroid/content/Context;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_3

    .line 72
    :goto_0
    return-object v0

    .line 62
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 63
    goto :goto_0

    .line 67
    :catch_1
    move-exception v0

    move-object v0, v1

    .line 68
    goto :goto_0

    .line 69
    :catch_2
    move-exception v0

    move-object v0, v1

    .line 70
    goto :goto_0

    .line 71
    :catch_3
    move-exception v0

    move-object v0, v1

    .line 72
    goto :goto_0
.end method
