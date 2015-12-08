.class Lcom/jirbo/adcolony/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/jirbo/adcolony/l;

.field static b:Lcom/jirbo/adcolony/l;

.field static c:Lcom/jirbo/adcolony/l;

.field static d:Lcom/jirbo/adcolony/l;


# instance fields
.field e:I

.field f:Z

.field g:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 7
    new-instance v0, Lcom/jirbo/adcolony/l;

    invoke-direct {v0, v1, v1}, Lcom/jirbo/adcolony/l;-><init>(IZ)V

    sput-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    .line 8
    new-instance v0, Lcom/jirbo/adcolony/l;

    invoke-direct {v0, v2, v1}, Lcom/jirbo/adcolony/l;-><init>(IZ)V

    sput-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    .line 9
    new-instance v0, Lcom/jirbo/adcolony/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, Lcom/jirbo/adcolony/l;-><init>(IZ)V

    sput-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    .line 10
    new-instance v0, Lcom/jirbo/adcolony/l;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2}, Lcom/jirbo/adcolony/l;-><init>(IZ)V

    sput-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    return-void
.end method

.method constructor <init>(IZ)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    .line 18
    iput p1, p0, Lcom/jirbo/adcolony/l;->e:I

    .line 19
    iput-boolean p2, p0, Lcom/jirbo/adcolony/l;->f:Z

    .line 20
    return-void
.end method


# virtual methods
.method declared-synchronized a()Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 108
    monitor-enter p0

    const/16 v0, 0xa

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(C)Lcom/jirbo/adcolony/l;
    .locals 2

    .prologue
    .line 24
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 32
    :goto_0
    monitor-exit p0

    return-object v0

    .line 26
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    .line 29
    iget v0, p0, Lcom/jirbo/adcolony/l;->e:I

    iget-object v1, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/a;->a(ILjava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    move-object v0, p0

    .line 32
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(D)Lcom/jirbo/adcolony/l;
    .locals 3

    .prologue
    .line 63
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 65
    :goto_0
    monitor-exit p0

    return-object v0

    .line 64
    :cond_0
    const/4 v0, 0x2

    :try_start_1
    iget-object v1, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    invoke-static {p1, p2, v0, v1}, Lcom/jirbo/adcolony/ab;->a(DILjava/lang/StringBuilder;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, p0

    .line 65
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(I)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 70
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 72
    :goto_0
    monitor-exit p0

    return-object v0

    .line 71
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, p0

    .line 72
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 53
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z

    if-eqz v0, :cond_0

    .line 55
    if-nez p1, :cond_1

    const-string v0, "null"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    :cond_0
    :goto_0
    monitor-exit p0

    return-object p0

    .line 56
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;
    .locals 3

    .prologue
    .line 37
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 48
    :goto_0
    monitor-exit p0

    return-object v0

    .line 39
    :cond_0
    if-nez p1, :cond_2

    .line 41
    :try_start_1
    iget-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    move-object v0, p0

    .line 48
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 46
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Z)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 77
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/l;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 79
    :goto_0
    monitor-exit p0

    return-object v0

    .line 78
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/jirbo/adcolony/l;->g:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, p0

    .line 79
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(D)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 90
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/jirbo/adcolony/l;->a(D)Lcom/jirbo/adcolony/l;

    .line 91
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 90
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(I)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 96
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/l;->a(I)Lcom/jirbo/adcolony/l;

    .line 97
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 84
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 85
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 84
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Z)Lcom/jirbo/adcolony/l;
    .locals 1

    .prologue
    .line 102
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/l;->a(Z)Lcom/jirbo/adcolony/l;

    .line 103
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(C)Lcom/jirbo/adcolony/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method c(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    .line 120
    const/4 v0, 0x0

    return v0
.end method
