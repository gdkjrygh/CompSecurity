.class final Lcom/google/a/b/a/ap;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/a/am",
        "<",
        "Ljava/util/Calendar;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 528
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 9

    .prologue
    const/4 v6, 0x0

    .line 528
    .line 1538
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v0, v1, :cond_0

    .line 1539
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1540
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1542
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->c()V

    move v5, v6

    move v4, v6

    move v3, v6

    move v2, v6

    move v1, v6

    .line 1549
    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v0

    sget-object v7, Lcom/google/a/d/e;->d:Lcom/google/a/d/e;

    if-eq v0, v7, :cond_7

    .line 1550
    invoke-virtual {p1}, Lcom/google/a/d/a;->g()Ljava/lang/String;

    move-result-object v7

    .line 1551
    invoke-virtual {p1}, Lcom/google/a/d/a;->m()I

    move-result v0

    .line 1552
    const-string v8, "year"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v1, v0

    .line 1553
    goto :goto_1

    .line 1554
    :cond_2
    const-string v8, "month"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v2, v0

    .line 1555
    goto :goto_1

    .line 1556
    :cond_3
    const-string v8, "dayOfMonth"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v3, v0

    .line 1557
    goto :goto_1

    .line 1558
    :cond_4
    const-string v8, "hourOfDay"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v4, v0

    .line 1559
    goto :goto_1

    .line 1560
    :cond_5
    const-string v8, "minute"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v5, v0

    .line 1561
    goto :goto_1

    .line 1562
    :cond_6
    const-string v8, "second"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v6, v0

    .line 1563
    goto :goto_1

    .line 1566
    :cond_7
    invoke-virtual {p1}, Lcom/google/a/d/a;->d()V

    .line 1567
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 528
    check-cast p2, Ljava/util/Calendar;

    .line 1572
    if-nez p2, :cond_0

    .line 1573
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1574
    :goto_0
    return-void

    .line 1576
    :cond_0
    invoke-virtual {p1}, Lcom/google/a/d/f;->d()Lcom/google/a/d/f;

    .line 1577
    const-string v0, "year"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1578
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1579
    const-string v0, "month"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1580
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1581
    const-string v0, "dayOfMonth"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1582
    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1583
    const-string v0, "hourOfDay"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1584
    const/16 v0, 0xb

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1585
    const-string v0, "minute"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1586
    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1587
    const-string v0, "second"

    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1588
    const/16 v0, 0xd

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lcom/google/a/d/f;->a(J)Lcom/google/a/d/f;

    .line 1589
    invoke-virtual {p1}, Lcom/google/a/d/f;->e()Lcom/google/a/d/f;

    goto :goto_0
.end method
