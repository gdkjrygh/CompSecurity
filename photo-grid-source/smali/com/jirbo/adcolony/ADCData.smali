.class public Lcom/jirbo/adcolony/ADCData;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/jirbo/adcolony/ADCData$i;

.field static b:Lcom/jirbo/adcolony/ADCData$i;

.field static c:Lcom/jirbo/adcolony/ADCData$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    new-instance v0, Lcom/jirbo/adcolony/ADCData$h;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$h;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/ADCData;->a:Lcom/jirbo/adcolony/ADCData$i;

    .line 33
    new-instance v0, Lcom/jirbo/adcolony/ADCData$a;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$a;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/ADCData;->b:Lcom/jirbo/adcolony/ADCData$i;

    .line 34
    new-instance v0, Lcom/jirbo/adcolony/ADCData$d;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$d;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/ADCData;->c:Lcom/jirbo/adcolony/ADCData$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 484
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 503
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "==== ADCData Test ===="

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 505
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 506
    const-string v1, "one"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 507
    const-string v1, "pi"

    const-wide v2, 0x40091eb851eb851fL    # 3.14

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 508
    const-string v1, "name"

    const-string v2, "\"Abe Pralle\""

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    const-string v1, "list"

    new-instance v2, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v2}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 510
    const-string v1, "subtable"

    new-instance v2, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 511
    const-string v1, "subtable"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v1

    const-string v2, "five"

    const/4 v3, 0x5

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 512
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "LIST:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "list"

    invoke-virtual {v0, v3}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 513
    const-string v1, "list"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/ADCData$c;->a(I)Lcom/jirbo/adcolony/ADCData$c;

    .line 514
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 515
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "one"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(I)V

    .line 516
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "one"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/PrintStream;->println(D)V

    .line 517
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "pi"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(I)V

    .line 518
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "pi"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/PrintStream;->println(D)V

    .line 519
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 520
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/PrintStream;->println(D)V

    .line 521
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "name"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(I)V

    .line 522
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "list"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 523
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "list2"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 524
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "subtable"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 525
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "subtable"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 526
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "subtable2"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 527
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "list"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 528
    return-void
.end method
