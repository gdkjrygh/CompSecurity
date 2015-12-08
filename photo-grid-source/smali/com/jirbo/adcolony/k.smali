.class Lcom/jirbo/adcolony/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/jirbo/adcolony/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 5
    new-instance v0, Lcom/jirbo/adcolony/z;

    invoke-direct {v0}, Lcom/jirbo/adcolony/z;-><init>()V

    sput-object v0, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(I)I
    .locals 1

    .prologue
    .line 253
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    add-int/lit8 v0, p0, -0x30

    .line 256
    :goto_0
    return v0

    .line 254
    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 255
    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 256
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$i;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/jirbo/adcolony/f;->b()Lcom/jirbo/adcolony/s;

    move-result-object v0

    .line 57
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 58
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    goto :goto_0
.end method

.method static a(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v3, 0x74

    const/16 v5, 0x6e

    const/16 v4, 0x66

    .line 99
    :try_start_0
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 101
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v0

    .line 102
    const/16 v2, 0x7b

    if-ne v0, v2, :cond_0

    invoke-static {p0}, Lcom/jirbo/adcolony/k;->c(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 139
    :goto_0
    return-object v0

    .line 103
    :cond_0
    const/16 v2, 0x5b

    if-ne v0, v2, :cond_1

    invoke-static {p0}, Lcom/jirbo/adcolony/k;->d(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v0

    goto :goto_0

    .line 105
    :cond_1
    const/16 v2, 0x2d

    if-ne v0, v2, :cond_2

    invoke-static {p0}, Lcom/jirbo/adcolony/k;->h(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    goto :goto_0

    .line 106
    :cond_2
    const/16 v2, 0x30

    if-lt v0, v2, :cond_3

    const/16 v2, 0x39

    if-gt v0, v2, :cond_3

    invoke-static {p0}, Lcom/jirbo/adcolony/k;->h(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    goto :goto_0

    .line 108
    :cond_3
    const/16 v2, 0x22

    if-eq v0, v2, :cond_4

    const/16 v2, 0x27

    if-ne v0, v2, :cond_9

    .line 110
    :cond_4
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->e(Lcom/jirbo/adcolony/s;)Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Lcom/jirbo/adcolony/ADCData$f;

    const-string v2, ""

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/ADCData$f;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 139
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 113
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 114
    if-ne v0, v3, :cond_6

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->a:Lcom/jirbo/adcolony/ADCData$i;

    goto :goto_0

    .line 115
    :cond_6
    if-ne v0, v4, :cond_7

    const-string v3, "false"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->b:Lcom/jirbo/adcolony/ADCData$i;

    goto :goto_0

    .line 116
    :cond_7
    if-ne v0, v5, :cond_8

    const-string v0, "null"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->c:Lcom/jirbo/adcolony/ADCData$i;

    goto :goto_0

    .line 118
    :cond_8
    new-instance v0, Lcom/jirbo/adcolony/ADCData$f;

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/ADCData$f;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 120
    :cond_9
    const/16 v2, 0x61

    if-lt v0, v2, :cond_a

    const/16 v2, 0x7a

    if-le v0, v2, :cond_c

    :cond_a
    const/16 v2, 0x41

    if-lt v0, v2, :cond_b

    const/16 v2, 0x5a

    if-le v0, v2, :cond_c

    :cond_b
    const/16 v2, 0x5f

    if-eq v0, v2, :cond_c

    const/16 v2, 0x24

    if-ne v0, v2, :cond_11

    .line 122
    :cond_c
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->g(Lcom/jirbo/adcolony/s;)Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_d

    new-instance v0, Lcom/jirbo/adcolony/ADCData$f;

    const-string v2, ""

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/ADCData$f;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 125
    :cond_d
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 126
    if-ne v0, v3, :cond_e

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->a:Lcom/jirbo/adcolony/ADCData$i;

    goto/16 :goto_0

    .line 127
    :cond_e
    if-ne v0, v4, :cond_f

    const-string v3, "false"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->b:Lcom/jirbo/adcolony/ADCData$i;

    goto/16 :goto_0

    .line 128
    :cond_f
    if-ne v0, v5, :cond_10

    const-string v0, "null"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->c:Lcom/jirbo/adcolony/ADCData$i;

    goto/16 :goto_0

    .line 130
    :cond_10
    new-instance v0, Lcom/jirbo/adcolony/ADCData$f;

    invoke-direct {v0, v2}, Lcom/jirbo/adcolony/ADCData$f;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :cond_11
    move-object v0, v1

    .line 134
    goto/16 :goto_0
.end method

.method static a(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$i;
    .locals 1

    .prologue
    .line 77
    if-nez p0, :cond_0

    const/4 v0, 0x0

    .line 78
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/jirbo/adcolony/s;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/s;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    goto :goto_0
.end method

.method static a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$c;)V
    .locals 3

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/jirbo/adcolony/f;->a()Lcom/jirbo/adcolony/y;

    move-result-object v0

    .line 41
    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/af;)V

    .line 44
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->d()V

    .line 51
    :goto_0
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->b()V

    .line 52
    return-void

    .line 48
    :cond_0
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "Saving empty property list."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 49
    const-string v1, "[]"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$g;)V
    .locals 3

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/jirbo/adcolony/f;->a()Lcom/jirbo/adcolony/y;

    move-result-object v0

    .line 25
    if-eqz p1, :cond_0

    .line 27
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$g;->a(Lcom/jirbo/adcolony/af;)V

    .line 28
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->d()V

    .line 35
    :goto_0
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->b()V

    .line 36
    return-void

    .line 32
    :cond_0
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "Saving empty property table."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 33
    const-string v1, "{}"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$i;)V
    .locals 2

    .prologue
    .line 9
    invoke-virtual {p0}, Lcom/jirbo/adcolony/f;->a()Lcom/jirbo/adcolony/y;

    move-result-object v0

    .line 10
    if-nez p1, :cond_0

    .line 12
    const-string v1, "null"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 19
    :goto_0
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->b()V

    .line 20
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/ADCData$i;->a(Lcom/jirbo/adcolony/af;)V

    .line 17
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->d()V

    goto :goto_0
.end method

.method public static a([Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 368
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "==== ADCJSON Test ===="

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 372
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "test.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    .line 373
    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;

    .line 374
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "test2.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/jirbo/adcolony/f;

    const-string v2, "test.txt"

    invoke-direct {v1, v2}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 375
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "test3.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/jirbo/adcolony/f;

    const-string v2, "test2.txt"

    invoke-direct {v1, v2}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 376
    return-void
.end method

.method static b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;
    .locals 2

    .prologue
    .line 63
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->m()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 65
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->n()Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    goto :goto_0
.end method

.method static b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;
    .locals 2

    .prologue
    .line 83
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    .line 84
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->m()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 85
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->n()Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    goto :goto_0
.end method

.method static b(Lcom/jirbo/adcolony/s;)V
    .locals 2

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v0

    .line 146
    :goto_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    if-le v0, v1, :cond_0

    const/16 v1, 0x7e

    if-le v0, v1, :cond_1

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    .line 149
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v0

    goto :goto_0

    .line 151
    :cond_1
    return-void
.end method

.method static c(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 2

    .prologue
    .line 70
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    .line 71
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->f()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 72
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->h()Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v0

    goto :goto_0
.end method

.method static c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 2

    .prologue
    .line 90
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->f()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 92
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->h()Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v0

    goto :goto_0
.end method

.method static c(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$g;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/16 v6, 0x7d

    const/4 v3, 0x1

    .line 155
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 157
    const/16 v1, 0x7b

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v1

    if-nez v1, :cond_1

    .line 189
    :cond_0
    :goto_0
    return-object v0

    .line 159
    :cond_1
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 161
    new-instance v1, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 162
    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    move v2, v3

    .line 165
    :goto_1
    if-nez v2, :cond_3

    const/16 v2, 0x2c

    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 167
    :cond_3
    const/4 v2, 0x0

    .line 169
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->g(Lcom/jirbo/adcolony/s;)Ljava/lang/String;

    move-result-object v4

    .line 170
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 172
    const/16 v5, 0x3a

    invoke-virtual {p0, v5}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v5

    if-nez v5, :cond_4

    .line 174
    invoke-virtual {v1, v4, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 184
    :goto_2
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    goto :goto_1

    .line 178
    :cond_4
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 180
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v5

    .line 181
    invoke-virtual {v1, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    goto :goto_2

    .line 187
    :cond_5
    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 189
    goto :goto_0
.end method

.method static d(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/16 v4, 0x5d

    .line 194
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 196
    const/16 v1, 0x5b

    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v1

    if-nez v1, :cond_1

    .line 213
    :cond_0
    :goto_0
    return-object v0

    .line 198
    :cond_1
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 200
    new-instance v1, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v1}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    .line 201
    invoke-virtual {p0, v4}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v0, v1

    goto :goto_0

    .line 203
    :cond_2
    const/4 v2, 0x1

    .line 204
    :goto_1
    if-nez v2, :cond_3

    const/16 v2, 0x2c

    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 206
    :cond_3
    const/4 v2, 0x0

    .line 207
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 208
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    goto :goto_1

    .line 211
    :cond_4
    invoke-virtual {p0, v4}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 213
    goto :goto_0
.end method

.method static e(Lcom/jirbo/adcolony/s;)Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v1, 0x27

    const/16 v0, 0x22

    .line 218
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 221
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 224
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v0, ""

    .line 248
    :goto_1
    return-object v0

    .line 222
    :cond_1
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 226
    :cond_2
    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/z;->a()V

    .line 227
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    move-result v1

    .line 228
    :goto_2
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v2

    if-eqz v2, :cond_a

    if-eq v1, v0, :cond_a

    .line 230
    const/16 v2, 0x5c

    if-ne v1, v2, :cond_9

    .line 232
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    move-result v1

    .line 233
    const/16 v2, 0x62

    if-ne v1, v2, :cond_3

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    .line 245
    :goto_3
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    move-result v1

    goto :goto_2

    .line 234
    :cond_3
    const/16 v2, 0x66

    if-ne v1, v2, :cond_4

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 235
    :cond_4
    const/16 v2, 0x6e

    if-ne v1, v2, :cond_5

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 236
    :cond_5
    const/16 v2, 0x72

    if-ne v1, v2, :cond_6

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 237
    :cond_6
    const/16 v2, 0x74

    if-ne v1, v2, :cond_7

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 238
    :cond_7
    const/16 v2, 0x75

    if-ne v1, v2, :cond_8

    sget-object v1, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-static {p0}, Lcom/jirbo/adcolony/k;->f(Lcom/jirbo/adcolony/s;)C

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 239
    :cond_8
    sget-object v2, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 243
    :cond_9
    sget-object v2, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/z;->b(C)V

    goto :goto_3

    .line 248
    :cond_a
    sget-object v0, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/z;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1
.end method

.method static f(Lcom/jirbo/adcolony/s;)C
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 261
    move v1, v0

    .line 262
    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    .line 264
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 266
    shl-int/lit8 v0, v0, 0x4

    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    move-result v2

    invoke-static {v2}, Lcom/jirbo/adcolony/k;->a(I)I

    move-result v2

    or-int/2addr v0, v2

    .line 262
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 269
    :cond_1
    int-to-char v0, v0

    return v0
.end method

.method static g(Lcom/jirbo/adcolony/s;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 274
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 276
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v1

    .line 277
    const/16 v0, 0x22

    if-eq v1, v0, :cond_0

    const/16 v0, 0x27

    if-ne v1, v0, :cond_1

    .line 279
    :cond_0
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->e(Lcom/jirbo/adcolony/s;)Ljava/lang/String;

    move-result-object v0

    .line 299
    :goto_0
    return-object v0

    .line 283
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/z;->a()V

    .line 284
    const/4 v0, 0x0

    .line 285
    :goto_1
    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 287
    const/16 v2, 0x61

    if-lt v1, v2, :cond_2

    const/16 v2, 0x7a

    if-le v1, v2, :cond_4

    :cond_2
    const/16 v2, 0x41

    if-lt v1, v2, :cond_3

    const/16 v2, 0x5a

    if-le v1, v2, :cond_4

    :cond_3
    const/16 v2, 0x5f

    if-eq v1, v2, :cond_4

    const/16 v2, 0x24

    if-ne v1, v2, :cond_5

    .line 289
    :cond_4
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    .line 290
    sget-object v2, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    int-to-char v1, v1

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/z;->b(C)V

    .line 291
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v1

    goto :goto_1

    .line 295
    :cond_5
    const/4 v0, 0x1

    goto :goto_1

    .line 299
    :cond_6
    sget-object v0, Lcom/jirbo/adcolony/k;->a:Lcom/jirbo/adcolony/z;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/z;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static h(Lcom/jirbo/adcolony/s;)Lcom/jirbo/adcolony/ADCData$i;
    .locals 12

    .prologue
    .line 306
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 308
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 309
    const/16 v2, 0x2d

    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 311
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 312
    invoke-static {p0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/s;)V

    .line 315
    :cond_0
    const-wide/16 v4, 0x0

    .line 316
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v2

    .line 317
    :goto_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-gt v2, v3, :cond_1

    .line 319
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    .line 320
    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    mul-double/2addr v4, v6

    add-int/lit8 v2, v2, -0x30

    int-to-double v2, v2

    add-double/2addr v4, v2

    .line 321
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v2

    goto :goto_0

    .line 324
    :cond_1
    const/4 v2, 0x0

    .line 326
    const/16 v3, 0x2e

    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 328
    const/4 v9, 0x1

    .line 329
    const-wide/16 v6, 0x0

    .line 330
    const-wide/16 v2, 0x0

    .line 331
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v8

    .line 332
    :goto_1
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x30

    if-lt v8, v10, :cond_2

    const/16 v10, 0x39

    if-gt v8, v10, :cond_2

    .line 334
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    .line 335
    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    mul-double/2addr v6, v10

    add-int/lit8 v8, v8, -0x30

    int-to-double v10, v8

    add-double/2addr v6, v10

    .line 336
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v10

    .line 337
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v8

    goto :goto_1

    .line 339
    :cond_2
    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    invoke-static {v10, v11, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    div-double v2, v6, v2

    add-double/2addr v4, v2

    move v2, v9

    .line 342
    :cond_3
    const/16 v3, 0x65

    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v3

    if-nez v3, :cond_4

    const/16 v3, 0x45

    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 344
    :cond_4
    const/4 v3, 0x0

    .line 345
    const/16 v6, 0x2b

    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v6

    if-nez v6, :cond_5

    const/16 v6, 0x2d

    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/s;->a(C)Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v3, 0x1

    .line 347
    :cond_5
    const-wide/16 v6, 0x0

    .line 348
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v8

    .line 349
    :goto_2
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->a()Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x30

    if-lt v8, v9, :cond_6

    const/16 v9, 0x39

    if-gt v8, v9, :cond_6

    .line 351
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->c()C

    .line 352
    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    mul-double/2addr v6, v10

    add-int/lit8 v8, v8, -0x30

    int-to-double v8, v8

    add-double/2addr v6, v8

    .line 353
    invoke-virtual {p0}, Lcom/jirbo/adcolony/s;->b()C

    move-result v8

    goto :goto_2

    .line 356
    :cond_6
    if-eqz v3, :cond_9

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    div-double/2addr v4, v6

    .line 360
    :cond_7
    :goto_3
    mul-double/2addr v4, v0

    .line 362
    if-nez v2, :cond_8

    double-to-int v0, v4

    int-to-double v0, v0

    cmpl-double v0, v4, v0

    if-eqz v0, :cond_a

    :cond_8
    new-instance v0, Lcom/jirbo/adcolony/ADCData$e;

    invoke-direct {v0, v4, v5}, Lcom/jirbo/adcolony/ADCData$e;-><init>(D)V

    .line 363
    :goto_4
    return-object v0

    .line 357
    :cond_9
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    mul-double/2addr v4, v6

    goto :goto_3

    .line 363
    :cond_a
    new-instance v0, Lcom/jirbo/adcolony/ADCData$b;

    double-to-int v1, v4

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCData$b;-><init>(I)V

    goto :goto_4
.end method
