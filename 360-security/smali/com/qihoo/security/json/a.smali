.class public final Lcom/qihoo/security/json/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/json/a$1;
    }
.end annotation


# instance fields
.field private final a:Lcom/qihoo/security/json/c;

.field private final b:Ljava/io/Reader;

.field private c:Z

.field private final d:[C

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/json/b;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/qihoo/security/json/JsonToken;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Z


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    new-instance v0, Lcom/qihoo/security/json/c;

    invoke-direct {v0}, Lcom/qihoo/security/json/c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/json/a;->a:Lcom/qihoo/security/json/c;

    .line 187
    iput-boolean v1, p0, Lcom/qihoo/security/json/a;->c:Z

    .line 195
    const/16 v0, 0x400

    new-array v0, v0, [C

    iput-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    .line 196
    iput v1, p0, Lcom/qihoo/security/json/a;->e:I

    .line 197
    iput v1, p0, Lcom/qihoo/security/json/a;->f:I

    .line 202
    iput v2, p0, Lcom/qihoo/security/json/a;->g:I

    .line 203
    iput v2, p0, Lcom/qihoo/security/json/a;->h:I

    .line 205
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    .line 207
    sget-object v0, Lcom/qihoo/security/json/b;->f:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Lcom/qihoo/security/json/b;)V

    .line 228
    iput-boolean v1, p0, Lcom/qihoo/security/json/a;->o:Z

    .line 234
    if-nez p1, :cond_0

    .line 235
    new-instance v0, Ljava/lang/NullPointerException;

    const-string/jumbo v1, "in == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 237
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/json/a;->b:Ljava/io/Reader;

    .line 238
    return-void
.end method

.method private a(Z)Lcom/qihoo/security/json/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 586
    if-eqz p1, :cond_0

    .line 587
    sget-object v0, Lcom/qihoo/security/json/b;->b:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Lcom/qihoo/security/json/b;)V

    .line 603
    :goto_0
    :sswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 618
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 619
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->j()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    :goto_1
    return-object v0

    .line 590
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 599
    const-string/jumbo v0, "Unterminated array"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 592
    :sswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->h()Lcom/qihoo/security/json/b;

    .line 593
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_ARRAY:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_1

    .line 595
    :sswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    goto :goto_0

    .line 605
    :sswitch_3
    if-eqz p1, :cond_1

    .line 606
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->h()Lcom/qihoo/security/json/b;

    .line 607
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_ARRAY:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_1

    .line 613
    :cond_1
    :sswitch_4
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 614
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 615
    const-string/jumbo v0, "null"

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 616
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->NULL:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_1

    .line 603
    nop

    :sswitch_data_0
    .sparse-switch
        0x2c -> :sswitch_4
        0x3b -> :sswitch_4
        0x5d -> :sswitch_3
    .end sparse-switch

    .line 590
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_0
        0x3b -> :sswitch_2
        0x5d -> :sswitch_1
    .end sparse-switch
.end method

