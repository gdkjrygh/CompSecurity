.class public abstract Lcom/google/android/gms/internal/kc;
.super Lcom/google/android/gms/internal/jg;


# static fields
.field static d:Z

.field private static e:Ljava/lang/reflect/Method;

.field private static f:Ljava/lang/reflect/Method;

.field private static g:Ljava/lang/reflect/Method;

.field private static h:Ljava/lang/reflect/Method;

.field private static i:Ljava/lang/reflect/Method;

.field private static j:Ljava/lang/reflect/Method;

.field private static k:Ljava/lang/String;

.field private static l:J

.field private static m:Lcom/google/android/gms/internal/ld;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/android/gms/internal/kc;->l:J

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/internal/kc;->d:Z

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/lc;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/jg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/lc;)V

    return-void
.end method

.method private static a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/kc;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->k:Ljava/lang/String;

    return-object v0
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/internal/lb;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/kc;->g:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->g:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/lb;->a([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static a([BLjava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/kc;->m:Lcom/google/android/gms/internal/ld;

    invoke-virtual {v1, p0, p1}, Lcom/google/android/gms/internal/ld;->a([BLjava/lang/String;)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/le; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static a(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/kc;->h:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    if-nez p0, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->h:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static declared-synchronized a(Ljava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/lb;)V
    .locals 12

    const-class v1, Lcom/google/android/gms/internal/kc;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/internal/kc;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ld;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ld;-><init>(Lcom/google/android/gms/internal/lb;)V

    sput-object v0, Lcom/google/android/gms/internal/kc;->m:Lcom/google/android/gms/internal/ld;

    sput-object p0, Lcom/google/android/gms/internal/kc;->k:Ljava/lang/String;
    :try_end_1
    .catch Lcom/google/android/gms/internal/kd; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v0, Lcom/google/android/gms/internal/kc;->m:Lcom/google/android/gms/internal/ld;

    const-string v2, "lbxVRZn959z8Mby5/xIR5GY5qeai5a6plNW9YXQVEvQ="

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ld;->a(Ljava/lang/String;)[B

    move-result-object v2

    sget-object v0, Lcom/google/android/gms/internal/kc;->m:Lcom/google/android/gms/internal/ld;

    const-string v3, "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"

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ld;->a([BLjava/lang/String;)[B

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "dex"

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lcom/google/android/gms/internal/le; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Lcom/google/android/gms/internal/kd; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catch Lcom/google/android/gms/internal/kd; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    move-exception v0

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    :try_start_4
    const-string v4, "ads"

    const-string v5, ".jar"

    invoke-static {v4, v5, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/4 v6, 0x0

    array-length v7, v3

    invoke-virtual {v5, v3, v6, v7}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    new-instance v3, Ldalvik/system/DexClassLoader;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-direct {v3, v5, v6, v7, v8}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    const-string v5, "iJkf7Oi+A1kM/Uo7c1/aRZ8QWS9UVlE/WL/MFqAJx1e1JiM4/Gaeo4sQTSPvKVmT"

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v6, "DOrHUrlPAyNSeU+NvnrdUjcvyLXFYbygCQievG8bnnQ6HGThBdBkI9mrKGQjm39O"

    invoke-static {v2, v6}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v7, "VSSWx/l6VwxyGcOtodSBdwbU3HNiBwMWuimDu0c2EPWrn/zcOJzth/9+/Qy0j39d"

    invoke-static {v2, v7}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const-string v8, "Ti3TvLpZz2b8sl8dGeICn4bYAUnGHyad7ShT92+gKCKZsyMRYG3KmvUcB5cToip2"

    invoke-static {v2, v8}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const-string v9, "V3Tb3wwZBH/MkprkkeKqg6pDa5tFOcttcgEaQ29QFMh2oue8xFqholngd6DkHA46"

    invoke-static {v2, v9}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const-string v10, "j4P2NZaGK6yZNP+XTUyWiXWJgkAL02JK2VGVbrzucp2hianTo+ZgBPr3yFUnt+1x"

    invoke-static {v2, v10}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-string v10, "7Kebxr/m40lXaqZ3f0vkkYGrrvm187cU3AS/kEduZcU="

    invoke-static {v2, v10}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    new-array v11, v11, [Ljava/lang/Class;

    invoke-virtual {v5, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lcom/google/android/gms/internal/kc;->e:Ljava/lang/reflect/Method;

    const-string v5, "bmksOiX7ckGJ44MHrSqSV7mO7PRFCiyl+RZbwT1Bv0k="

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Class;

    invoke-virtual {v6, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lcom/google/android/gms/internal/kc;->f:Ljava/lang/reflect/Method;

    const-string v5, "PXKtpEOwUKSYQwobOd9LzM63iwGUroqnoqPL7HLAkwA="

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v10, 0x0

    const-class v11, Landroid/content/Context;

    aput-object v11, v6, v10

    invoke-virtual {v7, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lcom/google/android/gms/internal/kc;->g:Ljava/lang/reflect/Method;

    const-string v5, "JzpLluqkhgPQ/w1TkrMPy9chUBDDjch5PM8hF9zAwuU="

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v10, Landroid/view/MotionEvent;

    aput-object v10, v6, v7

    const/4 v7, 0x1

    const-class v10, Landroid/util/DisplayMetrics;

    aput-object v10, v6, v7

    invoke-virtual {v8, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lcom/google/android/gms/internal/kc;->h:Ljava/lang/reflect/Method;

    const-string v5, "a7sqqI6lRQtagq0yU9TL4NZ7huWSqCHa/L531Ub273o="

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Landroid/content/Context;

    aput-object v8, v6, v7

    invoke-virtual {v9, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lcom/google/android/gms/internal/kc;->i:Ljava/lang/reflect/Method;

    const-string v5, "ESnf6G2jUk6mqOv2P5Rlce2hoauGd+ogk4106OMMF9g="

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/kc;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/content/Context;

    aput-object v7, v5, v6

    invoke-virtual {v3, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/kc;->j:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    new-instance v3, Ljava/io/File;

    const-string v4, ".jar"

    const-string v5, ".dex"

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Lcom/google/android/gms/internal/le; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Lcom/google/android/gms/internal/kd; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Lcom/google/android/gms/internal/kc;->b()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sput-wide v2, Lcom/google/android/gms/internal/kc;->l:J

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/gms/internal/kc;->d:Z

    goto/16 :goto_0

    :catch_2
    move-exception v0

    goto/16 :goto_0

    :catch_3
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catch Lcom/google/android/gms/internal/kd; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_4
    move-exception v0

    :try_start_6
    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catch_5
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catch_6
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catch_7
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/kd;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catch Lcom/google/android/gms/internal/kd; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
.end method

.method private static b()Ljava/lang/Long;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/kc;->e:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->e:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static b(Landroid/content/Context;Lcom/google/android/gms/internal/lb;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/kc;->j:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->j:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/lb;->a([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static c()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/kc;->f:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->f:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/kc;->i:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/kc;->i:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kd;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/kd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/kd;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    return-object v0
.end method


# virtual methods
.method protected b(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/kc;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/kd; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x2

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/kc;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/google/android/gms/internal/kd; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    const/16 v0, 0x19

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/kc;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/internal/kc;->a(IJ)V
    :try_end_2
    .catch Lcom/google/android/gms/internal/kd; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    const/16 v0, 0x18

    :try_start_3
    invoke-static {p1}, Lcom/google/android/gms/internal/kc;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/kd; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :goto_3
    return-void

    :catch_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method protected final c(Landroid/content/Context;)V
    .locals 6

    const/4 v0, 0x2

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/kc;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/kd; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x1

    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/kc;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/google/android/gms/internal/kd; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/kc;->b()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/16 v2, 0x19

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/internal/kc;->a(IJ)V

    sget-wide v2, Lcom/google/android/gms/internal/kc;->l:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/16 v2, 0x11

    sget-wide v4, Lcom/google/android/gms/internal/kc;->l:J

    sub-long/2addr v0, v4

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/internal/kc;->a(IJ)V

    const/16 v0, 0x17

    sget-wide v2, Lcom/google/android/gms/internal/kc;->l:J

    invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/internal/kc;->a(IJ)V
    :try_end_2
    .catch Lcom/google/android/gms/internal/kd; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/kc;->a:Landroid/view/MotionEvent;

    iget-object v1, p0, Lcom/google/android/gms/internal/kc;->b:Landroid/util/DisplayMetrics;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/kc;->a(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v2, 0xe

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p0, v2, v4, v5}, Lcom/google/android/gms/internal/kc;->a(IJ)V

    const/16 v2, 0xf

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p0, v2, v4, v5}, Lcom/google/android/gms/internal/kc;->a(IJ)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x3

    if-lt v0, v2, :cond_1

    const/16 v2, 0x10

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/internal/kc;->a(IJ)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/kd; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_1
    :goto_3
    const/16 v0, 0x1b

    :try_start_4
    iget-object v1, p0, Lcom/google/android/gms/internal/kc;->c:Lcom/google/android/gms/internal/lb;

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/kc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/lb;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_4
    .catch Lcom/google/android/gms/internal/kd; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    const/16 v0, 0x1d

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/internal/kc;->c:Lcom/google/android/gms/internal/lb;

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/kc;->b(Landroid/content/Context;Lcom/google/android/gms/internal/lb;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/kc;->a(ILjava/lang/String;)V
    :try_end_5
    .catch Lcom/google/android/gms/internal/kd; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    goto/16 :goto_1

    :catch_6
    move-exception v0

    goto/16 :goto_0
.end method
