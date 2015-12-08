.class public final Lkik/android/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/a/b$a;
    }
.end annotation


# static fields
.field private static final f:Lorg/c/b;


# instance fields
.field a:Z

.field b:Z

.field c:Ljava/lang/String;

.field private final d:Lkik/android/a/a;

.field private final e:Ljava/util/Timer;

.field private g:Lcom/kik/g/i;

.field private h:Lcom/kik/g/i;

.field private i:Lcom/kik/g/f;

.field private j:Lcom/kik/d/a/a;

.field private k:Lkik/a/j/m;

.field private l:Lkik/a/e/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 108
    const-string v0, "MetricsWrapper"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/a/b;->f:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/kik/g/e;Lkik/a/e/v;Lcom/kik/g/e;ZLkik/android/util/ar;Lkik/a/e/q;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-boolean v4, p0, Lkik/android/a/b;->b:Z

    .line 117
    new-instance v0, Lkik/android/a/c;

    invoke-direct {v0, p0}, Lkik/android/a/c;-><init>(Lkik/android/a/b;)V

    iput-object v0, p0, Lkik/android/a/b;->g:Lcom/kik/g/i;

    .line 131
    new-instance v0, Lkik/android/a/d;

    invoke-direct {v0, p0}, Lkik/android/a/d;-><init>(Lkik/android/a/b;)V

    iput-object v0, p0, Lkik/android/a/b;->h:Lcom/kik/g/i;

    .line 143
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/a/b;->i:Lcom/kik/g/f;

    .line 145
    new-instance v0, Lkik/android/a/e;

    invoke-direct {v0, p0}, Lkik/android/a/e;-><init>(Lkik/android/a/b;)V

    iput-object v0, p0, Lkik/android/a/b;->j:Lcom/kik/d/a/a;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/a/b;->c:Ljava/lang/String;

    .line 160
    const-string v0, "client-metrics"

    invoke-interface {p8, v0}, Lkik/a/e/q;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 161
    const-string v1, "client-metrics"

    invoke-virtual {p1, v1, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    .line 162
    invoke-static {v1, v0}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 164
    new-instance v1, Lcom/kik/d/b;

    invoke-direct {v1, p2, v0, p6}, Lcom/kik/d/b;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    .line 165
    invoke-interface {p7}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 166
    new-instance v2, Lkik/android/a/a;

    iget-object v3, p0, Lkik/android/a/b;->j:Lcom/kik/d/a/a;

    invoke-direct {v2, v1, v3, v0}, Lkik/android/a/a;-><init>(Lcom/kik/d/a;Lcom/kik/d/a/a;Landroid/content/SharedPreferences;)V

    iput-object v2, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    .line 170
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 171
    const-wide/32 v2, 0xa4cb80

    const v1, 0x1499700

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v2, v0

    .line 173
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lkik/android/a/b;->e:Ljava/util/Timer;

    .line 174
    iget-object v0, p0, Lkik/android/a/b;->e:Ljava/util/Timer;

    new-instance v1, Lkik/android/a/b$a;

    invoke-direct {v1, p0, v4}, Lkik/android/a/b$a;-><init>(Lkik/android/a/b;B)V

    const-wide/32 v4, 0x1499700

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 176
    iput-object p4, p0, Lkik/android/a/b;->l:Lkik/a/e/v;

    .line 178
    iget-object v0, p0, Lkik/android/a/b;->i:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/a/b;->g:Lcom/kik/g/i;

    invoke-virtual {v0, p3, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 179
    iget-object v0, p0, Lkik/android/a/b;->i:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/a/b;->h:Lcom/kik/g/i;

    invoke-virtual {v0, p5, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 181
    return-void
.end method

.method static synthetic a(Lkik/android/a/b;)Lkik/android/a/a;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    return-object v0
.end method

.method static synthetic b(Lkik/android/a/b;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/a/b;->l:Lkik/a/e/v;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 272
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 274
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 192
    iget-object v0, p0, Lkik/android/a/b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/android/a/b;->a:Z

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lkik/android/a/b;->l:Lkik/a/e/v;

    const-string v1, "enc_metrics_anon_id"

    invoke-interface {v0, v1}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 197
    if-eqz v0, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 198
    iput-object v0, p0, Lkik/android/a/b;->c:Ljava/lang/String;

    .line 199
    iget-object v1, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    invoke-virtual {v1, v0}, Lkik/android/a/a;->c(Ljava/lang/String;)V

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 202
    :cond_1
    iget-boolean v0, p0, Lkik/android/a/b;->b:Z

    if-nez v0, :cond_0

    .line 204
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/a/b;->b:Z

    iget-object v0, p0, Lkik/android/a/b;->k:Lkik/a/j/m;

    const-string v1, "enc_metrics_anon_id"

    const-class v2, Lcom/kik/n/a/d/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/m;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/a/f;

    invoke-direct {v1, p0}, Lkik/android/a/f;-><init>(Lkik/android/a/b;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final a(Lkik/a/j/n;)V
    .locals 0

    .prologue
    .line 186
    check-cast p1, Lkik/a/j/m;

    iput-object p1, p0, Lkik/android/a/b;->k:Lkik/a/j/m;

    .line 187
    return-void
.end method

.method public final b()V
    .locals 5

    .prologue
    .line 257
    iget-object v0, p0, Lkik/android/a/b;->l:Lkik/a/e/v;

    const-string v1, "enc_metrics_anon_id"

    iget-object v2, p0, Lkik/android/a/b;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 259
    iget-object v0, p0, Lkik/android/a/b;->k:Lkik/a/j/m;

    const-string v1, "enc_metrics_anon_id"

    const/4 v2, 0x0

    new-instance v3, Lcom/kik/n/a/d/a;

    invoke-direct {v3}, Lcom/kik/n/a/d/a;-><init>()V

    iget-object v4, p0, Lkik/android/a/b;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/kik/n/a/d/a;->a(Ljava/lang/String;)Lcom/kik/n/a/d/a;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lkik/a/j/m;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    .line 261
    return-void
.end method

.method public final c()Lcom/kik/d/f;
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    return-object v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    invoke-virtual {v0}, Lkik/android/a/a;->d()V

    .line 284
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    invoke-virtual {v0}, Lkik/android/a/a;->e()V

    .line 289
    return-void
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    invoke-virtual {v0}, Lkik/android/a/a;->f()Z

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lkik/android/a/b;->d:Lkik/android/a/a;

    invoke-virtual {v0}, Lkik/android/a/a;->b()V

    .line 299
    iget-object v0, p0, Lkik/android/a/b;->i:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 300
    return-void
.end method
