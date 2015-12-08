.class Lcom/jirbo/adcolony/ah;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Z

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/ag;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ah;->b:Z

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    .line 17
    iput-object p1, p0, Lcom/jirbo/adcolony/ah;->a:Lcom/jirbo/adcolony/d;

    .line 18
    return-void
.end method


# virtual methods
.method a(I)Lcom/jirbo/adcolony/ag;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ag;

    return-object v0
.end method

.method a(Ljava/lang/String;)Lcom/jirbo/adcolony/ag;
    .locals 4

    .prologue
    .line 68
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 69
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 71
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ag;

    .line 72
    iget-object v3, v0, Lcom/jirbo/adcolony/ag;->a:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 78
    :goto_1
    return-object v0

    .line 69
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 75
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ah;->b:Z

    .line 76
    new-instance v0, Lcom/jirbo/adcolony/ag;

    invoke-direct {v0, p1}, Lcom/jirbo/adcolony/ag;-><init>(Ljava/lang/String;)V

    .line 77
    iget-object v1, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method a()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 22
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v2, "zone_state.txt"

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->c(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v2

    .line 23
    if-eqz v2, :cond_1

    .line 25
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    move v0, v1

    .line 26
    :goto_0
    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 28
    invoke-virtual {v2, v0}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    .line 29
    new-instance v4, Lcom/jirbo/adcolony/ag;

    invoke-direct {v4}, Lcom/jirbo/adcolony/ag;-><init>()V

    .line 30
    invoke-virtual {v4, v3}, Lcom/jirbo/adcolony/ag;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v0, v0, Lcom/jirbo/adcolony/c;->k:[Ljava/lang/String;

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    .line 38
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/ah;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/ag;

    .line 36
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 40
    :cond_2
    return-void
.end method

.method b()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 44
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Saving zone state..."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 45
    iput-boolean v0, p0, Lcom/jirbo/adcolony/ah;->b:Z

    .line 47
    new-instance v1, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v1}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    .line 48
    iget-object v2, p0, Lcom/jirbo/adcolony/ah;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->k:[Ljava/lang/String;

    array-length v3, v2

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 50
    invoke-virtual {p0, v4}, Lcom/jirbo/adcolony/ah;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/ag;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jirbo/adcolony/ag;->a()Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 48
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 52
    :cond_0
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v2, "zone_state.txt"

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$c;)V

    .line 53
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Saved zone state"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 54
    return-void
.end method

.method c()I
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/jirbo/adcolony/ah;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method d()V
    .locals 1

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ah;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ah;->b()V

    .line 84
    :cond_0
    return-void
.end method
