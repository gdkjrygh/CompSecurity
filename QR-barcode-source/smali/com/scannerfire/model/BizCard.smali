.class public Lcom/scannerfire/model/BizCard;
.super Ljava/lang/Object;
.source "BizCard.java"


# static fields
.field private static A:Ljava/lang/String;

.field private static B:Ljava/lang/String;

.field private static C:Ljava/lang/String;

.field private static E:Ljava/lang/String;

.field private static N:Ljava/lang/String;

.field private static T:Ljava/lang/String;

.field private static X:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getA()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/scannerfire/model/BizCard;->A:Ljava/lang/String;

    return-object v0
.end method

.method public static getB()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    sget-object v0, Lcom/scannerfire/model/BizCard;->B:Ljava/lang/String;

    return-object v0
.end method

.method public static getBizCardFromString(Ljava/lang/String;)Lcom/scannerfire/model/BizCard;
    .locals 7
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x2

    .line 8
    const-string v3, "BIZCARD:"

    const-string v4, ""

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 9
    const-string v3, ";"

    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 10
    .local v2, "strings":[Ljava/lang/String;
    new-instance v0, Lcom/scannerfire/model/BizCard;

    invoke-direct {v0}, Lcom/scannerfire/model/BizCard;-><init>()V

    .line 11
    .local v0, "biz":Lcom/scannerfire/model/BizCard;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v3, v2

    if-lt v1, v3, :cond_0

    .line 29
    return-object v0

    .line 12
    :cond_0
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v5, v2, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 13
    aget-object v3, v2, v1

    const-string v4, "N:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 14
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->N:Ljava/lang/String;

    .line 11
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 15
    :cond_2
    aget-object v3, v2, v1

    const-string v4, "X:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 16
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->X:Ljava/lang/String;

    goto :goto_1

    .line 17
    :cond_3
    aget-object v3, v2, v1

    const-string v4, "T:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 18
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->T:Ljava/lang/String;

    goto :goto_1

    .line 19
    :cond_4
    aget-object v3, v2, v1

    const-string v4, "C:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 20
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->C:Ljava/lang/String;

    goto :goto_1

    .line 21
    :cond_5
    aget-object v3, v2, v1

    const-string v4, "A:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 22
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->A:Ljava/lang/String;

    goto :goto_1

    .line 23
    :cond_6
    aget-object v3, v2, v1

    const-string v4, "B:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 24
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->B:Ljava/lang/String;

    goto :goto_1

    .line 25
    :cond_7
    aget-object v3, v2, v1

    const-string v4, "E:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 26
    aget-object v3, v2, v1

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/BizCard;->E:Ljava/lang/String;

    goto :goto_1
.end method

.method public static getC()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/scannerfire/model/BizCard;->C:Ljava/lang/String;

    return-object v0
.end method

.method public static getE()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    sget-object v0, Lcom/scannerfire/model/BizCard;->E:Ljava/lang/String;

    return-object v0
.end method

.method public static getN()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/scannerfire/model/BizCard;->N:Ljava/lang/String;

    return-object v0
.end method

.method public static getString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/scannerfire/model/BizCard;->N:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/scannerfire/model/BizCard;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getT()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/scannerfire/model/BizCard;->T:Ljava/lang/String;

    return-object v0
.end method

.method public static getX()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/scannerfire/model/BizCard;->X:Ljava/lang/String;

    return-object v0
.end method

.method public static setA(Ljava/lang/String;)V
    .locals 0
    .param p0, "a"    # Ljava/lang/String;

    .prologue
    .line 69
    sput-object p0, Lcom/scannerfire/model/BizCard;->A:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public static setB(Ljava/lang/String;)V
    .locals 0
    .param p0, "b"    # Ljava/lang/String;

    .prologue
    .line 77
    sput-object p0, Lcom/scannerfire/model/BizCard;->B:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public static setC(Ljava/lang/String;)V
    .locals 0
    .param p0, "c"    # Ljava/lang/String;

    .prologue
    .line 61
    sput-object p0, Lcom/scannerfire/model/BizCard;->C:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public static setE(Ljava/lang/String;)V
    .locals 0
    .param p0, "e"    # Ljava/lang/String;

    .prologue
    .line 85
    sput-object p0, Lcom/scannerfire/model/BizCard;->E:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public static setN(Ljava/lang/String;)V
    .locals 0
    .param p0, "n"    # Ljava/lang/String;

    .prologue
    .line 37
    sput-object p0, Lcom/scannerfire/model/BizCard;->N:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public static setT(Ljava/lang/String;)V
    .locals 0
    .param p0, "t"    # Ljava/lang/String;

    .prologue
    .line 53
    sput-object p0, Lcom/scannerfire/model/BizCard;->T:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public static setX(Ljava/lang/String;)V
    .locals 0
    .param p0, "x"    # Ljava/lang/String;

    .prologue
    .line 45
    sput-object p0, Lcom/scannerfire/model/BizCard;->X:Ljava/lang/String;

    .line 46
    return-void
.end method