.method private a([CII)Lcom/qihoo/security/json/JsonToken;
    .locals 7

    .prologue
    const/16 v5, 0x2d

    const/16 v4, 0x39

    const/16 v3, 0x30

    .line 1107
    .line 1108
    aget-char v0, p1, p2

    .line 1110
    if-ne v0, v5, :cond_a

    .line 1111
    add-int/lit8 v1, p2, 0x1

    aget-char v0, p1, v1

    .line 1114
    :goto_0
    if-ne v0, v3, :cond_1

    .line 1115
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 1125
    :cond_0
    const/16 v2, 0x2e

    if-ne v0, v2, :cond_3

    .line 1126
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 1127
    :goto_1
    if-lt v0, v3, :cond_3

    if-gt v0, v4, :cond_3

    .line 1128
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    goto :goto_1

    .line 1116
    :cond_1
    const/16 v2, 0x31

    if-lt v0, v2, :cond_2

    if-gt v0, v4, :cond_2

    .line 1117
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 1118
    :goto_2
    if-lt v0, v3, :cond_0

    if-gt v0, v4, :cond_0

    .line 1119
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    goto :goto_2

    .line 1122
    :cond_2
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    .line 1150
    :goto_3
    return-object v0

    :cond_3
    move v6, v0

    move v0, v1

    move v1, v6

    .line 1132
    const/16 v2, 0x65

    if-eq v1, v2, :cond_4

    const/16 v2, 0x45

    if-ne v1, v2, :cond_8

    .line 1133
    :cond_4
    add-int/lit8 v1, v0, 0x1

    aget-char v0, p1, v1

    .line 1134
    const/16 v2, 0x2b

    if-eq v0, v2, :cond_5

    if-ne v0, v5, :cond_6

    .line 1135
    :cond_5
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    .line 1137
    :cond_6
    if-lt v0, v3, :cond_7

    if-gt v0, v4, :cond_7

    .line 1138
    add-int/lit8 v1, v1, 0x1

    aget-char v0, p1, v1

    move v6, v0

    move v0, v1

    move v1, v6

    .line 1139
    :goto_4
    if-lt v1, v3, :cond_8

    if-gt v1, v4, :cond_8

    .line 1140
    add-int/lit8 v1, v0, 0x1

    aget-char v0, p1, v1

    move v6, v0

    move v0, v1

    move v1, v6

    goto :goto_4

    .line 1143
    :cond_7
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    goto :goto_3

    .line 1147
    :cond_8
    add-int v1, p2, p3

    if-ne v0, v1, :cond_9

    .line 1148
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->NUMBER:Lcom/qihoo/security/json/JsonToken;

    goto :goto_3

    .line 1150
    :cond_9
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    goto :goto_3

    :cond_a
    move v1, p2

    goto :goto_0
.end method

.method private a(C)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 880
    const/4 v0, 0x0

    .line 883
    :cond_0
    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    .line 884
    :goto_0
    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    iget v3, p0, Lcom/qihoo/security/json/a;->f:I

    if-ge v2, v3, :cond_5

    .line 885
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v2, v2, v3

    .line 887
    if-ne v2, p1, :cond_3

    .line 888
    iget-boolean v2, p0, Lcom/qihoo/security/json/a;->o:Z

    if-eqz v2, :cond_1

    .line 889
    const-string/jumbo v0, "skipped!"

    .line 894
    :goto_1
    return-object v0

    .line 890
    :cond_1
    if-nez v0, :cond_2

    .line 891
    iget-object v0, p0, Lcom/qihoo/security/json/a;->a:Lcom/qihoo/security/json/c;

    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v2, v1, v3}, Lcom/qihoo/security/json/c;->a([CII)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 893
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v2, v1, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 894
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 897
    :cond_3
    const/16 v3, 0x5c

    if-ne v2, v3, :cond_7

    .line 898
    if-nez v0, :cond_4

    .line 899
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 901
    :cond_4
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v2, v1, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 902
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->p()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 903
    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    move v5, v1

    move-object v1, v0

    move v0, v5

    :goto_2
    move v5, v0

    move-object v0, v1

    move v1, v5

    .line 905
    goto :goto_0

    .line 907
    :cond_5
    if-nez v0, :cond_6

    .line 908
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 910
    :cond_6
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v1, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 911
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 913
    const-string/jumbo v0, "Unterminated string"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_7
    move v5, v1

    move-object v1, v0

    move v0, v5

    goto :goto_2
.end method

.method private a(Lcom/qihoo/security/json/JsonToken;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 308
    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    if-eq v0, p1, :cond_0

    .line 310
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->f()Lcom/qihoo/security/json/JsonToken;

    .line 313
    return-void
.end method

.method private a(Lcom/qihoo/security/json/b;)V
    .locals 1

    .prologue
    .line 575
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    return-void
.end method

.method private a(I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 724
    move v0, v1

    :goto_0
    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    if-ge v0, v3, :cond_1

    .line 725
    iget-object v3, p0, Lcom/qihoo/security/json/a;->d:[C

    aget-char v3, v3, v0

    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    .line 726
    iget v3, p0, Lcom/qihoo/security/json/a;->g:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/qihoo/security/json/a;->g:I

    .line 727
    iput v2, p0, Lcom/qihoo/security/json/a;->h:I

    .line 724
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 729
    :cond_0
    iget v3, p0, Lcom/qihoo/security/json/a;->h:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/qihoo/security/json/a;->h:I

    goto :goto_1

    .line 733
    :cond_1
    iget v0, p0, Lcom/qihoo/security/json/a;->f:I

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    if-eq v0, v3, :cond_5

    .line 734
    iget v0, p0, Lcom/qihoo/security/json/a;->f:I

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/qihoo/security/json/a;->f:I

    .line 735
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    iget-object v4, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v5, p0, Lcom/qihoo/security/json/a;->f:I

    invoke-static {v0, v3, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 740
    :goto_2
    iput v1, p0, Lcom/qihoo/security/json/a;->e:I

    .line 742
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/json/a;->b:Ljava/io/Reader;

    iget-object v3, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v4, p0, Lcom/qihoo/security/json/a;->f:I

    iget-object v5, p0, Lcom/qihoo/security/json/a;->d:[C

    array-length v5, v5

    iget v6, p0, Lcom/qihoo/security/json/a;->f:I

    sub-int/2addr v5, v6

    invoke-virtual {v0, v3, v4, v5}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    .line 743
    iget v3, p0, Lcom/qihoo/security/json/a;->f:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/qihoo/security/json/a;->f:I

    .line 746
    iget v0, p0, Lcom/qihoo/security/json/a;->g:I

    if-ne v0, v2, :cond_3

    iget v0, p0, Lcom/qihoo/security/json/a;->h:I

    if-ne v0, v2, :cond_3

    iget v0, p0, Lcom/qihoo/security/json/a;->f:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    aget-char v0, v0, v1

    const v3, 0xfeff

    if-ne v0, v3, :cond_3

    .line 748
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 749
    iget v0, p0, Lcom/qihoo/security/json/a;->h:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->h:I

    .line 752
    :cond_3
    iget v0, p0, Lcom/qihoo/security/json/a;->f:I

    if-lt v0, p1, :cond_2

    move v1, v2

    .line 756
    :cond_4
    return v1

    .line 737
    :cond_5
    iput v1, p0, Lcom/qihoo/security/json/a;->f:I

    goto :goto_2
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 858
    :goto_0
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    iget v2, p0, Lcom/qihoo/security/json/a;->f:I

    if-le v0, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v1

    .line 859
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 860
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/2addr v3, v0

    aget-char v2, v2, v3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_1

    .line 858
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    goto :goto_0

    .line 859
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 864
    :cond_2
    const/4 v1, 0x1

    .line 866
    :cond_3
    return v1
.end method

.method private b(Z)Lcom/qihoo/security/json/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 629
    if-eqz p1, :cond_0

    .line 631
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 636
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 652
    :sswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    .line 653
    sparse-switch v0, :sswitch_data_0

    .line 660
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 661
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 662
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->c(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->k:Ljava/lang/String;

    .line 663
    iget-object v0, p0, Lcom/qihoo/security/json/a;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 664
    const-string/jumbo v0, "Expected name"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 633
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->h()Lcom/qihoo/security/json/b;

    .line 634
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_OBJECT:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 669
    :goto_0
    return-object v0

    .line 639
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 647
    const-string/jumbo v0, "Unterminated object"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 641
    :sswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->h()Lcom/qihoo/security/json/b;

    .line 642
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_OBJECT:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 655
    :sswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 657
    :sswitch_3
    int-to-char v0, v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->k:Ljava/lang/String;

    .line 668
    :cond_1
    sget-object v0, Lcom/qihoo/security/json/b;->d:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Lcom/qihoo/security/json/b;)V

    .line 669
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->NAME:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 631
    nop

    :pswitch_data_0
    .packed-switch 0x7d
        :pswitch_0
    .end packed-switch

    .line 653
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
    .end sparse-switch

    .line 639
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_0
        0x3b -> :sswitch_0
        0x7d -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Ljava/lang/String;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1159
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " at line "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/qihoo/security/json/a;->k()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/qihoo/security/json/a;->l()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b(Lcom/qihoo/security/json/b;)V
    .locals 2

    .prologue
    .line 582
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 583
    return-void
.end method

.method private c(Z)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 925
    .line 926
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->m:I

    .line 927
    iput v2, p0, Lcom/qihoo/security/json/a;->n:I

    move v1, v2

    move-object v0, v3

    .line 932
    :cond_0
    :goto_0
    iget v4, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/2addr v4, v1

    iget v5, p0, Lcom/qihoo/security/json/a;->f:I

    if-ge v4, v5, :cond_1

    .line 933
    iget-object v4, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v5, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/2addr v5, v1

    aget-char v4, v4, v5

    sparse-switch v4, :sswitch_data_0

    .line 932
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 939
    :sswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 983
    :goto_1
    :sswitch_1
    if-eqz p1, :cond_4

    if-nez v0, :cond_4

    .line 984
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    iput v0, p0, Lcom/qihoo/security/json/a;->m:I

    .line 994
    :goto_2
    iget v0, p0, Lcom/qihoo/security/json/a;->n:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/json/a;->n:I

    .line 995
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 996
    return-object v3

    .line 960
    :cond_1
    iget-object v4, p0, Lcom/qihoo/security/json/a;->d:[C

    array-length v4, v4

    if-ge v1, v4, :cond_2

    .line 961
    add-int/lit8 v4, v1, 0x1

    invoke-direct {p0, v4}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 964
    iget-object v4, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v5, p0, Lcom/qihoo/security/json/a;->f:I

    aput-char v2, v4, v5

    goto :goto_1

    .line 970
    :cond_2
    if-nez v0, :cond_3

    .line 971
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 973
    :cond_3
    iget-object v4, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v5, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {v0, v4, v5, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 974
    iget v4, p0, Lcom/qihoo/security/json/a;->n:I

    add-int/2addr v4, v1

    iput v4, p0, Lcom/qihoo/security/json/a;->n:I

    .line 975
    iget v4, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/2addr v1, v4

    iput v1, p0, Lcom/qihoo/security/json/a;->e:I

    .line 977
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_7

    move v1, v2

    .line 978
    goto :goto_1

    .line 986
    :cond_4
    iget-boolean v2, p0, Lcom/qihoo/security/json/a;->o:Z

    if-eqz v2, :cond_5

    .line 987
    const-string/jumbo v3, "skipped!"

    goto :goto_2

    .line 988
    :cond_5
    if-nez v0, :cond_6

    .line 989
    iget-object v0, p0, Lcom/qihoo/security/json/a;->a:Lcom/qihoo/security/json/c;

    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {v0, v2, v3, v1}, Lcom/qihoo/security/json/c;->a([CII)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    .line 991
    :cond_6
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 992
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_7
    move v1, v2

    goto/16 :goto_0

    .line 933
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
        0xc -> :sswitch_1
        0xd -> :sswitch_1
        0x20 -> :sswitch_1
        0x23 -> :sswitch_0
        0x2c -> :sswitch_1
        0x2f -> :sswitch_0
        0x3a -> :sswitch_1
        0x3b -> :sswitch_0
        0x3d -> :sswitch_0
        0x5b -> :sswitch_1
        0x5c -> :sswitch_0
        0x5d -> :sswitch_1
        0x7b -> :sswitch_1
        0x7d -> :sswitch_1
    .end sparse-switch
.end method

.method private f()Lcom/qihoo/security/json/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 371
    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    .line 373
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 374
    iput-object v1, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 375
    iput-object v1, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 376
    iput-object v1, p0, Lcom/qihoo/security/json/a;->k:Ljava/lang/String;

    .line 377
    return-object v0
.end method

.method private g()Lcom/qihoo/security/json/b;
    .locals 2

    .prologue
    .line 567
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/json/b;

    return-object v0
.end method

.method private h()Lcom/qihoo/security/json/b;
    .locals 2

    .prologue
    .line 571
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/json/b;

    return-object v0
.end method

.method private i()Lcom/qihoo/security/json/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 677
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 687
    :pswitch_0
    const-string/jumbo v0, "Expected \':\'"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 681
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 682
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v0, v0, v1

    const/16 v1, 0x3e

    if-ne v0, v1, :cond_1

    .line 683
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 690
    :cond_1
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/json/b;->e:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Lcom/qihoo/security/json/b;)V

    .line 691
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->j()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    return-object v0

    .line 677
    nop

    :pswitch_data_0
    .packed-switch 0x3a
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private j()Lcom/qihoo/security/json/JsonToken;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 695
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->m()I

    move-result v0

    .line 696
    sparse-switch v0, :sswitch_data_0

    .line 712
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 713
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->q()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    :goto_0
    return-object v0

    .line 698
    :sswitch_0
    sget-object v0, Lcom/qihoo/security/json/b;->c:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Lcom/qihoo/security/json/b;)V

    .line 699
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->BEGIN_OBJECT:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 702
    :sswitch_1
    sget-object v0, Lcom/qihoo/security/json/b;->a:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Lcom/qihoo/security/json/b;)V

    .line 703
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->BEGIN_ARRAY:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 706
    :sswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 708
    :sswitch_3
    int-to-char v0, v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 709
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 696
    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x27 -> :sswitch_2
        0x5b -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch
.end method

.method private k()I
    .locals 4

    .prologue
    .line 760
    iget v1, p0, Lcom/qihoo/security/json/a;->g:I

    .line 761
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    if-ge v0, v2, :cond_1

    .line 762
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    aget-char v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    .line 763
    add-int/lit8 v1, v1, 0x1

    .line 761
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 766
    :cond_1
    return v1
.end method

.method private l()I
    .locals 4

    .prologue
    .line 770
    iget v1, p0, Lcom/qihoo/security/json/a;->h:I

    .line 771
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    if-ge v0, v2, :cond_1

    .line 772
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    aget-char v2, v2, v0

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    .line 773
    const/4 v1, 0x1

    .line 771
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 775
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 778
    :cond_1
    return v1
.end method

.method private m()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 782
    :goto_0
    :sswitch_0
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0, v3}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 783
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v0, v0, v1

    .line 784
    sparse-switch v0, :sswitch_data_0

    .line 829
    :cond_1
    :goto_1
    return v0

    .line 792
    :sswitch_1
    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    iget v2, p0, Lcom/qihoo/security/json/a;->f:I

    if-ne v1, v2, :cond_2

    invoke-direct {p0, v3}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 796
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 797
    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v1, v1, v2

    .line 798
    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    .line 801
    :sswitch_2
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 802
    const-string/jumbo v0, "*/"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 803
    const-string/jumbo v0, "Unterminated comment"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 805
    :cond_3
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    goto :goto_0

    .line 810
    :sswitch_3
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/json/a;->e:I

    .line 811
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->o()V

    goto :goto_0

    .line 824
    :sswitch_4
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 825
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->o()V

    goto :goto_0

    .line 833
    :cond_4
    new-instance v0, Ljava/io/EOFException;

    const-string/jumbo v1, "End of input"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 784
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x20 -> :sswitch_0
        0x23 -> :sswitch_4
        0x2f -> :sswitch_1
    .end sparse-switch

    .line 798
    :sswitch_data_1
    .sparse-switch
        0x2a -> :sswitch_2
        0x2f -> :sswitch_3
    .end sparse-switch
.end method

.method private n()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 837
    iget-boolean v0, p0, Lcom/qihoo/security/json/a;->c:Z

    if-nez v0, :cond_0

    .line 838
    const-string/jumbo v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 840
    :cond_0
    return-void
.end method

.method private o()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 848
    :cond_0
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 849
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v0, v0, v1

    .line 850
    const/16 v1, 0xd

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 854
    :cond_2
    return-void
.end method

.method private p()C
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x4

    .line 1013
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1014
    const-string/jumbo v0, "Unterminated escape sequence"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1017
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/qihoo/security/json/a;->e:I

    aget-char v0, v0, v1

    .line 1018
    sparse-switch v0, :sswitch_data_0

    .line 1046
    :goto_0
    return v0

    .line 1020
    :sswitch_0
    iget v0, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v0, v0, 0x4

    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    if-le v0, v1, :cond_1

    invoke-direct {p0, v3}, Lcom/qihoo/security/json/a;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1021
    const-string/jumbo v0, "Unterminated escape sequence"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1023
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/json/a;->a:Lcom/qihoo/security/json/c;

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/json/c;->a([CII)Ljava/lang/String;

    move-result-object v0

    .line 1024
    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/qihoo/security/json/a;->e:I

    .line 1025
    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    goto :goto_0

    .line 1028
    :sswitch_1
    const/16 v0, 0x9

    goto :goto_0

    .line 1031
    :sswitch_2
    const/16 v0, 0x8

    goto :goto_0

    .line 1034
    :sswitch_3
    const/16 v0, 0xa

    goto :goto_0

    .line 1037
    :sswitch_4
    const/16 v0, 0xd

    goto :goto_0

    .line 1040
    :sswitch_5
    const/16 v0, 0xc

    goto :goto_0

    .line 1018
    nop

    :sswitch_data_0
    .sparse-switch
        0x62 -> :sswitch_2
        0x66 -> :sswitch_5
        0x6e -> :sswitch_3
        0x72 -> :sswitch_4
        0x74 -> :sswitch_1
        0x75 -> :sswitch_0
    .end sparse-switch
.end method

.method private q()Lcom/qihoo/security/json/JsonToken;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1054
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->c(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 1055
    iget v0, p0, Lcom/qihoo/security/json/a;->n:I

    if-nez v0, :cond_0

    .line 1056
    const-string/jumbo v0, "Expected literal value"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 1058
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->r()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 1059
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v1, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    if-ne v0, v1, :cond_1

    .line 1060
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->n()V

    .line 1062
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    return-object v0
.end method

.method private r()Lcom/qihoo/security/json/JsonToken;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v7, 0x55

    const/16 v6, 0x45

    const/4 v5, 0x4

    const/16 v4, 0x6c

    const/16 v3, 0x4c

    .line 1069
    iget v0, p0, Lcom/qihoo/security/json/a;->m:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 1071
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    .line 1096
    :goto_0
    return-object v0

    .line 1072
    :cond_0
    iget v0, p0, Lcom/qihoo/security/json/a;->n:I

    if-ne v0, v5, :cond_5

    const/16 v0, 0x6e

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_1

    const/16 v0, 0x4e

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_5

    :cond_1
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    if-ne v7, v0, :cond_5

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_5

    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_5

    .line 1077
    :cond_4
    const-string/jumbo v0, "null"

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 1078
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->NULL:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 1079
    :cond_5
    iget v0, p0, Lcom/qihoo/security/json/a;->n:I

    if-ne v0, v5, :cond_a

    const/16 v0, 0x74

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_6

    const/16 v0, 0x54

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_a

    :cond_6
    const/16 v0, 0x72

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_7

    const/16 v0, 0x52

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_a

    :cond_7
    const/16 v0, 0x75

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x2

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_8

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v7, v0, :cond_a

    :cond_8
    const/16 v0, 0x65

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    if-ne v6, v0, :cond_a

    .line 1084
    :cond_9
    const-string/jumbo v0, "true"

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 1085
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->BOOLEAN:Lcom/qihoo/security/json/JsonToken;

    goto/16 :goto_0

    .line 1086
    :cond_a
    iget v0, p0, Lcom/qihoo/security/json/a;->n:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_10

    const/16 v0, 0x66

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_b

    const/16 v0, 0x46

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_b
    const/16 v0, 0x61

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_c

    const/16 v0, 0x41

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x1

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_c
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-eq v4, v0, :cond_d

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    if-ne v3, v0, :cond_10

    :cond_d
    const/16 v0, 0x73

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_e

    const/16 v0, 0x53

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x3

    aget-char v1, v1, v2

    if-ne v0, v1, :cond_10

    :cond_e
    const/16 v0, 0x65

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v2, v2, 0x4

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_f

    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    add-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    if-ne v6, v0, :cond_10

    .line 1092
    :cond_f
    const-string/jumbo v0, "false"

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 1093
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->BOOLEAN:Lcom/qihoo/security/json/JsonToken;

    goto/16 :goto_0

    .line 1095
    :cond_10
    iget-object v0, p0, Lcom/qihoo/security/json/a;->a:Lcom/qihoo/security/json/c;

    iget-object v1, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v2, p0, Lcom/qihoo/security/json/a;->m:I

    iget v3, p0, Lcom/qihoo/security/json/a;->n:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/json/c;->a([CII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 1096
    iget-object v0, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v1, p0, Lcom/qihoo/security/json/a;->m:I

    iget v2, p0, Lcom/qihoo/security/json/a;->n:I

    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/json/a;->a([CII)Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto/16 :goto_0
.end method

.method private s()Ljava/lang/CharSequence;
    .locals 5

    .prologue
    const/16 v4, 0x14

    .line 1164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1165
    iget v1, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1166
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1167
    iget v1, p0, Lcom/qihoo/security/json/a;->f:I

    iget v2, p0, Lcom/qihoo/security/json/a;->e:I

    sub-int/2addr v1, v2

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1168
    iget-object v2, p0, Lcom/qihoo/security/json/a;->d:[C

    iget v3, p0, Lcom/qihoo/security/json/a;->e:I

    invoke-virtual {v0, v2, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1169
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 277
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->BEGIN_ARRAY:Lcom/qihoo/security/json/JsonToken;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Lcom/qihoo/security/json/JsonToken;)V

    .line 278
    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 285
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_ARRAY:Lcom/qihoo/security/json/JsonToken;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->a(Lcom/qihoo/security/json/JsonToken;)V

    .line 286
    return-void
.end method

.method public c()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 319
    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    .line 320
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v1, Lcom/qihoo/security/json/JsonToken;->END_OBJECT:Lcom/qihoo/security/json/JsonToken;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v1, Lcom/qihoo/security/json/JsonToken;->END_ARRAY:Lcom/qihoo/security/json/JsonToken;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 534
    iput-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 535
    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 537
    iget-object v0, p0, Lcom/qihoo/security/json/a;->i:Ljava/util/List;

    sget-object v1, Lcom/qihoo/security/json/b;->h:Lcom/qihoo/security/json/b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    iget-object v0, p0, Lcom/qihoo/security/json/a;->b:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 539
    return-void
.end method

.method public d()Lcom/qihoo/security/json/JsonToken;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 327
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    if-eqz v0, :cond_1

    .line 328
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    .line 358
    :cond_0
    :goto_0
    return-object v0

    .line 331
    :cond_1
    sget-object v0, Lcom/qihoo/security/json/a$1;->a:[I

    invoke-direct {p0}, Lcom/qihoo/security/json/a;->g()Lcom/qihoo/security/json/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/json/b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 363
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 333
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/json/b;->g:Lcom/qihoo/security/json/b;

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Lcom/qihoo/security/json/b;)V

    .line 334
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->j()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    .line 335
    iget-boolean v1, p0, Lcom/qihoo/security/json/a;->c:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v2, Lcom/qihoo/security/json/JsonToken;->BEGIN_ARRAY:Lcom/qihoo/security/json/JsonToken;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v2, Lcom/qihoo/security/json/JsonToken;->BEGIN_OBJECT:Lcom/qihoo/security/json/JsonToken;

    if-eq v1, v2, :cond_0

    .line 336
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected JSON document to start with \'[\' or \'{\' but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 341
    :pswitch_1
    invoke-direct {p0, v3}, Lcom/qihoo/security/json/a;->a(Z)Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 343
    :pswitch_2
    invoke-direct {p0, v2}, Lcom/qihoo/security/json/a;->a(Z)Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 345
    :pswitch_3
    invoke-direct {p0, v3}, Lcom/qihoo/security/json/a;->b(Z)Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 347
    :pswitch_4
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->i()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 349
    :pswitch_5
    invoke-direct {p0, v2}, Lcom/qihoo/security/json/a;->b(Z)Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    goto :goto_0

    .line 352
    :pswitch_6
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->j()Lcom/qihoo/security/json/JsonToken;

    move-result-object v0

    .line 353
    iget-boolean v1, p0, Lcom/qihoo/security/json/a;->c:Z

    if-nez v1, :cond_0

    .line 356
    const-string/jumbo v0, "Expected EOF"

    invoke-direct {p0, v0}, Lcom/qihoo/security/json/a;->b(Ljava/lang/String;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    :catch_0
    move-exception v0

    .line 358
    sget-object v0, Lcom/qihoo/security/json/JsonToken;->END_DOCUMENT:Lcom/qihoo/security/json/JsonToken;

    iput-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    goto :goto_0

    .line 361
    :pswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public e()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 406
    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    .line 407
    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v1, Lcom/qihoo/security/json/JsonToken;->STRING:Lcom/qihoo/security/json/JsonToken;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/json/a;->j:Lcom/qihoo/security/json/JsonToken;

    sget-object v1, Lcom/qihoo/security/json/JsonToken;->NUMBER:Lcom/qihoo/security/json/JsonToken;

    if-eq v0, v1, :cond_0

    .line 408
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected a string but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/qihoo/security/json/a;->d()Lcom/qihoo/security/json/JsonToken;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/json/a;->l:Ljava/lang/String;

    .line 412
    invoke-direct {p0}, Lcom/qihoo/security/json/a;->f()Lcom/qihoo/security/json/JsonToken;

    .line 413
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1000
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " near "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/qihoo/security/json/a;->s()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
