.class final Lcom/a/a/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/a/a/b/a;

.field private final c:Lb/a/a/a/a/b/t;

.field private final d:Lb/a/a/a/a/g/f;

.field private final e:Lcom/a/a/b/b;

.field private final f:Lb/a/a/a/a/f/b;

.field private final g:Lb/a/a/a/a/b/m;

.field private final h:Lb/a/a/a/a/e/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/a/a/b/a;Lb/a/a/a/a/b/t;Lb/a/a/a/a/g/f;Lcom/a/a/b/b;Lb/a/a/a/a/f/b;Lb/a/a/a/a/b/m;Lb/a/a/a/a/e/g;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/a/a/b/c;->a:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/a/a/b/c;->b:Lcom/a/a/b/a;

    .line 39
    iput-object p3, p0, Lcom/a/a/b/c;->c:Lb/a/a/a/a/b/t;

    .line 40
    iput-object p4, p0, Lcom/a/a/b/c;->d:Lb/a/a/a/a/g/f;

    .line 41
    iput-object p5, p0, Lcom/a/a/b/c;->e:Lcom/a/a/b/b;

    .line 42
    iput-object p6, p0, Lcom/a/a/b/c;->f:Lb/a/a/a/a/f/b;

    .line 43
    iput-object p7, p0, Lcom/a/a/b/c;->g:Lb/a/a/a/a/b/m;

    .line 44
    iput-object p8, p0, Lcom/a/a/b/c;->h:Lb/a/a/a/a/e/g;

    .line 45
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    .line 51
    iget-object v0, p0, Lcom/a/a/b/c;->g:Lb/a/a/a/a/b/m;

    invoke-interface {v0}, Lb/a/a/a/a/b/m;->a()J

    move-result-wide v6

    .line 52
    iget-object v0, p0, Lcom/a/a/b/c;->d:Lb/a/a/a/a/g/f;

    iget v0, v0, Lb/a/a/a/a/g/f;->b:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    .line 54
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 56
    iget-object v2, p0, Lcom/a/a/b/c;->f:Lb/a/a/a/a/f/b;

    invoke-interface {v2}, Lb/a/a/a/a/f/b;->a()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "last_update_check"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 59
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 61
    add-long/2addr v0, v2

    .line 63
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Check for updates current time: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", next check time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    cmp-long v0, v6, v0

    if-ltz v0, :cond_0

    .line 68
    :try_start_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 70
    new-instance v0, Lb/a/a/a/a/b/h;

    invoke-direct {v0}, Lb/a/a/a/a/b/h;-><init>()V

    iget-object v0, p0, Lcom/a/a/b/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lb/a/a/a/a/b/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 71
    iget-object v0, p0, Lcom/a/a/b/c;->c:Lb/a/a/a/a/b/t;

    iget-object v1, p0, Lcom/a/a/b/c;->e:Lcom/a/a/b/b;

    iget-object v1, v1, Lcom/a/a/b/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Lb/a/a/a/a/b/t;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 74
    new-instance v0, Lcom/a/a/b/d;

    iget-object v1, p0, Lcom/a/a/b/c;->b:Lcom/a/a/b/a;

    iget-object v2, p0, Lcom/a/a/b/c;->b:Lcom/a/a/b/a;

    invoke-virtual {v2}, Lcom/a/a/b/a;->v()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.crashlytics.ApiEndpoint"

    invoke-static {v2, v3}, Lb/a/a/a/a/b/j;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/a/a/b/c;->d:Lb/a/a/a/a/g/f;

    iget-object v3, v3, Lb/a/a/a/a/g/f;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/a/a/b/c;->h:Lb/a/a/a/a/e/g;

    new-instance v5, Lcom/a/a/b/f;

    invoke-direct {v5}, Lcom/a/a/b/f;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/a/a/b/d;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;Lcom/a/a/b/f;)V

    .line 85
    iget-object v1, p0, Lcom/a/a/b/c;->e:Lcom/a/a/b/b;

    invoke-virtual {v0, v8, v9, v1}, Lcom/a/a/b/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/a/a/b/b;)Lcom/a/a/b/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    iget-object v0, p0, Lcom/a/a/b/c;->f:Lb/a/a/a/a/f/b;

    invoke-interface {v0}, Lb/a/a/a/a/f/b;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_update_check"

    invoke-interface {v0, v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 94
    :goto_0
    return-void

    .line 87
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/a/a/b/c;->f:Lb/a/a/a/a/f/b;

    invoke-interface {v1}, Lb/a/a/a/a/f/b;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "last_update_check"

    invoke-interface {v1, v2, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    throw v0

    .line 92
    :cond_0
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    goto :goto_0
.end method
