.class public Lcom/cleanmaster/ui/app/utils/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/cleanmaster/ui/app/utils/a;


# instance fields
.field private b:Ljava/util/LinkedList;

.field private c:Ljava/util/HashMap;

.field private d:Ljava/lang/Object;

.field private e:Lcom/cleanmaster/util/n;


# direct methods
.method protected constructor <init>()V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->d:Ljava/lang/Object;

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    .line 44
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    .line 45
    new-instance v0, Lcom/cleanmaster/util/n;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lcom/cleanmaster/util/n;-><init>(I)V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->e:Lcom/cleanmaster/util/n;

    .line 46
    return-void
.end method

.method public static a()Lcom/cleanmaster/ui/app/utils/a;
    .locals 2

    .prologue
    .line 31
    sget-object v0, Lcom/cleanmaster/ui/app/utils/a;->a:Lcom/cleanmaster/ui/app/utils/a;

    if-nez v0, :cond_1

    .line 32
    const-class v1, Lcom/cleanmaster/ui/app/utils/a;

    monitor-enter v1

    .line 33
    :try_start_0
    sget-object v0, Lcom/cleanmaster/ui/app/utils/a;->a:Lcom/cleanmaster/ui/app/utils/a;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lcom/cleanmaster/ui/app/utils/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/utils/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/utils/a;->a:Lcom/cleanmaster/ui/app/utils/a;

    .line 36
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :cond_1
    sget-object v0, Lcom/cleanmaster/ui/app/utils/a;->a:Lcom/cleanmaster/ui/app/utils/a;

    return-object v0

    .line 36
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/utils/a;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic a(Lcom/cleanmaster/ui/app/utils/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/ui/app/utils/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 151
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 152
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->e:Lcom/cleanmaster/util/n;

    invoke-virtual {v0, p1, p2}, Lcom/cleanmaster/util/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 157
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/utils/c;

    .line 159
    iget-object v1, v0, Lcom/cleanmaster/ui/app/utils/c;->b:Ljava/lang/String;

    .line 160
    new-instance v2, Lcom/cleanmaster/ui/app/market/i;

    invoke-direct {v2}, Lcom/cleanmaster/ui/app/market/i;-><init>()V

    .line 161
    new-instance v3, Lcom/cleanmaster/ui/app/utils/b;

    invoke-direct {v3, p0, v1}, Lcom/cleanmaster/ui/app/utils/b;-><init>(Lcom/cleanmaster/ui/app/utils/a;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/cleanmaster/ui/app/market/i;->a(Lcom/cleanmaster/ui/app/market/n;)V

    .line 173
    iget-object v3, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-object v3, v0, Lcom/cleanmaster/ui/app/utils/c;->c:Ljava/lang/String;

    iget-object v4, v0, Lcom/cleanmaster/ui/app/utils/c;->d:Ljava/lang/String;

    iget-object v0, v0, Lcom/cleanmaster/ui/app/utils/c;->e:Ljava/lang/String;

    invoke-virtual {v2, v1, v3, v4, v0}, Lcom/cleanmaster/ui/app/market/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cleanmaster/ui/app/market/k;

    goto :goto_0

    .line 177
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/cleanmaster/ui/app/utils/a;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/utils/a;->b()V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/utils/c;

    .line 122
    iget-object v0, v0, Lcom/cleanmaster/ui/app/utils/c;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const/4 v0, 0x1

    .line 126
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Lcom/cleanmaster/ui/app/utils/c;
    .locals 3

    .prologue
    .line 131
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/utils/c;

    .line 132
    iget-object v2, v0, Lcom/cleanmaster/ui/app/utils/c;->b:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 136
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 141
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->e:Lcom/cleanmaster/util/n;

    invoke-virtual {v1, p1}, Lcom/cleanmaster/util/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 147
    :cond_0
    :goto_0
    return v0

    .line 144
    :cond_1
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 147
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 86
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->e:Lcom/cleanmaster/util/n;

    invoke-virtual {v0, p1}, Lcom/cleanmaster/util/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    monitor-exit v1

    return-object v0

    .line 88
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)V
    .locals 5

    .prologue
    .line 92
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 93
    :try_start_0
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 94
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/utils/c;

    .line 95
    iget v4, v0, Lcom/cleanmaster/ui/app/utils/c;->a:I

    if-ne v4, p1, :cond_0

    .line 96
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 99
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->removeAll(Ljava/util/Collection;)Z

    .line 103
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 106
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 107
    iget-object v3, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/ui/app/market/i;

    .line 108
    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/i;->a()Lcom/cleanmaster/ui/app/market/k;

    move-result-object v0

    .line 109
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/k;->c()Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    move-result-object v3

    sget-object v4, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;->RUNNING:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx$Status;

    if-ne v3, v4, :cond_3

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/k;->f()Z

    move-result v3

    if-nez v3, :cond_3

    .line 110
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/cleanmaster/ui/app/market/k;->a(Z)Z

    goto :goto_1

    .line 113
    :cond_4
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 116
    :cond_5
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .prologue
    .line 53
    if-ltz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    :goto_0
    return-void

    .line 56
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 62
    invoke-static {p2}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    iget-object v7, p0, Lcom/cleanmaster/ui/app/utils/a;->d:Ljava/lang/Object;

    monitor-enter v7

    .line 66
    :try_start_0
    invoke-direct {p0, p2}, Lcom/cleanmaster/ui/app/utils/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    monitor-exit v7

    goto :goto_0

    .line 82
    :catchall_0
    move-exception v0

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 69
    :cond_2
    :try_start_1
    invoke-direct {p0, p2}, Lcom/cleanmaster/ui/app/utils/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    invoke-direct {p0, p2}, Lcom/cleanmaster/ui/app/utils/a;->c(Ljava/lang/String;)Lcom/cleanmaster/ui/app/utils/c;

    move-result-object v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 73
    iget-object v1, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 81
    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/utils/a;->b()V

    .line 82
    monitor-exit v7

    goto :goto_0

    .line 76
    :cond_4
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_5

    .line 77
    iget-object v0, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    .line 79
    :cond_5
    iget-object v8, p0, Lcom/cleanmaster/ui/app/utils/a;->b:Ljava/util/LinkedList;

    new-instance v0, Lcom/cleanmaster/ui/app/utils/c;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/cleanmaster/ui/app/utils/c;-><init>(Lcom/cleanmaster/ui/app/utils/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method
