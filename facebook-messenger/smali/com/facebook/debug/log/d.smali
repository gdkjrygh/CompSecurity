.class public Lcom/facebook/debug/log/d;
.super Ljava/lang/Object;
.source "FbLogImpl.java"

# interfaces
.implements Lcom/facebook/debug/log/c;


# static fields
.field private static final a:Lcom/facebook/common/p/a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/debug/log/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/common/e/h;

.field private final e:Lcom/facebook/common/process/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 26
    new-instance v0, Lcom/facebook/common/p/a;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v1

    const/4 v2, 0x5

    const-wide/32 v3, 0x36ee80

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/common/p/a;-><init>(Lcom/facebook/common/time/a;IJ)V

    sput-object v0, Lcom/facebook/debug/log/d;->a:Lcom/facebook/common/p/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Lcom/facebook/common/e/h;Lcom/facebook/common/process/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/debug/log/e;",
            ">;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/common/process/d;",
            ")V"
        }
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/debug/log/d;->b:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/facebook/debug/log/d;->c:Ljava/util/Set;

    .line 44
    iput-object p3, p0, Lcom/facebook/debug/log/d;->d:Lcom/facebook/common/e/h;

    .line 45
    invoke-interface {p4}, Lcom/facebook/common/process/d;->b()Lcom/facebook/common/process/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/log/d;->e:Lcom/facebook/common/process/c;

    .line 46
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/debug/log/d;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/facebook/debug/log/d;->e:Lcom/facebook/common/process/c;

    if-eqz v0, :cond_1

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/debug/log/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/debug/log/d;->e:Lcom/facebook/common/process/c;

    invoke-virtual {v1}, Lcom/facebook/common/process/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 159
    :cond_0
    :goto_0
    return-object p1

    .line 156
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/debug/log/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/debug/log/k;)V
    .locals 3

    .prologue
    .line 136
    invoke-virtual {p1}, Lcom/facebook/debug/log/l;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    sget-object v0, Lcom/facebook/debug/log/d;->a:Lcom/facebook/common/p/a;

    invoke-virtual {v0}, Lcom/facebook/common/p/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/facebook/debug/log/d;->d:Lcom/facebook/common/e/h;

    invoke-static {p2, p3}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1, p4}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/common/e/n;->a(I)Lcom/facebook/common/e/n;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/common/e/h;->a(Lcom/facebook/common/e/m;)V

    .line 144
    :cond_0
    return-void
.end method

.method private f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 2

    .prologue
    .line 147
    new-instance v0, Lcom/facebook/debug/log/k;

    invoke-direct {v0, p2, p3}, Lcom/facebook/debug/log/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    const/4 v1, 0x7

    invoke-static {v0}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, p1, v0}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)I
    .locals 4

    .prologue
    .line 123
    invoke-direct {p0, p2}, Lcom/facebook/debug/log/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 124
    invoke-static {p1, v1, p3}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 125
    iget-object v0, p0, Lcom/facebook/debug/log/d;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/log/e;

    .line 127
    :try_start_0
    invoke-interface {v0, p1, v1, p3}, Lcom/facebook/debug/log/e;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 128
    :catch_0
    move-exception v0

    goto :goto_0

    .line 132
    :cond_0
    return v2
.end method

.method public a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 105
    new-instance v0, Lcom/facebook/debug/log/k;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/debug/log/k;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/debug/log/d;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/debug/log/k;)V

    .line 106
    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/debug/log/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 117
    new-instance v0, Lcom/facebook/debug/log/k;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p4}, Lcom/facebook/debug/log/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/debug/log/d;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/debug/log/k;)V

    .line 118
    invoke-direct {p0, p2, p3, p4}, Lcom/facebook/debug/log/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 2

    .prologue
    .line 111
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/log/k;

    invoke-direct {v1, p2, p3}, Lcom/facebook/debug/log/k;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/debug/log/d;->a(Lcom/facebook/debug/log/l;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/debug/log/k;)V

    .line 112
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0, p3}, Lcom/facebook/debug/log/d;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 55
    const/4 v0, 0x2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 2

    .prologue
    .line 90
    const/4 v0, 0x5

    invoke-static {p2}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 65
    const/4 v0, 0x3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 75
    const/4 v0, 0x4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 85
    const/4 v0, 0x5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x6

    invoke-virtual {p0, v0, p1, p2}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    .locals 3

    .prologue
    .line 100
    const/4 v0, 0x6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p3}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/debug/log/d;->a(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
