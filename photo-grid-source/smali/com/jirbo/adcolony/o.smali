.class Lcom/jirbo/adcolony/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jirbo/adcolony/ADCDownload$Listener;


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/o$a;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/jirbo/adcolony/o$a;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:Lcom/jirbo/adcolony/ab$b;

.field f:I

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field h:Z

.field i:Z

.field j:D


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 4

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/o;->d:I

    .line 15
    new-instance v0, Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-direct {v0, v2, v3}, Lcom/jirbo/adcolony/ab$b;-><init>(D)V

    iput-object v0, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/o;->g:Ljava/util/ArrayList;

    .line 27
    iput-object p1, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    .line 28
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .prologue
    .line 372
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 373
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 378
    :goto_0
    return-object v0

    .line 375
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 376
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, ".0"

    .line 378
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method a()V
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->b()V

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/o;->h:Z

    .line 34
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 212
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 260
    :cond_0
    :goto_0
    return-void

    .line 213
    :cond_1
    if-nez p2, :cond_2

    const-string p2, ""

    .line 215
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 216
    if-eqz v0, :cond_5

    .line 218
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/o$a;->h:D

    .line 219
    iget-object v1, v0, Lcom/jirbo/adcolony/o$a;->c:Ljava/lang/String;

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 221
    iget-boolean v1, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    if-nez v1, :cond_0

    .line 226
    iget-boolean v1, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    if-nez v1, :cond_0

    .line 242
    :cond_3
    :goto_1
    iget v1, v0, Lcom/jirbo/adcolony/o$a;->f:I

    if-nez v1, :cond_4

    .line 244
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->h()I

    move-result v1

    .line 245
    invoke-virtual {p0, p1, v1}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 246
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v4, v4, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    iget-object v4, v4, Lcom/jirbo/adcolony/ADCStorage;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 247
    iput v1, v0, Lcom/jirbo/adcolony/o$a;->f:I

    .line 248
    iput-object v2, v0, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    .line 251
    :cond_4
    iput-object p2, v0, Lcom/jirbo/adcolony/o$a;->c:Ljava/lang/String;

    .line 252
    iput-boolean v5, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    .line 253
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    .line 255
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Adding "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " to pending downloads."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 256
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    iput-boolean v5, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 258
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ab$b;->a(D)V

    .line 259
    sput-boolean v5, Lcom/jirbo/adcolony/a;->r:Z

    goto :goto_0

    .line 235
    :cond_5
    new-instance v0, Lcom/jirbo/adcolony/o$a;

    invoke-direct {v0}, Lcom/jirbo/adcolony/o$a;-><init>()V

    .line 236
    iput-object p1, v0, Lcom/jirbo/adcolony/o$a;->a:Ljava/lang/String;

    .line 237
    iget-object v1, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/o$a;->h:D

    .line 239
    iget-object v1, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 177
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 194
    :goto_0
    return v0

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 180
    if-nez v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$e;->a()V

    move v0, v1

    .line 183
    goto :goto_0

    .line 185
    :cond_2
    iget-boolean v2, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    if-eqz v2, :cond_4

    .line 187
    iget-boolean v2, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    if-eqz v2, :cond_3

    move v0, v1

    goto :goto_0

    .line 188
    :cond_3
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/o$a;->h:D

    .line 189
    const/4 v0, 0x1

    goto :goto_0

    .line 193
    :cond_4
    iget-boolean v0, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$e;->a()V

    :cond_5
    move v0, v1

    .line 194
    goto :goto_0
.end method

