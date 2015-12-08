.class final Lkik/android/chat/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lkik/a/b/a/a$c;

.field final synthetic c:Lkik/android/chat/z;


# direct methods
.method constructor <init>(Lkik/android/chat/z;JLkik/a/b/a/a$c;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lkik/android/chat/aa;->c:Lkik/android/chat/z;

    iput-wide p2, p0, Lkik/android/chat/aa;->a:J

    iput-object p4, p0, Lkik/android/chat/aa;->b:Lkik/a/b/a/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/high16 v9, 0x447a0000    # 1000.0f

    .line 291
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    .line 292
    invoke-static {}, Lkik/a/h/j;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 293
    iget-wide v2, p0, Lkik/android/chat/aa;->a:J

    iget-object v1, p0, Lkik/android/chat/aa;->b:Lkik/a/b/a/a$c;

    iget-wide v4, v1, Lkik/a/b/a/a$c;->b:J

    sub-long v4, v2, v4

    .line 295
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 296
    iget-object v0, p0, Lkik/android/chat/aa;->c:Lkik/android/chat/z;

    iget-object v0, v0, Lkik/android/chat/z;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$f;->a:Lcom/kik/d/b/a$f;

    iget-object v2, p0, Lkik/android/chat/aa;->b:Lkik/a/b/a/a$c;

    iget-object v2, v2, Lkik/a/b/a/a$c;->a:Ljava/lang/String;

    const-string v3, "t"

    const-string v6, "ctime"

    const-string v7, "true"

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual/range {v0 .. v9}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V

    .line 307
    :goto_0
    return-void

    .line 300
    :cond_0
    iget-object v0, p0, Lkik/android/chat/aa;->c:Lkik/android/chat/z;

    iget-object v0, v0, Lkik/android/chat/z;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$f;->a:Lcom/kik/d/b/a$f;

    iget-object v2, p0, Lkik/android/chat/aa;->b:Lkik/a/b/a/a$c;

    iget-object v2, v2, Lkik/a/b/a/a$c;->a:Ljava/lang/String;

    const-string v3, "t"

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    invoke-virtual/range {v0 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 304
    iget-object v0, p0, Lkik/android/chat/aa;->c:Lkik/android/chat/z;

    iget-object v0, v0, Lkik/android/chat/z;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "95% Message Send Time"

    long-to-float v2, v4

    div-float/2addr v2, v9

    const v3, 0x3f733333    # 0.95f

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    .line 305
    iget-object v0, p0, Lkik/android/chat/aa;->c:Lkik/android/chat/z;

    iget-object v0, v0, Lkik/android/chat/z;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "50% Message Send Time"

    long-to-float v2, v4

    div-float/2addr v2, v9

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    goto :goto_0
.end method
