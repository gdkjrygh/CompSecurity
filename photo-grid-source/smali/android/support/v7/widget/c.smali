.class final Landroid/support/v7/widget/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:I

.field c:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    .prologue
    .line 620
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 621
    iput p1, p0, Landroid/support/v7/widget/c;->a:I

    .line 622
    iput p2, p0, Landroid/support/v7/widget/c;->b:I

    .line 623
    iput p3, p0, Landroid/support/v7/widget/c;->c:I

    .line 624
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 647
    if-ne p0, p1, :cond_1

    .line 672
    :cond_0
    :goto_0
    return v0

    .line 650
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 651
    goto :goto_0

    .line 654
    :cond_3
    check-cast p1, Landroid/support/v7/widget/c;

    .line 656
    iget v2, p0, Landroid/support/v7/widget/c;->a:I

    iget v3, p1, Landroid/support/v7/widget/c;->a:I

    if-eq v2, v3, :cond_4

    move v0, v1

    .line 657
    goto :goto_0

    .line 659
    :cond_4
    iget v2, p0, Landroid/support/v7/widget/c;->a:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    iget v2, p0, Landroid/support/v7/widget/c;->c:I

    iget v3, p0, Landroid/support/v7/widget/c;->b:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-ne v2, v0, :cond_5

    .line 661
    iget v2, p0, Landroid/support/v7/widget/c;->c:I

    iget v3, p1, Landroid/support/v7/widget/c;->b:I

    if-ne v2, v3, :cond_5

    iget v2, p0, Landroid/support/v7/widget/c;->b:I

    iget v3, p1, Landroid/support/v7/widget/c;->c:I

    if-eq v2, v3, :cond_0

    .line 665
    :cond_5
    iget v2, p0, Landroid/support/v7/widget/c;->c:I

    iget v3, p1, Landroid/support/v7/widget/c;->c:I

    if-eq v2, v3, :cond_6

    move v0, v1

    .line 666
    goto :goto_0

    .line 668
    :cond_6
    iget v2, p0, Landroid/support/v7/widget/c;->b:I

    iget v3, p1, Landroid/support/v7/widget/c;->b:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 669
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 677
    iget v0, p0, Landroid/support/v7/widget/c;->a:I

    .line 678
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroid/support/v7/widget/c;->b:I

    add-int/2addr v0, v1

    .line 679
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroid/support/v7/widget/c;->c:I

    add-int/2addr v0, v1

    .line 680
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 642
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1627
    iget v0, p0, Landroid/support/v7/widget/c;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1637
    const-string v0, "??"

    .line 642
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",s:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "c:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1629
    :pswitch_0
    const-string v0, "add"

    goto :goto_0

    .line 1631
    :pswitch_1
    const-string v0, "rm"

    goto :goto_0

    .line 1633
    :pswitch_2
    const-string v0, "up"

    goto :goto_0

    .line 1635
    :pswitch_3
    const-string v0, "mv"

    goto :goto_0

    .line 1627
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
