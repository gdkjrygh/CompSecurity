.class Lcom/jirbo/adcolony/n$y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Z


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 915
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    .prologue
    .line 923
    const/4 v0, 0x1

    return v0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 928
    if-nez p1, :cond_0

    .line 937
    :goto_0
    return v0

    .line 930
    :cond_0
    const-string v2, "enabled"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$y;->c:Z

    .line 932
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$y;->c:Z

    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 934
    :cond_1
    const-string v2, "product_ids"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/jirbo/adcolony/n$y;->a:Ljava/lang/String;

    .line 935
    const-string v0, "in_progress"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$y;->b:Ljava/lang/String;

    move v0, v1

    .line 937
    goto :goto_0
.end method
