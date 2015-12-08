.class final Lcom/kik/android/a$e;
.super Lcom/kik/android/a$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/android/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/android/a;

.field private e:Z

.field private final f:J

.field private g:Lcom/kik/android/a$f;

.field private h:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method protected constructor <init>(Lcom/kik/android/a;Lcom/kik/android/a$f;)V
    .locals 2

    .prologue
    .line 1067
    iput-object p1, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    .line 1068
    invoke-virtual {p2}, Lcom/kik/android/a$f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/kik/android/a$f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/kik/android/a$f;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    iget-object v0, p2, Lcom/kik/android/a$f;->b:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/kik/android/a$e;->b:Lorg/json/JSONObject;

    .line 1071
    iput-object p2, p0, Lcom/kik/android/a$e;->g:Lcom/kik/android/a$f;

    .line 1072
    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/kik/android/a$e;->f:J

    .line 1073
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 1082
    invoke-virtual {p0}, Lcom/kik/android/a$e;->d()Ljava/lang/String;

    move-result-object v0

    .line 1083
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/android/a$e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1085
    iget-object v1, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v1}, Lcom/kik/android/a;->a(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/kik/android/a$e;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/kik/android/a$e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    iget-object v1, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v1}, Lcom/kik/android/a;->g(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 1088
    :try_start_0
    iget-object v2, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/kik/android/a$e;->e:Z

    if-nez v2, :cond_0

    .line 1089
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/kik/android/a$e;->e:Z

    .line 1091
    iget-object v2, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v2}, Lcom/kik/android/a;->g(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    iget-object v0, p0, Lcom/kik/android/a$e;->g:Lcom/kik/android/a$f;

    invoke-virtual {p0}, Lcom/kik/android/a$e;->f()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/android/a$f;->a(Lorg/json/JSONObject;)V

    .line 1094
    iget-object v0, p0, Lcom/kik/android/a$e;->g:Lcom/kik/android/a$f;

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1096
    iget-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 1097
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 1099
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

.method public final b()V
    .locals 6

    .prologue
    .line 1105
    iget-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 1131
    :cond_0
    :goto_0
    return-void

    .line 1109
    :cond_1
    invoke-virtual {p0}, Lcom/kik/android/a$e;->d()Ljava/lang/String;

    move-result-object v0

    .line 1110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/android/a$e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1112
    iget-object v0, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->h(Lcom/kik/android/a;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v2, Lcom/kik/android/g;

    invoke-direct {v2, p0}, Lcom/kik/android/g;-><init>(Lcom/kik/android/a$e;)V

    iget-wide v4, p0, Lcom/kik/android/a$e;->f:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 1122
    iget-object v0, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->g(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v2

    monitor-enter v2

    .line 1123
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->g(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$e;

    .line 1125
    iget-object v3, p0, Lcom/kik/android/a$e;->a:Lcom/kik/android/a;

    invoke-static {v3}, Lcom/kik/android/a;->g(Lcom/kik/android/a;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1128
    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    .line 1129
    invoke-virtual {v0}, Lcom/kik/android/a$e;->c()V

    goto :goto_0

    .line 1126
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 1135
    iget-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 1136
    iget-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 1137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/android/a$e;->h:Ljava/util/concurrent/ScheduledFuture;

    .line 1139
    :cond_0
    return-void
.end method
