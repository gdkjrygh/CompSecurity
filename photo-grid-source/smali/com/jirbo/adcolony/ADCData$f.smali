.class Lcom/jirbo/adcolony/ADCData$f;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 430
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    .line 431
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCData$f;->a:Ljava/lang/String;

    .line 432
    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 1

    .prologue
    .line 464
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$f;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$f;->a(Lcom/jirbo/adcolony/af;Ljava/lang/String;)V

    .line 465
    return-void
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 436
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method d()D
    .locals 2

    .prologue
    .line 442
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$f;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 446
    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method e()I
    .locals 2

    .prologue
    .line 452
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCData$f;->d()D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method k()Z
    .locals 1

    .prologue
    .line 434
    const/4 v0, 0x1

    return v0
.end method

.method l()Z
    .locals 2

    .prologue
    .line 457
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 458
    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "yes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 459
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
