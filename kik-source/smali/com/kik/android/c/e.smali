.class public Lcom/kik/android/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/android/c/e$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Z

.field private g:J


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p2, p0, Lcom/kik/android/c/e;->d:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lcom/kik/android/c/e;->a:Ljava/lang/String;

    .line 47
    iput-object p3, p0, Lcom/kik/android/c/e;->b:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/kik/android/c/e;->c:Ljava/lang/String;

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/android/c/e;->f:Z

    .line 50
    iput-wide p5, p0, Lcom/kik/android/c/e;->g:J

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/android/c/e;->e:Z

    .line 52
    return-void
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;
    .locals 8

    .prologue
    .line 35
    new-instance v1, Lcom/kik/android/c/e;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/kik/android/c/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1
.end method

.method private static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 162
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "https://kik-shop-dev.herokuapp.com/#"

    .line 166
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "https://my.kik.com/#"

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 114
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 116
    :try_start_0
    const-string v1, "smiley_id"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/kik/android/c/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 126
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 128
    :try_start_0
    const-string v1, "type"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/kik/android/c/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public b()Lcom/kik/n/a/j/c;
    .locals 4

    .prologue
    .line 66
    new-instance v0, Lcom/kik/n/a/j/c;

    invoke-direct {v0}, Lcom/kik/n/a/j/c;-><init>()V

    .line 68
    iget-object v1, p0, Lcom/kik/android/c/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/j/c;->b(Ljava/lang/String;)Lcom/kik/n/a/j/c;

    .line 69
    iget-wide v2, p0, Lcom/kik/android/c/e;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/j/c;->a(Ljava/lang/Long;)Lcom/kik/n/a/j/c;

    .line 70
    iget-object v1, p0, Lcom/kik/android/c/e;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/j/c;->d(Ljava/lang/String;)Lcom/kik/n/a/j/c;

    .line 71
    iget-object v1, p0, Lcom/kik/android/c/e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/j/c;->a(Ljava/lang/String;)Lcom/kik/n/a/j/c;

    .line 72
    iget-object v1, p0, Lcom/kik/android/c/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/n/a/j/c;->c(Ljava/lang/String;)Lcom/kik/n/a/j/c;

    .line 74
    return-object v0
.end method

.method final c()V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/android/c/e;->e:Z

    .line 62
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/kik/android/c/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/kik/android/c/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/kik/android/c/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/kik/android/c/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 104
    iget-boolean v0, p0, Lcom/kik/android/c/e;->e:Z

    return v0
.end method

.method public final i()J
    .locals 2

    .prologue
    .line 109
    iget-wide v0, p0, Lcom/kik/android/c/e;->g:J

    return-wide v0
.end method
