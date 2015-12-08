.class final Lb/a/a/a/a/g/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/g/s;


# instance fields
.field private final a:Lb/a/a/a/a/g/w;

.field private final b:Lb/a/a/a/a/g/v;

.field private final c:Lb/a/a/a/a/b/m;

.field private final d:Lb/a/a/a/a/g/g;

.field private final e:Lb/a/a/a/a/g/x;

.field private final f:Lb/a/a/a/l;

.field private final g:Lb/a/a/a/a/f/b;


# direct methods
.method public constructor <init>(Lb/a/a/a/l;Lb/a/a/a/a/g/w;Lb/a/a/a/a/b/m;Lb/a/a/a/a/g/v;Lb/a/a/a/a/g/g;Lb/a/a/a/a/g/x;)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lb/a/a/a/a/g/j;->f:Lb/a/a/a/l;

    .line 55
    iput-object p2, p0, Lb/a/a/a/a/g/j;->a:Lb/a/a/a/a/g/w;

    .line 56
    iput-object p3, p0, Lb/a/a/a/a/g/j;->c:Lb/a/a/a/a/b/m;

    .line 57
    iput-object p4, p0, Lb/a/a/a/a/g/j;->b:Lb/a/a/a/a/g/v;

    .line 58
    iput-object p5, p0, Lb/a/a/a/a/g/j;->d:Lb/a/a/a/a/g/g;

    .line 59
    iput-object p6, p0, Lb/a/a/a/a/g/j;->e:Lb/a/a/a/a/g/x;

    .line 60
    new-instance v0, Lb/a/a/a/a/f/c;

    iget-object v1, p0, Lb/a/a/a/a/g/j;->f:Lb/a/a/a/l;

    invoke-direct {v0, v1}, Lb/a/a/a/a/f/c;-><init>(Lb/a/a/a/l;)V

    iput-object v0, p0, Lb/a/a/a/a/g/j;->g:Lb/a/a/a/a/f/b;

    .line 61
    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 143
    iget-object v0, p0, Lb/a/a/a/a/g/j;->f:Lb/a/a/a/l;

    invoke-virtual {v0}, Lb/a/a/a/l;->v()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb/a/a/a/a/b/j;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    iget-object v0, p0, Lb/a/a/a/a/g/j;->b:Lb/a/a/a/a/g/v;

    invoke-interface {v0, p1}, Lb/a/a/a/a/g/v;->a(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    .line 147
    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    return-void
.end method

.method private b(Lb/a/a/a/a/g/r;)Lb/a/a/a/a/g/t;
    .locals 7

    .prologue
    .line 105
    const/4 v0, 0x0

    .line 108
    :try_start_0
    sget-object v1, Lb/a/a/a/a/g/r;->b:Lb/a/a/a/a/g/r;

    invoke-virtual {v1, p1}, Lb/a/a/a/a/g/r;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 109
    iget-object v1, p0, Lb/a/a/a/a/g/j;->d:Lb/a/a/a/a/g/g;

    invoke-interface {v1}, Lb/a/a/a/a/g/g;->a()Lorg/json/JSONObject;

    move-result-object v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    iget-object v1, p0, Lb/a/a/a/a/g/j;->b:Lb/a/a/a/a/g/v;

    iget-object v3, p0, Lb/a/a/a/a/g/j;->c:Lb/a/a/a/a/b/m;

    invoke-interface {v1, v3, v2}, Lb/a/a/a/a/g/v;->a(Lb/a/a/a/a/b/m;Lorg/json/JSONObject;)Lb/a/a/a/a/g/t;

    move-result-object v1

    .line 115
    const-string v3, "Loaded cached settings: "

    invoke-direct {p0, v2, v3}, Lb/a/a/a/a/g/j;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 118
    iget-object v2, p0, Lb/a/a/a/a/g/j;->c:Lb/a/a/a/a/b/m;

    invoke-interface {v2}, Lb/a/a/a/a/b/m;->a()J

    move-result-wide v2

    .line 120
    sget-object v4, Lb/a/a/a/a/g/r;->c:Lb/a/a/a/a/g/r;

    invoke-virtual {v4, p1}, Lb/a/a/a/a/g/r;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-wide v4, v1, Lb/a/a/a/a/g/t;->g:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v2, v4, v2

    if-gez v2, :cond_2

    const/4 v2, 0x1

    :goto_0
    if-nez v2, :cond_3

    .line 123
    :cond_0
    :try_start_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    .line 139
    :cond_1
    :goto_1
    return-object v0

    .line 120
    :cond_2
    const/4 v2, 0x0

    goto :goto_0

    .line 125
    :cond_3
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 135
    :catch_0
    move-exception v1

    .line 136
    :goto_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed to get cached settings"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 132
    :cond_4
    :try_start_3
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 135
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_2
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 151
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lb/a/a/a/a/g/j;->f:Lb/a/a/a/l;

    invoke-virtual {v2}, Lb/a/a/a/l;->v()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lb/a/a/a/a/b/j;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lb/a/a/a/a/b/j;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Lb/a/a/a/a/g/t;
    .locals 1

    .prologue
    .line 64
    sget-object v0, Lb/a/a/a/a/g/r;->a:Lb/a/a/a/a/g/r;

    invoke-virtual {p0, v0}, Lb/a/a/a/a/g/j;->a(Lb/a/a/a/a/g/r;)Lb/a/a/a/a/g/t;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lb/a/a/a/a/g/r;)Lb/a/a/a/a/g/t;
    .locals 7

    .prologue
    .line 68
    const/4 v1, 0x0

    .line 75
    :try_start_0
    invoke-static {}, Lb/a/a/a/d;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/a/a/a/a/g/j;->g:Lb/a/a/a/a/f/b;

    invoke-interface {v0}, Lb/a/a/a/a/f/b;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "existing_instance_identifier"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lb/a/a/a/a/g/j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_0

    .line 76
    invoke-direct {p0, p1}, Lb/a/a/a/a/g/j;->b(Lb/a/a/a/a/g/r;)Lb/a/a/a/a/g/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 79
    :cond_0
    if-nez v1, :cond_1

    .line 80
    :try_start_1
    iget-object v0, p0, Lb/a/a/a/a/g/j;->e:Lb/a/a/a/a/g/x;

    iget-object v2, p0, Lb/a/a/a/a/g/j;->a:Lb/a/a/a/a/g/w;

    invoke-interface {v0, v2}, Lb/a/a/a/a/g/x;->a(Lb/a/a/a/a/g/w;)Lorg/json/JSONObject;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    iget-object v2, p0, Lb/a/a/a/a/g/j;->b:Lb/a/a/a/a/g/v;

    iget-object v3, p0, Lb/a/a/a/a/g/j;->c:Lb/a/a/a/a/b/m;

    invoke-interface {v2, v3, v0}, Lb/a/a/a/a/g/v;->a(Lb/a/a/a/a/b/m;Lorg/json/JSONObject;)Lb/a/a/a/a/g/t;

    move-result-object v1

    .line 85
    iget-object v2, p0, Lb/a/a/a/a/g/j;->d:Lb/a/a/a/a/g/g;

    iget-wide v4, v1, Lb/a/a/a/a/g/t;->g:J

    invoke-interface {v2, v4, v5, v0}, Lb/a/a/a/a/g/g;->a(JLorg/json/JSONObject;)V

    .line 86
    const-string v2, "Loaded settings: "

    invoke-direct {p0, v0, v2}, Lb/a/a/a/a/g/j;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 89
    invoke-direct {p0}, Lb/a/a/a/a/g/j;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lb/a/a/a/a/g/j;->g:Lb/a/a/a/a/f/b;

    invoke-interface {v2}, Lb/a/a/a/a/f/b;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "existing_instance_identifier"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lb/a/a/a/a/g/j;->g:Lb/a/a/a/a/f/b;

    invoke-interface {v0, v2}, Lb/a/a/a/a/f/b;->a(Landroid/content/SharedPreferences$Editor;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    move-object v0, v1

    .line 94
    if-nez v0, :cond_2

    .line 95
    :try_start_2
    sget-object v1, Lb/a/a/a/a/g/r;->c:Lb/a/a/a/a/g/r;

    invoke-direct {p0, v1}, Lb/a/a/a/a/g/j;->b(Lb/a/a/a/a/g/r;)Lb/a/a/a/a/g/t;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 101
    :cond_2
    :goto_1
    return-object v0

    .line 75
    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    .line 98
    :catch_0
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    .line 99
    :goto_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 98
    :catch_1
    move-exception v0

    move-object v6, v0

    move-object v0, v1

    move-object v1, v6

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_2
.end method