.method b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 200
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 201
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    const-string v0, "(file not found)"

    .line 206
    :goto_0
    return-object v0

    .line 203
    :cond_1
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/jirbo/adcolony/o$a;->h:D

    .line 204
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 205
    iget-object v1, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ab$b;->a(D)V

    .line 206
    iget-object v0, v0, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method b()V
    .locals 6

    .prologue
    .line 38
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Loading media info"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 39
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "media_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 43
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 44
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "No saved media info exists."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 51
    :goto_0
    const-string v1, "next_file_number"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/o;->d:I

    .line 52
    iget v1, p0, Lcom/jirbo/adcolony/o;->d:I

    if-gtz v1, :cond_0

    const/4 v1, 0x1

    iput v1, p0, Lcom/jirbo/adcolony/o;->d:I

    .line 54
    :cond_0
    const-string v1, "assets"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->c(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v1

    .line 55
    if-eqz v1, :cond_3

    .line 57
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 58
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 60
    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    .line 61
    new-instance v3, Lcom/jirbo/adcolony/o$a;

    invoke-direct {v3}, Lcom/jirbo/adcolony/o$a;-><init>()V

    .line 62
    const-string v4, "url"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/o$a;->a:Ljava/lang/String;

    .line 63
    const-string v4, "filepath"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    .line 64
    const-string v4, "last_modified"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/o$a;->c:Ljava/lang/String;

    .line 65
    const-string v4, "file_number"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v4

    iput v4, v3, Lcom/jirbo/adcolony/o$a;->f:I

    .line 66
    const-string v4, "size"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v4

    iput v4, v3, Lcom/jirbo/adcolony/o$a;->g:I

    .line 67
    const-string v4, "ready"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v3, Lcom/jirbo/adcolony/o$a;->e:Z

    .line 68
    const-string v4, "last_accessed"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v4

    iput-wide v4, v3, Lcom/jirbo/adcolony/o$a;->h:D

    .line 69
    iget v2, v3, Lcom/jirbo/adcolony/o$a;->f:I

    iget v4, p0, Lcom/jirbo/adcolony/o;->d:I

    if-le v2, v4, :cond_1

    iget v2, v3, Lcom/jirbo/adcolony/o$a;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/jirbo/adcolony/o;->d:I

    .line 70
    :cond_1
    iget-object v2, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 48
    :cond_2
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Loaded media info"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->c()V

    .line 75
    return-void
.end method

.method c()V
    .locals 12

    .prologue
    .line 79
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 81
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    iget-object v4, v0, Lcom/jirbo/adcolony/ADCStorage;->c:Ljava/lang/String;

    .line 82
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    .line 83
    if-nez v0, :cond_7

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    move-object v1, v0

    .line 85
    :goto_0
    array-length v2, v1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_0

    aget-object v5, v1, v0

    .line 87
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 88
    invoke-virtual {v3, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 91
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 94
    const-wide/16 v6, 0x0

    iput-wide v6, p0, Lcom/jirbo/adcolony/o;->j:D

    .line 95
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 96
    const/4 v0, 0x0

    move v2, v0

    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 98
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 99
    iget-boolean v7, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    if-nez v7, :cond_1

    .line 101
    iget-boolean v7, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    if-eqz v7, :cond_1

    .line 103
    iget-object v7, v0, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    .line 104
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 106
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v8

    iget v10, v0, Lcom/jirbo/adcolony/o$a;->g:I

    int-to-long v10, v10

    cmp-long v8, v8, v10

    if-nez v8, :cond_1

    .line 108
    iget-wide v8, p0, Lcom/jirbo/adcolony/o;->j:D

    iget v10, v0, Lcom/jirbo/adcolony/o$a;->g:I

    int-to-double v10, v10

    add-double/2addr v8, v10

    iput-wide v8, p0, Lcom/jirbo/adcolony/o;->j:D

    .line 109
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {v5, v7, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 116
    :cond_2
    iput-object v6, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    .line 120
    array-length v2, v1

    const/4 v0, 0x0

    :goto_3
    if-ge v0, v2, :cond_4

    aget-object v3, v1, v0

    .line 122
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 123
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 125
    sget-object v6, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v7, "Deleting unused media "

    invoke-virtual {v6, v7}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 126
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 120
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 131
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 132
    const/4 v0, 0x0

    move v1, v0

    :goto_4
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 134
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 135
    iget-object v2, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    iget-object v3, v0, Lcom/jirbo/adcolony/o$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 138
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-wide v0, v0, Lcom/jirbo/adcolony/n$e;->g:D

    .line 139
    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_6

    .line 141
    sget-object v2, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v3, "Media pool at "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget-wide v4, p0, Lcom/jirbo/adcolony/o;->j:D

    const-wide/high16 v6, 0x4130000000000000L    # 1048576.0

    div-double/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Lcom/jirbo/adcolony/l;->a(D)Lcom/jirbo/adcolony/l;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    const-wide/high16 v4, 0x4130000000000000L    # 1048576.0

    div-double/2addr v0, v4

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/l;->a(D)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " MB"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 143
    :cond_6
    return-void

    :cond_7
    move-object v1, v0

    goto/16 :goto_0
.end method

.method d()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 147
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Saving media info"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 149
    new-instance v3, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v3}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    move v1, v2

    .line 150
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 153
    iget-boolean v4, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    if-eqz v4, :cond_0

    iget-boolean v4, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    if-nez v4, :cond_0

    .line 155
    new-instance v4, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v4}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 156
    const-string v5, "url"

    iget-object v6, v0, Lcom/jirbo/adcolony/o$a;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v5, "filepath"

    iget-object v6, v0, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v5, "last_modified"

    iget-object v6, v0, Lcom/jirbo/adcolony/o$a;->c:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v5, "file_number"

    iget v6, v0, Lcom/jirbo/adcolony/o$a;->f:I

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 160
    const-string v5, "size"

    iget v6, v0, Lcom/jirbo/adcolony/o$a;->g:I

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 161
    const-string v5, "ready"

    iget-boolean v6, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 162
    const-string v5, "last_accessed"

    iget-wide v6, v0, Lcom/jirbo/adcolony/o$a;->h:D

    invoke-virtual {v4, v5, v6, v7}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 163
    invoke-virtual {v3, v4}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 150
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 167
    :cond_1
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 168
    const-string v1, "next_file_number"

    iget v4, p0, Lcom/jirbo/adcolony/o;->d:I

    invoke-virtual {v0, v1, v4}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 169
    const-string v1, "assets"

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$i;)V

    .line 171
    new-instance v1, Lcom/jirbo/adcolony/f;

    const-string v3, "media_info.txt"

    invoke-direct {v1, v3}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 172
    iput-boolean v2, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 173
    return-void
