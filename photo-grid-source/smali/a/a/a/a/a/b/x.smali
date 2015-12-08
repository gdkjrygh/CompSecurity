.class public final La/a/a/a/a/b/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/lang/String;


# instance fields
.field a:La/a/a/a/a/b/c;

.field b:La/a/a/a/a/b/b;

.field c:Z

.field private final f:Ljava/util/concurrent/locks/ReentrantLock;

.field private final g:La/a/a/a/a/b/z;

.field private final h:Z

.field private final i:Z

.field private final j:Landroid/content/Context;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    const-string v0, "[^\\p{Alnum}]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, La/a/a/a/a/b/x;->d:Ljava/util/regex/Pattern;

    .line 81
    const-string v0, "/"

    invoke-static {v0}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/a/a/a/a/b/x;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/p;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, La/a/a/a/a/b/x;->f:Ljava/util/concurrent/locks/ReentrantLock;

    .line 127
    if-nez p1, :cond_0

    .line 128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appContext must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_0
    if-nez p2, :cond_1

    .line 131
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appIdentifier must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_1
    if-nez p4, :cond_2

    .line 134
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "kits must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_2
    iput-object p1, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    .line 137
    iput-object p2, p0, La/a/a/a/a/b/x;->k:Ljava/lang/String;

    .line 138
    iput-object p3, p0, La/a/a/a/a/b/x;->l:Ljava/lang/String;

    .line 139
    iput-object p4, p0, La/a/a/a/a/b/x;->m:Ljava/util/Collection;

    .line 141
    new-instance v0, La/a/a/a/a/b/z;

    invoke-direct {v0}, La/a/a/a/a/b/z;-><init>()V

    iput-object v0, p0, La/a/a/a/a/b/x;->g:La/a/a/a/a/b/z;

    .line 142
    new-instance v0, La/a/a/a/a/b/c;

    invoke-direct {v0, p1}, La/a/a/a/a/b/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, La/a/a/a/a/b/x;->a:La/a/a/a/a/b/c;

    .line 144
    const-string v0, "com.crashlytics.CollectDeviceIdentifiers"

    invoke-static {p1, v0, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    .line 146
    iget-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    if-nez v0, :cond_3

    .line 147
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Device ID collection disabled for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    :cond_3
    const-string v0, "com.crashlytics.CollectUserIdentifiers"

    invoke-static {p1, v0, v2}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, La/a/a/a/a/b/x;->i:Z

    .line 153
    iget-boolean v0, p0, La/a/a/a/a/b/x;->i:Z

    if-nez v0, :cond_4

    .line 154
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "User information collection disabled for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    :cond_4
    return-void
.end method

.method private a(Landroid/content/SharedPreferences;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 346
    iget-object v0, p0, La/a/a/a/a/b/x;->f:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 348
    :try_start_0
    const-string v0, "crashlytics.installation.id"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 350
    if-nez v0, :cond_0

    .line 351
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 352
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "crashlytics.installation.id"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    :cond_0
    iget-object v1, p0, La/a/a/a/a/b/x;->f:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, La/a/a/a/a/b/x;->f:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method private static a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "La/a/a/a/a/b/y;",
            "Ljava/lang/String;",
            ">;",
            "La/a/a/a/a/b/y;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 438
    if-eqz p2, :cond_0

    .line 439
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    :cond_0
    return-void
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 7

    .prologue
    .line 214
    invoke-virtual {p0}, La/a/a/a/a/b/x;->g()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 216
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/a/a/b/y;

    invoke-virtual {v1}, La/a/a/a/a/b/y;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 217
    :catch_0
    move-exception v1

    .line 218
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Fabric"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Could not write value to JSON: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/b/y;

    invoke-virtual {v0}, La/a/a/a/a/b/y;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v0, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 223
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 253
    :goto_0
    return v0

    .line 249
    :cond_0
    const/4 v0, 0x0

    .line 253
    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 261
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, La/a/a/a/a/b/x;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 312
    sget-object v0, La/a/a/a/a/b/x;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 5

    .prologue
    .line 299
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v4}, La/a/a/a/a/b/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    invoke-static {v4}, La/a/a/a/a/b/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 5

    .prologue
    .line 307
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s/%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {v4}, La/a/a/a/a/b/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v4}, La/a/a/a/a/b/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized k()La/a/a/a/a/b/b;
    .locals 1

    .prologue
    .line 403
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, La/a/a/a/a/b/x;->c:Z

    if-nez v0, :cond_0

    .line 404
    iget-object v0, p0, La/a/a/a/a/b/x;->a:La/a/a/a/a/b/c;

    invoke-virtual {v0}, La/a/a/a/a/b/c;->a()La/a/a/a/a/b/b;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/b/x;->b:La/a/a/a/a/b/b;

    .line 405
    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/a/a/a/b/x;->c:Z

    .line 407
    :cond_0
    iget-object v0, p0, La/a/a/a/a/b/x;->b:La/a/a/a/a/b/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 403
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private l()Ljava/lang/String;
    .locals 3

    .prologue
    .line 444
    const/4 v0, 0x0

    .line 446
    iget-boolean v1, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v1, :cond_0

    .line 447
    iget-object v1, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 450
    const-string v2, "9774d56d682e549c"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 451
    invoke-static {v1}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 455
    :cond_0
    return-object v0
