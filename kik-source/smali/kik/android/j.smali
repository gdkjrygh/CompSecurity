.class public final Lkik/android/j;
.super Lkik/a/c;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/y;


# instance fields
.field private a:Lkik/android/chat/KikApplication;

.field private b:Z

.field private c:Lkik/android/util/aq;

.field private d:Ljava/lang/String;

.field private e:Lkik/a/e/q;


# direct methods
.method public constructor <init>(Lkik/android/chat/KikApplication;Lkik/android/util/aq;Ljava/lang/String;Lkik/a/e/q;)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Lkik/a/c;-><init>()V

    .line 68
    iput-object p1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    .line 69
    invoke-static {p1}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/j;->b:Z

    .line 70
    iput-object p2, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    .line 71
    iput-object p3, p0, Lkik/android/j;->d:Ljava/lang/String;

    .line 72
    iput-object p4, p0, Lkik/android/j;->e:Lkik/a/e/q;

    .line 73
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/e/w;)Lkik/a/e/b;
    .locals 10

    .prologue
    .line 116
    iget-object v0, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v1

    .line 117
    new-instance v0, Lkik/android/a;

    new-instance v4, Lkik/android/i;

    iget-object v2, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-direct {v4, v2}, Lkik/android/i;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/util/cr;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lkik/android/a;-><init>(Lkik/android/d/c;Lkik/a/e/v;Lkik/a/e/f;Lkik/a/d/a;Lkik/a/e/w;Ljava/lang/String;)V

    .line 119
    new-instance v2, Lkik/android/d/k;

    iget-object v3, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    const-string v4, "address-update-interval"

    const-wide/32 v6, 0x5265c00

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Long;

    const/4 v7, 0x0

    const-wide/32 v8, 0x5265c00

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-wide/32 v8, 0x36ee80

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x2

    const-wide/32 v8, 0xea60

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    new-instance v7, Lkik/android/k;

    invoke-direct {v7, p0, v0}, Lkik/android/k;-><init>(Lkik/android/j;Lkik/android/a;)V

    iget-object v8, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-direct/range {v2 .. v8}, Lkik/android/d/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/Long;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v1, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 134
    new-instance v2, Lkik/android/d/k;

    iget-object v3, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    const-string v4, "address-full-update-interval"

    const-wide v6, 0x9a7ec800L

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Long;

    const/4 v7, 0x0

    const-wide v8, 0x9a7ec800L

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-wide/32 v8, 0x5265c00

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x2

    const-wide/32 v8, 0x36ee80

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    const/4 v7, 0x3

    const-wide/32 v8, 0x493e0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v6, v7

    new-instance v7, Lkik/android/l;

    invoke-direct {v7, p0, v0}, Lkik/android/l;-><init>(Lkik/android/j;Lkik/android/a;)V

    iget-object v8, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-direct/range {v2 .. v8}, Lkik/android/d/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;[Ljava/lang/Long;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v1, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 151
    new-instance v2, Lkik/android/d/a;

    iget-object v3, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    const-string v4, "matching-opt-in"

    const/4 v5, 0x0

    new-instance v6, Lkik/android/m;

    invoke-direct {v6, p0, v1, v0}, Lkik/android/m;-><init>(Lkik/android/j;Lkik/android/d/c;Lkik/android/a;)V

    iget-object v7, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-direct/range {v2 .. v7}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v1, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 167
    return-object v0
.end method

.method public final a(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/t;Lkik/a/e/w;)Lkik/a/e/d;
    .locals 1

    .prologue
    .line 102
    new-instance v0, Lcom/kik/cards/web/auth/a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/kik/cards/web/auth/a;-><init>(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/t;Lkik/a/e/w;)V

    return-object v0
.end method

.method public final a(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/f/k;Lcom/kik/g/e;)Lkik/a/e/e;
    .locals 9

    .prologue
    .line 173
    new-instance v0, Lkik/android/a/b;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-interface {p3}, Lkik/a/f/k;->i()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v3

    iget-boolean v6, p0, Lkik/android/j;->b:Z

    iget-object v7, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    iget-object v8, p0, Lkik/android/j;->e:Lkik/a/e/q;

    move-object v4, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v8}, Lkik/android/a/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/kik/g/e;Lkik/a/e/v;Lcom/kik/g/e;ZLkik/android/util/ar;Lkik/a/e/q;)V

    return-object v0
.end method

.method public final a()Lkik/a/e/f;
    .locals 4

    .prologue
    .line 88
    new-instance v0, Lkik/android/net/communicator/a;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    iget-object v2, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v2}, Lkik/android/util/DeviceUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-direct {v0, v1, v2, p0, v3}, Lkik/android/net/communicator/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lkik/a/e/y;Lkik/android/util/ar;)V

    return-object v0
.end method

