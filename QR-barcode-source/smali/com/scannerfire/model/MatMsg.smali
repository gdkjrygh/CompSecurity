.class public Lcom/scannerfire/model/MatMsg;
.super Ljava/lang/Object;
.source "MatMsg.java"


# static fields
.field private static BODY:Ljava/lang/String;

.field private static SUB:Ljava/lang/String;

.field private static TO:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBODY()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lcom/scannerfire/model/MatMsg;->BODY:Ljava/lang/String;

    return-object v0
.end method

.method public static getMatMsgFromString(Ljava/lang/String;)Lcom/scannerfire/model/MatMsg;
    .locals 6
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 8
    const-string v3, "MATMSG:"

    const-string v4, ""

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 9
    const-string v3, "\n"

    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 10
    .local v2, "strings":[Ljava/lang/String;
    new-instance v1, Lcom/scannerfire/model/MatMsg;

    invoke-direct {v1}, Lcom/scannerfire/model/MatMsg;-><init>()V

    .line 11
    .local v1, "msg":Lcom/scannerfire/model/MatMsg;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v3, v2

    if-lt v0, v3, :cond_0

    .line 21
    return-object v1

    .line 12
    :cond_0
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v5, v2, v0

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 13
    aget-object v3, v2, v0

    const-string v4, "TO:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 14
    aget-object v3, v2, v0

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/MatMsg;->TO:Ljava/lang/String;

    .line 11
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 15
    :cond_2
    aget-object v3, v2, v0

    const-string v4, "SUB:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 16
    aget-object v3, v2, v0

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/MatMsg;->SUB:Ljava/lang/String;

    goto :goto_1

    .line 17
    :cond_3
    aget-object v3, v2, v0

    const-string v4, "BODY:"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 18
    aget-object v3, v2, v0

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/scannerfire/model/MatMsg;->BODY:Ljava/lang/String;

    goto :goto_1
.end method

.method public static getSUB()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/scannerfire/model/MatMsg;->SUB:Ljava/lang/String;

    return-object v0
.end method

.method public static getString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/scannerfire/model/MatMsg;->TO:Ljava/lang/String;

    return-object v0
.end method

.method public static getTO()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/scannerfire/model/MatMsg;->TO:Ljava/lang/String;

    return-object v0
.end method

.method public static setBODY(Ljava/lang/String;)V
    .locals 0
    .param p0, "bODY"    # Ljava/lang/String;

    .prologue
    .line 57
    sput-object p0, Lcom/scannerfire/model/MatMsg;->BODY:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public static setSUB(Ljava/lang/String;)V
    .locals 0
    .param p0, "sUB"    # Ljava/lang/String;

    .prologue
    .line 45
    sput-object p0, Lcom/scannerfire/model/MatMsg;->SUB:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public static setTO(Ljava/lang/String;)V
    .locals 0
    .param p0, "tO"    # Ljava/lang/String;

    .prologue
    .line 33
    sput-object p0, Lcom/scannerfire/model/MatMsg;->TO:Ljava/lang/String;

    .line 34
    return-void
.end method
