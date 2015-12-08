.class public Lcom/kik/android/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/android/a$e;,
        Lcom/kik/android/a$h;,
        Lcom/kik/android/a$g;,
        Lcom/kik/android/a$f;,
        Lcom/kik/android/a$d;,
        Lcom/kik/android/a$b;,
        Lcom/kik/android/a$a;,
        Lcom/kik/android/a$c;
    }
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field private static final c:Lorg/c/b;


# instance fields
.field private final d:Lkik/a/j/m;

.field private final e:Lkik/a/e/f;

.field private final f:Lcom/kik/g/f;

.field private final g:Lkik/a/e/w;

.field private h:Lcom/mixpanel/android/mpmetrics/v;

.field private i:Lcom/kik/c/b;

.field private j:Z

.field private k:D

.field private l:Ljava/util/concurrent/ScheduledExecutorService;

.field private m:Z

.field private n:Ljava/util/List;

.field private o:Landroid/content/SharedPreferences;

.field private p:Ljava/util/concurrent/ScheduledExecutorService;

.field private q:Ljava/util/Map;

.field private r:Ljava/util/Map;

.field private s:Ljava/util/Map;

.field private t:Ljava/util/Map;

.field private u:Lorg/json/JSONObject;

.field private v:Ljava/util/Map;

.field private w:Lkik/a/e/v;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 57
    const-class v0, Lcom/kik/android/a;

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/Class;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/android/a;->c:Lorg/c/b;

    .line 639
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "Wi-Fi Only"

    aput-object v1, v0, v2

    const-string v1, "Wi-Fi and Cellular"

    aput-object v1, v0, v3

    const-string v1, "Never"

    aput-object v1, v0, v4

    sput-object v0, Lcom/kik/android/a;->a:[Ljava/lang/String;

    .line 642
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "Wi-Fi Only"

    aput-object v1, v0, v2

    const-string v1, "Wi-Fi and Cellular"

    aput-object v1, v0, v3

    const-string v1, "Never Play Videos Automatically"

    aput-object v1, v0, v4

    sput-object v0, Lcom/kik/android/a;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/mixpanel/android/mpmetrics/v;Lkik/a/j/m;Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/w;Landroid/content/SharedPreferences;Lcom/kik/c/b;)V
    .locals 3

    .prologue
    .line 1143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    const-wide v0, 0x3fb999999999999aL    # 0.1

    iput-wide v0, p0, Lcom/kik/android/a;->k:D

    .line 86
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/a;->l:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1144
    iput-object p1, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    .line 1145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    .line 1146
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    .line 1147
    iput-object p6, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    .line 1148
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/android/a;->p:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1149
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    .line 1150
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    .line 1151
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/android/a;->m:Z

    .line 1152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->n:Ljava/util/List;

    .line 1153
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    .line 1154
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    .line 1155
    iput-object p2, p0, Lcom/kik/android/a;->d:Lkik/a/j/m;

    .line 1156
    iput-object p3, p0, Lcom/kik/android/a;->e:Lkik/a/e/f;

    .line 1157
    iput-object p4, p0, Lcom/kik/android/a;->w:Lkik/a/e/v;

    .line 1158
    iput-object p5, p0, Lcom/kik/android/a;->g:Lkik/a/e/w;

    .line 1159
    iput-object p7, p0, Lcom/kik/android/a;->i:Lcom/kik/c/b;

    .line 1161
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->f:Lcom/kik/g/f;

    .line 1163
    iget-object v0, p0, Lcom/kik/android/a;->f:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/android/a;->e:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lcom/kik/android/b;

    invoke-direct {v2, p0}, Lcom/kik/android/b;-><init>(Lcom/kik/android/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 1171
    invoke-direct {p0}, Lcom/kik/android/a;->f()V

    .line 1173
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.SuperProperties"

    const-string v2, "{}"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    iget-object v2, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1175
    :goto_0
    invoke-direct {p0}, Lcom/kik/android/a;->h()V

    .line 1176
    invoke-direct {p0}, Lcom/kik/android/a;->j()V

    .line 1177
    return-void

    .line 1173
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/kik/android/a;->c:Lorg/c/b;

    const-string v2, "Failed to load super properties for mixpanel"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/android/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/android/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/kik/android/a;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/android/a;Z)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/kik/android/a;->b(Z)V

    return-void