.method public final a(Lkik/a/e/f;Lkik/a/e/r;Lkik/a/e/v;Lkik/a/e/o;Lkik/a/e/p;Lkik/a/e/w;Lkik/a/e/l;Ljava/util/concurrent/ExecutorService;)Lkik/a/e/i;
    .locals 9

    .prologue
    .line 96
    new-instance v0, Lkik/a/b/a/a;

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p2

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lkik/a/b/a/a;-><init>(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/o;Lkik/a/e/p;Lkik/a/e/r;Lkik/a/e/w;Lkik/a/e/l;Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public final a(Lkik/a/e/f;)Lkik/a/e/u;
    .locals 2

    .prologue
    .line 231
    new-instance v0, Lcom/kik/android/stickers/c;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-direct {v0, v1, p1}, Lcom/kik/android/stickers/c;-><init>(Landroid/content/Context;Lkik/a/e/f;)V

    return-object v0
.end method

.method public final a(Lkik/a/e/t;Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;)Lkik/a/e/v;
    .locals 8

    .prologue
    .line 78
    new-instance v0, Lkik/android/d/a;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    const-string v2, "sticker-store-on-dev"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-direct/range {v0 .. v5}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    .line 80
    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v1

    invoke-interface {v1, v0}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    .line 82
    new-instance v0, Lcom/kik/l/am;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    iget-object v5, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    iget-object v6, p0, Lkik/android/j;->e:Lkik/a/e/q;

    iget-object v7, p0, Lkik/android/j;->d:Ljava/lang/String;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/kik/l/am;-><init>(Landroid/content/Context;Lkik/a/e/t;Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;Lkik/android/util/aq;Lkik/a/e/q;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Lkik/a/e/v;Lkik/a/e/f;)Lkik/a/e/w;
    .locals 1

    .prologue
    .line 189
    new-instance v0, Lkik/a/g/az;

    invoke-direct {v0, p1, p2}, Lkik/a/g/az;-><init>(Lkik/a/e/v;Lkik/a/e/f;)V

    return-object v0
.end method

.method public final b()Lkik/a/e/k;
    .locals 1

    .prologue
    .line 108
    new-instance v0, Lkik/android/n;

    invoke-direct {v0}, Lkik/android/n;-><init>()V

    return-object v0
.end method

.method public final c()Lkik/a/e/t;
    .locals 1

    .prologue
    .line 179
    new-instance v0, Lcom/kik/m/b;

    invoke-direct {v0}, Lcom/kik/m/b;-><init>()V

    .line 181
    invoke-virtual {v0}, Lcom/kik/m/b;->a()V

    .line 183
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 7

    .prologue
    .line 194
    :try_start_0
    const-string v0, "SHA-1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 197
    iget-object v0, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v2, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v2}, Lkik/android/chat/KikApplication;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 198
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 199
    new-instance v3, Ljava/util/jar/JarFile;

    invoke-direct {v3, v0}, Ljava/util/jar/JarFile;-><init>(Ljava/lang/String;)V

    .line 200
    invoke-virtual {v3}, Ljava/util/jar/JarFile;->getManifest()Ljava/util/jar/Manifest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/jar/Manifest;->getEntries()Ljava/util/Map;

    move-result-object v0

    const-string v3, "classes.dex"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/jar/Attributes;

    const-string v3, "SHA1-Digest"

    invoke-virtual {v0, v3}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 202
    const-string v0, "hello"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 204
    iget-object v4, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v5, v4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v5, :cond_0

    aget-object v6, v4, v0

    .line 205
    invoke-virtual {v6}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 204
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 208
    :cond_0
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 209
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 210
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "google_sdk"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "sdk"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "foo"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 213
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 218
    :goto_2
    return-object v0

    .line 210
    :cond_2
    const-string v0, "bar"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 216
    :catch_0
    move-exception v0

    const-string v0, "2jmj7l5rSw0yVb/vlWAYkK/YBwk="

    goto :goto_2
.end method

.method public final e()Lkik/a/f/k;
    .locals 3

    .prologue
    .line 224
    iget-object v0, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/d/c;->b()Ljava/util/Hashtable;

    move-result-object v0

    .line 225
    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v1

    iget-object v2, p0, Lkik/android/j;->c:Lkik/android/util/aq;

    invoke-interface {v1, v2}, Lkik/android/d/c;->a(Lkik/android/util/ar;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/k;

    return-object v0
.end method

.method public final f()Lkik/a/e/x;
    .locals 4

    .prologue
    .line 237
    iget-object v0, p0, Lkik/android/j;->e:Lkik/a/e/q;

    const-string v1, "xdata_cache"

    invoke-interface {v0, v1}, Lkik/a/e/q;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 238
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v2}, Lkik/android/chat/KikApplication;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 239
    new-instance v2, Ljava/io/File;

    const-string v3, "xdata_cache"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 240
    invoke-static {v2, v0}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 241
    new-instance v1, Lkik/a/j/a;

    invoke-direct {v1, v0}, Lkik/a/j/a;-><init>(Ljava/io/File;)V

    return-object v1
.end method

.method public final g()Lkik/a/e/c;
    .locals 3

    .prologue
    .line 247
    new-instance v0, Lkik/android/h/a;

    iget-object v1, p0, Lkik/android/j;->a:Lkik/android/chat/KikApplication;

    iget-object v2, p0, Lkik/android/j;->e:Lkik/a/e/q;

    invoke-direct {v0, v1, v2}, Lkik/android/h/a;-><init>(Landroid/content/Context;Lkik/a/e/q;)V

    return-object v0
.end method
