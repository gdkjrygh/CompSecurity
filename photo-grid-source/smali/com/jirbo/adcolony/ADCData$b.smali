.class Lcom/jirbo/adcolony/ADCData$b;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"


# instance fields
.field a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .prologue
    .line 488
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    iput p1, p0, Lcom/jirbo/adcolony/ADCData$b;->a:I

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 2

    .prologue
    .line 496
    iget v0, p0, Lcom/jirbo/adcolony/ADCData$b;->a:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/af;->a(J)V

    .line 497
    return-void
.end method

.method c()Z
    .locals 1

    .prologue
    .line 490
    const/4 v0, 0x1

    return v0
.end method

.method d()D
    .locals 2

    .prologue
    .line 491
    iget v0, p0, Lcom/jirbo/adcolony/ADCData$b;->a:I

    int-to-double v0, v0

    return-wide v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 492
    iget v0, p0, Lcom/jirbo/adcolony/ADCData$b;->a:I

    return v0
.end method
