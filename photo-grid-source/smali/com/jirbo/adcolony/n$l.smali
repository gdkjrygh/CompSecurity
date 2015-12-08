.class Lcom/jirbo/adcolony/n$l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:I

.field c:I

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Z


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1554
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .prologue
    .line 1567
    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$l;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1568
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$l;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1573
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 1583
    :cond_0
    :goto_0
    return v0

    .line 1575
    :cond_1
    const-string v1, "enabled"

    invoke-virtual {p1, v1, v0}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$l;->f:Z

    .line 1576
    const-string v1, "width"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$l;->a:I

    .line 1577
    const-string v1, "height"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$l;->b:I

    .line 1578
    const-string v1, "scale"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$l;->c:I

    .line 1579
    const-string v1, "image"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$l;->d:Ljava/lang/String;

    .line 1580
    const-string v1, "image_last_modified"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$l;->e:Ljava/lang/String;

    .line 1581
    iget-object v1, p0, Lcom/jirbo/adcolony/n$l;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "last_modified"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$l;->e:Ljava/lang/String;

    goto :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    .line 1588
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$l;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$l;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1589
    return-void
.end method
