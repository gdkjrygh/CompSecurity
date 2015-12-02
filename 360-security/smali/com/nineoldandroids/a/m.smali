.class public Lcom/nineoldandroids/a/m;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nineoldandroids/a/m$a;,
        Lcom/nineoldandroids/a/m$b;
    }
.end annotation


# static fields
.field private static final i:Lcom/nineoldandroids/a/n;

.field private static final j:Lcom/nineoldandroids/a/n;

.field private static k:[Ljava/lang/Class;

.field private static l:[Ljava/lang/Class;

.field private static m:[Ljava/lang/Class;

.field private static final n:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field protected b:Lcom/nineoldandroids/util/c;

.field c:Ljava/lang/reflect/Method;

.field d:Ljava/lang/Class;

.field e:Lcom/nineoldandroids/a/j;

.field final f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field final g:[Ljava/lang/Object;

.field private h:Ljava/lang/reflect/Method;

.field private p:Lcom/nineoldandroids/a/n;

.field private q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 79
    new-instance v0, Lcom/nineoldandroids/a/g;

    invoke-direct {v0}, Lcom/nineoldandroids/a/g;-><init>()V

    sput-object v0, Lcom/nineoldandroids/a/m;->i:Lcom/nineoldandroids/a/n;

    .line 80
    new-instance v0, Lcom/nineoldandroids/a/e;

    invoke-direct {v0}, Lcom/nineoldandroids/a/e;-><init>()V

    sput-object v0, Lcom/nineoldandroids/a/m;->j:Lcom/nineoldandroids/a/n;

    .line 89
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v3

    const-class v1, Ljava/lang/Float;

    aput-object v1, v0, v4

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v5

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v6

    .line 90
    const-class v1, Ljava/lang/Double;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-class v2, Ljava/lang/Integer;

    aput-object v2, v0, v1

    .line 89
    sput-object v0, Lcom/nineoldandroids/a/m;->k:[Ljava/lang/Class;

    .line 91
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v3

    const-class v1, Ljava/lang/Integer;

    aput-object v1, v0, v4

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v5

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v6

    .line 92
    const-class v1, Ljava/lang/Float;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-class v2, Ljava/lang/Double;

    aput-object v2, v0, v1

    .line 91
    sput-object v0, Lcom/nineoldandroids/a/m;->l:[Ljava/lang/Class;

    .line 93
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v3

    const-class v1, Ljava/lang/Double;

    aput-object v1, v0, v4

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v5

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v6

    .line 94
    const-class v1, Ljava/lang/Float;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-class v2, Ljava/lang/Integer;

    aput-object v2, v0, v1

    .line 93
    sput-object v0, Lcom/nineoldandroids/a/m;->m:[Ljava/lang/Class;

    .line 100
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 99
    sput-object v0, Lcom/nineoldandroids/a/m;->n:Ljava/util/HashMap;

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 101
    sput-object v0, Lcom/nineoldandroids/a/m;->o:Ljava/util/HashMap;

    .line 102
    return-void
.end method

.method private constructor <init>(Lcom/nineoldandroids/util/c;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    .line 64
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->h:Ljava/lang/reflect/Method;

    .line 75
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    .line 106
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 109
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->g:[Ljava/lang/Object;

    .line 139
    iput-object p1, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    .line 140
    if-eqz p1, :cond_0

    .line 141
    invoke-virtual {p1}, Lcom/nineoldandroids/util/c;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    .line 143
    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lcom/nineoldandroids/util/c;Lcom/nineoldandroids/a/m;)V
    .locals 0

    .prologue
    .line 138
    invoke-direct {p0, p1}, Lcom/nineoldandroids/a/m;-><init>(Lcom/nineoldandroids/util/c;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    .line 64
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->h:Ljava/lang/reflect/Method;

    .line 75
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    .line 106
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 109
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->g:[Ljava/lang/Object;

    .line 131
    iput-object p1, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    .line 132
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/nineoldandroids/a/m;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/nineoldandroids/a/m;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a(Lcom/nineoldandroids/util/c;[F)Lcom/nineoldandroids/a/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nineoldandroids/util/c",
            "<*",
            "Ljava/lang/Float;",
            ">;[F)",
            "Lcom/nineoldandroids/a/m;"
        }
    .end annotation

    .prologue
    .line 186
    new-instance v0, Lcom/nineoldandroids/a/m$a;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/m$a;-><init>(Lcom/nineoldandroids/util/c;[F)V

    return-object v0
.end method

.method public static varargs a(Lcom/nineoldandroids/util/c;[I)Lcom/nineoldandroids/a/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nineoldandroids/util/c",
            "<*",
            "Ljava/lang/Integer;",
            ">;[I)",
            "Lcom/nineoldandroids/a/m;"
        }
    .end annotation

    .prologue
    .line 164
    new-instance v0, Lcom/nineoldandroids/a/m$b;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/m$b;-><init>(Lcom/nineoldandroids/util/c;[I)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/String;[F)Lcom/nineoldandroids/a/m;
    .locals 1

    .prologue
    .line 175
    new-instance v0, Lcom/nineoldandroids/a/m$a;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/m$a;-><init>(Ljava/lang/String;[F)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/String;[I)Lcom/nineoldandroids/a/m;
    .locals 1

    .prologue
    .line 153
    new-instance v0, Lcom/nineoldandroids/a/m$b;

    invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/a/m$b;-><init>(Ljava/lang/String;[I)V

    return-object v0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 743
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 749
    :cond_0
    :goto_0
    return-object p0

    .line 747
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    .line 748
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 749
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    .line 380
    .line 381
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 382
    const/4 v0, 0x0

    .line 383
    if-nez p3, :cond_0

    .line 385
    :try_start_0
    invoke-virtual {p1, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 439
    :goto_0
    return-object v0

    .line 386
    :catch_0
    move-exception v2

    .line 391
    :try_start_1
    invoke-virtual {p1, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    .line 392
    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 393
    :catch_1
    move-exception v1

    goto :goto_0

    .line 399
    :cond_0
    new-array v5, v6, [Ljava/lang/Class;

    .line 401
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    const-class v2, Ljava/lang/Float;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 402
    sget-object v0, Lcom/nineoldandroids/a/m;->k:[Ljava/lang/Class;

    .line 411
    :goto_1
    array-length v6, v0

    move v2, v3

    :goto_2
    if-lt v2, v6, :cond_4

    move-object v0, v1

    goto :goto_0

    .line 403
    :cond_1
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 404
    sget-object v0, Lcom/nineoldandroids/a/m;->l:[Ljava/lang/Class;

    goto :goto_1

    .line 405
    :cond_2
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    const-class v2, Ljava/lang/Double;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 406
    sget-object v0, Lcom/nineoldandroids/a/m;->m:[Ljava/lang/Class;

    goto :goto_1

    .line 408
    :cond_3
    new-array v0, v6, [Ljava/lang/Class;

    .line 409
    iget-object v2, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    aput-object v2, v0, v3

    goto :goto_1

    .line 411
    :cond_4
    aget-object v7, v0, v2

    .line 412
    aput-object v7, v5, v3

    .line 414
    :try_start_3
    invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 416
    iput-object v7, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    move-object v0, v1

    .line 417
    goto :goto_0

    .line 418
    :catch_2
    move-exception v8

    .line 423
    :try_start_4
    invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 424
    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 426
    iput-object v7, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_3

    move-object v0, v1

    .line 427
    goto :goto_0

    .line 428
    :catch_3
    move-exception v7

    .line 411
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 393
    :catch_4
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method private a(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    .line 456
    const/4 v1, 0x0

    .line 461
    :try_start_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 462
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 463
    if-eqz v0, :cond_0

    .line 464
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    .line 466
    :cond_0
    if-nez v1, :cond_2

    .line 467
    invoke-direct {p0, p1, p3, p4}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 468
    if-nez v0, :cond_1

    .line 469
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 470
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    :cond_1
    iget-object v2, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v1

    .line 475
    :goto_0
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 477
    return-object v0

    .line 474
    :catchall_0
    move-exception v0

    .line 475
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->f:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 476
    throw v0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private b(Ljava/lang/Class;)V
    .locals 3

    .prologue
    .line 492
    sget-object v0, Lcom/nineoldandroids/a/m;->o:Ljava/util/HashMap;

    const-string/jumbo v1, "get"

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->h:Ljava/lang/reflect/Method;

    .line 493
    return-void
.end method


# virtual methods
.method public a()Lcom/nineoldandroids/a/m;
    .locals 2

    .prologue
    .line 593
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/m;

    .line 594
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    .line 595
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    iput-object v1, v0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    .line 596
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/j;->b()Lcom/nineoldandroids/a/j;

    move-result-object v1

    iput-object v1, v0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    .line 597
    iget-object v1, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    iput-object v1, v0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 601
    :goto_0
    return-object v0

    .line 599
    :catch_0
    move-exception v0

    .line 601
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(F)V
    .locals 1

    .prologue
    .line 669
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/j;->a(F)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->q:Ljava/lang/Object;

    .line 670
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/n;)V
    .locals 1

    .prologue
    .line 658
    iput-object p1, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    .line 659
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/a/j;->a(Lcom/nineoldandroids/a/n;)V

    .line 660
    return-void
.end method

.method public a(Lcom/nineoldandroids/util/c;)V
    .locals 0

    .prologue
    .line 700
    iput-object p1, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    .line 701
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 3

    .prologue
    .line 485
    sget-object v0, Lcom/nineoldandroids/a/m;->n:Ljava/util/HashMap;

    const-string/jumbo v1, "set"

    iget-object v2, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    .line 486
    return-void
.end method

.method a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 506
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_3

    .line 509
    :try_start_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    invoke-virtual {v0, p1}, Lcom/nineoldandroids/util/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    iget-object v0, v0, Lcom/nineoldandroids/a/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 540
    :cond_1
    return-void

    .line 510
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/i;

    .line 511
    invoke-virtual {v0}, Lcom/nineoldandroids/a/i;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 512
    iget-object v2, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    invoke-virtual {v2, p1}, Lcom/nineoldandroids/util/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/nineoldandroids/a/i;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 516
    :catch_0
    move-exception v0

    .line 519
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    .line 522
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 523
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_4

    .line 524
    invoke-virtual {p0, v1}, Lcom/nineoldandroids/a/m;->a(Ljava/lang/Class;)V

    .line 526
    :cond_4
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    iget-object v0, v0, Lcom/nineoldandroids/a/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/i;

    .line 527
    invoke-virtual {v0}, Lcom/nineoldandroids/a/i;->a()Z

    move-result v3

    if-nez v3, :cond_5

    .line 528
    iget-object v3, p0, Lcom/nineoldandroids/a/m;->h:Ljava/lang/reflect/Method;

    if-nez v3, :cond_6

    .line 529
    invoke-direct {p0, v1}, Lcom/nineoldandroids/a/m;->b(Ljava/lang/Class;)V

    .line 532
    :cond_6
    :try_start_1
    iget-object v3, p0, Lcom/nineoldandroids/a/m;->h:Ljava/lang/reflect/Method;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/a/i;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    .line 533
    :catch_1
    move-exception v0

    goto :goto_1

    .line 535
    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 688
    iput-object p1, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    .line 689
    return-void
.end method

.method public varargs a([F)V
    .locals 1

    .prologue
    .line 326
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    .line 327
    invoke-static {p1}, Lcom/nineoldandroids/a/j;->a([F)Lcom/nineoldandroids/a/j;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    .line 328
    return-void
.end method

.method public varargs a([I)V
    .locals 1

    .prologue
    .line 308
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    .line 309
    invoke-static {p1}, Lcom/nineoldandroids/a/j;->a([I)Lcom/nineoldandroids/a/j;

    move-result-object v0

    iput-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    .line 310
    return-void
.end method

.method b()V
    .locals 2

    .prologue
    .line 633
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    if-nez v0, :cond_0

    .line 636
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    const-class v1, Ljava/lang/Integer;

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/nineoldandroids/a/m;->i:Lcom/nineoldandroids/a/n;

    :goto_0
    iput-object v0, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    .line 640
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    if-eqz v0, :cond_1

    .line 643
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    iget-object v1, p0, Lcom/nineoldandroids/a/m;->p:Lcom/nineoldandroids/a/n;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/j;->a(Lcom/nineoldandroids/a/n;)V

    .line 645
    :cond_1
    return-void

    .line 637
    :cond_2
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->d:Ljava/lang/Class;

    const-class v1, Ljava/lang/Float;

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/nineoldandroids/a/m;->j:Lcom/nineoldandroids/a/n;

    goto :goto_0

    .line 638
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 613
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    if-eqz v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->b:Lcom/nineoldandroids/util/c;

    invoke-virtual {p0}, Lcom/nineoldandroids/a/m;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/nineoldandroids/util/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 616
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    .line 618
    :try_start_0
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->g:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/nineoldandroids/a/m;->d()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    .line 619
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->c:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/nineoldandroids/a/m;->g:[Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 626
    :cond_1
    :goto_0
    return-void

    .line 622
    :catch_0
    move-exception v0

    goto :goto_0

    .line 620
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 712
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/nineoldandroids/a/m;->a()Lcom/nineoldandroids/a/m;

    move-result-object v0

    return-object v0
.end method

.method d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 721
    iget-object v0, p0, Lcom/nineoldandroids/a/m;->q:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 726
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/nineoldandroids/a/m;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/nineoldandroids/a/m;->e:Lcom/nineoldandroids/a/j;

    invoke-virtual {v1}, Lcom/nineoldandroids/a/j;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
