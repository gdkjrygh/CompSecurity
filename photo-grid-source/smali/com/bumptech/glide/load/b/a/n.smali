.class public final Lcom/bumptech/glide/load/b/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/a/l;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# static fields
.field private static final a:[Landroid/graphics/Bitmap$Config;

.field private static final b:[Landroid/graphics/Bitmap$Config;

.field private static final c:[Landroid/graphics/Bitmap$Config;

.field private static final d:[Landroid/graphics/Bitmap$Config;


# instance fields
.field private final e:Lcom/bumptech/glide/load/b/a/q;

.field private final f:Lcom/bumptech/glide/load/b/a/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/a/g",
            "<",
            "Lcom/bumptech/glide/load/b/a/p;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/graphics/Bitmap$Config;",
            "Ljava/util/NavigableMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 28
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/Bitmap$Config;

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    aput-object v1, v0, v2

    const/4 v1, 0x0

    aput-object v1, v0, v3

    sput-object v0, Lcom/bumptech/glide/load/b/a/n;->a:[Landroid/graphics/Bitmap$Config;

    .line 35
    new-array v0, v3, [Landroid/graphics/Bitmap$Config;

    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    aput-object v1, v0, v2

    sput-object v0, Lcom/bumptech/glide/load/b/a/n;->b:[Landroid/graphics/Bitmap$Config;

    .line 38
    new-array v0, v3, [Landroid/graphics/Bitmap$Config;

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    aput-object v1, v0, v2

    sput-object v0, Lcom/bumptech/glide/load/b/a/n;->c:[Landroid/graphics/Bitmap$Config;

    .line 41
    new-array v0, v3, [Landroid/graphics/Bitmap$Config;

    sget-object v1, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    aput-object v1, v0, v2

    sput-object v0, Lcom/bumptech/glide/load/b/a/n;->d:[Landroid/graphics/Bitmap$Config;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/bumptech/glide/load/b/a/q;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/a/q;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->e:Lcom/bumptech/glide/load/b/a/q;

    .line 46
    new-instance v0, Lcom/bumptech/glide/load/b/a/g;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/a/g;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->f:Lcom/bumptech/glide/load/b/a/g;

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->g:Ljava/util/Map;

    .line 172
    return-void
.end method

.method static synthetic a(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    invoke-static {p0, p1}, Lcom/bumptech/glide/load/b/a/n;->b(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap$Config;",
            ")",
            "Ljava/util/NavigableMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 116
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/NavigableMap;

    .line 117
    if-nez v0, :cond_0

    .line 118
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 119
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->g:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    :cond_0
    return-object v0
.end method

.method private a(Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)V
    .locals 4

    .prologue
    .line 106
    invoke-direct {p0, p2}, Lcom/bumptech/glide/load/b/a/n;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    move-result-object v1

    .line 107
    invoke-interface {v1, p1}, Ljava/util/NavigableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 109
    invoke-interface {v1, p1}, Ljava/util/NavigableMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, v0}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private static b(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->f:Lcom/bumptech/glide/load/b/a/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/a/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 98
    if-eqz v0, :cond_0

    .line 99
    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(Landroid/graphics/Bitmap;)I

    move-result v1

    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/bumptech/glide/load/b/a/n;->a(Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)V

    .line 102
    :cond_0
    return-object v0
.end method

.method public final a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 64
    invoke-static {p1, p2, p3}, Lcom/bumptech/glide/i/h;->a(IILandroid/graphics/Bitmap$Config;)I

    move-result v4

    .line 65
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->e:Lcom/bumptech/glide/load/b/a/q;

    invoke-virtual {v0, v4, p3}, Lcom/bumptech/glide/load/b/a/q;->a(ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/b/a/p;

    move-result-object v2

    .line 1225
    sget-object v0, Lcom/bumptech/glide/load/b/a/o;->a:[I

    invoke-virtual {p3}, Landroid/graphics/Bitmap$Config;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1235
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/graphics/Bitmap$Config;

    aput-object p3, v0, v3

    move-object v1, v0

    .line 1080
    :goto_0
    array-length v5, v1

    :goto_1
    if-ge v3, v5, :cond_3

    aget-object v6, v1, v3

    .line 1081
    invoke-direct {p0, v6}, Lcom/bumptech/glide/load/b/a/n;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    move-result-object v0

    .line 1082
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 1083
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    mul-int/lit8 v8, v4, 0x8

    if-gt v7, v8, :cond_4

    .line 1084
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_0

    if-nez v6, :cond_2

    if-eqz p3, :cond_3

    .line 1086
    :cond_0
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->e:Lcom/bumptech/glide/load/b/a/q;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/load/b/a/q;->a(Lcom/bumptech/glide/load/b/a/m;)V

    .line 1087
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->e:Lcom/bumptech/glide/load/b/a/q;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0, v6}, Lcom/bumptech/glide/load/b/a/q;->a(ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/b/a/p;

    move-result-object v0

    .line 68
    :goto_2
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->f:Lcom/bumptech/glide/load/b/a/g;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/load/b/a/g;->a(Lcom/bumptech/glide/load/b/a/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 69
    if-eqz v0, :cond_1

    .line 71
    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(Landroid/graphics/Bitmap;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/bumptech/glide/load/b/a/n;->a(Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)V

    .line 72
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    :goto_3
    invoke-virtual {v0, p1, p2, v1}, Landroid/graphics/Bitmap;->reconfigure(IILandroid/graphics/Bitmap$Config;)V

    .line 75
    :cond_1
    return-object v0

    .line 1227
    :pswitch_0
    sget-object v0, Lcom/bumptech/glide/load/b/a/n;->a:[Landroid/graphics/Bitmap$Config;

    move-object v1, v0

    goto :goto_0

    .line 1229
    :pswitch_1
    sget-object v0, Lcom/bumptech/glide/load/b/a/n;->b:[Landroid/graphics/Bitmap$Config;

    move-object v1, v0

    goto :goto_0

    .line 1231
    :pswitch_2
    sget-object v0, Lcom/bumptech/glide/load/b/a/n;->c:[Landroid/graphics/Bitmap$Config;

    move-object v1, v0

    goto :goto_0

    .line 1233
    :pswitch_3
    sget-object v0, Lcom/bumptech/glide/load/b/a/n;->d:[Landroid/graphics/Bitmap$Config;

    move-object v1, v0

    goto :goto_0

    .line 1084
    :cond_2
    invoke-virtual {v6, p3}, Landroid/graphics/Bitmap$Config;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_3
    move-object v0, v2

    goto :goto_2

    .line 1080
    :cond_4
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 72
    :cond_5
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_3

    .line 1225
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 3

    .prologue
    .line 52
    invoke-static {p1}, Lcom/bumptech/glide/i/h;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    .line 53
    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->e:Lcom/bumptech/glide/load/b/a/q;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/bumptech/glide/load/b/a/q;->a(ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/b/a/p;

    move-result-object v1

    .line 55
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->f:Lcom/bumptech/glide/load/b/a/g;

    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/b/a/g;->a(Lcom/bumptech/glide/load/b/a/m;Ljava/lang/Object;)V

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/a/n;->a(Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;

    move-result-object v2

    .line 58
    invoke-static {v1}, Lcom/bumptech/glide/load/b/a/p;->a(Lcom/bumptech/glide/load/b/a/p;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/NavigableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 59
    invoke-static {v1}, Lcom/bumptech/glide/load/b/a/p;->a(Lcom/bumptech/glide/load/b/a/p;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v1, v0}, Ljava/util/NavigableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    return-void

    .line 59
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final b(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 132
    invoke-static {p1, p2, p3}, Lcom/bumptech/glide/i/h;->a(IILandroid/graphics/Bitmap$Config;)I

    move-result v0

    .line 133
    invoke-static {v0, p3}, Lcom/bumptech/glide/load/b/a/n;->b(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 126
    invoke-static {p1}, Lcom/bumptech/glide/i/h;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    .line 127
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/bumptech/glide/load/b/a/n;->b(ILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(Landroid/graphics/Bitmap;)I
    .locals 1

    .prologue
    .line 138
    invoke-static {p1}, Lcom/bumptech/glide/i/h;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SizeConfigStrategy{groupedMap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/n;->f:Lcom/bumptech/glide/load/b/a/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sortedSizes=("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 147
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 148
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x5b

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "], "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/n;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const-string v3, ""

    invoke-virtual {v1, v0, v2, v3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    :cond_1
    const-string v0, ")}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
