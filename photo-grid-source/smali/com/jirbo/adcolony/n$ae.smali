.class Lcom/jirbo/adcolony/n$ae;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/n$ab;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 419
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method a(I)Lcom/jirbo/adcolony/n$ab;
    .locals 1

    .prologue
    .line 443
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$ab;

    return-object v0
.end method

.method a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;
    .locals 3

    .prologue
    .line 449
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 451
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$ab;

    .line 452
    iget-object v2, v0, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 456
    :goto_1
    return-object v0

    .line 449
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 455
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "No such zone: "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 456
    const/4 v0, 0x0

    goto :goto_1
.end method

.method a(Lcom/jirbo/adcolony/ADCData$c;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 427
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    .line 428
    if-nez p1, :cond_1

    .line 438
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    .line 430
    :goto_1
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 432
    new-instance v2, Lcom/jirbo/adcolony/n$ab;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$ab;-><init>()V

    .line 433
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    .line 434
    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$ab;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 435
    iget-object v3, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 438
    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method

.method b()Lcom/jirbo/adcolony/n$ab;
    .locals 2

    .prologue
    .line 445
    iget-object v0, p0, Lcom/jirbo/adcolony/n$ae;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$ab;

    return-object v0
.end method