.end method

.method private m()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 525
    iget-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v0, v2, :cond_0

    .line 527
    :try_start_0
    const-class v0, Landroid/os/Build;

    const-string v2, "SERIAL"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 528
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 534
    :goto_0
    return-object v0

    .line 529
    :catch_0
    move-exception v0

    .line 530
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Could not retrieve android.os.Build.SERIAL value"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move-object v0, v1

    .line 534
    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 174
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [C

    fill-array-data v1, :array_0

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    const-string v0, "\\."

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v0}, La/a/a/a/a/b/l;->c(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 184
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1206
    :try_start_1
    const-string v0, "APPLICATION_INSTALLATION_UUID"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, La/a/a/a/a/b/x;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    :goto_0
    invoke-direct {p0, v2}, La/a/a/a/a/b/x;->a(Lorg/json/JSONObject;)V

    .line 1227
    :try_start_2
    const-string v0, "os_version"

    invoke-static {}, La/a/a/a/a/b/x;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1236
    :goto_1
    :try_start_3
    const-string v0, "model"

    invoke-static {}, La/a/a/a/a/b/x;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 192
    :goto_2
    const-string v0, ""

    .line 193
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 195
    :try_start_4
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-static {v1}, La/a/a/a/a/b/l;->a([B)Ljava/lang/String;
    :try_end_4
    .catch Ljava/security/GeneralSecurityException; {:try_start_4 .. :try_end_4} :catch_4

    move-result-object v0

    .line 201
    :cond_0
    :goto_3
    return-object v0

    .line 179
    :catch_0
    move-exception v0

    .line 181
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Could not create cipher to encrypt headers."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    const-string v0, ""

    goto :goto_3

    .line 1207
    :catch_1
    move-exception v0

    .line 1208
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Could not write application id to JSON"

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1228
    :catch_2
    move-exception v0

    .line 1229
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Could not write OS version to JSON"

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 1237
    :catch_3
    move-exception v0

    .line 1238
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v3

    const-string v4, "Fabric"

    const-string v5, "Could not write model to JSON"

    invoke-interface {v3, v4, v5, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 196
    :catch_4
    move-exception v1

    .line 197
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Could not encrypt IDs"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 174
    :array_0
    .array-data 2
        0x73s
        0x6cs
        0x63s
    .end array-data
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 244
    iget-boolean v0, p0, La/a/a/a/a/b/x;->i:Z

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 273
    iget-object v0, p0, La/a/a/a/a/b/x;->l:Ljava/lang/String;

    .line 275
    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/l;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 277
    const-string v0, "crashlytics.installation.id"

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 279
    if-nez v0, :cond_0

    .line 280
    invoke-direct {p0, v1}, La/a/a/a/a/b/x;->a(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    .line 284
    :cond_0
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, La/a/a/a/a/b/x;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .prologue
    .line 322
    const-string v0, ""

    .line 324
    iget-boolean v1, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v1, :cond_0

    .line 325
    invoke-direct {p0}, La/a/a/a/a/b/x;->l()Ljava/lang/String;

    move-result-object v0

    .line 327
    if-nez v0, :cond_0

    .line 328
    iget-object v0, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/l;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 329
    const-string v0, "crashlytics.installation.id"

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 331
    if-nez v0, :cond_0

    .line 332
    invoke-direct {p0, v1}, La/a/a/a/a/b/x;->a(Landroid/content/SharedPreferences;)Ljava/lang/String;

    move-result-object v0

    .line 337
    :cond_0
    return-object v0
.end method

.method public final g()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "La/a/a/a/a/b/y;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 372
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 377
    iget-object v0, p0, La/a/a/a/a/b/x;->m:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/p;

    .line 378
    instance-of v1, v0, La/a/a/a/a/b/s;

    if-eqz v1, :cond_0

    .line 379
    check-cast v0, La/a/a/a/a/b/s;

    .line 380
    invoke-interface {v0}, La/a/a/a/a/b/s;->e()Ljava/util/Map;

    move-result-object v0

    .line 382
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 383
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/a/a/a/a/b/y;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v3, v1, v0}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    goto :goto_0

    .line 388
    :cond_1
    sget-object v0, La/a/a/a/a/b/y;->d:La/a/a/a/a/b/y;

    invoke-direct {p0}, La/a/a/a/a/b/x;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 389
    sget-object v1, La/a/a/a/a/b/y;->e:La/a/a/a/a/b/y;

    .line 1472
    iget-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v0, :cond_3

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-direct {p0, v0}, La/a/a/a/a/b/x;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1473
    iget-object v0, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    const-string v4, "phone"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 1476
    if-eqz v0, :cond_3

    .line 1477
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 389
    :goto_1
    invoke-static {v3, v1, v0}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 390
    sget-object v0, La/a/a/a/a/b/y;->f:La/a/a/a/a/b/y;

    invoke-direct {p0}, La/a/a/a/a/b/x;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 391
    sget-object v1, La/a/a/a/a/b/y;->a:La/a/a/a/a/b/y;

    .line 1485
    iget-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v0, :cond_4

    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    invoke-direct {p0, v0}, La/a/a/a/a/b/x;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1486
    iget-object v0, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    const-string v4, "wifi"

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 1489
    if-eqz v0, :cond_4

    .line 1490
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 1492
    if-eqz v0, :cond_4

    .line 1493
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 391
    :goto_2
    invoke-static {v3, v1, v0}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 392
    sget-object v0, La/a/a/a/a/b/y;->b:La/a/a/a/a/b/y;

    invoke-virtual {p0}, La/a/a/a/a/b/x;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 393
    sget-object v0, La/a/a/a/a/b/y;->g:La/a/a/a/a/b/y;

    .line 2426
    iget-boolean v1, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v1, :cond_2

    .line 2427
    invoke-direct {p0}, La/a/a/a/a/b/x;->k()La/a/a/a/a/b/b;

    move-result-object v1

    .line 2428
    if-eqz v1, :cond_2

    .line 2429
    iget-object v2, v1, La/a/a/a/a/b/b;->a:Ljava/lang/String;

    .line 393
    :cond_2
    invoke-static {v3, v0, v2}, La/a/a/a/a/b/x;->a(Ljava/util/Map;La/a/a/a/a/b/y;Ljava/lang/String;)V

    .line 395
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_3
    move-object v0, v2

    .line 1480
    goto :goto_1

    :cond_4
    move-object v0, v2

    .line 1497
    goto :goto_2
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 399
    iget-object v0, p0, La/a/a/a/a/b/x;->g:La/a/a/a/a/b/z;

    iget-object v1, p0, La/a/a/a/a/b/x;->j:Landroid/content/Context;

    invoke-virtual {v0, v1}, La/a/a/a/a/b/z;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i()Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 411
    const/4 v0, 0x0

    .line 413
    iget-boolean v1, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v1, :cond_0

    .line 414
    invoke-direct {p0}, La/a/a/a/a/b/x;->k()La/a/a/a/a/b/b;

    move-result-object v1

    .line 415
    if-eqz v1, :cond_0

    .line 416
    iget-boolean v0, v1, La/a/a/a/a/b/b;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 420
    :cond_0
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 4

    .prologue
    .line 510
    iget-boolean v0, p0, La/a/a/a/a/b/x;->h:Z

    if-eqz v0, :cond_0

    const-string v0, "android.permission.BLUETOOTH"

    invoke-direct {p0, v0}, La/a/a/a/a/b/x;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    .line 513
    if-eqz v0, :cond_0

    .line 514
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/x;->b(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 520
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 516
    :catch_0
    move-exception v0

    .line 517
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
