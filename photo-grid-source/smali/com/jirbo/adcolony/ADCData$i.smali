.class Lcom/jirbo/adcolony/ADCData$i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/af;)V
    .locals 0

    .prologue
    .line 64
    return-void
.end method

.method a(Lcom/jirbo/adcolony/af;Ljava/lang/String;)V
    .locals 9

    .prologue
    const/16 v8, 0x22

    const/4 v1, 0x0

    .line 68
    if-nez p2, :cond_0

    .line 104
    :goto_0
    return-void

    .line 69
    :cond_0
    invoke-virtual {p1, v8}, Lcom/jirbo/adcolony/af;->b(C)V

    .line 70
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    move v3, v1

    .line 71
    :goto_1
    if-ge v3, v4, :cond_4

    .line 73
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 74
    sparse-switch v0, :sswitch_data_0

    .line 85
    const/16 v2, 0x20

    if-lt v0, v2, :cond_2

    const/16 v2, 0x7e

    if-gt v0, v2, :cond_2

    .line 87
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->b(C)V

    .line 71
    :cond_1
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 76
    :sswitch_0
    const-string v0, "\\\""

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 77
    :sswitch_1
    const-string v0, "\\\\"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 78
    :sswitch_2
    const-string v0, "\\/"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 79
    :sswitch_3
    const-string v0, "\\b"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 80
    :sswitch_4
    const-string v0, "\\f"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 81
    :sswitch_5
    const-string v0, "\\n"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 82
    :sswitch_6
    const-string v0, "\\r"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 83
    :sswitch_7
    const-string v0, "\\t"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 91
    :cond_2
    const-string v2, "\\u"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    move v2, v0

    move v0, v1

    .line 93
    :goto_3
    const/4 v5, 0x4

    if-ge v0, v5, :cond_1

    .line 95
    shr-int/lit8 v5, v2, 0xc

    and-int/lit8 v5, v5, 0xf

    .line 96
    shl-int/lit8 v2, v2, 0x4

    .line 97
    const/16 v6, 0x9

    if-gt v5, v6, :cond_3

    int-to-long v6, v5

    invoke-virtual {p1, v6, v7}, Lcom/jirbo/adcolony/af;->a(J)V

    .line 93
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 98
    :cond_3
    add-int/lit8 v5, v5, -0xa

    add-int/lit8 v5, v5, 0x61

    int-to-char v5, v5

    invoke-virtual {p1, v5}, Lcom/jirbo/adcolony/af;->b(C)V

    goto :goto_4

    .line 103
    :cond_4
    invoke-virtual {p1, v8}, Lcom/jirbo/adcolony/af;->b(C)V

    goto :goto_0

    .line 74
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0x9 -> :sswitch_7
        0xa -> :sswitch_5
        0xc -> :sswitch_4
        0xd -> :sswitch_6
        0x22 -> :sswitch_0
        0x2f -> :sswitch_2
        0x5c -> :sswitch_1
    .end sparse-switch
.end method

.method a()Z
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCData$i;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method b_()Z
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    return v0
.end method

.method c()Z
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x0

    return v0
.end method

.method c_()Z
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method d()D
    .locals 2

    .prologue
    .line 51
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    return v0
.end method

.method f()Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    return v0
.end method

.method g()Z
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method h()Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 49
    const/4 v0, 0x0

    return-object v0
.end method

.method k()Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    return v0
.end method

.method l()Z
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method m()Z
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method n()Lcom/jirbo/adcolony/ADCData$g;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    return-object v0
.end method

.method p()Z
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCData$i;->b_()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCData$i;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method q()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    new-instance v0, Lcom/jirbo/adcolony/z;

    invoke-direct {v0}, Lcom/jirbo/adcolony/z;-><init>()V

    .line 60
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$i;->a(Lcom/jirbo/adcolony/af;)V

    .line 61
    invoke-virtual {v0}, Lcom/jirbo/adcolony/z;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCData$i;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
