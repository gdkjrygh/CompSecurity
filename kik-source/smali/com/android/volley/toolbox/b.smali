.class public final Lcom/android/volley/toolbox/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final a:Ljava/util/Comparator;


# instance fields
.field private b:Ljava/util/List;

.field private c:Ljava/util/List;

.field private d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/android/volley/toolbox/c;

    invoke-direct {v0}, Lcom/android/volley/toolbox/c;-><init>()V

    sput-object v0, Lcom/android/volley/toolbox/b;->a:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/android/volley/toolbox/b;->b:Ljava/util/List;

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lcom/android/volley/toolbox/b;->d:I

    .line 78
    iput p1, p0, Lcom/android/volley/toolbox/b;->e:I

    .line 79
    return-void
.end method

.method private declared-synchronized a()V
    .locals 2

    .prologue
    .line 129
    monitor-enter p0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/android/volley/toolbox/b;->d:I

    iget v1, p0, Lcom/android/volley/toolbox/b;->e:I

    if-le v0, v1, :cond_0

    .line 130
    iget-object v0, p0, Lcom/android/volley/toolbox/b;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 131
    iget-object v1, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 132
    iget v1, p0, Lcom/android/volley/toolbox/b;->d:I

    array-length v0, v0

    sub-int v0, v1, v0

    iput v0, p0, Lcom/android/volley/toolbox/b;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 129
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 134
    :cond_0
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public final declared-synchronized a([B)V
    .locals 2

    .prologue
    .line 111
    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    array-length v0, p1

    iget v1, p0, Lcom/android/volley/toolbox/b;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-le v0, v1, :cond_1

    .line 122
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 114
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/android/volley/toolbox/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v0, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    sget-object v1, Lcom/android/volley/toolbox/b;->a:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v0

    .line 116
    if-gez v0, :cond_2

    .line 117
    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 119
    :cond_2
    iget-object v1, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 120
    iget v0, p0, Lcom/android/volley/toolbox/b;->d:I

    array-length v1, p1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/android/volley/toolbox/b;->d:I

    .line 121
    invoke-direct {p0}, Lcom/android/volley/toolbox/b;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 111
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(I)[B
    .locals 4

    .prologue
    .line 91
    monitor-enter p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 92
    iget-object v0, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 93
    array-length v2, v0

    if-lt v2, p1, :cond_0

    .line 94
    iget v2, p0, Lcom/android/volley/toolbox/b;->d:I

    array-length v3, v0

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/android/volley/toolbox/b;->d:I

    .line 95
    iget-object v2, p0, Lcom/android/volley/toolbox/b;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 96
    iget-object v1, p0, Lcom/android/volley/toolbox/b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    :goto_1
    monitor-exit p0

    return-object v0

    .line 91
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 100
    :cond_1
    :try_start_1
    new-array v0, p1, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
