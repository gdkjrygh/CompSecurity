.class final Lcom/kik/cards/web/usermedia/PhotoPlugin$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/usermedia/PhotoPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Ljava/io/File;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Landroid/content/Context;

.field e:Lcom/kik/cards/web/plugin/a;

.field final synthetic f:Lcom/kik/cards/web/usermedia/PhotoPlugin;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Landroid/content/Context;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->f:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    iput-object p4, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    .line 156
    iput-object p5, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->c:Ljava/lang/String;

    .line 157
    iput-object p3, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->e:Lcom/kik/cards/web/plugin/a;

    .line 158
    iput-object p2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->d:Landroid/content/Context;

    .line 159
    return-void
.end method

.method private a()Lorg/json/JSONArray;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 191
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v3, v1

    .line 195
    :goto_0
    if-nez v3, :cond_3

    .line 196
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 191
    :cond_1
    new-instance v0, Ljava/io/File;

    const-string v3, "Kik"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_2
    move-object v3, v0

    goto :goto_0

    .line 199
    :cond_3
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 200
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 201
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    if-nez v0, :cond_6

    move-object v0, v1

    :goto_1
    invoke-static {v0}, Lcom/kik/m/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 203
    if-eqz v0, :cond_a

    .line 204
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 207
    :goto_2
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    .line 208
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 211
    iget-object v2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    invoke-static {v2}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2}, Lcom/kik/m/e;->c([B)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 214
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 240
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    invoke-static {v0, v2}, Lkik/android/widget/cr;->a(Landroid/content/Context;Ljava/io/File;)V

    .line 242
    :cond_5
    return-object v1

    .line 201
    :cond_6
    const-string v4, "^data:(.*?)base64,(.*)"

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-eqz v4, :cond_b

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 218
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 223
    :cond_7
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 224
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    .line 225
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    const/16 v4, 0x2e

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_8

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v4

    const/4 v6, 0x4

    if-gt v5, v6, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 227
    :goto_4
    iget-object v4, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->c:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 228
    if-eqz v4, :cond_9

    .line 229
    invoke-static {v4, v3, v2, v0}, Lcom/kik/m/k;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    .line 230
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a:Ljava/io/File;

    if-nez v0, :cond_4

    .line 231
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    :cond_8
    move-object v0, v1

    .line 225
    goto :goto_4

    .line 235
    :cond_9
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    :cond_a
    move-object v0, v2

    goto/16 :goto_2

    :cond_b
    move-object v0, v1

    goto/16 :goto_1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-direct {p0}, Lcom/kik/cards/web/usermedia/PhotoPlugin$a;->a()Lorg/json/JSONArray;

    move-result-object v0

    return-object v0
.end method
