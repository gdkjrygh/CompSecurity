.class public final Lcom/mobvista/sdk/m/a/d/a/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/mobvista/sdk/m/a/d/a/d;


# instance fields
.field private b:Lcom/mobvista/sdk/m/a/d/a/l;

.field private c:Ljava/util/LinkedHashMap;

.field private d:Landroid/os/Handler;


# direct methods
.method protected constructor <init>()V
    .locals 2

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->c:Ljava/util/LinkedHashMap;

    .line 44
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/e;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/a/d/a/e;-><init>(Lcom/mobvista/sdk/m/a/d/a/d;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->d:Landroid/os/Handler;

    .line 104
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    long-to-int v0, v0

    .line 105
    div-int/lit8 v0, v0, 0xa

    .line 107
    new-instance v1, Lcom/mobvista/sdk/m/a/d/a/f;

    invoke-direct {v1, p0, v0}, Lcom/mobvista/sdk/m/a/d/a/f;-><init>(Lcom/mobvista/sdk/m/a/d/a/d;I)V

    iput-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/d;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    .line 116
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/a/d/a/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static a()Lcom/mobvista/sdk/m/a/d/a/d;
    .locals 1

    .prologue
    .line 119
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/d;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/a/d/a/d;-><init>()V

    sput-object v0, Lcom/mobvista/sdk/m/a/d/a/d;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    .line 122
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/d;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/mobvista/sdk/m/a/d/a/i;
    .locals 2

    .prologue
    .line 242
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/g;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/a/d/a/g;-><init>(Lcom/mobvista/sdk/m/a/d/a/d;)V

    .line 267
    new-instance v1, Lcom/mobvista/sdk/m/a/d/a/i;

    invoke-direct {v1, p1, p2, p3}, Lcom/mobvista/sdk/m/a/d/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    invoke-virtual {v1, p4}, Lcom/mobvista/sdk/m/a/d/a/i;->a(Z)V

    .line 270
    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/a/d/a/i;->a(Lcom/mobvista/sdk/m/a/d/a/j;)V

    .line 272
    return-object v1
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/a/d/a/d;)Ljava/util/LinkedHashMap;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->c:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/mobvista/sdk/m/a/d/a/h;)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 164
    invoke-static {p1}, Lcom/mobvista/sdk/m/a/f/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/f/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/mobvista/sdk/m/a/f/j;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    :cond_0
    :goto_0
    return-void

    .line 180
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 181
    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 182
    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p5, v0, p1}, Lcom/mobvista/sdk/m/a/d/a/h;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    goto :goto_0

    .line 185
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    invoke-static {p3}, Lcom/mobvista/sdk/m/a/f/a;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 187
    if-eqz v0, :cond_3

    .line 188
    const-string/jumbo v1, "ImageLoader"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "url image ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "] is downloaded, save by file ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-virtual {p0, p2, v0}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 190
    invoke-interface {p5, v0, p1}, Lcom/mobvista/sdk/m/a/d/a/h;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    goto :goto_0

    .line 192
    :cond_3
    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/mobvista/sdk/m/a/d/a/h;)V

    goto :goto_0

    :cond_4
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, v5

    move-object v7, p5

    .line 197
    invoke-direct/range {v1 .. v7}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/mobvista/sdk/m/a/d/a/h;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/mobvista/sdk/m/a/d/a/h;)V
    .locals 3

    .prologue
    .line 214
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 216
    invoke-virtual {v0, p6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 217
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/d;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p2, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/mobvista/sdk/m/a/d/a/i;

    move-result-object v0

    .line 219
    invoke-static {}, Lcom/mobvista/sdk/m/a/e/a;->a()Lcom/mobvista/sdk/m/a/e/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/mobvista/sdk/m/a/e/a;->d(Lcom/mobvista/sdk/m/a/e/c;)I

    .line 227
    :goto_0
    return-void

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    .line 222
    if-eqz v0, :cond_1

    invoke-virtual {v0, p6}, Ljava/util/LinkedList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 223
    invoke-virtual {v0, p6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 225
    :cond_1
    const-string/jumbo v0, "ImageLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "loading:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/a/d/a/d;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->d:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 88
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/d;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    invoke-virtual {v0, p1, p2}, Lcom/mobvista/sdk/m/a/d/a/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V
    .locals 6

    .prologue
    .line 133
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 135
    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/mobvista/sdk/m/a/d/a/h;)V

    .line 136
    return-void
.end method