.end method

.method private a(ZZ)V
    .locals 6

    .prologue
    .line 1832
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1

    .line 1833
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/android/a;->z:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/kik/android/a;->z:Z

    .line 1835
    iget-boolean v0, p0, Lcom/kik/android/a;->z:Z

    if-nez v0, :cond_0

    .line 1836
    monitor-exit v1

    .line 1853
    :goto_0
    return-void

    .line 1839
    :cond_0
    if-nez p1, :cond_1

    .line 1840
    iget-object v0, p0, Lcom/kik/android/a;->l:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/kik/android/d;

    invoke-direct {v2, p0}, Lcom/kik/android/d;-><init>(Lcom/kik/android/a;)V

    const-wide/16 v4, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1847
    monitor-exit v1

    goto :goto_0

    .line 1853
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1850
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "Mixpanel.SuperProperties"

    iget-object v3, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1852
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/android/a;->z:Z

    .line 1853
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;J)Lcom/kik/android/a;
    .locals 4

    .prologue
    .line 1616
    :try_start_0
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1617
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1618
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1621
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1622
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1624
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1630
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1632
    return-object p0

    .line 1622
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1541
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "Super Property "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1542
    return-void

    .line 1541
    :cond_0
    const-string v0, "(Unsampled) "

    goto :goto_0
.end method

.method private b(Z)V
    .locals 3

    .prologue
    .line 1213
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.IsFirstAccount"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1215
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.IsFirstAccount"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 1216
    const-string v0, "Is First Account"

    invoke-virtual {p0, v0, p1}, Lcom/kik/android/a;->c(Ljava/lang/String;Z)Lcom/kik/android/a;

    .line 1221
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Mixpanel.IsFirstAccount"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1224
    return-void
.end method