.end method

.method e()V
    .locals 1

    .prologue
    .line 264
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->f()V

    .line 266
    iget-boolean v0, p0, Lcom/jirbo/adcolony/o;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ab$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->g()V

    .line 269
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->d()V

    .line 271
    :cond_0
    return-void
.end method

.method f()V
    .locals 5

    .prologue
    .line 276
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->j:Ljava/lang/String;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/jirbo/adcolony/q;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 278
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Skipping asset download due to CACHE_FILTER_WIFI"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 305
    :cond_0
    :goto_0
    return-void

    .line 281
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->j:Ljava/lang/String;

    const-string v1, "cell"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/jirbo/adcolony/q;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 283
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Skipping asset download due to CACHE_FILTER_CELL."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    .line 287
    :cond_2
    :goto_1
    iget v0, p0, Lcom/jirbo/adcolony/o;->f:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 291
    iget-object v1, p0, Lcom/jirbo/adcolony/o;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jirbo/adcolony/o$a;

    .line 292
    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 294
    :cond_3
    sget-object v2, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v3, "[ADC ERROR] - NULL URL"

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 295
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2}, Ljava/lang/RuntimeException;-><init>()V

    invoke-virtual {v2}, Ljava/lang/RuntimeException;->printStackTrace()V

    .line 298
    :cond_4
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 300
    const/4 v2, 0x1

    sput-boolean v2, Lcom/jirbo/adcolony/a;->r:Z

    .line 301
    iget v2, p0, Lcom/jirbo/adcolony/o;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/jirbo/adcolony/o;->f:I

    .line 302
    new-instance v2, Lcom/jirbo/adcolony/ADCDownload;

    iget-object v3, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v4, v1, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    invoke-direct {v2, v3, v0, p0, v4}, Lcom/jirbo/adcolony/ADCDownload;-><init>(Lcom/jirbo/adcolony/d;Ljava/lang/String;Lcom/jirbo/adcolony/ADCDownload$Listener;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/ADCDownload;->a(Ljava/lang/Object;)Lcom/jirbo/adcolony/ADCDownload;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCDownload;->b()V

    goto :goto_1
.end method

.method g()V
    .locals 14

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const-wide/high16 v12, 0x4130000000000000L    # 1048576.0

    .line 329
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-wide v6, v0, Lcom/jirbo/adcolony/n$e;->g:D

    .line 330
    const-wide/16 v0, 0x0

    cmpl-double v0, v6, v0

    if-nez v0, :cond_2

    .line 361
    :cond_0
    :goto_0
    return-void

    .line 350
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "Deleting "

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-object v2, v1, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 351
    iput-boolean v3, v1, Lcom/jirbo/adcolony/o$a;->e:Z

    .line 352
    new-instance v0, Ljava/io/File;

    iget-object v2, v1, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 353
    iput-object v4, v1, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    .line 354
    iget-wide v8, p0, Lcom/jirbo/adcolony/o;->j:D

    iget v0, v1, Lcom/jirbo/adcolony/o$a;->g:I

    int-to-double v0, v0

    sub-double v0, v8, v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/o;->j:D

    .line 356
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "Media pool now at "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-wide v8, p0, Lcom/jirbo/adcolony/o;->j:D

    div-double/2addr v8, v12

    invoke-virtual {v0, v8, v9}, Lcom/jirbo/adcolony/l;->a(D)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    div-double v8, v6, v12

    invoke-virtual {v0, v8, v9}, Lcom/jirbo/adcolony/l;->a(D)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " MB"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 358
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 359
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    invoke-virtual {v0, v8, v9}, Lcom/jirbo/adcolony/ab$b;->a(D)V

    .line 332
    :cond_2
    iget-wide v0, p0, Lcom/jirbo/adcolony/o;->j:D

    iget-object v2, p0, Lcom/jirbo/adcolony/o;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-wide v8, v2, Lcom/jirbo/adcolony/n$e;->g:D

    cmpl-double v0, v0, v8

    if-lez v0, :cond_0

    move v2, v3

    move-object v1, v4

    .line 335
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 337
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 338
    iget-boolean v5, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    if-eqz v5, :cond_5

    .line 340
    if-eqz v1, :cond_3

    iget-wide v8, v0, Lcom/jirbo/adcolony/o$a;->h:D

    iget-wide v10, v1, Lcom/jirbo/adcolony/o$a;->h:D

    cmpg-double v5, v8, v10

    if-gez v5, :cond_5

    .line 335
    :cond_3
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_1

    .line 347
    :cond_4
    if-eqz v1, :cond_0

    .line 348
    iget-object v0, v1, Lcom/jirbo/adcolony/o$a;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_5
    move-object v0, v1

    goto :goto_2
.end method

.method h()I
    .locals 4

    .prologue
    .line 365
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 366
    iget-object v0, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/ab$b;->a(D)V

    .line 367
    iget v0, p0, Lcom/jirbo/adcolony/o;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/jirbo/adcolony/o;->d:I

    return v0
.end method

.method public on_download_finished(Lcom/jirbo/adcolony/ADCDownload;)V
    .locals 6

    .prologue
    .line 309
    iget-object v0, p1, Lcom/jirbo/adcolony/ADCDownload;->e:Ljava/lang/Object;

    check-cast v0, Lcom/jirbo/adcolony/o$a;

    .line 311
    iget v1, p0, Lcom/jirbo/adcolony/o;->f:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/jirbo/adcolony/o;->f:I

    .line 312
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/o;->i:Z

    .line 313
    iget-object v1, p0, Lcom/jirbo/adcolony/o;->e:Lcom/jirbo/adcolony/ab$b;

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ab$b;->a(D)V

    .line 314
    iget-boolean v1, p1, Lcom/jirbo/adcolony/ADCDownload;->i:Z

    iput-boolean v1, v0, Lcom/jirbo/adcolony/o$a;->e:Z

    .line 315
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/jirbo/adcolony/o$a;->d:Z

    .line 316
    iget-boolean v1, p1, Lcom/jirbo/adcolony/ADCDownload;->i:Z

    if-eqz v1, :cond_0

    .line 318
    iget v1, p1, Lcom/jirbo/adcolony/ADCDownload;->m:I

    iput v1, v0, Lcom/jirbo/adcolony/o$a;->g:I

    .line 319
    iget-wide v2, p0, Lcom/jirbo/adcolony/o;->j:D

    iget v1, v0, Lcom/jirbo/adcolony/o$a;->g:I

    int-to-double v4, v1

    add-double/2addr v2, v4

    iput-wide v2, p0, Lcom/jirbo/adcolony/o;->j:D

    .line 320
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Downloaded "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    iget-object v0, v0, Lcom/jirbo/adcolony/o$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 323
    :cond_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 324
    invoke-virtual {p0}, Lcom/jirbo/adcolony/o;->f()V

    .line 325
    return-void
.end method
