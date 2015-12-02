.class public Lcom/facebook/common/u/c;
.super Ljava/lang/Object;
.source "UriTemplateMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/u/c",
            "<TT;>.com/facebook/common/u/f;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 275
    const-string v0, "\\{([#]?)([^ }]+)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/u/c;->b:Ljava/util/regex/Pattern;

    .line 281
    const-string v0, "\\{([#!]?)([^ }]+)(?: ([^}]+))?\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/u/c;->c:Ljava/util/regex/Pattern;

    .line 288
    const-string v0, "&?([^=]+)=([^&]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/u/c;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/u/c;->a:Ljava/util/List;

    .line 384
    return-void
.end method

.method static synthetic a()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Lcom/facebook/common/u/c;->b:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method static synthetic b()Ljava/util/regex/Pattern;
    .locals 1

    .prologue
    .line 96
    sget-object v0, Lcom/facebook/common/u/c;->c:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method static synthetic b(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    invoke-static {p0}, Lcom/facebook/common/u/c;->e(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Ljava/lang/String;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 96
    invoke-static {p0}, Lcom/facebook/common/u/c;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 333
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 335
    sget-object v1, Lcom/facebook/common/u/c;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 337
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 338
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 339
    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 340
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 343
    :cond_0
    return-object v0
.end method

.method private static e(Ljava/lang/String;)[Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 351
    move v0, v1

    move v2, v1

    .line 352
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 353
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    sparse-switch v4, :sswitch_data_0

    .line 352
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 356
    goto :goto_1

    :sswitch_1
    move v2, v1

    .line 360
    goto :goto_1

    .line 363
    :sswitch_2
    if-nez v2, :cond_0

    .line 364
    new-array v2, v5, [Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    move-object v0, v2

    .line 373
    :goto_2
    return-object v0

    :cond_1
    new-array v0, v5, [Ljava/lang/String;

    aput-object p0, v0, v1

    const-string v1, ""

    aput-object v1, v0, v3

    goto :goto_2

    .line 353
    :sswitch_data_0
    .sparse-switch
        0x3f -> :sswitch_2
        0x7b -> :sswitch_0
        0x7d -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/common/u/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/common/u/i",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 313
    if-nez p1, :cond_0

    .line 314
    new-instance v0, Lcom/facebook/common/u/d;

    const-string v1, "Key may not be null"

    invoke-direct {v0, v1}, Lcom/facebook/common/u/d;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/u/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/u/f;

    .line 317
    invoke-virtual {v0, p1}, Lcom/facebook/common/u/f;->a(Ljava/lang/String;)Lcom/facebook/common/u/i;

    move-result-object v0

    .line 318
    if-eqz v0, :cond_1

    .line 322
    :goto_0
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 299
    if-nez p1, :cond_0

    .line 300
    const-string v0, "Key template may not be null"

    .line 301
    new-instance v1, Lcom/facebook/common/u/e;

    invoke-direct {v1, v0}, Lcom/facebook/common/u/e;-><init>(Ljava/lang/String;)V

    throw v1

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/facebook/common/u/c;->a:Ljava/util/List;

    new-instance v1, Lcom/facebook/common/u/f;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/common/u/f;-><init>(Lcom/facebook/common/u/c;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 304
    return-void
.end method
