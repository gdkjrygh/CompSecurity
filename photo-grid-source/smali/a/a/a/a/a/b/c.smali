.class final La/a/a/a/a/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:La/a/a/a/a/f/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/b/c;->a:Landroid/content/Context;

    .line 37
    new-instance v0, La/a/a/a/a/f/d;

    const-string v1, "TwitterAdvertisingInfoPreferences"

    invoke-direct {v0, p1, v1}, La/a/a/a/a/f/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    .line 38
    return-void
.end method

.method static synthetic a(La/a/a/a/a/b/c;)La/a/a/a/a/b/b;
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, La/a/a/a/a/b/c;->b()La/a/a/a/a/b/b;

    move-result-object v0

    return-object v0
.end method

.method private a(La/a/a/a/a/b/b;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 82
    invoke-static {p1}, La/a/a/a/a/b/c;->b(La/a/a/a/a/b/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    iget-object v1, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    invoke-interface {v1}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "advertising_id"

    iget-object v3, p1, La/a/a/a/a/b/b;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "limit_ad_tracking_enabled"

    iget-boolean v3, p1, La/a/a/a/a/b/b;->b:Z

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0, v1}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    .line 94
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    iget-object v1, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    invoke-interface {v1}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "advertising_id"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "limit_ad_tracking_enabled"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0, v1}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    goto :goto_0
.end method

.method static synthetic a(La/a/a/a/a/b/c;La/a/a/a/a/b/b;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, La/a/a/a/a/b/c;->a(La/a/a/a/a/b/b;)V

    return-void
.end method

.method private b()La/a/a/a/a/b/b;
    .locals 2

    .prologue
    .line 117
    .line 2103
    new-instance v0, La/a/a/a/a/b/e;

    iget-object v1, p0, La/a/a/a/a/b/c;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, La/a/a/a/a/b/e;-><init>(Landroid/content/Context;)V

    .line 118
    invoke-interface {v0}, La/a/a/a/a/b/i;->a()La/a/a/a/a/b/b;

    move-result-object v0

    .line 120
    invoke-static {v0}, La/a/a/a/a/b/c;->b(La/a/a/a/a/b/b;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2107
    new-instance v0, La/a/a/a/a/b/f;

    iget-object v1, p0, La/a/a/a/a/b/c;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, La/a/a/a/a/b/f;-><init>(Landroid/content/Context;)V

    .line 122
    invoke-interface {v0}, La/a/a/a/a/b/i;->a()La/a/a/a/a/b/b;

    move-result-object v0

    .line 124
    invoke-static {v0}, La/a/a/a/a/b/c;->b(La/a/a/a/a/b/b;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 125
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 133
    :goto_0
    return-object v0

    .line 127
    :cond_0
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_0
.end method

.method private static b(La/a/a/a/a/b/b;)Z
    .locals 1

    .prologue
    .line 111
    if-eqz p0, :cond_0

    iget-object v0, p0, La/a/a/a/a/b/b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()La/a/a/a/a/b/b;
    .locals 4

    .prologue
    .line 50
    .line 1097
    iget-object v0, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "advertising_id"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1098
    iget-object v0, p0, La/a/a/a/a/b/c;->b:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "limit_ad_tracking_enabled"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 1099
    new-instance v0, La/a/a/a/a/b/b;

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/b;-><init>(Ljava/lang/String;Z)V

    .line 51
    invoke-static {v0}, La/a/a/a/a/b/c;->b(La/a/a/a/a/b/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 52
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 2068
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, La/a/a/a/a/b/d;

    invoke-direct {v2, p0, v0}, La/a/a/a/a/b/d;-><init>(La/a/a/a/a/b/c;La/a/a/a/a/b/b;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 59
    :goto_0
    return-object v0

    .line 57
    :cond_0
    invoke-direct {p0}, La/a/a/a/a/b/c;->b()La/a/a/a/a/b/b;

    move-result-object v0

    .line 58
    invoke-direct {p0, v0}, La/a/a/a/a/b/c;->a(La/a/a/a/a/b/b;)V

    goto :goto_0
.end method