.method private b(ZZ)V
    .locals 7

    .prologue
    .line 1891
    iget-object v2, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    monitor-enter v2

    .line 1892
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/android/a;->x:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/kik/android/a;->x:Z

    .line 1894
    iget-boolean v0, p0, Lcom/kik/android/a;->x:Z

    if-nez v0, :cond_0

    .line 1895
    monitor-exit v2

    .line 1949
    :goto_0
    return-void

    .line 1898
    :cond_0
    if-nez p1, :cond_1

    .line 1899
    iget-object v0, p0, Lcom/kik/android/a;->l:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/kik/android/e;

    invoke-direct {v1, p0}, Lcom/kik/android/e;-><init>(Lcom/kik/android/a;)V

    const-wide/16 v4, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1906
    monitor-exit v2

    goto :goto_0

    .line 1949
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1909
    :cond_1
    :try_start_1
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1912
    :try_start_2
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1914
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1916
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1917
    iget-object v1, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/a$d;

    .line 1919
    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 1920
    iget-object v0, v1, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1922
    iget-object v0, v1, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$b;

    .line 1923
    iget v6, v0, Lcom/kik/android/a$b;->b:I

    invoke-virtual {v4, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1924
    iget-object v6, v0, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1926
    iget-object v0, v0, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 1927
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 1934
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1939
    :goto_2
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 1940
    iget-object v1, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "Mixpanel.PeriodDataNew"

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1948
    :goto_3
    const/4 v0, 0x0

    :try_start_5
    iput-boolean v0, p0, Lcom/kik/android/a;->x:Z

    .line 1949
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    .line 1932
    :cond_4
    :try_start_6
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    .line 1942
    :catch_1
    move-exception v0

    :try_start_7
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_3
.end method

.method static synthetic b(Lcom/kik/android/a;)Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Lcom/kik/android/a;->m:Z

    return v0
.end method

.method private static b(Ljava/lang/String;D)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1352
    :try_start_0
    const-string v2, "SHA-1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 1354
    const-string v3, "UTF-8"

    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    .line 1356
    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 1357
    const/16 v2, 0x10

    invoke-virtual {v3, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 1358
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x8

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;I)Ljava/lang/Long;

    move-result-object v2

    .line 1360
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, 0x5f5e100

    rem-long/2addr v2, v4
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double v2, v2

    const-wide v4, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v4, p1

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_0

    :goto_0
    move v1, v0

    .line 1369
    :goto_1
    return v1

    :cond_0
    move v0, v1

    .line 1360
    goto :goto_0

    .line 1366
    :catch_0
    move-exception v0

    goto :goto_1

    .line 1363
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method static synthetic c(Lcom/kik/android/a;)Ljava/util/List;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->n:Ljava/util/List;

    return-object v0
.end method

.method private c(ZZ)V
    .locals 6

    .prologue
    .line 2051
    iget-object v2, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    monitor-enter v2

    .line 2052
    :try_start_0
    iget-boolean v0, p0, Lcom/kik/android/a;->y:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/kik/android/a;->y:Z

    .line 2054
    iget-boolean v0, p0, Lcom/kik/android/a;->y:Z

    if-nez v0, :cond_0

    .line 2055
    monitor-exit v2

    .line 2083
    :goto_0
    return-void

    .line 2058
    :cond_0
    if-nez p1, :cond_1

    .line 2059
    iget-object v0, p0, Lcom/kik/android/a;->l:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/kik/android/f;

    invoke-direct {v1, p0}, Lcom/kik/android/f;-><init>(Lcom/kik/android/a;)V

    const-wide/16 v4, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v4, v5, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 2066
    monitor-exit v2

    goto :goto_0

    .line 2083
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 2070
    :cond_1
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 2072
    iget-object v0, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2073
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v5, Lorg/json/JSONArray;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 2078
    :catch_0
    move-exception v0

    .line 2079
    :try_start_2
    sget-object v1, Lcom/kik/android/a;->c:Lorg/c/b;

    const-string v3, "Failed to save datapoints for mixpanel"

    invoke-interface {v1, v3, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2082
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/android/a;->y:Z

    .line 2083
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 2076
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Mixpanel.Datapoints"

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2
.end method

.method static synthetic d(Lcom/kik/android/a;)Lcom/mixpanel/android/mpmetrics/v;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1233
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Mixpanel.UserId"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1234
    return-void
.end method

.method private e(Ljava/lang/String;)Lcom/kik/android/a;
    .locals 2

    .prologue
    .line 1717
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1

    .line 1718
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1719
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/v;->b(Ljava/lang/String;)V

    .line 1722
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 1723
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1725
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V

    .line 1727
    return-object p0

    .line 1723
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic e()Lorg/c/b;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/kik/android/a;->c:Lorg/c/b;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/android/a;)Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    return-object v0
.end method

.method static synthetic f(Lcom/kik/android/a;)Lcom/kik/c/b;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->i:Lcom/kik/c/b;

    return-object v0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 1186
    iget-object v0, p0, Lcom/kik/android/a;->w:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1187
    iget-object v0, p0, Lcom/kik/android/a;->d:Lkik/a/j/m;

    const-string v1, "enc_mixpanel_metrics"

    const-class v2, Lcom/kik/n/a/h/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/m;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/android/c;

    invoke-direct {v1, p0}, Lcom/kik/android/c;-><init>(Lcom/kik/android/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 1209
    :goto_0
    return-void

    .line 1207
    :cond_0
    invoke-direct {p0}, Lcom/kik/android/a;->g()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/kik/android/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    return-object v0
.end method

.method private g()V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 1238
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.UserId"

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1241
    if-nez v0, :cond_0

    .line 1243
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1248
    invoke-direct {p0, v0}, Lcom/kik/android/a;->d(Ljava/lang/String;)V

    .line 1251
    :cond_0
    iget-object v1, p0, Lcom/kik/android/a;->w:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1252
    new-instance v1, Lcom/kik/n/a/h/a;

    invoke-direct {v1}, Lcom/kik/n/a/h/a;-><init>()V

    .line 1254
    iget-object v2, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v3, "Mixpanel.IsFirstAccount"

    invoke-interface {v2, v3, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/n/a/h/a;->a(Ljava/lang/Boolean;)Lcom/kik/n/a/h/a;

    .line 1255
    invoke-virtual {v1, v0}, Lcom/kik/n/a/h/a;->a(Ljava/lang/String;)Lcom/kik/n/a/h/a;

    .line 1257
    iget-object v2, p0, Lcom/kik/android/a;->d:Lkik/a/j/m;

    const-string v3, "enc_mixpanel_metrics"

    const-wide/16 v4, 0x1388

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v3, v7, v1, v4}, Lkik/a/j/m;->a(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    .line 1259
    invoke-virtual {p0, v0, v6}, Lcom/kik/android/a;->a(Ljava/lang/String;Z)V

    .line 1268
    :goto_0
    return-void

    .line 1262
    :cond_1
    iget-object v1, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v2, "Mixpanel.IsFirstAccount"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1263
    invoke-direct {p0, v6}, Lcom/kik/android/a;->b(Z)V

    .line 1266
    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method static synthetic h(Lcom/kik/android/a;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/kik/android/a;->p:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method private h()V
    .locals 8

    .prologue
    .line 1859
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.Datapoints"

    const-string v2, "{}"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1860
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1862
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 1864
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1865
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1867
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 1868
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1870
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v1, v6, :cond_0

    .line 1871
    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v6

    double-to-float v6, v6

    .line 1873
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1870
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1876
    :cond_0
    iget-object v1, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1879
    :catch_0
    move-exception v0

    .line 1880
    sget-object v1, Lcom/kik/android/a;->c:Lorg/c/b;

    const-string v2, "Failed to load datapoints for mixpanel"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1882
    :cond_1
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    .line 1886
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->b(ZZ)V

    .line 1887
    return-void
.end method

.method static synthetic i(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/kik/android/a;->f()V

    return-void
.end method

.method private j()V
    .locals 14

    .prologue
    const/4 v1, 0x0

    .line 1954
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v2, "Mixpanel.PeriodDataNew"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1956
    if-eqz v0, :cond_3

    .line 1957
    iget-object v4, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    monitor-enter v4

    .line 1958
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/kik/android/a;->v:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1961
    :try_start_1
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1962
    new-instance v5, Ljava/io/DataInputStream;

    invoke-direct {v5, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 1964
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v6

    move v3, v1

    .line 1966
    :goto_0
    if-ge v3, v6, :cond_2

    .line 1967
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v7

    .line 1968
    new-instance v8, Lcom/kik/android/a$d;

    invoke-direct {v8}, Lcom/kik/android/a$d;-><init>()V

    .line 1970
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v9

    move v2, v1

    .line 1972
    :goto_1
    if-ge v2, v9, :cond_1

    .line 1973
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 1974
    new-instance v10, Lcom/kik/android/a$b;

    invoke-direct {v10, v0}, Lcom/kik/android/a$b;-><init>(I)V

    .line 1976
    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v11

    move v0, v1

    .line 1978
    :goto_2
    if-ge v0, v11, :cond_0

    .line 1979
    iget-object v12, v10, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    invoke-virtual {v5}, Ljava/io/DataInputStream;->readInt()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1978
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1982
    :cond_0
    iget-object v0, v8, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1972
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 1985
    :cond_1
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1966
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 1988
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 1991
    :cond_2
    monitor-exit v4

    .line 1996
    :goto_3
    return-void

    .line 1991
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1994
    :cond_3
    invoke-direct {p0}, Lcom/kik/android/a;->k()V

    goto :goto_3
.end method

.method static synthetic j(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/kik/android/a;->g()V

    return-void
.end method

.method private k()V
    .locals 11

    .prologue
    .line 2000
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    const-string v1, "Mixpanel.PeriodData"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2002
    if-eqz v0, :cond_1

    .line 2003
    iget-object v2, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    monitor-enter v2

    .line 2004
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/kik/android/a;->v:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2007
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-static {v0}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 2008
    new-instance v3, Ljava/io/ObjectInputStream;

    invoke-direct {v3, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2010
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v4

    .line 2012
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 2013
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v5

    .line 2014
    invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$a;

    .line 2015
    new-instance v6, Lcom/kik/android/a$d;

    invoke-direct {v6}, Lcom/kik/android/a$d;-><init>()V

    .line 2017
    invoke-virtual {v0}, Lcom/kik/android/a$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$c;

    .line 2018
    new-instance v8, Lcom/kik/android/a$b;

    iget v9, v0, Lcom/kik/android/a$c;->b:I

    invoke-direct {v8, v9}, Lcom/kik/android/a$b;-><init>(I)V

    .line 2020
    iget-object v0, v0, Lcom/kik/android/a$c;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2021
    iget-object v10, v8, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 2030
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 2036
    :cond_0
    :goto_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2039
    :cond_1
    invoke-direct {p0}, Lcom/kik/android/a;->i()V

    .line 2041
    iget-object v0, p0, Lcom/kik/android/a;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Mixpanel.PeriodData"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2042
    return-void

    .line 2024
    :cond_2
    :try_start_3
    iget-object v0, v6, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 2033
    :catch_1
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    goto :goto_3

    .line 2036
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 2027
    :cond_3
    :try_start_5
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 2012
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic k(Lcom/kik/android/a;)V
    .locals 2

    .prologue
    .line 55
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V

    return-void
.end method

.method static synthetic l(Lcom/kik/android/a;)V
    .locals 2

    .prologue
    .line 55
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->b(ZZ)V

    return-void
.end method

.method static synthetic m(Lcom/kik/android/a;)V
    .locals 2

    .prologue
    .line 55
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->c(ZZ)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
    .locals 4

    .prologue
    .line 1411
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1412
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1414
    iget-object v2, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 1415
    iget-object v2, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 1417
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 1418
    :cond_0
    const-wide/16 v0, 0x0

    .line 1421
    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v0, v2, v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/android/a;
    .locals 2

    .prologue
    .line 1374
    const-string v0, ""

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kik/android/a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;D)Lcom/kik/android/a;
    .locals 4

    .prologue
    .line 1571
    :try_start_0
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1572
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1573
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1576
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 1577
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1579
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1585
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1587
    return-object p0

    .line 1577
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;FF)Lcom/kik/android/a;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 1732
    iget-object v0, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 1735
    if-nez v0, :cond_0

    .line 1736
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1739
    :cond_0
    iget-object v1, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1741
    const/4 v1, 0x1

    invoke-direct {p0, v3, v1}, Lcom/kik/android/a;->c(ZZ)V

    .line 1743
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1745
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x64

    if-le v1, v2, :cond_1

    .line 1746
    invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 1749
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1751
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1753
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 1754
    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 1756
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_2

    .line 1757
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 1765
    :goto_1
    float-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;D)Lcom/kik/android/a;

    .line 1767
    return-object p0

    .line 1760
    :cond_2
    int-to-float v3, v2

    sub-float v3, v0, v3

    .line 1762
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v4, v0, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    mul-float/2addr v4, v0

    add-int/lit8 v0, v2, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    mul-float/2addr v0, v3

    add-float/2addr v0, v4

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;I)Lcom/kik/android/a;
    .locals 3

    .prologue
    .line 1593
    :try_start_0
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1594
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1595
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1598
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1599
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1601
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1607
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1609
    return-object p0

    .line 1599
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;J)Lcom/kik/android/a;
    .locals 2

    .prologue
    .line 1694
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1

    .line 1695
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1696
    invoke-direct {p0, p1, p2, p3}, Lcom/kik/android/a;->b(Ljava/lang/String;J)Lcom/kik/android/a;

    .line 1698
    :cond_0
    monitor-exit v1

    .line 1700
    return-object p0

    .line 1698
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a;
    .locals 3

    .prologue
    .line 1662
    :try_start_0
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1663
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1664
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1667
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1668
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1670
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1676
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1678
    return-object p0

    .line 1668
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 1384
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kik/android/a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kik/android/a;
    .locals 4

    .prologue
    .line 1389
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1391
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v2

    .line 1393
    iget-object v0, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1394
    iget-object v0, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 1396
    if-eqz p3, :cond_1

    .line 1397
    :cond_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 1404
    :cond_1
    iget-object v2, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1406
    return-object p0
.end method

.method public final a()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1272
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/kik/android/a;->b(Z)V

    .line 1274
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->s:Ljava/util/Map;

    .line 1275
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    .line 1276
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/android/a;->t:Ljava/util/Map;

    .line 1278
    invoke-direct {p0, v1, v1}, Lcom/kik/android/a;->a(ZZ)V

    .line 1279
    invoke-direct {p0, v1, v1}, Lcom/kik/android/a;->c(ZZ)V

    .line 1281
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1

    .line 1282
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    iget-object v2, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1283
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1293
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/v;->a(Ljava/lang/String;)V

    .line 1295
    iget-boolean v0, p0, Lcom/kik/android/a;->j:Z

    if-eqz v0, :cond_1

    .line 1296
    iget-object v0, p0, Lcom/kik/android/a;->g:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 1298
    if-eqz v0, :cond_0

    .line 1299
    const-string v1, "Username"

    invoke-virtual {p0, v1, v0}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a;

    .line 1309
    :goto_0
    if-eqz p2, :cond_3

    .line 1310
    iput-boolean v2, p0, Lcom/kik/android/a;->m:Z

    .line 1312
    iget-object v0, p0, Lcom/kik/android/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$f;

    .line 1314
    iput-boolean v2, v0, Lcom/kik/android/a$f;->c:Z

    .line 1315
    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_1

    .line 1302
    :cond_0
    const-string v0, "Username"

    invoke-direct {p0, v0}, Lcom/kik/android/a;->e(Ljava/lang/String;)Lcom/kik/android/a;

    goto :goto_0

    .line 1306
    :cond_1
    const-string v0, "Username"

    invoke-direct {p0, v0}, Lcom/kik/android/a;->e(Ljava/lang/String;)Lcom/kik/android/a;

    goto :goto_0

    .line 1318
    :cond_2
    iget-object v0, p0, Lcom/kik/android/a;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1320
    :cond_3
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 1511
    iput-boolean p1, p0, Lcom/kik/android/a;->j:Z

    .line 1512
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 1426
    const-string v0, ""

    const-string v1, ""

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/android/a$f;
    .locals 1

    .prologue
    .line 1453
    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lcom/kik/android/a;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Z)Lcom/kik/android/a;
    .locals 1

    .prologue
    .line 1379
    const-string v0, ""

    invoke-virtual {p0, p1, v0, p2}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/kik/android/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/android/a;->m:Z

    .line 1289
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/kik/android/a$f;
    .locals 1

    .prologue
    .line 1458
    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lcom/kik/android/a;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;
    .locals 3

    .prologue
    .line 1431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1432
    iget-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1435
    iget-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$f;

    .line 1448
    :goto_0
    return-object v0

    .line 1438
    :cond_0
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1439
    new-instance v0, Lcom/kik/android/a$g;

    invoke-direct {v0, p0, p1, p2}, Lcom/kik/android/a$g;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 1445
    :goto_1
    iget-object v2, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1442
    :cond_1
    new-instance v0, Lcom/kik/android/a$h;

    invoke-direct {v0, p0, p1, p2}, Lcom/kik/android/a$h;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final c(Ljava/lang/String;Z)Lcom/kik/android/a;
    .locals 3

    .prologue
    .line 1548
    :try_start_0
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1549
    :try_start_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1550
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Lorg/json/JSONObject;)V

    .line 1553
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1554
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1556
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_2
    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1562
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1564
    return-object p0

    .line 1554
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final c()Z
    .locals 4

    .prologue
    .line 1335
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v;->b()Ljava/lang/String;

    move-result-object v0

    .line 1337
    iget-boolean v1, p0, Lcom/kik/android/a;->j:Z

    if-eqz v1, :cond_0

    .line 1338
    const/4 v0, 0x1

    .line 1344
    :goto_0
    return v0

    .line 1341
    :cond_0
    iget-wide v2, p0, Lcom/kik/android/a;->k:D

    invoke-static {v0, v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;D)Z

    move-result v0

    goto :goto_0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a$f;
    .locals 3

    .prologue
    .line 1463
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1464
    iget-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1467
    iget-object v0, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$f;

    .line 1469
    instance-of v1, v0, Lcom/kik/android/a$e;

    if-nez v1, :cond_0

    .line 1470
    new-instance v1, Lcom/kik/android/a$e;

    invoke-direct {v1, p0, v0}, Lcom/kik/android/a$e;-><init>(Lcom/kik/android/a;Lcom/kik/android/a$f;)V

    move-object v0, v1

    .line 1480
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/kik/android/a;->r:Ljava/util/Map;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1482
    return-object v0

    .line 1473
    :cond_1
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1474
    new-instance v0, Lcom/kik/android/a$e;

    new-instance v1, Lcom/kik/android/a$g;

    invoke-direct {v1, p0, p1, p2}, Lcom/kik/android/a$g;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/kik/android/a$e;-><init>(Lcom/kik/android/a;Lcom/kik/android/a$f;)V

    goto :goto_0

    .line 1477
    :cond_2
    new-instance v0, Lcom/kik/android/a$e;

    new-instance v1, Lcom/kik/android/a$h;

    invoke-direct {v1, p0, p1, p2}, Lcom/kik/android/a$h;-><init>(Lcom/kik/android/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/kik/android/a$e;-><init>(Lcom/kik/android/a;Lcom/kik/android/a$f;)V

    goto :goto_0
.end method

.method public final d()Lcom/kik/android/a;
    .locals 5

    .prologue
    .line 1521
    iget-object v1, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    monitor-enter v1

    .line 1522
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v2, v0, [Lcom/kik/android/a$e;

    .line 1524
    iget-object v0, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1526
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 1527
    invoke-virtual {v4}, Lcom/kik/android/a$e;->a()V

    .line 1526
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1530
    :cond_0
    invoke-virtual {p0}, Lcom/kik/android/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1531
    iget-object v0, p0, Lcom/kik/android/a;->h:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v;->a()V

    .line 1533
    :cond_1
    iget-object v0, p0, Lcom/kik/android/a;->i:Lcom/kik/c/b;

    invoke-virtual {v0}, Lcom/kik/c/b;->a()V

    .line 1534
    monitor-exit v1

    .line 1536
    return-object p0

    .line 1534
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 1489
    iget-object v1, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    monitor-enter v1

    .line 1490
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$e;

    .line 1492
    iget-object v2, p0, Lcom/kik/android/a;->q:Ljava/util/Map;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1493
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1495
    if-eqz v0, :cond_0

    .line 1496
    invoke-virtual {v0}, Lcom/kik/android/a$e;->c()V

    .line 1498
    const/4 v0, 0x1

    .line 1501
    :goto_0
    return v0

    .line 1493
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1501
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;
    .locals 2

    .prologue
    .line 1683
    iget-object v1, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    monitor-enter v1

    .line 1684
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->u:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1685
    invoke-virtual {p0, p1, p2}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a;

    .line 1687
    :cond_0
    monitor-exit v1

    .line 1689
    return-object p0

    .line 1687
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;
    .locals 8

    .prologue
    .line 1772
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 1774
    iget-object v4, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    monitor-enter v4

    .line 1775
    :try_start_0
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1776
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    new-instance v1, Lcom/kik/android/a$d;

    invoke-direct {v1}, Lcom/kik/android/a$d;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1779
    :cond_0
    iget-object v0, p0, Lcom/kik/android/a;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a$d;

    .line 1780
    const-wide/32 v6, 0x1499700

    div-long/2addr v2, v6

    long-to-int v2, v2

    .line 1781
    add-int/lit8 v3, v2, -0x1c

    .line 1783
    iget-object v1, v0, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/a$b;

    iget v6, v1, Lcom/kik/android/a$b;->b:I

    if-ne v6, v2, :cond_1

    iget-object v1, v1, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    move-object v2, v1

    .line 1785
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v0, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/a$b;

    iget v7, v1, Lcom/kik/android/a$b;->b:I

    if-ge v7, v3, :cond_2

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1800
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1783
    :cond_3
    :try_start_1
    new-instance v1, Lcom/kik/android/a$b;

    invoke-direct {v1, v2}, Lcom/kik/android/a$b;-><init>(I)V

    iget-object v2, v0, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, Lcom/kik/android/a$b;->a:Ljava/util/Set;

    move-object v2, v1

    goto :goto_0

    .line 1785
    :cond_4
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/a$b;

    iget-object v5, v0, Lcom/kik/android/a$d;->a:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1787
    :cond_5
    if-eqz p2, :cond_6

    .line 1788
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1791
    :cond_6
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 1793
    invoke-virtual {v0}, Lcom/kik/android/a$d;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 1794
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 1795
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1799
    :cond_8
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    .line 1800
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1802
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/kik/android/a;->a(ZZ)V

    .line 1804
    invoke-direct {p0}, Lcom/kik/android/a;->i()V

    .line 1806
    return-object p0
.end method
