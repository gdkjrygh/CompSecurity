.class public Lcom/scannerfire/model/VCard;
.super Ljava/lang/Object;
.source "VCard.java"


# instance fields
.field A:Ljava/lang/String;

.field B:Ljava/lang/String;

.field C:Ljava/lang/String;

.field E:Ljava/lang/String;

.field N:Ljava/lang/String;

.field T:Ljava/lang/String;

.field X:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBizCardFromString(Ljava/lang/String;)Lcom/scannerfire/model/VCard;
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
    new-instance v0, Lcom/scannerfire/model/VCard;

    invoke-direct {v0}, Lcom/scannerfire/model/VCard;-><init>()V

    .line 11
    .local v0, "biz":Lcom/scannerfire/model/VCard;
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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->N:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->X:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->T:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->C:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->A:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->B:Ljava/lang/String;

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

    iput-object v3, v0, Lcom/scannerfire/model/VCard;->E:Ljava/lang/String;

    goto :goto_1
.end method
