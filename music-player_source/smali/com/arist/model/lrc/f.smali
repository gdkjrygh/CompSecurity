.class public final Lcom/arist/model/lrc/f;
.super Ljava/lang/Object;


# instance fields
.field public a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/List;

.field private g:Ljava/util/regex/Pattern;

.field private h:Ljava/util/regex/Pattern;

.field private i:Ljava/util/regex/Pattern;

.field private j:Ljava/util/regex/Pattern;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/arist/model/lrc/f;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/model/lrc/f;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/model/lrc/f;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/model/lrc/f;->e:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    const-string v0, "\\[ti:(.+?)\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->g:Ljava/util/regex/Pattern;

    const-string v0, "\\[ar:(.+?)\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->h:Ljava/util/regex/Pattern;

    const-string v0, "\\[al:(.+?)\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->i:Ljava/util/regex/Pattern;

    const-string v0, "\\[by:(.+?)\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->j:Ljava/util/regex/Pattern;

    const-string v0, "GBK"

    iput-object v0, p0, Lcom/arist/model/lrc/f;->k:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/lrc/f;->a:Z

    return-void
.end method

.method private static a(Ljava/io/BufferedReader;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x0

    const-string v0, "\\]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    move v0, v1

    move v2, v1

    :goto_0
    array-length v4, v3

    if-lt v0, v4, :cond_0

    :goto_1
    if-lt v1, v2, :cond_2

    return-void

    :cond_0
    aget-object v4, v3, v0

    const-string v5, "\\["

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    add-int/lit8 v5, v5, -0x1

    aget-object v4, v4, v5

    aput-object v4, v3, v0

    aget-object v4, v3, v0

    invoke-static {v4}, Lcom/arist/model/lrc/f;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/arist/model/lrc/h;

    invoke-direct {v0}, Lcom/arist/model/lrc/h;-><init>()V

    aget-object v4, v3, v1

    invoke-virtual {v0, v4}, Lcom/arist/model/lrc/h;->a(Ljava/lang/String;)V

    array-length v4, v3

    if-ge v2, v4, :cond_3

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    aget-object v4, v3, v4

    invoke-virtual {v0, v4}, Lcom/arist/model/lrc/h;->b(Ljava/lang/String;)V

    :cond_3
    iget-object v4, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const-string v1, ":|\\."

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x3

    array-length v3, v2

    if-eq v1, v3, :cond_0

    :goto_0
    return v0

    :cond_0
    move v1, v0

    :goto_1
    :try_start_0
    array-length v3, v2

    if-lt v1, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    aget-object v3, v2, v1

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final a(J)I
    .locals 9

    const/4 v1, -0x1

    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    :cond_0
    return v2

    :cond_1
    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/lrc/h;

    invoke-virtual {v0}, Lcom/arist/model/lrc/h;->a()D

    move-result-wide v4

    long-to-double v6, p1

    cmpl-double v0, v4, v6

    if-gtz v0, :cond_0

    add-int/lit8 v0, v1, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/lrc/h;

    invoke-virtual {v0}, Lcom/arist/model/lrc/h;->b()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, ""

    goto :goto_0
.end method

.method public final a(Landroid/graphics/Paint;I)V
    .locals 9

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iput-boolean v4, p0, Lcom/arist/model/lrc/f;->a:Z

    return-void

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/lrc/h;

    invoke-virtual {v0}, Lcom/arist/model/lrc/h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    int-to-float v2, p2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    const/4 v2, 0x0

    const-string v1, ""

    move v3, v4

    :goto_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lt v3, v7, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/model/lrc/h;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v6, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v7

    int-to-float v8, p2

    cmpl-float v7, v7, v8

    if-lez v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v1, v3, -0x1

    invoke-virtual {v6, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v3, -0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    iput-object v2, p0, Lcom/arist/model/lrc/f;->b:Ljava/lang/String;

    iput-object v2, p0, Lcom/arist/model/lrc/f;->c:Ljava/lang/String;

    iput-object v2, p0, Lcom/arist/model/lrc/f;->d:Ljava/lang/String;

    iput-object v2, p0, Lcom/arist/model/lrc/f;->e:Ljava/lang/String;

    iput-boolean v4, p0, Lcom/arist/model/lrc/f;->a:Z

    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Lcom/arist/model/lrc/f;->k:Ljava/lang/String;

    invoke-direct {v0, v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_1
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/arist/model/lrc/f;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {p1}, Lcom/arist/c/c;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v1}, Lcom/arist/model/lrc/f;->a(Ljava/io/BufferedReader;)V

    goto :goto_0

    :cond_2
    :try_start_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/f;->b:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/arist/model/lrc/f;->g:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->b:Ljava/lang/String;

    move v0, v3

    :goto_2
    if-nez v0, :cond_1

    :cond_3
    iget-object v0, p0, Lcom/arist/model/lrc/f;->c:Ljava/lang/String;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/arist/model/lrc/f;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->c:Ljava/lang/String;

    move v0, v3

    :goto_3
    if-nez v0, :cond_1

    :cond_4
    iget-object v0, p0, Lcom/arist/model/lrc/f;->d:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/arist/model/lrc/f;->i:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->d:Ljava/lang/String;

    move v0, v3

    :goto_4
    if-nez v0, :cond_1

    :cond_5
    iget-object v0, p0, Lcom/arist/model/lrc/f;->e:Ljava/lang/String;

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/arist/model/lrc/f;->j:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_a

    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/lrc/f;->e:Ljava/lang/String;

    move v0, v3

    :goto_5
    if-nez v0, :cond_1

    :cond_6
    invoke-direct {p0, v2}, Lcom/arist/model/lrc/f;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_1

    :catch_0
    move-exception v0

    :goto_6
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v1}, Lcom/arist/model/lrc/f;->a(Ljava/io/BufferedReader;)V

    goto/16 :goto_0

    :cond_7
    move v0, v4

    goto :goto_2

    :cond_8
    move v0, v4

    goto :goto_3

    :cond_9
    move v0, v4

    goto :goto_4

    :cond_a
    move v0, v4

    goto :goto_5

    :cond_b
    :try_start_4
    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    new-instance v2, Lcom/arist/model/lrc/g;

    invoke-direct {v2, p0}, Lcom/arist/model/lrc/g;-><init>(Lcom/arist/model/lrc/f;)V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-static {v1}, Lcom/arist/model/lrc/f;->a(Ljava/io/BufferedReader;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_7
    invoke-static {v1}, Lcom/arist/model/lrc/f;->a(Ljava/io/BufferedReader;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    move-object v1, v2

    goto :goto_6
.end method

.method public final a()Z
    .locals 1

    invoke-virtual {p0}, Lcom/arist/model/lrc/f;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
