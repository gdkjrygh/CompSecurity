.class Lcom/jirbo/adcolony/n$d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/n$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 862
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 865
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .prologue
    .line 883
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method a(I)Lcom/jirbo/adcolony/n$a;
    .locals 1

    .prologue
    .line 885
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$a;

    return-object v0
.end method

.method a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$a;
    .locals 3

    .prologue
    .line 891
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 893
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$a;

    .line 894
    iget-object v2, v0, Lcom/jirbo/adcolony/n$a;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 896
    :goto_1
    return-object v0

    .line 891
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 896
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method a(Lcom/jirbo/adcolony/n$a;)V
    .locals 1

    .prologue
    .line 881
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method a(Lcom/jirbo/adcolony/ADCData$c;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 870
    if-nez p1, :cond_1

    .line 878
    :cond_0
    :goto_0
    return v1

    :cond_1
    move v0, v1

    .line 872
    :goto_1
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 874
    new-instance v2, Lcom/jirbo/adcolony/n$a;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$a;-><init>()V

    .line 875
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$a;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 876
    iget-object v3, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 872
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 878
    :cond_2
    const/4 v1, 0x1

    goto :goto_0
.end method

.method b()Lcom/jirbo/adcolony/n$a;
    .locals 2

    .prologue
    .line 887
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$a;

    return-object v0
.end method

.method b(I)Lcom/jirbo/adcolony/n$a;
    .locals 3

    .prologue
    .line 900
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 902
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$a;

    .line 903
    iget-object v1, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$p;->a:Z

    if-eqz v1, :cond_1

    .line 911
    :cond_0
    :goto_1
    return-object v0

    .line 900
    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 906
    :cond_2
    const/4 v0, 0x0

    move v1, v0

    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 908
    iget-object v0, p0, Lcom/jirbo/adcolony/n$d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/n$a;

    .line 909
    iget-object v2, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/n$p;->a:Z

    if-nez v2, :cond_0

    .line 906
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 911
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method
