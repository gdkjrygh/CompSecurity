.class public Lcom/qihoo360/common/utils/IniProperties;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/IniProperties$a;,
        Lcom/qihoo360/common/utils/IniProperties$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/Properties;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Properties;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->a:Ljava/util/Properties;

    .line 30
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    .line 31
    return-void
.end method


# virtual methods
.method public dump(Ljava/io/PrintStream;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 222
    invoke-virtual {p0}, Lcom/qihoo360/common/utils/IniProperties;->properties()Ljava/util/Iterator;

    move-result-object v1

    .line 223
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 230
    invoke-virtual {p0}, Lcom/qihoo360/common/utils/IniProperties;->sections()Ljava/util/Iterator;

    move-result-object v2

    .line 231
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 241
    return-void

    .line 224
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 226
    const-string/jumbo v2, "%s=%s\n"

    new-array v3, v8, [Ljava/lang/Object;

    aput-object v0, v3, v6

    invoke-virtual {p0, v0}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v7

    invoke-virtual {p1, v2, v3}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    goto :goto_0

    .line 232
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 233
    const-string/jumbo v1, "\n[%s]\n"

    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v6

    invoke-virtual {p1, v1, v3}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 234
    invoke-virtual {p0, v0}, Lcom/qihoo360/common/utils/IniProperties;->properties(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v3

    .line 235
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 238
    const-string/jumbo v4, "%s=%s\n"

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v1, v5, v6

    invoke-virtual {p0, v0, v1}, Lcom/qihoo360/common/utils/IniProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v7

    invoke-virtual {p1, v4, v5}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    goto :goto_1
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->a:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Properties;

    .line 181
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public load(Ljava/io/InputStream;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 38
    new-instance v7, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    const-string/jumbo v1, "utf-8"

    invoke-direct {v0, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v7, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 40
    const/16 v8, 0x1000

    .line 41
    new-array v9, v8, [C

    .line 42
    const/4 v0, 0x0

    invoke-virtual {v7, v9, v0, v8}, Ljava/io/BufferedReader;->read([CII)I

    move-result v5

    .line 44
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    :goto_0
    if-gez v5, :cond_1

    .line 138
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 140
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    if-eqz v1, :cond_0

    .line 142
    if-nez v2, :cond_d

    .line 143
    invoke-virtual {p0, v1, v0}, Lcom/qihoo360/common/utils/IniProperties;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_0
    :goto_1
    return-void

    .line 50
    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-lt v6, v5, :cond_2

    .line 135
    const/4 v5, 0x0

    invoke-virtual {v7, v9, v5, v8}, Ljava/io/BufferedReader;->read([CII)I

    move-result v5

    goto :goto_0

    .line 51
    :cond_2
    aget-char v10, v9, v6

    .line 53
    sget-object v11, Lcom/qihoo360/common/utils/IniProperties$b;->d:Lcom/qihoo360/common/utils/IniProperties$b;

    if-ne v4, v11, :cond_4

    .line 54
    const/16 v11, 0xd

    if-eq v10, v11, :cond_3

    const/16 v11, 0xa

    if-ne v10, v11, :cond_5

    .line 55
    :cond_3
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    .line 61
    :cond_4
    sget-object v11, Lcom/qihoo360/common/utils/IniProperties$b;->b:Lcom/qihoo360/common/utils/IniProperties$b;

    if-ne v4, v11, :cond_7

    .line 62
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    const/16 v4, 0xd

    if-ne v10, v4, :cond_6

    .line 65
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->c:Lcom/qihoo360/common/utils/IniProperties$b;

    .line 50
    :cond_5
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 67
    :cond_6
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    goto :goto_3

    .line 72
    :cond_7
    sparse-switch v10, :sswitch_data_0

    .line 132
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 74
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    const/4 v3, 0x1

    .line 76
    goto :goto_3

    .line 79
    :sswitch_1
    if-eqz v3, :cond_8

    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    iget-object v3, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    new-instance v10, Ljava/util/Properties;

    invoke-direct {v10}, Ljava/util/Properties;-><init>()V

    invoke-interface {v3, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const/4 v3, 0x0

    .line 84
    goto :goto_3

    .line 85
    :cond_8
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 90
    :sswitch_2
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->b:Lcom/qihoo360/common/utils/IniProperties$b;

    goto :goto_3

    .line 95
    :sswitch_3
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->d:Lcom/qihoo360/common/utils/IniProperties$b;

    goto :goto_3

    .line 100
    :sswitch_4
    if-nez v1, :cond_9

    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_3

    .line 104
    :cond_9
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 110
    :sswitch_5
    sget-object v11, Lcom/qihoo360/common/utils/IniProperties$b;->c:Lcom/qihoo360/common/utils/IniProperties$b;

    if-ne v4, v11, :cond_a

    const/16 v11, 0xa

    if-ne v10, v11, :cond_a

    .line 111
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    sget-object v4, Lcom/qihoo360/common/utils/IniProperties$b;->a:Lcom/qihoo360/common/utils/IniProperties$b;

    goto :goto_3

    .line 114
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-lez v10, :cond_b

    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    if-eqz v1, :cond_b

    .line 119
    if-nez v2, :cond_c

    .line 120
    invoke-virtual {p0, v1, v10}, Lcom/qihoo360/common/utils/IniProperties;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :cond_b
    :goto_4
    const/4 v1, 0x0

    .line 129
    goto :goto_3

    .line 122
    :cond_c
    invoke-virtual {p0, v2, v1, v10}, Lcom/qihoo360/common/utils/IniProperties;->setProperty(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 145
    :cond_d
    invoke-virtual {p0, v2, v1, v0}, Lcom/qihoo360/common/utils/IniProperties;->setProperty(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 72
    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_5
        0xd -> :sswitch_5
        0x23 -> :sswitch_3
        0x3a -> :sswitch_4
        0x3b -> :sswitch_3
        0x3d -> :sswitch_4
        0x5b -> :sswitch_0
        0x5c -> :sswitch_2
        0x5d -> :sswitch_1
    .end sparse-switch
.end method

.method public properties()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 172
    new-instance v0, Lcom/qihoo360/common/utils/IniProperties$a;

    iget-object v1, p0, Lcom/qihoo360/common/utils/IniProperties;->a:Ljava/util/Properties;

    invoke-virtual {v1}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo360/common/utils/IniProperties$a;-><init>(Ljava/util/Enumeration;)V

    return-object v0
.end method

.method public properties(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 203
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Properties;

    .line 204
    if-nez v0, :cond_0

    .line 205
    const/4 v0, 0x0

    .line 207
    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/qihoo360/common/utils/IniProperties$a;

    invoke-virtual {v0}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/qihoo360/common/utils/IniProperties$a;-><init>(Ljava/util/Enumeration;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public sections()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 214
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->a:Ljava/util/Properties;

    invoke-virtual {v0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Properties;

    .line 190
    if-nez v0, :cond_0

    .line 191
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 192
    iget-object v1, p0, Lcom/qihoo360/common/utils/IniProperties;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    :cond_0
    invoke-virtual {v0, p2, p3}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 195
    return-void
.end method
