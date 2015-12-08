.class public Lcom/cleanmaster/ui/app/market/data/filter/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:Lcom/cleanmaster/ui/app/market/data/filter/a;


# instance fields
.field a:I

.field b:I

.field c:I

.field d:Ljava/util/Set;

.field e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/filter/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/filter/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/ui/app/market/data/filter/a;->f:Lcom/cleanmaster/ui/app/market/data/filter/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->a:I

    .line 15
    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->b:I

    .line 16
    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->c:I

    .line 17
    new-instance v0, Lcom/cleanmaster/base/util/misc/a;

    invoke-direct {v0}, Lcom/cleanmaster/base/util/misc/a;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->d:Ljava/util/Set;

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->e:J

    return-void
.end method

.method public static a()Lcom/cleanmaster/ui/app/market/data/filter/a;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/cleanmaster/ui/app/market/data/filter/a;->f:Lcom/cleanmaster/ui/app/market/data/filter/a;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/cleanmaster/ui/app/market/data/filter/a;
    .locals 4

    .prologue
    .line 26
    invoke-static {}, Lcom/cleanmaster/func/cache/a;->a()Lcom/cleanmaster/func/cache/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cleanmaster/func/cache/a;->c()Ljava/util/List;

    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->a:I

    .line 29
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 30
    invoke-static {}, Lcom/cleanmaster/base/util/io/c;->a()Lcom/cleanmaster/base/util/io/b;

    move-result-object v0

    .line 31
    iget-wide v2, v0, Lcom/cleanmaster/base/util/io/b;->a:J

    invoke-static {v2, v3}, Lcom/cleanmaster/functionevent/report/a;->a(J)I

    move-result v1

    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->b:I

    .line 32
    iget-wide v0, v0, Lcom/cleanmaster/base/util/io/b;->b:J

    invoke-static {v0, v1}, Lcom/cleanmaster/functionevent/report/a;->a(J)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->c:I

    .line 34
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->e:J

    .line 35
    return-object p0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->a:I

    return v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->b:I

    return v0
.end method

.method public e()Ljava/util/Set;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->d:Ljava/util/Set;

    return-object v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->c:I

    return v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 67
    iget-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->e:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    const-string v1, "--------------------------------------[AdEnv]\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const-string v1, " *     app_installed_num = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    const-string v1, " * total_space_condition = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "M"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    const-string v1, " * free_space_condition  = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "M"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    const-string v1, " * \t\t\t\t\t\t\t\t\tnow = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/cleanmaster/ui/app/market/data/filter/a;->a:I

    int-to-long v2, v2

    invoke-static {v2, v3}, Lcom/cleanmaster/ui/app/market/data/filter/g;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
