.class Lcom/jirbo/adcolony/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final a:I = 0x5

.field public static final b:I = 0xa

.field static c:Ljava/lang/String;

.field static volatile d:Lcom/jirbo/adcolony/p;

.field static volatile e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 13
    const-string v0, "MONITOR_MUTEX"

    sput-object v0, Lcom/jirbo/adcolony/p;->c:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    return-void
.end method

.method static a()V
    .locals 4

    .prologue
    .line 20
    sget-object v1, Lcom/jirbo/adcolony/p;->c:Ljava/lang/String;

    monitor-enter v1

    .line 22
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lcom/jirbo/adcolony/p;->e:J

    .line 23
    sget-object v0, Lcom/jirbo/adcolony/p;->d:Lcom/jirbo/adcolony/p;

    if-nez v0, :cond_0

    .line 25
    const-string v0, "Creating ADC Monitor singleton."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->b(Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/jirbo/adcolony/p;

    invoke-direct {v0}, Lcom/jirbo/adcolony/p;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/p;->d:Lcom/jirbo/adcolony/p;

    .line 27
    new-instance v0, Ljava/lang/Thread;

    sget-object v2, Lcom/jirbo/adcolony/p;->d:Lcom/jirbo/adcolony/p;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method a(J)V
    .locals 1

    .prologue
    .line 105
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public run()V
    .locals 13

    .prologue
    const/4 v12, 0x5

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 34
    sget v0, Lcom/jirbo/adcolony/a;->n:I

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(I)V

    .line 36
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "ADC Monitor Started."

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 37
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->b()V

    move v0, v1

    .line 41
    :cond_0
    :goto_0
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_5

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 45
    sput-boolean v1, Lcom/jirbo/adcolony/a;->r:Z

    .line 46
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/d;->g()V

    .line 47
    sget-boolean v2, Lcom/jirbo/adcolony/a;->r:Z

    if-eqz v2, :cond_2

    const-wide/16 v2, 0x32

    .line 49
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 50
    sget-wide v10, Lcom/jirbo/adcolony/p;->e:J

    sub-long/2addr v8, v10

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    long-to-int v5, v8

    .line 52
    sget-object v8, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v8}, Lcom/jirbo/adcolony/d;->g()V

    .line 54
    if-eqz v0, :cond_4

    .line 56
    const/16 v8, 0xa

    if-ge v5, v8, :cond_5

    .line 57
    if-ge v5, v12, :cond_1

    .line 60
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->b()V

    .line 61
    const-string v0, "AdColony is active."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->b(Ljava/lang/String;)V

    move v0, v1

    .line 74
    :cond_1
    :goto_2
    invoke-virtual {p0, v2, v3}, Lcom/jirbo/adcolony/p;->a(J)V

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 76
    sub-long v8, v2, v6

    const-wide/16 v10, 0xbb8

    cmp-long v5, v8, v10

    if-gtz v5, :cond_0

    sub-long v8, v2, v6

    const-wide/16 v10, 0x0

    cmp-long v5, v8, v10

    if-lez v5, :cond_0

    .line 77
    sget-object v5, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v5, v5, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-wide v8, v5, Lcom/jirbo/adcolony/v;->h:D

    sub-long/2addr v2, v6

    long-to-double v2, v2

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v6

    add-double/2addr v2, v8

    iput-wide v2, v5, Lcom/jirbo/adcolony/v;->h:D

    goto :goto_0

    .line 47
    :cond_2
    if-eqz v0, :cond_3

    const/16 v2, 0x7d0

    :goto_3
    int-to-long v2, v2

    goto :goto_1

    :cond_3
    const/16 v2, 0xfa

    goto :goto_3

    .line 66
    :cond_4
    if-lt v5, v12, :cond_1

    .line 68
    const-string v0, "AdColony is idle."

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->b(Ljava/lang/String;)V

    .line 70
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->c()V

    move v0, v4

    goto :goto_2

    .line 80
    :cond_5
    sget-object v1, Lcom/jirbo/adcolony/p;->c:Ljava/lang/String;

    monitor-enter v1

    .line 82
    const/4 v2, 0x0

    :try_start_0
    sput-object v2, Lcom/jirbo/adcolony/p;->d:Lcom/jirbo/adcolony/p;

    .line 83
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    if-nez v0, :cond_6

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->c()V

    .line 87
    :cond_6
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 89
    sput-boolean v4, Lcom/jirbo/adcolony/a;->s:Z

    .line 90
    const-wide/16 v0, 0x1388

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/p;->a(J)V

    .line 91
    sget-boolean v0, Lcom/jirbo/adcolony/a;->s:Z

    if-eqz v0, :cond_7

    .line 93
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "ADC.finishing, controller on_stop"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 94
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/d;->d()V

    .line 95
    invoke-static {}, Lcom/jirbo/adcolony/aa;->a()V

    .line 98
    :cond_7
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Exiting monitor"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 99
    return-void

    .line 83
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
